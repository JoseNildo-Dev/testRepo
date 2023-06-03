package com.sunmi.sunmisecurityservice.presenter;

import com.sunmi.sunmisecurityservice.model.Tuple;
import com.sunmi.sunmisecurityservice.model.entity.AlarmReason;
import java.util.List;

/* loaded from: classes.dex */
public interface AlarmReasonPresenterable {
    Tuple<List<AlarmReason>, String> getAlarmReason();
}
