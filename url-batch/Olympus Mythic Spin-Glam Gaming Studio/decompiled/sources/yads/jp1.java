package yads;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes15.dex */
public final class jp1 implements MediatedNativeAdViewProvider {
    public final View a;
    public final n22 b;

    public jp1(View view, n22 n22Var) {
        this.a = view;
        this.b = n22Var;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getAgeView() {
        View a = this.b.a("age");
        if (a instanceof TextView) {
            return (TextView) a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getBodyView() {
        View a = this.b.a("body");
        if (a instanceof TextView) {
            return (TextView) a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getCallToActionView() {
        View a = this.b.a("call_to_action");
        if (a instanceof TextView) {
            return (TextView) a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getDomainView() {
        View a = this.b.a("domain");
        if (a instanceof TextView) {
            return (TextView) a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final ImageView getFeedbackView() {
        View a = this.b.a("feedback");
        if (a instanceof ImageView) {
            return (ImageView) a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final ImageView getIconView() {
        View a = this.b.a("icon");
        if (a instanceof ImageView) {
            return (ImageView) a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final FrameLayout getMediaView() {
        View a = this.b.a("media");
        if (a instanceof CustomizableMediaView) {
            return (CustomizableMediaView) a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final View getNativeAdView() {
        return this.a;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getPriceView() {
        View a = this.b.a("price");
        if (a instanceof TextView) {
            return (TextView) a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final View getRatingView() {
        return this.b.a("rating");
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getReviewCountView() {
        View a = this.b.a("review_count");
        if (a instanceof TextView) {
            return (TextView) a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getSponsoredView() {
        View a = this.b.a("sponsored");
        if (a instanceof TextView) {
            return (TextView) a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getTitleView() {
        View a = this.b.a("title");
        if (a instanceof TextView) {
            return (TextView) a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getWarningView() {
        View a = this.b.a("warning");
        if (a instanceof TextView) {
            return (TextView) a;
        }
        return null;
    }
}
