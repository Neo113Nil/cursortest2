package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ui, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C5727ui implements InterfaceC5512mb {
    public final C5464kf a = new C5464kf();

    @Override // io.appmetrica.analytics.impl.InterfaceC5512mb, io.appmetrica.analytics.impl.InterfaceC5398i0
    public final void a(@NonNull X x) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5512mb, io.appmetrica.analytics.impl.InterfaceC5617qb
    public final void a(@NonNull C5421io c5421io) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
    }

    public void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th) {
    }

    public void reportEvent(@NonNull ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
    }
}
