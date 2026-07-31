package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.setting.i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseMBSDKContext.java */
/* loaded from: classes3.dex */
public abstract class a {
    public static final String q = com.mbridge.msdk.foundation.controller.c.class.getSimpleName();
    public static HashMap<String, String> r = new HashMap<>();
    public static com.mbridge.msdk.config.component.status.b s;
    protected String b;
    protected Context c;
    protected String d;
    private WeakReference<Activity> e;
    private String f;
    private int g;
    private String j;
    private String k;
    private int l;
    private WeakReference<Context> n;
    private JSONObject o;
    private final s a = new s();
    private JSONObject h = new JSONObject();
    private boolean i = false;
    private ConcurrentHashMap<String, String> m = new ConcurrentHashMap<>();
    private int p = 0;

    /* compiled from: BaseMBSDKContext.java */
    /* renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    class RunnableC1407a implements Runnable {
        RunnableC1407a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.e.a(a.this.c).a();
        }
    }

    /* compiled from: BaseMBSDKContext.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.d.c();
        }
    }

    /* compiled from: BaseMBSDKContext.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.b = (String) y0.a(aVar.c, "sp_appId", "");
            } catch (Throwable th) {
                q0.b(a.q, th.getMessage());
            }
        }
    }

    /* compiled from: BaseMBSDKContext.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.j = (String) y0.a(aVar.c, "sp_appKey", "");
            } catch (Throwable th) {
                q0.b(a.q, th.getMessage());
            }
        }
    }

    /* compiled from: BaseMBSDKContext.java */
    public interface e {
    }

    private void m() {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object a = y0.a(this.c, MBridgeConstans.SP_GA_ID, "");
                Object a2 = y0.a(this.c, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (a instanceof String) {
                    String str = (String) a;
                    if (TextUtils.isEmpty(str)) {
                        g.d();
                    } else {
                        g.a(str);
                    }
                    if (a2 instanceof Integer) {
                        g.a(((Integer) a2).intValue());
                    }
                }
            }
        } catch (Exception e2) {
            q0.b(q, e2.getMessage());
        }
    }

    protected abstract void a(e eVar);

    public void b(int i) {
        this.l = i;
    }

    public void c(int i) {
        this.p = i;
    }

    public Context d() {
        return this.c;
    }

    public s e() {
        return this.a;
    }

    public Context f() {
        WeakReference<Context> weakReference = this.n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int g() {
        return this.g;
    }

    public String h() {
        return !TextUtils.isEmpty(this.k) ? this.k : "";
    }

    public String i() {
        try {
            if (!TextUtils.isEmpty(this.d)) {
                return this.d;
            }
            Context context = this.c;
            if (context == null) {
                return null;
            }
            String packageName = context.getPackageName();
            this.d = packageName;
            return packageName;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String j() {
        if (!TextUtils.isEmpty(this.k)) {
            return this.k;
        }
        Context context = this.c;
        if (context != null) {
            return (String) y0.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public JSONObject k() {
        return this.o;
    }

    public int l() {
        return this.p;
    }

    public WeakReference<Activity> a() {
        return this.e;
    }

    public void b(e eVar) {
        try {
            m0.D(this.c);
            a(eVar);
            i.a(this.c, this.b);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                try {
                    try {
                        PackageManager packageManager = this.c.getPackageManager();
                        m0.d(packageManager.getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2);
                        PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", 0);
                        m0.f(packageInfo != null ? packageInfo.versionName : "0");
                    } catch (PackageManager.NameNotFoundException unused) {
                        m0.d(0);
                    }
                } catch (Throwable th) {
                    q0.b(q, th.getMessage());
                }
            }
            try {
                com.mbridge.msdk.setting.g f = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (f == null) {
                    f = i.b().a();
                }
                s e2 = com.mbridge.msdk.foundation.controller.c.n().e();
                if (e2 != null && e2.b() && f != null && f.G() == 1) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC1407a());
                }
                if (e2 == null || !e2.a()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b());
            } catch (Throwable th2) {
                q0.b(q, th2.getMessage());
            }
        } catch (Exception e3) {
            q0.b(q, e3.getMessage());
        }
    }

    public void c(e eVar) {
        if (this.i) {
            return;
        }
        m();
        try {
            JSONObject jSONObject = new JSONObject();
            this.o = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e2) {
            q0.b(q, e2.getMessage());
        }
        b(eVar);
    }

    public void d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.k = str;
            Context context = this.c;
            if (context != null) {
                y0.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void e(String str) {
        Context context;
        try {
            this.b = str;
            if (TextUtils.isEmpty(str) || (context = this.c) == null) {
                return;
            }
            y0.b(context, "sp_appId", str);
        } catch (Exception e2) {
            q0.b(q, e2.getMessage());
        }
    }

    public void f(String str) {
        Context context;
        try {
            this.j = str;
            if (TextUtils.isEmpty(str) || (context = this.c) == null) {
                return;
            }
            y0.b(context, "sp_appKey", str);
        } catch (Exception e2) {
            q0.b(q, e2.getMessage());
        }
    }

    public void a(WeakReference<Activity> weakReference) {
        this.e = weakReference;
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.n = new WeakReference<>(context);
        }
    }

    public void a(int i) {
        this.g = i;
    }

    public BitmapDrawable a(String str, int i) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.m) == null || !concurrentHashMap.containsKey(str) || !s0.a().a("w_m_r_l", true)) {
            return null;
        }
        String str2 = this.m.get(str);
        BitmapDrawable n = v0.n(str2);
        j.a(str, i, TextUtils.isEmpty(str2) ? 2 : 1, TextUtils.isEmpty(str2) ? "get watermark failed" : n != null ? "" : "str to bitmap failed", n == null ? 2 : 1, str2);
        return n;
    }

    public void a(JSONObject jSONObject) {
        this.o = jSONObject;
    }

    public void a(String str) {
        try {
            if (this.m != null && !TextUtils.isEmpty(str) && this.m.containsKey(str)) {
                this.m.remove(str);
            }
        } catch (Exception e2) {
            q0.b(q, e2.getMessage());
        }
    }

    public String c() {
        try {
            if (!TextUtils.isEmpty(this.j)) {
                return this.j;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new d());
            return "";
        } catch (Throwable th) {
            q0.b(q, th.getMessage());
            return "";
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (s0.a().a("w_m_r_l", true)) {
            try {
                if (this.h == null) {
                    this.h = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.h.put(next, jSONObject.get(next));
                    }
                }
                if (this.h.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.m == null) {
                        this.m = new ConcurrentHashMap<>();
                    }
                    this.m.put(str, this.h.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e2) {
                q0.b(q, e2.getMessage());
            }
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d = str;
    }

    public String b() {
        try {
            if (!TextUtils.isEmpty(this.b)) {
                return this.b;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            return "";
        } catch (Exception e2) {
            q0.b(q, e2.getMessage());
            return "";
        }
    }

    public void b(String str) {
        Context context;
        try {
            this.f = str;
            if (TextUtils.isEmpty(str) || (context = this.c) == null) {
                return;
            }
            y0.b(context, "applicationIds", str);
        } catch (Exception e2) {
            q0.b(q, e2.getMessage());
        }
    }

    public void b(Context context) {
        this.c = context;
    }
}
