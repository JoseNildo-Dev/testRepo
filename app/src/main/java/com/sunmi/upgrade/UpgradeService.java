package com.sunmi.upgrade;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import com.sunmi.upgrade.UpgradeTool;

/* loaded from: classes.dex */
public class UpgradeService extends IntentService {
    public static final String ACTION_DATA = "data";
    public static final String CHECK_UPDATE = "check_update";
    public static final String DATA = "data";
    public static final String INSTALL = "silent_install";

    public UpgradeService() {
        super("");
    }

    public UpgradeService(String str) {
        super(str);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        char c;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != 144316384) {
            if (hashCode == 1868184497 && action.equals(INSTALL)) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals(CHECK_UPDATE)) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return;
            }
            UpgradeTool.getInstance(getApplication()).installAPK(intent.getStringExtra("data"));
            return;
        }
        App app = (App) intent.getParcelableExtra("data");
        if (app != null) {
            checkAndDownload(app);
        }
    }

    private void checkAndDownload(App app) {
        UpgradeTool.getInstance(getApplication()).checkUpdate(app.getPackageName(), app.getVersionCode(), app.getSn(), new UpgradeTool.CheckUpdateCallback() { // from class: com.sunmi.upgrade.UpgradeService.1
            @Override // com.sunmi.upgrade.UpgradeTool.CheckUpdateCallback
            public void checkResult(App app2) {
                if (app2 != null) {
                    UpgradeTool.getInstance(UpgradeService.this.getApplication()).downloadApk(app2.getDownUrl(), app2.getMd5(), new IDownloadCallback() { // from class: com.sunmi.upgrade.UpgradeService.1.1
                        @Override // com.sunmi.upgrade.IDownloadCallback
                        public void fail(AppItem appItem, String str) {
                        }

                        @Override // com.sunmi.upgrade.IDownloadCallback
                        public void finished(AppItem appItem) {
                        }

                        @Override // com.sunmi.upgrade.IDownloadCallback
                        public void reset() {
                        }

                        @Override // com.sunmi.upgrade.IDownloadCallback
                        public void start(AppItem appItem) {
                        }

                        @Override // com.sunmi.upgrade.IDownloadCallback
                        public void stop(AppItem appItem, String str) {
                        }

                        @Override // com.sunmi.upgrade.IDownloadCallback
                        public void downloading(AppItem appItem) {
                            Log.e("ricardo", appItem.downloadedLength + "--------");
                        }

                        @Override // com.sunmi.upgrade.IDownloadCallback
                        public void success(AppItem appItem) {
                            Intent intent = new Intent();
                            intent.setAction(UpgradeService.INSTALL);
                            intent.setClass(UpgradeService.this, UpgradeService.class);
                            intent.putExtra("data", appItem.targetPath);
                            UpgradeService.this.startService(intent);
                        }
                    });
                }
            }
        });
    }
}
