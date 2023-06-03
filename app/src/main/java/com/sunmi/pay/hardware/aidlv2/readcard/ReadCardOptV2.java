package com.sunmi.pay.hardware.aidlv2.readcard;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidlv2.bean.ApduRecvV2;
import com.sunmi.pay.hardware.aidlv2.bean.ApduSendV2;
import com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface ReadCardOptV2 extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements ReadCardOptV2 {
        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int apduCommand(int i, ApduSendV2 apduSendV2, ApduRecvV2 apduRecvV2) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int at24cReadData(int i, int i2, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int at24cWriteData(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int at88scAuthKey(byte[] bArr, int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int at88scChangeKey(byte[] bArr, int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int at88scGetRemainAuthCount(int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int at88scReadData(int i, int i2, int i3, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int at88scWriteData(int i, int i2, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public void cancelCheckCard() throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int cardOff(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public void checkCard(int i, CheckCardCallbackV2 checkCardCallbackV2, int i2) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int checkCardEnc(Bundle bundle, CheckCardCallbackV2 checkCardCallbackV2, int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public void checkCardEx(int i, int i2, int i3, CheckCardCallbackV2 checkCardCallbackV2, int i4) throws RemoteException {
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int ctx512GetSignature(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int ctx512MultiReadBlock(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int ctx512ReadBlock(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int ctx512UpdateBlock(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int ctx512WriteBlock(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int getCardExistStatus(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareAuth(int i, int i2, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareDecValue(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareDecValueDx(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareIncValue(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareIncValueDx(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifarePlusChangeBlockKey(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifarePlusReadBlock(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifarePlusWriteBlock(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareReadBlock(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareRestore(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareTransfer(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareUltralightCAuth(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareUltralightCReadData(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareUltralightCWriteData(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int mifareWriteBlock(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int sleAuthKey(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int sleChangeKey(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int sleGetRemainAuthCount() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int sleReadData(int i, int i2, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int sleReadMemoryProtectionStatus(int i, int i2, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int sleWriteData(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int sleWriteProtectionMemory(int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int smartCardExChangePASS(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int smartCardExChangePASSNoLength(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int smartCardExchange(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int smartCardIoControl(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int transmitApdu(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int transmitApduEx(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int transmitApduExx(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
        public int transmitMultiApdus(int i, int i2, List<String> list, List<String> list2) throws RemoteException {
            return 0;
        }
    }

    int apduCommand(int i, ApduSendV2 apduSendV2, ApduRecvV2 apduRecvV2) throws RemoteException;

    int at24cReadData(int i, int i2, byte[] bArr) throws RemoteException;

    int at24cWriteData(int i, byte[] bArr) throws RemoteException;

    int at88scAuthKey(byte[] bArr, int i, int i2) throws RemoteException;

    int at88scChangeKey(byte[] bArr, int i, int i2) throws RemoteException;

    int at88scGetRemainAuthCount(int i, int i2) throws RemoteException;

    int at88scReadData(int i, int i2, int i3, byte[] bArr) throws RemoteException;

    int at88scWriteData(int i, int i2, byte[] bArr) throws RemoteException;

    void cancelCheckCard() throws RemoteException;

    int cardOff(int i) throws RemoteException;

    void checkCard(int i, CheckCardCallbackV2 checkCardCallbackV2, int i2) throws RemoteException;

    int checkCardEnc(Bundle bundle, CheckCardCallbackV2 checkCardCallbackV2, int i) throws RemoteException;

    void checkCardEx(int i, int i2, int i3, CheckCardCallbackV2 checkCardCallbackV2, int i4) throws RemoteException;

    int ctx512GetSignature(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int ctx512MultiReadBlock(int i, byte[] bArr) throws RemoteException;

    int ctx512ReadBlock(int i, byte[] bArr) throws RemoteException;

    int ctx512UpdateBlock(int i, byte[] bArr) throws RemoteException;

    int ctx512WriteBlock(int i, byte[] bArr) throws RemoteException;

    int getCardExistStatus(int i) throws RemoteException;

    int mifareAuth(int i, int i2, byte[] bArr) throws RemoteException;

    int mifareDecValue(int i, byte[] bArr) throws RemoteException;

    int mifareDecValueDx(int i, byte[] bArr) throws RemoteException;

    int mifareIncValue(int i, byte[] bArr) throws RemoteException;

    int mifareIncValueDx(int i, byte[] bArr) throws RemoteException;

    int mifarePlusChangeBlockKey(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int mifarePlusReadBlock(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int mifarePlusWriteBlock(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int mifareReadBlock(int i, byte[] bArr) throws RemoteException;

    int mifareRestore(int i) throws RemoteException;

    int mifareTransfer(int i) throws RemoteException;

    int mifareUltralightCAuth(byte[] bArr) throws RemoteException;

    int mifareUltralightCReadData(int i, byte[] bArr) throws RemoteException;

    int mifareUltralightCWriteData(int i, byte[] bArr) throws RemoteException;

    int mifareWriteBlock(int i, byte[] bArr) throws RemoteException;

    int sleAuthKey(byte[] bArr) throws RemoteException;

    int sleChangeKey(byte[] bArr) throws RemoteException;

    int sleGetRemainAuthCount() throws RemoteException;

    int sleReadData(int i, int i2, byte[] bArr) throws RemoteException;

    int sleReadMemoryProtectionStatus(int i, int i2, byte[] bArr) throws RemoteException;

    int sleWriteData(int i, byte[] bArr) throws RemoteException;

    int sleWriteProtectionMemory(int i, int i2) throws RemoteException;

    int smartCardExChangePASS(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int smartCardExChangePASSNoLength(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int smartCardExchange(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int smartCardIoControl(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException;

    int transmitApdu(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int transmitApduEx(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int transmitApduExx(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException;

    int transmitMultiApdus(int i, int i2, List<String> list, List<String> list2) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements ReadCardOptV2 {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2";
        static final int TRANSACTION_apduCommand = 3;
        static final int TRANSACTION_at24cReadData = 28;
        static final int TRANSACTION_at24cWriteData = 29;
        static final int TRANSACTION_at88scAuthKey = 30;
        static final int TRANSACTION_at88scChangeKey = 31;
        static final int TRANSACTION_at88scGetRemainAuthCount = 34;
        static final int TRANSACTION_at88scReadData = 32;
        static final int TRANSACTION_at88scWriteData = 33;
        static final int TRANSACTION_cancelCheckCard = 2;
        static final int TRANSACTION_cardOff = 6;
        static final int TRANSACTION_checkCard = 1;
        static final int TRANSACTION_checkCardEnc = 48;
        static final int TRANSACTION_checkCardEx = 45;
        static final int TRANSACTION_ctx512GetSignature = 39;
        static final int TRANSACTION_ctx512MultiReadBlock = 40;
        static final int TRANSACTION_ctx512ReadBlock = 36;
        static final int TRANSACTION_ctx512UpdateBlock = 38;
        static final int TRANSACTION_ctx512WriteBlock = 37;
        static final int TRANSACTION_getCardExistStatus = 7;
        static final int TRANSACTION_mifareAuth = 8;
        static final int TRANSACTION_mifareDecValue = 12;
        static final int TRANSACTION_mifareDecValueDx = 42;
        static final int TRANSACTION_mifareIncValue = 11;
        static final int TRANSACTION_mifareIncValueDx = 41;
        static final int TRANSACTION_mifarePlusChangeBlockKey = 20;
        static final int TRANSACTION_mifarePlusReadBlock = 18;
        static final int TRANSACTION_mifarePlusWriteBlock = 19;
        static final int TRANSACTION_mifareReadBlock = 9;
        static final int TRANSACTION_mifareRestore = 44;
        static final int TRANSACTION_mifareTransfer = 43;
        static final int TRANSACTION_mifareUltralightCAuth = 13;
        static final int TRANSACTION_mifareUltralightCReadData = 14;
        static final int TRANSACTION_mifareUltralightCWriteData = 15;
        static final int TRANSACTION_mifareWriteBlock = 10;
        static final int TRANSACTION_sleAuthKey = 21;
        static final int TRANSACTION_sleChangeKey = 22;
        static final int TRANSACTION_sleGetRemainAuthCount = 25;
        static final int TRANSACTION_sleReadData = 23;
        static final int TRANSACTION_sleReadMemoryProtectionStatus = 27;
        static final int TRANSACTION_sleWriteData = 24;
        static final int TRANSACTION_sleWriteProtectionMemory = 26;
        static final int TRANSACTION_smartCardExChangePASS = 16;
        static final int TRANSACTION_smartCardExChangePASSNoLength = 17;
        static final int TRANSACTION_smartCardExchange = 4;
        static final int TRANSACTION_smartCardIoControl = 49;
        static final int TRANSACTION_transmitApdu = 5;
        static final int TRANSACTION_transmitApduEx = 35;
        static final int TRANSACTION_transmitApduExx = 46;
        static final int TRANSACTION_transmitMultiApdus = 47;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ReadCardOptV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ReadCardOptV2)) {
                return (ReadCardOptV2) queryLocalInterface;
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
                    checkCard(parcel.readInt(), CheckCardCallbackV2.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    cancelCheckCard();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt = parcel.readInt();
                    ApduSendV2 createFromParcel = parcel.readInt() != 0 ? ApduSendV2.CREATOR.createFromParcel(parcel) : null;
                    ApduRecvV2 createFromParcel2 = parcel.readInt() != 0 ? ApduRecvV2.CREATOR.createFromParcel(parcel) : null;
                    int apduCommand = apduCommand(readInt, createFromParcel, createFromParcel2);
                    parcel2.writeNoException();
                    parcel2.writeInt(apduCommand);
                    if (createFromParcel2 != null) {
                        parcel2.writeInt(1);
                        createFromParcel2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt2 = parcel.readInt();
                    byte[] createByteArray = parcel.createByteArray();
                    byte[] createByteArray2 = parcel.createByteArray();
                    int smartCardExchange = smartCardExchange(readInt2, createByteArray, createByteArray2);
                    parcel2.writeNoException();
                    parcel2.writeInt(smartCardExchange);
                    parcel2.writeByteArray(createByteArray);
                    parcel2.writeByteArray(createByteArray2);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt3 = parcel.readInt();
                    byte[] createByteArray3 = parcel.createByteArray();
                    int readInt4 = parcel.readInt();
                    byte[] bArr = readInt4 >= 0 ? new byte[readInt4] : null;
                    int transmitApdu = transmitApdu(readInt3, createByteArray3, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(transmitApdu);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int cardOff = cardOff(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(cardOff);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int cardExistStatus = getCardExistStatus(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(cardExistStatus);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt5 = parcel.readInt();
                    int readInt6 = parcel.readInt();
                    byte[] createByteArray4 = parcel.createByteArray();
                    int mifareAuth = mifareAuth(readInt5, readInt6, createByteArray4);
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareAuth);
                    parcel2.writeByteArray(createByteArray4);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt7 = parcel.readInt();
                    byte[] createByteArray5 = parcel.createByteArray();
                    int mifareReadBlock = mifareReadBlock(readInt7, createByteArray5);
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareReadBlock);
                    parcel2.writeByteArray(createByteArray5);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int mifareWriteBlock = mifareWriteBlock(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareWriteBlock);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int mifareIncValue = mifareIncValue(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareIncValue);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    int mifareDecValue = mifareDecValue(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareDecValue);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int mifareUltralightCAuth = mifareUltralightCAuth(parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareUltralightCAuth);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt8 = parcel.readInt();
                    byte[] createByteArray6 = parcel.createByteArray();
                    int mifareUltralightCReadData = mifareUltralightCReadData(readInt8, createByteArray6);
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareUltralightCReadData);
                    parcel2.writeByteArray(createByteArray6);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    int mifareUltralightCWriteData = mifareUltralightCWriteData(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareUltralightCWriteData);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt9 = parcel.readInt();
                    byte[] createByteArray7 = parcel.createByteArray();
                    int readInt10 = parcel.readInt();
                    byte[] bArr2 = readInt10 >= 0 ? new byte[readInt10] : null;
                    int smartCardExChangePASS = smartCardExChangePASS(readInt9, createByteArray7, bArr2);
                    parcel2.writeNoException();
                    parcel2.writeInt(smartCardExChangePASS);
                    parcel2.writeByteArray(bArr2);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt11 = parcel.readInt();
                    byte[] createByteArray8 = parcel.createByteArray();
                    int readInt12 = parcel.readInt();
                    byte[] bArr3 = readInt12 >= 0 ? new byte[readInt12] : null;
                    int smartCardExChangePASSNoLength = smartCardExChangePASSNoLength(readInt11, createByteArray8, bArr3);
                    parcel2.writeNoException();
                    parcel2.writeInt(smartCardExChangePASSNoLength);
                    parcel2.writeByteArray(bArr3);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt13 = parcel.readInt();
                    byte[] createByteArray9 = parcel.createByteArray();
                    byte[] createByteArray10 = parcel.createByteArray();
                    int mifarePlusReadBlock = mifarePlusReadBlock(readInt13, createByteArray9, createByteArray10);
                    parcel2.writeNoException();
                    parcel2.writeInt(mifarePlusReadBlock);
                    parcel2.writeByteArray(createByteArray10);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    int mifarePlusWriteBlock = mifarePlusWriteBlock(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(mifarePlusWriteBlock);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    int mifarePlusChangeBlockKey = mifarePlusChangeBlockKey(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(mifarePlusChangeBlockKey);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sleAuthKey = sleAuthKey(parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(sleAuthKey);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sleChangeKey = sleChangeKey(parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(sleChangeKey);
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt14 = parcel.readInt();
                    int readInt15 = parcel.readInt();
                    byte[] createByteArray11 = parcel.createByteArray();
                    int sleReadData = sleReadData(readInt14, readInt15, createByteArray11);
                    parcel2.writeNoException();
                    parcel2.writeInt(sleReadData);
                    parcel2.writeByteArray(createByteArray11);
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sleWriteData = sleWriteData(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(sleWriteData);
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sleGetRemainAuthCount = sleGetRemainAuthCount();
                    parcel2.writeNoException();
                    parcel2.writeInt(sleGetRemainAuthCount);
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sleWriteProtectionMemory = sleWriteProtectionMemory(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(sleWriteProtectionMemory);
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt16 = parcel.readInt();
                    int readInt17 = parcel.readInt();
                    byte[] createByteArray12 = parcel.createByteArray();
                    int sleReadMemoryProtectionStatus = sleReadMemoryProtectionStatus(readInt16, readInt17, createByteArray12);
                    parcel2.writeNoException();
                    parcel2.writeInt(sleReadMemoryProtectionStatus);
                    parcel2.writeByteArray(createByteArray12);
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt18 = parcel.readInt();
                    int readInt19 = parcel.readInt();
                    byte[] createByteArray13 = parcel.createByteArray();
                    int at24cReadData = at24cReadData(readInt18, readInt19, createByteArray13);
                    parcel2.writeNoException();
                    parcel2.writeInt(at24cReadData);
                    parcel2.writeByteArray(createByteArray13);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    int at24cWriteData = at24cWriteData(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(at24cWriteData);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    int at88scAuthKey = at88scAuthKey(parcel.createByteArray(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(at88scAuthKey);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    int at88scChangeKey = at88scChangeKey(parcel.createByteArray(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(at88scChangeKey);
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt20 = parcel.readInt();
                    int readInt21 = parcel.readInt();
                    int readInt22 = parcel.readInt();
                    byte[] createByteArray14 = parcel.createByteArray();
                    int at88scReadData = at88scReadData(readInt20, readInt21, readInt22, createByteArray14);
                    parcel2.writeNoException();
                    parcel2.writeInt(at88scReadData);
                    parcel2.writeByteArray(createByteArray14);
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    int at88scWriteData = at88scWriteData(parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(at88scWriteData);
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    int at88scGetRemainAuthCount = at88scGetRemainAuthCount(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(at88scGetRemainAuthCount);
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt23 = parcel.readInt();
                    byte[] createByteArray15 = parcel.createByteArray();
                    int readInt24 = parcel.readInt();
                    byte[] bArr4 = readInt24 >= 0 ? new byte[readInt24] : null;
                    int transmitApduEx = transmitApduEx(readInt23, createByteArray15, bArr4);
                    parcel2.writeNoException();
                    parcel2.writeInt(transmitApduEx);
                    parcel2.writeByteArray(bArr4);
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt25 = parcel.readInt();
                    int readInt26 = parcel.readInt();
                    byte[] bArr5 = readInt26 >= 0 ? new byte[readInt26] : null;
                    int ctx512ReadBlock = ctx512ReadBlock(readInt25, bArr5);
                    parcel2.writeNoException();
                    parcel2.writeInt(ctx512ReadBlock);
                    parcel2.writeByteArray(bArr5);
                    return true;
                case 37:
                    parcel.enforceInterface(DESCRIPTOR);
                    int ctx512WriteBlock = ctx512WriteBlock(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(ctx512WriteBlock);
                    return true;
                case 38:
                    parcel.enforceInterface(DESCRIPTOR);
                    int ctx512UpdateBlock = ctx512UpdateBlock(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(ctx512UpdateBlock);
                    return true;
                case 39:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt27 = parcel.readInt();
                    byte[] createByteArray16 = parcel.createByteArray();
                    int readInt28 = parcel.readInt();
                    byte[] bArr6 = readInt28 >= 0 ? new byte[readInt28] : null;
                    int ctx512GetSignature = ctx512GetSignature(readInt27, createByteArray16, bArr6);
                    parcel2.writeNoException();
                    parcel2.writeInt(ctx512GetSignature);
                    parcel2.writeByteArray(bArr6);
                    return true;
                case 40:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt29 = parcel.readInt();
                    int readInt30 = parcel.readInt();
                    byte[] bArr7 = readInt30 >= 0 ? new byte[readInt30] : null;
                    int ctx512MultiReadBlock = ctx512MultiReadBlock(readInt29, bArr7);
                    parcel2.writeNoException();
                    parcel2.writeInt(ctx512MultiReadBlock);
                    parcel2.writeByteArray(bArr7);
                    return true;
                case 41:
                    parcel.enforceInterface(DESCRIPTOR);
                    int mifareIncValueDx = mifareIncValueDx(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareIncValueDx);
                    return true;
                case 42:
                    parcel.enforceInterface(DESCRIPTOR);
                    int mifareDecValueDx = mifareDecValueDx(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareDecValueDx);
                    return true;
                case 43:
                    parcel.enforceInterface(DESCRIPTOR);
                    int mifareTransfer = mifareTransfer(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareTransfer);
                    return true;
                case 44:
                    parcel.enforceInterface(DESCRIPTOR);
                    int mifareRestore = mifareRestore(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(mifareRestore);
                    return true;
                case 45:
                    parcel.enforceInterface(DESCRIPTOR);
                    checkCardEx(parcel.readInt(), parcel.readInt(), parcel.readInt(), CheckCardCallbackV2.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 46:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt31 = parcel.readInt();
                    int readInt32 = parcel.readInt();
                    byte[] createByteArray17 = parcel.createByteArray();
                    int readInt33 = parcel.readInt();
                    byte[] bArr8 = readInt33 >= 0 ? new byte[readInt33] : null;
                    int transmitApduExx = transmitApduExx(readInt31, readInt32, createByteArray17, bArr8);
                    parcel2.writeNoException();
                    parcel2.writeInt(transmitApduExx);
                    parcel2.writeByteArray(bArr8);
                    return true;
                case 47:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt34 = parcel.readInt();
                    int readInt35 = parcel.readInt();
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    ArrayList arrayList = new ArrayList();
                    int transmitMultiApdus = transmitMultiApdus(readInt34, readInt35, createStringArrayList, arrayList);
                    parcel2.writeNoException();
                    parcel2.writeInt(transmitMultiApdus);
                    parcel2.writeStringList(arrayList);
                    return true;
                case 48:
                    parcel.enforceInterface(DESCRIPTOR);
                    int checkCardEnc = checkCardEnc(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, CheckCardCallbackV2.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(checkCardEnc);
                    return true;
                case 49:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt36 = parcel.readInt();
                    int readInt37 = parcel.readInt();
                    byte[] createByteArray18 = parcel.createByteArray();
                    int readInt38 = parcel.readInt();
                    byte[] bArr9 = readInt38 >= 0 ? new byte[readInt38] : null;
                    int smartCardIoControl = smartCardIoControl(readInt36, readInt37, createByteArray18, bArr9);
                    parcel2.writeNoException();
                    parcel2.writeInt(smartCardIoControl);
                    parcel2.writeByteArray(bArr9);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements ReadCardOptV2 {
            public static ReadCardOptV2 sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public void checkCard(int i, CheckCardCallbackV2 checkCardCallbackV2, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(checkCardCallbackV2 != null ? checkCardCallbackV2.asBinder() : null);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().checkCard(i, checkCardCallbackV2, i2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public void cancelCheckCard() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancelCheckCard();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int apduCommand(int i, ApduSendV2 apduSendV2, ApduRecvV2 apduRecvV2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (apduSendV2 != null) {
                        obtain.writeInt(1);
                        apduSendV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (apduRecvV2 != null) {
                        obtain.writeInt(1);
                        apduRecvV2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().apduCommand(i, apduSendV2, apduRecvV2);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    if (obtain2.readInt() != 0) {
                        apduRecvV2.readFromParcel(obtain2);
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int transmitApdu(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().transmitApdu(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int cardOff(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().cardOff(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int getCardExistStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCardExistStatus(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareAuth(int i, int i2, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareReadBlock(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareWriteBlock(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareWriteBlock(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareIncValue(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareIncValue(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareDecValue(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareDecValue(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareUltralightCAuth(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareUltralightCAuth(bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareUltralightCReadData(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareUltralightCReadData(i, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareUltralightCWriteData(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareUltralightCWriteData(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
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
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
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
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifarePlusReadBlock(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifarePlusReadBlock(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifarePlusWriteBlock(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifarePlusWriteBlock(i, bArr, bArr2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifarePlusChangeBlockKey(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifarePlusChangeBlockKey(i, bArr, bArr2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int sleAuthKey(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sleAuthKey(bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int sleChangeKey(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(22, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sleChangeKey(bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int sleReadData(int i, int i2, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(23, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sleReadData(i, i2, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int sleWriteData(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(24, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sleWriteData(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int sleGetRemainAuthCount() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(25, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sleGetRemainAuthCount();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int sleWriteProtectionMemory(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(26, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sleWriteProtectionMemory(i, i2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int sleReadMemoryProtectionStatus(int i, int i2, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(27, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sleReadMemoryProtectionStatus(i, i2, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int at24cReadData(int i, int i2, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(28, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().at24cReadData(i, i2, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int at24cWriteData(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(29, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().at24cWriteData(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int at88scAuthKey(byte[] bArr, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(30, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().at88scAuthKey(bArr, i, i2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int at88scChangeKey(byte[] bArr, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(31, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().at88scChangeKey(bArr, i, i2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int at88scReadData(int i, int i2, int i3, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(32, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().at88scReadData(i, i2, i3, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int at88scWriteData(int i, int i2, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(33, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().at88scWriteData(i, i2, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int at88scGetRemainAuthCount(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(34, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().at88scGetRemainAuthCount(i, i2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int transmitApduEx(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(35, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().transmitApduEx(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int ctx512ReadBlock(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    if (!this.mRemote.transact(36, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().ctx512ReadBlock(i, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int ctx512WriteBlock(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(37, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().ctx512WriteBlock(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int ctx512UpdateBlock(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(38, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().ctx512UpdateBlock(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int ctx512GetSignature(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(39, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().ctx512GetSignature(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int ctx512MultiReadBlock(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    if (!this.mRemote.transact(40, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().ctx512MultiReadBlock(i, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareIncValueDx(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(41, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareIncValueDx(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareDecValueDx(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(42, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareDecValueDx(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareTransfer(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(43, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareTransfer(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int mifareRestore(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(44, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mifareRestore(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public void checkCardEx(int i, int i2, int i3, CheckCardCallbackV2 checkCardCallbackV2, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeStrongBinder(checkCardCallbackV2 != null ? checkCardCallbackV2.asBinder() : null);
                    obtain.writeInt(i4);
                    if (!this.mRemote.transact(45, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().checkCardEx(i, i2, i3, checkCardCallbackV2, i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int transmitApduExx(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(46, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().transmitApduExx(i, i2, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int transmitMultiApdus(int i, int i2, List<String> list, List<String> list2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStringList(list);
                    if (!this.mRemote.transact(47, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().transmitMultiApdus(i, i2, list, list2);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readStringList(list2);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int checkCardEnc(Bundle bundle, CheckCardCallbackV2 checkCardCallbackV2, int i) throws RemoteException {
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
                    obtain.writeStrongBinder(checkCardCallbackV2 != null ? checkCardCallbackV2.asBinder() : null);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(48, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkCardEnc(bundle, checkCardCallbackV2, i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
            public int smartCardIoControl(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(49, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().smartCardIoControl(i, i2, bArr, bArr2);
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

        public static boolean setDefaultImpl(ReadCardOptV2 readCardOptV2) {
            if (Proxy.sDefaultImpl != null || readCardOptV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = readCardOptV2;
            return true;
        }

        public static ReadCardOptV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
