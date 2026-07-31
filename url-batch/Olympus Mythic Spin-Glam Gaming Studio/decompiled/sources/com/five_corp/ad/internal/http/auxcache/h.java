package com.five_corp.ad.internal.http.auxcache;

import android.os.Handler;
import android.os.HandlerThread;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.internal.l;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class h {
    public final Handler a;
    public final com.five_corp.ad.internal.logger.a b;
    public final com.five_corp.ad.internal.storage.d c;
    public final com.five_corp.ad.internal.http.connection.b d;
    public final int e;
    public Object f;
    public boolean g;
    public final ArrayList h;
    public final k i;
    public final k j;

    public h(com.five_corp.ad.internal.logger.a aVar, com.five_corp.ad.internal.storage.d dVar, com.five_corp.ad.internal.http.connection.b bVar) {
        HandlerThread handlerThread = new HandlerThread("AuxiliaryResourceCacheDownloadManager");
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
        this.b = aVar;
        this.c = dVar;
        this.d = bVar;
        this.e = 3;
        this.f = null;
        this.g = false;
        this.h = new ArrayList();
        this.i = new k(1000L);
        this.j = new k(500L);
    }

    public final j a(com.five_corp.ad.internal.http.a aVar) {
        com.five_corp.ad.internal.context.h hVar = (com.five_corp.ad.internal.context.h) aVar.a.get();
        com.five_corp.ad.internal.ad.a aVar2 = hVar != null ? hVar.a : null;
        if (aVar2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar2.B.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.ad.h hVar2 = (com.five_corp.ad.internal.ad.h) it.next();
            if (!hVar2.equals(aVar2.h) || aVar2.a != CreativeType.MOVIE || aVar2.d == 1) {
                arrayList.add(hVar2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new j(aVar2.b, aVar, this.c, arrayList, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r3 = r1.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r1.k == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        r4 = r1.g;
        r1.k = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r4 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        this.f = null;
        if (this.g && !this.j.b.isEmpty()) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                Iterator it2 = iVar.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((j) it2.next()).a.b == 2) {
                        break;
                    }
                }
            }
            return;
        }
        if (this.g) {
            return;
        }
        this.g = true;
        this.i.a();
        this.j.a();
        a((i) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        r10 = r9.c.a(r1);
        r8 = new com.five_corp.ad.internal.http.auxcache.i(r1, r10, r5, r9.d, r9);
        r2 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r8.g == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        r0 = new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.J2, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        r8.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d9, code lost:
    
        r9.h.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        r10 = r10.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if (r10.a != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        r8.b(r10.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        r10 = ((java.lang.Integer) r10.c).intValue();
        r0 = new com.five_corp.ad.internal.http.client.a(r1, r8, r8.d);
        r1 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
    
        r8.g = r0;
        r8.i = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d5, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        r0.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a8, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e4, code lost:
    
        throw r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(i iVar) {
        long j;
        long j2;
        com.five_corp.ad.internal.ad.h hVar;
        if (iVar != null) {
            this.h.remove(iVar);
        }
        while (this.h.size() < this.e) {
            l lVar = null;
            k kVar = !this.j.b.isEmpty() ? this.j : !this.i.b.isEmpty() ? this.i : null;
            if (kVar == null) {
                if (this.h.size() == 0) {
                    this.g = false;
                    int i = 10;
                    if (!this.j.c.isEmpty()) {
                        k kVar2 = this.j;
                        if (kVar2.c.isEmpty()) {
                            j2 = kVar2.a;
                        } else {
                            Iterator it = kVar2.c.iterator();
                            while (it.hasNext()) {
                                i = Math.min(i, ((j) it.next()).i);
                            }
                            j2 = kVar2.a;
                        }
                        long j3 = j2 << i;
                        Object obj = new Object();
                        this.f = obj;
                        this.a.postDelayed(new g(this, obj), j3);
                        return;
                    }
                    if (this.i.c.isEmpty()) {
                        return;
                    }
                    k kVar3 = this.i;
                    if (kVar3.c.isEmpty()) {
                        j = kVar3.a;
                    } else {
                        Iterator it2 = kVar3.c.iterator();
                        while (it2.hasNext()) {
                            i = Math.min(i, ((j) it2.next()).i);
                        }
                        j = kVar3.a;
                    }
                    long j4 = j << i;
                    Object obj2 = new Object();
                    this.f = obj2;
                    this.a.postDelayed(new g(this, obj2), j4);
                    return;
                }
                return;
            }
            j jVar = (j) kVar.b.peekFirst();
            if (jVar.a.a.get() != null) {
                while (!jVar.e.isEmpty()) {
                    hVar = (com.five_corp.ad.internal.ad.h) jVar.e.pollFirst();
                    if (!jVar.d.a(hVar).c()) {
                        jVar.g.add(hVar);
                        break;
                    }
                }
            }
            hVar = null;
            if (hVar != null) {
                Iterator it3 = this.h.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    i iVar2 = (i) it3.next();
                    if (iVar2.a.equals(hVar)) {
                        iVar2.c.add(jVar);
                        break;
                    }
                }
            } else {
                kVar.b.pollFirst();
            }
        }
    }
}
