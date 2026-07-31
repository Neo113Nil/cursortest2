package yads;

import android.util.Pair;
import android.util.SparseArray;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class pw0 implements tp0 {
    public static final byte[] G;
    public static final jw0 H;
    public int A;
    public boolean B;
    public wp0 C;
    public c83[] D;
    public c83[] E;
    public boolean F;
    public final int a;
    public final List b;
    public final SparseArray c;
    public final xb2 d;
    public final xb2 e;
    public final xb2 f;
    public final byte[] g;
    public final xb2 h;
    public final an0 i;
    public final xb2 j;
    public final ArrayDeque k;
    public final ArrayDeque l;
    public final c83 m;
    public int n;
    public int o;
    public long p;
    public int q;
    public xb2 r;
    public long s;
    public int t;
    public long u;
    public long v;
    public long w;
    public ow0 x;
    public int y;
    public int z;

    static {
        new yp0() { // from class: yads.pw0$$ExternalSyntheticLambda1
            @Override // yads.yp0
            public final tp0[] a() {
                return pw0.a();
            }
        };
        G = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        iw0 iw0Var = new iw0();
        iw0Var.k = "application/x-emsg";
        H = new jw0(iw0Var);
    }

    public pw0() {
        this(0, Collections.emptyList(), null);
    }

    public static tp0[] a() {
        return new tp0[]{new pw0()};
    }

    public final u73 a(u73 u73Var) {
        return u73Var;
    }

    @Override // yads.tp0
    public final void release() {
    }

    public pw0(int i, List list, c83 c83Var) {
        this.a = i;
        this.b = Collections.unmodifiableList(list);
        this.m = c83Var;
        this.i = new an0();
        this.j = new xb2(16);
        this.d = new xb2(py1.a);
        this.e = new xb2(5);
        this.f = new xb2();
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new xb2(bArr);
        this.k = new ArrayDeque();
        this.l = new ArrayDeque();
        this.c = new SparseArray();
        this.v = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.C = wp0.a;
        this.D = new c83[0];
        this.E = new c83[0];
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        return e23.a(up0Var, true, false);
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        int i;
        this.C = wp0Var;
        int i2 = 0;
        this.n = 0;
        this.q = 0;
        c83[] c83VarArr = new c83[2];
        this.D = c83VarArr;
        c83 c83Var = this.m;
        if (c83Var != null) {
            c83VarArr[0] = c83Var;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.a & 4) != 0) {
            c83VarArr[i] = wp0Var.a(100, 5);
            i3 = 101;
            i++;
        }
        c83[] c83VarArr2 = (c83[]) sb3.a(i, this.D);
        this.D = c83VarArr2;
        for (c83 c83Var2 : c83VarArr2) {
            c83Var2.a(H);
        }
        this.E = new c83[this.b.size()];
        while (i2 < this.E.length) {
            c83 a = this.C.a(i3, 3);
            a.a((jw0) this.b.get(i2));
            this.E[i2] = a;
            i2++;
            i3++;
        }
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((ow0) this.c.valueAt(i)).b();
        }
        this.l.clear();
        this.t = 0;
        this.u = j2;
        this.k.clear();
        this.n = 0;
        this.q = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:311:0x00af, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00b3, code lost:
    
        if (r34.n != 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00b7, code lost:
    
        if (r2.l != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00b9, code lost:
    
        r3 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x00ca, code lost:
    
        r34.y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00d0, code lost:
    
        if (r2.f >= r2.i) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00d2, code lost:
    
        ((yads.pd0) r35).a(r3);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00db, code lost:
    
        if (r1 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00de, code lost:
    
        r3 = r2.b.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00e4, code lost:
    
        if (r1 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00e6, code lost:
    
        r3.e(r3.b + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00ec, code lost:
    
        r1 = r2.b;
        r5 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00f2, code lost:
    
        if (r1.k == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00f8, code lost:
    
        if (r1.l[r5] == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00fa, code lost:
    
        r3.e(r3.b + (r3.p() * 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0105, code lost:
    
        r2.f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x010c, code lost:
    
        if (r2.l != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x010f, code lost:
    
        r1 = r2.g + 1;
        r2.g = r1;
        r3 = r2.b.g;
        r4 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x011c, code lost:
    
        if (r1 != r3[r4]) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x011e, code lost:
    
        r2.h = r4 + 1;
        r2.g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0125, code lost:
    
        r34.n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0123, code lost:
    
        r34.x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0131, code lost:
    
        if (r2.d.a.g != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0133, code lost:
    
        r34.y = r3 - 8;
        ((yads.pd0) r35).a(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x014c, code lost:
    
        if ("audio/ac4".equals(r2.d.a.f.m) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x014e, code lost:
    
        r34.z = r2.a(r34.y, 7);
        yads.i0.a(r34.y, r34.h);
        r2.a.a(7, r34.h);
        r34.z += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0173, code lost:
    
        r34.y += r34.z;
        r34.n = 4;
        r34.A = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x016b, code lost:
    
        r34.z = r2.a(r34.y, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x00c2, code lost:
    
        r3 = r2.b.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x017f, code lost:
    
        r3 = r2.d;
        r5 = r3.a;
        r6 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0187, code lost:
    
        if (r2.l != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0189, code lost:
    
        r10 = r3.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0198, code lost:
    
        r3 = r5.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x019a, code lost:
    
        if (r3 == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x019c, code lost:
    
        r12 = r34.e.a;
        r12[0] = 0;
        r12[1] = 0;
        r12[2] = 0;
        r13 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x01b0, code lost:
    
        if (r34.z >= r34.y) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x01b2, code lost:
    
        r14 = r34.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x01b6, code lost:
    
        if (r14 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x01b8, code lost:
    
        ((yads.pd0) r35).a(r12, r3, r13, r9);
        r34.e.e(r9);
        r14 = r34.e.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x01c9, code lost:
    
        if (r14 < 1) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x01cb, code lost:
    
        r34.A = r14 - 1;
        r34.d.e(r9);
        r6.a(4, r34.d);
        r6.a(1, r34.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x01e2, code lost:
    
        if (r34.E.length <= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x01e4, code lost:
    
        r14 = r5.f.m;
        r17 = r12[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x01f0, code lost:
    
        if ("video/avc".equals(r14) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x01f4, code lost:
    
        if ((r17 & 31) == r4) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0203, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0206, code lost:
    
        r34.B = r9;
        r34.z += 5;
        r34.y += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0213, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x01fa, code lost:
    
        if ("video/hevc".equals(r14) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0201, code lost:
    
        if (((r17 & 126) >> 1) != 39) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0205, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x021c, code lost:
    
        throw new yads.cc2("Invalid NAL length", r7, true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x021f, code lost:
    
        if (r34.B == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0221, code lost:
    
        r34.f.c(r14);
        ((yads.pd0) r35).a(r34.f.a, 0, r34.A, false);
        r6.a(r34.A, r34.f);
        r4 = r34.A;
        r7 = r34.f;
        r7 = yads.py1.a(r7.a, r7.c);
        r34.f.e("video/hevc".equals(r5.f.m) ? 1 : 0);
        r34.f.d(r7);
        yads.qt.a(r10, r34.f, r34.E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0266, code lost:
    
        r34.z += r4;
        r34.A -= r4;
        r4 = 6;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0260, code lost:
    
        r4 = r6.a(r35, r14, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0287, code lost:
    
        if (r2.l != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0289, code lost:
    
        r1 = r2.d.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x02a3, code lost:
    
        if (r2.a() == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x02a5, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x02a8, code lost:
    
        r22 = r1;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x02ae, code lost:
    
        if (r1 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x02b0, code lost:
    
        r25 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x02b7, code lost:
    
        r6.a(r10, r22, r34.y, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x02ca, code lost:
    
        if (r34.l.isEmpty() != false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x02cc, code lost:
    
        r1 = (yads.nw0) r34.l.removeFirst();
        r34.t -= r1.c;
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x02df, code lost:
    
        if (r1.b == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x02e1, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x02e2, code lost:
    
        r5 = r34.D;
        r6 = r5.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x02e6, code lost:
    
        if (r7 >= r6) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x02e8, code lost:
    
        r5[r7].a(r3, 1, r1.c, r34.t, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x02fe, code lost:
    
        r2.f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0305, code lost:
    
        if (r2.l != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0307, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0320, code lost:
    
        r34.x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0326, code lost:
    
        r34.n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0328, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x030a, code lost:
    
        r1 = r2.g + 1;
        r2.g = r1;
        r3 = r2.b.g;
        r4 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0317, code lost:
    
        if (r1 != r3[r4]) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0319, code lost:
    
        r2.h = r4 + 1;
        r1 = 0;
        r2.g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0324, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x02b5, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x029a, code lost:
    
        if (r2.b.j[r2.f] == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x029c, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x029e, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0273, code lost:
    
        r3 = r34.z;
        r4 = r34.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0277, code lost:
    
        if (r3 >= r4) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0279, code lost:
    
        r34.z += r6.a(r35, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0190, code lost:
    
        r10 = r2.b.i[r2.f];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    @Override // yads.tp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(up0 up0Var, dg2 dg2Var) {
        long j;
        long j2;
        String str;
        long a;
        long l;
        String str2;
        long j3;
        long j4;
        long o;
        long o2;
        while (true) {
            int i = this.n;
            Exception exc = null;
            ?? r9 = 0;
            if (i == 0) {
                if (this.q == 0) {
                    if (!((pd0) up0Var).a(this.j.a, 0, 8, true)) {
                        return -1;
                    }
                    this.q = 8;
                    this.j.e(0);
                    this.p = this.j.l();
                    this.o = this.j.a();
                }
                long j5 = this.p;
                if (j5 == 1) {
                    ((pd0) up0Var).a(this.j.a, 8, 8, false);
                    this.q += 8;
                    this.p = this.j.o();
                } else if (j5 == 0) {
                    pd0 pd0Var = (pd0) up0Var;
                    long j6 = pd0Var.c;
                    if (j6 == -1 && !this.k.isEmpty()) {
                        j6 = ((wi) this.k.peek()).b;
                    }
                    if (j6 != -1) {
                        this.p = (j6 - pd0Var.d) + this.q;
                    }
                }
                long j7 = this.p;
                long j8 = this.q;
                if (j7 >= j8) {
                    pd0 pd0Var2 = (pd0) up0Var;
                    long j9 = pd0Var2.d - j8;
                    int i2 = this.o;
                    if ((i2 == 1836019558 || i2 == 1835295092) && !this.F) {
                        this.C.a(new lx2(this.v, j9));
                        this.F = true;
                    }
                    if (this.o == 1836019558) {
                        int size = this.c.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            w73 w73Var = ((ow0) this.c.valueAt(i3)).b;
                            w73Var.getClass();
                            w73Var.c = j9;
                            w73Var.b = j9;
                        }
                    }
                    int i4 = this.o;
                    if (i4 == 1835295092) {
                        this.x = null;
                        this.s = j9 + this.p;
                        this.n = 2;
                    } else if (i4 == 1836019574 || i4 == 1953653099 || i4 == 1835297121 || i4 == 1835626086 || i4 == 1937007212 || i4 == 1836019558 || i4 == 1953653094 || i4 == 1836475768 || i4 == 1701082227) {
                        long j10 = (pd0Var2.d + this.p) - 8;
                        this.k.push(new wi(i4, j10));
                        if (this.p == this.q) {
                            a(j10);
                        } else {
                            this.n = 0;
                            this.q = 0;
                        }
                    } else if (i4 == 1751411826 || i4 == 1835296868 || i4 == 1836476516 || i4 == 1936286840 || i4 == 1937011556 || i4 == 1937011827 || i4 == 1668576371 || i4 == 1937011555 || i4 == 1937011578 || i4 == 1937013298 || i4 == 1937007471 || i4 == 1668232756 || i4 == 1937011571 || i4 == 1952867444 || i4 == 1952868452 || i4 == 1953196132 || i4 == 1953654136 || i4 == 1953658222 || i4 == 1886614376 || i4 == 1935763834 || i4 == 1935763823 || i4 == 1936027235 || i4 == 1970628964 || i4 == 1935828848 || i4 == 1936158820 || i4 == 1701606260 || i4 == 1835362404 || i4 == 1701671783) {
                        if (this.q == 8) {
                            long j11 = this.p;
                            if (j11 <= 2147483647L) {
                                xb2 xb2Var = new xb2((int) j11);
                                System.arraycopy(this.j.a, 0, xb2Var.a, 0, 8);
                                this.r = xb2Var;
                                this.n = 1;
                            } else {
                                throw cc2.a("Leaf atom with length > 2147483647 (unsupported).");
                            }
                        } else {
                            throw cc2.a("Leaf atom defines extended atom size (unsupported).");
                        }
                    } else if (this.p <= 2147483647L) {
                        this.r = null;
                        this.n = 1;
                    } else {
                        throw cc2.a("Skipping atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw cc2.a("Atom size less than header length (unsupported).");
                }
            } else if (i != 1) {
                long j12 = Long.MAX_VALUE;
                if (i != 2) {
                    ow0 ow0Var = this.x;
                    if (ow0Var != null) {
                        break;
                    }
                    SparseArray sparseArray = this.c;
                    int size2 = sparseArray.size();
                    long j13 = Long.MAX_VALUE;
                    ow0 ow0Var2 = null;
                    for (int i5 = 0; i5 < size2; i5++) {
                        ow0 ow0Var3 = (ow0) sparseArray.valueAt(i5);
                        boolean z = ow0Var3.l;
                        if ((z || ow0Var3.f != ow0Var3.d.b) && (!z || ow0Var3.h != ow0Var3.b.d)) {
                            if (!z) {
                                j2 = ow0Var3.d.c[ow0Var3.f];
                            } else {
                                j2 = ow0Var3.b.f[ow0Var3.h];
                            }
                            if (j2 < j13) {
                                ow0Var2 = ow0Var3;
                                j13 = j2;
                            }
                        }
                    }
                    if (ow0Var2 == null) {
                        pd0 pd0Var3 = (pd0) up0Var;
                        int i6 = (int) (this.s - pd0Var3.d);
                        if (i6 >= 0) {
                            pd0Var3.a(i6);
                            this.n = 0;
                            this.q = 0;
                        } else {
                            throw new cc2("Offset to end of mdat was negative.", null, true, 1);
                        }
                    } else {
                        if (!ow0Var2.l) {
                            j = ow0Var2.d.c[ow0Var2.f];
                        } else {
                            j = ow0Var2.b.f[ow0Var2.h];
                        }
                        pd0 pd0Var4 = (pd0) up0Var;
                        int i7 = (int) (j - pd0Var4.d);
                        if (i7 < 0) {
                            gh1.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            i7 = 0;
                        }
                        pd0Var4.a(i7);
                        this.x = ow0Var2;
                        ow0Var = ow0Var2;
                    }
                } else {
                    int size3 = this.c.size();
                    ow0 ow0Var4 = null;
                    for (int i8 = 0; i8 < size3; i8++) {
                        w73 w73Var2 = ((ow0) this.c.valueAt(i8)).b;
                        if (w73Var2.o) {
                            long j14 = w73Var2.c;
                            if (j14 < j12) {
                                ow0Var4 = (ow0) this.c.valueAt(i8);
                                j12 = j14;
                            }
                        }
                    }
                    if (ow0Var4 == null) {
                        this.n = 3;
                    } else {
                        pd0 pd0Var5 = (pd0) up0Var;
                        int i9 = (int) (j12 - pd0Var5.d);
                        if (i9 >= 0) {
                            pd0Var5.a(i9);
                            w73 w73Var3 = ow0Var4.b;
                            xb2 xb2Var2 = w73Var3.n;
                            pd0Var5.a(xb2Var2.a, 0, xb2Var2.c, false);
                            w73Var3.n.e(0);
                            w73Var3.o = false;
                        } else {
                            throw new cc2("Offset to encryption data was negative.", null, true, 1);
                        }
                    }
                }
            } else {
                int i10 = ((int) this.p) - this.q;
                xb2 xb2Var3 = this.r;
                if (xb2Var3 != null) {
                    pd0 pd0Var6 = (pd0) up0Var;
                    pd0Var6.a(xb2Var3.a, 8, i10, false);
                    int i11 = this.o;
                    xi xiVar = new xi(i11, xb2Var3);
                    long j15 = pd0Var6.d;
                    if (!this.k.isEmpty()) {
                        ((wi) this.k.peek()).c.add(xiVar);
                    } else if (i11 == 1936286840) {
                        xb2Var3.e(8);
                        int a2 = (xb2Var3.a() >> 24) & 255;
                        xb2Var3.e(xb2Var3.b + 4);
                        long l2 = xb2Var3.l();
                        if (a2 == 0) {
                            o = xb2Var3.l();
                            o2 = xb2Var3.l();
                        } else {
                            o = xb2Var3.o();
                            o2 = xb2Var3.o();
                        }
                        long j16 = o2 + j15;
                        long a3 = sb3.a(o, 1000000L, l2);
                        xb2Var3.e(xb2Var3.b + 2);
                        int p = xb2Var3.p();
                        int[] iArr = new int[p];
                        long[] jArr = new long[p];
                        long[] jArr2 = new long[p];
                        long[] jArr3 = new long[p];
                        long j17 = j16;
                        long j18 = a3;
                        int i12 = 0;
                        while (i12 < p) {
                            int a4 = xb2Var3.a();
                            if ((a4 & Integer.MIN_VALUE) == 0) {
                                long l3 = xb2Var3.l();
                                iArr[i12] = a4 & Integer.MAX_VALUE;
                                jArr[i12] = j17;
                                jArr3[i12] = j18;
                                o += l3;
                                j18 = sb3.a(o, 1000000L, l2);
                                jArr2[i12] = j18 - jArr3[i12];
                                xb2Var3.e(xb2Var3.b + 4);
                                j17 += iArr[i12];
                                i12++;
                                p = p;
                                l2 = l2;
                            } else {
                                throw new cc2("Unhandled indirect reference", null, true, 1);
                            }
                        }
                        Pair create = Pair.create(Long.valueOf(a3), new eu(iArr, jArr, jArr2, jArr3));
                        this.w = ((Long) create.first).longValue();
                        this.C.a((mx2) create.second);
                        this.F = true;
                    } else if (i11 == 1701671783 && this.D.length != 0) {
                        xb2Var3.e(8);
                        int a5 = (xb2Var3.a() >> 24) & 255;
                        if (a5 == 0) {
                            String h = xb2Var3.h();
                            h.getClass();
                            String h2 = xb2Var3.h();
                            h2.getClass();
                            long l4 = xb2Var3.l();
                            long a6 = sb3.a(xb2Var3.l(), 1000000L, l4);
                            long j19 = this.w;
                            long j20 = j19 != -9223372036854775807L ? j19 + a6 : -9223372036854775807L;
                            str = h;
                            a = sb3.a(xb2Var3.l(), 1000L, l4);
                            l = xb2Var3.l();
                            str2 = h2;
                            j3 = a6;
                            j4 = j20;
                        } else if (a5 != 1) {
                            mf1.a(a5, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                        } else {
                            long l5 = xb2Var3.l();
                            long a7 = sb3.a(xb2Var3.o(), 1000000L, l5);
                            long a8 = sb3.a(xb2Var3.l(), 1000L, l5);
                            long l6 = xb2Var3.l();
                            String h3 = xb2Var3.h();
                            h3.getClass();
                            String h4 = xb2Var3.h();
                            h4.getClass();
                            str = h3;
                            a = a8;
                            j4 = a7;
                            l = l6;
                            str2 = h4;
                            j3 = -9223372036854775807L;
                        }
                        int i13 = xb2Var3.c - xb2Var3.b;
                        byte[] bArr = new byte[i13];
                        xb2Var3.a(bArr, 0, i13);
                        xb2 xb2Var4 = new xb2(this.i.a(new ym0(str, str2, a, l, bArr)));
                        int i14 = xb2Var4.c - xb2Var4.b;
                        for (c83 c83Var : this.D) {
                            xb2Var4.e(0);
                            c83Var.a(i14, xb2Var4);
                        }
                        if (j4 == -9223372036854775807L) {
                            this.l.addLast(new nw0(j3, true, i14));
                            this.t += i14;
                        } else if (!this.l.isEmpty()) {
                            this.l.addLast(new nw0(j4, false, i14));
                            this.t += i14;
                        } else {
                            for (c83 c83Var2 : this.D) {
                                c83Var2.a(j4, 1, i14, 0, null);
                            }
                        }
                    }
                } else {
                    ((pd0) up0Var).a(i10);
                }
                a(((pd0) up0Var).d);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x0661, code lost:
    
        r1 = r0;
        r1.n = 0;
        r1.q = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0667, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0240  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v63 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j) {
        pw0 pw0Var;
        char c;
        boolean z;
        int i;
        wi wiVar;
        SparseArray sparseArray;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        char c2;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        xi c3;
        xi c4;
        xb2 xb2Var;
        int i12;
        int size;
        int i13;
        byte[] bArr2;
        byte[] bArr3;
        int i14;
        boolean z3;
        w73 w73Var;
        ArrayList arrayList;
        int i15;
        wi wiVar2;
        int i16;
        int i17;
        byte[] bArr4;
        int i18;
        ow0 ow0Var;
        wi wiVar3;
        ow0 ow0Var2;
        long j2;
        int i19;
        boolean z4;
        int i20;
        int i21;
        boolean z5;
        int i22;
        int i23;
        boolean z6;
        xb2 xb2Var2;
        boolean z7;
        int i24;
        ow0 ow0Var3;
        int i25;
        pw0 pw0Var2 = this;
        int i26 = 8;
        char c5 = 2;
        loop0: while (true) {
            boolean z8 = true;
            while (!pw0Var2.k.isEmpty() && ((wi) pw0Var2.k.peek()).b == j) {
                wi wiVar4 = (wi) pw0Var2.k.pop();
                int i27 = wiVar4.a;
                if (i27 == 1836019574) {
                    pw0Var2.a(wiVar4);
                } else {
                    if (i27 == 1836019558) {
                        SparseArray sparseArray2 = pw0Var2.c;
                        int i28 = pw0Var2.a;
                        byte[] bArr5 = pw0Var2.g;
                        int size2 = wiVar4.d.size();
                        int i29 = 0;
                        ?? r4 = z8;
                        while (i29 < size2) {
                            wi wiVar5 = (wi) wiVar4.d.get(i29);
                            if (wiVar5.a == 1953653094) {
                                xi c6 = wiVar5.c(1952868452);
                                c6.getClass();
                                xb2 xb2Var3 = c6.b;
                                xb2Var3.e(i26);
                                int a = xb2Var3.a();
                                ow0 ow0Var4 = (ow0) sparseArray2.get(xb2Var3.a());
                                if (ow0Var4 == null) {
                                    sparseArray = sparseArray2;
                                    ow0Var4 = null;
                                } else {
                                    sparseArray = sparseArray2;
                                    if ((a & 1) != 0) {
                                        long o = xb2Var3.o();
                                        w73 w73Var2 = ow0Var4.b;
                                        w73Var2.b = o;
                                        w73Var2.c = o;
                                    }
                                    ye0 ye0Var = ow0Var4.e;
                                    if ((a & 2) != 0) {
                                        i6 = xb2Var3.a() - r4;
                                    } else {
                                        i6 = ye0Var.a;
                                    }
                                    if ((a & 8) != 0) {
                                        i7 = xb2Var3.a();
                                    } else {
                                        i7 = ye0Var.b;
                                    }
                                    if ((a & 16) != 0) {
                                        i8 = xb2Var3.a();
                                    } else {
                                        i8 = ye0Var.c;
                                    }
                                    if ((a & 32) != 0) {
                                        i9 = xb2Var3.a();
                                    } else {
                                        i9 = ye0Var.d;
                                    }
                                    ow0Var4.b.a = new ye0(i6, i7, i8, i9);
                                }
                                if (ow0Var4 == null) {
                                    wiVar = wiVar4;
                                    i2 = i28;
                                    bArr = bArr5;
                                    i3 = size2;
                                    i4 = i29;
                                    c2 = c5;
                                    z2 = r4;
                                    i5 = 8;
                                } else {
                                    w73 w73Var3 = ow0Var4.b;
                                    long j3 = w73Var3.p;
                                    boolean z9 = w73Var3.q;
                                    ow0Var4.b();
                                    ow0Var4.l = r4;
                                    xi c7 = wiVar5.c(1952867444);
                                    if (c7 != null && (i28 & 2) == 0) {
                                        xb2 xb2Var4 = c7.b;
                                        xb2Var4.e(8);
                                        w73Var3.p = ((xb2Var4.a() >> 24) & 255) == r4 ? xb2Var4.o() : xb2Var4.l();
                                        w73Var3.q = r4;
                                    } else {
                                        w73Var3.p = j3;
                                        w73Var3.q = z9;
                                    }
                                    ArrayList arrayList2 = wiVar5.c;
                                    int size3 = arrayList2.size();
                                    int i30 = 0;
                                    int i31 = 0;
                                    int i32 = 0;
                                    while (true) {
                                        i10 = 1953658222;
                                        if (i30 >= size3) {
                                            break;
                                        }
                                        xi xiVar = (xi) arrayList2.get(i30);
                                        int i33 = size2;
                                        if (xiVar.a == 1953658222) {
                                            xb2 xb2Var5 = xiVar.b;
                                            xb2Var5.e(12);
                                            int n = xb2Var5.n();
                                            if (n > 0) {
                                                i31 += n;
                                                i25 = 1;
                                                i32++;
                                                i30 += i25;
                                                size2 = i33;
                                            }
                                        }
                                        i25 = 1;
                                        i30 += i25;
                                        size2 = i33;
                                    }
                                    i3 = size2;
                                    ow0Var4.h = 0;
                                    ow0Var4.g = 0;
                                    ow0Var4.f = 0;
                                    w73 w73Var4 = ow0Var4.b;
                                    w73Var4.d = i32;
                                    w73Var4.e = i31;
                                    if (w73Var4.g.length < i32) {
                                        w73Var4.f = new long[i32];
                                        w73Var4.g = new int[i32];
                                    }
                                    if (w73Var4.h.length < i31) {
                                        int i34 = (i31 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                        w73Var4.h = new int[i34];
                                        w73Var4.i = new long[i34];
                                        w73Var4.j = new boolean[i34];
                                        w73Var4.l = new boolean[i34];
                                    }
                                    int i35 = 0;
                                    int i36 = 0;
                                    int i37 = 0;
                                    while (i35 < size3) {
                                        xi xiVar2 = (xi) arrayList2.get(i35);
                                        if (xiVar2.a == i10) {
                                            int i38 = i36 + 1;
                                            xb2 xb2Var6 = xiVar2.b;
                                            xb2Var6.e(8);
                                            int a2 = xb2Var6.a();
                                            u73 u73Var = ow0Var4.d.a;
                                            arrayList = arrayList2;
                                            w73 w73Var5 = ow0Var4.b;
                                            i16 = size3;
                                            ye0 ye0Var2 = w73Var5.a;
                                            int i39 = sb3.a;
                                            w73Var5.g[i36] = xb2Var6.n();
                                            long[] jArr = w73Var5.f;
                                            i15 = i35;
                                            wiVar2 = wiVar4;
                                            long j4 = w73Var5.b;
                                            jArr[i36] = j4;
                                            if ((a2 & 1) != 0) {
                                                i18 = i29;
                                                ow0Var2 = ow0Var4;
                                                jArr[i36] = j4 + xb2Var6.a();
                                            } else {
                                                i18 = i29;
                                                ow0Var2 = ow0Var4;
                                            }
                                            boolean z10 = (a2 & 4) != 0;
                                            int i40 = ye0Var2.d;
                                            if (z10) {
                                                i40 = xb2Var6.a();
                                            }
                                            boolean z11 = (a2 & 256) != 0;
                                            boolean z12 = (a2 & 512) != 0;
                                            boolean z13 = (a2 & 1024) != 0;
                                            int i41 = i40;
                                            boolean z14 = (a2 & 2048) != 0;
                                            long[] jArr2 = u73Var.h;
                                            bArr4 = bArr5;
                                            if (jArr2 != null) {
                                                wiVar3 = wiVar5;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    j2 = u73Var.i[0];
                                                    int[] iArr = w73Var5.h;
                                                    long[] jArr3 = w73Var5.i;
                                                    boolean[] zArr = w73Var5.j;
                                                    w73Var = w73Var3;
                                                    boolean z15 = (u73Var.b == 2 || (i28 & 1) == 0) ? false : true;
                                                    i19 = w73Var5.g[i36] + i37;
                                                    long j5 = u73Var.c;
                                                    i17 = i28;
                                                    long j6 = w73Var5.p;
                                                    while (i37 < i19) {
                                                        if (z11) {
                                                            z4 = z11;
                                                            i21 = i19;
                                                            i20 = xb2Var6.a();
                                                        } else {
                                                            z4 = z11;
                                                            i20 = ye0Var2.b;
                                                            i21 = i19;
                                                        }
                                                        if (i20 < 0) {
                                                            throw new cc2(gg2.a(i20, "Unexpected negative value: "), null, true, 1);
                                                        }
                                                        if (z12) {
                                                            z5 = z12;
                                                            i22 = xb2Var6.a();
                                                        } else {
                                                            z5 = z12;
                                                            i22 = ye0Var2.c;
                                                        }
                                                        if (i22 >= 0) {
                                                            if (z13) {
                                                                i23 = xb2Var6.a();
                                                            } else {
                                                                i23 = (i37 == 0 && z10) ? i41 : ye0Var2.d;
                                                            }
                                                            if (z14) {
                                                                z6 = z10;
                                                                xb2Var2 = xb2Var6;
                                                                z7 = z14;
                                                                i24 = xb2Var6.a();
                                                            } else {
                                                                z6 = z10;
                                                                xb2Var2 = xb2Var6;
                                                                z7 = z14;
                                                                i24 = 0;
                                                            }
                                                            long a3 = sb3.a((i24 + j6) - j2, 1000000L, j5);
                                                            jArr3[i37] = a3;
                                                            long j7 = j5;
                                                            if (w73Var5.q) {
                                                                ow0Var3 = ow0Var2;
                                                            } else {
                                                                ow0Var3 = ow0Var2;
                                                                jArr3[i37] = a3 + ow0Var3.d.h;
                                                            }
                                                            iArr[i37] = i22;
                                                            zArr[i37] = ((i23 >> 16) & 1) == 0 && (!z15 || i37 == 0);
                                                            j6 += i20;
                                                            i37++;
                                                            ow0Var2 = ow0Var3;
                                                            j5 = j7;
                                                            z11 = z4;
                                                            i19 = i21;
                                                            z12 = z5;
                                                            z10 = z6;
                                                            xb2Var6 = xb2Var2;
                                                            z14 = z7;
                                                        } else {
                                                            throw new cc2(gg2.a(i22, "Unexpected negative value: "), null, true, 1);
                                                        }
                                                    }
                                                    int i42 = i19;
                                                    ow0Var = ow0Var2;
                                                    w73Var5.p = j6;
                                                    i36 = i38;
                                                    i37 = i42;
                                                }
                                            } else {
                                                wiVar3 = wiVar5;
                                            }
                                            j2 = 0;
                                            int[] iArr2 = w73Var5.h;
                                            long[] jArr32 = w73Var5.i;
                                            boolean[] zArr2 = w73Var5.j;
                                            w73Var = w73Var3;
                                            if (u73Var.b == 2) {
                                            }
                                            i19 = w73Var5.g[i36] + i37;
                                            long j52 = u73Var.c;
                                            i17 = i28;
                                            long j62 = w73Var5.p;
                                            while (i37 < i19) {
                                            }
                                            int i422 = i19;
                                            ow0Var = ow0Var2;
                                            w73Var5.p = j62;
                                            i36 = i38;
                                            i37 = i422;
                                        } else {
                                            w73Var = w73Var3;
                                            arrayList = arrayList2;
                                            i15 = i35;
                                            wiVar2 = wiVar4;
                                            i16 = size3;
                                            i17 = i28;
                                            bArr4 = bArr5;
                                            i18 = i29;
                                            ow0Var = ow0Var4;
                                            wiVar3 = wiVar5;
                                        }
                                        i35 = i15 + 1;
                                        ow0Var4 = ow0Var;
                                        arrayList2 = arrayList;
                                        size3 = i16;
                                        wiVar4 = wiVar2;
                                        i29 = i18;
                                        bArr5 = bArr4;
                                        wiVar5 = wiVar3;
                                        w73Var3 = w73Var;
                                        i28 = i17;
                                        i10 = 1953658222;
                                    }
                                    wiVar = wiVar4;
                                    i2 = i28;
                                    byte[] bArr6 = bArr5;
                                    i4 = i29;
                                    u73 u73Var2 = ow0Var4.d.a;
                                    ye0 ye0Var3 = w73Var3.a;
                                    ye0Var3.getClass();
                                    v73 v73Var = u73Var2.k[ye0Var3.a];
                                    xi c8 = wiVar5.c(1935763834);
                                    if (c8 != null) {
                                        v73Var.getClass();
                                        xb2 xb2Var7 = c8.b;
                                        int i43 = v73Var.d;
                                        xb2Var7.e(8);
                                        if ((xb2Var7.a() & 1) == 1) {
                                            xb2Var7.e(xb2Var7.b + 8);
                                        }
                                        int k = xb2Var7.k();
                                        int n2 = xb2Var7.n();
                                        if (n2 <= w73Var3.e) {
                                            if (k == 0) {
                                                boolean[] zArr3 = w73Var3.l;
                                                i14 = 0;
                                                for (int i44 = 0; i44 < n2; i44++) {
                                                    int k2 = xb2Var7.k();
                                                    i14 += k2;
                                                    zArr3[i44] = k2 > i43;
                                                }
                                                z3 = false;
                                            } else {
                                                boolean z16 = k > i43;
                                                i14 = k * n2;
                                                z3 = false;
                                                Arrays.fill(w73Var3.l, 0, n2, z16);
                                            }
                                            Arrays.fill(w73Var3.l, n2, w73Var3.e, z3);
                                            if (i14 > 0) {
                                                w73Var3.n.c(i14);
                                                w73Var3.k = true;
                                                w73Var3.o = true;
                                                i11 = 1;
                                                c3 = wiVar5.c(1935763823);
                                                if (c3 != null) {
                                                    xb2 xb2Var8 = c3.b;
                                                    xb2Var8.e(8);
                                                    int a4 = xb2Var8.a();
                                                    if ((a4 & 1) == i11) {
                                                        xb2Var8.e(xb2Var8.b + 8);
                                                    }
                                                    int n3 = xb2Var8.n();
                                                    if (n3 != i11) {
                                                        throw new cc2(gg2.a(n3, "Unexpected saio entry count: "), null, true, 1);
                                                    }
                                                    w73Var3.c += ((a4 >> 24) & 255) == 0 ? xb2Var8.l() : xb2Var8.o();
                                                }
                                                c4 = wiVar5.c(1936027235);
                                                if (c4 != null) {
                                                    a(c4.b, 0, w73Var3);
                                                }
                                                String str = v73Var == null ? v73Var.b : null;
                                                xb2Var = null;
                                                xb2 xb2Var9 = null;
                                                for (i12 = 0; i12 < wiVar5.c.size(); i12++) {
                                                    xi xiVar3 = (xi) wiVar5.c.get(i12);
                                                    xb2 xb2Var10 = xiVar3.b;
                                                    int i45 = xiVar3.a;
                                                    if (i45 == 1935828848) {
                                                        xb2Var10.e(12);
                                                        if (xb2Var10.a() == 1936025959) {
                                                            xb2Var = xb2Var10;
                                                        }
                                                    } else if (i45 == 1936158820) {
                                                        xb2Var10.e(12);
                                                        if (xb2Var10.a() == 1936025959) {
                                                            xb2Var9 = xb2Var10;
                                                        }
                                                    }
                                                }
                                                if (xb2Var != null || xb2Var9 == null) {
                                                    c2 = 2;
                                                } else {
                                                    xb2Var.e(8);
                                                    int a5 = (xb2Var.a() >> 24) & 255;
                                                    xb2Var.e(xb2Var.b + 4);
                                                    if (a5 == 1) {
                                                        xb2Var.e(xb2Var.b + 4);
                                                    }
                                                    if (xb2Var.a() == 1) {
                                                        xb2Var9.e(8);
                                                        int a6 = (xb2Var9.a() >> 24) & 255;
                                                        xb2Var9.e(xb2Var9.b + 4);
                                                        if (a6 != 1) {
                                                            c2 = 2;
                                                            if (a6 >= 2) {
                                                                xb2Var9.e(xb2Var9.b + 4);
                                                            }
                                                        } else {
                                                            if (xb2Var9.l() == 0) {
                                                                throw cc2.a("Variable length description in sgpd found (unsupported)");
                                                            }
                                                            c2 = 2;
                                                        }
                                                        if (xb2Var9.l() == 1) {
                                                            xb2Var9.e(xb2Var9.b + 1);
                                                            int k3 = xb2Var9.k();
                                                            int i46 = (k3 & 240) >> 4;
                                                            int i47 = k3 & 15;
                                                            boolean z17 = xb2Var9.k() == 1;
                                                            if (z17) {
                                                                int k4 = xb2Var9.k();
                                                                byte[] bArr7 = new byte[16];
                                                                xb2Var9.a(bArr7, 0, 16);
                                                                if (k4 == 0) {
                                                                    int k5 = xb2Var9.k();
                                                                    byte[] bArr8 = new byte[k5];
                                                                    xb2Var9.a(bArr8, 0, k5);
                                                                    bArr3 = bArr8;
                                                                } else {
                                                                    bArr3 = null;
                                                                }
                                                                w73Var3.k = true;
                                                                w73Var3.m = new v73(z17, str, k4, bArr7, i46, i47, bArr3);
                                                            }
                                                        } else {
                                                            throw cc2.a("Entry count in sgpd != 1 (unsupported).");
                                                        }
                                                    } else {
                                                        throw cc2.a("Entry count in sbgp != 1 (unsupported).");
                                                    }
                                                }
                                                size = wiVar5.c.size();
                                                i13 = 0;
                                                while (i13 < size) {
                                                    xi xiVar4 = (xi) wiVar5.c.get(i13);
                                                    if (xiVar4.a == 1970628964) {
                                                        xb2 xb2Var11 = xiVar4.b;
                                                        xb2Var11.e(8);
                                                        bArr2 = bArr6;
                                                        xb2Var11.a(bArr2, 0, 16);
                                                        if (Arrays.equals(bArr2, G)) {
                                                            a(xb2Var11, 16, w73Var3);
                                                        }
                                                    } else {
                                                        bArr2 = bArr6;
                                                    }
                                                    i13++;
                                                    bArr6 = bArr2;
                                                }
                                                bArr = bArr6;
                                                z2 = true;
                                                i5 = 8;
                                            }
                                        } else {
                                            throw new cc2("Saiz sample count " + n2 + " is greater than fragment sample count" + w73Var3.e, null, true, 1);
                                        }
                                    }
                                    i11 = 1;
                                    c3 = wiVar5.c(1935763823);
                                    if (c3 != null) {
                                    }
                                    c4 = wiVar5.c(1936027235);
                                    if (c4 != null) {
                                    }
                                    if (v73Var == null) {
                                    }
                                    xb2Var = null;
                                    xb2 xb2Var92 = null;
                                    while (i12 < wiVar5.c.size()) {
                                    }
                                    if (xb2Var != null) {
                                    }
                                    c2 = 2;
                                    size = wiVar5.c.size();
                                    i13 = 0;
                                    while (i13 < size) {
                                    }
                                    bArr = bArr6;
                                    z2 = true;
                                    i5 = 8;
                                }
                            } else {
                                wiVar = wiVar4;
                                sparseArray = sparseArray2;
                                i2 = i28;
                                bArr = bArr5;
                                i3 = size2;
                                i4 = i29;
                                c2 = c5;
                                z2 = r4;
                                i5 = i26;
                            }
                            i26 = i5;
                            bArr5 = bArr;
                            sparseArray2 = sparseArray;
                            size2 = i3;
                            wiVar4 = wiVar;
                            i28 = i2;
                            r4 = z2;
                            c5 = c2;
                            i29 = i4 + 1;
                        }
                        i = i26;
                        c = c5;
                        vk0 a7 = a(wiVar4.c);
                        pw0Var = this;
                        if (a7 != null) {
                            int size4 = pw0Var.c.size();
                            for (int i48 = 0; i48 < size4; i48++) {
                                ow0 ow0Var5 = (ow0) pw0Var.c.valueAt(i48);
                                u73 u73Var3 = ow0Var5.d.a;
                                ye0 ye0Var4 = ow0Var5.b.a;
                                int i49 = sb3.a;
                                v73 v73Var2 = u73Var3.k[ye0Var4.a];
                                String str2 = v73Var2 != null ? v73Var2.b : null;
                                vk0 vk0Var = sb3.a(a7.d, str2) ? a7 : new vk0(str2, false, a7.b);
                                jw0 jw0Var = ow0Var5.d.a.f;
                                jw0Var.getClass();
                                iw0 iw0Var = new iw0(jw0Var);
                                iw0Var.n = vk0Var;
                                ow0Var5.a.a(new jw0(iw0Var));
                            }
                        }
                        if (pw0Var.u != -9223372036854775807L) {
                            int size5 = pw0Var.c.size();
                            for (int i50 = 0; i50 < size5; i50++) {
                                ow0 ow0Var6 = (ow0) pw0Var.c.valueAt(i50);
                                long j8 = pw0Var.u;
                                int i51 = ow0Var6.f;
                                while (true) {
                                    w73 w73Var6 = ow0Var6.b;
                                    if (i51 < w73Var6.e && w73Var6.i[i51] < j8) {
                                        if (w73Var6.j[i51]) {
                                            ow0Var6.i = i51;
                                        }
                                        i51++;
                                    }
                                }
                            }
                            z = true;
                            pw0Var.u = -9223372036854775807L;
                        }
                    } else {
                        pw0Var = pw0Var2;
                        c = c5;
                        z = z8 ? 1 : 0;
                        i = i26;
                        if (!pw0Var.k.isEmpty()) {
                            ((wi) pw0Var.k.peek()).d.add(wiVar4);
                        }
                    }
                    pw0Var2 = pw0Var;
                    i26 = i;
                    c5 = c;
                    z8 = z;
                }
            }
            pw0Var2 = pw0Var;
            i26 = i;
            c5 = c;
        }
    }

    public final void a(wi wiVar) {
        ye0 ye0Var;
        ye0 ye0Var2;
        vk0 a = a(wiVar.c);
        wi b = wiVar.b(1836475768);
        b.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = b.c.size();
        long j = -9223372036854775807L;
        for (int i = 0; i < size; i++) {
            xi xiVar = (xi) b.c.get(i);
            int i2 = xiVar.a;
            if (i2 == 1953654136) {
                xb2 xb2Var = xiVar.b;
                xb2Var.e(12);
                Pair create = Pair.create(Integer.valueOf(xb2Var.a()), new ye0(xb2Var.a() - 1, xb2Var.a(), xb2Var.a(), xb2Var.a()));
                sparseArray.put(((Integer) create.first).intValue(), (ye0) create.second);
            } else if (i2 == 1835362404) {
                xb2 xb2Var2 = xiVar.b;
                xb2Var2.e(8);
                j = ((xb2Var2.a() >> 24) & 255) == 0 ? xb2Var2.l() : xb2Var2.o();
            }
        }
        ArrayList a2 = fj.a(wiVar, new by0(), j, a, (this.a & 16) != 0, false, new yx0() { // from class: yads.pw0$$ExternalSyntheticLambda0
            @Override // yads.yx0
            public final Object apply(Object obj) {
                return pw0.this.a((u73) obj);
            }
        });
        int size2 = a2.size();
        if (this.c.size() == 0) {
            for (int i3 = 0; i3 < size2; i3++) {
                d83 d83Var = (d83) a2.get(i3);
                u73 u73Var = d83Var.a;
                c83 a3 = this.C.a(i3, u73Var.b);
                int i4 = u73Var.a;
                if (sparseArray.size() == 1) {
                    ye0Var2 = (ye0) sparseArray.valueAt(0);
                } else {
                    ye0Var2 = (ye0) sparseArray.get(i4);
                    ye0Var2.getClass();
                }
                this.c.put(u73Var.a, new ow0(a3, d83Var, ye0Var2));
                this.v = Math.max(this.v, u73Var.e);
            }
            this.C.a();
            return;
        }
        if (this.c.size() != size2) {
            throw new IllegalStateException();
        }
        for (int i5 = 0; i5 < size2; i5++) {
            d83 d83Var2 = (d83) a2.get(i5);
            u73 u73Var2 = d83Var2.a;
            ow0 ow0Var = (ow0) this.c.get(u73Var2.a);
            int i6 = u73Var2.a;
            if (sparseArray.size() == 1) {
                ye0Var = (ye0) sparseArray.valueAt(0);
            } else {
                ye0Var = (ye0) sparseArray.get(i6);
                ye0Var.getClass();
            }
            ow0Var.d = d83Var2;
            ow0Var.e = ye0Var;
            ow0Var.a.a(d83Var2.a.f);
            ow0Var.b();
        }
    }

    public static void a(xb2 xb2Var, int i, w73 w73Var) {
        xb2Var.e(i + 8);
        int a = xb2Var.a();
        if ((a & 1) == 0) {
            boolean z = (a & 2) != 0;
            int n = xb2Var.n();
            if (n == 0) {
                Arrays.fill(w73Var.l, 0, w73Var.e, false);
                return;
            }
            if (n == w73Var.e) {
                Arrays.fill(w73Var.l, 0, n, z);
                w73Var.n.c(xb2Var.c - xb2Var.b);
                w73Var.k = true;
                w73Var.o = true;
                xb2 xb2Var2 = w73Var.n;
                xb2Var.a(xb2Var2.a, 0, xb2Var2.c);
                w73Var.n.e(0);
                w73Var.o = false;
                return;
            }
            throw new cc2("Senc sample count " + n + " is different from fragment sample count" + w73Var.e, null, true, 1);
        }
        throw cc2.a("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static vk0 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            xi xiVar = (xi) arrayList.get(i);
            if (xiVar.a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = xiVar.b.a;
                hl2 a = il2.a(bArr);
                UUID uuid = a == null ? null : a.a;
                if (uuid == null) {
                    gh1.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new uk0(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new vk0(null, false, (uk0[]) arrayList2.toArray(new uk0[0]));
    }
}
