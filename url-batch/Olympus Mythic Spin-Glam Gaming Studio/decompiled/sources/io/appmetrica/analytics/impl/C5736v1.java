package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.v1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5736v1 {
    public final B0 a;
    public final ap b;
    public final Bi c;
    public final V7 d;
    public final Bl e;
    public final N2 f;
    public final C5784wn g;
    public final C5627ql h;

    public C5736v1(B0 b0, N2 n2, Bl bl, ap apVar, C5784wn c5784wn, Bi bi, V7 v7, C5627ql c5627ql) {
        this.a = b0;
        this.b = apVar;
        this.c = bi;
        this.d = v7;
        this.f = n2;
        this.g = c5784wn;
        this.e = bl;
        this.h = c5627ql;
    }

    public static IHandlerExecutor b() {
        return C5661s4.l().c.a();
    }

    public final void a(@NonNull final Context context, @NonNull final AppMetricaConfig appMetricaConfig) {
        N2 n2 = this.f;
        n2.f.a(context);
        n2.b.a(appMetricaConfig);
        C5784wn c5784wn = this.g;
        Context applicationContext = context.getApplicationContext();
        c5784wn.e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c5784wn.d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c5784wn.a.getClass();
        A0 a = A0.a(applicationContext);
        a.d.a(appMetricaConfig, a);
        IHandlerExecutor b = b();
        ((U9) b).b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.v1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C5736v1.this.b(context, appMetricaConfig);
            }
        });
        this.a.getClass();
        B0.b();
    }

    public final Fc c() {
        this.a.getClass();
        return A0.e.f().i();
    }

    public final void d() {
        c().a.a(this.h.a());
    }

    public final void e() {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new Y0(this));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        B0 b0 = this.a;
        Context applicationContext = context.getApplicationContext();
        b0.getClass();
        A0 a = A0.a(applicationContext);
        a.f().b(this.d.a(appMetricaConfig));
        Context context2 = a.a;
        ((U9) C5661s4.l().c.a()).execute(new RunnableC5814y1(context2));
    }

    public final void d(@Nullable String str) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new V0(this, str));
    }

    public final void c(@Nullable Activity activity) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5424j1(this, activity));
    }

    public C5736v1() {
        this(C5661s4.l().d(), new ap());
    }

    public final void d(@NonNull String str, @Nullable String str2) {
        N2 n2 = this.f;
        n2.a.a(null);
        if (n2.n.a(str).a) {
            this.g.getClass();
            IHandlerExecutor b = b();
            ((U9) b).b.post(new RunnableC5321f1(this, str, str2));
        }
    }

    public C5736v1(B0 b0, ap apVar) {
        this(b0, new N2(b0), new Bl(b0), apVar, new C5784wn(b0, apVar), Bi.a(), C5661s4.l().j(), C5661s4.l().o());
    }

    public final void c(@NonNull String str, @Nullable String str2) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.r.a(str);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5607q1(this, str, str2));
    }

    public final void b(@NonNull String str) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.r.a(str);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5580p1(this, str));
    }

    public final void c(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new S0(this, z));
    }

    public final void b(@NonNull Activity activity) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.c.a(activity);
        this.g.getClass();
        Intent a = C5784wn.a(activity);
        IHandlerExecutor b = b();
        ((U9) b).b.post(new O0(this, a));
    }

    public final void c(@NonNull String str) {
        if (this.e.a((Void) null).a && this.f.m.a(str).a) {
            this.g.getClass();
            IHandlerExecutor b = b();
            ((U9) b).b.post(new RunnableC5347g1(this, str));
        }
    }

    public final void b(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new U0(this, z));
    }

    public final void a(@Nullable Activity activity) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5554o1(this, activity));
    }

    public final void b(@NonNull String str, @Nullable String str2) {
        this.f.k.a(str);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5270d1(this, str, str2));
    }

    public final void c(@NonNull Context context) {
        this.f.f.a(context);
        this.g.e.a(context);
        this.a.getClass();
        A0.a(context);
    }

    public final void a(@NonNull Application application) {
        this.f.e.a(application);
        this.g.c.a(application);
        IHandlerExecutor b = b();
        ((U9) b).b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.v1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C5736v1.this.d();
            }
        });
    }

    @NonNull
    public final IdentifiersResult b(@NonNull Context context) {
        this.f.f.a(context);
        C5784wn c5784wn = this.g;
        Context applicationContext = context.getApplicationContext();
        c5784wn.e.a(applicationContext);
        c5784wn.f.a(applicationContext);
        return C5661s4.l().a(context.getApplicationContext()).a();
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.r.a(str);
        this.g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5632r1(this, str, listFromMap));
    }

    public final void b(@NonNull final Object... objArr) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.v1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C5736v1.a(objArr);
            }
        });
    }

    public final void a(@NonNull String str, @Nullable Throwable th) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.s.a(str);
        this.g.getClass();
        if (th == null) {
            th = new C5193a2();
            th.fillInStackTrace();
        }
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5658s1(this, str, th));
    }

    public final void a(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.t.a(str);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5684t1(this, str, str2, th));
    }

    public final void a(@NonNull Throwable th) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.u.a(th);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5710u1(this, th));
    }

    public final void a(@NonNull String str) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.i.a(str);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new P0(this, str));
    }

    public final void a(@NonNull Intent intent) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.d.a(intent);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new Q0(this, intent));
    }

    public final void a(@Nullable Location location) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new R0(this, location));
    }

    public final void a(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new T0(this, z));
    }

    public final void a(@NonNull UserProfile userProfile) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.v.a(userProfile);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new W0(this, userProfile));
    }

    public final void a(@NonNull Revenue revenue) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.w.a(revenue);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new X0(this, revenue));
    }

    public final void a(@NonNull AdRevenue adRevenue) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.x.a(adRevenue);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new Z0(this, adRevenue));
    }

    public final void a(@NonNull ECommerceEvent eCommerceEvent) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.y.a(eCommerceEvent);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5192a1(this, eCommerceEvent));
    }

    public final void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.g.a(deferredDeeplinkParametersListener);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5218b1(this, deferredDeeplinkParametersListener));
    }

    public final void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.g.a(deferredDeeplinkListener);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5244c1(this, deferredDeeplinkListener));
    }

    @NonNull
    public final InterfaceC5512mb a(@NonNull Context context, @NonNull String str) {
        N2 n2 = this.f;
        n2.f.a(context);
        n2.j.a(str);
        C5784wn c5784wn = this.g;
        c5784wn.e.a(context.getApplicationContext());
        return this.c.a(context.getApplicationContext(), str);
    }

    public final void a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        N2 n2 = this.f;
        n2.f.a(context);
        n2.h.a(reporterConfig);
        C5784wn c5784wn = this.g;
        c5784wn.e.a(context.getApplicationContext());
        Bi bi = this.c;
        Context applicationContext = context.getApplicationContext();
        if (((C5701ti) bi.a.get(reporterConfig.apiKey)) == null) {
            synchronized (bi.a) {
                try {
                    if (((C5701ti) bi.a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor a = C5661s4.l().c.a();
                        bi.b.getClass();
                        if (A0.e == null) {
                            ((U9) a).b.post(new RunnableC5857zi(bi, applicationContext));
                        }
                        C5701ti c5701ti = new C5701ti(applicationContext.getApplicationContext(), str, new B0());
                        bi.a.put(str, c5701ti);
                        c5701ti.a(reporterConfig);
                    }
                } finally {
                }
            }
        }
    }

    public final void a(@NonNull WebView webView) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.l.a(webView);
        ap apVar = this.g.b;
        apVar.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA);
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Xo xo = new Xo();
                synchronized (apVar) {
                    try {
                        PublicLogger publicLogger = apVar.b;
                        if (publicLogger == null) {
                            apVar.a.add(xo);
                        } else {
                            xo.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                apVar.a(new Yo());
            }
        } catch (Throwable th) {
            apVar.a(new Zo(th));
        }
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5295e1(this));
    }

    @Nullable
    public final String a(@NonNull Context context) {
        this.f.f.a(context);
        C5784wn c5784wn = this.g;
        c5784wn.e.a(context.getApplicationContext());
        IdentifiersResult identifiersResult = (IdentifiersResult) C5661s4.l().d(context.getApplicationContext()).b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void a(@NonNull String str, @Nullable String str2) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5373h1(this, str, str2));
    }

    public final void a() {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5399i1(this));
    }

    public final void a(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        N2 n2 = this.f;
        n2.f.a(context);
        n2.o.a(startupParamsCallback);
        C5784wn c5784wn = this.g;
        c5784wn.e.a(context.getApplicationContext());
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5450k1(this, context, startupParamsCallback, list));
    }

    public final void a(@NonNull AnrListener anrListener) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.p.a(anrListener);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5476l1(this, anrListener));
    }

    public final void a(@NonNull ExternalAttribution externalAttribution) {
        N2 n2 = this.f;
        n2.a.a(null);
        n2.q.a(externalAttribution);
        this.g.getClass();
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5502m1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor b = C5661s4.l().m().b();
        if (b != null) {
            b.process(objArr);
        }
    }

    public final void a(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f.z.a(map);
        this.g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor b = b();
        ((U9) b).b.post(new RunnableC5528n1(this, listFromMap));
    }

    public static InterfaceC5383hb a(C5736v1 c5736v1) {
        return c5736v1.c().a;
    }
}
