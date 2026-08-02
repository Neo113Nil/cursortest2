package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0374Ed extends C0914Zn {
    public final /* synthetic */ C0373Ec A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0374Ed(C0373Ec c0373Ec, Context context) {
        super(context);
        this.A00 = c0373Ec;
    }

    @Override // com.meta.analytics.dsp.uinode.C0914Zn, com.meta.analytics.dsp.uinode.AnonymousClass51
    public final void A0I(View view, AnonymousClass53 anonymousClass53, C01654z c01654z) {
        C0373Ec c0373Ec = this.A00;
        int[] A0H = c0373Ec.A0H(((ZY) c0373Ec).A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c01654z.A04(time, dy, dx, ((C0914Zn) this).A04);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C0914Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.meta.analytics.dsp.uinode.C0914Zn
    public final int A0L(int i) {
        return Math.min(100, super.A0L(i));
    }
}
