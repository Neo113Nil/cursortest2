package com.five_corp.ad.internal.hub.global;

import com.five_corp.ad.internal.beacon.l;
import com.five_corp.ad.internal.bgtask.g;
import com.five_corp.ad.internal.bgtask.i;
import com.five_corp.ad.internal.bgtask.n;
import com.five_corp.ad.internal.cache.o;
import com.five_corp.ad.internal.cache.p;
import com.five_corp.ad.internal.cache.q;
import com.five_corp.ad.internal.cache.r;
import com.five_corp.ad.internal.j;
import com.five_corp.ad.internal.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class b {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();

    public final void a(n nVar) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.bgtask.b bVar = (com.five_corp.ad.internal.bgtask.b) it.next();
            com.five_corp.ad.internal.bgtask.a aVar = bVar.b;
            aVar.getClass();
            aVar.a(new g(nVar, aVar.c));
            Iterator it2 = bVar.c.iterator();
            while (it2.hasNext()) {
                com.five_corp.ad.internal.bgtask.e eVar = (com.five_corp.ad.internal.bgtask.e) it2.next();
                eVar.d.post(new com.five_corp.ad.internal.bgtask.c(eVar));
            }
        }
    }

    public final void b(com.five_corp.ad.internal.beacon.c cVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            v vVar = (v) ((c) it.next());
            synchronized (vVar.e) {
                try {
                    com.five_corp.ad.internal.tracking_data.d dVar = vVar.g;
                    if (dVar == null || !dVar.a()) {
                        vVar.d.a(new com.five_corp.ad.internal.bgtask.f(cVar, vVar.a, vVar.b));
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            synchronized (jVar.e) {
                try {
                    if (!jVar.f) {
                        jVar.f = true;
                        jVar.g = false;
                        jVar.d.a(jVar.a(i));
                    }
                } finally {
                }
            }
        }
    }

    public final void a(com.five_corp.ad.internal.g gVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            q qVar = (q) ((a) it.next());
            b bVar = qVar.b;
            r rVar = new r(gVar.a, System.currentTimeMillis());
            Iterator it2 = bVar.c.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).a(rVar);
            }
            o oVar = qVar.a;
            synchronized (oVar) {
                try {
                    HashSet hashSet = new HashSet();
                    com.five_corp.ad.internal.util.d dVar = oVar.b;
                    dVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    dVar.a(arrayList);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        p pVar = (p) it3.next();
                        if (pVar.b) {
                            hashSet.addAll(pVar.a.keySet());
                        }
                    }
                    oVar.a.a(hashSet);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(com.five_corp.ad.internal.beacon.c cVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            v vVar = (v) ((c) it.next());
            synchronized (vVar.e) {
                try {
                    com.five_corp.ad.internal.tracking_data.d dVar = vVar.g;
                    if (dVar == null || !dVar.a()) {
                        vVar.d.a(new com.five_corp.ad.internal.bgtask.f(cVar, vVar.a, vVar.b));
                    }
                } finally {
                }
            }
        }
    }

    public final void a(com.five_corp.ad.internal.logger.b bVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            v vVar = (v) ((c) it.next());
            synchronized (vVar.e) {
                try {
                    com.five_corp.ad.internal.tracking_data.d dVar = vVar.g;
                    if ((dVar == null || !dVar.a()) && com.five_corp.ad.e.a(vVar.f) <= com.five_corp.ad.e.a(bVar.a)) {
                        vVar.d.a(new com.five_corp.ad.internal.bgtask.j(bVar, vVar.a, vVar.b));
                    }
                } finally {
                }
            }
        }
    }

    public final void a(com.five_corp.ad.internal.beacon.a aVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            v vVar = (v) ((c) it.next());
            synchronized (vVar.e) {
                try {
                    com.five_corp.ad.internal.tracking_data.d dVar = vVar.g;
                    if (dVar == null || !dVar.a()) {
                        vVar.d.a(new i(aVar, vVar.a, vVar.b));
                    }
                } finally {
                }
            }
        }
    }

    public final void a(l lVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            v vVar = (v) ((c) it.next());
            synchronized (vVar.e) {
                try {
                    com.five_corp.ad.internal.tracking_data.d dVar = vVar.g;
                    if (dVar == null || !dVar.a()) {
                        vVar.d.a(new com.five_corp.ad.internal.bgtask.l(lVar, vVar.a, vVar.b));
                    }
                } finally {
                }
            }
        }
    }
}
