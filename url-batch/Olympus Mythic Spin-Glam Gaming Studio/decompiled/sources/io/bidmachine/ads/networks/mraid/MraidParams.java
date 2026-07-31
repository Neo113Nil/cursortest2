package io.bidmachine.ads.networks.mraid;

import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.internal.AbstractC6023s;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.IabUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u000201H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010!\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0011\u0010#\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010%\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010'\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016R\u0013\u0010)\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0012R\u0011\u0010+\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0011\u0010-\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0016¨\u00062"}, d2 = {"Lio/bidmachine/ads/networks/mraid/MraidParams;", "Lio/bidmachine/unified/UnifiedParams;", "unifiedMediationParams", "Lio/bidmachine/unified/UnifiedMediationParams;", "(Lio/bidmachine/unified/UnifiedMediationParams;)V", UnifiedMediationParams.KEY_CACHE_CONTROL, "Lio/bidmachine/iab/CacheControl;", "getCacheControl", "()Lio/bidmachine/iab/CacheControl;", "closeableViewStyle", "Lio/bidmachine/iab/utils/IabElementStyle;", "getCloseableViewStyle", "()Lio/bidmachine/iab/utils/IabElementStyle;", "countDownStyle", "getCountDownStyle", UnifiedMediationParams.KEY_CREATIVE_ADM, "", "getCreativeAdm", "()Ljava/lang/String;", "height", "", "getHeight", "()I", "omsdkEnabled", "", "getOmsdkEnabled", "()Z", UnifiedMediationParams.KEY_PLACEHOLDER_TIMEOUT_SEC, "", "getPlaceholderTimeoutSec", "()F", "progressDuration", "getProgressDuration", "progressStyle", "getProgressStyle", UnifiedMediationParams.KEY_R1, "getR1", UnifiedMediationParams.KEY_R2, "getR2", UnifiedMediationParams.KEY_SKIP_OFFSET, "getSkipOffset", "storeUrl", "getStoreUrl", UnifiedMediationParams.KEY_USE_NATIVE_CLOSE, "getUseNativeClose", "width", "getWidth", "isValid", "callback", "Lio/bidmachine/unified/UnifiedAdCallback;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class MraidParams extends UnifiedParams {

    @NotNull
    private final CacheControl cacheControl;

    @Nullable
    private final IabElementStyle closeableViewStyle;

    @Nullable
    private final IabElementStyle countDownStyle;

    @Nullable
    private final String creativeAdm;
    private final int height;
    private final boolean omsdkEnabled;
    private final float placeholderTimeoutSec;
    private final int progressDuration;

    @Nullable
    private final IabElementStyle progressStyle;
    private final boolean r1;
    private final boolean r2;
    private final int skipOffset;

    @Nullable
    private final String storeUrl;
    private final boolean useNativeClose;
    private final int width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MraidParams(@NotNull UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        Intrinsics.checkNotNullParameter(unifiedMediationParams, "unifiedMediationParams");
        this.creativeAdm = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_CREATIVE_ADM);
        this.width = unifiedMediationParams.getInteger("width");
        this.height = unifiedMediationParams.getInteger("height");
        this.useNativeClose = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_USE_NATIVE_CLOSE);
        this.omsdkEnabled = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_OM_SDK_ENABLED, true) && AbstractC6023s.c();
        IabUtils iabUtils = IabUtils.INSTANCE;
        this.cacheControl = iabUtils.toCacheControl(unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_CACHE_CONTROL));
        this.placeholderTimeoutSec = unifiedMediationParams.getFloat(UnifiedMediationParams.KEY_PLACEHOLDER_TIMEOUT_SEC);
        this.skipOffset = unifiedMediationParams.getInteger(UnifiedMediationParams.KEY_SKIP_OFFSET);
        this.r1 = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_R1);
        this.r2 = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_R2);
        this.storeUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_STORE_URL);
        this.progressDuration = unifiedMediationParams.getInteger(UnifiedMediationParams.KEY_PROGRESS_DURATION);
        this.closeableViewStyle = iabUtils.toIabElementStyle(unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_CLOSE_BUTTON_CONTROL_ASSET));
        this.countDownStyle = iabUtils.toIabElementStyle(unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_COUNTDOWN_CONTROL_ASSET));
        this.progressStyle = iabUtils.toIabElementStyle(unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_PROGRESS_CONTROL_ASSET));
    }

    @NotNull
    public final CacheControl getCacheControl() {
        return this.cacheControl;
    }

    @Nullable
    public final IabElementStyle getCloseableViewStyle() {
        return this.closeableViewStyle;
    }

    @Nullable
    public final IabElementStyle getCountDownStyle() {
        return this.countDownStyle;
    }

    @Nullable
    public final String getCreativeAdm() {
        return this.creativeAdm;
    }

    public final int getHeight() {
        return this.height;
    }

    public final boolean getOmsdkEnabled() {
        return this.omsdkEnabled;
    }

    public final float getPlaceholderTimeoutSec() {
        return this.placeholderTimeoutSec;
    }

    public final int getProgressDuration() {
        return this.progressDuration;
    }

    @Nullable
    public final IabElementStyle getProgressStyle() {
        return this.progressStyle;
    }

    public final boolean getR1() {
        return this.r1;
    }

    public final boolean getR2() {
        return this.r2;
    }

    public final int getSkipOffset() {
        return this.skipOffset;
    }

    @Nullable
    public final String getStoreUrl() {
        return this.storeUrl;
    }

    public final boolean getUseNativeClose() {
        return this.useNativeClose;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(@NotNull UnifiedAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str = this.creativeAdm;
        if (str == null || str.length() == 0) {
            BMError notFound = BMError.notFound(UnifiedMediationParams.KEY_CREATIVE_ADM);
            Intrinsics.checkNotNullExpressionValue(notFound, "notFound(KEY_CREATIVE_ADM)");
            callback.onAdLoadFailed(notFound);
            return false;
        }
        if (this.width == 0) {
            BMError notFound2 = BMError.notFound("width");
            Intrinsics.checkNotNullExpressionValue(notFound2, "notFound(KEY_WIDTH)");
            callback.onAdLoadFailed(notFound2);
            return false;
        }
        if (this.height != 0) {
            return true;
        }
        BMError notFound3 = BMError.notFound("height");
        Intrinsics.checkNotNullExpressionValue(notFound3, "notFound(KEY_HEIGHT)");
        callback.onAdLoadFailed(notFound3);
        return false;
    }
}
