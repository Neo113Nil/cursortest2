package sg.bigo.ads.ab;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ac.a.AnonymousClass2;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.i;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.bj.e;
import sg.bigo.ads.bj.f;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.y.b;

/* loaded from: classes8.dex */
public final class d implements InnerBannerAd, b.InterfaceC1920b {

    @Nullable
    private sg.bigo.ads.y.b a;

    @Nullable
    private sg.bigo.ads.ab.b b;
    private Boolean c;
    private b d;
    private sg.bigo.ads.ac.a e;

    @Nullable
    private c f;
    private int g;
    private int h;
    private boolean i;
    private final g j;
    private long k;
    private d.a<InnerBannerAd> l;
    private final a m;
    private b.a n;

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
            if (this.a != null) {
                if (adError.getCode() == 2002 && d.g(d.this)) {
                    return;
                }
                this.a.onAdError(adError);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            d.this.k = SystemClock.elapsedRealtime();
            if (d.this.e != null && d.this.f != null) {
                d.this.e.a(d.this.f.b);
            }
            if (d.this.a != null) {
                d.this.a.a(d.this.n);
            }
            AdInteractionListener adInteractionListener = this.a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
        }
    }

    class b {
        d.a<NativeAd> a;
        d.a<NativeAd> b;

        public b(final d.a<InnerBannerAd> aVar) {
            this.a = new d.a<NativeAd>() { // from class: sg.bigo.ads.ab.d.b.1
                @Override // sg.bigo.ads.aj.d.a
                public final /* synthetic */ void a(NativeAd nativeAd) {
                    boolean z = false;
                    if (d.this.e == null) {
                        d.c(d.this);
                        d.this.a((d.a<InnerBannerAd>) aVar, 1, false);
                        return;
                    }
                    d.d(d.this);
                    if (d.this.b != null) {
                        sg.bigo.ads.ac.a aVar2 = d.this.e;
                        ImageView imageView = d.this.b.a;
                        if (d.this.a != null && d.this.a.p()) {
                            z = true;
                        }
                        aVar2.a(imageView, z);
                    }
                    d.this.a(1, 3);
                    d.this.a((d.a<InnerBannerAd>) aVar, 1, true);
                }

                @Override // sg.bigo.ads.aj.d.a
                public final /* synthetic */ void a(NativeAd nativeAd, int i, int i2, String str) {
                    d.c(d.this);
                    if (i2 == 10103) {
                        d.this.a(1, 1);
                    } else {
                        d.this.a(1, 4);
                    }
                    d.this.a((d.a<InnerBannerAd>) aVar, 1, false);
                }

                @Override // sg.bigo.ads.aj.d.a
                public final /* bridge */ /* synthetic */ void a(NativeAd nativeAd, boolean z, int i, int i2, String str, boolean z2) {
                }
            };
            this.b = new d.a<NativeAd>() { // from class: sg.bigo.ads.ab.d.b.2
                @Override // sg.bigo.ads.aj.d.a
                public final /* synthetic */ void a(NativeAd nativeAd) {
                    NativeAd nativeAd2 = nativeAd;
                    boolean z = false;
                    if (d.this.e == null) {
                        d.c(d.this);
                        d.this.a((d.a<InnerBannerAd>) aVar, 1, false);
                        return;
                    }
                    d.d(d.this);
                    b.a(b.this, nativeAd2, 3);
                    sg.bigo.ads.ac.a aVar2 = d.this.e;
                    aVar2.a(aVar2.new AnonymousClass2(), nativeAd2 instanceof sg.bigo.ads.z.a);
                    sg.bigo.ads.ac.a aVar3 = d.this.e;
                    if (d.this.a != null && d.this.a.p()) {
                        z = true;
                    }
                    aVar3.a(z);
                    d.this.a((d.a<InnerBannerAd>) aVar, 1, true);
                }

                @Override // sg.bigo.ads.aj.d.a
                public final /* synthetic */ void a(NativeAd nativeAd, int i, int i2, String str) {
                    b bVar;
                    int i3;
                    NativeAd nativeAd2 = nativeAd;
                    d.c(d.this);
                    if (i2 == 1401 || i2 == 10074 || i2 == 10103 || i2 == 1300) {
                        bVar = b.this;
                        i3 = 1;
                    } else {
                        bVar = b.this;
                        i3 = 4;
                    }
                    b.a(bVar, nativeAd2, i3);
                    d.this.a((d.a<InnerBannerAd>) aVar, 1, false);
                }

                @Override // sg.bigo.ads.aj.d.a
                public final /* bridge */ /* synthetic */ void a(NativeAd nativeAd, boolean z, int i, int i2, String str, boolean z2) {
                }
            };
        }

        static /* synthetic */ void a(b bVar, NativeAd nativeAd, int i) {
            if (nativeAd instanceof sg.bigo.ads.z.b) {
                d.this.a(3, i);
            } else if (nativeAd instanceof sg.bigo.ads.z.a) {
                d.this.a(2, i);
            }
        }

        public final void a() {
            this.a = null;
            this.b = null;
        }
    }

    public d(@NonNull g gVar) {
        this.g = 0;
        this.h = 0;
        this.i = false;
        a aVar = new a();
        this.m = aVar;
        this.n = new b.a() { // from class: sg.bigo.ads.ab.d.1
            @Override // sg.bigo.ads.y.b.a
            public final void a() {
                if (d.this.e != null) {
                    d.this.e.f();
                }
            }
        };
        this.j = gVar;
        sg.bigo.ads.y.b a2 = sg.bigo.ads.y.a.a(gVar);
        this.a = a2;
        if (a2 != null) {
            a2.setAdInteractionListener(aVar);
            this.f = new c(gVar);
            this.b = new sg.bigo.ads.ab.b(this.a);
            i.b aE = ((sg.bigo.ads.cp.a) this.a.f()).aE();
            sg.bigo.ads.y.b bVar = this.a;
            this.e = bVar != null ? sg.bigo.ads.ac.a.a(bVar, bVar.b.f, aE) : null;
            this.c = Boolean.FALSE;
            this.d = null;
            this.g = 0;
            this.h = 0;
            this.i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(d.a<InnerBannerAd> aVar, int i, boolean z) {
        if (aVar == null) {
            return;
        }
        if (this.c.booleanValue()) {
            return;
        }
        c cVar = this.f;
        int i2 = 2;
        if (cVar != null && cVar.a == 2 && i == 2) {
            d();
            aVar.a(this);
            this.c = Boolean.TRUE;
            return;
        }
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar != null && ((sg.bigo.ads.cp.a) bVar.f()).aZ()) {
            i2 = 3;
        }
        if (!z) {
            if (this.h == i2 || this.i) {
                if (this.i) {
                    aVar.a(this, 1005, 1006, "native banner VAST parse failed");
                } else {
                    aVar.a(this, 1005, 1253, "native banner download icon & main resources all failed");
                }
            }
        }
        d();
        aVar.a(this);
        this.c = Boolean.TRUE;
    }

    static /* synthetic */ int c(d dVar) {
        int i = dVar.h;
        dVar.h = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b bVar = this.d;
        if (bVar != null) {
            bVar.a();
            this.d = null;
        }
        sg.bigo.ads.ac.a aVar = this.e;
        if (aVar != null) {
            aVar.h();
        }
        sg.bigo.ads.ab.b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    static /* synthetic */ int d(d dVar) {
        int i = dVar.g;
        dVar.g = i + 1;
        return i;
    }

    private void d() {
        sg.bigo.ads.ab.b bVar;
        sg.bigo.ads.ac.a aVar = this.e;
        if (aVar == null || (bVar = this.b) == null) {
            return;
        }
        aVar.a(bVar.a, e());
    }

    private int e() {
        c cVar = this.f;
        return (cVar == null || cVar.c != 2) ? 3 : 1;
    }

    static /* synthetic */ boolean g(d dVar) {
        sg.bigo.ads.y.b bVar = dVar.a;
        return bVar != null && bVar.p();
    }

    @Override // sg.bigo.ads.y.b.InterfaceC1920b
    public final void a() {
        a(this.l, 2, false);
        final sg.bigo.ads.ab.b bVar = this.b;
        final d.a<NativeAd> aVar = this.d.a;
        sg.bigo.ads.y.b bVar2 = bVar.b;
        if (bVar2 != null) {
            sg.bigo.ads.cp.a aVar2 = (sg.bigo.ads.cp.a) bVar2.f();
            if (aVar2.aD() == null) {
                aVar.a(bVar.b, 3001, 10103, "banner icon is empty");
                return;
            }
            String c = aVar2.aD().c();
            if (r.a((CharSequence) c)) {
                aVar.a(bVar.b, 3001, 10103, "banner icon url is empty");
            } else if (k.a.n().a(9) && URLUtil.isHttpUrl(c)) {
                aVar.a(bVar.b, 3001, 10118, "Invalid http banner icon url");
            } else {
                e.b(bVar.b.b.e, sg.bigo.ads.bp.e.j(), c, aVar2.am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ab.b.1
                    final /* synthetic */ d.a a;

                    AnonymousClass1(final d.a aVar3) {
                        r2 = aVar3;
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i, @NonNull String str, @Nullable f fVar) {
                        d.a aVar3;
                        b bVar3 = b.this;
                        sg.bigo.ads.y.b bVar4 = bVar3.b;
                        if (bVar4 == null || bVar3.a == null || (aVar3 = r2) == null) {
                            return;
                        }
                        aVar3.a(bVar4, i, 3001, str);
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull f fVar) {
                        b bVar3 = b.this;
                        sg.bigo.ads.y.b bVar4 = bVar3.b;
                        if (bVar4 == null || bVar3.a == null || r2 == null) {
                            return;
                        }
                        bVar4.a(bitmap, 1);
                        b.this.a.setImageBitmap(bitmap);
                        r2.a(b.this.b);
                    }
                });
            }
        }
    }

    public final void a(int i, int i2) {
        Integer valueOf;
        String str;
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar == null) {
            return;
        }
        if (i == 1) {
            valueOf = Integer.valueOf(i2);
            str = "icon_sta";
        } else {
            if (i != 2) {
                if (i == 3 && (bVar instanceof sg.bigo.ads.z.b)) {
                    bVar.a("vid_sta", Integer.valueOf(i2));
                    return;
                }
                return;
            }
            valueOf = Integer.valueOf(i2);
            str = "img_sta";
        }
        bVar.a(str, valueOf);
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final View adView() {
        if (!sg.bigo.ads.bh.d.b()) {
            u.a("adView() must run on UI thread");
        }
        if (this.a == null) {
            return null;
        }
        if (isExpired()) {
            this.a.b(2000, 1, "The ad is expired.");
            return null;
        }
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar.i) {
            bVar.b(2000, 1, "The ad is destroyed.");
            return null;
        }
        sg.bigo.ads.ac.a aVar = this.e;
        if (aVar != null) {
            return aVar.e();
        }
        bVar.a(2000, "mNativeBannerRender is null.");
        return null;
    }

    @Override // sg.bigo.ads.y.b.InterfaceC1920b
    public final void b() {
        this.i = true;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Ad ad) {
        Ad ad2 = ad;
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar != null) {
            return bVar.compareTo(ad2);
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public final void destroy() {
        destroyInMainThread();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void destroyInMainThread() {
        if (sg.bigo.ads.bh.d.b()) {
            c();
        } else {
            sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ab.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.c();
                }
            });
        }
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar != null) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) bVar.f(), SystemClock.elapsedRealtime() - this.k);
        }
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final AdBid getBid() {
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar != null) {
            return bVar.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        sg.bigo.ads.y.b bVar = this.a;
        return bVar != null ? bVar.getCreativeId() : "";
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getExtraInfo(String str) {
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar != null) {
            return bVar.getExtraInfo(str);
        }
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        sg.bigo.ads.ac.a aVar = this.e;
        if (aVar != null) {
            return aVar.j();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.api.core.b getInnerBannerAdData() {
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.common.view.c getWatermarkView() {
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar != null) {
            return bVar.D();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        sg.bigo.ads.ac.a aVar = this.e;
        if (aVar != null) {
            return aVar.i();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(@NonNull d.a<InnerBannerAd> aVar) {
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar == null) {
            aVar.a(this, 1005, 1253, "native banner mNativeAd is null");
            return;
        }
        bVar.b(true);
        this.l = aVar;
        if (this.d == null) {
            this.d = new b(aVar);
        }
        a(1, 2);
        a(2, 2);
        a(3, 2);
        sg.bigo.ads.y.b bVar2 = this.a;
        if (bVar2 != null) {
            bVar2.a((b.InterfaceC1920b) this);
            this.a.a(this.d.b, 0);
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar != null) {
            return bVar.isExpired();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar != null) {
            return ((sg.bigo.ads.cp.a) bVar.f()).bu();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.api.core.b bVar) {
        if (bVar instanceof o) {
            ((o) bVar).bt();
        }
        sg.bigo.ads.y.b bVar2 = this.a;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.m.a = adInteractionListener;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        sg.bigo.ads.y.b bVar = this.a;
        if (bVar != null) {
            return bVar.A();
        }
        return 0;
    }
}
