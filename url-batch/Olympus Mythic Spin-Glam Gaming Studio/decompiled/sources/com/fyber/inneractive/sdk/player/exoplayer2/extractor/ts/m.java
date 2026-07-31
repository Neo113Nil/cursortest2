package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes14.dex */
public final class m implements h {
    public final x a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r j;
    public l k;
    public boolean l;
    public long m;
    public final boolean[] h = new boolean[3];
    public final r d = new r(7);
    public final r e = new r(8);
    public final r f = new r(6);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    public m(x xVar, boolean z, boolean z2) {
        this.a = xVar;
        this.b = z;
        this.c = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.h);
        r rVar = this.d;
        rVar.b = false;
        rVar.c = false;
        r rVar2 = this.e;
        rVar2.b = false;
        rVar2.c = false;
        r rVar3 = this.f;
        rVar3.b = false;
        rVar3.c = false;
        l lVar = this.k;
        lVar.k = false;
        lVar.o = false;
        k kVar = lVar.n;
        kVar.b = false;
        kVar.a = false;
        this.g = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.i = e0Var.e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a = jVar.a(e0Var.d, 2);
        this.j = a;
        this.k = new l(a, this.b, this.c);
        this.a.a(jVar, e0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z, long j) {
        this.m = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0202, code lost:
    
        if (r3.j != r4.j) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x020c, code lost:
    
        if (r6 == 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0224, code lost:
    
        if (r3.n != r4.n) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0239, code lost:
    
        if (r3.p != r4.p) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0249, code lost:
    
        if (r3.l != r4.l) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x028f, code lost:
    
        if (r1 == 2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02c6, code lost:
    
        if (r4 != 1) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e6 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        l lVar;
        int i4;
        int i5;
        boolean z;
        int i6;
        l lVar2;
        int i7 = nVar.b;
        int i8 = nVar.c;
        byte[] bArr2 = nVar.a;
        int i9 = i8 - i7;
        this.g += i9;
        this.j.a(i9, nVar);
        while (true) {
            int a = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(bArr2, i7, i8, this.h);
            if (a == i8) {
                break;
            }
            int i10 = a + 3;
            int i11 = bArr2[i10] & 31;
            int i12 = a - i7;
            if (i12 > 0) {
                if (!this.l || this.k.c) {
                    this.d.a(bArr2, i7, a);
                    this.e.a(bArr2, i7, a);
                }
                this.f.a(bArr2, i7, a);
                this.k.a(bArr2, i7, a);
            }
            int i13 = i8 - a;
            long j = this.g - i13;
            int i14 = i12 < 0 ? -i12 : 0;
            long j2 = this.m;
            if (!this.l || this.k.c) {
                this.d.a(i14);
                this.e.a(i14);
                if (!this.l) {
                    if (this.d.c && this.e.c) {
                        ArrayList arrayList = new ArrayList();
                        r rVar = this.d;
                        arrayList.add(Arrays.copyOf(rVar.d, rVar.e));
                        r rVar2 = this.e;
                        arrayList.add(Arrays.copyOf(rVar2.d, rVar2.e));
                        r rVar3 = this.d;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.k a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar3.d, 3, rVar3.e);
                        r rVar4 = this.e;
                        i = i8;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(rVar4.d, 3, rVar4.e);
                        oVar.d(8);
                        int d = oVar.d();
                        int d2 = oVar.d();
                        oVar.f();
                        com.fyber.inneractive.sdk.player.exoplayer2.util.j jVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(oVar.c(), d, d2);
                        bArr = bArr2;
                        i2 = i10;
                        i3 = i11;
                        this.j.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.i, "video/avc", -1, a2.b, a2.c, arrayList, -1, a2.d, null, -1, null, null));
                        this.l = true;
                        this.k.d.append(a2.a, a2);
                        this.k.e.append(d, jVar);
                        r rVar5 = this.d;
                        rVar5.b = false;
                        rVar5.c = false;
                        r rVar6 = this.e;
                        rVar6.b = false;
                        rVar6.c = false;
                    }
                } else {
                    i = i8;
                    bArr = bArr2;
                    i2 = i10;
                    i3 = i11;
                    r rVar7 = this.d;
                    if (rVar7.c) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.k a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar7.d, 3, rVar7.e);
                        this.k.d.append(a3.a, a3);
                        r rVar8 = this.d;
                        rVar8.b = false;
                        rVar8.c = false;
                    } else {
                        r rVar9 = this.e;
                        if (rVar9.c) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(rVar9.d, 3, rVar9.e);
                            oVar2.d(8);
                            int d3 = oVar2.d();
                            int d4 = oVar2.d();
                            oVar2.f();
                            this.k.e.append(d3, new com.fyber.inneractive.sdk.player.exoplayer2.util.j(oVar2.c(), d3, d4));
                            r rVar10 = this.e;
                            rVar10.b = false;
                            rVar10.c = false;
                        }
                    }
                }
                if (this.f.a(i14)) {
                    r rVar11 = this.f;
                    int a4 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar11.e, rVar11.d);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.n;
                    nVar2.a = this.f.d;
                    nVar2.c = a4;
                    nVar2.b = 0;
                    nVar2.e(4);
                    com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j2, this.n, this.a.b);
                }
                lVar = this.k;
                if (lVar.i != 9) {
                    if (lVar.c) {
                        k kVar = lVar.n;
                        k kVar2 = lVar.m;
                        if (kVar.a) {
                            if (kVar2.a) {
                                if (kVar.f == kVar2.f) {
                                    if (kVar.g == kVar2.g) {
                                        if (kVar.h == kVar2.h) {
                                            if (kVar.i) {
                                                if (kVar2.i) {
                                                }
                                            }
                                            int i15 = kVar.d;
                                            int i16 = kVar2.d;
                                            if (i15 != i16) {
                                                if (i15 != 0) {
                                                }
                                            }
                                            int i17 = kVar.c.h;
                                            if (i17 == 0) {
                                                if (kVar2.c.h == 0) {
                                                    if (kVar.m == kVar2.m) {
                                                    }
                                                }
                                            }
                                            if (i17 == 1) {
                                                if (kVar2.c.h == 1) {
                                                    if (kVar.o == kVar2.o) {
                                                    }
                                                }
                                            }
                                            boolean z2 = kVar.k;
                                            boolean z3 = kVar2.k;
                                            if (z2 == z3) {
                                                if (z2) {
                                                    if (z3) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i4 = 1;
                    boolean z4 = lVar.r;
                    i5 = lVar.i;
                    if (i5 != 5) {
                        if (lVar.b && i5 == i4) {
                            k kVar3 = lVar.n;
                            if (kVar3.b) {
                                int i18 = kVar3.e;
                                if (i18 != 7) {
                                }
                            }
                        }
                        z = false;
                        lVar.r = z | z4;
                        long j3 = this.m;
                        if (this.l || this.k.c) {
                            i6 = i3;
                            this.d.b(i6);
                            this.e.b(i6);
                        } else {
                            i6 = i3;
                        }
                        this.f.b(i6);
                        lVar2 = this.k;
                        lVar2.i = i6;
                        lVar2.l = j3;
                        lVar2.j = j;
                        int i19 = !lVar2.b ? 1 : 1;
                        if (lVar2.c) {
                            if (i6 != 5 && i6 != i19 && i6 != 2) {
                            }
                            k kVar4 = lVar2.m;
                            lVar2.m = lVar2.n;
                            lVar2.n = kVar4;
                            kVar4.b = false;
                            kVar4.a = false;
                            lVar2.h = 0;
                            lVar2.k = true;
                        }
                        i8 = i;
                        bArr2 = bArr;
                        i7 = i2;
                    }
                    z = true;
                    lVar.r = z | z4;
                    long j32 = this.m;
                    if (this.l) {
                    }
                    i6 = i3;
                    this.d.b(i6);
                    this.e.b(i6);
                    this.f.b(i6);
                    lVar2 = this.k;
                    lVar2.i = i6;
                    lVar2.l = j32;
                    lVar2.j = j;
                    if (!lVar2.b) {
                    }
                    if (lVar2.c) {
                    }
                    i8 = i;
                    bArr2 = bArr;
                    i7 = i2;
                }
                if (lVar.o) {
                    long j4 = lVar.j;
                    lVar.a.a(lVar.q, lVar.r ? 1 : 0, (int) (j4 - lVar.p), i13 + ((int) (j - j4)), null);
                }
                lVar.p = lVar.j;
                lVar.q = lVar.l;
                lVar.r = false;
                i4 = 1;
                lVar.o = true;
                boolean z42 = lVar.r;
                i5 = lVar.i;
                if (i5 != 5) {
                }
                z = true;
                lVar.r = z | z42;
                long j322 = this.m;
                if (this.l) {
                }
                i6 = i3;
                this.d.b(i6);
                this.e.b(i6);
                this.f.b(i6);
                lVar2 = this.k;
                lVar2.i = i6;
                lVar2.l = j322;
                lVar2.j = j;
                if (!lVar2.b) {
                }
                if (lVar2.c) {
                }
                i8 = i;
                bArr2 = bArr;
                i7 = i2;
            }
            i = i8;
            bArr = bArr2;
            i2 = i10;
            i3 = i11;
            if (this.f.a(i14)) {
            }
            lVar = this.k;
            if (lVar.i != 9) {
            }
            if (lVar.o) {
            }
            lVar.p = lVar.j;
            lVar.q = lVar.l;
            lVar.r = false;
            i4 = 1;
            lVar.o = true;
            boolean z422 = lVar.r;
            i5 = lVar.i;
            if (i5 != 5) {
            }
            z = true;
            lVar.r = z | z422;
            long j3222 = this.m;
            if (this.l) {
            }
            i6 = i3;
            this.d.b(i6);
            this.e.b(i6);
            this.f.b(i6);
            lVar2 = this.k;
            lVar2.i = i6;
            lVar2.l = j3222;
            lVar2.j = j;
            if (!lVar2.b) {
            }
            if (lVar2.c) {
            }
            i8 = i;
            bArr2 = bArr;
            i7 = i2;
        }
        if (!this.l || this.k.c) {
            this.d.a(bArr2, i7, i8);
            this.e.a(bArr2, i7, i8);
        }
        this.f.a(bArr2, i7, i8);
        this.k.a(bArr2, i7, i8);
    }
}
