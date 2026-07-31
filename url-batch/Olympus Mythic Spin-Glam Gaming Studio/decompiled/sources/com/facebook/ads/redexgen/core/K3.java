package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public class K3 implements InterfaceC2874b8 {
    public final /* synthetic */ C2381Ji A00;

    public K3(C2381Ji c2381Ji) {
        this.A00 = c2381Ji;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2874b8
    public final void AE7(C2873b7 c2873b7) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        imageView = this.A00.A02;
        if (imageView != null && c2873b7.A00() != null) {
            imageView2 = this.A00.A02;
            imageView2.setImageBitmap(c2873b7.A00());
            imageView3 = this.A00.A02;
            imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView4 = this.A00.A02;
            imageView4.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
