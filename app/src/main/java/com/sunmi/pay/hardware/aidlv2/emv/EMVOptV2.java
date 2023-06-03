package com.sunmi.pay.hardware.aidlv2.emv;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidlv2.bean.AidV2;
import com.sunmi.pay.hardware.aidlv2.bean.CapkV2;
import com.sunmi.pay.hardware.aidlv2.bean.DrlV2;
import com.sunmi.pay.hardware.aidlv2.bean.EMVTransDataV2;
import com.sunmi.pay.hardware.aidlv2.bean.EmvTermParamV2;
import com.sunmi.pay.hardware.aidlv2.bean.RevocListV2;
import com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface EMVOptV2 extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements EMVOptV2 {
        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void abortTransactProcess() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int addAid(AidV2 aidV2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int addCapk(CapkV2 capkV2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int addDrlLimitSet(DrlV2 drlV2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int addRevocList(RevocListV2 revocListV2) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int checkAidAndCapk() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int clearData(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int deleteAid(String str) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int deleteCapk(String str, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int deleteDrlLimitSet(String str) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int deleteRevocList(RevocListV2 revocListV2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int getAccountSecData(int i, String[] strArr, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int getTlv(int i, String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int getTlvList(int i, String[] strArr, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void importAppFinalSelectStatus(int i) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void importAppSelect(int i) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void importCardNoStatus(int i) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void importCertStatus(int i) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void importDataExchangeStatus(int i) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int importOnlineProcStatus(int i, String[] strArr, String[] strArr2, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void importPinInputStatus(int i, int i2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void importSignatureStatus(int i) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void importTermRiskManagementStatus(int i) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int initEmvProcess() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int queryAidCapkList(int i, List<String> list) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int queryECBalance(Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int readTransLog(int i, List<String> list) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int setAccountDataSecParam(Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void setTermParamEx(Bundle bundle) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int setTerminalParam(EmvTermParamV2 emvTermParamV2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void setTlv(int i, String str, String str2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void setTlvList(int i, String[] strArr, String[] strArr2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int sysGetTime(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int sysSetTime(long j) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public int transactPreProcess() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void transactProcess(EMVTransDataV2 eMVTransDataV2, EMVListenerV2 eMVListenerV2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
        public void transactProcessEx(Bundle bundle, EMVListenerV2 eMVListenerV2) throws RemoteException {
        }
    }

    void abortTransactProcess() throws RemoteException;

    int addAid(AidV2 aidV2) throws RemoteException;

    int addCapk(CapkV2 capkV2) throws RemoteException;

    int addDrlLimitSet(DrlV2 drlV2) throws RemoteException;

    int addRevocList(RevocListV2 revocListV2) throws RemoteException;

    int checkAidAndCapk() throws RemoteException;

    int clearData(int i) throws RemoteException;

    int deleteAid(String str) throws RemoteException;

    int deleteCapk(String str, String str2) throws RemoteException;

    int deleteDrlLimitSet(String str) throws RemoteException;

    int deleteRevocList(RevocListV2 revocListV2) throws RemoteException;

    int getAccountSecData(int i, String[] strArr, Bundle bundle) throws RemoteException;

    int getTlv(int i, String str, byte[] bArr) throws RemoteException;

    int getTlvList(int i, String[] strArr, byte[] bArr) throws RemoteException;

    void importAppFinalSelectStatus(int i) throws RemoteException;

    void importAppSelect(int i) throws RemoteException;

    void importCardNoStatus(int i) throws RemoteException;

    void importCertStatus(int i) throws RemoteException;

    void importDataExchangeStatus(int i) throws RemoteException;

    int importOnlineProcStatus(int i, String[] strArr, String[] strArr2, byte[] bArr) throws RemoteException;

    void importPinInputStatus(int i, int i2) throws RemoteException;

    void importSignatureStatus(int i) throws RemoteException;

    void importTermRiskManagementStatus(int i) throws RemoteException;

    int initEmvProcess() throws RemoteException;

    int queryAidCapkList(int i, List<String> list) throws RemoteException;

    int queryECBalance(Bundle bundle) throws RemoteException;

    int readTransLog(int i, List<String> list) throws RemoteException;

    int setAccountDataSecParam(Bundle bundle) throws RemoteException;

    void setTermParamEx(Bundle bundle) throws RemoteException;

    int setTerminalParam(EmvTermParamV2 emvTermParamV2) throws RemoteException;

    void setTlv(int i, String str, String str2) throws RemoteException;

    void setTlvList(int i, String[] strArr, String[] strArr2) throws RemoteException;

    int sysGetTime(byte[] bArr) throws RemoteException;

    int sysSetTime(long j) throws RemoteException;

    int transactPreProcess() throws RemoteException;

    void transactProcess(EMVTransDataV2 eMVTransDataV2, EMVListenerV2 eMVListenerV2) throws RemoteException;

    void transactProcessEx(Bundle bundle, EMVListenerV2 eMVListenerV2) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements EMVOptV2 {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2";
        static final int TRANSACTION_abortTransactProcess = 21;
        static final int TRANSACTION_addAid = 1;
        static final int TRANSACTION_addCapk = 3;
        static final int TRANSACTION_addDrlLimitSet = 25;
        static final int TRANSACTION_addRevocList = 30;
        static final int TRANSACTION_checkAidAndCapk = 6;
        static final int TRANSACTION_clearData = 34;
        static final int TRANSACTION_deleteAid = 2;
        static final int TRANSACTION_deleteCapk = 4;
        static final int TRANSACTION_deleteDrlLimitSet = 26;
        static final int TRANSACTION_deleteRevocList = 31;
        static final int TRANSACTION_getAccountSecData = 36;
        static final int TRANSACTION_getTlv = 9;
        static final int TRANSACTION_getTlvList = 10;
        static final int TRANSACTION_importAppFinalSelectStatus = 14;
        static final int TRANSACTION_importAppSelect = 13;
        static final int TRANSACTION_importCardNoStatus = 18;
        static final int TRANSACTION_importCertStatus = 17;
        static final int TRANSACTION_importDataExchangeStatus = 22;
        static final int TRANSACTION_importOnlineProcStatus = 19;
        static final int TRANSACTION_importPinInputStatus = 15;
        static final int TRANSACTION_importSignatureStatus = 16;
        static final int TRANSACTION_importTermRiskManagementStatus = 37;
        static final int TRANSACTION_initEmvProcess = 7;
        static final int TRANSACTION_queryAidCapkList = 28;
        static final int TRANSACTION_queryECBalance = 24;
        static final int TRANSACTION_readTransLog = 20;
        static final int TRANSACTION_setAccountDataSecParam = 35;
        static final int TRANSACTION_setTermParamEx = 27;
        static final int TRANSACTION_setTerminalParam = 5;
        static final int TRANSACTION_setTlv = 11;
        static final int TRANSACTION_setTlvList = 12;
        static final int TRANSACTION_sysGetTime = 33;
        static final int TRANSACTION_sysSetTime = 32;
        static final int TRANSACTION_transactPreProcess = 29;
        static final int TRANSACTION_transactProcess = 8;
        static final int TRANSACTION_transactProcessEx = 23;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static EMVOptV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof EMVOptV2)) {
                return (EMVOptV2) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int addAid = addAid(parcel.readInt() != 0 ? AidV2.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(addAid);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int deleteAid = deleteAid(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deleteAid);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int addCapk = addCapk(parcel.readInt() != 0 ? CapkV2.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(addCapk);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int deleteCapk = deleteCapk(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deleteCapk);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int terminalParam = setTerminalParam(parcel.readInt() != 0 ? EmvTermParamV2.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(terminalParam);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int checkAidAndCapk = checkAidAndCapk();
                    parcel2.writeNoException();
                    parcel2.writeInt(checkAidAndCapk);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int initEmvProcess = initEmvProcess();
                    parcel2.writeNoException();
                    parcel2.writeInt(initEmvProcess);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    transactProcess(parcel.readInt() != 0 ? EMVTransDataV2.CREATOR.createFromParcel(parcel) : null, EMVListenerV2.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    byte[] createByteArray = parcel.createByteArray();
                    int tlv = getTlv(readInt, readString, createByteArray);
                    parcel2.writeNoException();
                    parcel2.writeInt(tlv);
                    parcel2.writeByteArray(createByteArray);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt2 = parcel.readInt();
                    String[] createStringArray = parcel.createStringArray();
                    byte[] createByteArray2 = parcel.createByteArray();
                    int tlvList = getTlvList(readInt2, createStringArray, createByteArray2);
                    parcel2.writeNoException();
                    parcel2.writeInt(tlvList);
                    parcel2.writeByteArray(createByteArray2);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    setTlv(parcel.readInt(), parcel.readString(), parcel.readString());
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    setTlvList(parcel.readInt(), parcel.createStringArray(), parcel.createStringArray());
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    importAppSelect(parcel.readInt());
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    importAppFinalSelectStatus(parcel.readInt());
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    importPinInputStatus(parcel.readInt(), parcel.readInt());
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    importSignatureStatus(parcel.readInt());
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    importCertStatus(parcel.readInt());
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    importCardNoStatus(parcel.readInt());
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt3 = parcel.readInt();
                    String[] createStringArray2 = parcel.createStringArray();
                    String[] createStringArray3 = parcel.createStringArray();
                    byte[] createByteArray3 = parcel.createByteArray();
                    int importOnlineProcStatus = importOnlineProcStatus(readInt3, createStringArray2, createStringArray3, createByteArray3);
                    parcel2.writeNoException();
                    parcel2.writeInt(importOnlineProcStatus);
                    parcel2.writeByteArray(createByteArray3);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt4 = parcel.readInt();
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    int readTransLog = readTransLog(readInt4, createStringArrayList);
                    parcel2.writeNoException();
                    parcel2.writeInt(readTransLog);
                    parcel2.writeStringList(createStringArrayList);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    abortTransactProcess();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    importDataExchangeStatus(parcel.readInt());
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    transactProcessEx(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, EMVListenerV2.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    int queryECBalance = queryECBalance(bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(queryECBalance);
                    if (bundle != null) {
                        parcel2.writeInt(1);
                        bundle.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    int addDrlLimitSet = addDrlLimitSet(parcel.readInt() != 0 ? DrlV2.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(addDrlLimitSet);
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    int deleteDrlLimitSet = deleteDrlLimitSet(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deleteDrlLimitSet);
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    setTermParamEx(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt5 = parcel.readInt();
                    ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                    int queryAidCapkList = queryAidCapkList(readInt5, createStringArrayList2);
                    parcel2.writeNoException();
                    parcel2.writeInt(queryAidCapkList);
                    parcel2.writeStringList(createStringArrayList2);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    int transactPreProcess = transactPreProcess();
                    parcel2.writeNoException();
                    parcel2.writeInt(transactPreProcess);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    int addRevocList = addRevocList(parcel.readInt() != 0 ? RevocListV2.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(addRevocList);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    int deleteRevocList = deleteRevocList(parcel.readInt() != 0 ? RevocListV2.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(deleteRevocList);
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sysSetTime = sysSetTime(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(sysSetTime);
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray4 = parcel.createByteArray();
                    int sysGetTime = sysGetTime(createByteArray4);
                    parcel2.writeNoException();
                    parcel2.writeInt(sysGetTime);
                    parcel2.writeByteArray(createByteArray4);
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    int clearData = clearData(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(clearData);
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    int accountDataSecParam = setAccountDataSecParam(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(accountDataSecParam);
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt6 = parcel.readInt();
                    String[] createStringArray4 = parcel.createStringArray();
                    Bundle bundle2 = new Bundle();
                    int accountSecData = getAccountSecData(readInt6, createStringArray4, bundle2);
                    parcel2.writeNoException();
                    parcel2.writeInt(accountSecData);
                    parcel2.writeInt(1);
                    bundle2.writeToParcel(parcel2, 1);
                    return true;
                case 37:
                    parcel.enforceInterface(DESCRIPTOR);
                    importTermRiskManagementStatus(parcel.readInt());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements EMVOptV2 {
            public static EMVOptV2 sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int addAid(AidV2 aidV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (aidV2 != null) {
                        obtain.writeInt(1);
                        aidV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().addAid(aidV2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int deleteAid(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteAid(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int addCapk(CapkV2 capkV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (capkV2 != null) {
                        obtain.writeInt(1);
                        capkV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().addCapk(capkV2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int deleteCapk(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteCapk(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int setTerminalParam(EmvTermParamV2 emvTermParamV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (emvTermParamV2 != null) {
                        obtain.writeInt(1);
                        emvTermParamV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setTerminalParam(emvTermParamV2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int checkAidAndCapk() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkAidAndCapk();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int initEmvProcess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().initEmvProcess();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void transactProcess(EMVTransDataV2 eMVTransDataV2, EMVListenerV2 eMVListenerV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (eMVTransDataV2 != null) {
                        obtain.writeInt(1);
                        eMVTransDataV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eMVListenerV2 != null ? eMVListenerV2.asBinder() : null);
                    if (this.mRemote.transact(8, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().transactProcess(eMVTransDataV2, eMVListenerV2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int getTlv(int i, String str, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTlv(i, str, bArr);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int getTlvList(int i, String[] strArr, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTlvList(i, strArr, bArr);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void setTlv(int i, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(11, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setTlv(i, str, str2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void setTlvList(int i, String[] strArr, String[] strArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    obtain.writeStringArray(strArr2);
                    if (this.mRemote.transact(12, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setTlvList(i, strArr, strArr2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void importAppSelect(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(13, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().importAppSelect(i);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void importAppFinalSelectStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(14, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().importAppFinalSelectStatus(i);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void importPinInputStatus(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(15, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().importPinInputStatus(i, i2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void importSignatureStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(16, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().importSignatureStatus(i);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void importCertStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(17, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().importCertStatus(i);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void importCardNoStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(18, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().importCardNoStatus(i);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int importOnlineProcStatus(int i, String[] strArr, String[] strArr2, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    obtain.writeStringArray(strArr2);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().importOnlineProcStatus(i, strArr, strArr2, bArr);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int readTransLog(int i, List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStringList(list);
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().readTransLog(i, list);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readStringList(list);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void abortTransactProcess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().abortTransactProcess();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void importDataExchangeStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(22, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().importDataExchangeStatus(i);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void transactProcessEx(Bundle bundle, EMVListenerV2 eMVListenerV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(eMVListenerV2 != null ? eMVListenerV2.asBinder() : null);
                    if (this.mRemote.transact(23, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().transactProcessEx(bundle, eMVListenerV2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int queryECBalance(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(24, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryECBalance(bundle);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int addDrlLimitSet(DrlV2 drlV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (drlV2 != null) {
                        obtain.writeInt(1);
                        drlV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(25, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().addDrlLimitSet(drlV2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int deleteDrlLimitSet(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(26, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteDrlLimitSet(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void setTermParamEx(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(27, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setTermParamEx(bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int queryAidCapkList(int i, List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStringList(list);
                    if (!this.mRemote.transact(28, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryAidCapkList(i, list);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readStringList(list);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int transactPreProcess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(29, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().transactPreProcess();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int addRevocList(RevocListV2 revocListV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (revocListV2 != null) {
                        obtain.writeInt(1);
                        revocListV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(30, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().addRevocList(revocListV2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int deleteRevocList(RevocListV2 revocListV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (revocListV2 != null) {
                        obtain.writeInt(1);
                        revocListV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(31, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteRevocList(revocListV2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int sysSetTime(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeLong(j);
                    if (!this.mRemote.transact(32, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sysSetTime(j);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int sysGetTime(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(33, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sysGetTime(bArr);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int clearData(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(34, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().clearData(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int setAccountDataSecParam(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(35, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setAccountDataSecParam(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public int getAccountSecData(int i, String[] strArr, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    if (!this.mRemote.transact(36, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAccountSecData(i, strArr, bundle);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
            public void importTermRiskManagementStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(37, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().importTermRiskManagementStatus(i);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(EMVOptV2 eMVOptV2) {
            if (Proxy.sDefaultImpl != null || eMVOptV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = eMVOptV2;
            return true;
        }

        public static EMVOptV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
