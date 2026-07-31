package io.bidmachine.displays;

import android.text.TextUtils;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.core.Utils;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.unified.UnifiedAdRequestParams;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public class DisplayPlacementBuilder<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> extends PlacementBuilder<UnifiedAdRequestParamsType> {
    private final boolean isFullscreen;

    public DisplayPlacementBuilder(boolean z) {
        super(AdContentType.Static);
        this.isFullscreen = z;
    }

    @Override // io.bidmachine.displays.PlacementBuilder
    @Nullable
    public AdObjectParams createAdObjectParams(@NonNull Ad ad) {
        if (!ad.hasDisplay()) {
            return null;
        }
        Ad.Display display = ad.getDisplay();
        AdObjectParams createHeaderBiddingAdObjectParams = createHeaderBiddingAdObjectParams(ad);
        AdObjectParams adObjectParams = createHeaderBiddingAdObjectParams;
        if (createHeaderBiddingAdObjectParams == null) {
            if (TextUtils.isEmpty(display.getAdm())) {
                return null;
            }
            DisplayAdObjectParams displayAdObjectParams = new DisplayAdObjectParams(ad);
            displayAdObjectParams.setCreativeAdm(display.getAdm());
            adObjectParams = displayAdObjectParams;
        }
        adObjectParams.setWidth(display.getW());
        adObjectParams.setHeight(display.getH());
        return adObjectParams;
    }

    @Override // io.bidmachine.displays.PlacementBuilder
    @NonNull
    public Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, @Nullable AdPlacementConfig adPlacementConfig, int i) throws Exception {
        Size size = getSize(contextProvider, unifiedadrequestparamstype);
        Placement.DisplayPlacement.Builder h = Placement.DisplayPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_MRAID_2_0).addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Constants.IMAGE_MIME_TYPES).setW(size.getWidth()).setH(size.getHeight());
        if (this.isFullscreen) {
            h.setInstl(true);
            h.setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN);
        }
        HeaderBiddingPlacement.Builder createHeaderBiddingPlacement = createHeaderBiddingPlacement(contextProvider, unifiedadrequestparamstype, adsType, collection, list, i);
        if (adPlacementConfig == null && createHeaderBiddingPlacement != null) {
            h.addExtProto(Any.pack(createHeaderBiddingPlacement.build()));
        } else if (adPlacementConfig != null) {
            h.addExtProto(Any.pack(createSdkPlacement(adPlacementConfig, createHeaderBiddingPlacement)));
        }
        return h;
    }

    public Size getSize(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype) {
        return Utils.getScreenSize(contextProvider.getContext());
    }
}
