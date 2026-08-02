package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class A2 extends AbstractC0664Ps {
    public final /* synthetic */ T4 A00;

    public A2(T4 t4) {
        this.A00 = t4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0665Pt c0665Pt) {
        new Handler(Looper.getMainLooper()).post(new PS(this));
    }
}
