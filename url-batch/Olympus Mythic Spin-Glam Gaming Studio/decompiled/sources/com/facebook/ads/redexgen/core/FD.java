package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class FD extends C2913bl {
    public final ImageView A00;
    public final C3218gi A01;

    public FD(C3218gi c3218gi) {
        super(c3218gi);
        this.A01 = c3218gi;
        this.A00 = new ImageView(c3218gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        LM downloadImageTask = new LM(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
