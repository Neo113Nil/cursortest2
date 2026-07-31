package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC2619Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C2624Sx A01;

    public CallableC2619Ss(C2624Sx c2624Sx, C2620St c2620St) {
        this.A01 = c2624Sx;
        new Handler(Looper.getMainLooper()).post(new C3221gl(this, c2624Sx, c2620St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C2620St c2620St) {
        T8 t8;
        T8 t82;
        long currentTimeMillis = System.currentTimeMillis();
        t8 = this.A01.A04;
        C3149fb A06 = C3149fb.A06(t8.A02());
        Uri A00 = XB.A00(c2620St.A08);
        long j = c2620St.A00;
        if (j == -1) {
            t82 = this.A01.A04;
            j = C2668Up.A0S(t82);
        }
        A06.A0I(A00, new C3220gk(this, c2620St, j, currentTimeMillis), j);
    }
}
