package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class l implements Handler.Callback, com.fyber.inneractive.sdk.player.exoplayer2.source.r, com.fyber.inneractive.sdk.player.exoplayer2.source.t {
    public h A;
    public h B;
    public x C;
    public final a[] a;
    public final a[] b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i c;
    public final c d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.u e;
    public final Handler f;
    public final HandlerThread g;
    public final Handler h;
    public final w i;
    public final v j;
    public i k;
    public s l;
    public a m;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.h n;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u o;
    public a[] p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u = 1;
    public long v;
    public int w;
    public j x;
    public long y;
    public h z;

    public l(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar, boolean z, f fVar, i iVar, g gVar) {
        this.a = aVarArr;
        this.c = dVar;
        this.d = cVar;
        this.r = z;
        this.h = fVar;
        this.k = iVar;
        this.b = new a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar = aVarArr[i];
            aVar.getClass();
            this.b[i] = aVar;
        }
        this.e = new com.fyber.inneractive.sdk.player.exoplayer2.util.u();
        this.p = new a[0];
        this.i = new w();
        this.j = new v();
        this.l = s.d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.g = handlerThread;
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper(), this);
    }

    public static void a(a aVar) {
        int i = aVar.c;
        if (i == 2) {
            if (i != 2) {
                throw new IllegalStateException();
            }
            aVar.c = 1;
            aVar.j();
        }
    }

    public final void b(boolean z) {
        if (this.t != z) {
            this.t = z;
            this.h.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void c(boolean z) {
        this.s = false;
        this.r = z;
        if (!z) {
            g();
            h();
            a(false);
            return;
        }
        int i = this.u;
        if (i != 3) {
            if (i == 2) {
                this.f.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
        if (!uVar.a) {
            uVar.c = SystemClock.elapsedRealtime();
            uVar.a = true;
        }
        for (a aVar : this.p) {
            if (aVar.c != 1) {
                throw new IllegalStateException();
            }
            aVar.c = 2;
            aVar.i();
        }
        this.f.sendEmptyMessage(2);
    }

    public final synchronized void d() {
        if (this.q) {
            return;
        }
        this.f.sendEmptyMessage(6);
        while (!this.q) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.g.quit();
    }

    public final void e() {
        a(true);
        this.d.a(true);
        a(1);
        synchronized (this) {
            this.q = true;
            notifyAll();
        }
    }

    public final void f() {
        h hVar = this.B;
        if (hVar == null) {
            return;
        }
        boolean z = true;
        while (hVar != null && hVar.i) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j a = hVar.p.a(hVar.o, hVar.a.a());
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.s;
            if (jVar != null) {
                for (int i = 0; i < a.b.a; i++) {
                    if (a.a(jVar, i)) {
                    }
                }
                if (hVar == this.A) {
                    z = false;
                }
                hVar = hVar.k;
            }
            hVar.m = a;
            if (z) {
                h hVar2 = this.A;
                h hVar3 = this.B;
                boolean z2 = hVar2 != hVar3;
                for (h hVar4 = hVar3.k; hVar4 != null; hVar4 = hVar4.k) {
                    hVar4.a();
                }
                h hVar5 = this.B;
                hVar5.k = null;
                this.z = hVar5;
                this.A = hVar5;
                boolean[] zArr = new boolean[this.a.length];
                long a2 = hVar5.a(this.k.c, z2, zArr);
                if (a2 != this.k.c) {
                    this.k.c = a2;
                    a(a2);
                }
                boolean[] zArr2 = new boolean[this.a.length];
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    a[] aVarArr = this.a;
                    if (i2 >= aVarArr.length) {
                        break;
                    }
                    a aVar = aVarArr[i2];
                    boolean z3 = aVar.c != 0;
                    zArr2[i2] = z3;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = this.B.c[i2];
                    if (vVar != null) {
                        i3++;
                    }
                    if (z3) {
                        if (vVar != aVar.d) {
                            if (aVar == this.m) {
                                if (vVar == null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar6 = this.n;
                                    uVar.getClass();
                                    uVar.a(hVar6.b());
                                    uVar.d = hVar6.a();
                                }
                                this.n = null;
                                this.m = null;
                            }
                            a(aVar);
                            aVar.c();
                        } else if (zArr[i2]) {
                            long j = this.y;
                            aVar.g = false;
                            aVar.f = false;
                            aVar.a(false, j);
                        }
                    }
                    i2++;
                }
                this.h.obtainMessage(3, hVar.m).sendToTarget();
                a(zArr2, i3);
            } else {
                this.z = hVar;
                for (h hVar7 = hVar.k; hVar7 != null; hVar7 = hVar7.k) {
                    hVar7.a();
                }
                h hVar8 = this.z;
                hVar8.k = null;
                if (hVar8.i) {
                    long j2 = hVar8.g;
                    long max = Math.max(j2, Math.abs(this.y - (hVar8.e - j2)));
                    h hVar9 = this.z;
                    hVar9.a(max, false, new boolean[hVar9.n.length]);
                }
            }
            b();
            h();
            this.f.sendEmptyMessage(2);
            return;
        }
    }

    public final void g() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
        if (uVar.a) {
            uVar.a(uVar.b());
            uVar.a = false;
        }
        for (a aVar : this.p) {
            a(aVar);
        }
    }

    public final void h() {
        h hVar = this.B;
        if (hVar == null) {
            return;
        }
        long g = hVar.a.g();
        if (g != -9223372036854775807L) {
            a(g);
        } else {
            a aVar = this.m;
            if (aVar == null || aVar.e()) {
                this.y = this.e.b();
            } else {
                long b = this.n.b();
                this.y = b;
                this.e.a(b);
            }
            h hVar2 = this.B;
            g = Math.abs(this.y - (hVar2.e - hVar2.g));
        }
        this.k.c = g;
        this.v = SystemClock.elapsedRealtime() * 1000;
        long c = this.p.length == 0 ? Long.MIN_VALUE : this.B.a.c();
        i iVar = this.k;
        if (c == Long.MIN_VALUE) {
            long j = this.C.a(this.B.f, this.j, false).d;
        }
        iVar.getClass();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.u) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    c(message.arg1 != 0);
                    return true;
                case 2:
                    a();
                    return true;
                case 3:
                    b((j) message.obj);
                    return true;
                case 4:
                    a((s) message.obj);
                    return true;
                case 5:
                    a(true);
                    this.d.a(true);
                    a(1);
                    return true;
                case 6:
                    e();
                    return true;
                case 7:
                    a((Pair) message.obj);
                    return true;
                case 8:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj);
                    return true;
                case 9:
                    com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj;
                    h hVar = this.z;
                    if (hVar != null && hVar.a == sVar) {
                        b();
                    }
                    return true;
                case 10:
                    f();
                    return true;
                case 11:
                    a((e[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (d e) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", e);
            this.h.obtainMessage(8, e).sendToTarget();
            a(true);
            this.d.a(true);
            a(1);
            return true;
        } catch (IOException e2) {
            Log.e("ExoPlayerImplInternal", "Source error.", e2);
            this.h.obtainMessage(8, new d(e2)).sendToTarget();
            a(true);
            this.d.a(true);
            a(1);
            return true;
        } catch (RuntimeException e3) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e3);
            this.h.obtainMessage(8, new d(e3)).sendToTarget();
            a(true);
            this.d.a(true);
            a(1);
            return true;
        }
    }

    public final void b(j jVar) {
        if (this.C == null) {
            this.w++;
            this.x = jVar;
            return;
        }
        Pair a = a(jVar);
        if (a == null) {
            i iVar = new i(0, 0L);
            this.k = iVar;
            this.h.obtainMessage(4, 1, 0, iVar).sendToTarget();
            this.k = new i(0, -9223372036854775807L);
            a(4);
            a(false);
            return;
        }
        int i = jVar.c == -9223372036854775807L ? 1 : 0;
        int intValue = ((Integer) a.first).intValue();
        long longValue = ((Long) a.second).longValue();
        try {
            i iVar2 = this.k;
            if (intValue == iVar2.a && longValue / 1000 == iVar2.c / 1000) {
                return;
            }
            long a2 = a(intValue, longValue);
            int i2 = i | (longValue == a2 ? 0 : 1);
            i iVar3 = new i(intValue, a2);
            this.k = iVar3;
            this.h.obtainMessage(4, i2, 0, iVar3).sendToTarget();
        } finally {
            i iVar4 = new i(intValue, longValue);
            this.k = iVar4;
            this.h.obtainMessage(4, i, 0, iVar4).sendToTarget();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        this.f.obtainMessage(7, Pair.create(xVar, gVar)).sendToTarget();
    }

    public final void a(int i) {
        if (this.u != i) {
            this.u = i;
            this.h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, boolean z) {
        this.h.sendEmptyMessage(0);
        a(true);
        this.d.a(false);
        if (z) {
            this.k = new i(0, -9223372036854775807L);
        }
        this.o = uVar;
        uVar.a(this);
        a(2);
        this.f.sendEmptyMessage(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x03a5, code lost:
    
        if (r5 < r1) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03c5, code lost:
    
        if (r1.i == false) goto L201;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0180 A[LOOP:3: B:158:0x0180->B:162:0x0190, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03ce  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        h hVar;
        int i;
        boolean z;
        boolean z2;
        h hVar2;
        h hVar3;
        long j;
        int i2;
        h hVar4;
        int i3;
        int i4;
        long c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.C == null) {
            this.o.a();
        } else {
            h hVar5 = this.z;
            if (hVar5 == null) {
                i = this.k.a;
            } else {
                int i5 = hVar5.f;
                if (!hVar5.h && hVar5.i && ((!hVar5.j || hVar5.a.c() == Long.MIN_VALUE) && this.C.a(i5, this.j, false).d != -9223372036854775807L && ((hVar = this.B) == null || i5 - hVar.f != 100))) {
                    i = this.z.f + 1;
                }
                z2 = false;
                z = true;
                hVar2 = this.z;
                if (hVar2 == null && (!hVar2.i || (hVar2.j && hVar2.a.c() != Long.MIN_VALUE))) {
                    h hVar6 = this.z;
                    if (hVar6 != null && hVar6.l) {
                        b();
                    }
                } else {
                    b(z2);
                }
                if (this.B != null) {
                    while (true) {
                        h hVar7 = this.B;
                        hVar3 = this.A;
                        if (hVar7 == hVar3 || this.y < hVar7.k.e) {
                            break;
                        }
                        hVar7.a();
                        a(this.B.k);
                        h hVar8 = this.B;
                        this.k = new i(hVar8.f, hVar8.g);
                        h();
                        this.h.obtainMessage(5, this.k).sendToTarget();
                    }
                    if (hVar3.h) {
                        int i6 = z2 ? 1 : 0;
                        while (true) {
                            a[] aVarArr = this.a;
                            if (i6 >= aVarArr.length) {
                                break;
                            }
                            a aVar = aVarArr[i6];
                            com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = this.A.c[i6];
                            if (vVar != null && aVar.d == vVar && aVar.f) {
                                aVar.g = z;
                            }
                            i6++;
                        }
                    } else {
                        int i7 = z2 ? 1 : 0;
                        while (true) {
                            a[] aVarArr2 = this.a;
                            if (i7 < aVarArr2.length) {
                                a aVar2 = aVarArr2[i7];
                                com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar2 = this.A.c[i7];
                                if (aVar2.d != vVar2 || (vVar2 != null && !aVar2.f)) {
                                    break;
                                } else {
                                    i7++;
                                }
                            } else {
                                h hVar9 = this.A;
                                h hVar10 = hVar9.k;
                                if (hVar10 != null && hVar10.i) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar9.m;
                                    this.A = hVar10;
                                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar2 = hVar10.m;
                                    boolean z3 = hVar10.a.g() != -9223372036854775807L ? z ? 1 : 0 : z2 ? 1 : 0;
                                    int i8 = z2 ? 1 : 0;
                                    while (true) {
                                        a[] aVarArr3 = this.a;
                                        if (i8 >= aVarArr3.length) {
                                            break;
                                        }
                                        a aVar3 = aVarArr3[i8];
                                        if (jVar.b.b[i8] != null) {
                                            if (z3) {
                                                aVar3.g = z;
                                            } else if (aVar3.g) {
                                                continue;
                                            } else {
                                                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = jVar2.b.b[i8];
                                                t tVar = jVar.d[i8];
                                                t tVar2 = jVar2.d[i8];
                                                if (bVar != null && tVar2.equals(tVar)) {
                                                    int length = bVar.c.length;
                                                    o[] oVarArr = new o[length];
                                                    for (?? r15 = z2; r15 < length; r15++) {
                                                        oVarArr[r15] = bVar.d[r15];
                                                    }
                                                    h hVar11 = this.A;
                                                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar3 = hVar11.c[i8];
                                                    long j2 = hVar11.e - hVar11.g;
                                                    if (!aVar3.g) {
                                                        aVar3.d = vVar3;
                                                        aVar3.f = false;
                                                        aVar3.e = j2;
                                                        aVar3.a(oVarArr);
                                                    } else {
                                                        throw new IllegalStateException();
                                                    }
                                                } else {
                                                    aVar3.g = z;
                                                }
                                            }
                                        }
                                        i8++;
                                        z2 = false;
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i >= this.C.a()) {
                this.o.a();
                z2 = false;
                z = true;
                hVar2 = this.z;
                if (hVar2 == null) {
                }
                b(z2);
                if (this.B != null) {
                }
            } else {
                if (this.z == null) {
                    j = this.k.c;
                    z2 = false;
                    z = true;
                } else {
                    int i9 = this.C.a(i, this.j, false).c;
                    if (i != this.C.a(i9, this.i, 0L).c) {
                        z2 = false;
                        z = true;
                        j = 0;
                    } else {
                        h hVar12 = this.z;
                        z2 = false;
                        z = true;
                        Pair a = a(this.C, i9, -9223372036854775807L, Math.max(0L, ((hVar12.e - hVar12.g) + this.C.a(hVar12.f, this.j, false).d) - this.y));
                        if (a != null) {
                            int intValue = ((Integer) a.first).intValue();
                            long longValue = ((Long) a.second).longValue();
                            i = intValue;
                            j = longValue;
                        }
                        hVar2 = this.z;
                        if (hVar2 == null) {
                        }
                        b(z2);
                        if (this.B != null) {
                        }
                    }
                }
                h hVar13 = this.z;
                long j3 = hVar13 == null ? j + 60000000 : (hVar13.e - hVar13.g) + this.C.a(hVar13.f, this.j, z2).d;
                this.C.a(i, this.j, z);
                h hVar14 = new h(this.a, this.b, j3, this.c, this.d, this.o, this.j.b, i, (i != this.C.a() - (z ? 1 : 0) || this.C.a(this.j.c, this.i, 0L).b) ? z2 ? 1 : 0 : z ? 1 : 0, j);
                h hVar15 = this.z;
                if (hVar15 != null) {
                    hVar15.k = hVar14;
                }
                this.z = hVar14;
                hVar14.a.a(this);
                b(z);
                hVar2 = this.z;
                if (hVar2 == null) {
                }
                b(z2);
                if (this.B != null) {
                }
            }
        }
        if (this.B == null) {
            c();
            a(elapsedRealtime, 10L);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("doSomeWork");
        h();
        com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar = this.B.a;
        long j4 = this.k.c;
        sVar.getClass();
        boolean z4 = true;
        boolean z5 = true;
        for (a aVar4 : this.p) {
            aVar4.a(this.y, this.v);
            z5 = z5 && aVar4.e();
            boolean z6 = aVar4.f() || aVar4.e();
            if (!z6) {
                aVar4.d.a();
            }
            z4 = z4 && z6;
        }
        if (!z4) {
            c();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar16 = this.n;
        if (hVar16 != null) {
            s a2 = hVar16.a();
            if (!a2.equals(this.l)) {
                this.l = a2;
                com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
                com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar17 = this.n;
                uVar.getClass();
                uVar.a(hVar17.b());
                uVar.d = hVar17.a();
                this.h.obtainMessage(7, a2).sendToTarget();
            }
        }
        long j5 = this.C.a(this.B.f, this.j, false).d;
        if (z5 && ((j5 == -9223372036854775807L || j5 <= this.k.c) && this.B.h)) {
            a(4);
            g();
        } else {
            int i10 = this.u;
            if (i10 != 2) {
                i2 = 0;
                if (i10 == 3) {
                    if (!(this.p.length > 0 ? z4 : j5 == -9223372036854775807L || this.k.c < j5 || ((hVar4 = this.B.k) != null && hVar4.i))) {
                        this.s = this.r;
                        i3 = 2;
                        a(2);
                        g();
                        if (this.u == i3) {
                            a[] aVarArr4 = this.p;
                            int length2 = aVarArr4.length;
                            for (int i11 = i2; i11 < length2; i11++) {
                                aVarArr4[i11].d.a();
                            }
                        }
                        if ((!this.r && this.u == 3) || this.u == 2) {
                            a(elapsedRealtime, 10L);
                        } else if (this.p.length != 0) {
                            a(elapsedRealtime, 1000L);
                        } else {
                            this.f.removeMessages(2);
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                    }
                }
            } else if (this.p.length <= 0) {
                if (j5 != -9223372036854775807L) {
                    if (this.k.c >= j5) {
                        h hVar18 = this.B.k;
                        if (hVar18 != null) {
                        }
                        i2 = 0;
                    }
                }
                a(3);
                if (this.r) {
                }
                i2 = 0;
            } else if (z4) {
                boolean z7 = this.s;
                h hVar19 = this.z;
                if (!hVar19.i) {
                    c = hVar19.g;
                } else {
                    c = hVar19.a.c();
                }
                if (c == Long.MIN_VALUE) {
                    h hVar20 = this.z;
                    if (!hVar20.h) {
                        c = this.C.a(hVar20.f, this.j, false).d;
                    }
                    a(3);
                    if (this.r) {
                        i2 = 0;
                        this.s = false;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar2 = this.e;
                        if (uVar2.a) {
                            i4 = 1;
                        } else {
                            uVar2.c = SystemClock.elapsedRealtime();
                            i4 = 1;
                            uVar2.a = true;
                        }
                        for (a aVar5 : this.p) {
                            if (aVar5.c == i4) {
                                aVar5.c = 2;
                                aVar5.i();
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    i2 = 0;
                }
                c cVar = this.d;
                h hVar21 = this.z;
                long abs = c - Math.abs(this.y - (hVar21.e - hVar21.g));
                long j6 = z7 ? cVar.e : cVar.d;
                if (j6 > 0) {
                }
                a(3);
                if (this.r) {
                }
                i2 = 0;
            }
            i3 = 2;
            if (this.u == i3) {
            }
            if (!this.r) {
            }
            if (this.p.length != 0) {
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
        }
        i3 = 2;
        i2 = 0;
        if (this.u == i3) {
        }
        if (!this.r) {
        }
        if (this.p.length != 0) {
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
    }

    public final void c() {
        h hVar = this.z;
        if (hVar == null || hVar.i) {
            return;
        }
        h hVar2 = this.A;
        if (hVar2 == null || hVar2.k == hVar) {
            for (a aVar : this.p) {
                if (!aVar.f) {
                    return;
                }
            }
            this.z.a.d();
        }
    }

    public final void b() {
        int i;
        h hVar = this.z;
        long f = !hVar.i ? 0L : hVar.a.f();
        if (f == Long.MIN_VALUE) {
            b(false);
            return;
        }
        h hVar2 = this.z;
        long abs = Math.abs(this.y - (hVar2.e - hVar2.g));
        long j = f - abs;
        c cVar = this.d;
        char c = j > cVar.c ? (char) 0 : j < cVar.b ? (char) 2 : (char) 1;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = cVar.a;
        synchronized (lVar) {
            i = lVar.c * 65536;
        }
        boolean z = c == 2 || (c == 1 && cVar.g && !(i >= cVar.f));
        cVar.g = z;
        b(z);
        if (z) {
            h hVar3 = this.z;
            hVar3.l = false;
            hVar3.a.b(abs);
            return;
        }
        this.z.l = true;
    }

    public final void a(long j, long j2) {
        this.f.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f.sendEmptyMessage(2);
        } else {
            this.f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    public final long a(int i, long j) {
        h hVar;
        g();
        this.s = false;
        a(2);
        h hVar2 = this.B;
        if (hVar2 == null) {
            h hVar3 = this.z;
            if (hVar3 != null) {
                hVar3.a();
            }
            hVar = null;
        } else {
            hVar = null;
            while (hVar2 != null) {
                if (hVar2.f == i && hVar2.i) {
                    hVar = hVar2;
                } else {
                    hVar2.a();
                }
                hVar2 = hVar2.k;
            }
        }
        h hVar4 = this.B;
        if (hVar4 != hVar || hVar4 != this.A) {
            for (a aVar : this.p) {
                aVar.c();
            }
            this.p = new a[0];
            this.n = null;
            this.m = null;
            this.B = null;
        }
        if (hVar != null) {
            hVar.k = null;
            this.z = hVar;
            this.A = hVar;
            a(hVar);
            h hVar5 = this.B;
            if (hVar5.j) {
                j = hVar5.a.a(j);
            }
            a(j);
            b();
        } else {
            this.z = null;
            this.A = null;
            this.B = null;
            a(j);
        }
        this.f.sendEmptyMessage(2);
        return j;
    }

    public final void a(long j) {
        h hVar = this.B;
        long j2 = hVar == null ? j + 60000000 : j + (hVar.e - hVar.g);
        this.y = j2;
        this.e.a(j2);
        for (a aVar : this.p) {
            long j3 = this.y;
            aVar.g = false;
            aVar.f = false;
            aVar.a(false, j3);
        }
    }

    public final void a(s sVar) {
        s a;
        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar = this.n;
        if (hVar != null) {
            a = hVar.a(sVar);
        } else {
            a = this.e.a(sVar);
        }
        this.l = a;
        this.h.obtainMessage(7, a).sendToTarget();
    }

    public final void a(boolean z) {
        this.f.removeMessages(2);
        this.s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
        if (uVar.a) {
            uVar.a(uVar.b());
            uVar.a = false;
        }
        this.n = null;
        this.m = null;
        this.y = 60000000L;
        for (a aVar : this.p) {
            try {
                a(aVar);
                aVar.c();
            } catch (d | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.p = new a[0];
        h hVar = this.B;
        if (hVar == null) {
            hVar = this.z;
        }
        while (hVar != null) {
            hVar.a();
            hVar = hVar.k;
        }
        this.z = null;
        this.A = null;
        this.B = null;
        b(false);
        if (z) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar2 = this.o;
            if (uVar2 != null) {
                uVar2.b();
                this.o = null;
            }
            this.C = null;
        }
    }

    public final void a(e[] eVarArr) {
        try {
            for (e eVar : eVarArr) {
                eVar.a.a(eVar.b, eVar.c);
            }
            if (this.o != null) {
                this.f.sendEmptyMessage(2);
            }
            synchronized (this) {
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                notifyAll();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d5  */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Pair pair) {
        int i;
        boolean z;
        int i2;
        ?? r12;
        h hVar;
        h hVar2;
        x xVar = this.C;
        x xVar2 = (x) pair.first;
        this.C = xVar2;
        Object obj = pair.second;
        if (xVar == null) {
            if (this.w > 0) {
                Pair a = a(this.x);
                int i3 = this.w;
                this.w = 0;
                this.x = null;
                if (a == null) {
                    i iVar = new i(0, 0L);
                    this.k = iVar;
                    this.h.obtainMessage(6, new k(this.C, obj, iVar, i3)).sendToTarget();
                    this.k = new i(0, -9223372036854775807L);
                    a(4);
                    a(false);
                    return;
                }
                this.k = new i(((Integer) a.first).intValue(), ((Long) a.second).longValue());
                i2 = i3;
                i = 6;
                r12 = 0;
                hVar = this.B;
                if (hVar == null) {
                    hVar = this.z;
                }
                hVar2 = hVar;
                if (hVar2 == null) {
                    this.h.obtainMessage(i, new k(this.C, obj, this.k, i2)).sendToTarget();
                    return;
                }
                int a2 = this.C.a(hVar2.b);
                if (a2 == -1) {
                    int i4 = hVar2.f;
                    x xVar3 = this.C;
                    int i5 = -1;
                    while (i5 == -1 && i4 < xVar.a() - 1) {
                        i4++;
                        i5 = xVar3.a(xVar.a(i4, this.j, true).b);
                    }
                    if (i5 == -1) {
                        i iVar2 = new i(r12, 0L);
                        this.k = iVar2;
                        this.h.obtainMessage(i, new k(this.C, obj, iVar2, i2)).sendToTarget();
                        this.k = new i(r12, -9223372036854775807L);
                        a(4);
                        a((boolean) r12);
                        return;
                    }
                    int i6 = this.C.a(i5, this.j, (boolean) r12).c;
                    Pair a3 = a(this.C, 0, -9223372036854775807L, 0L);
                    int intValue = ((Integer) a3.first).intValue();
                    long longValue = ((Long) a3.second).longValue();
                    this.C.a(intValue, this.j, true);
                    Object obj2 = this.j.b;
                    hVar2.f = -1;
                    while (true) {
                        hVar2 = hVar2.k;
                        if (hVar2 != null) {
                            hVar2.f = hVar2.b.equals(obj2) ? intValue : -1;
                        } else {
                            i iVar3 = new i(intValue, a(intValue, longValue));
                            this.k = iVar3;
                            this.h.obtainMessage(i, new k(this.C, obj, iVar3, i2)).sendToTarget();
                            return;
                        }
                    }
                } else {
                    this.C.a(a2, this.j, (boolean) r12);
                    boolean z2 = (a2 != this.C.a() - 1 || this.C.a(this.j.c, this.i, 0L).b) ? r12 : true;
                    hVar2.f = a2;
                    hVar2.h = z2;
                    boolean z3 = hVar2 == this.A ? true : r12;
                    i iVar4 = this.k;
                    if (a2 != iVar4.a) {
                        i iVar5 = new i(a2, iVar4.b);
                        iVar5.c = iVar4.c;
                        this.k = iVar5;
                    }
                    while (true) {
                        h hVar3 = hVar2.k;
                        if (hVar3 == null) {
                            break;
                        }
                        a2++;
                        this.C.a(a2, this.j, true);
                        boolean z4 = (a2 != this.C.a() - 1 || this.C.a(this.j.c, this.i, 0L).b) ? r12 : true;
                        if (hVar3.b.equals(this.j.b)) {
                            hVar3.f = a2;
                            hVar3.h = z4;
                            z3 |= hVar3 == this.A ? true : r12;
                            hVar2 = hVar3;
                        } else if (!z3) {
                            int i7 = this.B.f;
                            this.k = new i(i7, a(i7, this.k.c));
                        } else {
                            this.z = hVar2;
                            hVar2.k = null;
                            while (hVar3 != null) {
                                hVar3.a();
                                hVar3 = hVar3.k;
                            }
                        }
                    }
                    this.h.obtainMessage(i, new k(this.C, obj, this.k, i2)).sendToTarget();
                    return;
                }
            } else if (this.k.b == -9223372036854775807L) {
                if (xVar2.c()) {
                    i iVar6 = new i(0, 0L);
                    this.k = iVar6;
                    this.h.obtainMessage(6, new k(this.C, obj, iVar6, 0)).sendToTarget();
                    this.k = new i(0, -9223372036854775807L);
                    a(4);
                    a(false);
                    return;
                }
                i = 6;
                z = false;
                Pair a4 = a(this.C, 0, -9223372036854775807L, 0L);
                this.k = new i(((Integer) a4.first).intValue(), ((Long) a4.second).longValue());
                i2 = z ? 1 : 0;
                r12 = z;
                hVar = this.B;
                if (hVar == null) {
                }
                hVar2 = hVar;
                if (hVar2 == null) {
                }
            }
        }
        i = 6;
        z = false;
        i2 = z ? 1 : 0;
        r12 = z;
        hVar = this.B;
        if (hVar == null) {
        }
        hVar2 = hVar;
        if (hVar2 == null) {
        }
    }

    public final Pair a(j jVar) {
        x xVar = jVar.a;
        if (xVar.c()) {
            xVar = this.C;
        }
        try {
            Pair a = a(xVar, jVar.b, jVar.c, 0L);
            x xVar2 = this.C;
            if (xVar2 == xVar) {
                return a;
            }
            int a2 = xVar2.a(xVar.a(((Integer) a.first).intValue(), this.j, true).b);
            if (a2 != -1) {
                return Pair.create(Integer.valueOf(a2), (Long) a.second);
            }
            int intValue = ((Integer) a.first).intValue();
            x xVar3 = this.C;
            int i = -1;
            while (i == -1 && intValue < xVar.a() - 1) {
                intValue++;
                i = xVar3.a(xVar.a(intValue, this.j, true).b);
            }
            if (i == -1) {
                return null;
            }
            int i2 = this.C.a(i, this.j, false).c;
            return a(this.C, 0, -9223372036854775807L, 0L);
        } catch (IndexOutOfBoundsException unused) {
            throw new q();
        }
    }

    public final Pair a(x xVar, int i, long j, long j2) {
        int b = xVar.b();
        if (i >= 0 && i < b) {
            xVar.a(i, this.i, j2);
            if (j == -9223372036854775807L) {
                j = this.i.e;
                if (j == -9223372036854775807L) {
                    return null;
                }
            }
            w wVar = this.i;
            int i2 = wVar.c;
            long j3 = wVar.g + j;
            long j4 = xVar.a(i2, this.j, false).d;
            while (j4 != -9223372036854775807L && j3 >= j4 && i2 < this.i.d) {
                j3 -= j4;
                i2++;
                j4 = xVar.a(i2, this.j, false).d;
            }
            return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar2;
        h hVar = this.z;
        if (hVar == null || (sVar2 = hVar.a) != sVar) {
            return;
        }
        hVar.i = true;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j a = hVar.p.a(hVar.o, sVar2.a());
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.s;
        if (jVar != null) {
            for (int i = 0; i < a.b.a; i++) {
                if (a.a(jVar, i)) {
                }
            }
            hVar.g = hVar.a(hVar.g, false, new boolean[hVar.n.length]);
            if (this.B == null) {
                h hVar2 = this.z;
                this.A = hVar2;
                a(hVar2.g);
                a(this.A);
            }
            b();
        }
        hVar.m = a;
        hVar.g = hVar.a(hVar.g, false, new boolean[hVar.n.length]);
        if (this.B == null) {
        }
        b();
    }

    public final void a(h hVar) {
        if (this.B == hVar) {
            return;
        }
        boolean[] zArr = new boolean[this.a.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.a;
            if (i < aVarArr.length) {
                a aVar = aVarArr[i];
                boolean z = aVar.c != 0;
                zArr[i] = z;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.m.b.b[i];
                if (bVar != null) {
                    i2++;
                }
                if (z && (bVar == null || (aVar.g && aVar.d == this.B.c[i]))) {
                    if (aVar == this.m) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar2 = this.n;
                        uVar.getClass();
                        uVar.a(hVar2.b());
                        uVar.d = hVar2.a();
                        this.n = null;
                        this.m = null;
                    }
                    a(aVar);
                    aVar.c();
                }
                i++;
            } else {
                this.B = hVar;
                this.h.obtainMessage(3, hVar.m).sendToTarget();
                a(zArr, i2);
                return;
            }
        }
    }

    public final void a(boolean[] zArr, int i) {
        int i2;
        this.p = new a[i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            a[] aVarArr = this.a;
            if (i3 >= aVarArr.length) {
                return;
            }
            a aVar = aVarArr[i3];
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = this.B.m;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = jVar.b.b[i3];
            if (bVar != null) {
                int i5 = i4 + 1;
                this.p[i4] = aVar;
                if (aVar.c == 0) {
                    t tVar = jVar.d[i3];
                    boolean z = this.r && this.u == 3;
                    boolean z2 = !zArr[i3] && z;
                    int length = bVar.c.length;
                    o[] oVarArr = new o[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        oVarArr[i6] = bVar.d[i6];
                    }
                    h hVar = this.B;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = hVar.c[i3];
                    long j = this.y;
                    i2 = i3;
                    long j2 = hVar.e - hVar.g;
                    if (aVar.c == 0) {
                        aVar.b = tVar;
                        aVar.c = 1;
                        aVar.h();
                        if (!aVar.g) {
                            aVar.d = vVar;
                            aVar.f = false;
                            aVar.e = j2;
                            aVar.a(oVarArr);
                            aVar.a(z2, j);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.h d = aVar.d();
                            if (d != null) {
                                if (this.n == null) {
                                    this.n = d;
                                    this.m = aVar;
                                    ((MediaCodecAudioRenderer) d).Q.a(this.l);
                                } else {
                                    throw new d(new IllegalStateException("Multiple renderer media clocks enabled."));
                                }
                            }
                            if (z) {
                                if (aVar.c == 1) {
                                    aVar.c = 2;
                                    aVar.i();
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }
}
