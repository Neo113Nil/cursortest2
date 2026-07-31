package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class L5 {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("google", AdTrackingInfo.Provider.GOOGLE);
        hashMap.put("huawei", AdTrackingInfo.Provider.HMS);
        hashMap.put("yandex", AdTrackingInfo.Provider.YANDEX);
        a = Collections.unmodifiableMap(hashMap);
    }
}
