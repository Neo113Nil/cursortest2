package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1013bQ implements P0 {
    public final /* synthetic */ C1010bN A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.P0
    public final void A9L() {
        FV fv;
        EQ eq;
        fv = this.A00.A03;
        String A00 = fv.A10().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        C0537Kv c0537Kv = new C0537Kv();
        eq = this.A00.A04;
        C0537Kv.A0M(c0537Kv, eq, AbstractC0540Ky.A00(A00), this.A00.A6T());
    }

    public C1013bQ(C1010bN c1010bN) {
        this.A00 = c1010bN;
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ABO(B0 b0) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1014bR(this, b0), 1L);
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ABd() {
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ADL(View view, MotionEvent motionEvent) {
    }
}
