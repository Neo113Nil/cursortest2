package com.five_corp.ad.internal.bgtask;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class b {
    public final com.five_corp.ad.internal.hub.global.b a;
    public final a b;
    public final ArrayList c;

    public b(com.five_corp.ad.internal.hub.global.b bVar, int i, com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.logger.a aVar2) {
        this.a = bVar;
        this.b = new a(aVar2);
        this.c = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.c.add(new e(i2, this.b, aVar));
        }
    }

    public final void a() {
        a aVar = this.b;
        synchronized (aVar.a) {
            try {
                Iterator it = aVar.b.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).c = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            eVar.d.post(new c(eVar));
        }
    }
}
