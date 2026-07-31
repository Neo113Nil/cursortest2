package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ti, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5701ti implements InterfaceC5512mb {
    public final B0 a;
    public final Nh b;
    public final IHandlerExecutor c;
    public final Context d;
    public final ReporterConfig e;
    public final Di f;
    public final C5438jf g;

    public C5701ti(@NonNull ICommonExecutor iCommonExecutor, @NonNull Context context, @NonNull String str) {
        this(context.getApplicationContext(), str, new B0());
    }

    public static InterfaceC5512mb a(B0 b0, Context context, ReporterConfig reporterConfig) {
        b0.getClass();
        return A0.a(context).f().c(reporterConfig);
    }

    public final void c(@NonNull String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC5364gi(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC5624qi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Yh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC5597pi(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new RunnableC5261ci(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.b.j.a(map);
        this.f.getClass();
        this.c.execute(new RunnableC5519mi(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.b.i.a(eCommerceEvent);
        this.f.getClass();
        this.c.execute(new RunnableC5312ei(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th) {
        this.b.b.a(str);
        this.f.getClass();
        if (th == null) {
            th = new C5193a2();
            th.fillInStackTrace();
        }
        this.c.execute(new Uh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC5649ri(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        this.b.g.a(revenue);
        this.f.getClass();
        this.c.execute(new RunnableC5235bi(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        this.b.e.a(th);
        this.f.getClass();
        this.c.execute(new Wh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        this.b.f.a(userProfile);
        this.f.getClass();
        this.c.execute(new RunnableC5209ai(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Xh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC5571oi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC5338fi(this, z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC5441ji(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Zh(this, str));
    }

    public C5701ti(Context context, String str, B0 b0) {
        this(context, new Nh(), b0, new Di(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5512mb, io.appmetrica.analytics.impl.InterfaceC5617qb
    public final void a(@NonNull C5421io c5421io) {
        this.b.d.a(c5421io);
        this.f.getClass();
        this.c.execute(new RunnableC5493li(this, c5421io));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new RunnableC5467ki(this, adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC5675si(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        this.b.c.a(str);
        this.f.getClass();
        this.c.execute(new Vh(this, str, str2, th));
    }

    public C5701ti(Context context, Nh nh, B0 b0, Di di, ReporterConfig reporterConfig) {
        this(context, nh, b0, di, reporterConfig, new C5438jf(new C5287di(b0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5512mb, io.appmetrica.analytics.impl.InterfaceC5398i0
    public final void a(@NonNull X x) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC5545ni(this, x));
    }

    public C5701ti(Context context, Nh nh, B0 b0, Di di, ReporterConfig reporterConfig, C5438jf c5438jf) {
        this.c = C5661s4.l().g().a();
        this.d = context;
        this.b = nh;
        this.a = b0;
        this.f = di;
        this.e = reporterConfig;
        this.g = c5438jf;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new Th(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC5390hi(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC5415ii(this, moduleEvent));
    }
}
