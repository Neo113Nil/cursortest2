package com.five_corp.ad.internal.http.auxcache;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ h b;

    public d(h hVar, i iVar) {
        this.b = hVar;
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            jVar.g.remove(this.a.a);
        }
        this.b.a(this.a);
    }
}
