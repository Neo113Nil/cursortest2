package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class E0 implements InterfaceC5228bb {
    public final Context a;
    public final InterfaceC5202ab b;
    public final C5594pf c;
    public final C5342fm d;
    public final C5699tg e;
    public final Wf f;
    public final C5779wi g;
    public final Ji h;
    public final V7 i;
    public final C5627ql j;
    public volatile Fc k;
    public final C5553o0 l;
    public boolean m;

    @WorkerThread
    public E0(@NotNull Context context, @NotNull InterfaceC5202ab interfaceC5202ab) {
        this.a = context;
        this.b = interfaceC5202ab;
        C5594pf b = C5661s4.l().b(context);
        this.c = b;
        ArrayList a = Md.a();
        C5661s4 l = C5661s4.l();
        l.m().a(new C5221b4(context));
        F0.a(context).a(a);
        Wf a2 = F0.a(context, F0.a(interfaceC5202ab.b(), this));
        this.f = a2;
        V7 j = l.j();
        this.i = j;
        Ji a3 = F0.a(a2, context, interfaceC5202ab.getDefaultExecutor());
        this.h = a3;
        j.a(a3);
        C5342fm a4 = F0.a(context, a3, interfaceC5202ab.b());
        this.d = a4;
        a3.a(a4);
        this.e = F0.a(a3, b, interfaceC5202ab.b());
        this.g = F0.a(context, a2, a3, interfaceC5202ab.b(), a4);
        this.j = l.o();
        this.l = new C5553o0(b);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @WorkerThread
    @NotNull
    public final InterfaceC5512mb c(@NotNull ReporterConfig reporterConfig) {
        return this.g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    @WorkerThread
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @AnyThread
    @NotNull
    public final C5667sa d() {
        return this.d.e();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @AnyThread
    @Nullable
    public final String e() {
        return this.d.d();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @AnyThread
    @Nullable
    public final Map<String, String> g() {
        return this.d.b();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @AnyThread
    @NotNull
    public final AdvIdentifiersResult h() {
        return this.d.a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @AnyThread
    @Nullable
    public final Fc i() {
        return this.k;
    }

    public final InterfaceC5383hb j() {
        Fc fc = this.k;
        Intrinsics.checkNotNull(fc);
        return fc.a;
    }

    @AnyThread
    @NotNull
    public final C5779wi k() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    @WorkerThread
    public final void putAppEnvironmentValue(@NotNull String str, @NotNull String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    @WorkerThread
    public final void setDataSendingEnabled(boolean z) {
        j().setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    @WorkerThread
    public final void setUserProfileID(@Nullable String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @WorkerThread
    public final void a(@NotNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C5553o0 c5553o0 = this.l;
        C5813y0 c5813y0 = c5553o0.b;
        c5813y0.getClass();
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c5813y0.a.b() && Intrinsics.areEqual(c5813y0.b.a, Boolean.TRUE)) {
            newConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        newConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig build = newConfigBuilder.build();
        AppMetricaConfig.Builder f = c5553o0.a.f();
        if (f != null) {
            if (f.build().advIdentifiersTracking == null && (bool = build.advIdentifiersTracking) != null) {
                f.withAdvIdentifiersTracking(bool.booleanValue());
            }
            build = f.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, build, new D0(this, build, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @WorkerThread
    public final void b(@NotNull AppMetricaConfig appMetricaConfig) {
        boolean z;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a = a(orCreateMainPublicLogger, appMetricaConfig, new C0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (a || this.m) {
            z = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z = true;
        }
        if (a || z) {
            this.c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (a) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.m = true;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.S6
    @AnyThread
    public final void a(int i, @NotNull Bundle bundle) {
        this.d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @WorkerThread
    public final void a(@NotNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @WorkerThread
    public final void a(@NotNull DeferredDeeplinkListener deferredDeeplinkListener) {
        this.e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @WorkerThread
    public final void a(@NotNull ReporterConfig reporterConfig) {
        this.g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @WorkerThread
    public final void a(@NotNull StartupParamsCallback startupParamsCallback, @NotNull List<String> list) {
        this.d.a(startupParamsCallback, list, Cb.c(this.f.a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, Rc rc, boolean z) {
        if (this.k == null) {
            a(publicLogger, appMetricaConfig, z);
            this.e.a();
            Dc a = rc.a();
            Q7 q7 = new Q7(a);
            Fc fc = new Fc(a, q7);
            this.b.c().a(q7);
            this.k = fc;
            C5 c5 = this.j.b;
            synchronized (c5) {
                try {
                    c5.a = a;
                    Iterator it = c5.b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5749ve) it.next()).consume(a);
                    }
                    c5.b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        rc.a();
        return false;
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.b.d().a(this.a, appMetricaConfig, this);
            this.b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.j.a();
        } else {
            C5627ql c5627ql = this.j;
            synchronized (c5627ql) {
                if (c5627ql.g) {
                    c5627ql.a.unregisterListener(c5627ql.c, ActivityEvent.RESUMED);
                    c5627ql.a.unregisterListener(c5627ql.d, ActivityEvent.PAUSED);
                    c5627ql.g = false;
                }
            }
        }
        this.f.d(appMetricaConfig);
        C5342fm c5342fm = this.d;
        c5342fm.e = publicLogger;
        c5342fm.b(appMetricaConfig.customHosts);
        C5342fm c5342fm2 = this.d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        c5342fm2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.d.a(str);
        if (str != null) {
            this.d.b("api");
        }
        this.h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z));
        this.d.i();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    @WorkerThread
    public final void a(@Nullable Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    @WorkerThread
    public final void a(boolean z) {
        j().a(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    @WorkerThread
    public final void a(boolean z, boolean z2) {
        j().a(z, z2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    @WorkerThread
    public final void a(@NotNull String str, @NotNull String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    @WorkerThread
    public final void a(@NotNull String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5564ob
    public final InterfaceC5538nb a() {
        return this.g;
    }
}
