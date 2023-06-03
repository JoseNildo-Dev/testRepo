package com.sunmi.pay.hardware.aidl.readcard;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.bean.TransData;
import com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback;
import com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback;

/* loaded from: classes.dex */
public interface ReadCardOpt extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements ReadCardOpt {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public void cancelCheckCard() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int cardOff(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public void checkBankCard(int i, ReadCardCallback readCardCallback, int i2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public void checkCard(int i, ReadCardCallback readCardCallback, int i2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public void detectCard(int i, CheckCardCallback checkCardCallback, int i2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int getCardExistStatus(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int initTransData(TransData transData) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int mifareAuth(int i, int i2, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int mifareDecValue(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int mifareIncValue(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int mifareReadBlock(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int mifareWriteBlock(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int smartCardExChangeNISO(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int smartCardExChangePASS(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int smartCardExChangePASSNoLength(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
        public int smartCardExchange(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }
    }

    void cancelCheckCard() throws RemoteException;

    int cardOff(int i) throws RemoteException;

    void checkBankCard(int i, ReadCardCallback readCardCallback, int i2) throws RemoteException;

    void checkCard(int i, ReadCardCallback readCardCallback, int i2) throws RemoteException;

    void detectCard(int i, CheckCardCallback checkCardCallback, int i2) throws RemoteException;

    int getCardExistStatus(int i) throws RemoteException;

    int initTransData(TransData transData) throws RemoteException;

    int mifareAuth(int i, int i2, byte[] bArr) throws RemoteException;

    int mifareDecValue(int i, byte[] bArr) throws RemoteException;

    int mifareIncValue(int i, byte[] bArr) throws RemoteException;

    int mifareReadBlock(int i, byte[] bArr) throws RemoteException;

    int mifareWriteBlock(int i, byte[] bArr) throws RemoteException;

    int smartCardExChangeNISO(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int smartCardExChangePASS(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int smartCardExChangePASSNoLength(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int smartCardExchange(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements ReadCardOpt {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt";
        static final int TRANSACTION_cancelCheckCard = 3;
        static final int TRANSACTION_cardOff = 5;
        static final int TRANSACTION_checkBankCard = 1;
        static final int TRANSACTION_checkCard = 2;
        static final int TRANSACTION_detectCard = 14;
        static final int TRANSACTION_getCardExistStatus = 13;
        static final int TRANSACTION_initTransData = 11;
        static final int TRANSACTION_mifareAuth = 6;
        static final int TRANSACTION_mifareDecValue = 10;
        static final int TRANSACTION_mifareIncValue = 9;
        static final int TRANSACTION_mifareReadBlock = 7;
        static final int TRANSACTION_mifareWriteBlock = 8;
        static final int TRANSACTION_smartCardExChangeNISO = 12;
        static final int TRANSACTION_smartCardExChangePASS = 15;
        static final int TRANSACTION_smartCardExChangePASSNoLength = 16;
        static final int TRANSACTION_smartCardExchange = 4;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ReadCardOpt asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ReadCardOpt)) {
                return (ReadCardOpt) queryLocalInterface;
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
                    checkBankCard(parcel.readInt(), ReadCardCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    checkCard(parcel.readInt(), ReadCardCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    cancelCheckCard();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt = parcel.readInt();
                    byte[] createByteArray = parcel.createByteArray();
                    byte[] createByteArray2 = parcel.createByteArray();
                    int smartCardExchange = smartCardExchange(readInt, createByteArray, createByteArray2);
                    parcel2.writeNoException();
                    parcel2.writeInt(smartCardExchange);
                    parcel2.writeByteArray(createByteArray);
                    parcel2.writeByteArray(createByteArray2);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int cardOff = cardOff(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(cardOff);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt2 = parcel.readInt();
                    int readInt3 = parcel.readInt();
                    byte[] createByteArray3 = parcel.createByteArray();
                    int mifareAuth = mifareAuth(readInt2, readInt3, createByteArray3);
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareAuth);
                    parcel2.writeByteArray(createByteArray3);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt4 = parcel.readInt();
                    byte[] createByteArray4 = parcel.createByteArray();
                    int mifareReadBlock = mifareReadBlock(readInt4, createByteArray4);
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareReadBlock);
                    parcel2.writeByteArray(createByteArray4);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt5 = parcel.readInt();
                    byte[] createByteArray5 = parcel.createByteArray();
                    int mifareWriteBlock = mifareWriteBlock(readInt5, createByteArray5);
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareWriteBlock);
                    parcel2.writeByteArray(createByteArray5);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt6 = parcel.readInt();
                    byte[] createByteArray6 = parcel.createByteArray();
                    int mifareIncValue = mifareIncValue(readInt6, createByteArray6);
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareIncValue);
                    parcel2.writeByteArray(createByteArray6);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt7 = parcel.readInt();
                    byte[] createByteArray7 = parcel.createByteArray();
                    int mifareDecValue = mifareDecValue(readInt7, createByteArray7);
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareDecValue);
                    parcel2.writeByteArray(createByteArray7);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int initTransData = initTransData(parcel.readInt() != 0 ? TransData.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(initTransData);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt8 = parcel.readInt();
                    byte[] createByteArray8 = parcel.createByteArray();
                    int readInt9 = parcel.readInt();
                    byte[] bArr = readInt9 >= 0 ? new byte[readInt9] : null;
                    int smartCardExChangeNISO = smartCardExChangeNISO(readInt8, createByteArray8, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(smartCardExChangeNISO);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int cardExistStatus = getCardExistStatus(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(cardExistStatus);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    detectCard(parcel.readInt(), CheckCardCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt10 = parcel.readInt();
                    byte[] createByteArray9 = parcel.createByteArray();
                    int readInt11 = parcel.readInt();
                    byte[] bArr2 = readInt11 >= 0 ? new byte[readInt11] : null;
                    int smartCardExChangePASS = smartCardExChangePASS(readInt10, createByteArray9, bArr2);
                    parcel2.writeNoException();
                    parcel2.writeInt(smartCardExChangePASS);
                    parcel2.writeByteArray(bArr2);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt12 = parcel.readInt();
                    byte[] createByteArray10 = parcel.createByteArray();
                    int readInt13 = parcel.readInt();
                    byte[] bArr3 = readInt13 >= 0 ? new byte[readInt13] : null;
                    int smartCardExChangePASSNoLength = smartCardExChangePASSNoLength(readInt12, createByteArray10, bArr3);
                    parcel2.writeNoException();
                    parcel2.writeInt(smartCardExChangePASSNoLength);
                    parcel2.writeByteArray(bArr3);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements ReadCardOpt {
            public static ReadCardOpt sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public void checkBankCard(int i, ReadCardCallback readCardCallback, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(readCardCallback != null ? readCardCallback.asBinder() : null);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().checkBankCard(i, readCardCallback, i2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public void checkCard(int i, ReadCardCallback readCardCallback, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(readCardCallback != null ? readCardCallback.asBinder() : null);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().checkCard(i, readCardCallback, i2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public void cancelCheckCard() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancelCheckCard();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int smartCardExchange(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().smartCardExchange(i, bArr, bArr2);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    obtain2.readByteArray(bArr2);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int cardOff(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().cardOff(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int mifareAuth(int i, int i2, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareAuth(i, i2, bArr);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int mifareReadBlock(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareReadBlock(i, bArr);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int mifareWriteBlock(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareWriteBlock(i, bArr);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int mifareIncValue(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareIncValue(i, bArr);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int mifareDecValue(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareDecValue(i, bArr);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int initTransData(TransData transData) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (transData != null) {
                        obtain.writeInt(1);
                        transData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().initTransData(transData);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int smartCardExChangeNISO(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().smartCardExChangeNISO(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int getCardExistStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCardExistStatus(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public void detectCard(int i, CheckCardCallback checkCardCallback, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(checkCardCallback != null ? checkCardCallback.asBinder() : null);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().detectCard(i, checkCardCallback, i2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int smartCardExChangePASS(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().smartCardExChangePASS(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
            public int smartCardExChangePASSNoLength(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().smartCardExChangePASSNoLength(i, bArr, bArr2);
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

        public static boolean setDefaultImpl(ReadCardOpt readCardOpt) {
            if (Proxy.sDefaultImpl != null || readCardOpt == null) {
                return false;
            }
            Proxy.sDefaultImpl = readCardOpt;
            return true;
        }

        public static ReadCardOpt getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
