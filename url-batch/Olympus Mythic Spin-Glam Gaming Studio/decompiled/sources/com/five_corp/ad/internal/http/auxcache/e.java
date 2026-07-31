package com.five_corp.ad.internal.http.auxcache;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ h b;

    public e(h hVar, i iVar) {
        this.b = hVar;
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar;
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar.e.isEmpty()) {
                h hVar = this.b;
                int i = jVar.a.b;
                hVar.getClass();
                int a = com.five_corp.ad.e.a(i);
                if (a == 0) {
                    kVar = hVar.i;
                } else {
                    if (a != 1) {
                        throw new RuntimeException("Unknown DownloadRequesterPriority: ".concat(com.five_corp.ad.internal.http.b.a(i)));
                    }
                    kVar = hVar.j;
                }
                kVar.b.addFirst(jVar);
            }
            com.five_corp.ad.internal.ad.h hVar2 = this.a.a;
            jVar.g.remove(hVar2);
            jVar.e.addLast(hVar2);
        }
        this.b.a(this.a);
    }
}
