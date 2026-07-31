package sg.bigo.ads.ad.banner;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.InterfaceC4667ge;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.cl.a;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* loaded from: classes14.dex */
public final class i extends sg.bigo.ads.d.c<InnerBannerAd, sg.bigo.ads.api.core.b> implements sg.bigo.ads.aj.d<InnerBannerAd>, InnerBannerAd {
    private sg.bigo.ads.api.core.g A;
    private b B;
    private AbstractAdLoader C;
    private d.a<InnerBannerAd> D;
    private a E;
    InnerBannerAd y;
    private FrameLayout z;

    class a implements AdInteractionListener {

        @Nullable
        AdInteractionListener a;

        a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            AdInteractionListener adInteractionListener = this.a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdError(adError);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            AdInteractionListener adInteractionListener = this.a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
            if (i.this.B != null) {
                final b bVar = i.this.B;
                int i = bVar.a;
                bVar.b.removeCallbacksAndMessages(null);
                bVar.b.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.banner.i.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.e(i.this);
                    }
                }, bVar.a);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
        }
    }

    public class b {
        int a = 20000;
        final Handler b = new Handler(Looper.getMainLooper());

        public b() {
        }
    }

    public i(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.E = new a();
        if (!gVar.b.w() && gVar.b.j()) {
            b bVar = new b();
            this.B = bVar;
            int k = gVar.b.k();
            if (k >= 10) {
                bVar.a = k * 1000;
            }
        }
        InnerBannerAd b2 = d.b(gVar);
        this.y = b2;
        if (b2 == null) {
            throw new IllegalArgumentException("UnifiedBannerWrapper Illegal adx type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View B() {
        if (this.z == null) {
            this.z = new FrameLayout(this.b.e);
        }
        if (this.y == null) {
            return null;
        }
        this.z.removeAllViews();
        v.a(this.y.adView(), this.z, null, -1);
        sg.bigo.ads.common.view.c.a(this.b.e, this.z, getWatermarkView());
        return this.z;
    }

    static /* synthetic */ void a(i iVar, final InnerBannerAd innerBannerAd) {
        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.banner.i.2
            @Override // java.lang.Runnable
            public final void run() {
                InnerBannerAd innerBannerAd2 = innerBannerAd;
                if (innerBannerAd2 != null) {
                    innerBannerAd2.destroy();
                }
            }
        });
    }

    static /* synthetic */ void a(i iVar, sg.bigo.ads.api.core.b bVar, sg.bigo.ads.api.core.g gVar) {
        InnerBannerAd b2 = d.b(gVar);
        if (b2 != null) {
            iVar.A = gVar;
            b2.markFromAutoFresh(bVar);
            b2.handleInnerBannerAdResponse(iVar.D);
        }
    }

    static /* synthetic */ void b(i iVar) {
        if (iVar.y != null) {
            iVar.a();
            iVar.b = iVar.A;
            iVar.y.setAdInteractionListener(iVar.E);
            sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.banner.i.3
                @Override // java.lang.Runnable
                public final void run() {
                    i.this.B();
                }
            });
        }
    }

    static /* synthetic */ void e(i iVar) {
        sg.bigo.ads.api.b a2 = iVar.b.c.a();
        if (a2 != null) {
            a2.b = 1;
            final a.C1864a[] c1864aArr = new a.C1864a[1];
            c1864aArr[0] = BigoAdSdk.a(a2, new sg.bigo.ads.ce.c() { // from class: sg.bigo.ads.ad.banner.i.4
                @Override // sg.bigo.ads.ce.e
                public final /* synthetic */ void a(int i, int i2, int i3, @NonNull String str, @Nullable Pair<sg.bigo.ads.api.b, n> pair) {
                    AnonymousClass4 anonymousClass4;
                    sg.bigo.ads.api.b bVar;
                    q qVar;
                    q qVar2;
                    q qVar3;
                    q qVar4;
                    Pair<sg.bigo.ads.api.b, n> pair2 = pair;
                    sg.bigo.ads.bn.a.a(2, "Banner", "Banner auto-refresh failed: ".concat(String.valueOf(str)));
                    String str2 = null;
                    if (pair2 != null) {
                        sg.bigo.ads.api.b bVar2 = (sg.bigo.ads.api.b) pair2.first;
                        if (bVar2 != null) {
                            bVar2.g.a();
                        }
                        bVar = bVar2;
                        anonymousClass4 = this;
                    } else {
                        anonymousClass4 = this;
                        bVar = null;
                    }
                    a.C1864a c1864a = c1864aArr[0];
                    n nVar = pair2 != null ? (n) pair2.second : null;
                    int i4 = (c1864a == null || (qVar4 = c1864a.g) == null) ? 3 : qVar4.a ? 1 : 0;
                    boolean z = (c1864a == null || (qVar3 = c1864a.g) == null || !qVar3.b) ? false : true;
                    int i5 = (c1864a == null || (qVar2 = c1864a.g) == null) ? 4 : qVar2.c;
                    if (c1864a != null && (qVar = c1864a.g) != null) {
                        str2 = qVar.d;
                    }
                    sg.bigo.ads.da.b.a(nVar, bVar, i2, i3, str, 1, 0, i4, z, i5, str2);
                }

                @Override // sg.bigo.ads.ce.e
                public final /* synthetic */ void a(int i, @NonNull sg.bigo.ads.api.b bVar, @NonNull sg.bigo.ads.api.core.g[] gVarArr) {
                    q qVar;
                    q qVar2;
                    q qVar3;
                    q qVar4;
                    sg.bigo.ads.api.core.g gVar = (sg.bigo.ads.api.core.g) l.b(gVarArr);
                    gVar.c.g.a();
                    a.C1864a c1864a = c1864aArr[0];
                    sg.bigo.ads.da.b.a(new sg.bigo.ads.api.core.b[]{gVar.a}, gVar.c, gVar.b.s() && gVar.a.ad(), 1, 0, (c1864a == null || (qVar4 = c1864a.g) == null) ? 3 : qVar4.a ? 1 : 0, (c1864a == null || (qVar3 = c1864a.g) == null || !qVar3.b) ? false : true, (c1864a == null || (qVar2 = c1864a.g) == null) ? 4 : qVar2.c, (c1864a == null || (qVar = c1864a.g) == null) ? null : qVar.d);
                    i.a(i.this, gVar.a, gVar);
                }
            });
        }
    }

    @Override // sg.bigo.ads.aj.a
    public final int A() {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            return innerBannerAd.updateFormOpenTimes();
        }
        return 0;
    }

    @Override // sg.bigo.ads.aj.a, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(Ad ad) {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            return innerBannerAd.compareTo(ad);
        }
        return 0;
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.aj.d
    public final void a(@NonNull final d.a<InnerBannerAd> aVar) {
        super.a(aVar);
        if (this.C == null && (aVar instanceof AbstractAdLoader.b)) {
            this.C = ((AbstractAdLoader.b) aVar).a();
        }
        d.a<InnerBannerAd> aVar2 = new d.a<InnerBannerAd>() { // from class: sg.bigo.ads.ad.banner.i.1
            @Override // sg.bigo.ads.aj.d.a
            public final /* synthetic */ void a(@NonNull InnerBannerAd innerBannerAd) {
                InnerBannerAd innerBannerAd2 = innerBannerAd;
                if (i.this.y != null && i.this.y != innerBannerAd2) {
                    i.a(i.this, i.this.y);
                }
                i.this.y = innerBannerAd2;
                if (!innerBannerAd2.isInnerBannerAdFromAutoRefresh()) {
                    aVar.a(i.this);
                    return;
                }
                i.b(i.this);
                if (i.this.C != null) {
                    i.this.C.a((AbstractAdLoader) i.this);
                }
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* synthetic */ void a(InnerBannerAd innerBannerAd, int i, int i2, String str) {
                InnerBannerAd innerBannerAd2 = innerBannerAd;
                if (innerBannerAd2 == null || !innerBannerAd2.isInnerBannerAdFromAutoRefresh()) {
                    aVar.a(i.this, i, i2, str);
                } else {
                    i.this.a(i, i2, str);
                }
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* bridge */ /* synthetic */ void a(InnerBannerAd innerBannerAd, boolean z, int i, int i2, String str, boolean z2) {
                aVar.a(i.this, z, i, i2, str, z2);
            }
        };
        this.D = aVar2;
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            innerBannerAd.handleInnerBannerAdResponse(aVar2);
        } else {
            aVar.a(this, 1005, InterfaceC4667ge.c.d, "banner adx_type error");
        }
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final View adView() {
        String str;
        if (!sg.bigo.ads.bh.d.b()) {
            u.a("adView() must run on UI thread");
        }
        if (isExpired()) {
            str = "The ad is expired.";
        } else {
            if (!this.i) {
                FrameLayout frameLayout = this.z;
                return frameLayout != null ? frameLayout : B();
            }
            str = "The ad is destroyed.";
        }
        b(2000, 1, str);
        return null;
    }

    @Override // sg.bigo.ads.d.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            innerBannerAd.destroy();
        }
        b bVar = this.B;
        if (bVar != null) {
            bVar.b.removeCallbacksAndMessages(null);
        }
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.aj.a
    @NonNull
    public final sg.bigo.ads.api.core.b f() {
        return getInnerBannerAdData();
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.api.Ad
    @Nullable
    public final AdBid getBid() {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            return innerBannerAd.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            return innerBannerAd.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.api.Ad
    @Nullable
    public final String getExtraInfo(String str) {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            return innerBannerAd.getExtraInfo(str);
        }
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            return innerBannerAd.getHeight();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.api.core.b getInnerBannerAdData() {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            return innerBannerAd.getInnerBannerAdData();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.common.view.c getWatermarkView() {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd == null) {
            return null;
        }
        return innerBannerAd.getWatermarkView();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd == null) {
            return null;
        }
        return innerBannerAd.getWebView();
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            return innerBannerAd.getWidth();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(@NonNull d.a<InnerBannerAd> aVar) {
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            return innerBannerAd.isExpired();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            return innerBannerAd.isInnerBannerAdFromAutoRefresh();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.api.core.b bVar) {
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.api.Ad
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(adInteractionListener);
        a aVar = this.E;
        aVar.a = adInteractionListener;
        InnerBannerAd innerBannerAd = this.y;
        if (innerBannerAd != null) {
            innerBannerAd.setAdInteractionListener(aVar);
        }
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        return 0;
    }
}
