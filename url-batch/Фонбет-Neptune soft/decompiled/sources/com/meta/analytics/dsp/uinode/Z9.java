package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public class Z9 implements InterfaceC01805o {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C01825q A01;
    public final /* synthetic */ V2 A02;

    public Z9(C01825q c01825q, ImageView imageView, V2 v2) {
        this.A01 = c01825q;
        this.A00 = imageView;
        this.A02 = v2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC01805o
    public final void ABi(Drawable drawable) {
        V2.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
