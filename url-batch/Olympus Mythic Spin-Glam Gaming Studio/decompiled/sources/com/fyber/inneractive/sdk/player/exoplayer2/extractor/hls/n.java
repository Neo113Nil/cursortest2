package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.w;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public final class n implements x, w, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public final int a;
    public final i b;
    public final f c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.o e;
    public final int f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f h;
    public boolean n;
    public boolean o;
    public int p;
    public com.fyber.inneractive.sdk.player.exoplayer2.o q;
    public int r;
    public boolean s;
    public z t;
    public int u;
    public boolean[] v;
    public long w;
    public long x;
    public boolean y;
    public final b0 g = new b0("Loader:HlsSampleStreamWrapper");
    public final d i = new d();
    public final SparseArray j = new SparseArray();
    public final LinkedList k = new LinkedList();
    public final m l = new m(this);
    public final Handler m = new Handler();

    public n(int i, i iVar, f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i2, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2) {
        this.a = i;
        this.b = iVar;
        this.c = fVar;
        this.d = bVar;
        this.e = oVar;
        this.f = i2;
        this.h = fVar2;
        this.w = j;
        this.x = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(q qVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(long j) {
        boolean z;
        h hVar;
        d dVar;
        int i;
        int i2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar;
        int i3;
        int i4;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        int i5;
        if (this.y || this.g.a()) {
            return false;
        }
        f fVar = this.c;
        h hVar2 = this.k.isEmpty() ? null : (h) this.k.getLast();
        long j2 = this.x;
        if (j2 == -9223372036854775807L) {
            j2 = j;
        }
        d dVar2 = this.i;
        int a = hVar2 == null ? -1 : fVar.f.a(hVar2.c);
        fVar.k = null;
        if (hVar2 != null) {
            Math.max(0L, hVar2.f - j2);
        }
        fVar.p.d();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar.p;
        int i6 = bVar.c[bVar.a()];
        boolean z2 = a != i6;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = fVar.d[i6];
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.e.d.get(aVar2);
        if (hVar3.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i7 = a;
            h hVar4 = hVar2;
            long max = Math.max(30000L, com.fyber.inneractive.sdk.player.exoplayer2.b.a(hVar3.d.o));
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar3 = hVar3.d;
            if (dVar3.j || (i5 = dVar3.b) == 2 || i5 == 1 || hVar3.e + max > elapsedRealtime) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d a2 = fVar.e.a(aVar2);
                if (hVar4 == null || z2) {
                    hVar = hVar4;
                    if (hVar != null) {
                        j2 = hVar.f;
                    }
                    if (a2.j) {
                        dVar = dVar2;
                    } else {
                        dVar = dVar2;
                        if (j2 > a2.d + a2.o) {
                            i2 = a2.m.size() + a2.g;
                            i3 = i6;
                        }
                    }
                    List list = a2.m;
                    Long valueOf = Long.valueOf(j2 - a2.d);
                    boolean z3 = !fVar.e.m || hVar == null;
                    int i8 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a;
                    int binarySearch = Collections.binarySearch(list, valueOf);
                    if (binarySearch < 0) {
                        i = -(binarySearch + 2);
                    } else {
                        while (true) {
                            int i9 = binarySearch - 1;
                            if (i9 < 0 || ((Comparable) list.get(i9)).compareTo(valueOf) != 0) {
                                break;
                            }
                            binarySearch = i9;
                        }
                        i = binarySearch;
                    }
                    if (z3) {
                        i = Math.max(0, i);
                    }
                    int i10 = a2.g;
                    i2 = i + i10;
                    if (i2 < i10 && hVar != null) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar3 = fVar.d[i7];
                        a2 = fVar.e.a(aVar3);
                        aVar = aVar3;
                        i2 = hVar.i + 1;
                        i3 = i7;
                        i4 = a2.g;
                        if (i2 >= i4) {
                            fVar.j = new com.fyber.inneractive.sdk.player.exoplayer2.source.g();
                        } else {
                            int i11 = i2 - i4;
                            if (i11 < a2.m.size()) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c) a2.m.get(i11);
                                if (cVar.e) {
                                    Uri a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(a2.a, cVar.f);
                                    if (!a3.equals(fVar.l)) {
                                        dVar.a = new c(fVar.b, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(a3, 0L, 0L, -1L, null, 1), fVar.d[i3].b, fVar.p.c(), fVar.p.b(), fVar.i, cVar.g);
                                    } else if (!com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(cVar.g, fVar.n)) {
                                        fVar.a(a3, cVar.g, fVar.m);
                                    }
                                } else {
                                    fVar.l = null;
                                    fVar.m = null;
                                    fVar.n = null;
                                    fVar.o = null;
                                }
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar2 = a2.l;
                                if (cVar2 != null) {
                                    Uri a4 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(a2.a, cVar2.a);
                                    long j3 = cVar2.h;
                                    kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(a4, j3, j3, cVar2.i, null, 0);
                                } else {
                                    kVar = null;
                                }
                                long j4 = a2.d + cVar.d;
                                int i12 = a2.f + cVar.c;
                                o oVar = fVar.c;
                                v vVar = (v) oVar.a.get(i12);
                                if (vVar == null) {
                                    vVar = new v(Long.MAX_VALUE);
                                    oVar.a.put(i12, vVar);
                                }
                                v vVar2 = vVar;
                                Uri a5 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(a2.a, cVar.a);
                                long j5 = cVar.h;
                                dVar.a = new h(fVar.a, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(a5, j5, j5, cVar.i, null, 0), kVar, aVar, fVar.g, fVar.p.c(), fVar.p.b(), j4, j4 + cVar.b, i2, i12, fVar.h, vVar2, hVar, fVar.m, fVar.o);
                            } else if (a2.j) {
                                dVar.b = true;
                            } else {
                                dVar.c = aVar;
                                fVar.k = aVar;
                            }
                        }
                        d dVar4 = this.i;
                        z = dVar4.b;
                        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar4 = dVar4.a;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar5 = dVar4.c;
                        dVar4.a = null;
                        dVar4.b = false;
                        dVar4.c = null;
                        if (z) {
                            this.y = true;
                            return true;
                        }
                        if (aVar4 == null) {
                            if (aVar5 == null) {
                                return false;
                            }
                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) this.b.a.d.get(aVar5)).b();
                            return false;
                        }
                        if (aVar4 instanceof h) {
                            this.x = -9223372036854775807L;
                            h hVar5 = (h) aVar4;
                            hVar5.D = this;
                            int i13 = hVar5.j;
                            boolean z4 = hVar5.t;
                            this.r = i13;
                            for (int i14 = 0; i14 < this.j.size(); i14++) {
                                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i14)).c.r = i13;
                            }
                            if (z4) {
                                for (int i15 = 0; i15 < this.j.size(); i15++) {
                                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i15)).m = true;
                                }
                            }
                            this.k.add(hVar5);
                        }
                        b0 b0Var = this.g;
                        int i16 = this.f;
                        b0Var.getClass();
                        Looper myLooper = Looper.myLooper();
                        if (myLooper == null) {
                            throw new IllegalStateException();
                        }
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        y yVar = new y(b0Var, myLooper, aVar4, this, i16, elapsedRealtime2);
                        if (b0Var.b != null) {
                            throw new IllegalStateException();
                        }
                        b0Var.b = yVar;
                        yVar.e = null;
                        b0Var.a.execute(yVar);
                        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.h;
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2 = aVar4.a;
                        int i17 = aVar4.b;
                        int i18 = this.a;
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = aVar4.c;
                        int i19 = aVar4.d;
                        Object obj = aVar4.e;
                        long j6 = aVar4.f;
                        long j7 = aVar4.g;
                        if (fVar2.b == null) {
                            return true;
                        }
                        fVar2.a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.a(fVar2, kVar2, i17, i18, oVar2, i19, obj, j6, j7, elapsedRealtime2));
                        return true;
                    }
                    i3 = i6;
                } else {
                    hVar = hVar4;
                    i2 = hVar.i + 1;
                    i3 = i6;
                    dVar = dVar2;
                }
                aVar = aVar2;
                i4 = a2.g;
                if (i2 >= i4) {
                }
                d dVar42 = this.i;
                z = dVar42.b;
                com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar42 = dVar42.a;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar52 = dVar42.c;
                dVar42.a = null;
                dVar42.b = false;
                dVar42.c = null;
                if (z) {
                }
            }
        }
        dVar2.c = aVar2;
        fVar.k = aVar2;
        d dVar422 = this.i;
        z = dVar422.b;
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar422 = dVar422.a;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar522 = dVar422.c;
        dVar422.a = null;
        dVar422.b = false;
        dVar422.c = null;
        if (z) {
        }
    }

    public final void c(long j) {
        this.w = j;
        this.x = j;
        this.y = false;
        this.k.clear();
        if (this.g.a()) {
            this.g.b.a(false);
            return;
        }
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i)).a(this.v[i]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.m.post(this.l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long j = this.x;
        if (j != -9223372036854775807L) {
            return j;
        }
        if (this.y) {
            return Long.MIN_VALUE;
        }
        return ((h) this.k.getLast()).g;
    }

    public final void h() {
        if (this.s || this.o || !this.n) {
            return;
        }
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i)).e() == null) {
                return;
            }
        }
        int size2 = this.j.size();
        int i2 = 0;
        char c = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= size2) {
                break;
            }
            String str = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i2)).e().f;
            char c2 = "video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 3 : "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 2 : "text".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 1 : (char) 0;
            if (c2 > c) {
                i3 = i2;
                c = c2;
            } else if (c2 == c && i3 != -1) {
                i3 = -1;
            }
            i2++;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar = this.c.f;
        int i4 = yVar.a;
        this.u = -1;
        this.v = new boolean[size2];
        com.fyber.inneractive.sdk.player.exoplayer2.source.y[] yVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            com.fyber.inneractive.sdk.player.exoplayer2.o e = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i5)).e();
            if (i5 == i3) {
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    oVarArr[i6] = a(yVar.b[i6], e);
                }
                yVarArr[i5] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(oVarArr);
                this.u = i5;
            } else {
                yVarArr[i5] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(a((c == 3 && "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(e.f))) ? this.e : null, e));
            }
        }
        this.t = new z(yVarArr);
        this.o = true;
        i iVar = this.b;
        int i7 = iVar.k - 1;
        iVar.k = i7;
        if (i7 > 0) {
            return;
        }
        int i8 = 0;
        for (n nVar : iVar.n) {
            i8 += nVar.t.a;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.y[] yVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[i8];
        int i9 = 0;
        for (n nVar2 : iVar.n) {
            int i10 = nVar2.t.a;
            int i11 = 0;
            while (i11 < i10) {
                yVarArr2[i9] = nVar2.t.b[i11];
                i11++;
                i9++;
            }
        }
        iVar.m = new z(yVarArr2);
        ((com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j).f.obtainMessage(8, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.a;
        int i = aVar.b;
        int i2 = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.c;
        int i3 = aVar.d;
        Object obj = aVar.e;
        long j3 = aVar.f;
        long j4 = aVar.g;
        long c = aVar.c();
        if (fVar.b != null) {
            fVar.a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, i, i2, oVar, i3, obj, j3, j4, j, j2, c));
        }
        if (z) {
            return;
        }
        int size = this.j.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i4)).a(this.v[i4]);
        }
        i iVar = this.b;
        iVar.getClass();
        if (iVar.m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j;
        lVar.getClass();
        lVar.f.obtainMessage(9, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        f fVar = this.c;
        fVar.getClass();
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            fVar.i = cVar.i;
            fVar.a(cVar.a.a, cVar.l, cVar.m);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.a;
        int i = aVar.b;
        int i2 = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.c;
        int i3 = aVar.d;
        Object obj = aVar.e;
        long j3 = aVar.f;
        long j4 = aVar.g;
        long c = aVar.c();
        if (fVar2.b != null) {
            fVar2.a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar2, kVar, i, i2, oVar, i3, obj, j3, j4, j, j2, c));
        }
        if (!this.o) {
            b(this.w);
            return;
        }
        i iVar = this.b;
        iVar.getClass();
        if (iVar.m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j;
        lVar.getClass();
        lVar.f.obtainMessage(9, iVar).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2, IOException iOException) {
        boolean z;
        boolean z2;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar;
        boolean z3;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.v vVar;
        int i;
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        boolean z4 = aVar instanceof h;
        boolean z5 = !z4 || aVar.c() == 0;
        f fVar2 = this.c;
        if (z5) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar2.p;
            int a = fVar2.f.a(aVar.c);
            int i2 = 0;
            while (true) {
                if (i2 >= bVar.b) {
                    i2 = -1;
                    break;
                }
                if (bVar.c[i2] == a) {
                    break;
                }
                i2++;
            }
            if ((iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) && ((i = (vVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) iOException).a) == 404 || i == 410)) {
                z3 = bVar.a(i2);
                int i3 = vVar.a;
                if (z3) {
                    StringBuilder a2 = l.a("Blacklisted: duration=60000, responseCode=", i3, ", format=");
                    a2.append(bVar.d[i2]);
                    Log.w("ChunkedTrackBlacklist", a2.toString());
                } else {
                    StringBuilder a3 = l.a("Blacklisting failed (cannot blacklist last enabled track): responseCode=", i3, ", format=");
                    a3.append(bVar.d[i2]);
                    Log.w("ChunkedTrackBlacklist", a3.toString());
                }
            } else {
                z3 = false;
            }
            if (z3) {
                z = true;
                if (z) {
                    z2 = false;
                } else {
                    if (z4) {
                        if (((h) this.k.removeLast()) == aVar) {
                            if (this.k.isEmpty()) {
                                this.x = this.w;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    z2 = true;
                }
                fVar = this.h;
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.a;
                int i4 = aVar.b;
                int i5 = this.a;
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.c;
                int i6 = aVar.d;
                Object obj = aVar.e;
                long j3 = aVar.f;
                long j4 = aVar.g;
                long c = aVar.c();
                if (fVar.b != null) {
                    fVar.a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, i4, i5, oVar, i6, obj, j3, j4, j, j2, c, iOException, z2));
                }
                if (z2) {
                    return 0;
                }
                if (!this.o) {
                    b(this.w);
                } else {
                    i iVar = this.b;
                    iVar.getClass();
                    if (iVar.m != null) {
                        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j;
                        lVar.getClass();
                        lVar.f.obtainMessage(9, iVar).sendToTarget();
                    }
                }
                return 2;
            }
        } else {
            fVar2.getClass();
        }
        z = false;
        if (z) {
        }
        fVar = this.h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2 = aVar.a;
        int i42 = aVar.b;
        int i52 = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = aVar.c;
        int i62 = aVar.d;
        Object obj2 = aVar.e;
        long j32 = aVar.f;
        long j42 = aVar.g;
        long c2 = aVar.c();
        if (fVar.b != null) {
        }
        if (z2) {
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i, int i2) {
        if (this.j.indexOfKey(i) >= 0) {
            return (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.get(i);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.d);
        gVar.n = this;
        gVar.c.r = this.r;
        this.j.put(i, gVar);
        return gVar;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        String a;
        if (oVar == null) {
            return oVar2;
        }
        int c = com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(oVar2.f);
        if (c == 1) {
            a = a(oVar.c, 1);
        } else {
            a = c == 2 ? a(oVar.c, 2) : null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.a, oVar2.e, oVar2.f, a, oVar.b, oVar2.g, oVar.j, oVar.k, oVar2.l, oVar2.m, oVar2.n, oVar2.p, oVar2.o, oVar2.q, oVar2.r, oVar2.s, oVar2.t, oVar2.u, oVar2.v, oVar.x, oVar.y, oVar2.z, oVar2.w, oVar2.h, oVar2.i, oVar2.d);
    }

    public static String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (i == com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str2))) {
                if (sb.length() > 0) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.n = true;
        this.m.post(this.l);
    }
}
