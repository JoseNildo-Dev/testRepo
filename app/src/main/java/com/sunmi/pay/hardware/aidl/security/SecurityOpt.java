package com.sunmi.pay.hardware.aidl.security;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface SecurityOpt extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements SecurityOpt {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int calcMac(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int calcMacDukpt(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int calcSM4Mac(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int calcSecKey(int i, int i2, int i3, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int dataDecrypt(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int dataDecryptDukpt(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int dataEncrypt(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int dataEncryptDukpt(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int encryptDataBySM4Key(byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public String getAuthStatus(int i) throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int getEncryptTUSN(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int getSecStatus() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public String getTermStatus() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int getTerminalCertData(byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int readTerminalPuk(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int saveBaseKey(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int saveKey(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, boolean z) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int saveKeyDukpt(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, boolean z) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int saveTerminalKey(byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int setTermStatus() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int sm1DecryptData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int sm1EncryptData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int sm2DecryptData(byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int sm2EncryptData(byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int sm2SignData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int sm2VerifySign(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int sm3CalHash(byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int sm4DecryptData(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int sm4EncryptData(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int storeSM4Key(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int sysConfirmAuth(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int sysRequestAuth(byte b, int i, String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
        public int verifyApkSign(byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }
    }

    int calcMac(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException;

    int calcMacDukpt(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException;

    int calcSM4Mac(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws RemoteException;

    int calcSecKey(int i, int i2, int i3, byte[] bArr) throws RemoteException;

    int dataDecrypt(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int dataDecryptDukpt(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int dataEncrypt(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int dataEncryptDukpt(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int encryptDataBySM4Key(byte[] bArr, byte[] bArr2) throws RemoteException;

    String getAuthStatus(int i) throws RemoteException;

    int getEncryptTUSN(String str, byte[] bArr) throws RemoteException;

    int getSecStatus() throws RemoteException;

    String getTermStatus() throws RemoteException;

    int getTerminalCertData(byte[] bArr, byte[] bArr2) throws RemoteException;

    int readTerminalPuk(byte[] bArr) throws RemoteException;

    int saveBaseKey(int i, byte[] bArr) throws RemoteException;

    int saveKey(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, boolean z) throws RemoteException;

    int saveKeyDukpt(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, boolean z) throws RemoteException;

    int saveTerminalKey(byte[] bArr, byte[] bArr2) throws RemoteException;

    int setTermStatus() throws RemoteException;

    int sm1DecryptData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6) throws RemoteException;

    int sm1EncryptData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6) throws RemoteException;

    int sm2DecryptData(byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int sm2EncryptData(byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int sm2SignData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) throws RemoteException;

    int sm2VerifySign(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws RemoteException;

    int sm3CalHash(byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int sm4DecryptData(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) throws RemoteException;

    int sm4EncryptData(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) throws RemoteException;

    int storeSM4Key(byte[] bArr) throws RemoteException;

    int sysConfirmAuth(byte[] bArr) throws RemoteException;

    int sysRequestAuth(byte b, int i, String str, byte[] bArr) throws RemoteException;

    int verifyApkSign(byte[] bArr, byte[] bArr2) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements SecurityOpt {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.security.SecurityOpt";
        static final int TRANSACTION_calcMac = 3;
        static final int TRANSACTION_calcMacDukpt = 20;
        static final int TRANSACTION_calcSM4Mac = 33;
        static final int TRANSACTION_calcSecKey = 23;
        static final int TRANSACTION_dataDecrypt = 18;
        static final int TRANSACTION_dataDecryptDukpt = 22;
        static final int TRANSACTION_dataEncrypt = 2;
        static final int TRANSACTION_dataEncryptDukpt = 21;
        static final int TRANSACTION_encryptDataBySM4Key = 6;
        static final int TRANSACTION_getAuthStatus = 9;
        static final int TRANSACTION_getEncryptTUSN = 4;
        static final int TRANSACTION_getSecStatus = 7;
        static final int TRANSACTION_getTermStatus = 10;
        static final int TRANSACTION_getTerminalCertData = 16;
        static final int TRANSACTION_readTerminalPuk = 15;
        static final int TRANSACTION_saveBaseKey = 17;
        static final int TRANSACTION_saveKey = 1;
        static final int TRANSACTION_saveKeyDukpt = 19;
        static final int TRANSACTION_saveTerminalKey = 14;
        static final int TRANSACTION_setTermStatus = 11;
        static final int TRANSACTION_sm1DecryptData = 25;
        static final int TRANSACTION_sm1EncryptData = 24;
        static final int TRANSACTION_sm2DecryptData = 27;
        static final int TRANSACTION_sm2EncryptData = 26;
        static final int TRANSACTION_sm2SignData = 28;
        static final int TRANSACTION_sm2VerifySign = 29;
        static final int TRANSACTION_sm3CalHash = 30;
        static final int TRANSACTION_sm4DecryptData = 32;
        static final int TRANSACTION_sm4EncryptData = 31;
        static final int TRANSACTION_storeSM4Key = 5;
        static final int TRANSACTION_sysConfirmAuth = 13;
        static final int TRANSACTION_sysRequestAuth = 12;
        static final int TRANSACTION_verifyApkSign = 8;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static SecurityOpt asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof SecurityOpt)) {
                return (SecurityOpt) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            byte[] bArr;
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int saveKey = saveKey(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(saveKey);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt = parcel.readInt();
                    byte[] createByteArray = parcel.createByteArray();
                    int readInt2 = parcel.readInt();
                    bArr = readInt2 >= 0 ? new byte[readInt2] : null;
                    int dataEncrypt = dataEncrypt(readInt, createByteArray, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataEncrypt);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    byte[] createByteArray2 = parcel.createByteArray();
                    int readInt5 = parcel.readInt();
                    bArr = readInt5 >= 0 ? new byte[readInt5] : null;
                    int calcMac = calcMac(readInt3, readInt4, createByteArray2, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(calcMac);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString = parcel.readString();
                    int readInt6 = parcel.readInt();
                    bArr = readInt6 >= 0 ? new byte[readInt6] : null;
                    int encryptTUSN = getEncryptTUSN(readString, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(encryptTUSN);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int storeSM4Key = storeSM4Key(parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(storeSM4Key);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray3 = parcel.createByteArray();
                    int readInt7 = parcel.readInt();
                    bArr = readInt7 >= 0 ? new byte[readInt7] : null;
                    int encryptDataBySM4Key = encryptDataBySM4Key(createByteArray3, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(encryptDataBySM4Key);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int secStatus = getSecStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(secStatus);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int verifyApkSign = verifyApkSign(parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(verifyApkSign);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    String authStatus = getAuthStatus(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(authStatus);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    String termStatus = getTermStatus();
                    parcel2.writeNoException();
                    parcel2.writeString(termStatus);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int termStatus2 = setTermStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(termStatus2);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte readByte = parcel.readByte();
                    int readInt8 = parcel.readInt();
                    String readString2 = parcel.readString();
                    int readInt9 = parcel.readInt();
                    bArr = readInt9 >= 0 ? new byte[readInt9] : null;
                    int sysRequestAuth = sysRequestAuth(readByte, readInt8, readString2, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(sysRequestAuth);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sysConfirmAuth = sysConfirmAuth(parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(sysConfirmAuth);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    int saveTerminalKey = saveTerminalKey(parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(saveTerminalKey);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt10 = parcel.readInt();
                    bArr = readInt10 >= 0 ? new byte[readInt10] : null;
                    int readTerminalPuk = readTerminalPuk(bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(readTerminalPuk);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray4 = parcel.createByteArray();
                    int readInt11 = parcel.readInt();
                    bArr = readInt11 >= 0 ? new byte[readInt11] : null;
                    int terminalCertData = getTerminalCertData(createByteArray4, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(terminalCertData);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    int saveBaseKey = saveBaseKey(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(saveBaseKey);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt12 = parcel.readInt();
                    byte[] createByteArray5 = parcel.createByteArray();
                    int readInt13 = parcel.readInt();
                    bArr = readInt13 >= 0 ? new byte[readInt13] : null;
                    int dataDecrypt = dataDecrypt(readInt12, createByteArray5, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataDecrypt);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    int saveKeyDukpt = saveKeyDukpt(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(saveKeyDukpt);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt14 = parcel.readInt();
                    int readInt15 = parcel.readInt();
                    byte[] createByteArray6 = parcel.createByteArray();
                    int readInt16 = parcel.readInt();
                    bArr = readInt16 >= 0 ? new byte[readInt16] : null;
                    int calcMacDukpt = calcMacDukpt(readInt14, readInt15, createByteArray6, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(calcMacDukpt);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt17 = parcel.readInt();
                    byte[] createByteArray7 = parcel.createByteArray();
                    int readInt18 = parcel.readInt();
                    bArr = readInt18 >= 0 ? new byte[readInt18] : null;
                    int dataEncryptDukpt = dataEncryptDukpt(readInt17, createByteArray7, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataEncryptDukpt);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt19 = parcel.readInt();
                    byte[] createByteArray8 = parcel.createByteArray();
                    int readInt20 = parcel.readInt();
                    bArr = readInt20 >= 0 ? new byte[readInt20] : null;
                    int dataDecryptDukpt = dataDecryptDukpt(readInt19, createByteArray8, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataDecryptDukpt);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt21 = parcel.readInt();
                    int readInt22 = parcel.readInt();
                    int readInt23 = parcel.readInt();
                    int readInt24 = parcel.readInt();
                    bArr = readInt24 >= 0 ? new byte[readInt24] : null;
                    int calcSecKey = calcSecKey(readInt21, readInt22, readInt23, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(calcSecKey);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray9 = parcel.createByteArray();
                    byte[] createByteArray10 = parcel.createByteArray();
                    byte[] createByteArray11 = parcel.createByteArray();
                    byte[] createByteArray12 = parcel.createByteArray();
                    int readInt25 = parcel.readInt();
                    byte[] createByteArray13 = parcel.createByteArray();
                    int readInt26 = parcel.readInt();
                    byte[] bArr2 = readInt26 < 0 ? null : new byte[readInt26];
                    int sm1EncryptData = sm1EncryptData(createByteArray9, createByteArray10, createByteArray11, createByteArray12, readInt25, createByteArray13, bArr2);
                    parcel2.writeNoException();
                    parcel2.writeInt(sm1EncryptData);
                    parcel2.writeByteArray(bArr2);
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray14 = parcel.createByteArray();
                    byte[] createByteArray15 = parcel.createByteArray();
                    byte[] createByteArray16 = parcel.createByteArray();
                    byte[] createByteArray17 = parcel.createByteArray();
                    int readInt27 = parcel.readInt();
                    byte[] createByteArray18 = parcel.createByteArray();
                    int readInt28 = parcel.readInt();
                    byte[] bArr3 = readInt28 < 0 ? null : new byte[readInt28];
                    int sm1DecryptData = sm1DecryptData(createByteArray14, createByteArray15, createByteArray16, createByteArray17, readInt27, createByteArray18, bArr3);
                    parcel2.writeNoException();
                    parcel2.writeInt(sm1DecryptData);
                    parcel2.writeByteArray(bArr3);
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray19 = parcel.createByteArray();
                    byte[] createByteArray20 = parcel.createByteArray();
                    int readInt29 = parcel.readInt();
                    bArr = readInt29 >= 0 ? new byte[readInt29] : null;
                    int sm2EncryptData = sm2EncryptData(createByteArray19, createByteArray20, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(sm2EncryptData);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray21 = parcel.createByteArray();
                    byte[] createByteArray22 = parcel.createByteArray();
                    int readInt30 = parcel.readInt();
                    bArr = readInt30 >= 0 ? new byte[readInt30] : null;
                    int sm2DecryptData = sm2DecryptData(createByteArray21, createByteArray22, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(sm2DecryptData);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray23 = parcel.createByteArray();
                    byte[] createByteArray24 = parcel.createByteArray();
                    byte[] createByteArray25 = parcel.createByteArray();
                    byte[] createByteArray26 = parcel.createByteArray();
                    int readInt31 = parcel.readInt();
                    byte[] bArr4 = readInt31 < 0 ? null : new byte[readInt31];
                    int readInt32 = parcel.readInt();
                    byte[] bArr5 = readInt32 < 0 ? null : new byte[readInt32];
                    int sm2SignData = sm2SignData(createByteArray23, createByteArray24, createByteArray25, createByteArray26, bArr4, bArr5);
                    parcel2.writeNoException();
                    parcel2.writeInt(sm2SignData);
                    parcel2.writeByteArray(bArr4);
                    parcel2.writeByteArray(bArr5);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sm2VerifySign = sm2VerifySign(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(sm2VerifySign);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray27 = parcel.createByteArray();
                    byte[] createByteArray28 = parcel.createByteArray();
                    int readInt33 = parcel.readInt();
                    bArr = readInt33 >= 0 ? new byte[readInt33] : null;
                    int sm3CalHash = sm3CalHash(createByteArray27, createByteArray28, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(sm3CalHash);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray29 = parcel.createByteArray();
                    byte[] createByteArray30 = parcel.createByteArray();
                    int readInt34 = parcel.readInt();
                    byte[] createByteArray31 = parcel.createByteArray();
                    int readInt35 = parcel.readInt();
                    byte[] bArr6 = readInt35 < 0 ? null : new byte[readInt35];
                    int sm4EncryptData = sm4EncryptData(createByteArray29, createByteArray30, readInt34, createByteArray31, bArr6);
                    parcel2.writeNoException();
                    parcel2.writeInt(sm4EncryptData);
                    parcel2.writeByteArray(bArr6);
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray32 = parcel.createByteArray();
                    byte[] createByteArray33 = parcel.createByteArray();
                    int readInt36 = parcel.readInt();
                    byte[] createByteArray34 = parcel.createByteArray();
                    int readInt37 = parcel.readInt();
                    byte[] bArr7 = readInt37 < 0 ? null : new byte[readInt37];
                    int sm4DecryptData = sm4DecryptData(createByteArray32, createByteArray33, readInt36, createByteArray34, bArr7);
                    parcel2.writeNoException();
                    parcel2.writeInt(sm4DecryptData);
                    parcel2.writeByteArray(bArr7);
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray35 = parcel.createByteArray();
                    byte[] createByteArray36 = parcel.createByteArray();
                    byte[] createByteArray37 = parcel.createByteArray();
                    int readInt38 = parcel.readInt();
                    bArr = readInt38 >= 0 ? new byte[readInt38] : null;
                    int calcSM4Mac = calcSM4Mac(createByteArray35, createByteArray36, createByteArray37, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(calcSM4Mac);
                    parcel2.writeByteArray(bArr);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements SecurityOpt {
            public static SecurityOpt sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int saveKey(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(z ? 1 : 0);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int saveKey = Stub.getDefaultImpl().saveKey(i, bArr, bArr2, i2, i3, i4, z);
                        obtain2.recycle();
                        obtain.recycle();
                        return saveKey;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int dataEncrypt(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dataEncrypt(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int calcMac(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().calcMac(i, i2, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int getEncryptTUSN(String str, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getEncryptTUSN(str, bArr);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int storeSM4Key(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().storeSM4Key(bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int encryptDataBySM4Key(byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().encryptDataBySM4Key(bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int getSecStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSecStatus();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int verifyApkSign(byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().verifyApkSign(bArr, bArr2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public String getAuthStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAuthStatus(i);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public String getTermStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTermStatus();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int setTermStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setTermStatus();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int sysRequestAuth(byte b, int i, String str, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByte(b);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sysRequestAuth(b, i, str, bArr);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int sysConfirmAuth(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sysConfirmAuth(bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int saveTerminalKey(byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().saveTerminalKey(bArr, bArr2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int readTerminalPuk(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().readTerminalPuk(bArr);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int getTerminalCertData(byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTerminalCertData(bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int saveBaseKey(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().saveBaseKey(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int dataDecrypt(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dataDecrypt(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int saveKeyDukpt(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(z ? 1 : 0);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int saveKeyDukpt = Stub.getDefaultImpl().saveKeyDukpt(bArr, bArr2, bArr3, i, i2, i3, z);
                        obtain2.recycle();
                        obtain.recycle();
                        return saveKeyDukpt;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int calcMacDukpt(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().calcMacDukpt(i, i2, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int dataEncryptDukpt(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dataEncryptDukpt(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int dataDecryptDukpt(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(22, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dataDecryptDukpt(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int calcSecKey(int i, int i2, int i3, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    if (!this.mRemote.transact(23, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().calcSecKey(i, i2, i3, bArr);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int sm1EncryptData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    obtain.writeByteArray(bArr4);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr5);
                    if (bArr6 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr6.length);
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(24, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int sm1EncryptData = Stub.getDefaultImpl().sm1EncryptData(bArr, bArr2, bArr3, bArr4, i, bArr5, bArr6);
                        obtain2.recycle();
                        obtain.recycle();
                        return sm1EncryptData;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr6);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int sm1DecryptData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    obtain.writeByteArray(bArr4);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr5);
                    if (bArr6 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr6.length);
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(25, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int sm1DecryptData = Stub.getDefaultImpl().sm1DecryptData(bArr, bArr2, bArr3, bArr4, i, bArr5, bArr6);
                        obtain2.recycle();
                        obtain.recycle();
                        return sm1DecryptData;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr6);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int sm2EncryptData(byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                    if (!this.mRemote.transact(26, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sm2EncryptData(bArr, bArr2, bArr3);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr3);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int sm2DecryptData(byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                    if (!this.mRemote.transact(27, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sm2DecryptData(bArr, bArr2, bArr3);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr3);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int sm2SignData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    obtain.writeByteArray(bArr4);
                    if (bArr5 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr5.length);
                    }
                    if (bArr6 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr6.length);
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(28, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int sm2SignData = Stub.getDefaultImpl().sm2SignData(bArr, bArr2, bArr3, bArr4, bArr5, bArr6);
                        obtain2.recycle();
                        obtain.recycle();
                        return sm2SignData;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr5);
                    obtain2.readByteArray(bArr6);
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

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int sm2VerifySign(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    obtain.writeByteArray(bArr4);
                    obtain.writeByteArray(bArr5);
                    if (!this.mRemote.transact(29, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sm2VerifySign(bArr, bArr2, bArr3, bArr4, bArr5);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int sm3CalHash(byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                    if (!this.mRemote.transact(30, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sm3CalHash(bArr, bArr2, bArr3);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr3);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int sm4EncryptData(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr3);
                    if (bArr4 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr4.length);
                    }
                    if (!this.mRemote.transact(31, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sm4EncryptData(bArr, bArr2, i, bArr3, bArr4);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr4);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int sm4DecryptData(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr3);
                    if (bArr4 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr4.length);
                    }
                    if (!this.mRemote.transact(32, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sm4DecryptData(bArr, bArr2, i, bArr3, bArr4);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr4);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidl.security.SecurityOpt
            public int calcSM4Mac(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    if (bArr4 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr4.length);
                    }
                    if (!this.mRemote.transact(33, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().calcSM4Mac(bArr, bArr2, bArr3, bArr4);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr4);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(SecurityOpt securityOpt) {
            if (Proxy.sDefaultImpl != null || securityOpt == null) {
                return false;
            }
            Proxy.sDefaultImpl = securityOpt;
            return true;
        }

        public static SecurityOpt getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
