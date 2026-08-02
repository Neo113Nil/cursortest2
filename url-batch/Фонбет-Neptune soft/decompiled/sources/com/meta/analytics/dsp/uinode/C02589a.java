package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02589a extends AbstractC0664Ps {
    public final /* synthetic */ C0747Sx A00;

    public C02589a(C0747Sx c0747Sx) {
        this.A00 = c0747Sx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0665Pt c0665Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0646Pa(this));
    }
}
