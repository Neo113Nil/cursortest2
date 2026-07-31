package com.vungle.ads;

import android.content.Context;
import android.os.Handler;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.h;
import com.vungle.ads.internal.j0;
import com.vungle.ads.internal.k0;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.s;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.y;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012B!\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u0004\u0018\u00010\f¨\u0006\u0015"}, d2 = {"Lcom/vungle/ads/BannerAd;", "Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/VungleAdSize;", "getAdViewSize", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/k0;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/k0;", "constructAdInternal", "", "finishAd", "Lcom/vungle/ads/BannerView;", "getBannerView", "", "placementId", "adSize", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;)V", "Lcom/vungle/ads/BannerAdSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/BannerAdSize;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes14.dex */
public final class BannerAd extends BaseAd {
    public final VungleAdSize s;
    public BannerView t;
    public final j0 u;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerAdSize.values().length];
            iArr[BannerAdSize.BANNER.ordinal()] = 1;
            iArr[BannerAdSize.BANNER_SHORT.ordinal()] = 2;
            iArr[BannerAdSize.BANNER_LEADERBOARD.ordinal()] = 3;
            iArr[BannerAdSize.VUNGLE_MREC.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BannerAd(Context context, String str, VungleAdSize vungleAdSize, AdConfig adConfig) {
        super(context, str, adConfig);
        this.s = vungleAdSize;
        AnalyticsClient.INSTANCE.a(new m2(Sdk.SDKMetric.SDKMetricType.DEPRECATED_API_USED), getLogEntry(), "BannerAd is deprecated");
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.u = ((k0) adInternal$vungle_ads_release).a(new b() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.b
            public void onAdClick(@Nullable String id) {
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new Function0() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(BannerAd.this);
                        }
                    }
                });
                BannerAd.this.getDisplayToClickMetric().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 displayToClickMetric = BannerAd.this.getDisplayToClickMetric();
                analyticsClient.a(displayToClickMetric, BannerAd.this.getLogEntry(), displayToClickMetric.b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdEnd(@Nullable String id) {
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new Function0() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(BannerAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdImpression(@Nullable String id) {
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new Function0() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(BannerAd.this);
                        }
                    }
                });
                BannerAd.this.getPresentToDisplayMetric().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 presentToDisplayMetric = BannerAd.this.getPresentToDisplayMetric();
                analyticsClient.a(presentToDisplayMetric, BannerAd.this.getLogEntry(), presentToDisplayMetric.b);
                BannerAd.this.getDisplayToClickMetric().e();
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(@Nullable String id) {
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new Function0() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(BannerAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(@Nullable String id) {
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdStart(@Nullable String id) {
                j signalManager$vungle_ads_release = BannerAd.this.getSignalManager$vungle_ads_release();
                synchronized (signalManager$vungle_ads_release) {
                    signalManager$vungle_ads_release.h.f++;
                }
                BannerAd.this.getAdInternal$vungle_ads_release().l.d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 t1Var = BannerAd.this.getAdInternal$vungle_ads_release().l;
                analyticsClient.a(t1Var, BannerAd.this.getLogEntry(), t1Var.b);
                BannerAd.this.getPresentToDisplayMetric().e();
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new Function0() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(BannerAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onFailure(@NotNull final VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                BannerAd.this.getShowToFailMetric().d();
                AnalyticsClient.INSTANCE.a(BannerAd.this.getShowToFailMetric(), BannerAd.this.getLogEntry(), String.valueOf(error.getCode()));
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new Function0() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(BannerAd.this, error);
                        }
                    }
                });
            }
        });
    }

    public final void finishAd() {
        Handler handler = y.a;
        y.a(new Function0() { // from class: com.vungle.ads.BannerAd$finishAd$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                BannerView bannerView;
                bannerView = BannerAd.this.t;
                if (bannerView != null) {
                    bannerView.finishAdInternal(true);
                }
            }
        });
    }

    @NotNull
    public final VungleAdSize getAdViewSize() {
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        VungleAdSize m = ((k0) adInternal$vungle_ads_release).m();
        return m == null ? this.s : m;
    }

    @Nullable
    public final BannerView getBannerView() {
        i3 i3Var;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new m2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), 4);
        BannerView bannerView = this.t;
        if (bannerView != null) {
            return bannerView;
        }
        getAdInternal$vungle_ads_release().k.e();
        final VungleError a = getAdInternal$vungle_ads_release().a(true);
        if (a != null) {
            if (getAdInternal$vungle_ads_release().a(a.getCode())) {
                getAdInternal$vungle_ads_release().a(h.g);
            }
            Handler handler = y.a;
            y.a(new Function0() { // from class: com.vungle.ads.BannerAd$getBannerView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    BaseAdListener adListener = BannerAd.this.getAdListener();
                    if (adListener != null) {
                        adListener.onAdFailedToPlay(BannerAd.this, a);
                    }
                }
            });
            return null;
        }
        h0 h0Var = getAdInternal$vungle_ads_release().c;
        if (h0Var == null || (i3Var = getAdInternal$vungle_ads_release().d) == null) {
            return null;
        }
        getAdInternal$vungle_ads_release().a();
        try {
            try {
                this.t = new BannerView(getContext(), i3Var, h0Var, getAdViewSize(), getAdConfig(), this.u);
                getResponseToShowMetric().d();
                t1 responseToShowMetric = getResponseToShowMetric();
                analyticsClient.a(responseToShowMetric, getLogEntry(), responseToShowMetric.b);
                getAdInternal$vungle_ads_release().k.d();
                t1 t1Var = getAdInternal$vungle_ads_release().k;
                analyticsClient.a(t1Var, getLogEntry(), t1Var.b);
                getAdInternal$vungle_ads_release().l.e();
                return this.t;
            } catch (InstantiationException e) {
                boolean z = u.a;
                t.a("BannerAd", "Can not create banner view: " + e.getMessage(), e);
                getResponseToShowMetric().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                t1 responseToShowMetric2 = getResponseToShowMetric();
                analyticsClient2.a(responseToShowMetric2, getLogEntry(), responseToShowMetric2.b);
                return null;
            }
        } catch (Throwable th) {
            getResponseToShowMetric().d();
            AnalyticsClient analyticsClient3 = AnalyticsClient.INSTANCE;
            t1 responseToShowMetric3 = getResponseToShowMetric();
            analyticsClient3.a(responseToShowMetric3, getLogEntry(), responseToShowMetric3.b);
            throw th;
        }
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public k0 constructAdInternal$vungle_ads_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new k0(context, this.s);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerAd(@NotNull Context context, @NotNull String placementId, @NotNull VungleAdSize adSize) {
        this(context, placementId, adSize, new AdConfig());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BannerAd(@NotNull Context context, @NotNull String placementId, @NotNull BannerAdSize adSize) {
        this(context, placementId, r4, new AdConfig());
        VungleAdSize vungleAdSize;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        VungleAdSize.Companion companion = VungleAdSize.INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[adSize.ordinal()];
        if (i == 1) {
            vungleAdSize = VungleAdSize.BANNER;
        } else if (i == 2) {
            vungleAdSize = VungleAdSize.BANNER_SHORT;
        } else if (i == 3) {
            vungleAdSize = VungleAdSize.BANNER_LEADERBOARD;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            vungleAdSize = VungleAdSize.MREC;
        }
    }
}
