package com.meta.analytics.dsp.uinode;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0316Bh extends C0914Zn {
    public final /* synthetic */ C0315Bg A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.C0914Zn
    public final int A0O(View view, int i) {
        int i2;
        AbstractC01554o A08 = A08();
        if (!A08.A20()) {
            return 0;
        }
        C01564p c01564p = (C01564p) view.getLayoutParams();
        int A0N = A0N(A08.A0k(view) - c01564p.leftMargin, A08.A0n(view) + c01564p.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i);
        i2 = this.A00.A02;
        return A0N + i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0316Bh(C0315Bg c0315Bg, C0889Yn c0889Yn) {
        super(c0889Yn);
        this.A00 = c0315Bg;
    }

    @Override // com.meta.analytics.dsp.uinode.C0914Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        float f;
        f = this.A00.A00;
        return f / displayMetrics.densityDpi;
    }

    @Override // com.meta.analytics.dsp.uinode.C0914Zn
    public final int A0K() {
        return -1;
    }

    @Override // com.meta.analytics.dsp.uinode.C0914Zn
    public final PointF A0P(int i) {
        return this.A00.A4O(i);
    }
}
