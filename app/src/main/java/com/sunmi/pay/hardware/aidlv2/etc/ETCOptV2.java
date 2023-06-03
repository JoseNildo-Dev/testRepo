package com.sunmi.pay.hardware.aidlv2.etc;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidlv2.etc.ETCSearchListenerV2;
import com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2;

/* loaded from: classes.dex */
public interface ETCOptV2 extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements ETCOptV2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
        public void cancelSearch() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
        public int complexTrade(byte[] bArr, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
        public int finishTrade(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
        public int getTradeRecord(Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
        public int getTradeVehicleCipherInfo(int i, String str, int i2, int i3, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
        public int i2cDataExchange(int i, byte[] bArr, int i2, int i3, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
        public int initTrade(int i, int i2, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
        public void search(int i, ETCSearchListenerV2 eTCSearchListenerV2, int i2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
        public void searchTradeOBU(int i, String str, int i2, ETCSearchTradeOBUListenerV2 eTCSearchTradeOBUListenerV2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
        public int setSearchParam(Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
        public int tradeHeartbeat() throws RemoteException {
            return 0;
        }
    }

    void cancelSearch() throws RemoteException;

    int complexTrade(byte[] bArr, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException;

    int finishTrade(int i) throws RemoteException;

    int getTradeRecord(Bundle bundle) throws RemoteException;

    int getTradeVehicleCipherInfo(int i, String str, int i2, int i3, Bundle bundle) throws RemoteException;

    int i2cDataExchange(int i, byte[] bArr, int i2, int i3, byte[] bArr2) throws RemoteException;

    int initTrade(int i, int i2, String str, Bundle bundle) throws RemoteException;

    void search(int i, ETCSearchListenerV2 eTCSearchListenerV2, int i2) throws RemoteException;

    void searchTradeOBU(int i, String str, int i2, ETCSearchTradeOBUListenerV2 eTCSearchTradeOBUListenerV2) throws RemoteException;

    int setSearchParam(Bundle bundle) throws RemoteException;

    int tradeHeartbeat() throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements ETCOptV2 {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2";
        static final int TRANSACTION_cancelSearch = 3;
        static final int TRANSACTION_complexTrade = 9;
        static final int TRANSACTION_finishTrade = 10;
        static final int TRANSACTION_getTradeRecord = 7;
        static final int TRANSACTION_getTradeVehicleCipherInfo = 6;
        static final int TRANSACTION_i2cDataExchange = 1;
        static final int TRANSACTION_initTrade = 8;
        static final int TRANSACTION_search = 2;
        static final int TRANSACTION_searchTradeOBU = 5;
        static final int TRANSACTION_setSearchParam = 4;
        static final int TRANSACTION_tradeHeartbeat = 11;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ETCOptV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ETCOptV2)) {
                return (ETCOptV2) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt = parcel.readInt();
                    byte[] createByteArray = parcel.createByteArray();
                    int readInt2 = parcel.readInt();
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    byte[] bArr = readInt4 >= 0 ? new byte[readInt4] : null;
                    int i2cDataExchange = i2cDataExchange(readInt, createByteArray, readInt2, readInt3, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(i2cDataExchange);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    search(parcel.readInt(), ETCSearchListenerV2.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    cancelSearch();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int searchParam = setSearchParam(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(searchParam);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    searchTradeOBU(parcel.readInt(), parcel.readString(), parcel.readInt(), ETCSearchTradeOBUListenerV2.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt5 = parcel.readInt();
                    String readString = parcel.readString();
                    int readInt6 = parcel.readInt();
                    int readInt7 = parcel.readInt();
                    Bundle bundle = new Bundle();
                    int tradeVehicleCipherInfo = getTradeVehicleCipherInfo(readInt5, readString, readInt6, readInt7, bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(tradeVehicleCipherInfo);
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    Bundle bundle2 = new Bundle();
                    int tradeRecord = getTradeRecord(bundle2);
                    parcel2.writeNoException();
                    parcel2.writeInt(tradeRecord);
                    parcel2.writeInt(1);
                    bundle2.writeToParcel(parcel2, 1);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt8 = parcel.readInt();
                    int readInt9 = parcel.readInt();
                    String readString2 = parcel.readString();
                    Bundle bundle3 = new Bundle();
                    int initTrade = initTrade(readInt8, readInt9, readString2, bundle3);
                    parcel2.writeNoException();
                    parcel2.writeInt(initTrade);
                    parcel2.writeInt(1);
                    bundle3.writeToParcel(parcel2, 1);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray2 = parcel.createByteArray();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    Bundle bundle4 = new Bundle();
                    int complexTrade = complexTrade(createByteArray2, readString3, readString4, readString5, readString6, bundle4);
                    parcel2.writeNoException();
                    parcel2.writeInt(complexTrade);
                    parcel2.writeInt(1);
                    bundle4.writeToParcel(parcel2, 1);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int finishTrade = finishTrade(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(finishTrade);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int tradeHeartbeat = tradeHeartbeat();
                    parcel2.writeNoException();
                    parcel2.writeInt(tradeHeartbeat);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements ETCOptV2 {
            public static ETCOptV2 sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
            public int i2cDataExchange(int i, byte[] bArr, int i2, int i3, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().i2cDataExchange(i, bArr, i2, i3, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
            public void search(int i, ETCSearchListenerV2 eTCSearchListenerV2, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(eTCSearchListenerV2 != null ? eTCSearchListenerV2.asBinder() : null);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().search(i, eTCSearchListenerV2, i2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
            public void cancelSearch() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancelSearch();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
            public int setSearchParam(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setSearchParam(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
            public void searchTradeOBU(int i, String str, int i2, ETCSearchTradeOBUListenerV2 eTCSearchTradeOBUListenerV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(eTCSearchTradeOBUListenerV2 != null ? eTCSearchTradeOBUListenerV2.asBinder() : null);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().searchTradeOBU(i, str, i2, eTCSearchTradeOBUListenerV2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
            public int getTradeVehicleCipherInfo(int i, String str, int i2, int i3, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTradeVehicleCipherInfo(i, str, i2, i3, bundle);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
            public int getTradeRecord(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTradeRecord(bundle);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
            public int initTrade(int i, int i2, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().initTrade(i, i2, str, bundle);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
            public int complexTrade(byte[] bArr, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int complexTrade = Stub.getDefaultImpl().complexTrade(bArr, str, str2, str3, str4, bundle);
                        obtain2.recycle();
                        obtain.recycle();
                        return complexTrade;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
            public int finishTrade(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().finishTrade(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
            public int tradeHeartbeat() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().tradeHeartbeat();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ETCOptV2 eTCOptV2) {
            if (Proxy.sDefaultImpl != null || eTCOptV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = eTCOptV2;
            return true;
        }

        public static ETCOptV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
