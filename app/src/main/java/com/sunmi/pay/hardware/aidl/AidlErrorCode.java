package com.sunmi.pay.hardware.aidl;

import android.app.Application;
import android.content.Context;
import com.sunmi.paylib.R;
import java.lang.reflect.Method;
import sunmi.paylib.SunmiPayKernel;

/* loaded from: classes.dex */
public enum AidlErrorCode {
    UNKNOWN(Integer.MIN_VALUE, getString(R.string.unknown)),
    SPBASE_ERROR(Integer.MIN_VALUE, getString(R.string.unknown)),
    INVOKING_REPEAT(-20001, getString(R.string.invoking_repeat_invok)),
    INVOKING_WAIT_UPDATE(-20002, getString(R.string.invoking_wait_update)),
    INVOKING_ERROR_PARAMS(-20003, getString(R.string.invoking_error_params)),
    INVOKING_THREAD_EXCEPTION(-20004, getString(R.string.invoking_thread_exception)),
    INVOKING_PUBLIC_KEY_LEN_NOT_MATCH(-20005, getString(R.string.invoking_pubkey_len_not_match)),
    FIRMWARE_UPDATE_FAIL(-20005, getString(R.string.firmware_update_fail)),
    FIRMWARE_VERIFY_FAIL(-20006, getString(R.string.firmware_verify_fail)),
    READ_CARD_FAIL(-30001, getString(R.string.readcard_fail)),
    READ_CARD_UNKNOWN_TYPE(-30002, getString(R.string.readcard_unknown_type)),
    READ_CARD_FAIL_NFC(-30003, getString(R.string.readcard_nfc_fail)),
    READ_CARD_FAIL_IC(-30004, getString(R.string.readcard_ic_fail)),
    READ_CARD_TIMEOUT(-30005, getString(R.string.readcard_timeout)),
    READ_CARD_TRACK1(-30006, getString(R.string.readcard_track1_error)),
    READ_CARD_TRACK2(-30007, getString(R.string.readcard_track2_error)),
    READ_CARD_TRACK3(-30008, getString(R.string.readcard_track3_error)),
    READ_CARD_TRACK1_2_3(-30009, getString(R.string.readcard_track123_error)),
    READ_CARD_TRACK1_2(-30010, getString(R.string.readcard_track12_error)),
    READ_CARD_TRACK1_3(-30011, getString(R.string.readcard_track13_error)),
    READ_CARD_TRACK2_3(-30012, getString(R.string.readcard_track23_error)),
    READ_CARD_FALLBACK(-30013, getString(R.string.readcard_downgrade_transaction)),
    READ_CARD_BUILD_APP_TIMEOUT(-30014, getString(R.string.readcard_candidate_list_timeout)),
    READ_CARD_EXCHANGE(-30015, getString(R.string.readcard_interactive_fail)),
    READ_CARD_EXCHANGE_PARAMETER(-30016, getString(R.string.readcard_error_params_apdu)),
    ERROR_VERIFY_APK_SIGN(-40001, getString(R.string.security_verify_apk_sign_fail)),
    ERROR_LENGTH(-40002, getString(R.string.security_key_length_error)),
    ERROR_CHECK_VALUE(-40003, getString(R.string.security_check_value_error)),
    ERROR_SAVE_FAIL(-40004, getString(R.string.security_save_fail)),
    ERROR_MAC(-40005, getString(R.string.security_mac_error)),
    ERROR_ENCRYPT(-40006, getString(R.string.security_encrypt_fail)),
    ERROR_BAD_ARRAY_LENGTH(-40007, getString(R.string.security_bad_array_length)),
    ERROR_MAC_TYPE(-40008, getString(R.string.security_mac_type_unsuppor)),
    ERROR_CHECKVALUE_LENGTH(-40009, getString(R.string.security_checkvalue_length_error)),
    ERROR_KEY_INDEX(-40010, getString(R.string.security_key_index_error)),
    ERROR_DECRYPT(-40011, getString(R.string.security_decrypt_fail)),
    ERROR_KEY_LENGTH(-40012, getString(R.string.security_key_len_error)),
    GEN_RANDOM_KEY_FAIL(-40013, getString(R.string.security_gen_random_key_fail)),
    ERROR_INDEX_NO_KEY(-40014, getString(R.string.security_index_no_key)),
    ERROR_SAVE_PK_FAIL(-40015, getString(R.string.security_save_pk_fail)),
    VERIFY_ERROR(-40016, getString(R.string.security_verify_fail)),
    GET_SMSTATUS_ERROR(-40017, getString(R.string.security_get_smstatus_fail)),
    ERROR_KEY_PARTITION_EXHAUSTED(-40018, getString(R.string.security_key_partition_exhausted)),
    ERROR_INJECT_BDK(-40019, getString(R.string.security_inject_bdk_error)),
    ERROR_UNSUPPORTED_TRANSFORMATION(-40020, getString(R.string.security_unsupported_transformation)),
    EMV_PREPARE_FAIL(-50002, getString(R.string.emv_prepare_fail)),
    EMV_TRANS_PROCESS_FAIL(-50003, getString(R.string.emv_trans_process_fail)),
    EMV_KERNEL_EXCEPTION(-50004, getString(R.string.emv_kernel_exception)),
    EMV_PAN_ERROR(-50005, getString(R.string.emv_pan_error)),
    EMV_PINPAD_CALLBACK_ERROR(-50006, getString(R.string.emv_pinpad_callback_error)),
    EMV_KERNEL_MSG_NULL(-50007, getString(R.string.emv_kernel_msg_null)),
    EMV_KEYBOARD_PARAMS_ERROR(-50008, getString(R.string.emv_keyboard_params_error)),
    EMV_IN_PROCESS(-50009, getString(R.string.emv_in_process)),
    EMV_TRANS_TYPE_UNSUPPORT(-50010, getString(R.string.emv_trans_type_unsupport)),
    EMV_CONFIRM_CARD_INFO_ERROR(-50011, getString(R.string.emv_confirm_card_info_error)),
    EMV_NFC_CVM_ERROR(-50012, getString(R.string.emv_nfc_cvm_error)),
    EMV_DB_OPT_ERROR(-50013, getString(R.string.emv_db_opt_error)),
    EMV_DB_NO_MATCHED_CAPK(-50014, getString(R.string.emv_db_no_matched_capk)),
    EMV_DB_SAVE_TERM_ERROR(-50015, getString(R.string.emv_db_save_term_error)),
    EMV_DB_NO_MATCHED_AID(-50016, getString(R.string.emv_db_no_matched_aid)),
    EMV_CARDINFO_ERROR(-50017, getString(R.string.emv_cardinfo_error)),
    EMV_TIMING_ERROR(-50018, getString(R.string.emv_timing_error)),
    EMV_TRANSDATA_INVALID(-50019, getString(R.string.emv_transdata_invalid)),
    EMV_PIN_CANCELED(-50020, getString(R.string.emv_pin_canceled)),
    EMV_PIN_ERROR(-50021, getString(R.string.emv_pin_error)),
    EMV_APP_SELECT_INDEX_ERROR(-50022, getString(R.string.emv_app_select_index_error)),
    EMV_CERT_VERIFY_ERROR(-50023, getString(R.string.emv_cert_verify_error)),
    EMV_ONLINE_PROCESS_ERROR(-50024, getString(R.string.emv_online_process_error)),
    EMV_FINAL_SELECT_TIMEOUT(-50025, getString(R.string.emv_final_select_timeout)),
    EMV_FINAL_SELECT_ERROR(-50026, getString(R.string.emv_final_select_error)),
    EMV_SIGNATURE_ERROR(-50027, getString(R.string.emv_signature_error)),
    EMV_UNKNOWN_CVM_TYPE(-50028, getString(R.string.emv_unknown_cvm_type)),
    EMV_DATA_EXCHANGE_ERROR(-50029, getString(R.string.emv_data_exchange_error)),
    EMV_DATA_EXCHANGE_TIMEOUT(-50030, getString(R.string.emv_data_exchange_timeout)),
    EMV_TERMINAL_RISK_MANAGEMENT_TIMEOUT(-50031, getString(R.string.emv_terminal_risk_management_timeout)),
    ERROR_INPUT_TIMEOUT(-60001, getString(R.string.pinpad_pin_input_timeout)),
    ERROR_START_PINPAD(-60002, getString(R.string.pinpad_start_up_pinpad_fail)),
    ERROR_PINPAD_TYPE(-60003, getString(R.string.pinpad_pinpad_type_error)),
    ERROR_RETURN_PINBLOCK(-60004, getString(R.string.pinpad_return_pinblock_error)),
    ERROR_INTERRUPTED(-60005, getString(R.string.pinpad_thread_interrupted)),
    ERROR_PERMISSION_READ_MSR(-70001, getString(R.string.permission_read_msr)),
    ERROR_PERMISSION_READ_ICC(-70002, getString(R.string.permission_read_icc)),
    ERROR_PERMISSION_READ_CONTACTLESS(-70003, getString(R.string.permission_read_contactless)),
    ERROR_PERMISSION_PINPAD(-70004, getString(R.string.permission_pinpad)),
    ERROR_PERMISSION_SECURITY(-70005, getString(R.string.permission_security)),
    ERROR_PERMISSION_LED(-70006, getString(R.string.permission_led)),
    ERROR_PRINTER_PINPAD_ONGOING(-80001, getString(R.string.printer_pinpad_ongoing)),
    ERROR_ETC_NO_DEVICE_SEARCHED(-90001, getString(R.string.etc_no_device_searched));
    
    private int code;
    private String msg;

    AidlErrorCode(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public static AidlErrorCode valueOf(int i) {
        AidlErrorCode[] values;
        SPErrorCode valueOf = SPErrorCode.valueOf(i);
        if (!valueOf.equals(SPErrorCode.UNKNOWN)) {
            SPBASE_ERROR.setCode(valueOf.getCode());
            SPBASE_ERROR.setMsg(getString(valueOf.getResId()));
            return SPBASE_ERROR;
        }
        for (AidlErrorCode aidlErrorCode : values()) {
            if (aidlErrorCode.code == i) {
                return aidlErrorCode;
            }
        }
        return UNKNOWN;
    }

    private static String getString(int i) {
        Context appContext = SunmiPayKernel.getInstance().getAppContext();
        if (appContext != null) {
            return appContext.getString(i);
        }
        Application application = getApplication();
        return application == null ? "unknown error" : application.getString(i);
    }

    private static Application getApplication() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = cls.getDeclaredMethod("getApplication", new Class[0]);
            declaredMethod2.setAccessible(true);
            return (Application) declaredMethod2.invoke(invoke, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
