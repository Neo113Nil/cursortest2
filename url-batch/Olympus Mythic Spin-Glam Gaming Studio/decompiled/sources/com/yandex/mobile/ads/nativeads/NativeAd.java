package com.yandex.mobile.ads.nativeads;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdBindingResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAd;", "", "Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "viewBinder", "Lcom/yandex/mobile/ads/common/AdBindingResult;", "bindNativeAd", "(Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;)Lcom/yandex/mobile/ads/common/AdBindingResult;", "Lcom/yandex/mobile/ads/nativeads/NativeAdEventListener;", "eventListener", "", "setNativeAdEventListener", "(Lcom/yandex/mobile/ads/nativeads/NativeAdEventListener;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAdAssets;", "getAdAssets", "()Lcom/yandex/mobile/ads/nativeads/NativeAdAssets;", "adAssets", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@MainThread
/* loaded from: classes4.dex */
public interface NativeAd {
    @CheckResult
    @NotNull
    AdBindingResult bindNativeAd(@NotNull NativeAdViewBinder viewBinder);

    @NotNull
    NativeAdAssets getAdAssets();

    void setNativeAdEventListener(@Nullable NativeAdEventListener eventListener);
}
