package com.sunmi.baseservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.baseservice.IBaseServiceCallbackInterface;

/* loaded from: classes.dex */
public interface IBaseServiceInterface extends IInterface {
    void request(String str, IBaseServiceCallbackInterface iBaseServiceCallbackInterface) throws RemoteException;

    void unRegisterListener(IBaseServiceCallbackInterface iBaseServiceCallbackInterface) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IBaseServiceInterface {
        private static final String DESCRIPTOR = "com.sunmi.baseservice.IBaseServiceInterface";
        static final int TRANSACTION_request = 1;
        static final int TRANSACTION_unRegisterListener = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IBaseServiceInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IBaseServiceInterface)) {
                return (IBaseServiceInterface) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                request(parcel.readString(), IBaseServiceCallbackInterface.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                unRegisterListener(IBaseServiceCallbackInterface.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }

        /* loaded from: classes.dex */
        private static class Proxy implements IBaseServiceInterface {
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

            @Override // com.sunmi.baseservice.IBaseServiceInterface
            public void request(String str, IBaseServiceCallbackInterface iBaseServiceCallbackInterface) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBaseServiceCallbackInterface != null ? iBaseServiceCallbackInterface.asBinder() : null);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.baseservice.IBaseServiceInterface
            public void unRegisterListener(IBaseServiceCallbackInterface iBaseServiceCallbackInterface) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBaseServiceCallbackInterface != null ? iBaseServiceCallbackInterface.asBinder() : null);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
