package io.bidmachine.interstitial;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.FullScreenAdRequestParameters;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtilsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lio/bidmachine/interstitial/InterstitialAdRequestParameters;", "Lio/bidmachine/FullScreenAdRequestParameters;", "adContentType", "Lio/bidmachine/AdContentType;", "(Lio/bidmachine/AdContentType;)V", "adPlacementConfig", "Lio/bidmachine/AdPlacementConfig;", "(Lio/bidmachine/AdPlacementConfig;)V", "checkPlacement", "Lio/bidmachine/utils/BMError;", "placement", "Lcom/explorestack/protobuf/adcom/Placement;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class InterstitialAdRequestParameters extends FullScreenAdRequestParameters {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdRequestParameters(@NotNull AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
        Intrinsics.checkNotNullParameter(adPlacementConfig, "adPlacementConfig");
    }

    @Override // io.bidmachine.AdRequestParameters
    @Nullable
    public BMError checkPlacement(@NotNull Placement placement) throws Throwable {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return ProtoUtilsKt.checkInterstitialPlacement(placement);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public InterstitialAdRequestParameters(@NotNull AdContentType adContentType) {
        this(AdPlacementConfig.INSTANCE.interstitialBuilder(adContentType).build());
        Intrinsics.checkNotNullParameter(adContentType, "adContentType");
    }
}
