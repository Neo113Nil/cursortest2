package s;

import java.util.ArrayList;
import q.C0287b;
import q.C0288c;
import q.C0291f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f3749a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0283, code lost:
    
        if (r2.d == r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        if (r4.d == r13) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0707 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C0299e c0299e, C0288c c0288c, ArrayList arrayList, int i) {
        int i2;
        C0296b[] c0296bArr;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        float f2;
        C0298d c0298d;
        boolean z4;
        boolean z5;
        C0297c[] c0297cArr;
        int i5;
        C0296b[] c0296bArr2;
        ArrayList arrayList2;
        C0298d c0298d2;
        int i6;
        C0298d c0298d3;
        int i7;
        C0297c c0297c;
        C0297c c0297c2;
        int i8;
        C0298d c0298d4;
        int i9;
        int i10;
        C0298d c0298d5;
        C0291f c0291f;
        C0291f c0291f2;
        C0297c c0297c3;
        C0297c c0297c4;
        C0291f c0291f3;
        C0298d c0298d6;
        C0298d c0298d7;
        C0298d c0298d8;
        C0297c c0297c5;
        C0298d c0298d9;
        int i11;
        C0297c[] c0297cArr2;
        C0297c c0297c6;
        C0291f c0291f4;
        C0291f c0291f5;
        int size;
        int i12;
        ArrayList arrayList3;
        int i13;
        float f3;
        C0298d c0298d10;
        boolean z6;
        C0298d c0298d11;
        C0296b c0296b;
        C0298d c0298d12;
        C0298d c0298d13;
        int i14;
        int i15;
        C0298d c0298d14;
        C0297c c0297c7;
        C0298d c0298d15;
        C0299e c0299e2 = c0299e;
        ArrayList arrayList4 = arrayList;
        int i16 = 2;
        if (i == 0) {
            i2 = c0299e2.f3692z0;
            c0296bArr = c0299e2.C0;
            i3 = 0;
        } else {
            i2 = c0299e2.f3673A0;
            c0296bArr = c0299e2.f3674B0;
            i3 = 2;
        }
        int i17 = 0;
        while (i17 < i2) {
            C0296b c0296b2 = c0296bArr[i17];
            boolean z7 = c0296b2.f3603q;
            C0298d c0298d16 = c0296b2.f3590a;
            int i18 = 3;
            int i19 = 1;
            int i20 = 8;
            if (z7) {
                i4 = i17;
                z2 = true;
            } else {
                int i21 = c0296b2.f3598l;
                int i22 = i21 * 2;
                C0298d c0298d17 = c0298d16;
                C0298d c0298d18 = c0298d17;
                boolean z8 = false;
                while (!z8) {
                    c0296b2.i += i19;
                    c0298d17.f3656m0[i21] = null;
                    c0298d17.f3654l0[i21] = null;
                    int i23 = c0298d17.f3647g0;
                    C0297c[] c0297cArr3 = c0298d17.f3625Q;
                    if (i23 != i20) {
                        c0298d17.j(i21);
                        c0297cArr3[i22].e();
                        int i24 = i22 + 1;
                        c0297cArr3[i24].e();
                        c0297cArr3[i22].e();
                        c0297cArr3[i24].e();
                        if (c0296b2.f3591b == null) {
                            c0296b2.f3591b = c0298d17;
                        }
                        c0296b2.d = c0298d17;
                        int i25 = c0298d17.f3662p0[i21];
                        if (i25 == i18) {
                            int i26 = c0298d17.f3666t[i21];
                            if (i26 == 0 || i26 == i18 || i26 == i16) {
                                c0296b2.f3596j++;
                                float f4 = c0298d17.f3652k0[i21];
                                if (f4 > 0.0f) {
                                    c0296b2.f3597k += f4;
                                }
                                i15 = i17;
                                if (c0298d17.f3647g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0296b2.f3600n = true;
                                    } else {
                                        c0296b2.f3601o = true;
                                    }
                                    if (c0296b2.h == null) {
                                        c0296b2.h = new ArrayList();
                                    }
                                    c0296b2.h.add(c0298d17);
                                }
                                if (c0296b2.f3594f == null) {
                                    c0296b2.f3594f = c0298d17;
                                }
                                C0298d c0298d19 = c0296b2.f3595g;
                                if (c0298d19 != null) {
                                    c0298d19.f3654l0[i21] = c0298d17;
                                }
                                c0296b2.f3595g = c0298d17;
                            } else {
                                i15 = i17;
                            }
                            if (i21 == 0) {
                                if (c0298d17.f3664r == 0 && c0298d17.f3667u == 0) {
                                    int i27 = c0298d17.f3668v;
                                }
                            } else if (c0298d17.f3665s == 0 && c0298d17.f3670x == 0) {
                                int i28 = c0298d17.f3671y;
                            }
                            c0298d14 = c0298d18;
                            if (c0298d14 != c0298d17) {
                                c0298d14.f3656m0[i21] = c0298d17;
                            }
                            c0297c7 = c0297cArr3[i22 + 1].f3608f;
                            if (c0297c7 != null) {
                                c0298d15 = c0297c7.d;
                                C0297c c0297c8 = c0298d15.f3625Q[i22].f3608f;
                                if (c0297c8 != null) {
                                }
                            }
                            c0298d15 = null;
                            if (c0298d15 != null) {
                                c0298d15 = c0298d17;
                                z8 = true;
                            }
                            c0298d18 = c0298d17;
                            i17 = i15;
                            i19 = 1;
                            i20 = 8;
                            i16 = 2;
                            c0298d17 = c0298d15;
                            i18 = 3;
                        }
                    }
                    i15 = i17;
                    c0298d14 = c0298d18;
                    if (c0298d14 != c0298d17) {
                    }
                    c0297c7 = c0297cArr3[i22 + 1].f3608f;
                    if (c0297c7 != null) {
                    }
                    c0298d15 = null;
                    if (c0298d15 != null) {
                    }
                    c0298d18 = c0298d17;
                    i17 = i15;
                    i19 = 1;
                    i20 = 8;
                    i16 = 2;
                    c0298d17 = c0298d15;
                    i18 = 3;
                }
                i4 = i17;
                C0298d c0298d20 = c0296b2.f3591b;
                if (c0298d20 != null) {
                    c0298d20.f3625Q[i22].e();
                }
                C0298d c0298d21 = c0296b2.d;
                if (c0298d21 != null) {
                    c0298d21.f3625Q[i22 + 1].e();
                }
                c0296b2.f3592c = c0298d17;
                if (i21 == 0 && c0296b2.f3599m) {
                    c0296b2.f3593e = c0298d17;
                } else {
                    c0296b2.f3593e = c0298d16;
                }
                c0296b2.f3602p = c0296b2.f3601o && c0296b2.f3600n;
                z2 = true;
            }
            c0296b2.f3603q = z2;
            if (arrayList4 == null || arrayList4.contains(c0298d16)) {
                C0298d c0298d22 = c0296b2.f3592c;
                C0298d c0298d23 = c0296b2.f3591b;
                C0298d c0298d24 = c0296b2.d;
                C0298d c0298d25 = c0296b2.f3593e;
                float f5 = c0296b2.f3597k;
                boolean z9 = c0299e2.f3662p0[i] == 2;
                if (i == 0) {
                    int i29 = c0298d25.f3649i0;
                    boolean z10 = i29 == 0;
                    z5 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    c0298d = c0298d16;
                    z4 = z10;
                } else {
                    int i30 = c0298d25.j0;
                    boolean z11 = i30 == 0;
                    boolean z12 = i30 == 1;
                    z3 = i30 == 2;
                    f2 = f5;
                    c0298d = c0298d16;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    c0297cArr = c0299e2.f3625Q;
                    if (z13) {
                        break;
                    }
                    C0297c c0297c9 = c0298d.f3625Q[i3];
                    int i31 = z3 ? 1 : 4;
                    int e2 = c0297c9.e();
                    boolean z14 = z13;
                    int[] iArr = c0298d.f3662p0;
                    int i32 = i2;
                    C0296b[] c0296bArr3 = c0296bArr;
                    boolean z15 = iArr[i] == 3 && c0298d.f3666t[i] == 0;
                    C0297c c0297c10 = c0297c9.f3608f;
                    if (c0297c10 != null && c0298d != c0298d16) {
                        e2 = c0297c10.e() + e2;
                    }
                    int i33 = e2;
                    if (!z3 || c0298d == c0298d16 || c0298d == c0298d23) {
                        c0298d11 = c0298d25;
                    } else {
                        c0298d11 = c0298d25;
                        i31 = 8;
                    }
                    C0297c c0297c11 = c0297c9.f3608f;
                    if (c0297c11 != null) {
                        if (c0298d == c0298d23) {
                            c0298d12 = c0298d16;
                            c0296b = c0296b2;
                            c0288c.f(c0297c9.i, c0297c11.i, i33, 6);
                        } else {
                            c0296b = c0296b2;
                            c0298d12 = c0298d16;
                            c0288c.f(c0297c9.i, c0297c11.i, i33, 8);
                        }
                        if (z15 && !z3) {
                            i31 = 5;
                        }
                        c0288c.e(c0297c9.i, c0297c9.f3608f.i, i33, (c0298d == c0298d23 && z3 && c0298d.f3627S[i]) ? 5 : i31);
                    } else {
                        c0296b = c0296b2;
                        c0298d12 = c0298d16;
                    }
                    C0297c[] c0297cArr4 = c0298d.f3625Q;
                    if (z9) {
                        if (c0298d.f3647g0 == 8 || iArr[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            c0288c.f(c0297cArr4[i3 + 1].i, c0297cArr4[i3].i, 0, 5);
                        }
                        c0288c.f(c0297cArr4[i3].i, c0297cArr[i3].i, i14, 8);
                    }
                    C0297c c0297c12 = c0297cArr4[i3 + 1].f3608f;
                    if (c0297c12 != null) {
                        c0298d13 = c0297c12.d;
                        C0297c c0297c13 = c0298d13.f3625Q[i3].f3608f;
                        if (c0297c13 != null) {
                        }
                    }
                    c0298d13 = null;
                    if (c0298d13 != null) {
                        c0298d = c0298d13;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    c0298d25 = c0298d11;
                    i2 = i32;
                    c0296bArr = c0296bArr3;
                    c0298d16 = c0298d12;
                    c0296b2 = c0296b;
                }
                C0296b c0296b3 = c0296b2;
                C0298d c0298d26 = c0298d25;
                C0298d c0298d27 = c0298d16;
                i5 = i2;
                c0296bArr2 = c0296bArr;
                if (c0298d24 != null) {
                    int i34 = i3 + 1;
                    if (c0298d22.f3625Q[i34].f3608f != null) {
                        C0297c c0297c14 = c0298d24.f3625Q[i34];
                        if (c0298d24.f3662p0[i] == 3 && c0298d24.f3666t[i] == 0 && !z3) {
                            C0297c c0297c15 = c0297c14.f3608f;
                            if (c0297c15.d == c0299e2) {
                                c0288c.e(c0297c14.i, c0297c15.i, -c0297c14.e(), 5);
                                c0288c.g(c0297c14.i, c0298d22.f3625Q[i34].f3608f.i, -c0297c14.e(), 6);
                                if (z9) {
                                    int i35 = i3 + 1;
                                    C0291f c0291f6 = c0297cArr[i35].i;
                                    C0297c c0297c16 = c0298d22.f3625Q[i35];
                                    c0288c.f(c0291f6, c0297c16.i, c0297c16.e(), 8);
                                }
                                arrayList2 = c0296b3.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f6 = (c0296b3.f3600n || c0296b3.f3602p) ? f2 : c0296b3.f3596j;
                                    C0298d c0298d28 = null;
                                    float f7 = 0.0f;
                                    i12 = 0;
                                    while (i12 < size) {
                                        C0298d c0298d29 = (C0298d) arrayList2.get(i12);
                                        float f8 = c0298d29.f3652k0[i];
                                        C0297c[] c0297cArr5 = c0298d29.f3625Q;
                                        if (f8 < 0.0f) {
                                            if (c0296b3.f3602p) {
                                                C0291f c0291f7 = c0297cArr5[i3 + 1].i;
                                                C0291f c0291f8 = c0297cArr5[i3].i;
                                                z6 = false;
                                                c0288c.e(c0291f7, c0291f8, 0, 4);
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                i12++;
                                                size = i13;
                                                arrayList2 = arrayList3;
                                            } else {
                                                f8 = 1.0f;
                                            }
                                        }
                                        if (f8 == 0.0f) {
                                            C0291f c0291f9 = c0297cArr5[i3 + 1].i;
                                            C0291f c0291f10 = c0297cArr5[i3].i;
                                            z6 = false;
                                            c0288c.e(c0291f9, c0291f10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i13 = size;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (c0298d28 != null) {
                                                C0297c[] c0297cArr6 = c0298d28.f3625Q;
                                                C0291f c0291f11 = c0297cArr6[i3].i;
                                                int i36 = i3 + 1;
                                                C0291f c0291f12 = c0297cArr6[i36].i;
                                                arrayList3 = arrayList2;
                                                C0291f c0291f13 = c0297cArr5[i3].i;
                                                C0291f c0291f14 = c0297cArr5[i36].i;
                                                i13 = size;
                                                C0287b l2 = c0288c.l();
                                                c0298d10 = c0298d29;
                                                l2.f3516b = 0.0f;
                                                if (f6 == 0.0f || f7 == f8) {
                                                    f3 = f8;
                                                    l2.d.g(c0291f11, 1.0f);
                                                    l2.d.g(c0291f12, -1.0f);
                                                    l2.d.g(c0291f14, 1.0f);
                                                    l2.d.g(c0291f13, -1.0f);
                                                } else {
                                                    if (f7 == 0.0f) {
                                                        l2.d.g(c0291f11, 1.0f);
                                                        l2.d.g(c0291f12, -1.0f);
                                                    } else if (f8 == 0.0f) {
                                                        l2.d.g(c0291f13, 1.0f);
                                                        l2.d.g(c0291f14, -1.0f);
                                                    } else {
                                                        float f9 = (f7 / f6) / (f8 / f6);
                                                        f3 = f8;
                                                        l2.d.g(c0291f11, 1.0f);
                                                        l2.d.g(c0291f12, -1.0f);
                                                        l2.d.g(c0291f14, f9);
                                                        l2.d.g(c0291f13, -f9);
                                                    }
                                                    f3 = f8;
                                                }
                                                c0288c.c(l2);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                f3 = f8;
                                                c0298d10 = c0298d29;
                                            }
                                            f7 = f3;
                                            c0298d28 = c0298d10;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (c0298d23 == null && (c0298d23 == c0298d24 || z3)) {
                                    C0297c c0297c17 = c0298d27.f3625Q[i3];
                                    int i37 = i3 + 1;
                                    C0297c c0297c18 = c0298d22.f3625Q[i37];
                                    C0297c c0297c19 = c0297c17.f3608f;
                                    C0291f c0291f15 = c0297c19 != null ? c0297c19.i : null;
                                    C0297c c0297c20 = c0297c18.f3608f;
                                    C0291f c0291f16 = c0297c20 != null ? c0297c20.i : null;
                                    C0297c c0297c21 = c0298d23.f3625Q[i3];
                                    if (c0298d24 != null) {
                                        c0297c18 = c0298d24.f3625Q[i37];
                                    }
                                    if (c0291f15 == null || c0291f16 == null) {
                                        c0298d2 = c0298d24;
                                        i6 = i4;
                                    } else {
                                        c0298d2 = c0298d24;
                                        i6 = i4;
                                        c0288c.b(c0297c21.i, c0291f15, c0297c21.e(), i == 0 ? c0298d26.f3641d0 : c0298d26.f3643e0, c0291f16, c0297c18.i, c0297c18.e(), 7);
                                    }
                                } else {
                                    c0298d2 = c0298d24;
                                    i6 = i4;
                                    if (z4 || c0298d23 == null) {
                                        int i38 = 8;
                                        if (z5 && c0298d23 != null) {
                                            int i39 = c0296b3.f3596j;
                                            boolean z16 = i39 <= 0 && c0296b3.i == i39;
                                            C0298d c0298d30 = c0298d23;
                                            c0298d3 = c0298d30;
                                            while (c0298d3 != null) {
                                                C0298d c0298d31 = c0298d3.f3656m0[i];
                                                while (c0298d31 != null && c0298d31.f3647g0 == i38) {
                                                    c0298d31 = c0298d31.f3656m0[i];
                                                }
                                                if (c0298d3 == c0298d23 || c0298d3 == c0298d2 || c0298d31 == null) {
                                                    c0298d4 = c0298d30;
                                                    i9 = i6;
                                                    i10 = i38;
                                                } else {
                                                    C0298d c0298d32 = c0298d31 == c0298d2 ? null : c0298d31;
                                                    C0297c[] c0297cArr7 = c0298d3.f3625Q;
                                                    C0297c c0297c22 = c0297cArr7[i3];
                                                    C0291f c0291f17 = c0297c22.i;
                                                    int i40 = i3 + 1;
                                                    C0291f c0291f18 = c0298d30.f3625Q[i40].i;
                                                    int e3 = c0297c22.e();
                                                    int e4 = c0297cArr7[i40].e();
                                                    if (c0298d32 != null) {
                                                        c0297c3 = c0298d32.f3625Q[i3];
                                                        c0291f = c0297c3.i;
                                                        c0298d5 = c0298d32;
                                                        C0297c c0297c23 = c0297c3.f3608f;
                                                        c0291f2 = c0297c23 != null ? c0297c23.i : null;
                                                    } else {
                                                        c0298d5 = c0298d32;
                                                        C0297c c0297c24 = c0298d2.f3625Q[i3];
                                                        c0291f = c0297c24 != null ? c0297c24.i : null;
                                                        c0291f2 = c0297cArr7[i40].i;
                                                        c0297c3 = c0297c24;
                                                    }
                                                    int e5 = c0297c3 != null ? c0297c3.e() + e4 : e4;
                                                    int e6 = c0298d30.f3625Q[i40].e() + e3;
                                                    int i41 = z16 ? 8 : 4;
                                                    if (c0291f17 == null || c0291f18 == null || c0291f == null || c0291f2 == null) {
                                                        c0298d4 = c0298d30;
                                                        i9 = i6;
                                                        i10 = 8;
                                                    } else {
                                                        c0298d4 = c0298d30;
                                                        int i42 = e5;
                                                        i9 = i6;
                                                        i10 = 8;
                                                        c0288c.b(c0291f17, c0291f18, e6, 0.5f, c0291f, c0291f2, i42, i41);
                                                    }
                                                    c0298d31 = c0298d5;
                                                }
                                                c0298d30 = c0298d3.f3647g0 != i10 ? c0298d3 : c0298d4;
                                                c0298d3 = c0298d31;
                                                i38 = i10;
                                                i6 = i9;
                                            }
                                            i7 = i6;
                                            C0297c c0297c25 = c0298d23.f3625Q[i3];
                                            c0297c = c0298d27.f3625Q[i3].f3608f;
                                            int i43 = i3 + 1;
                                            C0297c c0297c26 = c0298d2.f3625Q[i43];
                                            c0297c2 = c0298d22.f3625Q[i43].f3608f;
                                            if (c0297c != null) {
                                                if (c0298d23 != c0298d2) {
                                                    c0288c.e(c0297c25.i, c0297c.i, c0297c25.e(), 5);
                                                } else if (c0297c2 != null) {
                                                    i8 = 5;
                                                    c0288c.b(c0297c25.i, c0297c.i, c0297c25.e(), 0.5f, c0297c26.i, c0297c2.i, c0297c26.e(), 5);
                                                    if (c0297c2 != null && c0298d23 != c0298d2) {
                                                        c0288c.e(c0297c26.i, c0297c2.i, -c0297c26.e(), i8);
                                                    }
                                                    if ((!z4 || z5) && c0298d23 != null && c0298d23 != c0298d2) {
                                                        C0297c[] c0297cArr8 = c0298d23.f3625Q;
                                                        c0297c5 = c0297cArr8[i3];
                                                        c0298d9 = c0298d2 != null ? c0298d23 : c0298d2;
                                                        i11 = i3 + 1;
                                                        c0297cArr2 = c0298d9.f3625Q;
                                                        c0297c6 = c0297cArr2[i11];
                                                        C0297c c0297c27 = c0297c5.f3608f;
                                                        c0291f4 = c0297c27 == null ? c0297c27.i : null;
                                                        C0297c c0297c28 = c0297c6.f3608f;
                                                        c0291f5 = c0297c28 == null ? c0297c28.i : null;
                                                        if (c0298d22 != c0298d9) {
                                                            C0297c c0297c29 = c0298d22.f3625Q[i11].f3608f;
                                                            c0291f5 = c0297c29 != null ? c0297c29.i : null;
                                                        }
                                                        if (c0298d23 == c0298d9) {
                                                            c0297c6 = c0297cArr8[i11];
                                                        }
                                                        if (c0291f4 != null && c0291f5 != null) {
                                                            c0288c.b(c0297c5.i, c0291f4, c0297c5.e(), 0.5f, c0291f5, c0297c6.i, c0297cArr2[i11].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            if (c0297c2 != null) {
                                                c0288c.e(c0297c26.i, c0297c2.i, -c0297c26.e(), i8);
                                            }
                                            if (!z4) {
                                            }
                                            C0297c[] c0297cArr82 = c0298d23.f3625Q;
                                            c0297c5 = c0297cArr82[i3];
                                            if (c0298d2 != null) {
                                            }
                                            i11 = i3 + 1;
                                            c0297cArr2 = c0298d9.f3625Q;
                                            c0297c6 = c0297cArr2[i11];
                                            C0297c c0297c272 = c0297c5.f3608f;
                                            if (c0297c272 == null) {
                                            }
                                            C0297c c0297c282 = c0297c6.f3608f;
                                            if (c0297c282 == null) {
                                            }
                                            if (c0298d22 != c0298d9) {
                                            }
                                            if (c0298d23 == c0298d9) {
                                            }
                                            if (c0291f4 != null) {
                                                c0288c.b(c0297c5.i, c0291f4, c0297c5.e(), 0.5f, c0291f5, c0297c6.i, c0297cArr2[i11].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i44 = c0296b3.f3596j;
                                        boolean z17 = i44 > 0 && c0296b3.i == i44;
                                        C0298d c0298d33 = c0298d23;
                                        for (C0298d c0298d34 = c0298d33; c0298d34 != null; c0298d34 = c0298d7) {
                                            C0298d c0298d35 = c0298d34.f3656m0[i];
                                            while (c0298d35 != null && c0298d35.f3647g0 == 8) {
                                                c0298d35 = c0298d35.f3656m0[i];
                                            }
                                            if (c0298d35 != null || c0298d34 == c0298d2) {
                                                C0297c[] c0297cArr9 = c0298d34.f3625Q;
                                                C0297c c0297c30 = c0297cArr9[i3];
                                                C0291f c0291f19 = c0297c30.i;
                                                C0297c c0297c31 = c0297c30.f3608f;
                                                C0291f c0291f20 = c0297c31 != null ? c0297c31.i : null;
                                                if (c0298d33 != c0298d34) {
                                                    c0291f20 = c0298d33.f3625Q[i3 + 1].i;
                                                } else if (c0298d34 == c0298d23) {
                                                    C0297c c0297c32 = c0298d27.f3625Q[i3].f3608f;
                                                    c0291f20 = c0297c32 != null ? c0297c32.i : null;
                                                }
                                                int e7 = c0297c30.e();
                                                int i45 = i3 + 1;
                                                int e8 = c0297cArr9[i45].e();
                                                if (c0298d35 != null) {
                                                    c0297c4 = c0298d35.f3625Q[i3];
                                                    c0291f3 = c0297c4.i;
                                                } else {
                                                    c0297c4 = c0298d22.f3625Q[i45].f3608f;
                                                    c0291f3 = c0297c4 != null ? c0297c4.i : null;
                                                }
                                                C0291f c0291f21 = c0297cArr9[i45].i;
                                                if (c0297c4 != null) {
                                                    e8 = c0297c4.e() + e8;
                                                }
                                                int e9 = c0298d33.f3625Q[i45].e() + e7;
                                                if (c0291f19 != null && c0291f20 != null && c0291f3 != null && c0291f21 != null) {
                                                    if (c0298d34 == c0298d23) {
                                                        e9 = c0298d23.f3625Q[i3].e();
                                                    }
                                                    if (c0298d34 == c0298d2) {
                                                        e8 = c0298d2.f3625Q[i45].e();
                                                    }
                                                    C0291f c0291f22 = c0291f20;
                                                    int i46 = e9;
                                                    C0291f c0291f23 = c0291f3;
                                                    c0298d6 = c0298d33;
                                                    int i47 = e8;
                                                    c0298d7 = c0298d35;
                                                    c0298d8 = c0298d34;
                                                    c0288c.b(c0291f19, c0291f22, i46, 0.5f, c0291f23, c0291f21, i47, z17 ? 8 : 5);
                                                    c0298d33 = c0298d8.f3647g0 == 8 ? c0298d8 : c0298d6;
                                                }
                                            }
                                            c0298d7 = c0298d35;
                                            c0298d6 = c0298d33;
                                            c0298d8 = c0298d34;
                                            if (c0298d8.f3647g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i7 = i6;
                                if (!z4) {
                                }
                                C0297c[] c0297cArr822 = c0298d23.f3625Q;
                                c0297c5 = c0297cArr822[i3];
                                if (c0298d2 != null) {
                                }
                                i11 = i3 + 1;
                                c0297cArr2 = c0298d9.f3625Q;
                                c0297c6 = c0297cArr2[i11];
                                C0297c c0297c2722 = c0297c5.f3608f;
                                if (c0297c2722 == null) {
                                }
                                C0297c c0297c2822 = c0297c6.f3608f;
                                if (c0297c2822 == null) {
                                }
                                if (c0298d22 != c0298d9) {
                                }
                                if (c0298d23 == c0298d9) {
                                }
                                if (c0291f4 != null) {
                                }
                            }
                        }
                        if (z3) {
                            C0297c c0297c33 = c0297c14.f3608f;
                            if (c0297c33.d == c0299e2) {
                                c0288c.e(c0297c14.i, c0297c33.i, -c0297c14.e(), 4);
                            }
                        }
                        c0288c.g(c0297c14.i, c0298d22.f3625Q[i34].f3608f.i, -c0297c14.e(), 6);
                        if (z9) {
                        }
                        arrayList2 = c0296b3.h;
                        if (arrayList2 != null) {
                            if (c0296b3.f3600n) {
                            }
                            C0298d c0298d282 = null;
                            float f72 = 0.0f;
                            i12 = 0;
                            while (i12 < size) {
                            }
                        }
                        if (c0298d23 == null) {
                        }
                        c0298d2 = c0298d24;
                        i6 = i4;
                        if (z4) {
                        }
                        int i382 = 8;
                        if (z5) {
                            int i392 = c0296b3.f3596j;
                            if (i392 <= 0) {
                            }
                            C0298d c0298d302 = c0298d23;
                            c0298d3 = c0298d302;
                            while (c0298d3 != null) {
                            }
                            i7 = i6;
                            C0297c c0297c252 = c0298d23.f3625Q[i3];
                            c0297c = c0298d27.f3625Q[i3].f3608f;
                            int i432 = i3 + 1;
                            C0297c c0297c262 = c0298d2.f3625Q[i432];
                            c0297c2 = c0298d22.f3625Q[i432].f3608f;
                            if (c0297c != null) {
                            }
                            i8 = 5;
                            if (c0297c2 != null) {
                            }
                            if (!z4) {
                            }
                            C0297c[] c0297cArr8222 = c0298d23.f3625Q;
                            c0297c5 = c0297cArr8222[i3];
                            if (c0298d2 != null) {
                            }
                            i11 = i3 + 1;
                            c0297cArr2 = c0298d9.f3625Q;
                            c0297c6 = c0297cArr2[i11];
                            C0297c c0297c27222 = c0297c5.f3608f;
                            if (c0297c27222 == null) {
                            }
                            C0297c c0297c28222 = c0297c6.f3608f;
                            if (c0297c28222 == null) {
                            }
                            if (c0298d22 != c0298d9) {
                            }
                            if (c0298d23 == c0298d9) {
                            }
                            if (c0291f4 != null) {
                            }
                        }
                        i7 = i6;
                        if (!z4) {
                        }
                        C0297c[] c0297cArr82222 = c0298d23.f3625Q;
                        c0297c5 = c0297cArr82222[i3];
                        if (c0298d2 != null) {
                        }
                        i11 = i3 + 1;
                        c0297cArr2 = c0298d9.f3625Q;
                        c0297c6 = c0297cArr2[i11];
                        C0297c c0297c272222 = c0297c5.f3608f;
                        if (c0297c272222 == null) {
                        }
                        C0297c c0297c282222 = c0297c6.f3608f;
                        if (c0297c282222 == null) {
                        }
                        if (c0298d22 != c0298d9) {
                        }
                        if (c0298d23 == c0298d9) {
                        }
                        if (c0291f4 != null) {
                        }
                    }
                }
                if (z9) {
                }
                arrayList2 = c0296b3.h;
                if (arrayList2 != null) {
                }
                if (c0298d23 == null) {
                }
                c0298d2 = c0298d24;
                i6 = i4;
                if (z4) {
                }
                int i3822 = 8;
                if (z5) {
                }
                i7 = i6;
                if (!z4) {
                }
                C0297c[] c0297cArr822222 = c0298d23.f3625Q;
                c0297c5 = c0297cArr822222[i3];
                if (c0298d2 != null) {
                }
                i11 = i3 + 1;
                c0297cArr2 = c0298d9.f3625Q;
                c0297c6 = c0297cArr2[i11];
                C0297c c0297c2722222 = c0297c5.f3608f;
                if (c0297c2722222 == null) {
                }
                C0297c c0297c2822222 = c0297c6.f3608f;
                if (c0297c2822222 == null) {
                }
                if (c0298d22 != c0298d9) {
                }
                if (c0298d23 == c0298d9) {
                }
                if (c0291f4 != null) {
                }
            } else {
                i5 = i2;
                c0296bArr2 = c0296bArr;
                i7 = i4;
            }
            i17 = i7 + 1;
            i16 = 2;
            c0299e2 = c0299e;
            arrayList4 = arrayList;
            i2 = i5;
            c0296bArr = c0296bArr2;
        }
    }

    public static void b(C0299e c0299e, C0288c c0288c, C0298d c0298d) {
        c0298d.f3659o = -1;
        c0298d.f3661p = -1;
        int i = c0299e.f3662p0[0];
        int[] iArr = c0298d.f3662p0;
        if (i != 2 && iArr[0] == 4) {
            C0297c c0297c = c0298d.f3617I;
            int i2 = c0297c.f3609g;
            int q2 = c0299e.q();
            C0297c c0297c2 = c0298d.f3619K;
            int i3 = q2 - c0297c2.f3609g;
            c0297c.i = c0288c.k(c0297c);
            c0297c2.i = c0288c.k(c0297c2);
            c0288c.d(c0297c.i, i2);
            c0288c.d(c0297c2.i, i3);
            c0298d.f3659o = 2;
            c0298d.f3633Y = i2;
            int i4 = i3 - i2;
            c0298d.f3629U = i4;
            int i5 = c0298d.f3638b0;
            if (i4 < i5) {
                c0298d.f3629U = i5;
            }
        }
        if (c0299e.f3662p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0297c c0297c3 = c0298d.f3618J;
        int i6 = c0297c3.f3609g;
        int k2 = c0299e.k();
        C0297c c0297c4 = c0298d.f3620L;
        int i7 = k2 - c0297c4.f3609g;
        c0297c3.i = c0288c.k(c0297c3);
        c0297c4.i = c0288c.k(c0297c4);
        c0288c.d(c0297c3.i, i6);
        c0288c.d(c0297c4.i, i7);
        if (c0298d.f3636a0 > 0 || c0298d.f3647g0 == 8) {
            C0297c c0297c5 = c0298d.f3621M;
            C0291f k3 = c0288c.k(c0297c5);
            c0297c5.i = k3;
            c0288c.d(k3, c0298d.f3636a0 + i6);
        }
        c0298d.f3661p = 2;
        c0298d.f3634Z = i6;
        int i8 = i7 - i6;
        c0298d.f3630V = i8;
        int i9 = c0298d.f3640c0;
        if (i8 < i9) {
            c0298d.f3630V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
