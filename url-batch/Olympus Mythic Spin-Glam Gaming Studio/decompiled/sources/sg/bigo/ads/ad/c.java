package sg.bigo.ads.ad;

import android.content.Context;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.o;
import sg.bigo.ads.api.popup.PopupAd;
import sg.bigo.ads.core.mraid.n;

/* loaded from: classes4.dex */
public final class c extends o implements PopupAd {
    public c(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final int D() {
        return this.b.b.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.o, sg.bigo.ads.ad.interstitial.k
    public final Class<? extends sg.bigo.ads.cl.b<?>> G() {
        return b.class;
    }

    @Override // sg.bigo.ads.ad.interstitial.o
    public final n H() {
        return n.POPUP;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void a(Context context) {
        if (sg.bigo.ads.controller.landing.d.a(context, (Class<? extends sg.bigo.ads.cl.b<?>>) b.class, this)) {
            return;
        }
        a(2004, "This ad cannot be open");
    }
}
