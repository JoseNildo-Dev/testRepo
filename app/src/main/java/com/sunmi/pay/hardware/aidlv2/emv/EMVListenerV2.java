package com.sunmi.pay.hardware.aidlv2.emv;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidlv2.bean.EMVCandidateV2;
import java.util.List;

/* loaded from: classes.dex */
public interface EMVListenerV2 extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements EMVListenerV2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onAppFinalSelect(String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onCardDataExchangeComplete() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onCertVerify(int i, String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onConfirmCardNo(String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onConfirmationCodeVerified() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onOnlineProc() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onRequestDataExchange(String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onRequestShowPinPad(int i, int i2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onRequestSignature() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onTermRiskManagement() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onTransResult(int i, String str) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
        public void onWaitAppSelect(List<EMVCandidateV2> list, boolean z) throws RemoteException {
        }
    }

    void onAppFinalSelect(String str) throws RemoteException;

    void onCardDataExchangeComplete() throws RemoteException;

    void onCertVerify(int i, String str) throws RemoteException;

    void onConfirmCardNo(String str) throws RemoteException;

    void onConfirmationCodeVerified() throws RemoteException;

    void onOnlineProc() throws RemoteException;

    void onRequestDataExchange(String str) throws RemoteException;

    void onRequestShowPinPad(int i, int i2) throws RemoteException;

    void onRequestSignature() throws RemoteException;

    void onTermRiskManagement() throws RemoteException;

    void onTransResult(int i, String str) throws RemoteException;

    void onWaitAppSelect(List<EMVCandidateV2> list, boolean z) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements EMVListenerV2 {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2";
        static final int TRANSACTION_onAppFinalSelect = 2;
        static final int TRANSACTION_onCardDataExchangeComplete = 8;
        static final int TRANSACTION_onCertVerify = 6;
        static final int TRANSACTION_onConfirmCardNo = 3;
        static final int TRANSACTION_onConfirmationCodeVerified = 10;
        static final int TRANSACTION_onOnlineProc = 7;
        static final int TRANSACTION_onRequestDataExchange = 11;
        static final int TRANSACTION_onRequestShowPinPad = 4;
        static final int TRANSACTION_onRequestSignature = 5;
        static final int TRANSACTION_onTermRiskManagement = 12;
        static final int TRANSACTION_onTransResult = 9;
        static final int TRANSACTION_onWaitAppSelect = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static EMVListenerV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof EMVListenerV2)) {
                return (EMVListenerV2) queryLocalInterface;
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
                    onWaitAppSelect(parcel.createTypedArrayList(EMVCandidateV2.CREATOR), parcel.readInt() != 0);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onAppFinalSelect(parcel.readString());
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConfirmCardNo(parcel.readString());
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onRequestShowPinPad(parcel.readInt(), parcel.readInt());
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onRequestSignature();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onCertVerify(parcel.readInt(), parcel.readString());
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onOnlineProc();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    onCardDataExchangeComplete();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    onTransResult(parcel.readInt(), parcel.readString());
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConfirmationCodeVerified();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    onRequestDataExchange(parcel.readString());
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    onTermRiskManagement();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements EMVListenerV2 {
            public static EMVListenerV2 sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onWaitAppSelect(List<EMVCandidateV2> list, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onWaitAppSelect(list, z);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onAppFinalSelect(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onAppFinalSelect(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onConfirmCardNo(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onConfirmCardNo(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onRequestShowPinPad(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(4, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onRequestShowPinPad(i, i2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onRequestSignature() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(5, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onRequestSignature();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onCertVerify(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (this.mRemote.transact(6, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onCertVerify(i, str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onOnlineProc() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(7, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onOnlineProc();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onCardDataExchangeComplete() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(8, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onCardDataExchangeComplete();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onTransResult(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (this.mRemote.transact(9, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onTransResult(i, str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onConfirmationCodeVerified() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(10, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onConfirmationCodeVerified();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onRequestDataExchange(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(11, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onRequestDataExchange(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
            public void onTermRiskManagement() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(12, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onTermRiskManagement();
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(EMVListenerV2 eMVListenerV2) {
            if (Proxy.sDefaultImpl != null || eMVListenerV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = eMVListenerV2;
            return true;
        }

        public static EMVListenerV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
