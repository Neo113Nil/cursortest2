package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.my.target.common.ExternalClickHandler;
import com.my.target.common.listeners.HtmlCustomEventListener;
import com.my.target.common.listeners.HtmlInteractionListener;
import com.my.target.common.listeners.HtmlInteractiveProgressListener;
import com.my.target.common.listeners.HtmlLoadingListener;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.fe;
import com.my.target.kd;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.views.MediaAdView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public final class yc implements q5 {
    private final NativeAd a;
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private final sc d;
    private final l2 e;
    private final kd f;
    private final NativePromoBanner g;
    private final fe h;
    NativeAd.NativeAdMediaListener i;
    private ExternalClickHandler j;
    private NativeAd.CollageItemsShowHandler k;
    private boolean l;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class a implements kd.c {
        private final yc a;
        private final NativeAd b;
        private float c = -10.0f;

        a(yc ycVar, NativeAd nativeAd) {
            this.a = ycVar;
            this.b = nativeAd;
        }

        @Override // com.my.target.ge
        public void a(View view, int i) {
            this.a.a(view, i);
        }

        @Override // com.my.target.jd.c
        public void b() {
            this.a.h();
        }

        @Override // com.my.target.d0
        public void c() {
            this.a.h();
        }

        @Override // com.my.target.jd.c
        public void d() {
            this.a.m();
        }

        @Override // com.my.target.jd.c
        public void e() {
            this.a.i();
        }

        @Override // com.my.target.jd.c
        public void f() {
            this.a.j();
        }

        @Override // com.my.target.kd.c
        public void g() {
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.b.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                this.a.b();
                mi.a("NativeAdEngine: there is no NativeAdChoicesOptionListener, default behaviour for closing the ad.");
            } else if (!adChoicesOptionListener.shouldCloseAutomatically()) {
                adChoicesOptionListener.closeIfAutomaticallyDisabled(this.b);
                mi.a("NativeAdEngine: Ad shouldn't close automatically.");
            } else {
                this.a.b();
                adChoicesOptionListener.onCloseAutomatically(this.b);
                mi.a("NativeAdEngine: Ad should close automatically.");
            }
        }

        @Override // com.my.target.kd.c
        public void h() {
            NativeAd.NativeAdMediaListener nativeAdMediaListener = this.a.i;
            if (nativeAdMediaListener != null) {
                nativeAdMediaListener.onImageLoad(this.b);
            }
        }

        @Override // com.my.target.jd.c
        public void j() {
            this.a.l();
        }

        @Override // com.my.target.jd.c
        public void k() {
            this.a.k();
        }

        @Override // com.my.target.jd.c
        public void a(String str) {
            this.a.a(str);
        }

        @Override // com.my.target.jd.c
        public void a(float f, float f2) {
            this.a.a(f, f2);
        }

        @Override // com.my.target.core.ui.views.nativeslider.c.a
        public void a(View view, int i, int i2) {
            this.a.a(view, i, i2);
        }

        @Override // com.my.target.core.ui.views.nativeslider.c.a
        public void a(int[] iArr, Context context) {
            this.a.a(iArr, context);
        }

        @Override // com.my.target.core.ui.views.nativeslider.c.a
        public void a(int i) {
            this.a.a(i);
        }

        @Override // com.my.target.xc.a
        public void a(wc wcVar, String str, View view, Context context) {
            this.a.a(wcVar, str, view, context);
        }

        @Override // com.my.target.kd.c
        public void a(View view) {
            this.a.a(view);
        }

        @Override // com.my.target.kd.c
        public void a() {
            NativeAd.NativeAdMediaListener nativeAdMediaListener = this.a.i;
            if (nativeAdMediaListener != null) {
                nativeAdMediaListener.onIconLoad(this.b);
            }
        }

        @Override // com.my.target.b6.b
        public void a(boolean z) {
            NativeAd.NativeAdChoicesListener adChoicesListener = this.b.getAdChoicesListener();
            if (adChoicesListener == null) {
                return;
            }
            if (!z) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.b);
                return;
            }
            NativePromoBanner banner = this.b.getBanner();
            if (banner == null) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.b);
                return;
            }
            ImageData adChoicesIcon = banner.getAdChoicesIcon();
            if (adChoicesIcon == null) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.b);
            } else {
                adChoicesListener.onAdChoicesIconLoad(adChoicesIcon, true, this.b);
            }
        }

        @Override // com.my.target.bd.d
        public void a(ad adVar, String str, View view) {
            this.a.a(adVar, str, view);
        }

        @Override // com.my.target.bd.d
        public void a(ad adVar, View view) {
            this.a.a(adVar, view);
        }

        @Override // com.my.target.d0
        public void a(float f) {
            if (v4.a(this.c, f) != 0) {
                this.c = f;
                this.a.a(f);
            }
        }
    }

    private yc(NativeAd nativeAd, sc scVar, MenuFactory menuFactory, Context context) {
        this.a = nativeAd;
        this.d = scVar;
        this.g = NativePromoBanner.b(scVar);
        eb d0 = scVar.d0();
        fe a2 = fe.a(scVar, d0 != null ? 3 : 2, d0, context);
        this.h = a2;
        yd a3 = yd.a(a2, context);
        a3.a(nativeAd.isUseExoPlayer());
        this.f = kd.a(scVar, new a(this, nativeAd), a3, this.k, menuFactory, nativeAd.getCustomParams().a());
        this.e = l2.a(nativeAd.getCustomParams());
    }

    public static yc a(NativeAd nativeAd, sc scVar, MenuFactory menuFactory, Context context) {
        return new yc(nativeAd, scVar, menuFactory, context);
    }

    void b() {
        this.f.c();
    }

    @Override // com.my.target.q5
    public NativeAd.NativeAdVideoPlayer c() {
        return this.f.g();
    }

    @Override // com.my.target.q5
    public float d() {
        return 0.0f;
    }

    @Override // com.my.target.q5
    public boolean e() {
        return this.f.f();
    }

    @Override // com.my.target.q5
    public void f() {
        this.f.j();
    }

    @Override // com.my.target.q5
    public NativePromoBanner g() {
        return this.g;
    }

    void h() {
        NativeAd.NativeAdListener listener = this.a.getListener();
        if (listener != null) {
            listener.onVideoComplete(this.a);
        }
        NativeAd.NativeAdVideoListener nativeAdVideoListener = this.a.getNativeAdVideoListener();
        if (nativeAdVideoListener != null) {
            nativeAdVideoListener.onVideoComplete(this.a);
        }
    }

    @Override // com.my.target.q5
    public void handleAdChoicesClick(Context context) {
        this.f.a(context);
    }

    @Override // com.my.target.q5
    public void handleClick(boolean z, View view) {
        a(view, z ? 2 : 1);
    }

    void i() {
        NativeAd.NativeAdListener listener = this.a.getListener();
        if (listener != null) {
            listener.onVideoPause(this.a);
        }
        NativeAd.NativeAdVideoListener nativeAdVideoListener = this.a.getNativeAdVideoListener();
        if (nativeAdVideoListener != null) {
            nativeAdVideoListener.onVideoPause(this.a);
        }
    }

    void j() {
        NativeAd.NativeAdListener listener = this.a.getListener();
        if (listener != null) {
            listener.onVideoPlay(this.a);
        }
    }

    void k() {
        NativeAd.NativeAdListener listener = this.a.getListener();
        if (listener != null) {
            listener.onVideoPlay(this.a);
        }
        NativeAd.NativeAdVideoListener nativeAdVideoListener = this.a.getNativeAdVideoListener();
        if (nativeAdVideoListener != null) {
            nativeAdVideoListener.onVideoReplay(this.a);
        }
    }

    void l() {
        NativeAd.NativeAdVideoListener nativeAdVideoListener = this.a.getNativeAdVideoListener();
        if (nativeAdVideoListener != null) {
            nativeAdVideoListener.onVideoResume(this.a);
        }
    }

    void m() {
        NativeAd.NativeAdVideoListener nativeAdVideoListener = this.a.getNativeAdVideoListener();
        if (nativeAdVideoListener != null) {
            nativeAdVideoListener.onVideoStart(this.a);
        }
    }

    @Override // com.my.target.q5
    public void registerView(NativeAdViewBinder nativeAdViewBinder, List list, int i) {
        unregisterView();
        fe feVar = this.h;
        if (feVar != null) {
            feVar.a(nativeAdViewBinder.getRootAdView(), new fe.b[0]);
        }
        this.f.a(nativeAdViewBinder, list, i);
    }

    @Override // com.my.target.q5
    public void unregisterView() {
        this.f.m();
        fe feVar = this.h;
        if (feVar != null) {
            feVar.a();
        }
    }

    @Override // com.my.target.q5
    public void a(NativeAd.NativeAdMediaListener nativeAdMediaListener) {
        this.i = nativeAdMediaListener;
    }

    @Override // com.my.target.q5
    public void a(View view, List list, int i, MediaAdView mediaAdView) {
        unregisterView();
        fe feVar = this.h;
        if (feVar != null) {
            feVar.a(view, new fe.b[0]);
        }
        this.f.a(view, list, i, mediaAdView);
    }

    @Override // com.my.target.q5
    public String a() {
        return "myTarget";
    }

    void a(int[] iArr, Context context) {
        if (this.l) {
            String e = qi.e(context);
            List c0 = this.d.c0();
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                uc ucVar = (i2 < 0 || i2 >= c0.size()) ? null : (uc) c0.get(i2);
                if (ucVar != null && !this.b.contains(ucVar)) {
                    th H = ucVar.H();
                    if (e != null) {
                        wh.a(H, e, 1);
                    }
                    wh.b(H, "show", 1);
                    this.b.add(ucVar);
                }
            }
        }
    }

    void a(int i) {
        List c0 = this.d.c0();
        uc ucVar = (i < 0 || i >= c0.size()) ? null : (uc) c0.get(i);
        if (ucVar == null || this.c.contains(ucVar)) {
            return;
        }
        wh.b(ucVar.H(), "render", 1);
        this.c.add(ucVar);
    }

    void a(View view, int i, int i2) {
        mi.a("NativeAdEngine: Click on native card received");
        List c0 = this.d.c0();
        if (i >= 0 && i < c0.size()) {
            a((uc) c0.get(i), i2, view, view.getContext());
        }
        if (this.d.e().a()) {
            return;
        }
        th H = this.d.H();
        if (view.getContext() != null) {
            wh.b(H, i2 == 2 ? "ctaClick" : "click", 2);
        }
    }

    void a(float f, float f2) {
        NativeAd.NativeAdVideoListener nativeAdVideoListener = this.a.getNativeAdVideoListener();
        if (nativeAdVideoListener != null) {
            nativeAdVideoListener.onVideoProgress(f, f2, this.a);
        }
    }

    void a(float f) {
        NativeAd.NativeAdVideoListener nativeAdVideoListener = this.a.getNativeAdVideoListener();
        if (nativeAdVideoListener != null) {
            try {
                nativeAdVideoListener.onVideoVolumeChanged(f, this.a);
            } catch (Throwable th) {
                if ((th instanceof AbstractMethodError) && th.getStackTrace().length == new Exception().getStackTrace().length) {
                    return;
                }
                mi.b("Unexpected exception: " + th.getMessage());
            }
        }
    }

    void a(View view, int i) {
        mi.a("NativeAdEngine: Click received by native ad");
        if (view != null) {
            a(this.d, i, view, view.getContext());
        }
    }

    void a(ad adVar, String str, View view) {
        mi.a("NativeAdEngine: Click on native html received");
        a(adVar, str, 1, view, view.getContext());
        wh.b(this.d.H(), "click", 2);
    }

    void a(ad adVar, View view) {
        mi.a("NativeAdEngine: Click on native html CTA received");
        a(adVar, this.d.L(), 2, view, view.getContext());
        wh.b(this.d.H(), "click", 2);
    }

    void a(wc wcVar, String str, View view, Context context) {
        mi.a("NativeAdEngine: Click on native content received");
        a(wcVar, str, 1, view, context);
        wh.b(this.d.H(), "click", 2);
    }

    void a(String str) {
        mi.a("NativeAdEngine: Video error");
        this.f.d();
        NativeAd.NativeAdVideoListener nativeAdVideoListener = this.a.getNativeAdVideoListener();
        if (nativeAdVideoListener != null) {
            nativeAdVideoListener.onVideoError(str, this.a);
        }
    }

    void a(View view) {
        fe feVar = this.h;
        if (feVar != null) {
            feVar.c();
        }
        if (this.l) {
            return;
        }
        this.l = true;
        int[] e = this.f.e();
        if (e != null) {
            a(e, view.getContext());
        }
        NativeAd.NativeAdListener listener = this.a.getListener();
        mi.a("NativeAdEngine: Ad shown, banner id = " + this.d.x());
        if (listener != null) {
            listener.onShow(this.a);
        }
    }

    private void a(b bVar, int i, View view, Context context) {
        a(bVar, null, i, view, context);
    }

    private void a(b bVar, String str, int i, View view, Context context) {
        if (bVar != null) {
            if (a(bVar, str, i, context)) {
                mi.a("NativeAdEngine: click was handled by app");
            } else if (str != null) {
                this.e.a(bVar, str, i, this.a.getWebFormClient(), context);
            } else {
                this.e.a(bVar, i, this.a.getWebFormClient(), context);
            }
        }
        NativeAd.NativeAdListener listener = this.a.getListener();
        if (listener != null) {
            try {
                listener.onClick(view, this.a);
            } catch (AbstractMethodError e) {
                if (e.getStackTrace().length == new Exception().getStackTrace().length) {
                    listener.onClick(this.a);
                }
            }
        }
    }

    private boolean a(b bVar, String str, int i, Context context) {
        ExternalClickHandler externalClickHandler = this.j;
        if (externalClickHandler == null) {
            return false;
        }
        String k = bVar.k();
        String L = bVar.L();
        if (TextUtils.isEmpty(str)) {
            str = (i != 2 || k == null) ? L : k;
        }
        String g = bVar.g();
        String m = bVar.m();
        boolean handleClick = externalClickHandler.handleClick(g, m, str, bVar.V());
        if (handleClick) {
            if (!TextUtils.isEmpty(str)) {
                if (str.equals(k)) {
                    wh.a(bVar.H().b("ctaClick"), 2);
                    return handleClick;
                }
                wh.a(bVar.H().b("click"), 2);
                return handleClick;
            }
            if (!TextUtils.isEmpty(g) || !TextUtils.isEmpty(m)) {
                wh.a(bVar.H().b("deeplinkClick"), 2);
            }
        }
        return handleClick;
    }

    @Override // com.my.target.q5
    public void a(ExternalClickHandler externalClickHandler) {
        this.j = externalClickHandler;
    }

    @Override // com.my.target.q5
    public void a(NativeAd.CollageItemsShowHandler collageItemsShowHandler) {
        this.k = collageItemsShowHandler;
        this.f.a(collageItemsShowHandler);
    }

    @Override // com.my.target.q5
    public void a(HtmlInteractionListener htmlInteractionListener) {
        this.f.a(htmlInteractionListener);
    }

    @Override // com.my.target.q5
    public void a(HtmlLoadingListener htmlLoadingListener) {
        this.f.a(htmlLoadingListener);
    }

    @Override // com.my.target.q5
    public void a(HtmlInteractiveProgressListener htmlInteractiveProgressListener) {
        this.f.a(htmlInteractiveProgressListener);
    }

    @Override // com.my.target.q5
    public void a(HtmlCustomEventListener htmlCustomEventListener) {
        this.f.a(htmlCustomEventListener);
    }

    @Override // com.my.target.q5
    public void a(long j) {
        this.f.a(j);
    }
}
