package io.bidmachine.nativead;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.MediaAssetType;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0001H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0000H\u0002R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lio/bidmachine/nativead/NativeAdRequestParameters;", "Lio/bidmachine/AdRequestParameters;", "adPlacementConfig", "Lio/bidmachine/AdPlacementConfig;", "(Lio/bidmachine/AdPlacementConfig;)V", "mediaAssetTypes", "", "Lio/bidmachine/MediaAssetType;", "(Ljava/util/List;)V", "isValidateAssets", "", "()Z", "setValidateAssets", "(Z)V", "", "getMediaAssetTypes", "()Ljava/util/List;", "checkPlacement", "Lio/bidmachine/utils/BMError;", "placement", "Lcom/explorestack/protobuf/adcom/Placement;", "containsAssetType", "mediaAssetType", "isParametersMatched", "adRequestParameters", "isParametersMatchedInternal", "nativeAdRequestParameters", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class NativeAdRequestParameters extends AdRequestParameters {
    private boolean isValidateAssets;

    @NotNull
    private final List<MediaAssetType> mediaAssetTypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdRequestParameters(@NotNull AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
        Intrinsics.checkNotNullParameter(adPlacementConfig, "adPlacementConfig");
        this.isValidateAssets = true;
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        if (adFormat instanceof AdFormat.Native) {
            this.mediaAssetTypes = ((AdFormat.Native) adFormat).getMediaAssetTypes();
            return;
        }
        List<MediaAssetType> DEFAULT = MediaAssetType.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        this.mediaAssetTypes = DEFAULT;
    }

    private final boolean isParametersMatchedInternal(NativeAdRequestParameters nativeAdRequestParameters) {
        return MediaAssetType.isAll(nativeAdRequestParameters.mediaAssetTypes) || nativeAdRequestParameters.mediaAssetTypes.containsAll(this.mediaAssetTypes);
    }

    @Override // io.bidmachine.AdRequestParameters
    @Nullable
    public BMError checkPlacement(@NotNull Placement placement) throws Throwable {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return ProtoUtilsKt.checkNativePlacement(placement);
    }

    public final boolean containsAssetType(@NotNull MediaAssetType mediaAssetType) {
        Intrinsics.checkNotNullParameter(mediaAssetType, "mediaAssetType");
        return this.mediaAssetTypes.isEmpty() || this.mediaAssetTypes.contains(mediaAssetType) || this.mediaAssetTypes.contains(MediaAssetType.All);
    }

    @NotNull
    public final List<MediaAssetType> getMediaAssetTypes() {
        return this.mediaAssetTypes;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(@NotNull AdRequestParameters adRequestParameters) {
        Intrinsics.checkNotNullParameter(adRequestParameters, "adRequestParameters");
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof NativeAdRequestParameters) && isParametersMatchedInternal((NativeAdRequestParameters) adRequestParameters);
    }

    /* renamed from: isValidateAssets, reason: from getter */
    public final boolean getIsValidateAssets() {
        return this.isValidateAssets;
    }

    public final void setValidateAssets(boolean z) {
        this.isValidateAssets = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdRequestParameters(@NotNull List<MediaAssetType> mediaAssetTypes) {
        super(AdPlacementConfig.INSTANCE.nativeBuilder(mediaAssetTypes).build());
        Intrinsics.checkNotNullParameter(mediaAssetTypes, "mediaAssetTypes");
        this.isValidateAssets = true;
        this.mediaAssetTypes = mediaAssetTypes;
    }
}
