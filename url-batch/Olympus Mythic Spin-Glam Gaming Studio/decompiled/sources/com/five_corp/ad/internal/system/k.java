package com.five_corp.ad.internal.system;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class k implements Runnable {
    public final /* synthetic */ ArrayList a;

    public k(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.f) ((d) it.next())).n();
        }
    }
}
