package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.fk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5340fk implements InterfaceC5512mb, IPluginReporter {
    public final ArrayList a = new ArrayList();
    public volatile C5701ti b;

    @Override // io.appmetrica.analytics.impl.InterfaceC5512mb, io.appmetrica.analytics.impl.InterfaceC5617qb
    public final void a(@NonNull C5421io c5421io) {
        a(new Oj(c5421io));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        a(new C5211ak());
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        a(new Ij());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        a(new Zj(str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        a(new Pj(adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        a(new Xj(map));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        a(new Mj(eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th) {
        a(new Ej(str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        a(new C5263ck(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        a(new Lj(revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        a(new Gj(th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        a(new Kj(userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        a(new Hj());
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        a(new C5237bk());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        a(new Nj(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        a(new Vj(str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        a(new Jj(str));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5512mb, io.appmetrica.analytics.impl.InterfaceC5398i0
    public final void a(@NonNull X x) {
        a(new Yj(x));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
        a(new Wj(adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        a(new Fj(str, str2, null));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
        a(new C5289dk(str, str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        a(new Qj(pluginErrorDetails));
    }

    public final void a(@NotNull InterfaceC5417ik interfaceC5417ik) {
        a(new Tj(interfaceC5417ik));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @NonNull Throwable th) {
        a(new Fj(str, str2, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        a(new C5314ek(str, map));
    }

    public final synchronized void a(InterfaceC5486lb interfaceC5486lb) {
        try {
            if (this.b == null) {
                this.a.add(interfaceC5486lb);
            } else {
                interfaceC5486lb.a(this.b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        a(new Rj(pluginErrorDetails, str));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        a(new Uj(moduleEvent));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        a(new Sj(str, str2, pluginErrorDetails));
    }
}
