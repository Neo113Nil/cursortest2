package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Zb extends L0 {

    @NotNull
    private final InternalNativeAdListener a;

    public Zb(@NotNull InternalNativeAdListener mNativeAdListener) {
        Intrinsics.checkNotNullParameter(mNativeAdListener, "mNativeAdListener");
        this.a = mNativeAdListener;
    }

    @Override // com.ironsource.L0
    public void a(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder nativeAdViewBinder, @Nullable AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.L0
    public void d(@Nullable AdInfo adInfo) {
        this.a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.L0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4684hd placement, @Nullable AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.a.onNativeAdClicked(adInfo);
    }
}
