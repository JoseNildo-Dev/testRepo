package com.sunmi.pay.hardware.aidl.system;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface BasicOpt extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements BasicOpt {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
        public int buzzerOnDevice(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
        public String getSysParam(String str) throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
        public int ledStatusOnDevice(int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
        public void resetSP() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
        public int setScreenMode(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
        public int setSysParam(String str, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
        public int sysGetRandom(byte[] bArr, int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
        public int sysPowerManager(int i) throws RemoteException {
            return 0;
        }
    }

    int buzzerOnDevice(int i) throws RemoteException;

    String getSysParam(String str) throws RemoteException;

    int ledStatusOnDevice(int i, int i2) throws RemoteException;

    void resetSP() throws RemoteException;

    int setScreenMode(int i) throws RemoteException;

    int setSysParam(String str, String str2) throws RemoteException;

    int sysGetRandom(byte[] bArr, int i) throws RemoteException;

    int sysPowerManager(int i) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements BasicOpt {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.system.BasicOpt";
        static final int TRANSACTION_buzzerOnDevice = 3;
        static final int TRANSACTION_getSysParam = 1;
        static final int TRANSACTION_ledStatusOnDevice = 4;
        static final int TRANSACTION_resetSP = 6;
        static final int TRANSACTION_setScreenMode = 5;
        static final int TRANSACTION_setSysParam = 2;
        static final int TRANSACTION_sysGetRandom = 8;
        static final int TRANSACTION_sysPowerManager = 7;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static BasicOpt asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof BasicOpt)) {
                return (BasicOpt) queryLocalInterface;
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
                    String sysParam = getSysParam(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(sysParam);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sysParam2 = setSysParam(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(sysParam2);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int buzzerOnDevice = buzzerOnDevice(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(buzzerOnDevice);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int ledStatusOnDevice = ledStatusOnDevice(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(ledStatusOnDevice);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int screenMode = setScreenMode(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(screenMode);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    resetSP();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sysPowerManager = sysPowerManager(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(sysPowerManager);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray = parcel.createByteArray();
                    int sysGetRandom = sysGetRandom(createByteArray, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(sysGetRandom);
                    parcel2.writeByteArray(createByteArray);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements BasicOpt {
            public static BasicOpt sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
            public String getSysParam(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSysParam(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
            public int setSysParam(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setSysParam(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
            public int buzzerOnDevice(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().buzzerOnDevice(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
            public int ledStatusOnDevice(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().ledStatusOnDevice(i, i2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
            public int setScreenMode(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setScreenMode(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
            public void resetSP() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().resetSP();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
            public int sysPowerManager(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sysPowerManager(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.system.BasicOpt
            public int sysGetRandom(byte[] bArr, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sysGetRandom(bArr, i);
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
        }

        public static boolean setDefaultImpl(BasicOpt basicOpt) {
            if (Proxy.sDefaultImpl != null || basicOpt == null) {
                return false;
            }
            Proxy.sDefaultImpl = basicOpt;
            return true;
        }

        public static BasicOpt getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
