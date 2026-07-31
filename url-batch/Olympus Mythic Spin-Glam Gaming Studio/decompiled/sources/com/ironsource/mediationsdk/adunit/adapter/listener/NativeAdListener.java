package com.ironsource.mediationsdk.adunit.adapter.listener;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public interface NativeAdListener extends AdapterAdListener {
    void onAdLoadSuccess(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder);
}
