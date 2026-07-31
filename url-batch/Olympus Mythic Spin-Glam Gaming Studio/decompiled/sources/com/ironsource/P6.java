package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class P6 {
    private final InterfaceC4986y7 a;
    private final ConcurrentHashMap<String, Object> b;
    private final AtomicBoolean c;
    private final AtomicBoolean d;

    class a implements Runnable {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                P6.this.e(this.a);
            } catch (Exception e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            P6.this.c.set(false);
        }
    }

    private static class b {
        static volatile P6 a = new P6();

        private b() {
        }
    }

    private P6() {
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.a = Kb.Y().a();
        this.b = new ConcurrentHashMap<>();
    }

    static P6 b() {
        return b.a;
    }

    private void d(Context context) {
        if (context == null || this.d.getAndSet(true)) {
            return;
        }
        a("auid", this.a.e(context));
        a("model", this.a.l());
        a("make", this.a.q());
        a("os", this.a.f());
        a(O6.p, this.a.L(context));
        String adQualitySdkVersion = AdQualityBridge.getAdQualitySdkVersion();
        if (!TextUtils.isEmpty(adQualitySdkVersion)) {
            a(O6.C1, adQualitySdkVersion);
        }
        String i = this.a.i();
        if (i != null) {
            a("osv", i.replaceAll("[^0-9/.]", ""));
            a(O6.J, i);
        }
        a(O6.a, String.valueOf(this.a.e()));
        String v = this.a.v(context);
        if (!TextUtils.isEmpty(v)) {
            a("carrier", v);
        }
        String e = E1.e(context);
        if (!TextUtils.isEmpty(e)) {
            a(O6.o, e);
        }
        String s = this.a.s(context);
        if (!TextUtils.isEmpty(s)) {
            a(O6.w0, s);
        }
        a("bid", context.getPackageName());
        a("mem", String.valueOf(this.a.r(context)));
        a(O6.b0, "2.0");
        a(O6.c0, Long.valueOf(E1.f(context)));
        a(O6.a0, Long.valueOf(E1.d(context)));
        a(O6.d, E1.b(context));
        a(O6.O, Integer.valueOf(T3.f(context)));
        a(O6.Y, T3.g(context));
        a("platform", "android");
        a(O6.z, this.a.t());
        a("mThreshold", this.a.a(this.a.o(context)));
        a(O6.h0, KotlinVersion.CURRENT.toString());
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String I = this.a.I(context);
            if (!TextUtils.isEmpty(I)) {
                a(O6.X0, I);
            }
            String c = this.a.c(context);
            if (TextUtils.isEmpty(c)) {
                return;
            }
            a("lat", Boolean.valueOf(Boolean.parseBoolean(c)));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String z = this.a.z(context);
        if (!TextUtils.isEmpty(z)) {
            a(O6.M0, z);
        } else if (a(O6.M0)) {
            b(O6.M0);
        }
        a(O6.P0, this.a.j(context));
        String d = this.a.d(context);
        if (!TextUtils.isEmpty(d)) {
            a(O6.q, d.toUpperCase(Locale.getDefault()));
        }
        a(O6.r, this.a.B(context));
        String d2 = this.a.d();
        if (!TextUtils.isEmpty(d2)) {
            a("tz", d2);
        }
        String b2 = U3.b(context);
        if (!TextUtils.isEmpty(b2) && !b2.equals("none")) {
            a(O6.j, b2);
        }
        String d3 = U3.d(context);
        if (!TextUtils.isEmpty(d3)) {
            a(O6.k, d3);
        }
        a("vpn", Boolean.valueOf(U3.e(context)));
        String H = this.a.H(context);
        if (!TextUtils.isEmpty(H)) {
            a("icc", H);
        }
        int t = this.a.t(context);
        if (t >= 0) {
            a(O6.k1, Integer.valueOf(t));
        }
        a(O6.l1, this.a.w(context));
        a(O6.m1, this.a.G(context));
        a(O6.i0, Float.valueOf(this.a.F(context)));
        a(O6.m, String.valueOf(this.a.h()));
        a(O6.R, Integer.valueOf(this.a.k()));
        a(O6.Q, Integer.valueOf(this.a.c()));
        a(O6.Z0, String.valueOf(this.a.a()));
        a(O6.h1, String.valueOf(this.a.m()));
        a("mcc", Integer.valueOf(T3.b(context)));
        a("mnc", Integer.valueOf(T3.c(context)));
        a(O6.T, Boolean.valueOf(this.a.j()));
        a(O6.g, Boolean.valueOf(this.a.D(context)));
        a(O6.h, Integer.valueOf(this.a.E(context)));
        a(O6.b, Boolean.valueOf(this.a.f(context)));
        a(O6.K, Boolean.valueOf(this.a.i(context)));
        a("rt", Boolean.valueOf(this.a.p()));
        a(O6.Z, String.valueOf(this.a.r()));
        a(O6.e, Integer.valueOf(this.a.l(context)));
        a(O6.a1, Boolean.valueOf(this.a.J(context)));
        a(O6.c, this.a.n(context));
        a("ua", this.a.s());
        A a2 = new A(Kb.Y().s());
        HashMap hashMap = new HashMap();
        a2.a(hashMap);
        a(O6.F0, hashMap);
        a(O6.L, ConfigFile.getConfigFile().getPluginType());
        a(O6.M, ConfigFile.getConfigFile().getPluginVersion());
        a(O6.N, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    protected void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    protected void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    protected void b(String str, Object obj) {
        a(str, obj);
    }

    protected void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.b.remove(str);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    protected JSONObject b(Context context) throws JSONException {
        f(context);
        return new JSONObject(R6.a(this.b));
    }

    protected void a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Object obj = this.b.get(str);
            if (!(obj instanceof JSONArray)) {
                a(str, (Object) jSONArray);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                jSONArray2.put(jSONArray.get(i));
            }
            a(str, (Object) jSONArray2);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    protected void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.b.get(str);
            if (!(obj instanceof JSONObject)) {
                a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (Object) jSONObject2);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.b.put(str, obj);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private boolean a(String str) {
        return str != null && this.b.containsKey(str);
    }

    private void a(Context context) {
        if (this.c.get()) {
            return;
        }
        try {
            this.c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            this.c.set(false);
        }
    }

    private void a() {
        String a2 = C4923ug.a.a();
        if (a2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("sdk", a2);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(O6.H1, hashMap);
            Map<String, Object> hashMap3 = new HashMap<>();
            hashMap3.put(O6.E1, hashMap2);
            a(hashMap3);
        }
    }
}
