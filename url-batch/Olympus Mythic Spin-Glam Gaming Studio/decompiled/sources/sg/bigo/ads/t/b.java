package sg.bigo.ads.t;

import android.app.Activity;
import android.util.Pair;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ad.interstitial.z;

/* loaded from: classes13.dex */
public final class b extends z {
    private int K;

    protected b(@NonNull Activity activity) {
        super(activity);
    }

    protected b(@NonNull Activity activity, int i) {
        super(activity);
        this.K = i;
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
        c.c = this.K;
        return c;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void m() {
        super.m();
        ((z) this).I.a(this.K * 1000);
    }
}
