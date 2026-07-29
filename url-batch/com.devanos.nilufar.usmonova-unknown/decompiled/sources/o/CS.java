package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class CS {
    public final InterfaceC2114vp a;
    public Object b;
    public GD c;
    public int j;
    public int d = -1;
    public final C1818rJ e = new C1818rJ(9);
    public final MD f = new MD();
    public final QD g = new QD();
    public final YD h = new YD(new C1645oh[16]);
    public final C1509md i = new C1509md(1, this);
    public final C1818rJ k = new C1818rJ(9);
    public final HashMap l = new HashMap();

    public CS(InterfaceC2114vp interfaceC2114vp) {
        this.a = interfaceC2114vp;
    }

    public final void a(InterfaceC0699aH interfaceC0699aH, C2084vL c2084vL, InterfaceC1455lp interfaceC1455lp) {
        boolean z;
        int i;
        int i2;
        Object obj = this.b;
        GD gd = this.c;
        int i3 = this.d;
        this.b = interfaceC0699aH;
        this.c = (GD) this.f.e(interfaceC0699aH);
        if (this.d == -1) {
            this.d = AbstractC2025uS.k().d();
        }
        C1509md c1509md = this.i;
        YD k = AbstractC2219xO.k();
        boolean z2 = true;
        try {
            k.b(c1509md);
            ON.m(interfaceC1455lp, c2084vL);
            k.n(k.j - 1);
            Object obj2 = this.b;
            AbstractC0048Bt.k(obj2);
            int i4 = this.d;
            GD gd2 = this.c;
            if (gd2 != null) {
                long[] jArr = gd2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            z = z2;
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    int i9 = (i5 << 3) + i8;
                                    i2 = i6;
                                    Object obj3 = gd2.b[i9];
                                    i = i8;
                                    boolean z3 = gd2.c[i9] != i4 ? z : false;
                                    if (z3) {
                                        d(obj2, obj3);
                                    }
                                    if (z3) {
                                        gd2.e(i9);
                                    }
                                } else {
                                    i = i8;
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8 = i + 1;
                                i6 = i2;
                            }
                            if (i7 != i6) {
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        z2 = z;
                    }
                }
            }
            this.b = obj;
            this.c = gd;
            this.d = i3;
        } catch (Throwable th) {
            k.n(k.j - 1);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:259:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Set set) {
        char c;
        long j;
        boolean z;
        Iterator it;
        Object obj;
        String str;
        C1818rJ c1818rJ;
        Object e;
        int i;
        Object e2;
        Iterator it2;
        Object obj2;
        String str2;
        C1818rJ c1818rJ2;
        long j2;
        YD yd;
        Object[] objArr;
        int i2;
        int i3;
        YD yd2;
        GD gd;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        Object[] objArr3;
        int i4;
        int i5;
        int i6;
        long j3;
        int i7;
        Object obj3;
        Object e3;
        Object e4;
        int i8;
        int i9;
        long j4;
        Object obj4;
        int i10;
        long j5;
        boolean z2 = set instanceof YP;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        YD yd3 = this.h;
        int i11 = 8;
        C1818rJ c1818rJ3 = this.k;
        HashMap hashMap = this.l;
        C1818rJ c1818rJ4 = this.e;
        QD qd = this.g;
        if (z2) {
            QD qd2 = ((YP) set).h;
            Object[] objArr4 = qd2.b;
            long[] jArr3 = qd2.a;
            c = 7;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                z = false;
                j = -9187201950435737472L;
                while (true) {
                    long j6 = jArr3[i12];
                    int i13 = i12;
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j6 & 255) < 128) {
                                int i16 = i11;
                                Object obj5 = objArr4[(i13 << 3) + i15];
                                jArr2 = jArr3;
                                if (obj5 instanceof GT) {
                                    objArr3 = objArr4;
                                    if (!((GT) obj5).c(2)) {
                                        i4 = length;
                                        i5 = i14;
                                        i6 = i15;
                                        j3 = j6;
                                        i7 = 8;
                                    }
                                } else {
                                    objArr3 = objArr4;
                                }
                                if (((MD) c1818rJ3.i).b(obj5) && (e4 = ((MD) c1818rJ3.i).e(obj5)) != null) {
                                    if (e4 instanceof QD) {
                                        QD qd3 = (QD) e4;
                                        Object[] objArr5 = qd3.b;
                                        long[] jArr4 = qd3.a;
                                        int length2 = jArr4.length - 2;
                                        if (length2 >= 0) {
                                            i6 = i15;
                                            boolean z3 = z;
                                            int i17 = 0;
                                            while (true) {
                                                long j7 = jArr4[i17];
                                                j3 = j6;
                                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                    int i19 = 0;
                                                    while (i19 < i18) {
                                                        if ((j7 & 255) < 128) {
                                                            j4 = j7;
                                                            C1645oh c1645oh = (C1645oh) objArr5[(i17 << 3) + i19];
                                                            AbstractC0048Bt.l(c1645oh, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                            i10 = i19;
                                                            if (AbstractC0048Bt.h(c1645oh.h().f, hashMap.get(c1645oh))) {
                                                                i8 = length;
                                                                i9 = i14;
                                                                obj4 = obj5;
                                                                yd3.b(c1645oh);
                                                            } else {
                                                                Object e5 = ((MD) c1818rJ4.i).e(c1645oh);
                                                                if (e5 != null) {
                                                                    if (e5 instanceof QD) {
                                                                        QD qd4 = (QD) e5;
                                                                        Object[] objArr6 = qd4.b;
                                                                        long[] jArr5 = qd4.a;
                                                                        int length3 = jArr5.length - 2;
                                                                        if (length3 >= 0) {
                                                                            i8 = length;
                                                                            i9 = i14;
                                                                            int i20 = 0;
                                                                            while (true) {
                                                                                long j8 = jArr5[i20];
                                                                                Object[] objArr7 = objArr6;
                                                                                obj4 = obj5;
                                                                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                    int i21 = 8 - ((~(i20 - length3)) >>> 31);
                                                                                    for (int i22 = 0; i22 < i21; i22++) {
                                                                                        if ((j8 & 255) < 128) {
                                                                                            j5 = j8;
                                                                                            qd.a(objArr7[(i20 << 3) + i22]);
                                                                                            z3 = true;
                                                                                        } else {
                                                                                            j5 = j8;
                                                                                        }
                                                                                        j8 = j5 >> i16;
                                                                                    }
                                                                                    if (i21 != i16) {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (i20 == length3) {
                                                                                    break;
                                                                                }
                                                                                i20++;
                                                                                obj5 = obj4;
                                                                                objArr6 = objArr7;
                                                                                i16 = 8;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i8 = length;
                                                                        i9 = i14;
                                                                        obj4 = obj5;
                                                                        qd.a(e5);
                                                                        z3 = true;
                                                                    }
                                                                }
                                                                i8 = length;
                                                                i9 = i14;
                                                                obj4 = obj5;
                                                            }
                                                        } else {
                                                            i8 = length;
                                                            i9 = i14;
                                                            j4 = j7;
                                                            obj4 = obj5;
                                                            i10 = i19;
                                                        }
                                                        j7 = j4 >> 8;
                                                        i19 = i10 + 1;
                                                        i16 = 8;
                                                        length = i8;
                                                        i14 = i9;
                                                        obj5 = obj4;
                                                    }
                                                    i4 = length;
                                                    i5 = i14;
                                                    obj3 = obj5;
                                                    if (i18 != i16) {
                                                        break;
                                                    }
                                                } else {
                                                    i4 = length;
                                                    i5 = i14;
                                                    obj3 = obj5;
                                                }
                                                if (i17 == length2) {
                                                    break;
                                                }
                                                i17++;
                                                j6 = j3;
                                                length = i4;
                                                i14 = i5;
                                                obj5 = obj3;
                                                i16 = 8;
                                            }
                                            z = z3;
                                        }
                                    } else {
                                        i4 = length;
                                        i5 = i14;
                                        i6 = i15;
                                        obj3 = obj5;
                                        j3 = j6;
                                        C1645oh c1645oh2 = (C1645oh) e4;
                                        if (AbstractC0048Bt.h(c1645oh2.h().f, hashMap.get(c1645oh2))) {
                                            yd3.b(c1645oh2);
                                        } else {
                                            Object e6 = ((MD) c1818rJ4.i).e(c1645oh2);
                                            if (e6 != null) {
                                                if (e6 instanceof QD) {
                                                    QD qd5 = (QD) e6;
                                                    Object[] objArr8 = qd5.b;
                                                    long[] jArr6 = qd5.a;
                                                    int length4 = jArr6.length - 2;
                                                    if (length4 >= 0) {
                                                        int i23 = 0;
                                                        while (true) {
                                                            long j9 = jArr6[i23];
                                                            long[] jArr7 = jArr6;
                                                            Object[] objArr9 = objArr8;
                                                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i24 = 8 - ((~(i23 - length4)) >>> 31);
                                                                for (int i25 = 0; i25 < i24; i25++) {
                                                                    if ((j9 & 255) < 128) {
                                                                        qd.a(objArr9[(i23 << 3) + i25]);
                                                                        z = true;
                                                                    }
                                                                    j9 >>= 8;
                                                                }
                                                                if (i24 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i23 == length4) {
                                                                break;
                                                            }
                                                            i23++;
                                                            objArr8 = objArr9;
                                                            jArr6 = jArr7;
                                                        }
                                                    }
                                                } else {
                                                    qd.a(e6);
                                                    z = true;
                                                }
                                            }
                                        }
                                    }
                                    e3 = ((MD) c1818rJ4.i).e(obj3);
                                    if (e3 != null) {
                                        if (e3 instanceof QD) {
                                            QD qd6 = (QD) e3;
                                            Object[] objArr10 = qd6.b;
                                            long[] jArr8 = qd6.a;
                                            int length5 = jArr8.length - 2;
                                            if (length5 >= 0) {
                                                int i26 = 0;
                                                while (true) {
                                                    long j10 = jArr8[i26];
                                                    long[] jArr9 = jArr8;
                                                    Object[] objArr11 = objArr10;
                                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i27 = 8 - ((~(i26 - length5)) >>> 31);
                                                        for (int i28 = 0; i28 < i27; i28++) {
                                                            if ((j10 & 255) < 128) {
                                                                qd.a(objArr11[(i26 << 3) + i28]);
                                                                z = true;
                                                            }
                                                            j10 >>= 8;
                                                        }
                                                        if (i27 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i26 == length5) {
                                                        break;
                                                    }
                                                    i26++;
                                                    objArr10 = objArr11;
                                                    jArr8 = jArr9;
                                                }
                                            }
                                        } else {
                                            qd.a(e3);
                                            z = true;
                                        }
                                    }
                                    i7 = 8;
                                }
                                i4 = length;
                                i5 = i14;
                                i6 = i15;
                                obj3 = obj5;
                                j3 = j6;
                                e3 = ((MD) c1818rJ4.i).e(obj3);
                                if (e3 != null) {
                                }
                                i7 = 8;
                            } else {
                                jArr2 = jArr3;
                                objArr3 = objArr4;
                                i4 = length;
                                i5 = i14;
                                i6 = i15;
                                j3 = j6;
                                i7 = i11;
                            }
                            j6 = j3 >> i7;
                            i15 = i6 + 1;
                            i11 = i7;
                            jArr3 = jArr2;
                            objArr4 = objArr3;
                            length = i4;
                            i14 = i5;
                        }
                        jArr = jArr3;
                        objArr2 = objArr4;
                        int i29 = length;
                        if (i14 != i11) {
                            break;
                        }
                        length = i29;
                    } else {
                        jArr = jArr3;
                        objArr2 = objArr4;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i12 = i13 + 1;
                    jArr3 = jArr;
                    objArr4 = objArr2;
                    i11 = 8;
                }
            } else {
                j = -9187201950435737472L;
                z = false;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof GT) || ((GT) next).c(2)) {
                    if (((MD) c1818rJ3.i).b(next) && (e2 = ((MD) c1818rJ3.i).e(next)) != null) {
                        if (e2 instanceof QD) {
                            QD qd7 = (QD) e2;
                            Object[] objArr12 = qd7.b;
                            long[] jArr10 = qd7.a;
                            int length6 = jArr10.length - 2;
                            if (length6 >= 0) {
                                int i30 = 0;
                                while (true) {
                                    long j11 = jArr10[i30];
                                    long[] jArr11 = jArr10;
                                    Object[] objArr13 = objArr12;
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i31 = 8 - ((~(i30 - length6)) >>> 31);
                                        int i32 = 0;
                                        while (i32 < i31) {
                                            if ((j11 & 255) < 128) {
                                                it2 = it3;
                                                C1645oh c1645oh3 = (C1645oh) objArr13[(i30 << 3) + i32];
                                                AbstractC0048Bt.l(c1645oh3, str3);
                                                str2 = str3;
                                                c1818rJ2 = c1818rJ3;
                                                if (AbstractC0048Bt.h(c1645oh3.h().f, hashMap.get(c1645oh3))) {
                                                    obj2 = next;
                                                    j2 = j11;
                                                    yd3.b(c1645oh3);
                                                } else {
                                                    Object e7 = ((MD) c1818rJ4.i).e(c1645oh3);
                                                    if (e7 != null) {
                                                        if (e7 instanceof QD) {
                                                            QD qd8 = (QD) e7;
                                                            Object[] objArr14 = qd8.b;
                                                            long[] jArr12 = qd8.a;
                                                            int length7 = jArr12.length - 2;
                                                            if (length7 >= 0) {
                                                                j2 = j11;
                                                                int i33 = 0;
                                                                while (true) {
                                                                    long j12 = jArr12[i33];
                                                                    obj2 = next;
                                                                    Object[] objArr15 = objArr14;
                                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i34 = 8 - ((~(i33 - length7)) >>> 31);
                                                                        for (int i35 = 0; i35 < i34; i35++) {
                                                                            if ((j12 & 255) < 128) {
                                                                                qd.a(objArr15[(i33 << 3) + i35]);
                                                                                z = true;
                                                                            }
                                                                            j12 >>= 8;
                                                                        }
                                                                        if (i34 != 8) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i33 == length7) {
                                                                        break;
                                                                    }
                                                                    i33++;
                                                                    next = obj2;
                                                                    objArr14 = objArr15;
                                                                }
                                                            }
                                                        } else {
                                                            obj2 = next;
                                                            j2 = j11;
                                                            qd.a(e7);
                                                            z = true;
                                                        }
                                                    }
                                                    obj2 = next;
                                                }
                                                j11 = j2 >> 8;
                                                i32++;
                                                it3 = it2;
                                                str3 = str2;
                                                c1818rJ3 = c1818rJ2;
                                                next = obj2;
                                            } else {
                                                it2 = it3;
                                                obj2 = next;
                                                str2 = str3;
                                                c1818rJ2 = c1818rJ3;
                                            }
                                            j2 = j11;
                                            j11 = j2 >> 8;
                                            i32++;
                                            it3 = it2;
                                            str3 = str2;
                                            c1818rJ3 = c1818rJ2;
                                            next = obj2;
                                        }
                                        it = it3;
                                        obj = next;
                                        str = str3;
                                        c1818rJ = c1818rJ3;
                                        if (i31 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        obj = next;
                                        str = str3;
                                        c1818rJ = c1818rJ3;
                                    }
                                    if (i30 == length6) {
                                        break;
                                    }
                                    i30++;
                                    it3 = it;
                                    objArr12 = objArr13;
                                    jArr10 = jArr11;
                                    str3 = str;
                                    c1818rJ3 = c1818rJ;
                                    next = obj;
                                }
                            }
                        } else {
                            it = it3;
                            obj = next;
                            str = str3;
                            c1818rJ = c1818rJ3;
                            C1645oh c1645oh4 = (C1645oh) e2;
                            if (AbstractC0048Bt.h(c1645oh4.h().f, hashMap.get(c1645oh4))) {
                                yd3.b(c1645oh4);
                            } else {
                                Object e8 = ((MD) c1818rJ4.i).e(c1645oh4);
                                if (e8 != null) {
                                    if (e8 instanceof QD) {
                                        QD qd9 = (QD) e8;
                                        Object[] objArr16 = qd9.b;
                                        long[] jArr13 = qd9.a;
                                        int length8 = jArr13.length - 2;
                                        if (length8 >= 0) {
                                            int i36 = 0;
                                            while (true) {
                                                long j13 = jArr13[i36];
                                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i37 = 8 - ((~(i36 - length8)) >>> 31);
                                                    for (int i38 = 0; i38 < i37; i38++) {
                                                        if ((j13 & 255) < 128) {
                                                            qd.a(objArr16[(i36 << 3) + i38]);
                                                            z = true;
                                                        }
                                                        j13 >>= 8;
                                                    }
                                                    if (i37 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i36 == length8) {
                                                    break;
                                                }
                                                i36++;
                                            }
                                        }
                                    } else {
                                        qd.a(e8);
                                        z = true;
                                    }
                                }
                            }
                        }
                        e = ((MD) c1818rJ4.i).e(obj);
                        if (e != null) {
                            if (e instanceof QD) {
                                QD qd10 = (QD) e;
                                Object[] objArr17 = qd10.b;
                                long[] jArr14 = qd10.a;
                                int length9 = jArr14.length - 2;
                                if (length9 >= 0) {
                                    while (true) {
                                        long j14 = jArr14[i];
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i39 = 8 - ((~(i - length9)) >>> 31);
                                            for (int i40 = 0; i40 < i39; i40++) {
                                                if ((j14 & 255) < 128) {
                                                    qd.a(objArr17[(i << 3) + i40]);
                                                    z = true;
                                                }
                                                j14 >>= 8;
                                            }
                                            if (i39 != 8) {
                                                break;
                                            }
                                        }
                                        i = i != length9 ? i + 1 : 0;
                                    }
                                }
                            } else {
                                qd.a(e);
                                z = true;
                            }
                        }
                    }
                    it = it3;
                    obj = next;
                    str = str3;
                    c1818rJ = c1818rJ3;
                    e = ((MD) c1818rJ4.i).e(obj);
                    if (e != null) {
                    }
                } else {
                    it = it3;
                    str = str3;
                    c1818rJ = c1818rJ3;
                }
                it3 = it;
                str3 = str;
                c1818rJ3 = c1818rJ;
            }
        }
        if (yd3.l()) {
            int i41 = yd3.j;
            if (i41 > 0) {
                Object[] objArr18 = yd3.h;
                int i42 = 0;
                while (true) {
                    C1645oh c1645oh5 = (C1645oh) objArr18[i42];
                    int d = AbstractC2025uS.k().d();
                    Object e9 = ((MD) c1818rJ4.i).e(c1645oh5);
                    if (e9 != null) {
                        boolean z4 = e9 instanceof QD;
                        MD md = this.f;
                        if (z4) {
                            QD qd11 = (QD) e9;
                            Object[] objArr19 = qd11.b;
                            long[] jArr15 = qd11.a;
                            int length10 = jArr15.length - 2;
                            if (length10 >= 0) {
                                int i43 = 0;
                                while (true) {
                                    long j15 = jArr15[i43];
                                    objArr = objArr18;
                                    i2 = i42;
                                    if ((((~j15) << c) & j15 & j) != j) {
                                        int i44 = 8 - ((~(i43 - length10)) >>> 31);
                                        int i45 = 0;
                                        while (i45 < i44) {
                                            if ((j15 & 255) < 128) {
                                                i3 = i45;
                                                Object obj6 = objArr19[(i43 << 3) + i45];
                                                GD gd2 = (GD) md.e(obj6);
                                                yd2 = yd3;
                                                if (gd2 == null) {
                                                    gd = new GD();
                                                    md.i(obj6, gd);
                                                } else {
                                                    gd = gd2;
                                                }
                                                c(c1645oh5, d, obj6, gd);
                                            } else {
                                                i3 = i45;
                                                yd2 = yd3;
                                            }
                                            j15 >>= 8;
                                            i45 = i3 + 1;
                                            yd3 = yd2;
                                        }
                                        yd = yd3;
                                        if (i44 != 8) {
                                            break;
                                        }
                                    } else {
                                        yd = yd3;
                                    }
                                    if (i43 == length10) {
                                        break;
                                    }
                                    i43++;
                                    i42 = i2;
                                    objArr18 = objArr;
                                    yd3 = yd;
                                }
                            } else {
                                objArr = objArr18;
                                i2 = i42;
                                yd = yd3;
                            }
                        } else {
                            objArr = objArr18;
                            i2 = i42;
                            yd = yd3;
                            GD gd3 = (GD) md.e(e9);
                            if (gd3 == null) {
                                gd3 = new GD();
                                md.i(e9, gd3);
                            }
                            c(c1645oh5, d, e9, gd3);
                        }
                    } else {
                        objArr = objArr18;
                        i2 = i42;
                        yd = yd3;
                    }
                    int i46 = i2 + 1;
                    if (i46 >= i41) {
                        break;
                    }
                    i42 = i46;
                    objArr18 = objArr;
                    yd3 = yd;
                }
            } else {
                yd = yd3;
            }
            yd.h();
        }
        return z;
    }

    public final void c(Object obj, int i, Object obj2, GD gd) {
        int i2;
        if (this.j > 0) {
            return;
        }
        int b = gd.b(obj);
        if (b < 0) {
            b = ~b;
            i2 = -1;
        } else {
            i2 = gd.c[b];
        }
        gd.b[b] = obj;
        gd.c[b] = i;
        if ((obj instanceof C1645oh) && i2 != i) {
            C1513mh h = ((C1645oh) obj).h();
            this.l.put(obj, h.f);
            GD gd2 = h.e;
            C1818rJ c1818rJ = this.k;
            c1818rJ.f(obj);
            Object[] objArr = gd2.b;
            long[] jArr = gd2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                GT gt = (GT) objArr[(i3 << 3) + i5];
                                if (gt instanceof GT) {
                                    gt.f(2);
                                }
                                c1818rJ.b(gt, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof GT) {
                ((GT) obj).f(2);
            }
            this.e.b(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        C1818rJ c1818rJ = this.e;
        c1818rJ.e(obj2, obj);
        if (!(obj2 instanceof C1645oh) || ((MD) c1818rJ.i).b(obj2)) {
            return;
        }
        this.k.f(obj2);
        this.l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        MD md = this.f;
        long[] jArr3 = md.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = md.b[i6];
                        j2 = j5;
                        GD gd = (GD) md.c[i6];
                        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean j6 = ((InterfaceC0699aH) obj).j();
                        if (!j6) {
                            Object[] objArr = gd.b;
                            int[] iArr = gd.c;
                            long[] jArr4 = gd.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j7 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = j6;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j7 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j7;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                d(obj, obj2);
                                            } else {
                                                j3 = j7;
                                            }
                                            j7 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    j6 = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    md.h(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = j6;
                        if (!z) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
