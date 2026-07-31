package com.five_corp.ad.internal.bgtask;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class e {
    public final a a;
    public final com.five_corp.ad.internal.time.a b;
    public final HandlerThread c;
    public final Handler d;
    public Long e;

    public e(int i, a aVar, com.five_corp.ad.internal.time.a aVar2) {
        String str = e.class.getName() + ":" + i;
        this.a = aVar;
        this.b = aVar2;
        HandlerThread handlerThread = new HandlerThread(str);
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
        this.e = null;
    }

    public final void a(boolean z) {
        h hVar;
        if (z) {
            this.e = null;
        }
        while (true) {
            this.b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            a aVar = this.a;
            synchronized (aVar.a) {
                try {
                    if (aVar.b.isEmpty()) {
                        hVar = null;
                    } else {
                        Iterator it = aVar.b.iterator();
                        g gVar = null;
                        while (it.hasNext()) {
                            g gVar2 = (g) it.next();
                            if (gVar2.c <= currentTimeMillis) {
                                if (gVar != null) {
                                    if (m.a(gVar2.a.a) < m.a(gVar.a.a)) {
                                    }
                                }
                                gVar = gVar2;
                            }
                        }
                        if (gVar != null) {
                            aVar.b.remove(gVar);
                        }
                        if (gVar != null) {
                            hVar = new h(gVar, 0L);
                        } else {
                            long j = ((g) aVar.b.get(0)).c;
                            Iterator it2 = aVar.b.iterator();
                            while (it2.hasNext()) {
                                j = Math.min(j, ((g) it2.next()).c);
                            }
                            hVar = new h(null, j);
                        }
                    }
                } finally {
                }
            }
            if (hVar == null) {
                this.c.getId();
                return;
            }
            g gVar3 = hVar.a;
            if (gVar3 == null) {
                long j2 = hVar.b;
                this.c.getId();
                Long l = this.e;
                if (l != null && l.longValue() <= j2) {
                    this.c.getId();
                    return;
                }
                this.c.getId();
                this.e = Long.valueOf(j2);
                this.d.postDelayed(new d(this), Math.max(j2 - currentTimeMillis, 0L));
                return;
            }
            this.c.getId();
            gVar3.a.toString();
            try {
                if (gVar3.a.c()) {
                    gVar3.a.toString();
                    gVar3.a.a();
                } else if (gVar3.d < 3) {
                    gVar3.a.toString();
                    int i = gVar3.d;
                    gVar3.c = currentTimeMillis + (60000 << i);
                    gVar3.d = i + 1;
                    this.a.a(gVar3);
                } else {
                    gVar3.a.toString();
                    gVar3.a.b();
                }
            } catch (Exception e) {
                gVar3.a.toString();
                com.five_corp.ad.internal.logger.a aVar2 = gVar3.b;
                aVar2.getClass();
                aVar2.a.a(new com.five_corp.ad.internal.logger.b(6, null, null, e + " - " + Log.getStackTraceString(e)));
                gVar3.a.b();
            }
        }
    }
}
