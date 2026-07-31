package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.safedk.android.analytics.events.CrashEvent;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5601pm {
    public final Xa a;
    public final C5641ra b;
    public final Ti c;
    public final Ue d;
    public final Ym e;
    public final C5764w3 f;
    public final B2 g;
    public final Db h;
    public final Vm i;
    public final Ld j;
    public final Y9 k;

    public C5601pm() {
        this(new Db(), new Xa(), new C5641ra(), new Ti(), new Ue(), new Ym(), new C5764w3(), new B2(), new Vm(), new Ld(), new Y9());
    }

    public final void a(C5731um c5731um, Bb bb) {
        long j;
        long j2;
        String str;
        ArrayList a;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = bb.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c5731um.g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = bb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject5 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject5.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject(next);
                if (optJSONObject6 != null && optJSONObject6.has("value")) {
                    hashMap.put(next, optJSONObject6.getString("value"));
                }
            }
            c5731um.j = Wm.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = bb.optJSONObject(CommonUrlParts.LOCALE);
        String str2 = "";
        c5731um.m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = bb.optJSONObject("time");
        if (optJSONObject8 != null) {
            try {
                c5731um.l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        Mm mm = new Mm();
        JSONObject optJSONObject9 = bb.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            mm.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", mm.a);
        }
        this.e.getClass();
        c5731um.p = new Xm(mm.a);
        this.b.getClass();
        Im im = new Im();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = bb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                A4 a4 = new A4();
                a4.a = C5641ra.a(optJSONObject10, "permissions_collecting", im.a);
                a4.b = C5641ra.a(optJSONObject10, "features_collecting", im.b);
                a4.c = C5641ra.a(optJSONObject10, "google_aid", im.c);
                a4.d = C5641ra.a(optJSONObject10, "sim_info", im.d);
                a4.e = C5641ra.a(optJSONObject10, "huawei_oaid", im.e);
                a4.f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c5731um.b = new C4(a4);
            }
        } catch (Throwable unused4) {
        }
        this.a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = bb.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject optJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (optJSONObject11 != null) {
                try {
                    str = optJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    c5731um.d = str;
                }
                ArrayList a2 = Xa.a(optJSONObject11, CrashEvent.e);
                if (!Do.a((Collection) a2)) {
                    c5731um.e = a2;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c5731um.f = str2;
                }
                ArrayList a3 = Xa.a(optJSONObject11, "startup");
                if (!Do.a((Collection) a3)) {
                    c5731um.c = a3;
                }
                ArrayList a5 = Xa.a(optJSONObject11, "diagnostic");
                if (!Do.a((Collection) a5)) {
                    c5731um.n = a5;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!Xa.a.contains(next2) && (a = Xa.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a);
                    }
                }
                c5731um.o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.c.getClass();
        Nm nm = new Nm();
        JSONObject optJSONObject12 = bb.optJSONObject("retry_policy");
        int i = nm.w;
        int i2 = nm.x;
        if (optJSONObject12 != null) {
            i = optJSONObject12.optInt("max_interval_seconds", i);
            i2 = optJSONObject12.optInt("exponential_multiplier", nm.x);
        }
        c5731um.q = new RetryPolicyConfig(i, i2);
        this.d.getClass();
        if (c5731um.b.a) {
            JSONObject optJSONObject13 = bb.optJSONObject("permissions_collecting");
            Km km = new Km();
            if (optJSONObject13 != null) {
                j = optJSONObject13.optLong("check_interval_seconds", km.a);
                j2 = optJSONObject13.optLong("force_send_interval_seconds", km.b);
            } else {
                j = km.a;
                j2 = km.b;
            }
            c5731um.k = new Se(j, j2);
        }
        C5764w3 c5764w3 = this.f;
        c5764w3.getClass();
        Fm fm = new Fm();
        JSONObject optJSONObject14 = bb.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            fm.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", fm.a);
        }
        c5764w3.a.getClass();
        c5731um.r = new C5686t3(fm.a);
        this.g.getClass();
        B2.a(c5731um, bb);
        Vm vm = this.i;
        vm.getClass();
        JSONObject optJSONObject15 = bb.optJSONObject("startup_update");
        Lm lm = new Lm();
        Integer a6 = Cb.a(optJSONObject15, "interval_seconds", null);
        if (a6 != null) {
            lm.a = a6.intValue();
        }
        vm.a.getClass();
        c5731um.t = new Tm(lm.a);
        Map<String, C5670sd> b = this.j.a.b();
        Kd kd = new Kd(bb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C5670sd> entry : b.entrySet()) {
            Object invoke = kd.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c5731um.u = linkedHashMap;
        X9 x9 = this.k.a;
        Hm hm = new Hm();
        JSONObject optJSONObject16 = bb.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            hm.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", hm.a);
        }
        x9.getClass();
        c5731um.v = new W9(hm.a);
    }

    public C5601pm(Db db, Xa xa, C5641ra c5641ra, Ti ti, Ue ue, Ym ym, C5764w3 c5764w3, B2 b2, Vm vm, Ld ld, Y9 y9) {
        this.a = xa;
        this.b = c5641ra;
        this.c = ti;
        this.d = ue;
        this.e = ym;
        this.f = c5764w3;
        this.g = b2;
        this.h = db;
        this.i = vm;
        this.j = ld;
        this.k = y9;
    }
}
