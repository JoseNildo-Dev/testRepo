package com.sunmi.pay.hardware.aidl.tax;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface TaxOpt extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements TaxOpt {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.tax.TaxOpt
        public int taxDataExchange(byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }
    }

    int taxDataExchange(byte[] bArr, byte[] bArr2) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements TaxOpt {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.tax.TaxOpt";
        static final int TRANSACTION_taxDataExchange = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static TaxOpt asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof TaxOpt)) {
                return (TaxOpt) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            byte[] createByteArray = parcel.createByteArray();
            int readInt = parcel.readInt();
            byte[] bArr = readInt < 0 ? null : new byte[readInt];
            int taxDataExchange = taxDataExchange(createByteArray, bArr);
            parcel2.writeNoException();
            parcel2.writeInt(taxDataExchange);
            parcel2.writeByteArray(bArr);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements TaxOpt {
            public static TaxOpt sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.tax.TaxOpt
            public int taxDataExchange(byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().taxDataExchange(bArr, bArr2);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr2);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(TaxOpt taxOpt) {
            if (Proxy.sDefaultImpl != null || taxOpt == null) {
                return false;
            }
            Proxy.sDefaultImpl = taxOpt;
            return true;
        }

        public static TaxOpt getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
