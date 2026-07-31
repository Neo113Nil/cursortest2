package com.yandex.mobile.ads.common;

import com.ironsource.mediationsdk.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.yandex.mobile.ads.banner.BannerAdSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000  2\u00020\u0001:\u0001 B?\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenRequest;", "", "Lcom/yandex/mobile/ads/common/AdType;", "adType", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", j.h, "Lcom/yandex/mobile/ads/common/AdTargeting;", "targeting", "", "", "parameters", "<init>", "(Lcom/yandex/mobile/ads/common/AdType;Lcom/yandex/mobile/ads/banner/BannerAdSize;Lcom/yandex/mobile/ads/common/AdTargeting;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lcom/yandex/mobile/ads/common/AdType;", "getAdType", "()Lcom/yandex/mobile/ads/common/AdType;", "c", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", "getBannerAdSize", "()Lcom/yandex/mobile/ads/banner/BannerAdSize;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "a", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BidderTokenRequest {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    private final AdType adType;

    /* renamed from: c, reason: from kotlin metadata */
    private final BannerAdSize bannerAdSize;

    /* renamed from: e, reason: from kotlin metadata */
    private final Map parameters;

    public BidderTokenRequest(@NotNull AdType adType, @Nullable BannerAdSize bannerAdSize, @Nullable AdTargeting adTargeting, @NotNull Map<String, String> map) {
        this.adType = adType;
        this.bannerAdSize = bannerAdSize;
        this.parameters = map;
        if (adType == AdType.BANNER && bannerAdSize == null) {
            throw new IllegalArgumentException("bannerAdSize is required for Banner configuration");
        }
    }

    @NotNull
    public static final BidderTokenRequest appOpenAd() {
        return INSTANCE.appOpenAd();
    }

    @NotNull
    public static final BidderTokenRequest banner(@NotNull BannerAdSize bannerAdSize) {
        return INSTANCE.banner(bannerAdSize);
    }

    @NotNull
    public static final BidderTokenRequest interstitial() {
        return INSTANCE.interstitial();
    }

    @NotNull
    public static final BidderTokenRequest nativeAd() {
        return INSTANCE.nativeAd();
    }

    @NotNull
    public static final BidderTokenRequest rewarded() {
        return INSTANCE.rewarded();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(BidderTokenRequest.class, other.getClass())) {
            return false;
        }
        BidderTokenRequest bidderTokenRequest = (BidderTokenRequest) other;
        return this.adType == bidderTokenRequest.adType && Intrinsics.areEqual(this.bannerAdSize, bidderTokenRequest.bannerAdSize) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.parameters, bidderTokenRequest.parameters);
    }

    @NotNull
    public final AdType getAdType() {
        return this.adType;
    }

    @Nullable
    public final BannerAdSize getBannerAdSize() {
        return this.bannerAdSize;
    }

    @NotNull
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        int hashCode = this.adType.hashCode() * 31;
        BannerAdSize bannerAdSize = this.bannerAdSize;
        return this.parameters.hashCode() + ((hashCode + (bannerAdSize != null ? bannerAdSize.hashCode() : 0)) * 961);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\rJ1\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\rJ1\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenRequest$a;", "", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", j.h, "Lcom/yandex/mobile/ads/common/AdTargeting;", "targeting", "", "", "parameters", "Lcom/yandex/mobile/ads/common/BidderTokenRequest;", "banner", "(Lcom/yandex/mobile/ads/banner/BannerAdSize;Lcom/yandex/mobile/ads/common/AdTargeting;Ljava/util/Map;)Lcom/yandex/mobile/ads/common/BidderTokenRequest;", "interstitial", "(Lcom/yandex/mobile/ads/common/AdTargeting;Ljava/util/Map;)Lcom/yandex/mobile/ads/common/BidderTokenRequest;", "rewarded", "nativeAd", "native", "appOpenAd", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yandex.mobile.ads.common.BidderTokenRequest$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BidderTokenRequest appOpenAd$default(Companion companion, AdTargeting adTargeting, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                adTargeting = null;
            }
            if ((i & 2) != 0) {
                map = MapsKt.emptyMap();
            }
            return companion.appOpenAd(adTargeting, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BidderTokenRequest banner$default(Companion companion, BannerAdSize bannerAdSize, AdTargeting adTargeting, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                adTargeting = null;
            }
            if ((i & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            return companion.banner(bannerAdSize, adTargeting, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BidderTokenRequest interstitial$default(Companion companion, AdTargeting adTargeting, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                adTargeting = null;
            }
            if ((i & 2) != 0) {
                map = MapsKt.emptyMap();
            }
            return companion.interstitial(adTargeting, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BidderTokenRequest nativeAd$default(Companion companion, AdTargeting adTargeting, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                adTargeting = null;
            }
            if ((i & 2) != 0) {
                map = MapsKt.emptyMap();
            }
            return companion.nativeAd(adTargeting, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BidderTokenRequest rewarded$default(Companion companion, AdTargeting adTargeting, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                adTargeting = null;
            }
            if ((i & 2) != 0) {
                map = MapsKt.emptyMap();
            }
            return companion.rewarded(adTargeting, map);
        }

        @NotNull
        public final BidderTokenRequest appOpenAd() {
            return appOpenAd$default(this, null, null, 3, null);
        }

        @NotNull
        public final BidderTokenRequest banner(@NotNull BannerAdSize bannerAdSize) {
            return banner$default(this, bannerAdSize, null, null, 6, null);
        }

        @NotNull
        public final BidderTokenRequest interstitial() {
            return interstitial$default(this, null, null, 3, null);
        }

        @NotNull
        public final BidderTokenRequest nativeAd() {
            return nativeAd$default(this, null, null, 3, null);
        }

        @NotNull
        public final BidderTokenRequest rewarded() {
            return rewarded$default(this, null, null, 3, null);
        }

        @NotNull
        public final BidderTokenRequest appOpenAd(@Nullable AdTargeting targeting, @NotNull Map<String, String> parameters) {
            return new BidderTokenRequest(AdType.APP_OPEN_AD, null, targeting, parameters);
        }

        @NotNull
        public final BidderTokenRequest banner(@NotNull BannerAdSize bannerAdSize, @Nullable AdTargeting targeting, @NotNull Map<String, String> parameters) {
            return new BidderTokenRequest(AdType.BANNER, bannerAdSize, targeting, parameters);
        }

        @NotNull
        public final BidderTokenRequest interstitial(@Nullable AdTargeting targeting, @NotNull Map<String, String> parameters) {
            return new BidderTokenRequest(AdType.INTERSTITIAL, null, targeting, parameters);
        }

        @NotNull
        public final BidderTokenRequest nativeAd(@Nullable AdTargeting targeting, @NotNull Map<String, String> parameters) {
            return new BidderTokenRequest(AdType.NATIVE, null, targeting, parameters);
        }

        @NotNull
        public final BidderTokenRequest rewarded(@Nullable AdTargeting targeting, @NotNull Map<String, String> parameters) {
            return new BidderTokenRequest(AdType.REWARDED, null, targeting, parameters);
        }
    }
}
