package com.yandex.mobile.ads.common;

import android.content.Context;
import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import yads.gv1;
import yads.hv1;
import yads.jv1;
import yads.nt3;
import yads.pq0;
import yads.ua;
import yads.uw2;
import yads.vw2;
import yads.zq3;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/yandex/mobile/ads/common/YandexAds;", "", "", "consent", "", "setUserConsent", "(Z)V", "enableLogging", "Landroid/content/Context;", "context", "Lcom/yandex/mobile/ads/common/InitializationListener;", "initializationListener", "initialize", "(Landroid/content/Context;Lcom/yandex/mobile/ads/common/InitializationListener;)V", "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "adapterIdentity", "setAdapterIdentity", "(Lcom/yandex/mobile/ads/common/AdapterIdentity;)V", "", "getLibraryVersion", "()Ljava/lang/String;", "getLibraryVersion$annotations", "()V", "libraryVersion", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@MainThread
/* loaded from: classes10.dex */
public final class YandexAds {

    @NotNull
    public static final YandexAds INSTANCE = new YandexAds();

    private YandexAds() {
    }

    public static final void enableLogging(boolean enableLogging) {
        jv1.a(enableLogging);
    }

    @NotNull
    public static final String getLibraryVersion() {
        return "8.1.0";
    }

    public static final void initialize(@NotNull Context context, @NotNull InitializationListener initializationListener) {
        zq3 zq3Var = new zq3(initializationListener);
        nt3 nt3Var = new nt3(context);
        new pq0().a(new gv1(context, nt3Var, zq3Var), new hv1(context, nt3Var, zq3Var));
    }

    public static final void setAdapterIdentity(@NotNull AdapterIdentity adapterIdentity) {
        ua uaVar = new ua(adapterIdentity.getAdapterNetworkName(), adapterIdentity.getAdapterVersion(), adapterIdentity.getAdapterNetworkVersion());
        vw2 a = uw2.a();
        synchronized (vw2.k) {
            a.i = uaVar;
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void setUserConsent(boolean consent) {
        vw2 a = uw2.a();
        synchronized (vw2.k) {
            a.b = Boolean.valueOf(consent);
            Unit unit = Unit.INSTANCE;
        }
    }
}
