package com.sunmi.pay.hardware.aidl.readcard;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface CheckCardCallback extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements CheckCardCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
        public void findICCard(String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
        public void findMagCard(Bundle bundle) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
        public void findRFCard(String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
        public void onError(int i, String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
        public void onStartCheckCard() throws RemoteException {
        }
    }

    void findICCard(String str) throws RemoteException;

    void findMagCard(Bundle bundle) throws RemoteException;

    void findRFCard(String str) throws RemoteException;

    void onError(int i, String str) throws RemoteException;

    void onStartCheckCard() throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements CheckCardCallback {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback";
        static final int TRANSACTION_findICCard = 3;
        static final int TRANSACTION_findMagCard = 2;
        static final int TRANSACTION_findRFCard = 4;
        static final int TRANSACTION_onError = 5;
        static final int TRANSACTION_onStartCheckCard = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static CheckCardCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof CheckCardCallback)) {
                return (CheckCardCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onStartCheckCard();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                findMagCard(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                findICCard(parcel.readString());
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                findRFCard(parcel.readString());
                return true;
            } else if (i == 5) {
                parcel.enforceInterface(DESCRIPTOR);
                onError(parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements CheckCardCallback {
            public static CheckCardCallback sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
            public void onStartCheckCard() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onStartCheckCard();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
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
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().findMagCard(bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
            public void findICCard(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().findICCard(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
            public void findRFCard(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(4, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().findRFCard(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
            public void onError(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (this.mRemote.transact(5, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onError(i, str);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(CheckCardCallback checkCardCallback) {
            if (Proxy.sDefaultImpl != null || checkCardCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = checkCardCallback;
            return true;
        }

        public static CheckCardCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
