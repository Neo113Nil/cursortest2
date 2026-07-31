package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒡ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0813 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static C0813 f2001;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public HashMap f2003;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap f2004 = new HashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Handler f2002 = new Handler(Looper.getMainLooper());

    static {
        StringFog.decrypt("uzWETtbD1QeqOYVE0enkCr8/\n", "z1rxLb6HsHM=\n");
        StringFog.decrypt("yRfY\n", "qGO00VXHLU8=\n");
        StringFog.decrypt("kNU=\n", "4rmYaiXQEXw=\n");
        StringFog.decrypt("XdHL\n", "M76lyc5PwwU=\n");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static synchronized C0813 m4209() {
        C0813 c0813;
        synchronized (C0813.class) {
            try {
                if (f2001 == null) {
                    f2001 = new C0813();
                }
                c0813 = f2001;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0813;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m4211(Activity activity) {
        return EnumC0814.f2006 == m4212(activity);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized EnumC0814 m4212(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m4210().containsKey(name)) {
                return (EnumC0814) m4210().get(name);
            }
            if (((HashMap) m4213()).containsKey(name)) {
                return (EnumC0814) ((HashMap) m4213()).get(name);
            }
        }
        return EnumC0814.m4214(AbstractC0590.m4087().mo4095());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized HashMap m4210() {
        return new HashMap(this.f2004);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized Map m4213() {
        JSONObject jSONObject;
        try {
            if (this.f2003 == null) {
                this.f2003 = new HashMap();
                C0839 c0839 = ((C0600) AbstractC0590.m4087()).f2997;
                if (c0839 != null) {
                    jSONObject = c0839.f2054.optJSONObject(C0839.f2051);
                    if (jSONObject == null) {
                        jSONObject = c0839.f2053;
                    }
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, EnumC0814.m4214(jSONObject.optString(next)));
                    }
                    this.f2003 = hashMap;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2003;
    }
}
