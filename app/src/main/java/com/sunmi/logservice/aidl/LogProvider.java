package com.sunmi.logservice.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.logservice.aidl.log.LogOpt;

/* loaded from: classes.dex */
public interface LogProvider extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements LogProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.logservice.aidl.LogProvider
        public LogOpt getLogOpt() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.logservice.aidl.LogProvider
        public int setBinder(IBinder iBinder) throws RemoteException {
            return 0;
        }
    }

    LogOpt getLogOpt() throws RemoteException;

    int setBinder(IBinder iBinder) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements LogProvider {
        private static final String DESCRIPTOR = "com.sunmi.logservice.aidl.LogProvider";
        static final int TRANSACTION_getLogOpt = 1;
        static final int TRANSACTION_setBinder = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static LogProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof LogProvider)) {
                return (LogProvider) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                LogOpt logOpt = getLogOpt();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(logOpt != null ? logOpt.asBinder() : null);
                return true;
            } else if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                int binder = setBinder(parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(binder);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements LogProvider {
            public static LogProvider sDefaultImpl;
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

            @Override // com.sunmi.logservice.aidl.LogProvider
            public LogOpt getLogOpt() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLogOpt();
                    }
                    obtain2.readException();
                    return LogOpt.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.logservice.aidl.LogProvider
            public int setBinder(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setBinder(iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(LogProvider logProvider) {
            if (Proxy.sDefaultImpl == null) {
                if (logProvider != null) {
                    Proxy.sDefaultImpl = logProvider;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        public static LogProvider getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
