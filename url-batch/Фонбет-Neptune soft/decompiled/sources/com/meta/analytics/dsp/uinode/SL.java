package com.meta.analytics.dsp.uinode;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class SL extends O4 {
    public final ImageView A00;
    public final C0889Yn A01;

    public SL(C0889Yn c0889Yn) {
        super(c0889Yn);
        this.A01 = c0889Yn;
        ImageView imageView = new ImageView(c0889Yn);
        this.A00 = imageView;
        imageView.setAdjustViewBounds(true);
        addView(imageView, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC0766Tq downloadImageTask = new AsyncTaskC0766Tq(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
