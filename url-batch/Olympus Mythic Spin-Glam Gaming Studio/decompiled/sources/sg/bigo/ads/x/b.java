package sg.bigo.ads.x;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.k.x;

/* loaded from: classes10.dex */
public class b extends a {
    private x c;

    protected b(@NonNull Activity activity) {
        super(activity);
    }

    private x b() {
        if (this.c == null) {
            this.c = sg.bigo.ads.k.a.a(this.E, ((a) this).b, 0);
        }
        return this.c;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean Y() {
        return true;
    }

    @Override // sg.bigo.ads.x.a, sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        return R.layout.bigo_ad_activity_popup_vpaid;
    }

    @Override // sg.bigo.ads.x.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void g(int i) {
        super.g(i);
        b().a(q(R.id.inter_container), q(R.id.media_layout));
        b().g(this.F);
    }
}
