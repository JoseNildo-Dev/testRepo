package com.sunmi.pay.hardware.aidlv2.etc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidlv2.bean.ETCInfoV2;
import java.util.List;

/* loaded from: classes.dex */
public interface ETCSearchListenerV2 extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements ETCSearchListenerV2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCSearchListenerV2
        public void onError(int i) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCSearchListenerV2
        public void onSuccess(List<ETCInfoV2> list) throws RemoteException {
        }
    }

    void onError(int i) throws RemoteException;

    void onSuccess(List<ETCInfoV2> list) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements ETCSearchListenerV2 {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.etc.ETCSearchListenerV2";
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ETCSearchListenerV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ETCSearchListenerV2)) {
                return (ETCSearchListenerV2) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.createTypedArrayList(ETCInfoV2.CREATOR));
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
        public static class Proxy implements ETCSearchListenerV2 {
            public static ETCSearchListenerV2 sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCSearchListenerV2
            public void onSuccess(List<ETCInfoV2> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSuccess(list);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCSearchListenerV2
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

        public static boolean setDefaultImpl(ETCSearchListenerV2 eTCSearchListenerV2) {
            if (Proxy.sDefaultImpl != null || eTCSearchListenerV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = eTCSearchListenerV2;
            return true;
        }

        public static ETCSearchListenerV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
