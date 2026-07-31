package com.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class O {
    private final F0 a;

    public O(F0 f0) {
        this.a = f0;
    }

    public void a(Activity activity, String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (activity != null) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.a.a(C0.SHOW_AD, hashMap);
    }

    public void b(String str) {
        a(str, (String) null);
    }

    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.a.a(C0.AD_DISMISS_SCREEN, hashMap);
    }

    public void d(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_ENDED, hashMap);
    }

    public void e(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_INFO_CHANGED, hashMap);
    }

    public void f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.a.a(C0.AD_LEFT_APPLICATION, hashMap);
    }

    public void g(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_OPENED, hashMap);
    }

    public void h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.a.a(C0.AD_PRESENT_SCREEN, hashMap);
    }

    public void i(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_STARTED, hashMap);
    }

    public void j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.a.a(C0.AD_VIEW_BOUND, hashMap);
    }

    public void k(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_VISIBLE, hashMap);
    }

    public void b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("reason", str2);
        }
        this.a.a(C0.PLACEMENT_CAPPED, hashMap);
    }

    public void a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z ? "true" : "false");
        this.a.a(C0.SHOW_AD_CHANCE, hashMap);
    }

    public void a(String str, int i, String str2, Od od) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str2);
        String a = a(od);
        if (a != null) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, a);
        }
        this.a.a(C0.SHOW_AD_FAILED, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_CLICKED, hashMap);
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.a.a(C0.AD_CLOSED, hashMap);
    }

    public void a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2));
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.a.a(C0.AD_REWARDED, hashMap, j);
    }

    public void a(String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isMultipleAdUnits", 1);
        hashMap.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("reason", str2);
        }
        hashMap.put(IronSourceConstants.EVENTS_EXT1, z ? "true" : "false");
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.a.a(C0.CHECK_PLACEMENT_CAPPED, hashMap);
    }

    public void a() {
        this.a.a(C0.SESSION_CAPPED, null);
    }

    private static String a(Od od) {
        if (od != Od.NO_LOADED_ADS && od != Od.MAX_ATTEMPTS_REACHED) {
            return null;
        }
        return "recover show failed: " + od.b();
    }
}
