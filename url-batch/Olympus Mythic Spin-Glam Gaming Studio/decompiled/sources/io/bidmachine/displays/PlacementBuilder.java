package io.bidmachine.displays;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.CustomParams;
import io.bidmachine.Executable;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.core.Utils;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.sdk.Placement;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.ProtoUtils;
import java.util.Collection;
import java.util.List;

/* loaded from: classes14.dex */
public abstract class PlacementBuilder<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {

    @NonNull
    private final AdContentType contentType;

    @NonNull
    private final b headerBiddingPlacementBuilder = new b();

    PlacementBuilder(@NonNull AdContentType adContentType) {
        this.contentType = adContentType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createSdkPlacement$0(Placement.Builder builder, CustomParams customParams) {
        Struct.Builder newBuilder = Struct.newBuilder();
        customParams.fillStructBuilder(newBuilder);
        if (newBuilder.getFieldsCount() > 0) {
            builder.setCustomData(newBuilder);
        }
    }

    @Nullable
    public abstract AdObjectParams createAdObjectParams(@NonNull Ad ad);

    @Nullable
    AdObjectParams createHeaderBiddingAdObjectParams(@NonNull Ad ad) {
        return this.headerBiddingPlacementBuilder.a(ad);
    }

    @Nullable
    HeaderBiddingPlacement.Builder createHeaderBiddingPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, int i) {
        return this.headerBiddingPlacementBuilder.a(contextProvider, unifiedadrequestparamstype, adsType, getAdContentType(), collection, list, i);
    }

    @NonNull
    @Deprecated
    public Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, int i) throws Exception {
        return createPlacement(contextProvider, unifiedadrequestparamstype, adsType, collection, list, null, i);
    }

    @NonNull
    public abstract Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, @Nullable AdPlacementConfig adPlacementConfig, int i) throws Exception;

    @NonNull
    Placement createSdkPlacement(@NonNull AdPlacementConfig adPlacementConfig, @Nullable HeaderBiddingPlacement.Builder builder) {
        final Placement.Builder newBuilder = Placement.newBuilder();
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        newBuilder.setAdFormat(ProtoUtils.createAdFormatBuilder(adFormat));
        newBuilder.setAdType(adFormat.getAdsType().getName());
        String placementId = adPlacementConfig.getPlacementId();
        if (!TextUtils.isEmpty(placementId)) {
            newBuilder.setPlacementId(StringValue.of(placementId));
        }
        Utils.ifNotNull(adPlacementConfig.getCustomParams(), new Executable() { // from class: io.bidmachine.displays.PlacementBuilder$$ExternalSyntheticLambda0
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                PlacementBuilder.lambda$createSdkPlacement$0(Placement.Builder.this, (CustomParams) obj);
            }
        });
        if (builder != null) {
            newBuilder.setHbPlacement(builder);
        }
        return newBuilder.build();
    }

    public AdContentType getAdContentType() {
        return this.contentType;
    }

    @Nullable
    public HeaderBiddingAd obtainHeaderBiddingAd(@NonNull Ad ad) {
        return this.headerBiddingPlacementBuilder.b(ad);
    }
}
