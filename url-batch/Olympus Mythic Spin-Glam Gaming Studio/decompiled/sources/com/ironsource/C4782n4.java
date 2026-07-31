package com.ironsource;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.n4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4782n4 {
    private static final String k = "1.0.6";
    public static String l = "";
    private final InterfaceC4986y7 a;
    private String b;
    private String c;
    private String d;
    private String e;
    private ContextProvider f;
    public Thread.UncaughtExceptionHandler g;
    public String h;
    private String i;
    private boolean j;

    /* renamed from: com.ironsource.n4$a */
    class a implements InterfaceC4562b {
        a() {
        }

        @Override // com.ironsource.InterfaceC4562b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" ");
                    sb.append("(");
                    sb.append(thread.getState().toString());
                    sb.append(")");
                    sb.append(" ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            C4782n4.l = sb.toString();
        }

        @Override // com.ironsource.InterfaceC4562b
        public void b() {
        }
    }

    /* renamed from: com.ironsource.n4$b */
    class b implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        b(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String I = C4782n4.this.a.I(this.a);
                if (!TextUtils.isEmpty(I)) {
                    C4782n4.this.c = I;
                }
                String c = C4782n4.this.a.c(this.a);
                if (!TextUtils.isEmpty(c)) {
                    C4782n4.this.e = c;
                }
                SharedPreferences.Editor edit = this.a.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", C4782n4.this.c);
                edit.putString("sId", this.b);
                edit.apply();
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* renamed from: com.ironsource.n4$c */
    class c extends RunnableC4800o4 {
        c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.ironsource.n4$d */
    private static class d {
        static volatile C4782n4 a = new C4782n4();

        private d() {
        }
    }

    private C4782n4() {
        this.j = false;
        this.a = Kb.Y().a();
        this.f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.g = defaultUncaughtExceptionHandler;
        this.i = " ";
        this.h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C4746l4(defaultUncaughtExceptionHandler));
    }

    static List<K5> c() {
        return null;
    }

    public static C4782n4 d() {
        return d.a;
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) {
        Context applicationContext = this.f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.h = str;
            }
            this.d = str3;
            if (z) {
                new C4535a(i).a(z2).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public String b() {
        return k;
    }

    String e() {
        return this.i;
    }

    public void a(Throwable th) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.j);
        if (!this.j || th == null) {
            return;
        }
        new K5(new C4764m4(th).b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    private void a(Context context, HashSet<String> hashSet) {
        String a2 = a(a());
        if (a2.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.c);
        String string2 = sharedPreferences.getString("sId", this.d);
        List<K5> b2 = E4.b();
        IronLog.INTERNAL.verbose("reportList size " + b2.size());
        for (K5 k5 : b2) {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            String b3 = k5.b();
            String e = k5.e();
            String d2 = k5.d();
            String packageName = context.getPackageName();
            JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
            try {
                ActivityManager.MemoryInfo o = this.a.o(context);
                if (o != null) {
                    jsonObjectInit2.put("availRam", this.a.c(o));
                    jsonObjectInit2.put(O6.x, this.a.b(o));
                    jsonObjectInit2.put("mThreshold", this.a.a(o));
                }
                String t = this.a.t();
                if (t != null) {
                    jsonObjectInit2.put(O6.z, t);
                }
                jsonObjectInit2.put("crashDate", b3);
                jsonObjectInit2.put("stacktraceCrash", e);
                jsonObjectInit2.put("crashType", d2);
                jsonObjectInit2.put("CrashReporterVersion", k);
                jsonObjectInit2.put(X3.j.q, "9.4.4");
                jsonObjectInit2.put(X3.j.x, this.a.d(context));
                jsonObjectInit2.put(X3.j.W, E1.b(context, packageName));
                jsonObjectInit2.put(X3.j.n, this.a.i());
                jsonObjectInit2.put("network", a2);
                jsonObjectInit2.put(X3.j.p, this.a.e());
                jsonObjectInit2.put("deviceModel", this.a.l());
                jsonObjectInit2.put("totalRam", this.a.r(context));
                jsonObjectInit2.put(Wa.o, this.a.f());
                jsonObjectInit2.put("advertisingId", string);
                jsonObjectInit2.put("deviceOEM", this.a.q());
                jsonObjectInit2.put("systemProperties", System.getProperties());
                jsonObjectInit2.put("bundleId", packageName);
                jsonObjectInit2.put("sId", string2);
                if (!TextUtils.isEmpty(this.e)) {
                    jsonObjectInit2.put(X3.j.M, Boolean.parseBoolean(this.e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jsonObjectInit = jsonObjectInit2;
                } else {
                    Iterator<String> it = hashSet.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            if (jsonObjectInit2.has(next)) {
                                jsonObjectInit.put(next, jsonObjectInit2.opt(next));
                            }
                        } catch (Exception e2) {
                            IronLog.INTERNAL.error(e2.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jsonObjectInit.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jsonObjectInit)).start();
            }
        }
        E4.a();
    }

    Context a() {
        return this.f.getApplicationContext();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return T3.b;
            }
            return networkCapabilities.hasTransport(0) ? T3.g : "none";
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.toString());
            return "none";
        }
    }
}
