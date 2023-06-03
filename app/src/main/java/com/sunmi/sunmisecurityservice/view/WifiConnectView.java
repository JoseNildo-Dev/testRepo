package com.sunmi.sunmisecurityservice.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.wifi.WifiConfiguration;
import android.os.Handler;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.sunmi.sunmisecurityservice.app.Constant;
import com.sunmi.sunmisecurityservice.util.LogUtil;
import com.sunmi.sunmisecurityservice.util.NetWorkCenterUtils;
import com.sunmi.sunmisecurityservice.util.SimCardUtils;
import com.sunmi.sunmisecurityservice.util.ThreadPoolManager;
import com.sunmi.sunmisecurityservice.wifi.PortalWifiTask;
import com.sunmi.sunmisecurityservice.wifi.WifiAdmin;
import com.sunmi.sunmisecurityservice.wifi.WifiSearcher;
import com.sunmi.sunmisecurityservice.wifi.adapter.WifiListAdapter;
import com.sunmi.sunmisecurityservice.wifi.bean.APNInfo;
import com.sunmi.sunmisecurityservice.wifi.bean.ScanResultBean;
import com.sunmi.sunmisecurityservice.wifi.bean.WifiElement;
import com.sunmi.sunmisecurityservice.wifi.dialog.APNManager;
import com.sunmi.sunmisecurityservice.wifi.dialog.ApnSettingsDialog;
import com.sunmi.sunmisecurityservice.wifi.dialog.SimCardDialog;
import com.sunmi.sunmisecurityservice.wifi.dialog.WifiCancelDialog;
import com.sunmi.sunmisecurityservice.wifi.dialog.WifiConnectDialog;
import com.sunmi.sunmisecurityservice.wifi.model.CacheModel;
import com.sunmi.sunmisecurityservice_v3.R;
import java.util.List;

/* loaded from: classes.dex */
public class WifiConnectView extends FrameLayout implements View.OnClickListener, AdapterView.OnItemClickListener, WifiSearcher.SearchWifiListener, AdapterView.OnItemLongClickListener {
    private static final int SIM_CONNECTED = 2;
    private static final int SIM_NO_CARD = 0;
    private static final int SIM_NO_NET = 1;
    private static final String TAG = "WifiConnectView";
    private static final String WEP = "WEP";
    private static final String WPA2_PSK = "WPA2-PSK";
    private static final String WPA_PSK = "WPA-PSK";
    private boolean NETWORK_AVAILABLE;
    private TextView btnNext;
    private String curSSID;
    private Handler handler;
    private boolean isSimSetting;
    private volatile boolean isWifiConnected;
    private volatile boolean isWifiConnecting;
    private View ivBack;
    private ImageView ivSimIcon;
    private LinearLayout layoutNextBtn;
    private LinearLayout layoutSimSetting;
    private ListView listView;
    private APNManager mApnManager;
    private ApnSettingsDialog mApnSettingsDialog;
    private Context mContext;
    private SimCardDialog mDialog;
    private WifiElement mSaveConnectedWifiInfo;
    private WifiAdmin mWifiAdmin;
    private WifiAdmin.WifiCipherType mWifiCipherType;
    private WifiConnectDialog mWifiConnectDialog;
    private WifiListAdapter mWifiListAdapter;
    private WifiSearcher mWifiSearcher;
    private BroadcastReceiver myReceiver;
    private PhoneStateListener phoneStateListener;
    private int simCardState;
    private Runnable simRunnable;
    private TextView tvSearch;
    private TextView tvSimSetting;
    private TextView tvSimStatus;
    private View viewLine;
    private OnWifiConnectViewWidgetClickListener widgetClickListener;

    /* loaded from: classes.dex */
    public interface OnWifiConnectViewWidgetClickListener {
        void onBackClick();

        void onNextClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePortalFun() {
    }

