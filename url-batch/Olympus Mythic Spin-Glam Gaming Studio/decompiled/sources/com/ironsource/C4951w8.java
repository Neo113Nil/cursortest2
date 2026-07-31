package com.ironsource;

import android.util.Log;
import com.ironsource.C4703ie;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.w8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C4951w8 {
    private static C4951w8 b;
    private J5 a;

    private C4951w8() {
    }

    private static C4951w8 a() {
        if (b == null) {
            b = new C4951w8();
        }
        return b;
    }

    public static void a(D5 d5, C4911u8 c4911u8) {
        if (d5 != null) {
            try {
                a().a = new J5(d5, c4911u8);
            } catch (Exception e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    public static void a(C4703ie.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(C4703ie.a aVar, Map<String, Object> map) {
        J5 j5 = a().a;
        if (j5 == null) {
            Log.d(B5.a, B5.V);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.b));
        }
        j5.a(aVar.a, map);
    }
}
