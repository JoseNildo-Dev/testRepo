package com.sunmi.pay.hardware.aidlv2.security;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface SecurityOptV2 extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements SecurityOptV2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int calcMac(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int calcMacDukpt(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int calcMacDukptEx(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int calcMacEx(int i, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int calcSecHash(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int dataDecrypt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int dataDecryptDukpt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int dataDecryptDukptEx(int i, int i2, byte[] bArr, int i3, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int dataDecryptRSA(String str, int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int dataEncrypt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int dataEncryptDukpt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int dataEncryptDukptEx(int i, int i2, byte[] bArr, int i3, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int dataEncryptRSA(String str, int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int deleteKey(int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int deleteKeyEx(Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int devicePrivateKeyRecover(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int dukptCurrentKSN(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int dukptGetInitKSN(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int dukptIncreaseKSN(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int encryptDataBySM4Key(byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int generateRSAKeypair(int i, int i2, String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int generateRSAKeys(int i, int i2, int i3, String str) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int generateSM2Keypair(int i, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int generateSymKey(int i, int i2, int i3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public String getAuthStatus(int i) throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int getCertificate(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int getDeviceCertificate(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int getKeyCheckValue(int i, int i2, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int getKeyCheckValueEx(Bundle bundle, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int getRSAPrivateKey(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int getRSAPublicKey(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int getSecStatus() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int getTUSNEncryptData(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public String getTermStatus() throws RemoteException {
            return null;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int getTerminalCertData(byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int hsmAsymKeyFun(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int hsmCombineKeyShare(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int hsmDestroyKey(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int hsmExchangeKeyEcc(int i, String str, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int hsmExportKeyUnderKEK(int i, int i2, int i3, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int hsmExportTR31KeyBlock(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int hsmGenerateRSAKeypair(int i, int i2, String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int hsmInjectRSAKey(int i, int i2, String str, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int hsmSaveKeyShare(int i, byte[] bArr, byte[] bArr2, int i2, int i3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int hsmSaveKeyShareDukpt(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int hsmSaveKeyUnderKEK(int i, byte[] bArr, int i2, int i3, int i4, int i5) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int injectCiphertextKey(String str, int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int injectCiphertextKeyEx(Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int injectKeyDukptEx(Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int injectPlaintextKey(String str, int i, byte[] bArr, byte[] bArr2, int i2, int i3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int injectRSAKey(int i, int i2, String str, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int injectSM2Key(int i, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int injectSymKey(int i, int i2, byte[] bArr, byte[] bArr2, int i3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int operateSensitiveService(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int readTerminalPuk(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int removeRSAKey(int i) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int rsaEncryptOrDecryptData(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int saveBaseKey(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int saveCiphertextKey(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int saveCiphertextKeyRSA(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, String str) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int saveKeyDukpt(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int saveKeyDukptAES(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int savePlaintextKey(int i, byte[] bArr, byte[] bArr2, int i2, int i3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int saveRSAKey(int i, byte[] bArr, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int saveTR31Key(byte[] bArr, int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int saveTerminalKey(byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int setTermStatus() throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int signingRSA(String str, int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int sm2DecryptData(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int sm2EncryptData(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int sm2Sign(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int sm2VerifySign(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int storeCertificate(int i, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int storeDeviceCertPrivateKey(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int storeSM4Key(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int sysConfirmAuth(byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int sysRequestAuth(byte b, int i, String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int verifyApkSign(byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int verifyMac(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int verifyMacDukptEx(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException {
            return 0;
        }

        @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
        public int verifySignatureRSA(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
            return 0;
        }
    }

    int calcMac(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException;

    int calcMacDukpt(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException;

    int calcMacDukptEx(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException;

    int calcMacEx(int i, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int calcSecHash(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int dataDecrypt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int dataDecryptDukpt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int dataDecryptDukptEx(int i, int i2, byte[] bArr, int i3, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int dataDecryptRSA(String str, int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int dataEncrypt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int dataEncryptDukpt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int dataEncryptDukptEx(int i, int i2, byte[] bArr, int i3, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int dataEncryptRSA(String str, int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int deleteKey(int i, int i2) throws RemoteException;

    int deleteKeyEx(Bundle bundle) throws RemoteException;

    int devicePrivateKeyRecover(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException;

    int dukptCurrentKSN(int i, byte[] bArr) throws RemoteException;

    int dukptGetInitKSN(byte[] bArr) throws RemoteException;

    int dukptIncreaseKSN(int i) throws RemoteException;

    int encryptDataBySM4Key(byte[] bArr, byte[] bArr2) throws RemoteException;

    int generateRSAKeypair(int i, int i2, String str, byte[] bArr) throws RemoteException;

    int generateRSAKeys(int i, int i2, int i3, String str) throws RemoteException;

    int generateSM2Keypair(int i, Bundle bundle) throws RemoteException;

    int generateSymKey(int i, int i2, int i3) throws RemoteException;

    String getAuthStatus(int i) throws RemoteException;

    int getCertificate(int i, byte[] bArr) throws RemoteException;

    int getDeviceCertificate(int i, byte[] bArr) throws RemoteException;

    int getKeyCheckValue(int i, int i2, byte[] bArr) throws RemoteException;

    int getKeyCheckValueEx(Bundle bundle, byte[] bArr) throws RemoteException;

    int getRSAPrivateKey(int i, byte[] bArr) throws RemoteException;

    int getRSAPublicKey(int i, byte[] bArr) throws RemoteException;

    int getSecStatus() throws RemoteException;

    int getTUSNEncryptData(String str, byte[] bArr) throws RemoteException;

    String getTermStatus() throws RemoteException;

    int getTerminalCertData(byte[] bArr, byte[] bArr2) throws RemoteException;

    int hsmAsymKeyFun(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException;

    int hsmCombineKeyShare(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) throws RemoteException;

    int hsmDestroyKey(int i) throws RemoteException;

    int hsmExchangeKeyEcc(int i, String str, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int hsmExportKeyUnderKEK(int i, int i2, int i3, byte[] bArr) throws RemoteException;

    int hsmExportTR31KeyBlock(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException;

    int hsmGenerateRSAKeypair(int i, int i2, String str, byte[] bArr) throws RemoteException;

    int hsmInjectRSAKey(int i, int i2, String str, String str2) throws RemoteException;

    int hsmSaveKeyShare(int i, byte[] bArr, byte[] bArr2, int i2, int i3) throws RemoteException;

    int hsmSaveKeyShareDukpt(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) throws RemoteException;

    int hsmSaveKeyUnderKEK(int i, byte[] bArr, int i2, int i3, int i4, int i5) throws RemoteException;

    int injectCiphertextKey(String str, int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) throws RemoteException;

    int injectCiphertextKeyEx(Bundle bundle) throws RemoteException;

    int injectKeyDukptEx(Bundle bundle) throws RemoteException;

    int injectPlaintextKey(String str, int i, byte[] bArr, byte[] bArr2, int i2, int i3) throws RemoteException;

    int injectRSAKey(int i, int i2, String str, String str2) throws RemoteException;

    int injectSM2Key(int i, Bundle bundle) throws RemoteException;

    int injectSymKey(int i, int i2, byte[] bArr, byte[] bArr2, int i3) throws RemoteException;

    int operateSensitiveService(int i, byte[] bArr) throws RemoteException;

    int readTerminalPuk(byte[] bArr) throws RemoteException;

    int removeRSAKey(int i) throws RemoteException;

    int rsaEncryptOrDecryptData(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException;

    int saveBaseKey(int i, byte[] bArr) throws RemoteException;

    int saveCiphertextKey(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) throws RemoteException;

    int saveCiphertextKeyRSA(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, String str) throws RemoteException;

    int saveKeyDukpt(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3) throws RemoteException;

    int saveKeyDukptAES(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) throws RemoteException;

    int savePlaintextKey(int i, byte[] bArr, byte[] bArr2, int i2, int i3) throws RemoteException;

    int saveRSAKey(int i, byte[] bArr, int i2) throws RemoteException;

    int saveTR31Key(byte[] bArr, int i, int i2) throws RemoteException;

    int saveTerminalKey(byte[] bArr, byte[] bArr2) throws RemoteException;

    int setTermStatus() throws RemoteException;

    int signingRSA(String str, int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int sm2DecryptData(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int sm2EncryptData(int i, byte[] bArr, byte[] bArr2) throws RemoteException;

    int sm2Sign(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int sm2VerifySign(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException;

    int storeCertificate(int i, byte[] bArr) throws RemoteException;

    int storeDeviceCertPrivateKey(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException;

    int storeSM4Key(byte[] bArr) throws RemoteException;

    int sysConfirmAuth(byte[] bArr) throws RemoteException;

    int sysRequestAuth(byte b, int i, String str, byte[] bArr) throws RemoteException;

    int verifyApkSign(byte[] bArr, byte[] bArr2) throws RemoteException;

    int verifyMac(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException;

    int verifyMacDukptEx(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException;

    int verifySignatureRSA(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements SecurityOptV2 {
        private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2";
        static final int TRANSACTION_calcMac = 4;
        static final int TRANSACTION_calcMacDukpt = 8;
        static final int TRANSACTION_calcMacDukptEx = 42;
        static final int TRANSACTION_calcMacEx = 49;
        static final int TRANSACTION_calcSecHash = 56;
        static final int TRANSACTION_dataDecrypt = 6;
        static final int TRANSACTION_dataDecryptDukpt = 10;
        static final int TRANSACTION_dataDecryptDukptEx = 41;
        static final int TRANSACTION_dataDecryptRSA = 31;
        static final int TRANSACTION_dataEncrypt = 5;
        static final int TRANSACTION_dataEncryptDukpt = 9;
        static final int TRANSACTION_dataEncryptDukptEx = 40;
        static final int TRANSACTION_dataEncryptRSA = 30;
        static final int TRANSACTION_deleteKey = 47;
        static final int TRANSACTION_deleteKeyEx = 79;
        static final int TRANSACTION_devicePrivateKeyRecover = 77;
        static final int TRANSACTION_dukptCurrentKSN = 12;
        static final int TRANSACTION_dukptGetInitKSN = 35;
        static final int TRANSACTION_dukptIncreaseKSN = 11;
        static final int TRANSACTION_encryptDataBySM4Key = 16;
        static final int TRANSACTION_generateRSAKeypair = 58;
        static final int TRANSACTION_generateRSAKeys = 27;
        static final int TRANSACTION_generateSM2Keypair = 50;
        static final int TRANSACTION_generateSymKey = 60;
        static final int TRANSACTION_getAuthStatus = 19;
        static final int TRANSACTION_getCertificate = 34;
        static final int TRANSACTION_getDeviceCertificate = 76;
        static final int TRANSACTION_getKeyCheckValue = 13;
        static final int TRANSACTION_getKeyCheckValueEx = 78;
        static final int TRANSACTION_getRSAPrivateKey = 29;
        static final int TRANSACTION_getRSAPublicKey = 28;
        static final int TRANSACTION_getSecStatus = 17;
        static final int TRANSACTION_getTUSNEncryptData = 14;
        static final int TRANSACTION_getTermStatus = 20;
        static final int TRANSACTION_getTerminalCertData = 26;
        static final int TRANSACTION_hsmAsymKeyFun = 72;
        static final int TRANSACTION_hsmCombineKeyShare = 64;
        static final int TRANSACTION_hsmDestroyKey = 70;
        static final int TRANSACTION_hsmExchangeKeyEcc = 71;
        static final int TRANSACTION_hsmExportKeyUnderKEK = 68;
        static final int TRANSACTION_hsmExportTR31KeyBlock = 69;
        static final int TRANSACTION_hsmGenerateRSAKeypair = 65;
        static final int TRANSACTION_hsmInjectRSAKey = 66;
        static final int TRANSACTION_hsmSaveKeyShare = 62;
        static final int TRANSACTION_hsmSaveKeyShareDukpt = 63;
        static final int TRANSACTION_hsmSaveKeyUnderKEK = 67;
        static final int TRANSACTION_injectCiphertextKey = 39;
        static final int TRANSACTION_injectCiphertextKeyEx = 80;
        static final int TRANSACTION_injectKeyDukptEx = 81;
        static final int TRANSACTION_injectPlaintextKey = 38;
        static final int TRANSACTION_injectRSAKey = 59;
        static final int TRANSACTION_injectSM2Key = 51;
        static final int TRANSACTION_injectSymKey = 61;
        static final int TRANSACTION_operateSensitiveService = 73;
        static final int TRANSACTION_readTerminalPuk = 25;
        static final int TRANSACTION_removeRSAKey = 32;
        static final int TRANSACTION_rsaEncryptOrDecryptData = 74;
        static final int TRANSACTION_saveBaseKey = 1;
        static final int TRANSACTION_saveCiphertextKey = 3;
        static final int TRANSACTION_saveCiphertextKeyRSA = 45;
        static final int TRANSACTION_saveKeyDukpt = 7;
        static final int TRANSACTION_saveKeyDukptAES = 48;
        static final int TRANSACTION_savePlaintextKey = 2;
        static final int TRANSACTION_saveRSAKey = 46;
        static final int TRANSACTION_saveTR31Key = 44;
        static final int TRANSACTION_saveTerminalKey = 24;
        static final int TRANSACTION_setTermStatus = 21;
        static final int TRANSACTION_signingRSA = 36;
        static final int TRANSACTION_sm2DecryptData = 55;
        static final int TRANSACTION_sm2EncryptData = 54;
        static final int TRANSACTION_sm2Sign = 52;
        static final int TRANSACTION_sm2VerifySign = 53;
        static final int TRANSACTION_storeCertificate = 33;
        static final int TRANSACTION_storeDeviceCertPrivateKey = 75;
        static final int TRANSACTION_storeSM4Key = 15;
        static final int TRANSACTION_sysConfirmAuth = 23;
        static final int TRANSACTION_sysRequestAuth = 22;
        static final int TRANSACTION_verifyApkSign = 18;
        static final int TRANSACTION_verifyMac = 57;
        static final int TRANSACTION_verifyMacDukptEx = 43;
        static final int TRANSACTION_verifySignatureRSA = 37;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static SecurityOptV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof SecurityOptV2)) {
                return (SecurityOptV2) queryLocalInterface;
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
                    int saveBaseKey = saveBaseKey(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(saveBaseKey);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int savePlaintextKey = savePlaintextKey(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(savePlaintextKey);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int saveCiphertextKey = saveCiphertextKey(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(saveCiphertextKey);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    byte[] createByteArray = parcel.createByteArray();
                    int readInt3 = parcel.readInt();
                    byte[] bArr = readInt3 >= 0 ? new byte[readInt3] : null;
                    int calcMac = calcMac(readInt, readInt2, createByteArray, bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(calcMac);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt4 = parcel.readInt();
                    byte[] createByteArray2 = parcel.createByteArray();
                    int readInt5 = parcel.readInt();
                    byte[] createByteArray3 = parcel.createByteArray();
                    int readInt6 = parcel.readInt();
                    byte[] bArr2 = readInt6 >= 0 ? new byte[readInt6] : null;
                    int dataEncrypt = dataEncrypt(readInt4, createByteArray2, readInt5, createByteArray3, bArr2);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataEncrypt);
                    parcel2.writeByteArray(bArr2);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt7 = parcel.readInt();
                    byte[] createByteArray4 = parcel.createByteArray();
                    int readInt8 = parcel.readInt();
                    byte[] createByteArray5 = parcel.createByteArray();
                    int readInt9 = parcel.readInt();
                    byte[] bArr3 = readInt9 >= 0 ? new byte[readInt9] : null;
                    int dataDecrypt = dataDecrypt(readInt7, createByteArray4, readInt8, createByteArray5, bArr3);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataDecrypt);
                    parcel2.writeByteArray(bArr3);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int saveKeyDukpt = saveKeyDukpt(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(saveKeyDukpt);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt10 = parcel.readInt();
                    int readInt11 = parcel.readInt();
                    byte[] createByteArray6 = parcel.createByteArray();
                    int readInt12 = parcel.readInt();
                    byte[] bArr4 = readInt12 >= 0 ? new byte[readInt12] : null;
                    int calcMacDukpt = calcMacDukpt(readInt10, readInt11, createByteArray6, bArr4);
                    parcel2.writeNoException();
                    parcel2.writeInt(calcMacDukpt);
                    parcel2.writeByteArray(bArr4);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt13 = parcel.readInt();
                    byte[] createByteArray7 = parcel.createByteArray();
                    int readInt14 = parcel.readInt();
                    byte[] createByteArray8 = parcel.createByteArray();
                    int readInt15 = parcel.readInt();
                    byte[] bArr5 = readInt15 >= 0 ? new byte[readInt15] : null;
                    int dataEncryptDukpt = dataEncryptDukpt(readInt13, createByteArray7, readInt14, createByteArray8, bArr5);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataEncryptDukpt);
                    parcel2.writeByteArray(bArr5);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt16 = parcel.readInt();
                    byte[] createByteArray9 = parcel.createByteArray();
                    int readInt17 = parcel.readInt();
                    byte[] createByteArray10 = parcel.createByteArray();
                    int readInt18 = parcel.readInt();
                    byte[] bArr6 = readInt18 >= 0 ? new byte[readInt18] : null;
                    int dataDecryptDukpt = dataDecryptDukpt(readInt16, createByteArray9, readInt17, createByteArray10, bArr6);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataDecryptDukpt);
                    parcel2.writeByteArray(bArr6);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int dukptIncreaseKSN = dukptIncreaseKSN(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(dukptIncreaseKSN);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt19 = parcel.readInt();
                    int readInt20 = parcel.readInt();
                    byte[] bArr7 = readInt20 >= 0 ? new byte[readInt20] : null;
                    int dukptCurrentKSN = dukptCurrentKSN(readInt19, bArr7);
                    parcel2.writeNoException();
                    parcel2.writeInt(dukptCurrentKSN);
                    parcel2.writeByteArray(bArr7);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt21 = parcel.readInt();
                    int readInt22 = parcel.readInt();
                    int readInt23 = parcel.readInt();
                    byte[] bArr8 = readInt23 >= 0 ? new byte[readInt23] : null;
                    int keyCheckValue = getKeyCheckValue(readInt21, readInt22, bArr8);
                    parcel2.writeNoException();
                    parcel2.writeInt(keyCheckValue);
                    parcel2.writeByteArray(bArr8);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString = parcel.readString();
                    int readInt24 = parcel.readInt();
                    byte[] bArr9 = readInt24 >= 0 ? new byte[readInt24] : null;
                    int tUSNEncryptData = getTUSNEncryptData(readString, bArr9);
                    parcel2.writeNoException();
                    parcel2.writeInt(tUSNEncryptData);
                    parcel2.writeByteArray(bArr9);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    int storeSM4Key = storeSM4Key(parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(storeSM4Key);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray11 = parcel.createByteArray();
                    int readInt25 = parcel.readInt();
                    byte[] bArr10 = readInt25 >= 0 ? new byte[readInt25] : null;
                    int encryptDataBySM4Key = encryptDataBySM4Key(createByteArray11, bArr10);
                    parcel2.writeNoException();
                    parcel2.writeInt(encryptDataBySM4Key);
                    parcel2.writeByteArray(bArr10);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    int secStatus = getSecStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(secStatus);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    int verifyApkSign = verifyApkSign(parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(verifyApkSign);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    String authStatus = getAuthStatus(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(authStatus);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    String termStatus = getTermStatus();
                    parcel2.writeNoException();
                    parcel2.writeString(termStatus);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    int termStatus2 = setTermStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(termStatus2);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte readByte = parcel.readByte();
                    int readInt26 = parcel.readInt();
                    String readString2 = parcel.readString();
                    int readInt27 = parcel.readInt();
                    byte[] bArr11 = readInt27 >= 0 ? new byte[readInt27] : null;
                    int sysRequestAuth = sysRequestAuth(readByte, readInt26, readString2, bArr11);
                    parcel2.writeNoException();
                    parcel2.writeInt(sysRequestAuth);
                    parcel2.writeByteArray(bArr11);
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sysConfirmAuth = sysConfirmAuth(parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(sysConfirmAuth);
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    int saveTerminalKey = saveTerminalKey(parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(saveTerminalKey);
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt28 = parcel.readInt();
                    byte[] bArr12 = readInt28 >= 0 ? new byte[readInt28] : null;
                    int readTerminalPuk = readTerminalPuk(bArr12);
                    parcel2.writeNoException();
                    parcel2.writeInt(readTerminalPuk);
                    parcel2.writeByteArray(bArr12);
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray12 = parcel.createByteArray();
                    int readInt29 = parcel.readInt();
                    byte[] bArr13 = readInt29 >= 0 ? new byte[readInt29] : null;
                    int terminalCertData = getTerminalCertData(createByteArray12, bArr13);
                    parcel2.writeNoException();
                    parcel2.writeInt(terminalCertData);
                    parcel2.writeByteArray(bArr13);
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    int generateRSAKeys = generateRSAKeys(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(generateRSAKeys);
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt30 = parcel.readInt();
                    int readInt31 = parcel.readInt();
                    byte[] bArr14 = readInt31 >= 0 ? new byte[readInt31] : null;
                    int rSAPublicKey = getRSAPublicKey(readInt30, bArr14);
                    parcel2.writeNoException();
                    parcel2.writeInt(rSAPublicKey);
                    parcel2.writeByteArray(bArr14);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt32 = parcel.readInt();
                    int readInt33 = parcel.readInt();
                    byte[] bArr15 = readInt33 >= 0 ? new byte[readInt33] : null;
                    int rSAPrivateKey = getRSAPrivateKey(readInt32, bArr15);
                    parcel2.writeNoException();
                    parcel2.writeInt(rSAPrivateKey);
                    parcel2.writeByteArray(bArr15);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString3 = parcel.readString();
                    int readInt34 = parcel.readInt();
                    byte[] createByteArray13 = parcel.createByteArray();
                    int readInt35 = parcel.readInt();
                    byte[] bArr16 = readInt35 >= 0 ? new byte[readInt35] : null;
                    int dataEncryptRSA = dataEncryptRSA(readString3, readInt34, createByteArray13, bArr16);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataEncryptRSA);
                    parcel2.writeByteArray(bArr16);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString4 = parcel.readString();
                    int readInt36 = parcel.readInt();
                    byte[] createByteArray14 = parcel.createByteArray();
                    int readInt37 = parcel.readInt();
                    byte[] bArr17 = readInt37 >= 0 ? new byte[readInt37] : null;
                    int dataDecryptRSA = dataDecryptRSA(readString4, readInt36, createByteArray14, bArr17);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataDecryptRSA);
                    parcel2.writeByteArray(bArr17);
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    int removeRSAKey = removeRSAKey(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(removeRSAKey);
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    int storeCertificate = storeCertificate(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(storeCertificate);
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt38 = parcel.readInt();
                    int readInt39 = parcel.readInt();
                    byte[] bArr18 = readInt39 >= 0 ? new byte[readInt39] : null;
                    int certificate = getCertificate(readInt38, bArr18);
                    parcel2.writeNoException();
                    parcel2.writeInt(certificate);
                    parcel2.writeByteArray(bArr18);
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt40 = parcel.readInt();
                    byte[] bArr19 = readInt40 >= 0 ? new byte[readInt40] : null;
                    int dukptGetInitKSN = dukptGetInitKSN(bArr19);
                    parcel2.writeNoException();
                    parcel2.writeInt(dukptGetInitKSN);
                    parcel2.writeByteArray(bArr19);
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString5 = parcel.readString();
                    int readInt41 = parcel.readInt();
                    byte[] createByteArray15 = parcel.createByteArray();
                    int readInt42 = parcel.readInt();
                    byte[] bArr20 = readInt42 >= 0 ? new byte[readInt42] : null;
                    int signingRSA = signingRSA(readString5, readInt41, createByteArray15, bArr20);
                    parcel2.writeNoException();
                    parcel2.writeInt(signingRSA);
                    parcel2.writeByteArray(bArr20);
                    return true;
                case 37:
                    parcel.enforceInterface(DESCRIPTOR);
                    int verifySignatureRSA = verifySignatureRSA(parcel.readString(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(verifySignatureRSA);
                    return true;
                case 38:
                    parcel.enforceInterface(DESCRIPTOR);
                    int injectPlaintextKey = injectPlaintextKey(parcel.readString(), parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(injectPlaintextKey);
                    return true;
                case 39:
                    parcel.enforceInterface(DESCRIPTOR);
                    int injectCiphertextKey = injectCiphertextKey(parcel.readString(), parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(injectCiphertextKey);
                    return true;
                case 40:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt43 = parcel.readInt();
                    int readInt44 = parcel.readInt();
                    byte[] createByteArray16 = parcel.createByteArray();
                    int readInt45 = parcel.readInt();
                    byte[] createByteArray17 = parcel.createByteArray();
                    int readInt46 = parcel.readInt();
                    byte[] bArr21 = readInt46 >= 0 ? new byte[readInt46] : null;
                    int dataEncryptDukptEx = dataEncryptDukptEx(readInt43, readInt44, createByteArray16, readInt45, createByteArray17, bArr21);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataEncryptDukptEx);
                    parcel2.writeByteArray(bArr21);
                    return true;
                case 41:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt47 = parcel.readInt();
                    int readInt48 = parcel.readInt();
                    byte[] createByteArray18 = parcel.createByteArray();
                    int readInt49 = parcel.readInt();
                    byte[] createByteArray19 = parcel.createByteArray();
                    int readInt50 = parcel.readInt();
                    byte[] bArr22 = readInt50 >= 0 ? new byte[readInt50] : null;
                    int dataDecryptDukptEx = dataDecryptDukptEx(readInt47, readInt48, createByteArray18, readInt49, createByteArray19, bArr22);
                    parcel2.writeNoException();
                    parcel2.writeInt(dataDecryptDukptEx);
                    parcel2.writeByteArray(bArr22);
                    return true;
                case 42:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt51 = parcel.readInt();
                    int readInt52 = parcel.readInt();
                    int readInt53 = parcel.readInt();
                    byte[] createByteArray20 = parcel.createByteArray();
                    int readInt54 = parcel.readInt();
                    byte[] bArr23 = readInt54 >= 0 ? new byte[readInt54] : null;
                    int calcMacDukptEx = calcMacDukptEx(readInt51, readInt52, readInt53, createByteArray20, bArr23);
                    parcel2.writeNoException();
                    parcel2.writeInt(calcMacDukptEx);
                    parcel2.writeByteArray(bArr23);
                    return true;
                case 43:
                    parcel.enforceInterface(DESCRIPTOR);
                    int verifyMacDukptEx = verifyMacDukptEx(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(verifyMacDukptEx);
                    return true;
                case 44:
                    parcel.enforceInterface(DESCRIPTOR);
                    int saveTR31Key = saveTR31Key(parcel.createByteArray(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(saveTR31Key);
                    return true;
                case 45:
                    parcel.enforceInterface(DESCRIPTOR);
                    int saveCiphertextKeyRSA = saveCiphertextKeyRSA(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(saveCiphertextKeyRSA);
                    return true;
                case 46:
                    parcel.enforceInterface(DESCRIPTOR);
                    int saveRSAKey = saveRSAKey(parcel.readInt(), parcel.createByteArray(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(saveRSAKey);
                    return true;
                case 47:
                    parcel.enforceInterface(DESCRIPTOR);
                    int deleteKey = deleteKey(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(deleteKey);
                    return true;
                case 48:
                    parcel.enforceInterface(DESCRIPTOR);
                    int saveKeyDukptAES = saveKeyDukptAES(parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(saveKeyDukptAES);
                    return true;
                case 49:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt55 = parcel.readInt();
                    int readInt56 = parcel.readInt();
                    int readInt57 = parcel.readInt();
                    byte[] createByteArray21 = parcel.createByteArray();
                    byte[] createByteArray22 = parcel.createByteArray();
                    int readInt58 = parcel.readInt();
                    byte[] bArr24 = readInt58 >= 0 ? new byte[readInt58] : null;
                    int calcMacEx = calcMacEx(readInt55, readInt56, readInt57, createByteArray21, createByteArray22, bArr24);
                    parcel2.writeNoException();
                    parcel2.writeInt(calcMacEx);
                    parcel2.writeByteArray(bArr24);
                    return true;
                case 50:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt59 = parcel.readInt();
                    Bundle bundle = new Bundle();
                    int generateSM2Keypair = generateSM2Keypair(readInt59, bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(generateSM2Keypair);
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    return true;
                case 51:
                    parcel.enforceInterface(DESCRIPTOR);
                    int injectSM2Key = injectSM2Key(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(injectSM2Key);
                    return true;
                case 52:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt60 = parcel.readInt();
                    int readInt61 = parcel.readInt();
                    byte[] createByteArray23 = parcel.createByteArray();
                    byte[] createByteArray24 = parcel.createByteArray();
                    int readInt62 = parcel.readInt();
                    byte[] bArr25 = readInt62 >= 0 ? new byte[readInt62] : null;
                    int sm2Sign = sm2Sign(readInt60, readInt61, createByteArray23, createByteArray24, bArr25);
                    parcel2.writeNoException();
                    parcel2.writeInt(sm2Sign);
                    parcel2.writeByteArray(bArr25);
                    return true;
                case 53:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sm2VerifySign = sm2VerifySign(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(sm2VerifySign);
                    return true;
                case 54:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt63 = parcel.readInt();
                    byte[] createByteArray25 = parcel.createByteArray();
                    int readInt64 = parcel.readInt();
                    byte[] bArr26 = readInt64 >= 0 ? new byte[readInt64] : null;
                    int sm2EncryptData = sm2EncryptData(readInt63, createByteArray25, bArr26);
                    parcel2.writeNoException();
                    parcel2.writeInt(sm2EncryptData);
                    parcel2.writeByteArray(bArr26);
                    return true;
                case 55:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt65 = parcel.readInt();
                    byte[] createByteArray26 = parcel.createByteArray();
                    int readInt66 = parcel.readInt();
                    byte[] bArr27 = readInt66 >= 0 ? new byte[readInt66] : null;
                    int sm2DecryptData = sm2DecryptData(readInt65, createByteArray26, bArr27);
                    parcel2.writeNoException();
                    parcel2.writeInt(sm2DecryptData);
                    parcel2.writeByteArray(bArr27);
                    return true;
                case 56:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt67 = parcel.readInt();
                    byte[] createByteArray27 = parcel.createByteArray();
                    int readInt68 = parcel.readInt();
                    byte[] bArr28 = readInt68 >= 0 ? new byte[readInt68] : null;
                    int calcSecHash = calcSecHash(readInt67, createByteArray27, bArr28);
                    parcel2.writeNoException();
                    parcel2.writeInt(calcSecHash);
                    parcel2.writeByteArray(bArr28);
                    return true;
                case 57:
                    parcel.enforceInterface(DESCRIPTOR);
                    int verifyMac = verifyMac(parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(verifyMac);
                    return true;
                case 58:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt69 = parcel.readInt();
                    int readInt70 = parcel.readInt();
                    String readString6 = parcel.readString();
                    int readInt71 = parcel.readInt();
                    byte[] bArr29 = readInt71 >= 0 ? new byte[readInt71] : null;
                    int generateRSAKeypair = generateRSAKeypair(readInt69, readInt70, readString6, bArr29);
                    parcel2.writeNoException();
                    parcel2.writeInt(generateRSAKeypair);
                    parcel2.writeByteArray(bArr29);
                    return true;
                case 59:
                    parcel.enforceInterface(DESCRIPTOR);
                    int injectRSAKey = injectRSAKey(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(injectRSAKey);
                    return true;
                case 60:
                    parcel.enforceInterface(DESCRIPTOR);
                    int generateSymKey = generateSymKey(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(generateSymKey);
                    return true;
                case 61:
                    parcel.enforceInterface(DESCRIPTOR);
                    int injectSymKey = injectSymKey(parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(injectSymKey);
                    return true;
                case 62:
                    parcel.enforceInterface(DESCRIPTOR);
                    int hsmSaveKeyShare = hsmSaveKeyShare(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(hsmSaveKeyShare);
                    return true;
                case 63:
                    parcel.enforceInterface(DESCRIPTOR);
                    int hsmSaveKeyShareDukpt = hsmSaveKeyShareDukpt(parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(hsmSaveKeyShareDukpt);
                    return true;
                case 64:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt72 = parcel.readInt();
                    int readInt73 = parcel.readInt();
                    int readInt74 = parcel.readInt();
                    int readInt75 = parcel.readInt();
                    int readInt76 = parcel.readInt();
                    int readInt77 = parcel.readInt();
                    int readInt78 = parcel.readInt();
                    byte[] bArr30 = readInt78 >= 0 ? new byte[readInt78] : null;
                    int hsmCombineKeyShare = hsmCombineKeyShare(readInt72, readInt73, readInt74, readInt75, readInt76, readInt77, bArr30);
                    parcel2.writeNoException();
                    parcel2.writeInt(hsmCombineKeyShare);
                    parcel2.writeByteArray(bArr30);
                    return true;
                case 65:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt79 = parcel.readInt();
                    int readInt80 = parcel.readInt();
                    String readString7 = parcel.readString();
                    int readInt81 = parcel.readInt();
                    byte[] bArr31 = readInt81 >= 0 ? new byte[readInt81] : null;
                    int hsmGenerateRSAKeypair = hsmGenerateRSAKeypair(readInt79, readInt80, readString7, bArr31);
                    parcel2.writeNoException();
                    parcel2.writeInt(hsmGenerateRSAKeypair);
                    parcel2.writeByteArray(bArr31);
                    return true;
                case 66:
                    parcel.enforceInterface(DESCRIPTOR);
                    int hsmInjectRSAKey = hsmInjectRSAKey(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(hsmInjectRSAKey);
                    return true;
                case 67:
                    parcel.enforceInterface(DESCRIPTOR);
                    int hsmSaveKeyUnderKEK = hsmSaveKeyUnderKEK(parcel.readInt(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(hsmSaveKeyUnderKEK);
                    return true;
                case 68:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt82 = parcel.readInt();
                    int readInt83 = parcel.readInt();
                    int readInt84 = parcel.readInt();
                    int readInt85 = parcel.readInt();
                    byte[] bArr32 = readInt85 >= 0 ? new byte[readInt85] : null;
                    int hsmExportKeyUnderKEK = hsmExportKeyUnderKEK(readInt82, readInt83, readInt84, bArr32);
                    parcel2.writeNoException();
                    parcel2.writeInt(hsmExportKeyUnderKEK);
                    parcel2.writeByteArray(bArr32);
                    return true;
                case 69:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt86 = parcel.readInt();
                    int readInt87 = parcel.readInt();
                    byte[] createByteArray28 = parcel.createByteArray();
                    int readInt88 = parcel.readInt();
                    byte[] bArr33 = readInt88 >= 0 ? new byte[readInt88] : null;
                    int hsmExportTR31KeyBlock = hsmExportTR31KeyBlock(readInt86, readInt87, createByteArray28, bArr33);
                    parcel2.writeNoException();
                    parcel2.writeInt(hsmExportTR31KeyBlock);
                    parcel2.writeByteArray(bArr33);
                    return true;
                case 70:
                    parcel.enforceInterface(DESCRIPTOR);
                    int hsmDestroyKey = hsmDestroyKey(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(hsmDestroyKey);
                    return true;
                case 71:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt89 = parcel.readInt();
                    String readString8 = parcel.readString();
                    int readInt90 = parcel.readInt();
                    int readInt91 = parcel.readInt();
                    int readInt92 = parcel.readInt();
                    byte[] createByteArray29 = parcel.createByteArray();
                    byte[] createByteArray30 = parcel.createByteArray();
                    int readInt93 = parcel.readInt();
                    byte[] bArr34 = readInt93 >= 0 ? new byte[readInt93] : null;
                    int hsmExchangeKeyEcc = hsmExchangeKeyEcc(readInt89, readString8, readInt90, readInt91, readInt92, createByteArray29, createByteArray30, bArr34);
                    parcel2.writeNoException();
                    parcel2.writeInt(hsmExchangeKeyEcc);
                    parcel2.writeByteArray(bArr34);
                    return true;
                case 72:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt94 = parcel.readInt();
                    int readInt95 = parcel.readInt();
                    int readInt96 = parcel.readInt();
                    byte[] createByteArray31 = parcel.createByteArray();
                    byte[] createByteArray32 = parcel.createByteArray();
                    int hsmAsymKeyFun = hsmAsymKeyFun(readInt94, readInt95, readInt96, createByteArray31, createByteArray32);
                    parcel2.writeNoException();
                    parcel2.writeInt(hsmAsymKeyFun);
                    parcel2.writeByteArray(createByteArray32);
                    return true;
                case 73:
                    parcel.enforceInterface(DESCRIPTOR);
                    int operateSensitiveService = operateSensitiveService(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(operateSensitiveService);
                    return true;
                case 74:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt97 = parcel.readInt();
                    int readInt98 = parcel.readInt();
                    byte[] createByteArray33 = parcel.createByteArray();
                    int readInt99 = parcel.readInt();
                    byte[] bArr35 = readInt99 >= 0 ? new byte[readInt99] : null;
                    int rsaEncryptOrDecryptData = rsaEncryptOrDecryptData(readInt97, readInt98, createByteArray33, bArr35);
                    parcel2.writeNoException();
                    parcel2.writeInt(rsaEncryptOrDecryptData);
                    parcel2.writeByteArray(bArr35);
                    return true;
                case 75:
                    parcel.enforceInterface(DESCRIPTOR);
                    int storeDeviceCertPrivateKey = storeDeviceCertPrivateKey(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(storeDeviceCertPrivateKey);
                    return true;
                case 76:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt100 = parcel.readInt();
                    int readInt101 = parcel.readInt();
                    byte[] bArr36 = readInt101 >= 0 ? new byte[readInt101] : null;
                    int deviceCertificate = getDeviceCertificate(readInt100, bArr36);
                    parcel2.writeNoException();
                    parcel2.writeInt(deviceCertificate);
                    parcel2.writeByteArray(bArr36);
                    return true;
                case 77:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt102 = parcel.readInt();
                    int readInt103 = parcel.readInt();
                    int readInt104 = parcel.readInt();
                    byte[] createByteArray34 = parcel.createByteArray();
                    int readInt105 = parcel.readInt();
                    byte[] bArr37 = readInt105 >= 0 ? new byte[readInt105] : null;
                    int devicePrivateKeyRecover = devicePrivateKeyRecover(readInt102, readInt103, readInt104, createByteArray34, bArr37);
                    parcel2.writeNoException();
                    parcel2.writeInt(devicePrivateKeyRecover);
                    parcel2.writeByteArray(bArr37);
                    return true;
                case 78:
                    parcel.enforceInterface(DESCRIPTOR);
                    Bundle bundle2 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    int readInt106 = parcel.readInt();
                    byte[] bArr38 = readInt106 >= 0 ? new byte[readInt106] : null;
                    int keyCheckValueEx = getKeyCheckValueEx(bundle2, bArr38);
                    parcel2.writeNoException();
                    parcel2.writeInt(keyCheckValueEx);
                    parcel2.writeByteArray(bArr38);
                    return true;
                case 79:
                    parcel.enforceInterface(DESCRIPTOR);
                    int deleteKeyEx = deleteKeyEx(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(deleteKeyEx);
                    return true;
                case 80:
                    parcel.enforceInterface(DESCRIPTOR);
                    int injectCiphertextKeyEx = injectCiphertextKeyEx(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(injectCiphertextKeyEx);
                    return true;
                case 81:
                    parcel.enforceInterface(DESCRIPTOR);
                    int injectKeyDukptEx = injectKeyDukptEx(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(injectKeyDukptEx);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements SecurityOptV2 {
            public static SecurityOptV2 sDefaultImpl;
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int saveBaseKey(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().saveBaseKey(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int savePlaintextKey(int i, byte[] bArr, byte[] bArr2, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().savePlaintextKey(i, bArr, bArr2, i2, i3);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int saveCiphertextKey(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) throws RemoteException {
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
                    try {
                        if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                            int saveCiphertextKey = Stub.getDefaultImpl().saveCiphertextKey(i, bArr, bArr2, i2, i3, i4);
                            obtain2.recycle();
                            obtain.recycle();
                            return saveCiphertextKey;
                        }
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
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
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int dataEncrypt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dataEncrypt(i, bArr, i2, bArr2, bArr3);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int dataDecrypt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dataDecrypt(i, bArr, i2, bArr2, bArr3);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int saveKeyDukpt(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    try {
                        if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                            int saveKeyDukpt = Stub.getDefaultImpl().saveKeyDukpt(i, bArr, bArr2, bArr3, i2, i3);
                            obtain2.recycle();
                            obtain.recycle();
                            return saveKeyDukpt;
                        }
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
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
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int dataEncryptDukpt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dataEncryptDukpt(i, bArr, i2, bArr2, bArr3);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int dataDecryptDukpt(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dataDecryptDukpt(i, bArr, i2, bArr2, bArr3);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int dukptIncreaseKSN(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dukptIncreaseKSN(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int dukptCurrentKSN(int i, byte[] bArr) throws RemoteException {
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
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dukptCurrentKSN(i, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int getKeyCheckValue(int i, int i2, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getKeyCheckValue(i, i2, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int getTUSNEncryptData(String str, byte[] bArr) throws RemoteException {
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
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTUSNEncryptData(str, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int storeSM4Key(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().storeSM4Key(bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
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
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int getSecStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSecStatus();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int verifyApkSign(byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().verifyApkSign(bArr, bArr2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public String getAuthStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAuthStatus(i);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public String getTermStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTermStatus();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int setTermStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setTermStatus();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
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
                    if (!this.mRemote.transact(22, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int sysConfirmAuth(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(23, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sysConfirmAuth(bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int saveTerminalKey(byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(24, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().saveTerminalKey(bArr, bArr2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
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
                    if (!this.mRemote.transact(25, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
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
                    if (!this.mRemote.transact(26, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int generateRSAKeys(int i, int i2, int i3, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(27, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().generateRSAKeys(i, i2, i3, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int getRSAPublicKey(int i, byte[] bArr) throws RemoteException {
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
                    if (!this.mRemote.transact(28, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRSAPublicKey(i, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int getRSAPrivateKey(int i, byte[] bArr) throws RemoteException {
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
                    if (!this.mRemote.transact(29, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRSAPrivateKey(i, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int dataEncryptRSA(String str, int i, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(30, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dataEncryptRSA(str, i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int dataDecryptRSA(String str, int i, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(31, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dataDecryptRSA(str, i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int removeRSAKey(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(32, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().removeRSAKey(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int storeCertificate(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(33, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().storeCertificate(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int getCertificate(int i, byte[] bArr) throws RemoteException {
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
                    if (!this.mRemote.transact(34, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCertificate(i, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int dukptGetInitKSN(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    if (!this.mRemote.transact(35, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dukptGetInitKSN(bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int signingRSA(String str, int i, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(36, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().signingRSA(str, i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int verifySignatureRSA(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    if (!this.mRemote.transact(37, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().verifySignatureRSA(str, bArr, bArr2, bArr3);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int injectPlaintextKey(String str, int i, byte[] bArr, byte[] bArr2, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(38, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int injectPlaintextKey = Stub.getDefaultImpl().injectPlaintextKey(str, i, bArr, bArr2, i2, i3);
                        obtain2.recycle();
                        obtain.recycle();
                        return injectPlaintextKey;
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int injectCiphertextKey(String str, int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(39, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int injectCiphertextKey = Stub.getDefaultImpl().injectCiphertextKey(str, i, bArr, bArr2, i2, i3, i4);
                        obtain2.recycle();
                        obtain.recycle();
                        return injectCiphertextKey;
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int dataEncryptDukptEx(int i, int i2, byte[] bArr, int i3, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(40, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int dataEncryptDukptEx = Stub.getDefaultImpl().dataEncryptDukptEx(i, i2, bArr, i3, bArr2, bArr3);
                        obtain2.recycle();
                        obtain.recycle();
                        return dataEncryptDukptEx;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr3);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int dataDecryptDukptEx(int i, int i2, byte[] bArr, int i3, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(41, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int dataDecryptDukptEx = Stub.getDefaultImpl().dataDecryptDukptEx(i, i2, bArr, i3, bArr2, bArr3);
                        obtain2.recycle();
                        obtain.recycle();
                        return dataDecryptDukptEx;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr3);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int calcMacDukptEx(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(42, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().calcMacDukptEx(i, i2, i3, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int verifyMacDukptEx(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(43, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().verifyMacDukptEx(i, i2, i3, bArr, bArr2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int saveTR31Key(byte[] bArr, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(44, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().saveTR31Key(bArr, i, i2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int saveCiphertextKeyRSA(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, String str) throws RemoteException {
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
                    obtain.writeString(str);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(45, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int saveCiphertextKeyRSA = Stub.getDefaultImpl().saveCiphertextKeyRSA(i, bArr, bArr2, i2, i3, i4, str);
                        obtain2.recycle();
                        obtain.recycle();
                        return saveCiphertextKeyRSA;
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int saveRSAKey(int i, byte[] bArr, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(46, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().saveRSAKey(i, bArr, i2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int deleteKey(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(47, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteKey(i, i2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int saveKeyDukptAES(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(48, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int saveKeyDukptAES = Stub.getDefaultImpl().saveKeyDukptAES(i, i2, bArr, bArr2, bArr3, i3, i4);
                        obtain2.recycle();
                        obtain.recycle();
                        return saveKeyDukptAES;
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int calcMacEx(int i, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(49, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int calcMacEx = Stub.getDefaultImpl().calcMacEx(i, i2, i3, bArr, bArr2, bArr3);
                        obtain2.recycle();
                        obtain.recycle();
                        return calcMacEx;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr3);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int generateSM2Keypair(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(50, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().generateSM2Keypair(i, bundle);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int injectSM2Key(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(51, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().injectSM2Key(i, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int sm2Sign(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                    if (!this.mRemote.transact(52, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sm2Sign(i, i2, bArr, bArr2, bArr3);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int sm2VerifySign(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    if (!this.mRemote.transact(53, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sm2VerifySign(i, bArr, bArr2, bArr3);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int sm2EncryptData(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(54, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sm2EncryptData(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int sm2DecryptData(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(55, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sm2DecryptData(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int calcSecHash(int i, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(56, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().calcSecHash(i, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int verifyMac(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(57, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().verifyMac(i, i2, bArr, bArr2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int generateRSAKeypair(int i, int i2, String str, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    if (!this.mRemote.transact(58, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().generateRSAKeypair(i, i2, str, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int injectRSAKey(int i, int i2, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(59, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().injectRSAKey(i, i2, str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int generateSymKey(int i, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!this.mRemote.transact(60, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().generateSymKey(i, i2, i3);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int injectSymKey(int i, int i2, byte[] bArr, byte[] bArr2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeInt(i3);
                    if (!this.mRemote.transact(61, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().injectSymKey(i, i2, bArr, bArr2, i3);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int hsmSaveKeyShare(int i, byte[] bArr, byte[] bArr2, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!this.mRemote.transact(62, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hsmSaveKeyShare(i, bArr, bArr2, i2, i3);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int hsmSaveKeyShareDukpt(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    obtain.writeByteArray(bArr3);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(63, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int hsmSaveKeyShareDukpt = Stub.getDefaultImpl().hsmSaveKeyShareDukpt(i, i2, bArr, bArr2, bArr3, i3, i4);
                        obtain2.recycle();
                        obtain.recycle();
                        return hsmSaveKeyShareDukpt;
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int hsmCombineKeyShare(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(64, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int hsmCombineKeyShare = Stub.getDefaultImpl().hsmCombineKeyShare(i, i2, i3, i4, i5, i6, bArr);
                        obtain2.recycle();
                        obtain.recycle();
                        return hsmCombineKeyShare;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int hsmGenerateRSAKeypair(int i, int i2, String str, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    if (!this.mRemote.transact(65, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hsmGenerateRSAKeypair(i, i2, str, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int hsmInjectRSAKey(int i, int i2, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(66, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hsmInjectRSAKey(i, i2, str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int hsmSaveKeyUnderKEK(int i, byte[] bArr, int i2, int i3, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(67, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int hsmSaveKeyUnderKEK = Stub.getDefaultImpl().hsmSaveKeyUnderKEK(i, bArr, i2, i3, i4, i5);
                        obtain2.recycle();
                        obtain.recycle();
                        return hsmSaveKeyUnderKEK;
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int hsmExportKeyUnderKEK(int i, int i2, int i3, byte[] bArr) throws RemoteException {
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
                    if (!this.mRemote.transact(68, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hsmExportKeyUnderKEK(i, i2, i3, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int hsmExportTR31KeyBlock(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(69, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hsmExportTR31KeyBlock(i, i2, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int hsmDestroyKey(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(70, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hsmDestroyKey(i);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int hsmExchangeKeyEcc(int i, String str, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (bArr3 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr3.length);
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(71, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int hsmExchangeKeyEcc = Stub.getDefaultImpl().hsmExchangeKeyEcc(i, str, i2, i3, i4, bArr, bArr2, bArr3);
                        obtain2.recycle();
                        obtain.recycle();
                        return hsmExchangeKeyEcc;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr3);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int hsmAsymKeyFun(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(72, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hsmAsymKeyFun(i, i2, i3, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int operateSensitiveService(int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(73, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().operateSensitiveService(i, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int rsaEncryptOrDecryptData(int i, int i2, byte[] bArr, byte[] bArr2) throws RemoteException {
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
                    if (!this.mRemote.transact(74, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().rsaEncryptOrDecryptData(i, i2, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int storeDeviceCertPrivateKey(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(75, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().storeDeviceCertPrivateKey(i, i2, i3, bArr, bArr2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int getDeviceCertificate(int i, byte[] bArr) throws RemoteException {
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
                    if (!this.mRemote.transact(76, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDeviceCertificate(i, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int devicePrivateKeyRecover(int i, int i2, int i3, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr);
                    if (bArr2 == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr2.length);
                    }
                    if (!this.mRemote.transact(77, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().devicePrivateKeyRecover(i, i2, i3, bArr, bArr2);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int getKeyCheckValueEx(Bundle bundle, byte[] bArr) throws RemoteException {
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
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    if (!this.mRemote.transact(78, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getKeyCheckValueEx(bundle, bArr);
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

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int deleteKeyEx(Bundle bundle) throws RemoteException {
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
                    if (!this.mRemote.transact(79, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteKeyEx(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int injectCiphertextKeyEx(Bundle bundle) throws RemoteException {
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
                    if (!this.mRemote.transact(80, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().injectCiphertextKeyEx(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
            public int injectKeyDukptEx(Bundle bundle) throws RemoteException {
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
                    if (!this.mRemote.transact(81, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().injectKeyDukptEx(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(SecurityOptV2 securityOptV2) {
            if (Proxy.sDefaultImpl != null || securityOptV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = securityOptV2;
            return true;
        }

        public static SecurityOptV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
