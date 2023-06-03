package com.sunmi.pay.hardware.aidlv2.system;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface BasicOptV2 extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements BasicOptV2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
        public void buzzerOnDevice(int i, int i2, int i3, int i4) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
        public String getSysParam(String str) throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
        public int ledStatusOnDevice(int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
        public int ledStatusOnDeviceEx(int i, int i2, int i3, int i4) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
        public int setHideNavigationBarItems(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
        public int setNavigationBarVisibility(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
        public int setScreenMode(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
        public int setStatusBarDropDownMode(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
        public int setSysParam(String str, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
        public int sysGetRandom(byte[] bArr, int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
        public int sysPowerManage(int i) throws RemoteException {
            return 0;
        }
    }

    void buzzerOnDevice(int i, int i2, int i3, int i4) throws RemoteException;

    String getSysParam(String str) throws RemoteException;

    int ledStatusOnDevice(int i, int i2) throws RemoteException;

    int ledStatusOnDeviceEx(int i, int i2, int i3, int i4) throws RemoteException;

    int setHideNavigationBarItems(int i) throws RemoteException;

    int setNavigationBarVisibility(int i) throws RemoteException;

    int setScreenMode(int i) throws RemoteException;

    int setStatusBarDropDownMode(int i) throws RemoteException;

    int setSysParam(String str, String str2) throws RemoteException;

    int sysGetRandom(byte[] bArr, int i) throws RemoteException;

    int sysPowerManage(int i) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements BasicOptV2 {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.system.BasicOptV2";
        static final int TRANSACTION_buzzerOnDevice = 3;
        static final int TRANSACTION_getSysParam = 1;
        static final int TRANSACTION_ledStatusOnDevice = 4;
        static final int TRANSACTION_ledStatusOnDeviceEx = 7;
        static final int TRANSACTION_setHideNavigationBarItems = 10;
        static final int TRANSACTION_setNavigationBarVisibility = 9;
        static final int TRANSACTION_setScreenMode = 5;
        static final int TRANSACTION_setStatusBarDropDownMode = 8;
        static final int TRANSACTION_setSysParam = 2;
        static final int TRANSACTION_sysGetRandom = 6;
        static final int TRANSACTION_sysPowerManage = 11;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static BasicOptV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof BasicOptV2)) {
                return (BasicOptV2) queryLocalInterface;
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
                    buzzerOnDevice(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
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
                    byte[] createByteArray = parcel.createByteArray();
                    int sysGetRandom = sysGetRandom(createByteArray, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(sysGetRandom);
                    parcel2.writeByteArray(createByteArray);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int ledStatusOnDeviceEx = ledStatusOnDeviceEx(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(ledStatusOnDeviceEx);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int statusBarDropDownMode = setStatusBarDropDownMode(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(statusBarDropDownMode);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int navigationBarVisibility = setNavigationBarVisibility(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(navigationBarVisibility);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int hideNavigationBarItems = setHideNavigationBarItems(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(hideNavigationBarItems);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sysPowerManage = sysPowerManage(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(sysPowerManage);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements BasicOptV2 {
            public static BasicOptV2 sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
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

            @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
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

            @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
            public void buzzerOnDevice(int i, int i2, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().buzzerOnDevice(i, i2, i3, i4);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
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

            @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
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

            @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
            public int sysGetRandom(byte[] bArr, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
            public int ledStatusOnDeviceEx(int i, int i2, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().ledStatusOnDeviceEx(i, i2, i3, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
            public int setStatusBarDropDownMode(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setStatusBarDropDownMode(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
            public int setNavigationBarVisibility(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setNavigationBarVisibility(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
            public int setHideNavigationBarItems(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setHideNavigationBarItems(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
            public int sysPowerManage(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sysPowerManage(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(BasicOptV2 basicOptV2) {
            if (Proxy.sDefaultImpl != null || basicOptV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = basicOptV2;
            return true;
        }

        public static BasicOptV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
