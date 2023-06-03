package com.sunmi.pay.hardware.aidlv2.etc;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface ETCSearchTradeOBUListenerV2 extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements ETCSearchTradeOBUListenerV2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2
        public void onError(int i) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2
        public void onSuccess(Bundle bundle) throws RemoteException {
        }
    }

    void onError(int i) throws RemoteException;

    void onSuccess(Bundle bundle) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements ETCSearchTradeOBUListenerV2 {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2";
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ETCSearchTradeOBUListenerV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ETCSearchTradeOBUListenerV2)) {
                return (ETCSearchTradeOBUListenerV2) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onError(parcel.readInt());
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
        public static class Proxy implements ETCSearchTradeOBUListenerV2 {
            public static ETCSearchTradeOBUListenerV2 sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2
            public void onSuccess(Bundle bundle) throws RemoteException {
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
                    Stub.getDefaultImpl().onSuccess(bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2
            public void onError(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onError(i);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ETCSearchTradeOBUListenerV2 eTCSearchTradeOBUListenerV2) {
            if (Proxy.sDefaultImpl != null || eTCSearchTradeOBUListenerV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = eTCSearchTradeOBUListenerV2;
            return true;
        }

        public static ETCSearchTradeOBUListenerV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
