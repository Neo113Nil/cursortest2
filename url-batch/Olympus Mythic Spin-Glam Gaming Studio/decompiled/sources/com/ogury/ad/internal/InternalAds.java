package com.ogury.ad.internal;

import android.content.Context;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C4901tg;
import com.ogury.ad.common.OnAdsInitListener;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0017\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\tJ*\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lcom/ogury/ad/internal/InternalAds;", "", "()V", C4901tg.b, "", "setChildUnderCoppaTreatment", "", "isChildUnderCoppa", "", "(Ljava/lang/Boolean;)V", "setUnderAgeOfGdprConsentTreatment", "isUnderAgeOfGdprConsent", "start", "context", "Landroid/content/Context;", "assetKey", AppLovinEventTypes.USER_VIEWED_PRODUCT, "Lcom/ogury/ad/internal/Product;", "onAdsInitListener", "Lcom/ogury/ad/common/OnAdsInitListener;", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InternalAds {
    static {
        new InternalAds();
    }

    private InternalAds() {
    }

    @NotNull
    public static final String getVersion() {
        h9.b.getClass();
        return "5.2.2";
    }

    public static final void setChildUnderCoppaTreatment(@Nullable Boolean isChildUnderCoppa) {
        c3 c3Var = c3.a;
        Intrinsics.checkNotNullParameter("IS_CHILD_UNDER_COPPA", "key");
        if (isChildUnderCoppa != null) {
            c3.b.putBoolean("IS_CHILD_UNDER_COPPA", isChildUnderCoppa.booleanValue());
        } else {
            Intrinsics.checkNotNullParameter("IS_CHILD_UNDER_COPPA", "configurationKey");
            c3.b.remove("IS_CHILD_UNDER_COPPA");
        }
    }

    public static final void setUnderAgeOfGdprConsentTreatment(@Nullable Boolean isUnderAgeOfGdprConsent) {
        c3 c3Var = c3.a;
        Intrinsics.checkNotNullParameter("IS_UNDER_AGE_OF_GDPR_CONSENT", "key");
        if (isUnderAgeOfGdprConsent != null) {
            c3.b.putBoolean("IS_UNDER_AGE_OF_GDPR_CONSENT", isUnderAgeOfGdprConsent.booleanValue());
        } else {
            Intrinsics.checkNotNullParameter("IS_UNDER_AGE_OF_GDPR_CONSENT", "configurationKey");
            c3.b.remove("IS_UNDER_AGE_OF_GDPR_CONSENT");
        }
    }

    public static final void start(@NotNull Context context, @NotNull String assetKey, @Nullable Product product, @NotNull OnAdsInitListener onAdsInitListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetKey, "assetKey");
        Intrinsics.checkNotNullParameter(onAdsInitListener, "onAdsInitListener");
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, "Module started");
        h9 h9Var = h9.a;
        c0 adsConfig = new c0(context, assetKey, product, onAdsInitListener);
        Intrinsics.checkNotNullParameter(adsConfig, "adsConfig");
        IntegrationLogger.d(logTag, sourceTag, "Setting up...");
        h9.b.a(adsConfig);
    }
}
