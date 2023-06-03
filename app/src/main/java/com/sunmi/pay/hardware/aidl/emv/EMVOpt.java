package com.sunmi.pay.hardware.aidl.emv;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.bean.EmvTermParam;
import com.sunmi.pay.hardware.aidl.bean.TransData;
import com.sunmi.pay.hardware.aidl.emv.EMVListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface EMVOpt extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements EMVOpt {
        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int TransPreProcess(int i, TransData transData) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public void abortTransactProcess() throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public void importPinInputStatus(int i, int i2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int importResponseData(int i, byte[] bArr, int i2, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int insertAID(List<String> list) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int insertCAPK(List<String> list) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int isExistCapkAndAID() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int readKernelData(String[] strArr, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int readTransLog(int i, List<String> list) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int setKernelData(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int setTerminalParam(EmvTermParam emvTermParam) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int syncParam() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public void transactProcess(EMVListener eMVListener) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int updateAID(int i, String str) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
        public int updateCAPK(int i, String str) throws RemoteException {
            return 0;
        }
    }

    int TransPreProcess(int i, TransData transData) throws RemoteException;

    void abortTransactProcess() throws RemoteException;

    void importPinInputStatus(int i, int i2) throws RemoteException;

    int importResponseData(int i, byte[] bArr, int i2, byte[] bArr2) throws RemoteException;

    int insertAID(List<String> list) throws RemoteException;

    int insertCAPK(List<String> list) throws RemoteException;

    int isExistCapkAndAID() throws RemoteException;

    int readKernelData(String[] strArr, byte[] bArr) throws RemoteException;

    int readTransLog(int i, List<String> list) throws RemoteException;

    int setKernelData(byte[] bArr) throws RemoteException;

    int setTerminalParam(EmvTermParam emvTermParam) throws RemoteException;

    int syncParam() throws RemoteException;

    void transactProcess(EMVListener eMVListener) throws RemoteException;

    int updateAID(int i, String str) throws RemoteException;

    int updateCAPK(int i, String str) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements EMVOpt {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.emv.EMVOpt";
        static final int TRANSACTION_TransPreProcess = 13;
        static final int TRANSACTION_abortTransactProcess = 15;
        static final int TRANSACTION_importPinInputStatus = 12;
        static final int TRANSACTION_importResponseData = 10;
        static final int TRANSACTION_insertAID = 3;
        static final int TRANSACTION_insertCAPK = 4;
        static final int TRANSACTION_isExistCapkAndAID = 7;
        static final int TRANSACTION_readKernelData = 9;
        static final int TRANSACTION_readTransLog = 11;
        static final int TRANSACTION_setKernelData = 14;
        static final int TRANSACTION_setTerminalParam = 6;
        static final int TRANSACTION_syncParam = 5;
        static final int TRANSACTION_transactProcess = 8;
        static final int TRANSACTION_updateAID = 1;
        static final int TRANSACTION_updateCAPK = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static EMVOpt asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof EMVOpt)) {
                return (EMVOpt) queryLocalInterface;
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
                    int updateAID = updateAID(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(updateAID);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int updateCAPK = updateCAPK(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(updateCAPK);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int insertAID = insertAID(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    parcel2.writeInt(insertAID);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int insertCAPK = insertCAPK(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    parcel2.writeInt(insertCAPK);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int syncParam = syncParam();
                    parcel2.writeNoException();
                    parcel2.writeInt(syncParam);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int terminalParam = setTerminalParam(parcel.readInt() != 0 ? EmvTermParam.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(terminalParam);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int isExistCapkAndAID = isExistCapkAndAID();
                    parcel2.writeNoException();
                    parcel2.writeInt(isExistCapkAndAID);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    transactProcess(EMVListener.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    String[] createStringArray = parcel.createStringArray();
                    byte[] createByteArray = parcel.createByteArray();
                    int readKernelData = readKernelData(createStringArray, createByteArray);
                    parcel2.writeNoException();
                    parcel2.writeInt(readKernelData);
                    parcel2.writeByteArray(createByteArray);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt = parcel.readInt();
                    byte[] createByteArray2 = parcel.createByteArray();
                    int readInt2 = parcel.readInt();
                    byte[] createByteArray3 = parcel.createByteArray();
                    int importResponseData = importResponseData(readInt, createByteArray2, readInt2, createByteArray3);
                    parcel2.writeNoException();
                    parcel2.writeInt(importResponseData);
                    parcel2.writeByteArray(createByteArray2);
                    parcel2.writeByteArray(createByteArray3);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList = new ArrayList();
                    int readTransLog = readTransLog(readInt3, arrayList);
                    parcel2.writeNoException();
                    parcel2.writeInt(readTransLog);
                    parcel2.writeStringList(arrayList);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    importPinInputStatus(parcel.readInt(), parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int TransPreProcess = TransPreProcess(parcel.readInt(), parcel.readInt() != 0 ? TransData.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(TransPreProcess);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    int kernelData = setKernelData(parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(kernelData);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    abortTransactProcess();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements EMVOpt {
            public static EMVOpt sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int updateAID(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().updateAID(i, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int updateCAPK(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().updateCAPK(i, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int insertAID(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().insertAID(list);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int insertCAPK(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().insertCAPK(list);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int syncParam() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().syncParam();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int setTerminalParam(EmvTermParam emvTermParam) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (emvTermParam != null) {
                        obtain.writeInt(1);
                        emvTermParam.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setTerminalParam(emvTermParam);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int isExistCapkAndAID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isExistCapkAndAID();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public void transactProcess(EMVListener eMVListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(eMVListener != null ? eMVListener.asBinder() : null);
                    if (this.mRemote.transact(8, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().transactProcess(eMVListener);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int readKernelData(String[] strArr, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().readKernelData(strArr, bArr);
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

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int importResponseData(int i, byte[] bArr, int i2, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().importResponseData(i, bArr, i2, bArr2);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    obtain2.readByteArray(bArr2);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int readTransLog(int i, List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public void importPinInputStatus(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(12, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().importPinInputStatus(i, i2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int TransPreProcess(int i, TransData transData) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (transData != null) {
                        obtain.writeInt(1);
                        transData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().TransPreProcess(i, transData);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public int setKernelData(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setKernelData(bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVOpt
            public void abortTransactProcess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().abortTransactProcess();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(EMVOpt eMVOpt) {
            if (Proxy.sDefaultImpl != null || eMVOpt == null) {
                return false;
            }
            Proxy.sDefaultImpl = eMVOpt;
            return true;
        }

        public static EMVOpt getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
