package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: assets/audience_network/classes2.dex */
public class QR implements Runnable {
    public final /* synthetic */ C7P A00;
    public final /* synthetic */ ArrayList A01;

    public QR(C7P c7p, ArrayList arrayList) {
        this.A00 = c7p;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C2551Qa c2551Qa = (C2551Qa) it.next();
            this.A00.A0e(c2551Qa.A04, c2551Qa.A00, c2551Qa.A01, c2551Qa.A02, c2551Qa.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
