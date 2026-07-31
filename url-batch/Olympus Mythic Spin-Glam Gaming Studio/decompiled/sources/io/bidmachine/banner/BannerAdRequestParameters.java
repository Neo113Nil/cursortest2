package io.bidmachine.banner;

import com.explorestack.protobuf.adcom.Placement;
import com.ironsource.mediationsdk.j;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.BannerAdSize;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtilsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0000H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/bidmachine/banner/BannerAdRequestParameters;", "Lio/bidmachine/AdRequestParameters;", "adPlacementConfig", "Lio/bidmachine/AdPlacementConfig;", "(Lio/bidmachine/AdPlacementConfig;)V", "bannerSize", "Lio/bidmachine/banner/BannerSize;", "(Lio/bidmachine/banner/BannerSize;)V", j.h, "Lio/bidmachine/BannerAdSize;", "getBannerAdSize", "()Lio/bidmachine/BannerAdSize;", "checkPlacement", "Lio/bidmachine/utils/BMError;", "placement", "Lcom/explorestack/protobuf/adcom/Placement;", "getBannerSize", "isParametersMatched", "", "adRequestParameters", "isParametersMatchedInternal", "bannerAdRequestParameters", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerAdRequestParameters extends AdRequestParameters {

    @NotNull
    private final BannerAdSize bannerAdSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdRequestParameters(@NotNull AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
        Intrinsics.checkNotNullParameter(adPlacementConfig, "adPlacementConfig");
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        if (adFormat instanceof AdFormat.Banner) {
            this.bannerAdSize = ((AdFormat.Banner) adFormat).getBannerAdSize();
        } else {
            this.bannerAdSize = BannerAdSize.Banner;
        }
    }

    private final boolean isParametersMatchedInternal(BannerAdRequestParameters bannerAdRequestParameters) {
        return this.bannerAdSize.isSuitable(bannerAdRequestParameters.bannerAdSize);
    }

    @Override // io.bidmachine.AdRequestParameters
    @Nullable
    public BMError checkPlacement(@NotNull Placement placement) throws Throwable {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return ProtoUtilsKt.checkBannerPlacement(placement, this.bannerAdSize);
    }

    @NotNull
    public final BannerAdSize getBannerAdSize() {
        return this.bannerAdSize;
    }

    @Deprecated
    @NotNull
    public final BannerSize getBannerSize() {
        BannerSize fromBannerAdSize = BannerSize.fromBannerAdSize(this.bannerAdSize);
        Intrinsics.checkNotNullExpressionValue(fromBannerAdSize, "fromBannerAdSize(bannerAdSize)");
        return fromBannerAdSize;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(@NotNull AdRequestParameters adRequestParameters) {
        Intrinsics.checkNotNullParameter(adRequestParameters, "adRequestParameters");
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof BannerAdRequestParameters) && isParametersMatchedInternal((BannerAdRequestParameters) adRequestParameters);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BannerAdRequestParameters(@NotNull BannerSize bannerSize) {
        this(r0.bannerBuilder(r3).build());
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        AdPlacementConfig.Companion companion = AdPlacementConfig.INSTANCE;
        BannerAdSize bannerAdSize = BannerSize.toBannerAdSize(bannerSize);
        Intrinsics.checkNotNullExpressionValue(bannerAdSize, "toBannerAdSize(bannerSize)");
    }
}