    public WifiConnectView(Context context) {
        super(context);
        this.simCardState = -1;
        this.NETWORK_AVAILABLE = false;
        this.isWifiConnecting = false;
        this.isWifiConnected = false;
        this.isSimSetting = false;
        this.handler = new Handler();
        this.myReceiver = new BroadcastReceiver() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.8
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (NetWorkCenterUtils.isWifi()) {
                        WifiConnectView.this.handler.removeCallbacks(WifiConnectView.this.simRunnable);
                        WifiConnectView.this.NETWORK_AVAILABLE = true;
                        WifiConnectView.this.isSimSetting = false;
                        WifiConnectView.this.isWifiConnecting = false;
                    } else if (NetWorkCenterUtils.is3G()) {
                        WifiConnectView.this.handler.removeCallbacks(WifiConnectView.this.simRunnable);
                        if (WifiConnectView.this.mApnSettingsDialog != null) {
                            WifiConnectView.this.mApnSettingsDialog.dismiss();
                        }
                        WifiConnectView.this.NETWORK_AVAILABLE = true;
                    } else {
                        WifiConnectView.this.NETWORK_AVAILABLE = false;
                    }
                    WifiConnectView.this.setNextBtnState();
                } else if ("android.net.wifi.supplicant.STATE_CHANGE".equals(intent.getAction()) && WifiConnectView.this.isWifiConnected && intent.getIntExtra("supplicantError", -1) == 1) {
                    WifiConnectView.this.displayPwdErrorDialog();
                }
            }
        };
        this.simRunnable = new Runnable() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.11
            @Override // java.lang.Runnable
            public void run() {
                WifiConnectView.this.isSimSetting = true;
            }
        };
        this.mContext = context;
        initView();
    }

    public WifiConnectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.simCardState = -1;
        this.NETWORK_AVAILABLE = false;
        this.isWifiConnecting = false;
        this.isWifiConnected = false;
        this.isSimSetting = false;
        this.handler = new Handler();
        this.myReceiver = new BroadcastReceiver() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.8
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (NetWorkCenterUtils.isWifi()) {
                        WifiConnectView.this.handler.removeCallbacks(WifiConnectView.this.simRunnable);
                        WifiConnectView.this.NETWORK_AVAILABLE = true;
                        WifiConnectView.this.isSimSetting = false;
                        WifiConnectView.this.isWifiConnecting = false;
                    } else if (NetWorkCenterUtils.is3G()) {
                        WifiConnectView.this.handler.removeCallbacks(WifiConnectView.this.simRunnable);
                        if (WifiConnectView.this.mApnSettingsDialog != null) {
                            WifiConnectView.this.mApnSettingsDialog.dismiss();
                        }
                        WifiConnectView.this.NETWORK_AVAILABLE = true;
                    } else {
                        WifiConnectView.this.NETWORK_AVAILABLE = false;
                    }
                    WifiConnectView.this.setNextBtnState();
                } else if ("android.net.wifi.supplicant.STATE_CHANGE".equals(intent.getAction()) && WifiConnectView.this.isWifiConnected && intent.getIntExtra("supplicantError", -1) == 1) {
                    WifiConnectView.this.displayPwdErrorDialog();
                }
            }
        };
        this.simRunnable = new Runnable() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.11
            @Override // java.lang.Runnable
            public void run() {
                WifiConnectView.this.isSimSetting = true;
            }
        };
        this.mContext = context;
        initView();
    }

    public WifiConnectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.simCardState = -1;
        this.NETWORK_AVAILABLE = false;
        this.isWifiConnecting = false;
        this.isWifiConnected = false;
        this.isSimSetting = false;
        this.handler = new Handler();
        this.myReceiver = new BroadcastReceiver() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.8
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (NetWorkCenterUtils.isWifi()) {
                        WifiConnectView.this.handler.removeCallbacks(WifiConnectView.this.simRunnable);
                        WifiConnectView.this.NETWORK_AVAILABLE = true;
                        WifiConnectView.this.isSimSetting = false;
                        WifiConnectView.this.isWifiConnecting = false;
                    } else if (NetWorkCenterUtils.is3G()) {
                        WifiConnectView.this.handler.removeCallbacks(WifiConnectView.this.simRunnable);
                        if (WifiConnectView.this.mApnSettingsDialog != null) {
                            WifiConnectView.this.mApnSettingsDialog.dismiss();
                        }
                        WifiConnectView.this.NETWORK_AVAILABLE = true;
                    } else {
                        WifiConnectView.this.NETWORK_AVAILABLE = false;
                    }
                    WifiConnectView.this.setNextBtnState();
                } else if ("android.net.wifi.supplicant.STATE_CHANGE".equals(intent.getAction()) && WifiConnectView.this.isWifiConnected && intent.getIntExtra("supplicantError", -1) == 1) {
                    WifiConnectView.this.displayPwdErrorDialog();
                }
            }
        };
        this.simRunnable = new Runnable() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.11
            @Override // java.lang.Runnable
            public void run() {
                WifiConnectView.this.isSimSetting = true;
            }
        };
        this.mContext = context;
        initView();
    }

    private void initView() {
        this.mApnManager = new APNManager(this.mContext);
        this.mWifiAdmin = new WifiAdmin();
        this.mWifiSearcher = new WifiSearcher(this);
        LayoutInflater.from(getContext()).inflate(R.layout.view_wifi_list, this);
        this.ivBack = findViewById(R.id.back);
        this.tvSimSetting = (TextView) findViewById(R.id.tv_sim_setting);
        this.tvSimStatus = (TextView) findViewById(R.id.tv_sim_status);
        this.ivSimIcon = (ImageView) findViewById(R.id.iv_sim_icon);
        this.tvSearch = (TextView) findViewById(R.id.empty_search);
        this.listView = (ListView) findViewById(R.id.listView);
        this.viewLine = findViewById(R.id.view_line);
        this.btnNext = (TextView) findViewById(R.id.tv_next_button);
        this.layoutSimSetting = (LinearLayout) findViewById(R.id.layout_sim_setting);
        this.layoutNextBtn = (LinearLayout) findViewById(R.id.layout_next_btn);
        this.mWifiListAdapter = new WifiListAdapter(this.mContext);
        this.listView.setAdapter((ListAdapter) this.mWifiListAdapter);
        this.ivBack.setOnClickListener(this);
        this.btnNext.setOnClickListener(this);
        this.layoutSimSetting.setOnClickListener(this);
        this.listView.setOnItemClickListener(this);
        this.listView.setOnItemLongClickListener(this);
        this.listView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                View childAt = WifiConnectView.this.listView.getChildAt(0);
                if (childAt == null || childAt.getTop() != 0) {
                    WifiConnectView.this.ivBack.setElevation(5.0f);
                } else {
                    WifiConnectView.this.ivBack.setElevation(0.0f);
                }
                if (i + i2 == ((ListAdapter) absListView.getAdapter()).getCount()) {
                    WifiConnectView.this.viewLine.setVisibility(0);
                    WifiConnectView.this.layoutNextBtn.setElevation(0.0f);
                    return;
                }
                WifiConnectView.this.viewLine.setVisibility(8);
                WifiConnectView.this.layoutNextBtn.setElevation(15.0f);
            }
        });
        registerReceiver();
        registerPhoneStateListener();
        setNextBtnState();
        searchNetWork();
    }

    private void searchNetWork() {
        this.mWifiAdmin.openGPS();
        if (this.mWifiAdmin.getWifiState() == 1) {
            this.mWifiAdmin.openWifi();
            this.tvSearch.setVisibility(0);
            this.listView.setVisibility(8);
        }
        this.handler.post(new Runnable() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.2
            @Override // java.lang.Runnable
            public void run() {
                ThreadPoolManager.executeInCachePool(new Runnable() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        WifiConnectView.this.mWifiSearcher.getAllNetWorkList();
                    }
                });
                WifiConnectView.this.updateSimCardState();
                WifiConnectView.this.checkSimNetState();
                WifiConnectView.this.handler.postDelayed(this, 1000L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSimCardState() {
        this.layoutSimSetting.setVisibility(0);
        this.tvSimStatus.setTextColor(Color.parseColor("#212121"));
        int readSIMCard = NetWorkCenterUtils.readSIMCard();
        if (readSIMCard == 1 || readSIMCard == 2) {
            this.simCardState = 0;
            this.tvSimStatus.setText(this.mContext.getText(R.string.network_sim_status_unknown));
            this.ivSimIcon.setImageResource(R.drawable.sim_unknown);
            this.tvSimSetting.setText(this.mContext.getText(R.string.network_sim_install));
        } else if (NetWorkCenterUtils.is3G()) {
            this.simCardState = 2;
            this.tvSimStatus.setText(this.mContext.getText(R.string.network_sim_status_success));
            this.tvSimStatus.setTextColor(Color.parseColor("#ff842e"));
            this.layoutSimSetting.setVisibility(8);
            this.ivSimIcon.setImageResource(SimCardUtils.getSignal(this.mContext, Constant.level));
        } else {
            this.simCardState = 1;
            this.tvSimStatus.setText(this.mContext.getText(R.string.network_sim_status_failed));
            this.tvSimSetting.setText(this.mContext.getText(R.string.network_sim_setting));
            this.ivSimIcon.setImageResource(R.drawable.sim_signal_none);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkSimNetState() {
        if (!this.isSimSetting || NetWorkCenterUtils.is3G()) {
            return;
        }
        this.isSimSetting = false;
        this.tvSimStatus.setTextColor(Color.parseColor("#212121"));
        this.tvSimStatus.setText(this.mContext.getText(R.string.network_sim_connecting));
        showApnDialog(CacheModel.getApn());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextBtnState() {
        if (this.NETWORK_AVAILABLE) {
            this.btnNext.setClickable(true);
            this.btnNext.setTextColor(Color.parseColor("#FFFFFF"));
            this.btnNext.setBackgroundResource(R.drawable.bg_next_shape);
            return;
        }
        this.btnNext.setClickable(false);
        this.btnNext.setTextColor(Color.parseColor("#4DFFFFFF"));
        this.btnNext.setBackgroundResource(R.drawable.bg_next_unselected);
    }

    @Override // com.sunmi.sunmisecurityservice.wifi.WifiSearcher.SearchWifiListener
    public void onSearchWifiSuccess(final List<ScanResultBean> list) {
        this.handler.post(new Runnable() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.3
            @Override // java.lang.Runnable
            public void run() {
                if (list.size() > 0) {
                    LogUtil.e(WifiConnectView.TAG, "scanned wifi list size:" + list.size());
                    WifiConnectView.this.tvSearch.setVisibility(8);
                    WifiConnectView.this.listView.setVisibility(0);
                    WifiConnectView.this.mWifiListAdapter.setData(list);
                }
            }
        });
    }

    @Override // com.sunmi.sunmisecurityservice.wifi.WifiSearcher.SearchWifiListener
    public void onSearchWifiFailed(final WifiSearcher.ErrorType errorType) {
        this.handler.post(new Runnable() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.4
            @Override // java.lang.Runnable
            public void run() {
                if (errorType.equals(WifiSearcher.ErrorType.NO_WIFI_FOUND)) {
                    WifiConnectView.this.tvSearch.setText(R.string.wifi_no_available);
                }
            }
        });
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        WifiConnectDialog wifiConnectDialog = this.mWifiConnectDialog;
        if (wifiConnectDialog == null || !wifiConnectDialog.isShowing()) {
            Log.e(TAG, "onItemClick  isWifiConnecting:" + this.isWifiConnecting);
            if (this.isWifiConnecting) {
                return;
            }
            dealWithConnect(this.mWifiListAdapter.getItem(i).getWifiElement());
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        WifiElement wifiElement = this.mWifiListAdapter.getItem(i).getWifiElement();
        if (this.mWifiAdmin.isExist(wifiElement.getSsid()) != null) {
            new WifiCancelDialog(this.mContext, R.style.defaultDialogStyle, wifiElement).show();
            return false;
        }
        return false;
    }

    public void dealWithConnect(final WifiElement wifiElement) {
        this.curSSID = wifiElement.getSsid();
        String upperCase = wifiElement.getCapabilities().toUpperCase();
        if (upperCase.contains("WPA")) {
            this.mWifiCipherType = WifiAdmin.WifiCipherType.WIFICIPHER_WPA;
        } else if (upperCase.contains(WEP)) {
            this.mWifiCipherType = WifiAdmin.WifiCipherType.WIFICIPHER_WEP;
        } else {
            this.mWifiCipherType = WifiAdmin.WifiCipherType.WIFICIPHER_NOPASS;
        }
        String str = upperCase.contains(WPA_PSK) ? "WPA" : "";
        if (upperCase.contains(WPA2_PSK)) {
            str = "WPA2";
        }
        if (upperCase.contains(WPA_PSK) && upperCase.contains(WPA2_PSK)) {
            str = "WPA/WPA2";
        }
        if (upperCase.contains(WEP)) {
            str = WEP;
        }
        if (str.equals("")) {
            ThreadPoolManager.executeInSinglePool(new Runnable() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.5
                @Override // java.lang.Runnable
                public void run() {
                    WifiConnectView.this.mWifiAdmin.connect(wifiElement.getSsid(), null, WifiConnectView.this.mWifiCipherType);
                }
            });
            this.listView.setSelection(0);
            return;
        }
        final WifiConfiguration isExist = this.mWifiAdmin.isExist(wifiElement.getSsid());
        if (isExist != null) {
            ThreadPoolManager.executeInSinglePool(new Runnable() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.6
                @Override // java.lang.Runnable
                public void run() {
                    WifiConnectView.this.mWifiAdmin.connectExistConfiguration(isExist);
                }
            });
        } else {
            noConfigurationConnect(wifiElement, this.mWifiCipherType, false);
        }
    }

    private void noConfigurationConnect(final WifiElement wifiElement, WifiAdmin.WifiCipherType wifiCipherType, boolean z) {
        this.mWifiConnectDialog = new WifiConnectDialog(this.mContext, wifiElement.getSsid(), new WifiConnectDialog.OnConnectOnClick() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.7
            @Override // com.sunmi.sunmisecurityservice.wifi.dialog.WifiConnectDialog.OnConnectOnClick
            public void connect(final String str, final String str2) {
                ThreadPoolManager.executeInSinglePool(new Runnable() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        WifiConnectView.this.isWifiConnecting = true;
                        Log.e(WifiConnectView.TAG, "noConfigurationConnect  connect  isWifiConnecting:" + WifiConnectView.this.isWifiConnecting);
                        if (WifiConnectView.this.mWifiCipherType != null) {
                            WifiConnectView.this.isWifiConnected = WifiConnectView.this.mWifiAdmin.connect(str2, str, WifiConnectView.this.mWifiCipherType);
                            if (WifiConnectView.this.isWifiConnected) {
                                WifiConnectView.this.mSaveConnectedWifiInfo = wifiElement;
                            }
                        }
                    }
                });
                WifiConnectView.this.listView.setSelection(0);
            }

            @Override // com.sunmi.sunmisecurityservice.wifi.dialog.WifiConnectDialog.OnConnectOnClick
            public void cancel() {
                WifiConnectView.this.isWifiConnecting = false;
                Log.e(WifiConnectView.TAG, "noConfigurationConnect  cancel  isWifiConnecting:" + WifiConnectView.this.isWifiConnecting);
            }
        }, z);
        this.mWifiConnectDialog.show();
    }

    private void portalWifi() {
        PortalWifiTask.checkWifi(new PortalWifiTask.ICheckWifiCallBack() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.9
            @Override // com.sunmi.sunmisecurityservice.wifi.PortalWifiTask.ICheckWifiCallBack
            public void portalNetWork(boolean z) {
                if (z) {
                    WifiConnectView.this.NETWORK_AVAILABLE = false;
                    WifiConnectView.this.handlePortalFun();
                    return;
                }
                Log.d("xuhao", "NETWORK_AVAILABLE_ portal" + WifiConnectView.this.NETWORK_AVAILABLE);
                WifiConnectView.this.setNextBtnState();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displayPwdErrorDialog() {
        WifiElement wifiElement;
        String str = this.curSSID;
        if (str == null || (wifiElement = this.mSaveConnectedWifiInfo) == null || !str.equals(wifiElement.getSsid())) {
            return;
        }
        WifiConfiguration isExist = this.mWifiAdmin.isExist(this.mSaveConnectedWifiInfo.getSsid());
        if (isExist != null) {
            this.mWifiAdmin.removeNetworkLink(isExist.networkId);
        }
        WifiAdmin.WifiCipherType wifiCipherType = this.mWifiCipherType;
        if (wifiCipherType != null) {
            this.isWifiConnected = false;
            noConfigurationConnect(this.mSaveConnectedWifiInfo, wifiCipherType, true);
            Log.e(TAG, "displayPwdErrorDialog isWifiConnecting:" + this.isWifiConnecting);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        OnWifiConnectViewWidgetClickListener onWifiConnectViewWidgetClickListener;
        int id = view.getId();
        if (id == R.id.back) {
            OnWifiConnectViewWidgetClickListener onWifiConnectViewWidgetClickListener2 = this.widgetClickListener;
            if (onWifiConnectViewWidgetClickListener2 != null) {
                onWifiConnectViewWidgetClickListener2.onBackClick();
            }
        } else if (id != R.id.layout_sim_setting) {
            if (id == R.id.tv_next_button && (onWifiConnectViewWidgetClickListener = this.widgetClickListener) != null) {
                onWifiConnectViewWidgetClickListener.onNextClick();
            }
        } else {
            int i = this.simCardState;
            if (i == 0) {
                displaySimDialog();
            } else if (i == 1) {
                if (NetWorkCenterUtils.isWifi()) {
                    showToast(this.mContext.getText(R.string.network_sim_wifi).toString());
                    return;
                }
                APNInfo apn = CacheModel.getApn();
                if (apn != null && apn.getName() != null) {
                    if (!this.mApnManager.isApnExist(apn)) {
                        APNManager aPNManager = this.mApnManager;
                        aPNManager.setPreferAPN(aPNManager.addAPN(apn));
                    }
                    updateSimState();
                    return;
                }
                showApnDialog(apn);
            }
        }
    }

    private void showToast(String str) {
        Toast.makeText(this.mContext, str, 0).show();
    }

    private void displaySimDialog() {
        SimCardDialog simCardDialog = this.mDialog;
        if (simCardDialog == null || !simCardDialog.isShowing()) {
            this.mDialog = SimCardDialog.createDialog(this.mContext);
            this.mDialog.show();
            this.mDialog.setOnClick(new SimCardDialog.OnClickSimListener() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.10
                @Override // com.sunmi.sunmisecurityservice.wifi.dialog.SimCardDialog.OnClickSimListener
                public void left() {
                    WifiConnectView.this.mDialog.dismiss();
                }

                @Override // com.sunmi.sunmisecurityservice.wifi.dialog.SimCardDialog.OnClickSimListener
                public void right() {
                    WifiConnectView.this.airplaneMode();
                    WifiConnectView.this.mDialog.dismiss();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void airplaneMode() {
        Intent intent = new Intent("android.intent.action.AIRPLANE_MODE");
        Settings.Global.putString(this.mContext.getContentResolver(), "airplane_mode_on", "1");
        intent.putExtra("state", true);
        this.mContext.sendBroadcast(intent);
        Settings.Global.putString(this.mContext.getContentResolver(), "airplane_mode_on", "0");
        intent.putExtra("state", false);
        this.mContext.sendBroadcast(intent);
    }

    public void updateSimState() {
        this.handler.postDelayed(this.simRunnable, 15000L);
    }

    private void showApnDialog(APNInfo aPNInfo) {
        ApnSettingsDialog apnSettingsDialog = this.mApnSettingsDialog;
        if (apnSettingsDialog == null || !apnSettingsDialog.isShowing()) {
            this.mApnSettingsDialog = new ApnSettingsDialog(this.mContext, aPNInfo);
            this.mApnSettingsDialog.show();
        }
    }

    private void registerPhoneStateListener() {
        this.phoneStateListener = new PhoneStateListener() { // from class: com.sunmi.sunmisecurityservice.view.WifiConnectView.12
            @Override // android.telephony.PhoneStateListener
            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                Constant.level = SimCardUtils.getDbm(signalStrength);
            }
        };
        ((TelephonyManager) this.mContext.getSystemService("phone")).listen(this.phoneStateListener, 256);
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        this.mContext.registerReceiver(this.myReceiver, intentFilter);
    }

    private void unregisterReceivers() {
        TelephonyManager telephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        if (telephonyManager != null) {
            telephonyManager.listen(this.phoneStateListener, 0);
        }
        this.mContext.unregisterReceiver(this.myReceiver);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        LogUtil.e(TAG, "detect WifiConnectView detached from window.");
        this.handler.removeCallbacksAndMessages(null);
        unregisterReceivers();
        super.onDetachedFromWindow();
    }

    public void setWidgetClickListener(OnWifiConnectViewWidgetClickListener onWifiConnectViewWidgetClickListener) {
        this.widgetClickListener = onWifiConnectViewWidgetClickListener;
    }
}
