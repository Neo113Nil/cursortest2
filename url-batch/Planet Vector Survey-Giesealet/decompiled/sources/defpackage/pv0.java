package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class pv0 {
    public static final ji a = new ji(gi.B);

    public static final void a(dw0 dw0Var, qu quVar, ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        qhVar.W(-460300127);
        int i2 = (qhVar.f(dw0Var) ? 4 : 2) | i | (qhVar.h(quVar) ? 32 : 16);
        if ((i2 & 19) == 18 && qhVar.z()) {
            qhVar.Q();
        } else {
            ji jiVar = a;
            nz.b(jiVar.a(((dw0) qhVar.j(jiVar)).c(dw0Var)), quVar, qhVar, (i2 & 112) | 8);
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new w3(i, 10, dw0Var, quVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, u50 u50Var, long j, long j2, ut utVar, long j3, dv0 dv0Var, long j4, int i, boolean z, int i2, int i3, dw0 dw0Var, ih ihVar, int i4, int i5) {
        String str2;
        int i6;
        u50 u50Var2;
        int i7;
        long j5;
        int i8;
        ut utVar2;
        int i9;
        int i10;
        dv0 dv0Var2;
        dw0 dw0Var2;
        char c;
        u50 u50Var3;
        long j6;
        long j7;
        boolean z2;
        int i11;
        int i12;
        dw0 dw0Var3;
        long j8;
        dv0 dv0Var3;
        int i13;
        long j9;
        long b;
        boolean z3;
        qh qhVar;
        boolean z4;
        int i14;
        dw0 dw0Var4;
        int i15;
        int i16;
        u50 u50Var4;
        ut utVar3;
        long j10;
        long j11;
        long j12;
        long j13;
        ri0 s;
        qh qhVar2 = (qh) ihVar;
        qhVar2.W(-2055108902);
        if ((i4 & 6) == 0) {
            str2 = str;
            i6 = (qhVar2.f(str2) ? 4 : 2) | i4;
        } else {
            str2 = str;
            i6 = i4;
        }
        int i17 = i5 & 2;
        if (i17 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            u50Var2 = u50Var;
            i6 |= qhVar2.f(u50Var2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                j5 = j;
                i6 |= qhVar2.e(j5) ? 256 : 128;
                int i18 = i6 | 27648;
                i8 = i5 & 32;
                if (i8 != 0) {
                    i18 = 224256 | i6;
                } else if ((196608 & i4) == 0) {
                    utVar2 = utVar;
                    i18 |= qhVar2.f(utVar2) ? 131072 : 65536;
                    i9 = 114819072 | i18;
                    i10 = i5 & 512;
                    if (i10 == 0) {
                        i9 = 920125440 | i18;
                    } else if ((805306368 & i4) == 0) {
                        dv0Var2 = dv0Var;
                        i9 |= qhVar2.f(dv0Var2) ? 536870912 : 268435456;
                        if ((i5 & 65536) == 0) {
                            dw0Var2 = dw0Var;
                            if (qhVar2.f(dw0Var2)) {
                                c = 0;
                                int i19 = 28086 | c;
                                if ((i9 & 306783379) != 306783378 && (i19 & 599187) == 599186 && qhVar2.z()) {
                                    qhVar2.Q();
                                    j13 = j4;
                                    i15 = i;
                                    z4 = z;
                                    i14 = i3;
                                    qhVar = qhVar2;
                                    utVar3 = utVar2;
                                    u50Var4 = u50Var2;
                                    j10 = j5;
                                    dw0Var4 = dw0Var2;
                                    j11 = j2;
                                    j12 = j3;
                                    i16 = i2;
                                } else {
                                    qhVar2.S();
                                    if ((i4 & 1) != 0 || qhVar2.x()) {
                                        u50Var3 = i17 == 0 ? r50.a : u50Var2;
                                        j6 = i7 == 0 ? ge.g : j5;
                                        j7 = fw0.c;
                                        if (i8 != 0) {
                                            utVar2 = null;
                                        }
                                        dv0 dv0Var4 = i10 == 0 ? dv0Var2 : null;
                                        if ((i5 & 65536) == 0) {
                                            j8 = j7;
                                            dw0Var3 = (dw0) qhVar2.j(a);
                                            z2 = true;
                                            i11 = 1;
                                            i12 = Integer.MAX_VALUE;
                                        } else {
                                            z2 = true;
                                            i11 = 1;
                                            i12 = Integer.MAX_VALUE;
                                            dw0Var3 = dw0Var2;
                                            j8 = j7;
                                        }
                                        dv0Var3 = dv0Var4;
                                        i13 = i11;
                                        j9 = j8;
                                    } else {
                                        qhVar2.Q();
                                        i13 = i;
                                        z2 = z;
                                        i12 = i2;
                                        i11 = i3;
                                        u50Var3 = u50Var2;
                                        j6 = j5;
                                        dv0Var3 = dv0Var2;
                                        dw0Var3 = dw0Var2;
                                        j7 = j2;
                                        j9 = j3;
                                        j8 = j4;
                                    }
                                    qhVar2.r();
                                    u50 u50Var5 = u50Var3;
                                    qhVar2.V(-1827892941);
                                    if (j6 == 16) {
                                        b = j6;
                                        z3 = false;
                                    } else {
                                        qhVar2.V(-1827892168);
                                        b = dw0Var3.b();
                                        if (b == 16) {
                                            b = ((ge) qhVar2.j(aj.a)).a;
                                        }
                                        z3 = false;
                                        qhVar2.q(false);
                                    }
                                    qhVar2.q(z3);
                                    long j14 = j8;
                                    dw0 dw0Var5 = dw0Var3;
                                    int i20 = i13;
                                    boolean z5 = z2;
                                    int i21 = i12;
                                    int i22 = i11;
                                    d31.a(str2, u50Var5, dw0.d(dw0Var5, b, j7, utVar2, j9, dv0Var3 == null ? dv0Var3.a : Integer.MIN_VALUE, j14, 16609104), i20, z5, i21, i22, qhVar2, (i9 & 126) | 14380032);
                                    qhVar = qhVar2;
                                    z4 = z5;
                                    i14 = i22;
                                    dw0Var4 = dw0Var5;
                                    i15 = i20;
                                    i16 = i21;
                                    u50Var4 = u50Var5;
                                    long j15 = j7;
                                    utVar3 = utVar2;
                                    j10 = j6;
                                    j11 = j15;
                                    j12 = j9;
                                    dv0Var2 = dv0Var3;
                                    j13 = j14;
                                }
                                s = qhVar.s();
                                if (s == null) {
                                    s.d = new ov0(str, u50Var4, j10, j11, utVar3, j12, dv0Var2, j13, i15, z4, i16, i14, dw0Var4, i4, i5);
                                    return;
                                }
                                return;
                            }
                        } else {
                            dw0Var2 = dw0Var;
                        }
                        c = 0;
                        int i192 = 28086 | c;
                        if ((i9 & 306783379) != 306783378) {
                        }
                        qhVar2.S();
                        if ((i4 & 1) != 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        j7 = fw0.c;
                        if (i8 != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i5 & 65536) == 0) {
                        }
                        dv0Var3 = dv0Var4;
                        i13 = i11;
                        j9 = j8;
                        qhVar2.r();
                        u50 u50Var52 = u50Var3;
                        qhVar2.V(-1827892941);
                        if (j6 == 16) {
                        }
                        qhVar2.q(z3);
                        long j142 = j8;
                        dw0 dw0Var52 = dw0Var3;
                        int i202 = i13;
                        boolean z52 = z2;
                        int i212 = i12;
                        int i222 = i11;
                        d31.a(str2, u50Var52, dw0.d(dw0Var52, b, j7, utVar2, j9, dv0Var3 == null ? dv0Var3.a : Integer.MIN_VALUE, j142, 16609104), i202, z52, i212, i222, qhVar2, (i9 & 126) | 14380032);
                        qhVar = qhVar2;
                        z4 = z52;
                        i14 = i222;
                        dw0Var4 = dw0Var52;
                        i15 = i202;
                        i16 = i212;
                        u50Var4 = u50Var52;
                        long j152 = j7;
                        utVar3 = utVar2;
                        j10 = j6;
                        j11 = j152;
                        j12 = j9;
                        dv0Var2 = dv0Var3;
                        j13 = j142;
                        s = qhVar.s();
                        if (s == null) {
                        }
                    }
                    dv0Var2 = dv0Var;
                    if ((i5 & 65536) == 0) {
                    }
                    c = 0;
                    int i1922 = 28086 | c;
                    if ((i9 & 306783379) != 306783378) {
                    }
                    qhVar2.S();
                    if ((i4 & 1) != 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    j7 = fw0.c;
                    if (i8 != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i5 & 65536) == 0) {
                    }
                    dv0Var3 = dv0Var4;
                    i13 = i11;
                    j9 = j8;
                    qhVar2.r();
                    u50 u50Var522 = u50Var3;
                    qhVar2.V(-1827892941);
                    if (j6 == 16) {
                    }
                    qhVar2.q(z3);
                    long j1422 = j8;
                    dw0 dw0Var522 = dw0Var3;
                    int i2022 = i13;
                    boolean z522 = z2;
                    int i2122 = i12;
                    int i2222 = i11;
                    d31.a(str2, u50Var522, dw0.d(dw0Var522, b, j7, utVar2, j9, dv0Var3 == null ? dv0Var3.a : Integer.MIN_VALUE, j1422, 16609104), i2022, z522, i2122, i2222, qhVar2, (i9 & 126) | 14380032);
                    qhVar = qhVar2;
                    z4 = z522;
                    i14 = i2222;
                    dw0Var4 = dw0Var522;
                    i15 = i2022;
                    i16 = i2122;
                    u50Var4 = u50Var522;
                    long j1522 = j7;
                    utVar3 = utVar2;
                    j10 = j6;
                    j11 = j1522;
                    j12 = j9;
                    dv0Var2 = dv0Var3;
                    j13 = j1422;
                    s = qhVar.s();
                    if (s == null) {
                    }
                }
                utVar2 = utVar;
                i9 = 114819072 | i18;
                i10 = i5 & 512;
                if (i10 == 0) {
                }
                dv0Var2 = dv0Var;
                if ((i5 & 65536) == 0) {
                }
                c = 0;
                int i19222 = 28086 | c;
                if ((i9 & 306783379) != 306783378) {
                }
                qhVar2.S();
                if ((i4 & 1) != 0) {
                }
                if (i17 == 0) {
                }
                if (i7 == 0) {
                }
                j7 = fw0.c;
                if (i8 != 0) {
                }
                if (i10 == 0) {
                }
                if ((i5 & 65536) == 0) {
                }
                dv0Var3 = dv0Var4;
                i13 = i11;
                j9 = j8;
                qhVar2.r();
                u50 u50Var5222 = u50Var3;
                qhVar2.V(-1827892941);
                if (j6 == 16) {
                }
                qhVar2.q(z3);
                long j14222 = j8;
                dw0 dw0Var5222 = dw0Var3;
                int i20222 = i13;
                boolean z5222 = z2;
                int i21222 = i12;
                int i22222 = i11;
                d31.a(str2, u50Var5222, dw0.d(dw0Var5222, b, j7, utVar2, j9, dv0Var3 == null ? dv0Var3.a : Integer.MIN_VALUE, j14222, 16609104), i20222, z5222, i21222, i22222, qhVar2, (i9 & 126) | 14380032);
                qhVar = qhVar2;
                z4 = z5222;
                i14 = i22222;
                dw0Var4 = dw0Var5222;
                i15 = i20222;
                i16 = i21222;
                u50Var4 = u50Var5222;
                long j15222 = j7;
                utVar3 = utVar2;
                j10 = j6;
                j11 = j15222;
                j12 = j9;
                dv0Var2 = dv0Var3;
                j13 = j14222;
                s = qhVar.s();
                if (s == null) {
                }
            }
            j5 = j;
            int i182 = i6 | 27648;
            i8 = i5 & 32;
            if (i8 != 0) {
            }
            utVar2 = utVar;
            i9 = 114819072 | i182;
            i10 = i5 & 512;
            if (i10 == 0) {
            }
            dv0Var2 = dv0Var;
            if ((i5 & 65536) == 0) {
            }
            c = 0;
            int i192222 = 28086 | c;
            if ((i9 & 306783379) != 306783378) {
            }
            qhVar2.S();
            if ((i4 & 1) != 0) {
            }
            if (i17 == 0) {
            }
            if (i7 == 0) {
            }
            j7 = fw0.c;
            if (i8 != 0) {
            }
            if (i10 == 0) {
            }
            if ((i5 & 65536) == 0) {
            }
            dv0Var3 = dv0Var4;
            i13 = i11;
            j9 = j8;
            qhVar2.r();
            u50 u50Var52222 = u50Var3;
            qhVar2.V(-1827892941);
            if (j6 == 16) {
            }
            qhVar2.q(z3);
            long j142222 = j8;
            dw0 dw0Var52222 = dw0Var3;
            int i202222 = i13;
            boolean z52222 = z2;
            int i212222 = i12;
            int i222222 = i11;
            d31.a(str2, u50Var52222, dw0.d(dw0Var52222, b, j7, utVar2, j9, dv0Var3 == null ? dv0Var3.a : Integer.MIN_VALUE, j142222, 16609104), i202222, z52222, i212222, i222222, qhVar2, (i9 & 126) | 14380032);
            qhVar = qhVar2;
            z4 = z52222;
            i14 = i222222;
            dw0Var4 = dw0Var52222;
            i15 = i202222;
            i16 = i212222;
            u50Var4 = u50Var52222;
            long j152222 = j7;
            utVar3 = utVar2;
            j10 = j6;
            j11 = j152222;
            j12 = j9;
            dv0Var2 = dv0Var3;
            j13 = j142222;
            s = qhVar.s();
            if (s == null) {
            }
        }
        u50Var2 = u50Var;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        j5 = j;
        int i1822 = i6 | 27648;
        i8 = i5 & 32;
        if (i8 != 0) {
        }
        utVar2 = utVar;
        i9 = 114819072 | i1822;
        i10 = i5 & 512;
        if (i10 == 0) {
        }
        dv0Var2 = dv0Var;
        if ((i5 & 65536) == 0) {
        }
        c = 0;
        int i1922222 = 28086 | c;
        if ((i9 & 306783379) != 306783378) {
        }
        qhVar2.S();
        if ((i4 & 1) != 0) {
        }
        if (i17 == 0) {
        }
        if (i7 == 0) {
        }
        j7 = fw0.c;
        if (i8 != 0) {
        }
        if (i10 == 0) {
        }
        if ((i5 & 65536) == 0) {
        }
        dv0Var3 = dv0Var4;
        i13 = i11;
        j9 = j8;
        qhVar2.r();
        u50 u50Var522222 = u50Var3;
        qhVar2.V(-1827892941);
        if (j6 == 16) {
        }
        qhVar2.q(z3);
        long j1422222 = j8;
        dw0 dw0Var522222 = dw0Var3;
        int i2022222 = i13;
        boolean z522222 = z2;
        int i2122222 = i12;
        int i2222222 = i11;
        d31.a(str2, u50Var522222, dw0.d(dw0Var522222, b, j7, utVar2, j9, dv0Var3 == null ? dv0Var3.a : Integer.MIN_VALUE, j1422222, 16609104), i2022222, z522222, i2122222, i2222222, qhVar2, (i9 & 126) | 14380032);
        qhVar = qhVar2;
        z4 = z522222;
        i14 = i2222222;
        dw0Var4 = dw0Var522222;
        i15 = i2022222;
        i16 = i2122222;
        u50Var4 = u50Var522222;
        long j1522222 = j7;
        utVar3 = utVar2;
        j10 = j6;
        j11 = j1522222;
        j12 = j9;
        dv0Var2 = dv0Var3;
        j13 = j1422222;
        s = qhVar.s();
        if (s == null) {
        }
    }
}
