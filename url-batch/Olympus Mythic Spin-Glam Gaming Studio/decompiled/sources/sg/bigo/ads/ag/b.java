package sg.bigo.ads.ag;

import android.app.Activity;
import android.util.Pair;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ad.interstitial.z;
import sg.bigo.ads.ae.g;

/* loaded from: classes15.dex */
public final class b extends g {
    private int M;

    protected b(@NonNull Activity activity) {
        super(activity);
    }

    protected b(@NonNull Activity activity, int i, boolean z) {
        super(activity);
        ((g) this).L = z;
        this.M = i;
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void aK() {
        T t = this.A;
        if (t != 0) {
            ((t) t).c(this.E);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void ab() {
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final sg.bigo.ads.f.a ax() {
        Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> b;
        T t = this.A;
        if (t == 0 || (b = ((t) t).b(this.E)) == null) {
            return null;
        }
        return (sg.bigo.ads.f.a) b.second;
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final sg.bigo.ads.f.c ay() {
        Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> b;
        T t = this.A;
        if (t == 0 || (b = ((t) t).b(this.E)) == null) {
            return null;
        }
        return (sg.bigo.ads.f.c) b.first;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final x c() {
        x c = super.c();
        c.c = this.M;
        return c;
    }

    @Override // sg.bigo.ads.ae.g, sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void m() {
        super.m();
        ((z) this).I.a(this.M * 1000);
    }
}
