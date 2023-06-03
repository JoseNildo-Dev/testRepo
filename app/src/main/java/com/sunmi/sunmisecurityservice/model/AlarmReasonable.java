package com.sunmi.sunmisecurityservice.model;

import com.sunmi.sunmisecurityservice.model.entity.AlarmReason;
import java.util.List;

/* loaded from: classes.dex */
public interface AlarmReasonable {
    Tuple<List<AlarmReason>, String> loadAlarmReason();
}
