package com.sunmi.sunmisecurityservice.model.entity;

import java.io.Serializable;

/* loaded from: classes.dex */
public class AuthCodeResponseParams implements Serializable {
    public int code;
    public DataBean data;
    public String msg;

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public String toString() {
        String str = "code:" + this.code + "  msg:" + this.msg;
        if (this.data != null) {
            return str + " " + this.data;
        }
        return str;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        public String ciphertext;
        public String signature;

        public String getCiphertext() {
            return this.ciphertext;
        }

        public void setCiphertext(String str) {
            this.ciphertext = str;
        }

        public String getSignature() {
            return this.signature;
        }

        public void setSignature(String str) {
            this.signature = str;
        }

        public String toString() {
            return "data:{ciphertext:" + this.ciphertext + " signature:" + this.signature + "}";
        }
    }
}
