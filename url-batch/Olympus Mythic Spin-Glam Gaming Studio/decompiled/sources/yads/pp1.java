package yads;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class pp1 implements MediatedNativeAdapterListener {
    public final wp1 a;
    public final qp1 b;
    public final rp1 c;
    public final sp1 d;
    public final Object e;
    public final Context f;
    public final WeakReference g;

    public pp1(Context context, wp1 wp1Var, qp1 qp1Var, rp1 rp1Var, sp1 sp1Var, Object obj) {
        this.a = wp1Var;
        this.b = qp1Var;
        this.c = rp1Var;
        this.d = sp1Var;
        this.e = obj;
        this.f = context.getApplicationContext();
        this.g = new WeakReference(context);
    }

    public final void a(MediatedNativeAd mediatedNativeAd) {
        MediatedBannerAdapter.MediatedBannerAdapterListener mediatedBannerAdapterListener;
        synchronized (this.e) {
            mediatedBannerAdapterListener = (MediatedBannerAdapter.MediatedBannerAdapterListener) this.d.mo4828invoke();
        }
        if (mediatedBannerAdapterListener == null) {
            this.b.mo4828invoke();
            mediatedNativeAd.destroy();
            return;
        }
        Context context = (Context) this.g.get();
        if (context == null) {
            context = this.f;
        }
        this.b.mo4828invoke();
        this.a.getClass();
        mediatedBannerAdapterListener.onAdLoaded(wp1.a(context, mediatedNativeAd));
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClicked() {
        synchronized (this.e) {
            MediatedBannerAdapter.MediatedBannerAdapterListener mediatedBannerAdapterListener = (MediatedBannerAdapter.MediatedBannerAdapterListener) this.d.mo4828invoke();
            if (mediatedBannerAdapterListener != null) {
                mediatedBannerAdapterListener.onAdClicked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClosed() {
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdFailedToLoad(MediatedAdRequestError mediatedAdRequestError) {
        this.b.mo4828invoke();
        this.c.invoke(mediatedAdRequestError);
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdImpression() {
        synchronized (this.e) {
            MediatedBannerAdapter.MediatedBannerAdapterListener mediatedBannerAdapterListener = (MediatedBannerAdapter.MediatedBannerAdapterListener) this.d.mo4828invoke();
            if (mediatedBannerAdapterListener != null) {
                mediatedBannerAdapterListener.onAdImpression();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdOpened() {
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAppInstallAdLoaded(MediatedNativeAd mediatedNativeAd) {
        a(mediatedNativeAd);
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onContentAdLoaded(MediatedNativeAd mediatedNativeAd) {
        a(mediatedNativeAd);
    }
}
