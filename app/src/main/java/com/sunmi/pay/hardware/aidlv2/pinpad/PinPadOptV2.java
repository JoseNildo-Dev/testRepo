package com.sunmi.pay.hardware.aidlv2.pinpad;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidlv2.bean.PinPadConfigV2;
import com.sunmi.pay.hardware.aidlv2.bean.PinPadDataV2;
import com.sunmi.pay.hardware.aidlv2.bean.PinPadTextConfigV2;
import com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2;

/* loaded from: classes.dex */
public interface PinPadOptV2 extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements PinPadOptV2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
        public void cancelInputPin() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
        public int getPinPadMode(Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
        public void importPinPadData(PinPadDataV2 pinPadDataV2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
        public String initPinPad(PinPadConfigV2 pinPadConfigV2, PinPadListenerV2 pinPadListenerV2) throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
        public String initPinPadEx(Bundle bundle, PinPadListenerV2 pinPadListenerV2) throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
        public int setPinPadMode(Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
        public void setPinPadText(PinPadTextConfigV2 pinPadTextConfigV2) throws RemoteException {
        }
    }

    void cancelInputPin() throws RemoteException;

    int getPinPadMode(Bundle bundle) throws RemoteException;

    void importPinPadData(PinPadDataV2 pinPadDataV2) throws RemoteException;

    String initPinPad(PinPadConfigV2 pinPadConfigV2, PinPadListenerV2 pinPadListenerV2) throws RemoteException;

    String initPinPadEx(Bundle bundle, PinPadListenerV2 pinPadListenerV2) throws RemoteException;

    int setPinPadMode(Bundle bundle) throws RemoteException;

    void setPinPadText(PinPadTextConfigV2 pinPadTextConfigV2) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements PinPadOptV2 {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2";
        static final int TRANSACTION_cancelInputPin = 3;
        static final int TRANSACTION_getPinPadMode = 6;
        static final int TRANSACTION_importPinPadData = 2;
        static final int TRANSACTION_initPinPad = 1;
        static final int TRANSACTION_initPinPadEx = 7;
        static final int TRANSACTION_setPinPadMode = 5;
        static final int TRANSACTION_setPinPadText = 4;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static PinPadOptV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof PinPadOptV2)) {
                return (PinPadOptV2) queryLocalInterface;
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
                    PinPadConfigV2 createFromParcel = parcel.readInt() != 0 ? PinPadConfigV2.CREATOR.createFromParcel(parcel) : null;
                    String initPinPad = initPinPad(createFromParcel, PinPadListenerV2.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(initPinPad);
                    if (createFromParcel != null) {
                        parcel2.writeInt(1);
                        createFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    PinPadDataV2 createFromParcel2 = parcel.readInt() != 0 ? PinPadDataV2.CREATOR.createFromParcel(parcel) : null;
                    importPinPadData(createFromParcel2);
                    parcel2.writeNoException();
                    if (createFromParcel2 != null) {
                        parcel2.writeInt(1);
                        createFromParcel2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    cancelInputPin();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPinPadText(parcel.readInt() != 0 ? PinPadTextConfigV2.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int pinPadMode = setPinPadMode(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(pinPadMode);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    Bundle bundle = new Bundle();
                    int pinPadMode2 = getPinPadMode(bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(pinPadMode2);
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    String initPinPadEx = initPinPadEx(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, PinPadListenerV2.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(initPinPadEx);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements PinPadOptV2 {
            public static PinPadOptV2 sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
            public String initPinPad(PinPadConfigV2 pinPadConfigV2, PinPadListenerV2 pinPadListenerV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (pinPadConfigV2 != null) {
                        obtain.writeInt(1);
                        pinPadConfigV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pinPadListenerV2 != null ? pinPadListenerV2.asBinder() : null);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().initPinPad(pinPadConfigV2, pinPadListenerV2);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    if (obtain2.readInt() != 0) {
                        pinPadConfigV2.readFromParcel(obtain2);
                    }
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
            public void importPinPadData(PinPadDataV2 pinPadDataV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (pinPadDataV2 != null) {
                        obtain.writeInt(1);
                        pinPadDataV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().importPinPadData(pinPadDataV2);
                        return;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        pinPadDataV2.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
            public void cancelInputPin() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancelInputPin();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
            public void setPinPadText(PinPadTextConfigV2 pinPadTextConfigV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (pinPadTextConfigV2 != null) {
                        obtain.writeInt(1);
                        pinPadTextConfigV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setPinPadText(pinPadTextConfigV2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
            public int setPinPadMode(Bundle bundle) throws RemoteException {
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
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPinPadMode(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
            public int getPinPadMode(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPinPadMode(bundle);
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

            @Override // com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
            public String initPinPadEx(Bundle bundle, PinPadListenerV2 pinPadListenerV2) throws RemoteException {
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
                    obtain.writeStrongBinder(pinPadListenerV2 != null ? pinPadListenerV2.asBinder() : null);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().initPinPadEx(bundle, pinPadListenerV2);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(PinPadOptV2 pinPadOptV2) {
            if (Proxy.sDefaultImpl != null || pinPadOptV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = pinPadOptV2;
            return true;
        }

        public static PinPadOptV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
