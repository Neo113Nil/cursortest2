package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class Qb {

    @Nullable
    private AdapterNativeAdViewBinder a;

    @Nullable
    private AdapterNativeAdData b;

    public final void a(@Nullable AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.a = adapterNativeAdViewBinder;
    }

    @Nullable
    public final AdapterNativeAdViewBinder b() {
        return this.a;
    }

    @Nullable
    public final AdapterNativeAdData a() {
        return this.b;
    }

    public final void a(@Nullable AdapterNativeAdData adapterNativeAdData) {
        this.b = adapterNativeAdData;
    }
}
