package sg.bigo.ads.ag;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ae.e;

/* loaded from: classes15.dex */
public final class a extends e {
    private int M;

    protected a(@NonNull Activity activity) {
        super(activity);
    }

    protected a(@NonNull Activity activity, int i, boolean z) {
        super(activity);
        ((e) this).L = z;
        this.M = i;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void ab() {
    }

    @Override // sg.bigo.ads.ae.e, sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final x c() {
        x c = super.c();
        c.c = this.M;
        return c;
    }
}
