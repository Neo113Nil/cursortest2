package yads;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider;

/* loaded from: classes14.dex */
public final class op1 implements MediatedNativeAdViewProvider {
    public final np1 a;

    public op1(np1 np1Var) {
        this.a = np1Var;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getAgeView() {
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getBodyView() {
        return this.a.k;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getCallToActionView() {
        return this.a.f;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getDomainView() {
        return this.a.i;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final ImageView getFeedbackView() {
        return this.a.e;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final ImageView getIconView() {
        return this.a.h;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final FrameLayout getMediaView() {
        return this.a.b;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final View getNativeAdView() {
        return this.a;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getPriceView() {
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final View getRatingView() {
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getReviewCountView() {
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getSponsoredView() {
        return this.a.d;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getTitleView() {
        return this.a.j;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getWarningView() {
        return this.a.g;
    }
}
