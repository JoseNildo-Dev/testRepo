package com.sunmi.pay.hardware.aidlv2.tax;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface TaxOptV2 extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements TaxOptV2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2
        public int taxDataExchange(byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }
    }

    int taxDataExchange(byte[] bArr, byte[] bArr2) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements TaxOptV2 {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2";
        static final int TRANSACTION_taxDataExchange = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static TaxOptV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof TaxOptV2)) {
                return (TaxOptV2) queryLocalInterface;
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
        public static class Proxy implements TaxOptV2 {
            public static TaxOptV2 sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2
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

        public static boolean setDefaultImpl(TaxOptV2 taxOptV2) {
            if (Proxy.sDefaultImpl != null || taxOptV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = taxOptV2;
            return true;
        }

        public static TaxOptV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
