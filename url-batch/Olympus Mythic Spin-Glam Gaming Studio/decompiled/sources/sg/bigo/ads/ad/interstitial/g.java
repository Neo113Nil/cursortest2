package sg.bigo.ads.ad.interstitial;

import androidx.annotation.DrawableRes;
import sg.bigo.ads.R;

/* loaded from: classes14.dex */
public enum g {
    BLACK(R.drawable.bigo_ad_ic_right_black, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half, R.drawable.bigo_ad_ic_star),
    WHITE(R.drawable.bigo_ad_ic_right_white, R.drawable.bigo_ad_ic_star_normal_white, R.drawable.bigo_ad_ic_star_half_white, R.drawable.bigo_ad_ic_star_white);


    @DrawableRes
    public final int c;

    @DrawableRes
    public final int d;

    @DrawableRes
    public final int e;

    @DrawableRes
    public final int f;

    g(int i, int i2, int i3, int i4) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }
}
