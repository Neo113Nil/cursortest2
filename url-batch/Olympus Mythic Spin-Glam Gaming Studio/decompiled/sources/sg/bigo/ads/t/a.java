package sg.bigo.ads.t;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ad.interstitial.y;

/* loaded from: classes8.dex */
public final class a extends y {
    private int K;

    protected a(@NonNull Activity activity) {
        super(activity);
    }

    protected a(@NonNull Activity activity, int i) {
        super(activity);
        this.K = i;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void ab() {
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final x c() {
        x c = super.c();
        c.c = this.K;
        return c;
    }
}
