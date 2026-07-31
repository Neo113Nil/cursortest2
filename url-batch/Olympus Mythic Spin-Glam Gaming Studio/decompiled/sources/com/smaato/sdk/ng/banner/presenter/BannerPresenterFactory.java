package com.smaato.sdk.ng.banner.presenter;

import android.content.Context;
import android.view.View;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.models.ImpressionTrackingMethod;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.presenter.AdPresenter;
import com.smaato.sdk.ng.presenter.PresenterFactory;
import com.smaato.sdk.ng.utils.Logger;

/* loaded from: classes15.dex */
public class BannerPresenterFactory extends PresenterFactory {
    private static final String c = "BannerPresenterFactory";

    public BannerPresenterFactory(Context context, IntegrationType integrationType) {
        super(context, integrationType);
    }

    protected AdPresenter a(int i, Ad ad, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod) {
        return a(i, ad, adSize, impressionTrackingMethod, null);
    }

    public AdPresenter fromCreativeType(int i, Ad ad, AdSize adSize) {
        return a(i, ad, adSize, ImpressionTrackingMethod.AD_VIEWABLE);
    }

    @Override // com.smaato.sdk.ng.presenter.PresenterFactory
    protected AdPresenter a(int i, Ad ad, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod, View view) {
        if (ad != null && ad.getImpressionTrackingMethod() != null && ImpressionTrackingMethod.fromString(ad.getImpressionTrackingMethod()) != null) {
            impressionTrackingMethod = ImpressionTrackingMethod.fromString(ad.getImpressionTrackingMethod());
        }
        ImpressionTrackingMethod impressionTrackingMethod2 = impressionTrackingMethod;
        if (i == 4) {
            return new VastAdPresenter(a(), ad, adSize, impressionTrackingMethod2, this.b, view);
        }
        if (i != 8 && i != 10 && i != 12) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    Logger.e(c, "Incompatible asset group type: " + i + ", for banner ad format.");
                    return null;
            }
        }
        return new MraidAdPresenter(a(), ad, adSize, impressionTrackingMethod2, view);
    }
}
