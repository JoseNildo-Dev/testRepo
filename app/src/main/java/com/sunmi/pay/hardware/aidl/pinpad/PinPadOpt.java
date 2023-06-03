package com.sunmi.pay.hardware.aidl.pinpad;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.bean.PinPadConfig;
import com.sunmi.pay.hardware.aidl.bean.PinPadData;
import com.sunmi.pay.hardware.aidl.pinpad.PinPadListener;

/* loaded from: classes.dex */
public interface PinPadOpt extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements PinPadOpt {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt
        public void importPinPadData(PinPadData pinPadData) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt
        public String initPinPad(PinPadConfig pinPadConfig, PinPadListener pinPadListener) throws RemoteException {
            return null;
        }
    }

    void importPinPadData(PinPadData pinPadData) throws RemoteException;

    String initPinPad(PinPadConfig pinPadConfig, PinPadListener pinPadListener) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements PinPadOpt {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt";
        static final int TRANSACTION_importPinPadData = 2;
        static final int TRANSACTION_initPinPad = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static PinPadOpt asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof PinPadOpt)) {
                return (PinPadOpt) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                PinPadConfig createFromParcel = parcel.readInt() != 0 ? PinPadConfig.CREATOR.createFromParcel(parcel) : null;
                String initPinPad = initPinPad(createFromParcel, PinPadListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeString(initPinPad);
                if (createFromParcel != null) {
                    parcel2.writeInt(1);
                    createFromParcel.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                PinPadData createFromParcel2 = parcel.readInt() != 0 ? PinPadData.CREATOR.createFromParcel(parcel) : null;
                importPinPadData(createFromParcel2);
                parcel2.writeNoException();
                if (createFromParcel2 != null) {
                    parcel2.writeInt(1);
                    createFromParcel2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements PinPadOpt {
            public static PinPadOpt sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt
            public String initPinPad(PinPadConfig pinPadConfig, PinPadListener pinPadListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (pinPadConfig != null) {
                        obtain.writeInt(1);
                        pinPadConfig.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pinPadListener != null ? pinPadListener.asBinder() : null);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().initPinPad(pinPadConfig, pinPadListener);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    if (obtain2.readInt() != 0) {
                        pinPadConfig.readFromParcel(obtain2);
                    }
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt
            public void importPinPadData(PinPadData pinPadData) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (pinPadData != null) {
                        obtain.writeInt(1);
                        pinPadData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().importPinPadData(pinPadData);
                        return;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        pinPadData.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(PinPadOpt pinPadOpt) {
            if (Proxy.sDefaultImpl != null || pinPadOpt == null) {
                return false;
            }
            Proxy.sDefaultImpl = pinPadOpt;
            return true;
        }

        public static PinPadOpt getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
