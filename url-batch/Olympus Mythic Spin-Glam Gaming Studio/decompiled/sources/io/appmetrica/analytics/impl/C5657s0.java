package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5657s0 implements InterfaceC5202ab {
    public final Context a;
    public final IHandlerExecutor b;
    public final C5739v4 c = new C5739v4();
    public final Handler d = f().getHandler();
    public final C5322f2 e = new C5322f2();
    public final Gb f = new Gb();

    public C5657s0(@NotNull Context context, @NotNull C5402i4 c5402i4) {
        this.a = context;
        this.b = c5402i4.a();
        BaseReleaseLogger.init(context);
        f().execute(new Runnable() { // from class: io.appmetrica.analytics.impl.s0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C5657s0.e();
            }
        });
        a().a();
        W3.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 8.1.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 13.04.2026.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    @NotNull
    public final C5739v4 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    @NotNull
    public final Handler b() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    @NotNull
    public final C5322f2 c() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    @NotNull
    public final Gb d() {
        return this.f;
    }

    @NotNull
    public final IHandlerExecutor f() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    public final ICommonExecutor getDefaultExecutor() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(@Nullable AppMetricaConfig appMetricaConfig, @NotNull InterfaceC5564ob interfaceC5564ob) {
        try {
            if (!A0.g) {
                if (appMetricaConfig != null) {
                    Boolean bool = appMetricaConfig.crashReporting;
                    if (bool == null) {
                        bool = Boolean.TRUE;
                    }
                    if (!bool.booleanValue()) {
                        this.f.a();
                        if (appMetricaConfig != null) {
                            Boolean bool2 = appMetricaConfig.appOpenTrackingEnabled;
                            if (bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            if (!bool2.booleanValue()) {
                                this.e.c();
                                if (appMetricaConfig != null) {
                                    A0.g = true;
                                }
                            }
                        }
                        this.e.b();
                        if (appMetricaConfig != null) {
                        }
                    }
                }
                this.f.c();
                this.f.b();
                if (appMetricaConfig != null) {
                    this.f.a(this.a, appMetricaConfig, interfaceC5564ob);
                }
                if (appMetricaConfig != null) {
                }
                this.e.b();
                if (appMetricaConfig != null) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
