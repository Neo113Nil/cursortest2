package com.monetization.ads.mediation.nativeads.assets;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedFeedbackFactory;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedSponsoredFactory;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.mobile.ads.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/monetization/ads/mediation/nativeads/assets/DefaultMediatedAssetFactory;", "Lcom/monetization/ads/mediation/nativeads/assets/MediatedAssetFactory;", "Landroid/content/Context;", "context", "Lcom/monetization/ads/mediation/nativeads/assets/factories/DefaultMediatedSponsoredFactory;", "defaultMediatedSponsoredFactory", "Lcom/monetization/ads/mediation/nativeads/assets/factories/DefaultMediatedFeedbackFactory;", "defaultMediatedFeedbackFactory", "<init>", "(Landroid/content/Context;Lcom/monetization/ads/mediation/nativeads/assets/factories/DefaultMediatedSponsoredFactory;Lcom/monetization/ads/mediation/nativeads/assets/factories/DefaultMediatedFeedbackFactory;)V", "", "makeDefaultSponsored", "()Ljava/lang/String;", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "makeDefaultFeedback", "()Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DefaultMediatedAssetFactory implements MediatedAssetFactory {
    private final Context a;
    private final DefaultMediatedSponsoredFactory b;
    private final DefaultMediatedFeedbackFactory c;

    public DefaultMediatedAssetFactory(@NotNull Context context, @NotNull DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, @NotNull DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory) {
        this.a = context;
        this.b = defaultMediatedSponsoredFactory;
        this.c = defaultMediatedFeedbackFactory;
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    @NotNull
    public MediatedNativeAdImage makeDefaultFeedback() {
        return this.c.makeFeedback(this.a, R$drawable.monetization_ads_mediation_api_feedback_icon);
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    @NotNull
    public String makeDefaultSponsored() {
        return this.b.makeSponsored(this.a, R$string.monetization_ads_mediation_api_sponsored_text);
    }

    public /* synthetic */ DefaultMediatedAssetFactory(Context context, DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new DefaultMediatedSponsoredFactory() : defaultMediatedSponsoredFactory, (i & 4) != 0 ? new DefaultMediatedFeedbackFactory() : defaultMediatedFeedbackFactory);
    }
}
