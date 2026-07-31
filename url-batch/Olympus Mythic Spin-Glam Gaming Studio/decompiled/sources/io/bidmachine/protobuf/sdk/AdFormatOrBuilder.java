package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.sdk.AdFormat;

/* loaded from: classes6.dex */
public interface AdFormatOrBuilder extends MessageOrBuilder {
    AdFormat.Banner getBanner();

    AdFormat.BannerOrBuilder getBannerOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    AdFormat.Interstitial getInterstitial();

    AdFormat.InterstitialOrBuilder getInterstitialOrBuilder();

    AdFormat.Native getNative();

    AdFormat.NativeOrBuilder getNativeOrBuilder();

    AdFormat.Rewarded getRewarded();

    AdFormat.RewardedOrBuilder getRewardedOrBuilder();

    AdFormat.SpecCase getSpecCase();

    boolean hasBanner();

    boolean hasInterstitial();

    boolean hasNative();

    boolean hasRewarded();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
