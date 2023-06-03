package com.sunmi.sunmisecurityservice.api;

import com.sunmi.sunmisecurityservice.model.entity.AuthCodeResponseParams;
import java.util.Map;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/* loaded from: classes.dex */
public interface RASApiService {
    @FormUrlEncoded
    @POST("/api/financial/app/financial/1.1/?service=/checkauthcode")
    Observable<AuthCodeResponseParams> authCode(@Field("data") String str, @Field("machineModel") String str2, @Field("msn") String str3, @Field("signData") String str4);

    @FormUrlEncoded
    @POST("/api/financial/app/financial/1.1/?service=/checkauthcode")
    Observable<AuthCodeResponseParams> authCodeMD5(@FieldMap Map<String, String> map);
}
