package com.sunmi.pay.hardware.aidl.emv;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface EMVListener extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements EMVListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVListener
        public void offlineApproval() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVListener
        public void onError(int i) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVListener
        public void onProcessEnd() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.emv.EMVListener
        public void requestShowPinPad(int i) throws RemoteException {
        }
    }

    void offlineApproval() throws RemoteException;

    void onError(int i) throws RemoteException;

    void onProcessEnd() throws RemoteException;

    void requestShowPinPad(int i) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements EMVListener {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.emv.EMVListener";
        static final int TRANSACTION_offlineApproval = 4;
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onProcessEnd = 2;
        static final int TRANSACTION_requestShowPinPad = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static EMVListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof EMVListener)) {
                return (EMVListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                requestShowPinPad(parcel.readInt());
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onProcessEnd();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onError(parcel.readInt());
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                offlineApproval();
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
        public static class Proxy implements EMVListener {
            public static EMVListener sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVListener
            public void requestShowPinPad(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().requestShowPinPad(i);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVListener
            public void onProcessEnd() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onProcessEnd();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVListener
            public void onError(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onError(i);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.emv.EMVListener
            public void offlineApproval() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(4, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().offlineApproval();
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(EMVListener eMVListener) {
            if (Proxy.sDefaultImpl != null || eMVListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = eMVListener;
            return true;
        }

        public static EMVListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
