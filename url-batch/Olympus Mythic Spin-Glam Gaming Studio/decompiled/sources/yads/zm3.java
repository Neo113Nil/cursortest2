package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zm3 extends k43 {
    public ym3 n;
    public int o;
    public boolean p;
    public cn3 q;
    public an3 r;

    @Override // yads.k43
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v46 */
    @Override // yads.k43
    public final boolean a(xb2 xb2Var, long j, i43 i43Var) {
        ym3 ym3Var;
        int i;
        tm3 tm3Var;
        tm3 tm3Var2;
        boolean z;
        int i2;
        tm3 tm3Var3;
        if (this.n != null) {
            i43Var.a.getClass();
            return false;
        }
        cn3 cn3Var = this.q;
        boolean z2 = true;
        if (cn3Var == null) {
            this.q = dn3.a(xb2Var);
        } else {
            an3 an3Var = this.r;
            if (an3Var == null) {
                this.r = dn3.a(xb2Var, true, true);
            } else {
                int i3 = xb2Var.c;
                byte[] bArr = new byte[i3];
                System.arraycopy(xb2Var.a, 0, bArr, 0, i3);
                int i4 = cn3Var.a;
                int i5 = 5;
                dn3.a(5, xb2Var, false);
                int k = xb2Var.k() + 1;
                tm3 tm3Var4 = new tm3(xb2Var.a);
                tm3Var4.b(xb2Var.b * 8);
                int i6 = 0;
                while (true) {
                    int i7 = 16;
                    if (i6 < k) {
                        if (tm3Var4.a(24) == 5653314) {
                            int a = tm3Var4.a(16);
                            int a2 = tm3Var4.a(24);
                            long[] jArr = new long[a2];
                            long j2 = 0;
                            if (!tm3Var4.a()) {
                                boolean a3 = tm3Var4.a();
                                int i8 = 0;
                                while (i8 < a2) {
                                    if (a3) {
                                        if (tm3Var4.a()) {
                                            tm3Var3 = tm3Var4;
                                            jArr[i8] = tm3Var4.a(i5) + 1;
                                        } else {
                                            tm3Var3 = tm3Var4;
                                            jArr[i8] = 0;
                                        }
                                        tm3Var2 = tm3Var3;
                                        z = true;
                                        i2 = k;
                                    } else {
                                        tm3Var2 = tm3Var4;
                                        z = true;
                                        i2 = k;
                                        jArr[i8] = tm3Var2.a(i5) + 1;
                                    }
                                    i8++;
                                    tm3Var4 = tm3Var2;
                                    z2 = z;
                                    k = i2;
                                    i5 = 5;
                                }
                                i = k;
                                tm3Var = tm3Var4;
                            } else {
                                i = k;
                                tm3Var = tm3Var4;
                                int a4 = tm3Var.a(i5) + 1;
                                int i9 = 0;
                                while (i9 < a2) {
                                    int i10 = 0;
                                    for (int i11 = a2 - i9; i11 > 0; i11 >>>= 1) {
                                        i10++;
                                    }
                                    int a5 = tm3Var.a(i10);
                                    int i12 = 0;
                                    while (i12 < a5 && i9 < a2) {
                                        jArr[i9] = a4;
                                        i9++;
                                        i12++;
                                        an3Var = an3Var;
                                        bArr = bArr;
                                    }
                                    a4++;
                                    an3Var = an3Var;
                                    bArr = bArr;
                                }
                            }
                            an3 an3Var2 = an3Var;
                            byte[] bArr2 = bArr;
                            int a6 = tm3Var.a(4);
                            if (a6 > 2) {
                                throw new cc2(gg2.a(a6, "lookup type greater than 2 not decodable: "), null, true, 1);
                            }
                            if (a6 == 1 || a6 == 2) {
                                tm3Var.b(32);
                                tm3Var.b(32);
                                int a7 = tm3Var.a(4) + 1;
                                tm3Var.b(1);
                                if (a6 != 1) {
                                    j2 = a2 * a;
                                } else if (a != 0) {
                                    j2 = (long) Math.floor(Math.pow(a2, 1.0d / a));
                                }
                                tm3Var.b((int) (a7 * j2));
                            }
                            i6++;
                            tm3Var4 = tm3Var;
                            an3Var = an3Var2;
                            k = i;
                            bArr = bArr2;
                            i5 = 5;
                            z2 = true;
                        } else {
                            tm3 tm3Var5 = tm3Var4;
                            throw new cc2("expected code book to start with [0x56, 0x43, 0x42] at " + ((tm3Var5.c * 8) + tm3Var5.d), null, true, 1);
                        }
                    } else {
                        an3 an3Var3 = an3Var;
                        byte[] bArr3 = bArr;
                        boolean z3 = z2;
                        tm3 tm3Var6 = tm3Var4;
                        int i13 = 6;
                        int a8 = tm3Var6.a(6) + (z3 ? 1 : 0);
                        for (int i14 = 0; i14 < a8; i14++) {
                            if (tm3Var6.a(16) != 0) {
                                throw new cc2("placeholder of time domain transforms not zeroed out", null, z3, z3 ? 1 : 0);
                            }
                        }
                        int a9 = tm3Var6.a(6) + (z3 ? 1 : 0);
                        int i15 = 0;
                        ?? r4 = z3;
                        while (true) {
                            int i16 = 3;
                            if (i15 < a9) {
                                int a10 = tm3Var6.a(i7);
                                if (a10 == 0) {
                                    int i17 = 8;
                                    tm3Var6.b(8);
                                    tm3Var6.b(16);
                                    tm3Var6.b(16);
                                    tm3Var6.b(6);
                                    tm3Var6.b(8);
                                    int a11 = tm3Var6.a(4) + r4;
                                    int i18 = 0;
                                    while (i18 < a11) {
                                        tm3Var6.b(i17);
                                        i18++;
                                        i17 = 8;
                                    }
                                } else if (a10 == r4) {
                                    int a12 = tm3Var6.a(5);
                                    int[] iArr = new int[a12];
                                    int i19 = -1;
                                    for (int i20 = 0; i20 < a12; i20++) {
                                        int a13 = tm3Var6.a(4);
                                        iArr[i20] = a13;
                                        if (a13 > i19) {
                                            i19 = a13;
                                        }
                                    }
                                    int i21 = i19 + 1;
                                    int[] iArr2 = new int[i21];
                                    int i22 = 0;
                                    while (i22 < i21) {
                                        iArr2[i22] = tm3Var6.a(i16) + 1;
                                        int a14 = tm3Var6.a(2);
                                        int i23 = 8;
                                        if (a14 > 0) {
                                            tm3Var6.b(8);
                                        }
                                        int i24 = 0;
                                        for (int i25 = 1; i24 < (i25 << a14); i25 = 1) {
                                            tm3Var6.b(i23);
                                            i24++;
                                            i23 = 8;
                                        }
                                        i22++;
                                        i16 = 3;
                                    }
                                    tm3Var6.b(2);
                                    int a15 = tm3Var6.a(4);
                                    int i26 = 0;
                                    int i27 = 0;
                                    for (int i28 = 0; i28 < a12; i28++) {
                                        i26 += iArr2[iArr[i28]];
                                        while (i27 < i26) {
                                            tm3Var6.b(a15);
                                            i27++;
                                        }
                                    }
                                } else {
                                    throw new cc2(gg2.a(a10, "floor type greater than 1 not decodable: "), null, true, 1);
                                }
                                i15++;
                                i13 = 6;
                                r4 = 1;
                                i7 = 16;
                            } else {
                                int i29 = 1;
                                int a16 = tm3Var6.a(i13) + 1;
                                int i30 = 0;
                                while (i30 < a16) {
                                    if (tm3Var6.a(16) <= 2) {
                                        tm3Var6.b(24);
                                        tm3Var6.b(24);
                                        tm3Var6.b(24);
                                        int a17 = tm3Var6.a(i13) + i29;
                                        int i31 = 8;
                                        tm3Var6.b(8);
                                        int[] iArr3 = new int[a17];
                                        for (int i32 = 0; i32 < a17; i32++) {
                                            iArr3[i32] = ((tm3Var6.a() ? tm3Var6.a(5) : 0) * 8) + tm3Var6.a(3);
                                        }
                                        int i33 = 0;
                                        while (i33 < a17) {
                                            int i34 = 0;
                                            while (i34 < i31) {
                                                if ((iArr3[i33] & (1 << i34)) != 0) {
                                                    tm3Var6.b(i31);
                                                }
                                                i34++;
                                                i31 = 8;
                                            }
                                            i33++;
                                            i31 = 8;
                                        }
                                        i30++;
                                        i13 = 6;
                                        i29 = 1;
                                    } else {
                                        throw new cc2("residueType greater than 2 is not decodable", null, true, 1);
                                    }
                                }
                                int a18 = tm3Var6.a(i13) + i29;
                                for (int i35 = 0; i35 < a18; i35++) {
                                    int a19 = tm3Var6.a(16);
                                    if (a19 != 0) {
                                        gh1.b("VorbisUtil", "mapping type other than 0 not supported: " + a19);
                                    } else {
                                        int a20 = tm3Var6.a() ? tm3Var6.a(4) + 1 : 1;
                                        if (tm3Var6.a()) {
                                            int a21 = tm3Var6.a(8) + 1;
                                            for (int i36 = 0; i36 < a21; i36++) {
                                                int i37 = i4 - 1;
                                                int i38 = 0;
                                                for (int i39 = i37; i39 > 0; i39 >>>= 1) {
                                                    i38++;
                                                }
                                                tm3Var6.b(i38);
                                                int i40 = 0;
                                                while (i37 > 0) {
                                                    i40++;
                                                    i37 >>>= 1;
                                                }
                                                tm3Var6.b(i40);
                                            }
                                        }
                                        if (tm3Var6.a(2) != 0) {
                                            throw new cc2("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                        }
                                        if (a20 > 1) {
                                            for (int i41 = 0; i41 < i4; i41++) {
                                                tm3Var6.b(4);
                                            }
                                        }
                                        for (int i42 = 0; i42 < a20; i42++) {
                                            tm3Var6.b(8);
                                            tm3Var6.b(8);
                                            tm3Var6.b(8);
                                        }
                                    }
                                }
                                int a22 = tm3Var6.a(6);
                                int i43 = a22 + 1;
                                bn3[] bn3VarArr = new bn3[i43];
                                for (int i44 = 0; i44 < i43; i44++) {
                                    boolean a23 = tm3Var6.a();
                                    tm3Var6.a(16);
                                    tm3Var6.a(16);
                                    tm3Var6.a(8);
                                    bn3VarArr[i44] = new bn3(a23);
                                }
                                if (tm3Var6.a()) {
                                    int i45 = 0;
                                    while (a22 > 0) {
                                        i45++;
                                        a22 >>>= 1;
                                    }
                                    ym3Var = new ym3(cn3Var, an3Var3, bArr3, bn3VarArr, i45);
                                } else {
                                    throw new cc2("framing bit after modes not set as expected", null, true, 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        ym3Var = null;
        this.n = ym3Var;
        if (ym3Var == null) {
            return true;
        }
        cn3 cn3Var2 = ym3Var.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cn3Var2.g);
        arrayList.add(ym3Var.c);
        ht1 a24 = dn3.a(l41.b(ym3Var.b.a));
        iw0 iw0Var = new iw0();
        iw0Var.k = "audio/vorbis";
        iw0Var.f = cn3Var2.d;
        iw0Var.g = cn3Var2.c;
        iw0Var.x = cn3Var2.a;
        iw0Var.y = cn3Var2.b;
        iw0Var.m = arrayList;
        iw0Var.i = a24;
        i43Var.a = new jw0(iw0Var);
        return true;
    }

    @Override // yads.k43
    public final long a(xb2 xb2Var) {
        int i;
        byte[] bArr = xb2Var.a;
        byte b = bArr[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        ym3 ym3Var = this.n;
        if (ym3Var != null) {
            if (!ym3Var.d[(b >> 1) & (255 >>> (8 - ym3Var.e))].a) {
                i = ym3Var.a.e;
            } else {
                i = ym3Var.a.f;
            }
            long j = this.p ? (this.o + i) / 4 : 0;
            int length = bArr.length;
            int i2 = xb2Var.c + 4;
            if (length < i2) {
                xb2Var.a(Arrays.copyOf(bArr, i2));
            } else {
                xb2Var.d(i2);
            }
            byte[] bArr2 = xb2Var.a;
            int i3 = xb2Var.c;
            bArr2[i3 - 4] = (byte) (j & 255);
            bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
            bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
            bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
            this.p = true;
            this.o = i;
            return j;
        }
        throw new IllegalStateException();
    }

    @Override // yads.k43
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        cn3 cn3Var = this.q;
        this.o = cn3Var != null ? cn3Var.e : 0;
    }
}
