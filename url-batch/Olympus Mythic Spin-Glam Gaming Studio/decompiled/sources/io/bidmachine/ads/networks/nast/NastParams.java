package io.bidmachine.ads.networks.nast;

import io.bidmachine.Function;
import io.bidmachine.LabelData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.internal.C6016k;
import io.bidmachine.nativead.NativeAdRequestParameters;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012R\u0019\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b#\u0010\u0012R\u0019\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010\u0012R\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lio/bidmachine/ads/networks/nast/NastParams;", "Lio/bidmachine/unified/UnifiedParams;", "Lio/bidmachine/unified/UnifiedMediationParams;", "unifiedMediationParams", "<init>", "(Lio/bidmachine/unified/UnifiedMediationParams;)V", "Lio/bidmachine/unified/UnifiedAdCallback;", "callback", "", "isValid", "(Lio/bidmachine/unified/UnifiedAdCallback;)Z", "Lio/bidmachine/unified/UnifiedNativeAdRequestParams;", "adRequestParams", "(Lio/bidmachine/unified/UnifiedNativeAdRequestParams;Lio/bidmachine/unified/UnifiedAdCallback;)Z", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "description", "getDescription", "callToAction", "getCallToAction", "", "rating", "Ljava/lang/Float;", "getRating", "()Ljava/lang/Float;", UnifiedMediationParams.KEY_ICON_URL, "getIconUrl", UnifiedMediationParams.KEY_IMAGE_URL, "getImageUrl", UnifiedMediationParams.KEY_VIDEO_URL, "getVideoUrl", UnifiedMediationParams.KEY_VIDEO_ADM, "getVideoAdm", UnifiedMediationParams.KEY_CLICK_URL, "getClickUrl", "Lio/bidmachine/LabelData;", "adLabelData", "Lio/bidmachine/LabelData;", "getAdLabelData", "()Lio/bidmachine/LabelData;", "Lio/bidmachine/PrivacySheetData;", "privacySheetData", "Lio/bidmachine/PrivacySheetData;", "getPrivacySheetData", "()Lio/bidmachine/PrivacySheetData;", "Lio/bidmachine/internal/k;", "disclaimerData", "Lio/bidmachine/internal/k;", "getDisclaimerData", "()Lio/bidmachine/internal/k;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class NastParams extends UnifiedParams {

    @Nullable
    private final LabelData adLabelData;

    @Nullable
    private final String callToAction;

    @Nullable
    private final String clickUrl;

    @Nullable
    private final String description;

    @Nullable
    private final C6016k disclaimerData;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String imageUrl;

    @Nullable
    private final PrivacySheetData privacySheetData;

    @Nullable
    private final Float rating;

    @Nullable
    private final String title;

    @Nullable
    private final String videoAdm;

    @Nullable
    private final String videoUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NastParams(@NotNull UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        Intrinsics.checkNotNullParameter(unifiedMediationParams, "unifiedMediationParams");
        this.title = unifiedMediationParams.getStringOrNull("title");
        this.description = unifiedMediationParams.getStringOrNull("description");
        this.callToAction = unifiedMediationParams.getStringOrNull("cta");
        this.rating = unifiedMediationParams.getFloatOrNull("rating");
        this.iconUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_ICON_URL);
        this.imageUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_IMAGE_URL);
        this.videoUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_VIDEO_URL);
        this.videoAdm = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_VIDEO_ADM);
        this.clickUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_CLICK_URL);
        this.adLabelData = (LabelData) unifiedMediationParams.getOrNullSafely(UnifiedMediationParams.KEY_AD_LABEL, new Function() { // from class: io.bidmachine.ads.networks.nast.NastParams$$ExternalSyntheticLambda0
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                LabelData adLabelData$lambda$0;
                adLabelData$lambda$0 = NastParams.adLabelData$lambda$0(obj);
                return adLabelData$lambda$0;
            }
        });
        this.privacySheetData = (PrivacySheetData) unifiedMediationParams.getOrNullSafely(UnifiedMediationParams.KEY_PRIVACY_SHEET, new Function() { // from class: io.bidmachine.ads.networks.nast.NastParams$$ExternalSyntheticLambda1
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                PrivacySheetData privacySheetData$lambda$1;
                privacySheetData$lambda$1 = NastParams.privacySheetData$lambda$1(obj);
                return privacySheetData$lambda$1;
            }
        });
        this.disclaimerData = (C6016k) unifiedMediationParams.getOrNullSafely(UnifiedMediationParams.KEY_DISCLAIMER, new Function() { // from class: io.bidmachine.ads.networks.nast.NastParams$$ExternalSyntheticLambda2
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                C6016k disclaimerData$lambda$2;
                disclaimerData$lambda$2 = NastParams.disclaimerData$lambda$2(obj);
                return disclaimerData$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LabelData adLabelData$lambda$0(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof LabelData) {
            return (LabelData) it;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6016k disclaimerData$lambda$2(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C6016k) {
            return (C6016k) it;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrivacySheetData privacySheetData$lambda$1(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof PrivacySheetData) {
            return (PrivacySheetData) it;
        }
        return null;
    }

    @Nullable
    public final LabelData getAdLabelData() {
        return this.adLabelData;
    }

    @Nullable
    public final String getCallToAction() {
        return this.callToAction;
    }

    @Nullable
    public final String getClickUrl() {
        return this.clickUrl;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final C6016k getDisclaimerData() {
        return this.disclaimerData;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final PrivacySheetData getPrivacySheetData() {
        return this.privacySheetData;
    }

    @Nullable
    public final Float getRating() {
        return this.rating;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getVideoAdm() {
        return this.videoAdm;
    }

    @Nullable
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(@NotNull UnifiedAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str = this.title;
        if (str == null || str.length() == 0) {
            BMError notFound = BMError.notFound("title");
            Intrinsics.checkNotNullExpressionValue(notFound, "notFound(KEY_TITLE)");
            callback.onAdLoadFailed(notFound);
            return false;
        }
        String str2 = this.callToAction;
        if (str2 != null && str2.length() != 0) {
            return true;
        }
        BMError notFound2 = BMError.notFound("cta");
        Intrinsics.checkNotNullExpressionValue(notFound2, "notFound(KEY_CTA)");
        callback.onAdLoadFailed(notFound2);
        return false;
    }

    public final boolean isValid(@NotNull UnifiedNativeAdRequestParams adRequestParams, @NotNull UnifiedAdCallback callback) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!isValid(callback)) {
            return false;
        }
        NativeAdRequestParameters adRequestParameters = adRequestParams.getAdRequestParameters();
        Intrinsics.checkNotNullExpressionValue(adRequestParameters, "adRequestParams.getAdRequestParameters()");
        if (adRequestParameters.getIsValidateAssets() && adRequestParameters.containsAssetType(MediaAssetType.Icon) && ((str2 = this.iconUrl) == null || str2.length() == 0)) {
            BMError notFound = BMError.notFound(UnifiedMediationParams.KEY_ICON_URL);
            Intrinsics.checkNotNullExpressionValue(notFound, "notFound(KEY_ICON_URL)");
            callback.onAdLoadFailed(notFound);
            return false;
        }
        if (adRequestParameters.getIsValidateAssets() && adRequestParameters.containsAssetType(MediaAssetType.Image) && ((str = this.imageUrl) == null || str.length() == 0)) {
            BMError notFound2 = BMError.notFound(UnifiedMediationParams.KEY_IMAGE_URL);
            Intrinsics.checkNotNullExpressionValue(notFound2, "notFound(KEY_IMAGE_URL)");
            callback.onAdLoadFailed(notFound2);
            return false;
        }
        if (!adRequestParameters.getIsValidateAssets() || !adRequestParameters.containsAssetType(MediaAssetType.Video)) {
            return true;
        }
        String str3 = this.videoAdm;
        if (str3 != null && str3.length() != 0) {
            return true;
        }
        String str4 = this.videoUrl;
        if (str4 != null && str4.length() != 0) {
            return true;
        }
        BMError notFound3 = BMError.notFound("videoAdm or videoUrl");
        Intrinsics.checkNotNullExpressionValue(notFound3, "notFound(\"$KEY_VIDEO_ADM or $KEY_VIDEO_URL\")");
        callback.onAdLoadFailed(notFound3);
        return false;
    }
}
