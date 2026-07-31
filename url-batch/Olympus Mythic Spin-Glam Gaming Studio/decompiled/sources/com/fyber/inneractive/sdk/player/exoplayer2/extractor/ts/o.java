package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import java.util.Collections;

/* loaded from: classes14.dex */
public final class o implements h {
    public final x a;
    public String b;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r c;
    public n d;
    public boolean e;
    public long l;
    public long m;
    public final boolean[] f = new boolean[3];
    public final r g = new r(32);
    public final r h = new r(33);
    public final r i = new r(34);
    public final r j = new r(39);
    public final r k = new r(40);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    public o(x xVar) {
        this.a = xVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f);
        r rVar = this.g;
        rVar.b = false;
        rVar.c = false;
        r rVar2 = this.h;
        rVar2.b = false;
        rVar2.c = false;
        r rVar3 = this.i;
        rVar3.b = false;
        rVar3.c = false;
        r rVar4 = this.j;
        rVar4.b = false;
        rVar4.c = false;
        r rVar5 = this.k;
        rVar5.b = false;
        rVar5.c = false;
        n nVar = this.d;
        nVar.f = false;
        nVar.g = false;
        nVar.h = false;
        nVar.i = false;
        nVar.j = false;
        this.l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.b = e0Var.e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a = jVar.a(e0Var.d, 2);
        this.c = a;
        this.d = new n(a);
        this.a.a(jVar, e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03bd  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        float f2;
        int i8;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        while (true) {
            int i11 = nVar.c;
            int i12 = nVar.b;
            int i13 = i11 - i12;
            if (i13 <= 0) {
                return;
            }
            byte[] bArr2 = nVar.a;
            this.l += i13;
            this.c.a(i13, nVar);
            while (i12 < i11) {
                int a = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(bArr2, i12, i11, this.f);
                if (a == i11) {
                    a(bArr2, i12, i11);
                    return;
                }
                int i14 = a + 3;
                int i15 = (bArr2[i14] & 126) >> 1;
                int i16 = a - i12;
                if (i16 > 0) {
                    a(bArr2, i12, a);
                }
                int i17 = i11 - a;
                long j = this.l - i17;
                int i18 = i16 < 0 ? -i16 : 0;
                long j2 = this.m;
                if (this.e) {
                    n nVar2 = this.d;
                    if (nVar2.j && nVar2.g) {
                        nVar2.m = nVar2.c;
                        nVar2.j = false;
                    } else if (nVar2.h || nVar2.g) {
                        if (nVar2.i) {
                            i2 = i18;
                            long j3 = nVar2.b;
                            i = i11;
                            i3 = i17;
                            nVar2.a.a(nVar2.l, nVar2.m ? 1 : 0, (int) (j3 - nVar2.k), i17 + ((int) (j - j3)), null);
                        } else {
                            i = i11;
                            i2 = i18;
                            i3 = i17;
                        }
                        nVar2.k = nVar2.b;
                        nVar2.l = nVar2.e;
                        nVar2.i = true;
                        nVar2.m = nVar2.c;
                    }
                    i = i11;
                    bArr = bArr2;
                    i4 = i14;
                    i6 = i15;
                    i2 = i18;
                    i5 = i17;
                    i7 = 16;
                    if (this.j.a(i2)) {
                        r rVar = this.j;
                        int a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar.e, rVar.d);
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.n;
                        nVar3.a = this.j.d;
                        nVar3.c = a2;
                        nVar3.b = 0;
                        nVar3.e(5);
                        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j2, this.n, this.a.b);
                    }
                    if (this.k.a(i2)) {
                        r rVar2 = this.k;
                        int a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar2.e, rVar2.d);
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.n;
                        nVar4.a = this.k.d;
                        nVar4.c = a3;
                        nVar4.b = 0;
                        nVar4.e(5);
                        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j2, this.n, this.a.b);
                    }
                    long j4 = this.m;
                    if (this.e) {
                        n nVar5 = this.d;
                        nVar5.g = false;
                        nVar5.h = false;
                        nVar5.e = j4;
                        nVar5.d = 0;
                        nVar5.b = j;
                        i9 = i6;
                        if (i9 >= 32) {
                            if (nVar5.j || !nVar5.i) {
                                i10 = i7;
                                z = false;
                            } else {
                                boolean z3 = nVar5.m;
                                int i19 = (int) (j - nVar5.k);
                                i10 = i7;
                                z = false;
                                nVar5.a.a(nVar5.l, z3 ? 1 : 0, i19, i5, null);
                                nVar5.i = false;
                            }
                            if (i9 <= 34) {
                                z2 = true;
                                nVar5.h = !nVar5.j;
                                nVar5.j = true;
                                boolean z4 = (i9 >= i10 || i9 > 21) ? z : z2;
                                nVar5.c = z4;
                                nVar5.f = (!z4 || i9 <= 9) ? z2 : z;
                            }
                        } else {
                            i10 = i7;
                            z = false;
                        }
                        z2 = true;
                        if (i9 >= i10) {
                        }
                        nVar5.c = z4;
                        nVar5.f = (!z4 || i9 <= 9) ? z2 : z;
                    } else {
                        i9 = i6;
                        this.g.b(i9);
                        this.h.b(i9);
                        this.i.b(i9);
                    }
                    this.j.b(i9);
                    this.k.b(i9);
                    i11 = i;
                    bArr2 = bArr;
                    i12 = i4;
                } else {
                    i = i11;
                    i2 = i18;
                    i3 = i17;
                    this.g.a(i2);
                    this.h.a(i2);
                    this.i.a(i2);
                    r rVar3 = this.g;
                    if (rVar3.c) {
                        r rVar4 = this.h;
                        if (rVar4.c) {
                            r rVar5 = this.i;
                            if (rVar5.c) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar6 = this.c;
                                String str = this.b;
                                int i20 = rVar3.e;
                                bArr = bArr2;
                                i4 = i14;
                                byte[] bArr3 = new byte[rVar4.e + i20 + rVar5.e];
                                i5 = i3;
                                System.arraycopy(rVar3.d, 0, bArr3, 0, i20);
                                i6 = i15;
                                System.arraycopy(rVar4.d, 0, bArr3, rVar3.e, rVar4.e);
                                System.arraycopy(rVar5.d, 0, bArr3, rVar3.e + rVar4.e, rVar5.e);
                                com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(rVar4.d, 0, rVar4.e);
                                oVar.d(44);
                                int i21 = 3;
                                int b = oVar.b(3);
                                oVar.f();
                                oVar.d(88);
                                oVar.d(8);
                                int i22 = 0;
                                for (int i23 = 0; i23 < b; i23++) {
                                    if (oVar.c()) {
                                        i22 += 89;
                                    }
                                    if (oVar.c()) {
                                        i22 += 8;
                                    }
                                }
                                oVar.d(i22);
                                int i24 = 2;
                                if (b > 0) {
                                    oVar.d((8 - b) * 2);
                                }
                                oVar.d();
                                int d = oVar.d();
                                if (d == 3) {
                                    oVar.f();
                                }
                                int d2 = oVar.d();
                                int d3 = oVar.d();
                                if (oVar.c()) {
                                    int d4 = oVar.d();
                                    int d5 = oVar.d();
                                    int d6 = oVar.d();
                                    int d7 = oVar.d();
                                    d2 -= (d4 + d5) * ((d == 1 || d == 2) ? 2 : 1);
                                    d3 -= (d6 + d7) * (d == 1 ? 2 : 1);
                                }
                                int i25 = d2;
                                int i26 = d3;
                                oVar.d();
                                oVar.d();
                                int d8 = oVar.d();
                                for (int i27 = oVar.c() ? 0 : b; i27 <= b; i27++) {
                                    oVar.d();
                                    oVar.d();
                                    oVar.d();
                                }
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                if (oVar.c() && oVar.c()) {
                                    int i28 = 0;
                                    while (true) {
                                        int i29 = 4;
                                        if (i28 >= 4) {
                                            break;
                                        }
                                        int i30 = 0;
                                        while (i30 < 6) {
                                            if (!oVar.c()) {
                                                oVar.d();
                                            } else {
                                                int min = Math.min(64, 1 << ((i28 << 1) + i29));
                                                if (i28 > 1) {
                                                    oVar.e();
                                                }
                                                for (int i31 = 0; i31 < min; i31++) {
                                                    oVar.e();
                                                }
                                                i21 = 3;
                                            }
                                            i30 += i28 == i21 ? i21 : 1;
                                            i29 = 4;
                                        }
                                        i28++;
                                        i24 = 2;
                                    }
                                }
                                oVar.d(i24);
                                if (oVar.c()) {
                                    oVar.d(8);
                                    oVar.d();
                                    oVar.d();
                                    oVar.f();
                                }
                                int d9 = oVar.d();
                                int i32 = 0;
                                boolean z5 = false;
                                int i33 = 0;
                                while (i32 < d9) {
                                    if (i32 != 0) {
                                        z5 = oVar.c();
                                    }
                                    if (z5) {
                                        oVar.f();
                                        oVar.d();
                                        for (int i34 = 0; i34 <= i33; i34++) {
                                            if (oVar.c()) {
                                                oVar.f();
                                            }
                                        }
                                        i8 = d9;
                                    } else {
                                        int d10 = oVar.d();
                                        int d11 = oVar.d();
                                        int i35 = d10 + d11;
                                        i8 = d9;
                                        for (int i36 = 0; i36 < d10; i36++) {
                                            oVar.d();
                                            oVar.f();
                                        }
                                        for (int i37 = 0; i37 < d11; i37++) {
                                            oVar.d();
                                            oVar.f();
                                        }
                                        i33 = i35;
                                    }
                                    i32++;
                                    d9 = i8;
                                }
                                if (oVar.c()) {
                                    for (int i38 = 0; i38 < oVar.d(); i38++) {
                                        oVar.d(d8 + 5);
                                    }
                                }
                                oVar.d(2);
                                if (oVar.c() && oVar.c()) {
                                    int b2 = oVar.b(8);
                                    if (b2 == 255) {
                                        i7 = 16;
                                        int b3 = oVar.b(16);
                                        int b4 = oVar.b(16);
                                        if (b3 != 0 && b4 != 0) {
                                            f2 = b3 / b4;
                                            rVar6.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i25, i26, Collections.singletonList(bArr3), -1, f2, null, -1, null, null));
                                            this.e = true;
                                            if (this.j.a(i2)) {
                                            }
                                            if (this.k.a(i2)) {
                                            }
                                            long j42 = this.m;
                                            if (this.e) {
                                            }
                                            this.j.b(i9);
                                            this.k.b(i9);
                                            i11 = i;
                                            bArr2 = bArr;
                                            i12 = i4;
                                        }
                                    } else {
                                        i7 = 16;
                                        float[] fArr = com.fyber.inneractive.sdk.player.exoplayer2.util.l.b;
                                        if (b2 < 17) {
                                            f = fArr[b2];
                                            f2 = f;
                                            rVar6.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i25, i26, Collections.singletonList(bArr3), -1, f2, null, -1, null, null));
                                            this.e = true;
                                            if (this.j.a(i2)) {
                                            }
                                            if (this.k.a(i2)) {
                                            }
                                            long j422 = this.m;
                                            if (this.e) {
                                            }
                                            this.j.b(i9);
                                            this.k.b(i9);
                                            i11 = i;
                                            bArr2 = bArr;
                                            i12 = i4;
                                        } else {
                                            Log.w("H265Reader", "Unexpected aspect_ratio_idc value: " + b2);
                                        }
                                    }
                                } else {
                                    i7 = 16;
                                }
                                f = 1.0f;
                                f2 = f;
                                rVar6.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i25, i26, Collections.singletonList(bArr3), -1, f2, null, -1, null, null));
                                this.e = true;
                                if (this.j.a(i2)) {
                                }
                                if (this.k.a(i2)) {
                                }
                                long j4222 = this.m;
                                if (this.e) {
                                }
                                this.j.b(i9);
                                this.k.b(i9);
                                i11 = i;
                                bArr2 = bArr;
                                i12 = i4;
                            }
                        }
                    }
                }
                i5 = i3;
                bArr = bArr2;
                i4 = i14;
                i6 = i15;
                i7 = 16;
                if (this.j.a(i2)) {
                }
                if (this.k.a(i2)) {
                }
                long j42222 = this.m;
                if (this.e) {
                }
                this.j.b(i9);
                this.k.b(i9);
                i11 = i;
                bArr2 = bArr;
                i12 = i4;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z, long j) {
        this.m = j;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            n nVar = this.d;
            if (nVar.f) {
                int i3 = nVar.d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    nVar.g = (bArr[i4] & 128) != 0;
                    nVar.f = false;
                } else {
                    nVar.d = (i2 - i) + i3;
                }
            }
        } else {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }
}
