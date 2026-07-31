package com.five_corp.ad.internal.context;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class r implements com.five_corp.ad.internal.hub.global.d, com.five_corp.ad.internal.hub.global.f {
    public final com.five_corp.ad.internal.time.a a;
    public final com.five_corp.ad.internal.tracking_data.b b;
    public final com.five_corp.ad.internal.hub.global.b c;
    public final long d;
    public final Handler e;
    public ArrayList f;
    public long g;
    public com.five_corp.ad.internal.media_config.a h;
    public com.five_corp.ad.internal.tracking_data.d i;

    public r(com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.tracking_data.b bVar, com.five_corp.ad.internal.hub.global.b bVar2) {
        HandlerThread handlerThread = new HandlerThread("signal collector worker thread");
        handlerThread.start();
        this.a = aVar;
        this.b = bVar;
        this.c = bVar2;
        this.d = 1000L;
        this.e = new Handler(handlerThread.getLooper());
        this.f = new ArrayList();
        this.g = 0L;
        this.h = new com.five_corp.ad.internal.media_config.a(new ArrayList(), false, 300000L, false, false, new com.five_corp.ad.internal.media_config.b(), 6);
        this.i = null;
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            long j = oVar.b;
            this.a.getClass();
            if (j < System.currentTimeMillis()) {
                oVar.d.a(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.J5, null, null));
            } else {
                arrayList.add(oVar);
            }
        }
        this.f = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        this.e.postDelayed(new r$$ExternalSyntheticLambda0(this), this.d);
    }

    public final void b(q qVar, g gVar, p pVar, long j, long j2) {
        s sVar;
        com.five_corp.ad.internal.hub.global.b bVar;
        int i;
        com.five_corp.ad.internal.tracking_data.d dVar = this.i;
        if (dVar != null && dVar.a()) {
            qVar.a(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.R5, null, null));
            return;
        }
        com.five_corp.ad.internal.tracking_data.a a = this.b.a();
        Iterator it = this.h.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                sVar = null;
                break;
            }
            com.five_corp.ad.internal.media_config.c cVar = (com.five_corp.ad.internal.media_config.c) it.next();
            if (cVar.a.equals(gVar.b)) {
                sVar = new s(gVar, this.h, cVar, a);
                break;
            }
        }
        if (sVar != null) {
            if (sVar.c.b) {
                pVar.a(sVar);
            } else {
                qVar.a(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.Q5, null, null));
            }
            if (j - this.g > this.h.c) {
                this.c.a(3);
                return;
            }
            return;
        }
        if (this.g == 0) {
            bVar = this.c;
            i = 4;
        } else {
            bVar = this.c;
            i = 5;
        }
        bVar.a(i);
        if (this.f.isEmpty()) {
            this.e.postDelayed(new r$$ExternalSyntheticLambda0(this), this.d);
        }
        this.f.add(new o(gVar, j + j2, pVar, qVar));
    }

    public final void a(final q qVar, final g gVar, final p pVar, final long j, final long j2) {
        this.e.post(new Runnable() { // from class: com.five_corp.ad.internal.context.r$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                r.this.b(qVar, gVar, pVar, j, j2);
            }
        });
    }

    @Override // com.five_corp.ad.internal.hub.global.d
    public final void a(final com.five_corp.ad.internal.cache.r rVar) {
        this.e.post(new Runnable() { // from class: com.five_corp.ad.internal.context.r$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                r.this.b(rVar);
            }
        });
    }

    @Override // com.five_corp.ad.internal.hub.global.f
    public final void a(final com.five_corp.ad.internal.tracking_data.d dVar) {
        this.e.post(new Runnable() { // from class: com.five_corp.ad.internal.context.r$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                r.this.b(dVar);
            }
        });
    }

    public final void b(com.five_corp.ad.internal.cache.r rVar) {
        s sVar;
        q qVar;
        com.five_corp.ad.internal.l lVar;
        this.g = rVar.b;
        this.h = rVar.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            g gVar = oVar.a;
            com.five_corp.ad.internal.tracking_data.a a = this.b.a();
            Iterator it2 = this.h.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    sVar = null;
                    break;
                }
                com.five_corp.ad.internal.media_config.c cVar = (com.five_corp.ad.internal.media_config.c) it2.next();
                if (cVar.a.equals(gVar.b)) {
                    sVar = new s(gVar, this.h, cVar, a);
                    break;
                }
            }
            if (sVar == null) {
                qVar = oVar.d;
                lVar = new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.S5, null, null);
            } else if (!sVar.c.b) {
                qVar = oVar.d;
                lVar = new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.Q5, null, null);
            } else {
                oVar.c.a(sVar);
            }
            qVar.a(lVar);
        }
        this.f = arrayList;
    }

    public final void b(com.five_corp.ad.internal.tracking_data.d dVar) {
        this.i = dVar;
        if (dVar.a()) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((o) it.next()).d.a(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.R5, null, null));
            }
            this.f.clear();
        }
    }
}
