package s;

import java.util.ArrayList;
import q.C0288b;
import q.C0289c;
import q.C0292f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f3755a = new boolean[3];

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
    public static void a(C0300e c0300e, C0289c c0289c, ArrayList arrayList, int i) {
        int i2;
        C0297b[] c0297bArr;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        float f2;
        C0299d c0299d;
        boolean z4;
        boolean z5;
        C0298c[] c0298cArr;
        int i5;
        C0297b[] c0297bArr2;
        ArrayList arrayList2;
        C0299d c0299d2;
        int i6;
        C0299d c0299d3;
        int i7;
        C0298c c0298c;
        C0298c c0298c2;
        int i8;
        C0299d c0299d4;
        int i9;
        int i10;
        C0299d c0299d5;
        C0292f c0292f;
        C0292f c0292f2;
        C0298c c0298c3;
        C0298c c0298c4;
        C0292f c0292f3;
        C0299d c0299d6;
        C0299d c0299d7;
        C0299d c0299d8;
        C0298c c0298c5;
        C0299d c0299d9;
        int i11;
        C0298c[] c0298cArr2;
        C0298c c0298c6;
        C0292f c0292f4;
        C0292f c0292f5;
        int size;
        int i12;
        ArrayList arrayList3;
        int i13;
        float f3;
        C0299d c0299d10;
        boolean z6;
        C0299d c0299d11;
        C0297b c0297b;
        C0299d c0299d12;
        C0299d c0299d13;
        int i14;
        int i15;
        C0299d c0299d14;
        C0298c c0298c7;
        C0299d c0299d15;
        C0300e c0300e2 = c0300e;
        ArrayList arrayList4 = arrayList;
        int i16 = 2;
        if (i == 0) {
            i2 = c0300e2.f3698z0;
            c0297bArr = c0300e2.C0;
            i3 = 0;
        } else {
            i2 = c0300e2.f3679A0;
            c0297bArr = c0300e2.f3680B0;
            i3 = 2;
        }
        int i17 = 0;
        while (i17 < i2) {
            C0297b c0297b2 = c0297bArr[i17];
            boolean z7 = c0297b2.f3609q;
            C0299d c0299d16 = c0297b2.f3596a;
            int i18 = 3;
            int i19 = 1;
            int i20 = 8;
            if (z7) {
                i4 = i17;
                z2 = true;
            } else {
                int i21 = c0297b2.f3604l;
                int i22 = i21 * 2;
                C0299d c0299d17 = c0299d16;
                C0299d c0299d18 = c0299d17;
                boolean z8 = false;
                while (!z8) {
                    c0297b2.i += i19;
                    c0299d17.f3662m0[i21] = null;
                    c0299d17.f3660l0[i21] = null;
                    int i23 = c0299d17.f3653g0;
                    C0298c[] c0298cArr3 = c0299d17.f3631Q;
                    if (i23 != i20) {
                        c0299d17.j(i21);
                        c0298cArr3[i22].e();
                        int i24 = i22 + 1;
                        c0298cArr3[i24].e();
                        c0298cArr3[i22].e();
                        c0298cArr3[i24].e();
                        if (c0297b2.f3597b == null) {
                            c0297b2.f3597b = c0299d17;
                        }
                        c0297b2.d = c0299d17;
                        int i25 = c0299d17.f3668p0[i21];
                        if (i25 == i18) {
                            int i26 = c0299d17.f3672t[i21];
                            if (i26 == 0 || i26 == i18 || i26 == i16) {
                                c0297b2.f3602j++;
                                float f4 = c0299d17.f3658k0[i21];
                                if (f4 > 0.0f) {
                                    c0297b2.f3603k += f4;
                                }
                                i15 = i17;
                                if (c0299d17.f3653g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0297b2.f3606n = true;
                                    } else {
                                        c0297b2.f3607o = true;
                                    }
                                    if (c0297b2.h == null) {
                                        c0297b2.h = new ArrayList();
                                    }
                                    c0297b2.h.add(c0299d17);
                                }
                                if (c0297b2.f3600f == null) {
                                    c0297b2.f3600f = c0299d17;
                                }
                                C0299d c0299d19 = c0297b2.f3601g;
                                if (c0299d19 != null) {
                                    c0299d19.f3660l0[i21] = c0299d17;
                                }
                                c0297b2.f3601g = c0299d17;
                            } else {
                                i15 = i17;
                            }
                            if (i21 == 0) {
                                if (c0299d17.f3670r == 0 && c0299d17.f3673u == 0) {
                                    int i27 = c0299d17.f3674v;
                                }
                            } else if (c0299d17.f3671s == 0 && c0299d17.f3676x == 0) {
                                int i28 = c0299d17.f3677y;
                            }
                            c0299d14 = c0299d18;
                            if (c0299d14 != c0299d17) {
                                c0299d14.f3662m0[i21] = c0299d17;
                            }
                            c0298c7 = c0298cArr3[i22 + 1].f3614f;
                            if (c0298c7 != null) {
                                c0299d15 = c0298c7.d;
                                C0298c c0298c8 = c0299d15.f3631Q[i22].f3614f;
                                if (c0298c8 != null) {
                                }
                            }
                            c0299d15 = null;
                            if (c0299d15 != null) {
                                c0299d15 = c0299d17;
                                z8 = true;
                            }
                            c0299d18 = c0299d17;
                            i17 = i15;
                            i19 = 1;
                            i20 = 8;
                            i16 = 2;
                            c0299d17 = c0299d15;
                            i18 = 3;
                        }
                    }
                    i15 = i17;
                    c0299d14 = c0299d18;
                    if (c0299d14 != c0299d17) {
                    }
                    c0298c7 = c0298cArr3[i22 + 1].f3614f;
                    if (c0298c7 != null) {
                    }
                    c0299d15 = null;
                    if (c0299d15 != null) {
                    }
                    c0299d18 = c0299d17;
                    i17 = i15;
                    i19 = 1;
                    i20 = 8;
                    i16 = 2;
                    c0299d17 = c0299d15;
                    i18 = 3;
                }
                i4 = i17;
                C0299d c0299d20 = c0297b2.f3597b;
                if (c0299d20 != null) {
                    c0299d20.f3631Q[i22].e();
                }
                C0299d c0299d21 = c0297b2.d;
                if (c0299d21 != null) {
                    c0299d21.f3631Q[i22 + 1].e();
                }
                c0297b2.f3598c = c0299d17;
                if (i21 == 0 && c0297b2.f3605m) {
                    c0297b2.f3599e = c0299d17;
                } else {
                    c0297b2.f3599e = c0299d16;
                }
                c0297b2.f3608p = c0297b2.f3607o && c0297b2.f3606n;
                z2 = true;
            }
            c0297b2.f3609q = z2;
            if (arrayList4 == null || arrayList4.contains(c0299d16)) {
                C0299d c0299d22 = c0297b2.f3598c;
                C0299d c0299d23 = c0297b2.f3597b;
                C0299d c0299d24 = c0297b2.d;
                C0299d c0299d25 = c0297b2.f3599e;
                float f5 = c0297b2.f3603k;
                boolean z9 = c0300e2.f3668p0[i] == 2;
                if (i == 0) {
                    int i29 = c0299d25.f3655i0;
                    boolean z10 = i29 == 0;
                    z5 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    c0299d = c0299d16;
                    z4 = z10;
                } else {
                    int i30 = c0299d25.j0;
                    boolean z11 = i30 == 0;
                    boolean z12 = i30 == 1;
                    z3 = i30 == 2;
                    f2 = f5;
                    c0299d = c0299d16;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    c0298cArr = c0300e2.f3631Q;
                    if (z13) {
                        break;
                    }
                    C0298c c0298c9 = c0299d.f3631Q[i3];
                    int i31 = z3 ? 1 : 4;
                    int e2 = c0298c9.e();
                    boolean z14 = z13;
                    int[] iArr = c0299d.f3668p0;
                    int i32 = i2;
                    C0297b[] c0297bArr3 = c0297bArr;
                    boolean z15 = iArr[i] == 3 && c0299d.f3672t[i] == 0;
                    C0298c c0298c10 = c0298c9.f3614f;
                    if (c0298c10 != null && c0299d != c0299d16) {
                        e2 = c0298c10.e() + e2;
                    }
                    int i33 = e2;
                    if (!z3 || c0299d == c0299d16 || c0299d == c0299d23) {
                        c0299d11 = c0299d25;
                    } else {
                        c0299d11 = c0299d25;
                        i31 = 8;
                    }
                    C0298c c0298c11 = c0298c9.f3614f;
                    if (c0298c11 != null) {
                        if (c0299d == c0299d23) {
                            c0299d12 = c0299d16;
                            c0297b = c0297b2;
                            c0289c.f(c0298c9.i, c0298c11.i, i33, 6);
                        } else {
                            c0297b = c0297b2;
                            c0299d12 = c0299d16;
                            c0289c.f(c0298c9.i, c0298c11.i, i33, 8);
                        }
                        if (z15 && !z3) {
                            i31 = 5;
                        }
                        c0289c.e(c0298c9.i, c0298c9.f3614f.i, i33, (c0299d == c0299d23 && z3 && c0299d.f3633S[i]) ? 5 : i31);
                    } else {
                        c0297b = c0297b2;
                        c0299d12 = c0299d16;
                    }
                    C0298c[] c0298cArr4 = c0299d.f3631Q;
                    if (z9) {
                        if (c0299d.f3653g0 == 8 || iArr[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            c0289c.f(c0298cArr4[i3 + 1].i, c0298cArr4[i3].i, 0, 5);
                        }
                        c0289c.f(c0298cArr4[i3].i, c0298cArr[i3].i, i14, 8);
                    }
                    C0298c c0298c12 = c0298cArr4[i3 + 1].f3614f;
                    if (c0298c12 != null) {
                        c0299d13 = c0298c12.d;
                        C0298c c0298c13 = c0299d13.f3631Q[i3].f3614f;
                        if (c0298c13 != null) {
                        }
                    }
                    c0299d13 = null;
                    if (c0299d13 != null) {
                        c0299d = c0299d13;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    c0299d25 = c0299d11;
                    i2 = i32;
                    c0297bArr = c0297bArr3;
                    c0299d16 = c0299d12;
                    c0297b2 = c0297b;
                }
                C0297b c0297b3 = c0297b2;
                C0299d c0299d26 = c0299d25;
                C0299d c0299d27 = c0299d16;
                i5 = i2;
                c0297bArr2 = c0297bArr;
                if (c0299d24 != null) {
                    int i34 = i3 + 1;
                    if (c0299d22.f3631Q[i34].f3614f != null) {
                        C0298c c0298c14 = c0299d24.f3631Q[i34];
                        if (c0299d24.f3668p0[i] == 3 && c0299d24.f3672t[i] == 0 && !z3) {
                            C0298c c0298c15 = c0298c14.f3614f;
                            if (c0298c15.d == c0300e2) {
                                c0289c.e(c0298c14.i, c0298c15.i, -c0298c14.e(), 5);
                                c0289c.g(c0298c14.i, c0299d22.f3631Q[i34].f3614f.i, -c0298c14.e(), 6);
                                if (z9) {
                                    int i35 = i3 + 1;
                                    C0292f c0292f6 = c0298cArr[i35].i;
                                    C0298c c0298c16 = c0299d22.f3631Q[i35];
                                    c0289c.f(c0292f6, c0298c16.i, c0298c16.e(), 8);
                                }
                                arrayList2 = c0297b3.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f6 = (c0297b3.f3606n || c0297b3.f3608p) ? f2 : c0297b3.f3602j;
                                    C0299d c0299d28 = null;
                                    float f7 = 0.0f;
                                    i12 = 0;
                                    while (i12 < size) {
                                        C0299d c0299d29 = (C0299d) arrayList2.get(i12);
                                        float f8 = c0299d29.f3658k0[i];
                                        C0298c[] c0298cArr5 = c0299d29.f3631Q;
                                        if (f8 < 0.0f) {
                                            if (c0297b3.f3608p) {
                                                C0292f c0292f7 = c0298cArr5[i3 + 1].i;
                                                C0292f c0292f8 = c0298cArr5[i3].i;
                                                z6 = false;
                                                c0289c.e(c0292f7, c0292f8, 0, 4);
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
                                            C0292f c0292f9 = c0298cArr5[i3 + 1].i;
                                            C0292f c0292f10 = c0298cArr5[i3].i;
                                            z6 = false;
                                            c0289c.e(c0292f9, c0292f10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i13 = size;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (c0299d28 != null) {
                                                C0298c[] c0298cArr6 = c0299d28.f3631Q;
                                                C0292f c0292f11 = c0298cArr6[i3].i;
                                                int i36 = i3 + 1;
                                                C0292f c0292f12 = c0298cArr6[i36].i;
                                                arrayList3 = arrayList2;
                                                C0292f c0292f13 = c0298cArr5[i3].i;
                                                C0292f c0292f14 = c0298cArr5[i36].i;
                                                i13 = size;
                                                C0288b l2 = c0289c.l();
                                                c0299d10 = c0299d29;
                                                l2.f3522b = 0.0f;
                                                if (f6 == 0.0f || f7 == f8) {
                                                    f3 = f8;
                                                    l2.d.g(c0292f11, 1.0f);
                                                    l2.d.g(c0292f12, -1.0f);
                                                    l2.d.g(c0292f14, 1.0f);
                                                    l2.d.g(c0292f13, -1.0f);
                                                } else {
                                                    if (f7 == 0.0f) {
                                                        l2.d.g(c0292f11, 1.0f);
                                                        l2.d.g(c0292f12, -1.0f);
                                                    } else if (f8 == 0.0f) {
                                                        l2.d.g(c0292f13, 1.0f);
                                                        l2.d.g(c0292f14, -1.0f);
                                                    } else {
                                                        float f9 = (f7 / f6) / (f8 / f6);
                                                        f3 = f8;
                                                        l2.d.g(c0292f11, 1.0f);
                                                        l2.d.g(c0292f12, -1.0f);
                                                        l2.d.g(c0292f14, f9);
                                                        l2.d.g(c0292f13, -f9);
                                                    }
                                                    f3 = f8;
                                                }
                                                c0289c.c(l2);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                f3 = f8;
                                                c0299d10 = c0299d29;
                                            }
                                            f7 = f3;
                                            c0299d28 = c0299d10;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (c0299d23 == null && (c0299d23 == c0299d24 || z3)) {
                                    C0298c c0298c17 = c0299d27.f3631Q[i3];
                                    int i37 = i3 + 1;
                                    C0298c c0298c18 = c0299d22.f3631Q[i37];
                                    C0298c c0298c19 = c0298c17.f3614f;
                                    C0292f c0292f15 = c0298c19 != null ? c0298c19.i : null;
                                    C0298c c0298c20 = c0298c18.f3614f;
                                    C0292f c0292f16 = c0298c20 != null ? c0298c20.i : null;
                                    C0298c c0298c21 = c0299d23.f3631Q[i3];
                                    if (c0299d24 != null) {
                                        c0298c18 = c0299d24.f3631Q[i37];
                                    }
                                    if (c0292f15 == null || c0292f16 == null) {
                                        c0299d2 = c0299d24;
                                        i6 = i4;
                                    } else {
                                        c0299d2 = c0299d24;
                                        i6 = i4;
                                        c0289c.b(c0298c21.i, c0292f15, c0298c21.e(), i == 0 ? c0299d26.f3647d0 : c0299d26.f3649e0, c0292f16, c0298c18.i, c0298c18.e(), 7);
                                    }
                                } else {
                                    c0299d2 = c0299d24;
                                    i6 = i4;
                                    if (z4 || c0299d23 == null) {
                                        int i38 = 8;
                                        if (z5 && c0299d23 != null) {
                                            int i39 = c0297b3.f3602j;
                                            boolean z16 = i39 <= 0 && c0297b3.i == i39;
                                            C0299d c0299d30 = c0299d23;
                                            c0299d3 = c0299d30;
                                            while (c0299d3 != null) {
                                                C0299d c0299d31 = c0299d3.f3662m0[i];
                                                while (c0299d31 != null && c0299d31.f3653g0 == i38) {
                                                    c0299d31 = c0299d31.f3662m0[i];
                                                }
                                                if (c0299d3 == c0299d23 || c0299d3 == c0299d2 || c0299d31 == null) {
                                                    c0299d4 = c0299d30;
                                                    i9 = i6;
                                                    i10 = i38;
                                                } else {
                                                    C0299d c0299d32 = c0299d31 == c0299d2 ? null : c0299d31;
                                                    C0298c[] c0298cArr7 = c0299d3.f3631Q;
                                                    C0298c c0298c22 = c0298cArr7[i3];
                                                    C0292f c0292f17 = c0298c22.i;
                                                    int i40 = i3 + 1;
                                                    C0292f c0292f18 = c0299d30.f3631Q[i40].i;
                                                    int e3 = c0298c22.e();
                                                    int e4 = c0298cArr7[i40].e();
                                                    if (c0299d32 != null) {
                                                        c0298c3 = c0299d32.f3631Q[i3];
                                                        c0292f = c0298c3.i;
                                                        c0299d5 = c0299d32;
                                                        C0298c c0298c23 = c0298c3.f3614f;
                                                        c0292f2 = c0298c23 != null ? c0298c23.i : null;
                                                    } else {
                                                        c0299d5 = c0299d32;
                                                        C0298c c0298c24 = c0299d2.f3631Q[i3];
                                                        c0292f = c0298c24 != null ? c0298c24.i : null;
                                                        c0292f2 = c0298cArr7[i40].i;
                                                        c0298c3 = c0298c24;
                                                    }
                                                    int e5 = c0298c3 != null ? c0298c3.e() + e4 : e4;
                                                    int e6 = c0299d30.f3631Q[i40].e() + e3;
                                                    int i41 = z16 ? 8 : 4;
                                                    if (c0292f17 == null || c0292f18 == null || c0292f == null || c0292f2 == null) {
                                                        c0299d4 = c0299d30;
                                                        i9 = i6;
                                                        i10 = 8;
                                                    } else {
                                                        c0299d4 = c0299d30;
                                                        int i42 = e5;
                                                        i9 = i6;
                                                        i10 = 8;
                                                        c0289c.b(c0292f17, c0292f18, e6, 0.5f, c0292f, c0292f2, i42, i41);
                                                    }
                                                    c0299d31 = c0299d5;
                                                }
                                                c0299d30 = c0299d3.f3653g0 != i10 ? c0299d3 : c0299d4;
                                                c0299d3 = c0299d31;
                                                i38 = i10;
                                                i6 = i9;
                                            }
                                            i7 = i6;
                                            C0298c c0298c25 = c0299d23.f3631Q[i3];
                                            c0298c = c0299d27.f3631Q[i3].f3614f;
                                            int i43 = i3 + 1;
                                            C0298c c0298c26 = c0299d2.f3631Q[i43];
                                            c0298c2 = c0299d22.f3631Q[i43].f3614f;
                                            if (c0298c != null) {
                                                if (c0299d23 != c0299d2) {
                                                    c0289c.e(c0298c25.i, c0298c.i, c0298c25.e(), 5);
                                                } else if (c0298c2 != null) {
                                                    i8 = 5;
                                                    c0289c.b(c0298c25.i, c0298c.i, c0298c25.e(), 0.5f, c0298c26.i, c0298c2.i, c0298c26.e(), 5);
                                                    if (c0298c2 != null && c0299d23 != c0299d2) {
                                                        c0289c.e(c0298c26.i, c0298c2.i, -c0298c26.e(), i8);
                                                    }
                                                    if ((!z4 || z5) && c0299d23 != null && c0299d23 != c0299d2) {
                                                        C0298c[] c0298cArr8 = c0299d23.f3631Q;
                                                        c0298c5 = c0298cArr8[i3];
                                                        c0299d9 = c0299d2 != null ? c0299d23 : c0299d2;
                                                        i11 = i3 + 1;
                                                        c0298cArr2 = c0299d9.f3631Q;
                                                        c0298c6 = c0298cArr2[i11];
                                                        C0298c c0298c27 = c0298c5.f3614f;
                                                        c0292f4 = c0298c27 == null ? c0298c27.i : null;
                                                        C0298c c0298c28 = c0298c6.f3614f;
                                                        c0292f5 = c0298c28 == null ? c0298c28.i : null;
                                                        if (c0299d22 != c0299d9) {
                                                            C0298c c0298c29 = c0299d22.f3631Q[i11].f3614f;
                                                            c0292f5 = c0298c29 != null ? c0298c29.i : null;
                                                        }
                                                        if (c0299d23 == c0299d9) {
                                                            c0298c6 = c0298cArr8[i11];
                                                        }
                                                        if (c0292f4 != null && c0292f5 != null) {
                                                            c0289c.b(c0298c5.i, c0292f4, c0298c5.e(), 0.5f, c0292f5, c0298c6.i, c0298cArr2[i11].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            if (c0298c2 != null) {
                                                c0289c.e(c0298c26.i, c0298c2.i, -c0298c26.e(), i8);
                                            }
                                            if (!z4) {
                                            }
                                            C0298c[] c0298cArr82 = c0299d23.f3631Q;
                                            c0298c5 = c0298cArr82[i3];
                                            if (c0299d2 != null) {
                                            }
                                            i11 = i3 + 1;
                                            c0298cArr2 = c0299d9.f3631Q;
                                            c0298c6 = c0298cArr2[i11];
                                            C0298c c0298c272 = c0298c5.f3614f;
                                            if (c0298c272 == null) {
                                            }
                                            C0298c c0298c282 = c0298c6.f3614f;
                                            if (c0298c282 == null) {
                                            }
                                            if (c0299d22 != c0299d9) {
                                            }
                                            if (c0299d23 == c0299d9) {
                                            }
                                            if (c0292f4 != null) {
                                                c0289c.b(c0298c5.i, c0292f4, c0298c5.e(), 0.5f, c0292f5, c0298c6.i, c0298cArr2[i11].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i44 = c0297b3.f3602j;
                                        boolean z17 = i44 > 0 && c0297b3.i == i44;
                                        C0299d c0299d33 = c0299d23;
                                        for (C0299d c0299d34 = c0299d33; c0299d34 != null; c0299d34 = c0299d7) {
                                            C0299d c0299d35 = c0299d34.f3662m0[i];
                                            while (c0299d35 != null && c0299d35.f3653g0 == 8) {
                                                c0299d35 = c0299d35.f3662m0[i];
                                            }
                                            if (c0299d35 != null || c0299d34 == c0299d2) {
                                                C0298c[] c0298cArr9 = c0299d34.f3631Q;
                                                C0298c c0298c30 = c0298cArr9[i3];
                                                C0292f c0292f19 = c0298c30.i;
                                                C0298c c0298c31 = c0298c30.f3614f;
                                                C0292f c0292f20 = c0298c31 != null ? c0298c31.i : null;
                                                if (c0299d33 != c0299d34) {
                                                    c0292f20 = c0299d33.f3631Q[i3 + 1].i;
                                                } else if (c0299d34 == c0299d23) {
                                                    C0298c c0298c32 = c0299d27.f3631Q[i3].f3614f;
                                                    c0292f20 = c0298c32 != null ? c0298c32.i : null;
                                                }
                                                int e7 = c0298c30.e();
                                                int i45 = i3 + 1;
                                                int e8 = c0298cArr9[i45].e();
                                                if (c0299d35 != null) {
                                                    c0298c4 = c0299d35.f3631Q[i3];
                                                    c0292f3 = c0298c4.i;
                                                } else {
                                                    c0298c4 = c0299d22.f3631Q[i45].f3614f;
                                                    c0292f3 = c0298c4 != null ? c0298c4.i : null;
                                                }
                                                C0292f c0292f21 = c0298cArr9[i45].i;
                                                if (c0298c4 != null) {
                                                    e8 = c0298c4.e() + e8;
                                                }
                                                int e9 = c0299d33.f3631Q[i45].e() + e7;
                                                if (c0292f19 != null && c0292f20 != null && c0292f3 != null && c0292f21 != null) {
                                                    if (c0299d34 == c0299d23) {
                                                        e9 = c0299d23.f3631Q[i3].e();
                                                    }
                                                    if (c0299d34 == c0299d2) {
                                                        e8 = c0299d2.f3631Q[i45].e();
                                                    }
                                                    C0292f c0292f22 = c0292f20;
                                                    int i46 = e9;
                                                    C0292f c0292f23 = c0292f3;
                                                    c0299d6 = c0299d33;
                                                    int i47 = e8;
                                                    c0299d7 = c0299d35;
                                                    c0299d8 = c0299d34;
                                                    c0289c.b(c0292f19, c0292f22, i46, 0.5f, c0292f23, c0292f21, i47, z17 ? 8 : 5);
                                                    c0299d33 = c0299d8.f3653g0 == 8 ? c0299d8 : c0299d6;
                                                }
                                            }
                                            c0299d7 = c0299d35;
                                            c0299d6 = c0299d33;
                                            c0299d8 = c0299d34;
                                            if (c0299d8.f3653g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i7 = i6;
                                if (!z4) {
                                }
                                C0298c[] c0298cArr822 = c0299d23.f3631Q;
                                c0298c5 = c0298cArr822[i3];
                                if (c0299d2 != null) {
                                }
                                i11 = i3 + 1;
                                c0298cArr2 = c0299d9.f3631Q;
                                c0298c6 = c0298cArr2[i11];
                                C0298c c0298c2722 = c0298c5.f3614f;
                                if (c0298c2722 == null) {
                                }
                                C0298c c0298c2822 = c0298c6.f3614f;
                                if (c0298c2822 == null) {
                                }
                                if (c0299d22 != c0299d9) {
                                }
                                if (c0299d23 == c0299d9) {
                                }
                                if (c0292f4 != null) {
                                }
                            }
                        }
                        if (z3) {
                            C0298c c0298c33 = c0298c14.f3614f;
                            if (c0298c33.d == c0300e2) {
                                c0289c.e(c0298c14.i, c0298c33.i, -c0298c14.e(), 4);
                            }
                        }
                        c0289c.g(c0298c14.i, c0299d22.f3631Q[i34].f3614f.i, -c0298c14.e(), 6);
                        if (z9) {
                        }
                        arrayList2 = c0297b3.h;
                        if (arrayList2 != null) {
                            if (c0297b3.f3606n) {
                            }
                            C0299d c0299d282 = null;
                            float f72 = 0.0f;
                            i12 = 0;
                            while (i12 < size) {
                            }
                        }
                        if (c0299d23 == null) {
                        }
                        c0299d2 = c0299d24;
                        i6 = i4;
                        if (z4) {
                        }
                        int i382 = 8;
                        if (z5) {
                            int i392 = c0297b3.f3602j;
                            if (i392 <= 0) {
                            }
                            C0299d c0299d302 = c0299d23;
                            c0299d3 = c0299d302;
                            while (c0299d3 != null) {
                            }
                            i7 = i6;
                            C0298c c0298c252 = c0299d23.f3631Q[i3];
                            c0298c = c0299d27.f3631Q[i3].f3614f;
                            int i432 = i3 + 1;
                            C0298c c0298c262 = c0299d2.f3631Q[i432];
                            c0298c2 = c0299d22.f3631Q[i432].f3614f;
                            if (c0298c != null) {
                            }
                            i8 = 5;
                            if (c0298c2 != null) {
                            }
                            if (!z4) {
                            }
                            C0298c[] c0298cArr8222 = c0299d23.f3631Q;
                            c0298c5 = c0298cArr8222[i3];
                            if (c0299d2 != null) {
                            }
                            i11 = i3 + 1;
                            c0298cArr2 = c0299d9.f3631Q;
                            c0298c6 = c0298cArr2[i11];
                            C0298c c0298c27222 = c0298c5.f3614f;
                            if (c0298c27222 == null) {
                            }
                            C0298c c0298c28222 = c0298c6.f3614f;
                            if (c0298c28222 == null) {
                            }
                            if (c0299d22 != c0299d9) {
                            }
                            if (c0299d23 == c0299d9) {
                            }
                            if (c0292f4 != null) {
                            }
                        }
                        i7 = i6;
                        if (!z4) {
                        }
                        C0298c[] c0298cArr82222 = c0299d23.f3631Q;
                        c0298c5 = c0298cArr82222[i3];
                        if (c0299d2 != null) {
                        }
                        i11 = i3 + 1;
                        c0298cArr2 = c0299d9.f3631Q;
                        c0298c6 = c0298cArr2[i11];
                        C0298c c0298c272222 = c0298c5.f3614f;
                        if (c0298c272222 == null) {
                        }
                        C0298c c0298c282222 = c0298c6.f3614f;
                        if (c0298c282222 == null) {
                        }
                        if (c0299d22 != c0299d9) {
                        }
                        if (c0299d23 == c0299d9) {
                        }
                        if (c0292f4 != null) {
                        }
                    }
                }
                if (z9) {
                }
                arrayList2 = c0297b3.h;
                if (arrayList2 != null) {
                }
                if (c0299d23 == null) {
                }
                c0299d2 = c0299d24;
                i6 = i4;
                if (z4) {
                }
                int i3822 = 8;
                if (z5) {
                }
                i7 = i6;
                if (!z4) {
                }
                C0298c[] c0298cArr822222 = c0299d23.f3631Q;
                c0298c5 = c0298cArr822222[i3];
                if (c0299d2 != null) {
                }
                i11 = i3 + 1;
                c0298cArr2 = c0299d9.f3631Q;
                c0298c6 = c0298cArr2[i11];
                C0298c c0298c2722222 = c0298c5.f3614f;
                if (c0298c2722222 == null) {
                }
                C0298c c0298c2822222 = c0298c6.f3614f;
                if (c0298c2822222 == null) {
                }
                if (c0299d22 != c0299d9) {
                }
                if (c0299d23 == c0299d9) {
                }
                if (c0292f4 != null) {
                }
            } else {
                i5 = i2;
                c0297bArr2 = c0297bArr;
                i7 = i4;
            }
            i17 = i7 + 1;
            i16 = 2;
            c0300e2 = c0300e;
            arrayList4 = arrayList;
            i2 = i5;
            c0297bArr = c0297bArr2;
        }
    }

    public static void b(C0300e c0300e, C0289c c0289c, C0299d c0299d) {
        c0299d.f3665o = -1;
        c0299d.f3667p = -1;
        int i = c0300e.f3668p0[0];
        int[] iArr = c0299d.f3668p0;
        if (i != 2 && iArr[0] == 4) {
            C0298c c0298c = c0299d.f3623I;
            int i2 = c0298c.f3615g;
            int q2 = c0300e.q();
            C0298c c0298c2 = c0299d.f3625K;
            int i3 = q2 - c0298c2.f3615g;
            c0298c.i = c0289c.k(c0298c);
            c0298c2.i = c0289c.k(c0298c2);
            c0289c.d(c0298c.i, i2);
            c0289c.d(c0298c2.i, i3);
            c0299d.f3665o = 2;
            c0299d.f3639Y = i2;
            int i4 = i3 - i2;
            c0299d.f3635U = i4;
            int i5 = c0299d.f3644b0;
            if (i4 < i5) {
                c0299d.f3635U = i5;
            }
        }
        if (c0300e.f3668p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0298c c0298c3 = c0299d.f3624J;
        int i6 = c0298c3.f3615g;
        int k2 = c0300e.k();
        C0298c c0298c4 = c0299d.f3626L;
        int i7 = k2 - c0298c4.f3615g;
        c0298c3.i = c0289c.k(c0298c3);
        c0298c4.i = c0289c.k(c0298c4);
        c0289c.d(c0298c3.i, i6);
        c0289c.d(c0298c4.i, i7);
        if (c0299d.f3642a0 > 0 || c0299d.f3653g0 == 8) {
            C0298c c0298c5 = c0299d.f3627M;
            C0292f k3 = c0289c.k(c0298c5);
            c0298c5.i = k3;
            c0289c.d(k3, c0299d.f3642a0 + i6);
        }
        c0299d.f3667p = 2;
        c0299d.f3640Z = i6;
        int i8 = i7 - i6;
        c0299d.f3636V = i8;
        int i9 = c0299d.f3646c0;
        if (i8 < i9) {
            c0299d.f3636V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
