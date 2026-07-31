package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Xb extends B implements NativeAdListener {

    @Nullable
    private AdapterNativeAdViewBinder A;

    @Nullable
    private AdapterNativeAdData z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xb(@NotNull V0 adTools, @NotNull C instanceData, @NotNull I adInstancePayload, @NotNull F listener) {
        super(adTools, instanceData, adInstancePayload, null, listener, 8, null);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.B
    protected void C() {
        if (!(g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData i = i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().f().h().g("activity must not be null");
            return;
        }
        Object g = g();
        Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        Context activeContext = ContextProvider.getInstance().getActiveContext();
        Intrinsics.checkNotNullExpressionValue(activeContext, "getInstance().activeContext");
        ((AdapterNativeAdInterface) g).loadAd(i, activeContext, this);
    }

    @Nullable
    public final AdapterNativeAdData K() {
        return this.z;
    }

    @Nullable
    public final AdapterNativeAdViewBinder L() {
        return this.A;
    }

    @Override // com.ironsource.B
    public void a(@NotNull K adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterNativeAdInterface) {
                Object g = g();
                Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((AdapterNativeAdInterface) g).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            C4782n4.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().f().h().g(str);
        }
        super.b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.z = adapterNativeAdData;
        this.A = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void a(@NotNull Qb nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.a(this.z);
        nativeAdBinder.a(this.A);
    }
}
