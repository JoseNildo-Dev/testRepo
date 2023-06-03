package com.sunmi.pay.hardware.aidl.readcard;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.bean.CardInfo;

/* loaded from: classes.dex */
public interface ReadCardCallback extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements ReadCardCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback
        public void onCardDetected(CardInfo cardInfo) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback
        public void onError(int i, String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback
        public void onStartCheckCard() throws RemoteException {
        }
    }

    void onCardDetected(CardInfo cardInfo) throws RemoteException;

    void onError(int i, String str) throws RemoteException;

    void onStartCheckCard() throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements ReadCardCallback {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback";
        static final int TRANSACTION_onCardDetected = 1;
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onStartCheckCard = 3;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ReadCardCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ReadCardCallback)) {
                return (ReadCardCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onCardDetected(parcel.readInt() != 0 ? CardInfo.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onError(parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onStartCheckCard();
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
        public static class Proxy implements ReadCardCallback {
            public static ReadCardCallback sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback
            public void onCardDetected(CardInfo cardInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (cardInfo != null) {
                        obtain.writeInt(1);
                        cardInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onCardDetected(cardInfo);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback
            public void onError(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onError(i, str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback
            public void onStartCheckCard() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onStartCheckCard();
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ReadCardCallback readCardCallback) {
            if (Proxy.sDefaultImpl != null || readCardCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = readCardCallback;
            return true;
        }

        public static ReadCardCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
