package io.bidmachine.ads.networks.vast;

import io.bidmachine.iab.CacheControl;
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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0011\u0010\u001b\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006 "}, d2 = {"Lio/bidmachine/ads/networks/vast/VastParams;", "Lio/bidmachine/unified/UnifiedParams;", "unifiedMediationParams", "Lio/bidmachine/unified/UnifiedMediationParams;", "(Lio/bidmachine/unified/UnifiedMediationParams;)V", UnifiedMediationParams.KEY_CACHE_CONTROL, "Lio/bidmachine/iab/CacheControl;", "getCacheControl", "()Lio/bidmachine/iab/CacheControl;", UnifiedMediationParams.KEY_COMPANION_SKIP_OFFSET, "", "getCompanionSkipOffset", "()I", UnifiedMediationParams.KEY_CREATIVE_ADM, "", "getCreativeAdm", "()Ljava/lang/String;", "omsdkEnabled", "", "getOmsdkEnabled", "()Z", UnifiedMediationParams.KEY_PLACEHOLDER_TIMEOUT_SEC, "", "getPlaceholderTimeoutSec", "()F", UnifiedMediationParams.KEY_SKIP_OFFSET, "getSkipOffset", UnifiedMediationParams.KEY_USE_NATIVE_CLOSE, "getUseNativeClose", "isValid", "callback", "Lio/bidmachine/unified/UnifiedAdCallback;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class VastParams extends UnifiedParams {

    @NotNull
    private final CacheControl cacheControl;
    private final int companionSkipOffset;

    @Nullable
    private final String creativeAdm;
    private final boolean omsdkEnabled;
    private final float placeholderTimeoutSec;
    private final int skipOffset;
    private final boolean useNativeClose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VastParams(@NotNull UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        Intrinsics.checkNotNullParameter(unifiedMediationParams, "unifiedMediationParams");
        this.creativeAdm = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_CREATIVE_ADM);
        this.cacheControl = IabUtils.INSTANCE.toCacheControl(unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_CACHE_CONTROL));
        this.placeholderTimeoutSec = unifiedMediationParams.getFloat(UnifiedMediationParams.KEY_PLACEHOLDER_TIMEOUT_SEC);
        this.skipOffset = unifiedMediationParams.getInteger(UnifiedMediationParams.KEY_SKIP_OFFSET);
        this.companionSkipOffset = unifiedMediationParams.getInteger(UnifiedMediationParams.KEY_COMPANION_SKIP_OFFSET);
        this.useNativeClose = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_USE_NATIVE_CLOSE);
        this.omsdkEnabled = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_OM_SDK_ENABLED, true) && AbstractC6023s.c();
    }

    @NotNull
    public final CacheControl getCacheControl() {
        return this.cacheControl;
    }

    public final int getCompanionSkipOffset() {
        return this.companionSkipOffset;
    }

    @Nullable
    public final String getCreativeAdm() {
        return this.creativeAdm;
    }

    public final boolean getOmsdkEnabled() {
        return this.omsdkEnabled;
    }

    public final float getPlaceholderTimeoutSec() {
        return this.placeholderTimeoutSec;
    }

    public final int getSkipOffset() {
        return this.skipOffset;
    }

    public final boolean getUseNativeClose() {
        return this.useNativeClose;
    }

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(@NotNull UnifiedAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str = this.creativeAdm;
        if (str != null && str.length() != 0) {
            return true;
        }
        BMError notFound = BMError.notFound(UnifiedMediationParams.KEY_CREATIVE_ADM);
        Intrinsics.checkNotNullExpressionValue(notFound, "notFound(KEY_CREATIVE_ADM)");
        callback.onAdLoadFailed(notFound);
        return false;
    }
}
