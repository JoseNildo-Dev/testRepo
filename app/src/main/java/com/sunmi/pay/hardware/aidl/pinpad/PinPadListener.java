package com.sunmi.pay.hardware.aidl.pinpad;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface PinPadListener extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements PinPadListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadListener
        public void onCancel() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadListener
        public void onConfirm(int i, byte[] bArr) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadListener
        public void onError(int i) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadListener
        public void onPinLength(int i) throws RemoteException {
        }
    }

    void onCancel() throws RemoteException;

    void onConfirm(int i, byte[] bArr) throws RemoteException;

    void onError(int i) throws RemoteException;

    void onPinLength(int i) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements PinPadListener {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.pinpad.PinPadListener";
        static final int TRANSACTION_onCancel = 3;
        static final int TRANSACTION_onConfirm = 2;
        static final int TRANSACTION_onError = 4;
        static final int TRANSACTION_onPinLength = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static PinPadListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof PinPadListener)) {
                return (PinPadListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onPinLength(parcel.readInt());
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onConfirm(parcel.readInt(), parcel.createByteArray());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onCancel();
                return true;
            } else if (i == 4) {
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
        public static class Proxy implements PinPadListener {
            public static PinPadListener sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadListener
            public void onPinLength(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onPinLength(i);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadListener
            public void onConfirm(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onConfirm(i, bArr);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadListener
            public void onCancel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onCancel();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadListener
            public void onError(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(4, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onError(i);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(PinPadListener pinPadListener) {
            if (Proxy.sDefaultImpl != null || pinPadListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = pinPadListener;
            return true;
        }

        public static PinPadListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
