package com.sunmi.pay.hardware.aidl.print;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.print.PrinterCallback;

/* loaded from: classes.dex */
public interface PrinterOpt extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements PrinterOpt {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public int getBufferRemainingRows() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public int getPrintGrayLevel() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public String getPrinterConfig() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public String getPrinterDriverVersion() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public String getPrinterSN() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public int getPrinterStatus() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public int getTotalPrintDistance() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public int printClose() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public int printFeedPaper(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public int printOpen() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public int printPointLine(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public void registerPrintCallback(PrinterCallback printerCallback) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public int setGrayLevel(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public int setPrintHeatPoint(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public int setPrintSpeed(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
        public void unregisterPrintCallback() throws RemoteException {
        }
    }

    int getBufferRemainingRows() throws RemoteException;

    int getPrintGrayLevel() throws RemoteException;

    String getPrinterConfig() throws RemoteException;

    String getPrinterDriverVersion() throws RemoteException;

    String getPrinterSN() throws RemoteException;

    int getPrinterStatus() throws RemoteException;

    int getTotalPrintDistance() throws RemoteException;

    int printClose() throws RemoteException;

    int printFeedPaper(int i) throws RemoteException;

    int printOpen() throws RemoteException;

    int printPointLine(byte[] bArr) throws RemoteException;

    void registerPrintCallback(PrinterCallback printerCallback) throws RemoteException;

    int setGrayLevel(int i) throws RemoteException;

    int setPrintHeatPoint(int i) throws RemoteException;

    int setPrintSpeed(int i) throws RemoteException;

    void unregisterPrintCallback() throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements PrinterOpt {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.print.PrinterOpt";
        static final int TRANSACTION_getBufferRemainingRows = 8;
        static final int TRANSACTION_getPrintGrayLevel = 10;
        static final int TRANSACTION_getPrinterConfig = 9;
        static final int TRANSACTION_getPrinterDriverVersion = 6;
        static final int TRANSACTION_getPrinterSN = 12;
        static final int TRANSACTION_getPrinterStatus = 5;
        static final int TRANSACTION_getTotalPrintDistance = 11;
        static final int TRANSACTION_printClose = 2;
        static final int TRANSACTION_printFeedPaper = 4;
        static final int TRANSACTION_printOpen = 1;
        static final int TRANSACTION_printPointLine = 3;
        static final int TRANSACTION_registerPrintCallback = 13;
        static final int TRANSACTION_setGrayLevel = 7;
        static final int TRANSACTION_setPrintHeatPoint = 16;
        static final int TRANSACTION_setPrintSpeed = 15;
        static final int TRANSACTION_unregisterPrintCallback = 14;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static PrinterOpt asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof PrinterOpt)) {
                return (PrinterOpt) queryLocalInterface;
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
                    int printOpen = printOpen();
                    parcel2.writeNoException();
                    parcel2.writeInt(printOpen);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int printClose = printClose();
                    parcel2.writeNoException();
                    parcel2.writeInt(printClose);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int printPointLine = printPointLine(parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(printPointLine);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int printFeedPaper = printFeedPaper(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(printFeedPaper);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int printerStatus = getPrinterStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(printerStatus);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    String printerDriverVersion = getPrinterDriverVersion();
                    parcel2.writeNoException();
                    parcel2.writeString(printerDriverVersion);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int grayLevel = setGrayLevel(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(grayLevel);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int bufferRemainingRows = getBufferRemainingRows();
                    parcel2.writeNoException();
                    parcel2.writeInt(bufferRemainingRows);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    String printerConfig = getPrinterConfig();
                    parcel2.writeNoException();
                    parcel2.writeString(printerConfig);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int printGrayLevel = getPrintGrayLevel();
                    parcel2.writeNoException();
                    parcel2.writeInt(printGrayLevel);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int totalPrintDistance = getTotalPrintDistance();
                    parcel2.writeNoException();
                    parcel2.writeInt(totalPrintDistance);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    String printerSN = getPrinterSN();
                    parcel2.writeNoException();
                    parcel2.writeString(printerSN);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerPrintCallback(PrinterCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisterPrintCallback();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    int printSpeed = setPrintSpeed(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(printSpeed);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    int printHeatPoint = setPrintHeatPoint(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(printHeatPoint);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements PrinterOpt {
            public static PrinterOpt sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public int printOpen() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().printOpen();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public int printClose() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().printClose();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public int printPointLine(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().printPointLine(bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public int printFeedPaper(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().printFeedPaper(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public int getPrinterStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPrinterStatus();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public String getPrinterDriverVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPrinterDriverVersion();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public int setGrayLevel(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setGrayLevel(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public int getBufferRemainingRows() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBufferRemainingRows();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public String getPrinterConfig() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPrinterConfig();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public int getPrintGrayLevel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPrintGrayLevel();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public int getTotalPrintDistance() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTotalPrintDistance();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public String getPrinterSN() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPrinterSN();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public void registerPrintCallback(PrinterCallback printerCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(printerCallback != null ? printerCallback.asBinder() : null);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerPrintCallback(printerCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public void unregisterPrintCallback() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().unregisterPrintCallback();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public int setPrintSpeed(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPrintSpeed(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.print.PrinterOpt
            public int setPrintHeatPoint(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPrintHeatPoint(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(PrinterOpt printerOpt) {
            if (Proxy.sDefaultImpl != null || printerOpt == null) {
                return false;
            }
            Proxy.sDefaultImpl = printerOpt;
            return true;
        }

        public static PrinterOpt getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
