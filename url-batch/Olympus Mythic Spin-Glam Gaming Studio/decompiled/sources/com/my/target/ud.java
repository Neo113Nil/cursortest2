package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.fe;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.xd;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class ud implements r5 {
    private final NativeBannerAd a;
    private final sc b;
    private final l2 c;
    private final xd d;
    private final NativeBanner e;
    private final fe f;
    NativeBannerAd.NativeBannerAdMediaListener g;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class a implements xd.b {
        private final ud a;
        private final NativeBannerAd b;

        a(ud udVar, NativeBannerAd nativeBannerAd) {
            this.a = udVar;
            this.b = nativeBannerAd;
        }

        @Override // com.my.target.ge
        public void a(View view, int i) {
            this.a.a(view, i);
        }

        @Override // com.my.target.xd.b
        public void i() {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.b.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                this.a.c();
                mi.a("NativeBannerAdEngine: there is no NativeBannerAdChoicesOptionListener, default behaviour for closing the ad.");
            } else if (!adChoicesOptionListener.shouldCloseAutomatically()) {
                mi.a("NativeBannerAdEngine: Ad shouldn't close automatically.");
                adChoicesOptionListener.closeIfAutomaticallyDisabled(this.b);
            } else {
                this.a.c();
                adChoicesOptionListener.onCloseAutomatically(this.b);
                mi.a("NativeBannerAdEngine: Ad should close automatically.");
            }
        }

        @Override // com.my.target.xd.b
        public void a(View view) {
            this.a.a(view);
        }

        @Override // com.my.target.xd.b
        public void a() {
            NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener = this.a.g;
            if (nativeBannerAdMediaListener != null) {
                nativeBannerAdMediaListener.onIconLoad(this.b);
            }
        }

        @Override // com.my.target.b6.b
        public void a(boolean z) {
            NativeBannerAd.NativeBannerAdChoicesListener adChoicesListener = this.b.getAdChoicesListener();
            if (adChoicesListener == null) {
                return;
            }
            if (!z) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.b);
                return;
            }
            NativeBanner banner = this.b.getBanner();
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
    }

    private ud(NativeBannerAd nativeBannerAd, sc scVar, MenuFactory menuFactory, Context context) {
        this.a = nativeBannerAd;
        this.b = scVar;
        this.e = NativeBanner.a(scVar);
        this.d = xd.a(scVar, new a(this, nativeBannerAd), menuFactory);
        this.f = fe.a(scVar, 2, null, context);
        this.c = l2.a(nativeBannerAd.getCustomParams());
    }

    public static ud a(NativeBannerAd nativeBannerAd, sc scVar, MenuFactory menuFactory, Context context) {
        return new ud(nativeBannerAd, scVar, menuFactory, context);
    }

    @Override // com.my.target.r5
    public NativeBanner b() {
        return this.e;
    }

    void c() {
        this.d.c();
    }

    @Override // com.my.target.r5
    public float d() {
        return 0.0f;
    }

    @Override // com.my.target.r5
    public void handleAdChoicesClick(Context context) {
        this.d.a(context);
    }

    @Override // com.my.target.r5
    public void handleClick(boolean z, View view) {
        a(view, z ? 2 : 1);
    }

    @Override // com.my.target.r5
    public void registerView(View view, List list, int i) {
        unregisterView();
        fe feVar = this.f;
        if (feVar != null) {
            feVar.a(view, new fe.b[0]);
        }
        this.d.a(view, list, i);
    }

    @Override // com.my.target.r5
    public void unregisterView() {
        this.d.e();
        fe feVar = this.f;
        if (feVar != null) {
            feVar.a();
        }
    }

    @Override // com.my.target.r5
    public void a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        this.g = nativeBannerAdMediaListener;
    }

    @Override // com.my.target.r5
    public String a() {
        return "myTarget";
    }

    void a(View view, int i) {
        mi.a("NativeBannerAdEngine: Click received by native banner ad, cs=" + i);
        if (view != null) {
            a(this.b, view, i);
        }
    }

    @Override // com.my.target.r5
    public void registerView(NativeBannerAdViewBinder nativeBannerAdViewBinder, List list, int i) {
        unregisterView();
        fe feVar = this.f;
        if (feVar != null) {
            feVar.a(nativeBannerAdViewBinder.getRootAdBannerView(), new fe.b[0]);
        }
        this.d.a(nativeBannerAdViewBinder, list, i);
    }

    void a(View view) {
        fe feVar = this.f;
        if (feVar != null) {
            feVar.c();
        }
        NativeBannerAd.NativeBannerAdListener listener = this.a.getListener();
        mi.a("NativeBannerAdEngine: Ad shown, banner Id = " + this.b.x());
        if (listener != null) {
            listener.onShow(this.a);
        }
    }

    private void a(b bVar, View view, int i) {
        Context context;
        if (bVar != null && (context = view.getContext()) != null) {
            this.c.a(bVar, i, this.a.getWebFormClient(), context);
        }
        NativeBannerAd.NativeBannerAdListener listener = this.a.getListener();
        if (listener != null) {
            listener.onClick(this.a);
        }
    }
}
