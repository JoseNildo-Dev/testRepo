package com.sunmi.pay.hardware.aidlv2.readcard;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface CheckCardCallbackV2 extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements CheckCardCallbackV2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
        public void findICCard(String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
        public void findICCardEx(Bundle bundle) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
        public void findMagCard(Bundle bundle) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
        public void findRFCard(String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
        public void findRFCardEx(Bundle bundle) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
        public void onError(int i, String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
        public void onErrorEx(Bundle bundle) throws RemoteException {
        }
    }

    void findICCard(String str) throws RemoteException;

    void findICCardEx(Bundle bundle) throws RemoteException;

    void findMagCard(Bundle bundle) throws RemoteException;

    void findRFCard(String str) throws RemoteException;

    void findRFCardEx(Bundle bundle) throws RemoteException;

    void onError(int i, String str) throws RemoteException;

    void onErrorEx(Bundle bundle) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements CheckCardCallbackV2 {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2";
        static final int TRANSACTION_findICCard = 2;
        static final int TRANSACTION_findICCardEx = 5;
        static final int TRANSACTION_findMagCard = 1;
        static final int TRANSACTION_findRFCard = 3;
        static final int TRANSACTION_findRFCardEx = 6;
        static final int TRANSACTION_onError = 4;
        static final int TRANSACTION_onErrorEx = 7;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static CheckCardCallbackV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof CheckCardCallbackV2)) {
                return (CheckCardCallbackV2) queryLocalInterface;
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
                    findMagCard(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    findICCard(parcel.readString());
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    findRFCard(parcel.readString());
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onError(parcel.readInt(), parcel.readString());
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    findICCardEx(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    findRFCardEx(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onErrorEx(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements CheckCardCallbackV2 {
            public static CheckCardCallbackV2 sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
            public void findMagCard(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().findMagCard(bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
            public void findICCard(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().findICCard(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
            public void findRFCard(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().findRFCard(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
            public void onError(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (this.mRemote.transact(4, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onError(i, str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
            public void findICCardEx(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(5, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().findICCardEx(bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
            public void findRFCardEx(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(6, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().findRFCardEx(bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
            public void onErrorEx(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(7, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onErrorEx(bundle);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(CheckCardCallbackV2 checkCardCallbackV2) {
            if (Proxy.sDefaultImpl != null || checkCardCallbackV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = checkCardCallbackV2;
            return true;
        }

        public static CheckCardCallbackV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
