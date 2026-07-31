package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class H8 {
    public static HashMap a() {
        String str;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("mk-version", AbstractC4030gj.a());
            C4458x1 c4458x1 = Yk.a;
            Boolean bool = c4458x1 != null ? c4458x1.c : null;
            if (bool != null) {
                hashMap.put("u-id-adt", bool.booleanValue() ? "1" : "0");
            }
            hashMap.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            hashMap.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            C4187mj.a.getClass();
            HashMap hashMap2 = new HashMap();
            if (C4187mj.e && (str = C4187mj.d) != null) {
                hashMap2.put("u-s-id", str);
            }
            hashMap.putAll(hashMap2);
            return hashMap;
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("H8", "TAG");
            e.getMessage();
            return hashMap;
        }
    }
}
