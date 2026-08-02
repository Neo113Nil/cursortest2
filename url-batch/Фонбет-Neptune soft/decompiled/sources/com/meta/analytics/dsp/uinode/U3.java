package com.meta.analytics.dsp.uinode;

import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public class U3 implements NT {
    public final /* synthetic */ NJ A00;

    public U3(NJ nj) {
        this.A00 = nj;
    }

    @Override // com.meta.analytics.dsp.uinode.NT
    public final void AAv(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A08;
        if (z2) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.NT
    public final void ABZ(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A08;
        if (z2) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }
}
