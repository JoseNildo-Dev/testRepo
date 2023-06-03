package com.sunmi.pay.hardware.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.emv.EMVOpt;
import com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt;
import com.sunmi.pay.hardware.aidl.print.PrinterOpt;
import com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt;
import com.sunmi.pay.hardware.aidl.security.SecurityOpt;
import com.sunmi.pay.hardware.aidl.system.BasicOpt;
import com.sunmi.pay.hardware.aidl.tax.TaxOpt;
import com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2;
import com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2;
import com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2;
import com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2;
import com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2;
import com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2;
import com.sunmi.pay.hardware.aidlv2.system.BasicOptV2;
import com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2;

/* loaded from: classes.dex */
public interface DeviceProvide extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements DeviceProvide {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public BasicOpt getBasicOpt() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public BasicOptV2 getBasicOptV2() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public EMVOpt getEMVOpt() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public EMVOptV2 getEMVOptV2() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public ETCOptV2 getETCOptV2() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public PinPadOpt getPinPadOpt() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public PinPadOptV2 getPinPadOptV2() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public PrinterOpt getPrinterOpt() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public PrinterOptV2 getPrinterOptV2() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public ReadCardOpt getReadCardOpt() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public ReadCardOptV2 getReadCardOptV2() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public SecurityOpt getSecurityOpt() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public SecurityOptV2 getSecurityOptV2() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public TaxOpt getTaxOpt() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public TaxOptV2 getTaxOptV2() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
        public int setBinder(IBinder iBinder) throws RemoteException {
            return 0;
        }
    }

    BasicOpt getBasicOpt() throws RemoteException;

    BasicOptV2 getBasicOptV2() throws RemoteException;

    EMVOpt getEMVOpt() throws RemoteException;

    EMVOptV2 getEMVOptV2() throws RemoteException;

    ETCOptV2 getETCOptV2() throws RemoteException;

    PinPadOpt getPinPadOpt() throws RemoteException;

    PinPadOptV2 getPinPadOptV2() throws RemoteException;

    PrinterOpt getPrinterOpt() throws RemoteException;

    PrinterOptV2 getPrinterOptV2() throws RemoteException;

    ReadCardOpt getReadCardOpt() throws RemoteException;

    ReadCardOptV2 getReadCardOptV2() throws RemoteException;

    SecurityOpt getSecurityOpt() throws RemoteException;

    SecurityOptV2 getSecurityOptV2() throws RemoteException;

    TaxOpt getTaxOpt() throws RemoteException;

    TaxOptV2 getTaxOptV2() throws RemoteException;

    int setBinder(IBinder iBinder) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements DeviceProvide {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.DeviceProvide";
        static final int TRANSACTION_getBasicOpt = 1;
        static final int TRANSACTION_getBasicOptV2 = 9;
        static final int TRANSACTION_getEMVOpt = 4;
        static final int TRANSACTION_getEMVOptV2 = 12;
        static final int TRANSACTION_getETCOptV2 = 16;
        static final int TRANSACTION_getPinPadOpt = 3;
        static final int TRANSACTION_getPinPadOptV2 = 11;
        static final int TRANSACTION_getPrinterOpt = 7;
        static final int TRANSACTION_getPrinterOptV2 = 14;
        static final int TRANSACTION_getReadCardOpt = 2;
        static final int TRANSACTION_getReadCardOptV2 = 10;
        static final int TRANSACTION_getSecurityOpt = 5;
        static final int TRANSACTION_getSecurityOptV2 = 13;
        static final int TRANSACTION_getTaxOpt = 8;
        static final int TRANSACTION_getTaxOptV2 = 15;
        static final int TRANSACTION_setBinder = 6;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static DeviceProvide asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof DeviceProvide)) {
                return (DeviceProvide) queryLocalInterface;
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
                    BasicOpt basicOpt = getBasicOpt();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(basicOpt != null ? basicOpt.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    ReadCardOpt readCardOpt = getReadCardOpt();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(readCardOpt != null ? readCardOpt.asBinder() : null);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    PinPadOpt pinPadOpt = getPinPadOpt();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(pinPadOpt != null ? pinPadOpt.asBinder() : null);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    EMVOpt eMVOpt = getEMVOpt();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(eMVOpt != null ? eMVOpt.asBinder() : null);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    SecurityOpt securityOpt = getSecurityOpt();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(securityOpt != null ? securityOpt.asBinder() : null);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int binder = setBinder(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(binder);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    PrinterOpt printerOpt = getPrinterOpt();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(printerOpt != null ? printerOpt.asBinder() : null);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    TaxOpt taxOpt = getTaxOpt();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(taxOpt != null ? taxOpt.asBinder() : null);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    BasicOptV2 basicOptV2 = getBasicOptV2();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(basicOptV2 != null ? basicOptV2.asBinder() : null);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    ReadCardOptV2 readCardOptV2 = getReadCardOptV2();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(readCardOptV2 != null ? readCardOptV2.asBinder() : null);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    PinPadOptV2 pinPadOptV2 = getPinPadOptV2();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(pinPadOptV2 != null ? pinPadOptV2.asBinder() : null);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    EMVOptV2 eMVOptV2 = getEMVOptV2();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(eMVOptV2 != null ? eMVOptV2.asBinder() : null);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    SecurityOptV2 securityOptV2 = getSecurityOptV2();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(securityOptV2 != null ? securityOptV2.asBinder() : null);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    PrinterOptV2 printerOptV2 = getPrinterOptV2();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(printerOptV2 != null ? printerOptV2.asBinder() : null);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    TaxOptV2 taxOptV2 = getTaxOptV2();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(taxOptV2 != null ? taxOptV2.asBinder() : null);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    ETCOptV2 eTCOptV2 = getETCOptV2();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(eTCOptV2 != null ? eTCOptV2.asBinder() : null);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements DeviceProvide {
            public static DeviceProvide sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public BasicOpt getBasicOpt() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBasicOpt();
                    }
                    obtain2.readException();
                    return BasicOpt.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public ReadCardOpt getReadCardOpt() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getReadCardOpt();
                    }
                    obtain2.readException();
                    return ReadCardOpt.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public PinPadOpt getPinPadOpt() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPinPadOpt();
                    }
                    obtain2.readException();
                    return PinPadOpt.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public EMVOpt getEMVOpt() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getEMVOpt();
                    }
                    obtain2.readException();
                    return EMVOpt.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public SecurityOpt getSecurityOpt() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSecurityOpt();
                    }
                    obtain2.readException();
                    return SecurityOpt.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public int setBinder(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setBinder(iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public PrinterOpt getPrinterOpt() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPrinterOpt();
                    }
                    obtain2.readException();
                    return PrinterOpt.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public TaxOpt getTaxOpt() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTaxOpt();
                    }
                    obtain2.readException();
                    return TaxOpt.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public BasicOptV2 getBasicOptV2() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBasicOptV2();
                    }
                    obtain2.readException();
                    return BasicOptV2.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public ReadCardOptV2 getReadCardOptV2() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getReadCardOptV2();
                    }
                    obtain2.readException();
                    return ReadCardOptV2.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public PinPadOptV2 getPinPadOptV2() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPinPadOptV2();
                    }
                    obtain2.readException();
                    return PinPadOptV2.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public EMVOptV2 getEMVOptV2() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getEMVOptV2();
                    }
                    obtain2.readException();
                    return EMVOptV2.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public SecurityOptV2 getSecurityOptV2() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSecurityOptV2();
                    }
                    obtain2.readException();
                    return SecurityOptV2.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public PrinterOptV2 getPrinterOptV2() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPrinterOptV2();
                    }
                    obtain2.readException();
                    return PrinterOptV2.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public TaxOptV2 getTaxOptV2() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTaxOptV2();
                    }
                    obtain2.readException();
                    return TaxOptV2.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.DeviceProvide
            public ETCOptV2 getETCOptV2() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getETCOptV2();
                    }
                    obtain2.readException();
                    return ETCOptV2.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(DeviceProvide deviceProvide) {
            if (Proxy.sDefaultImpl != null || deviceProvide == null) {
                return false;
            }
            Proxy.sDefaultImpl = deviceProvide;
            return true;
        }

        public static DeviceProvide getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
