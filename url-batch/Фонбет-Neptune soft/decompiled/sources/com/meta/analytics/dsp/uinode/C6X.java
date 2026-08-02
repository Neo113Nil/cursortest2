package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.6X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6X implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C01946c A01;

    public C6X(C01946c c01946c, C6Y c6y) {
        this.A01 = c01946c;
        new Handler(Looper.getMainLooper()).post(new C0892Yq(this, c01946c, c6y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C6Y c6y) {
        C02177f c02177f;
        C02177f c02177f2;
        long currentTimeMillis = System.currentTimeMillis();
        c02177f = this.A01.A04;
        R0 A05 = R0.A05(c02177f.A01());
        Uri A00 = AbstractC0540Ky.A00(c6y.A08);
        long j = c6y.A00;
        if (j == -1) {
            c02177f2 = this.A01.A04;
            j = C0478Ih.A0O(c02177f2);
        }
        A05.A0G(A00, new C0891Yp(this, c6y, j, currentTimeMillis), j);
    }
}
