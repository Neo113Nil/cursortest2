package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hs0 {
    public final mu a;
    public Object b;
    public w60 c;
    public int j;
    public int d = -1;
    public final a70 e = ld0.g();
    public final a70 f = new a70();
    public final b70 g = new b70();
    public final l70 h = new l70(new yl[16]);
    public final oh i = new oh(1, this);
    public final a70 k = ld0.g();
    public final HashMap l = new HashMap();

    public hs0(mu muVar) {
        this.a = muVar;
    }

    public final void a(Object obj, h hVar, bu buVar) {
        boolean z;
        int i;
        int i2;
        Object obj2 = this.b;
        w60 w60Var = this.c;
        int i3 = this.d;
        this.b = obj;
        this.c = (w60) this.f.g(obj);
        if (this.d == -1) {
            long g = ur0.k().g();
            this.d = (int) (g ^ (g >>> 32));
        }
        oh ohVar = this.i;
        l70 h = ud0.h();
        boolean z2 = true;
        try {
            h.b(ohVar);
            yc0.h(hVar, buVar);
            h.j(h.f - 1);
            Object obj3 = this.b;
            obj3.getClass();
            int i4 = this.d;
            w60 w60Var2 = this.c;
            if (w60Var2 != null) {
                long[] jArr = w60Var2.a;
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
                                    Object obj4 = w60Var2.b[i9];
                                    i = i8;
                                    boolean z3 = w60Var2.c[i9] != i4 ? z : false;
                                    if (z3) {
                                        d(obj3, obj4);
                                    }
                                    if (z3) {
                                        w60Var2.g(i9);
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
            this.b = obj2;
            this.c = w60Var;
            this.d = i3;
        } catch (Throwable th) {
            h.j(h.f - 1);
            throw th;
        }
    }

    public final boolean b(Set set) {
        char c;
        long j;
        boolean z;
        Iterator it;
        HashMap hashMap;
        a70 a70Var;
        int i;
        Object g;
        HashMap hashMap2;
        a70 a70Var2;
        long[] jArr;
        Iterator it2;
        HashMap hashMap3;
        a70 a70Var3;
        a70 a70Var4;
        long[] jArr2;
        long j2;
        int i2;
        int i3;
        Object[] objArr;
        l70 l70Var;
        int i4;
        l70 l70Var2;
        w60 w60Var;
        long[] jArr3;
        Object[] objArr2;
        a70 a70Var5;
        int i5;
        long[] jArr4;
        Object[] objArr3;
        int i6;
        int i7;
        long j3;
        int i8;
        int i9;
        a70 a70Var6;
        int i10;
        Object obj;
        Object obj2;
        Object[] objArr4;
        int i11;
        int i12;
        long j4;
        Object[] objArr5;
        Object obj3;
        int i13;
        long j5;
        boolean z2 = set instanceof xn0;
        l70 l70Var3 = this.h;
        int i14 = 8;
        a70 a70Var7 = this.k;
        HashMap hashMap4 = this.l;
        a70 a70Var8 = this.e;
        b70 b70Var = this.g;
        if (z2) {
            b70 b70Var2 = ((xn0) set).d;
            Object[] objArr6 = b70Var2.b;
            long[] jArr5 = b70Var2.a;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i15 = 0;
                c = 7;
                z = false;
                j = -9187201950435737472L;
                while (true) {
                    long j6 = jArr5[i15];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j6 & 255) < 128) {
                                int i18 = i14;
                                Object obj4 = objArr6[(i15 << 3) + i17];
                                if (obj4 instanceof it0) {
                                    jArr4 = jArr5;
                                    if (!((it0) obj4).e(2)) {
                                        objArr3 = objArr6;
                                        i6 = length;
                                        i7 = i15;
                                        j3 = j6;
                                        i8 = i16;
                                        i9 = i17;
                                        a70Var6 = a70Var7;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr4 = jArr5;
                                }
                                if (a70Var7.c(obj4)) {
                                    Object g2 = a70Var7.g(obj4);
                                    if (g2 != null) {
                                        if (g2 instanceof b70) {
                                            b70 b70Var3 = (b70) g2;
                                            Object[] objArr7 = b70Var3.b;
                                            long[] jArr6 = b70Var3.a;
                                            objArr3 = objArr6;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                j3 = j6;
                                                int i19 = 0;
                                                Object[] objArr8 = objArr7;
                                                while (true) {
                                                    long j7 = jArr6[i19];
                                                    i9 = i17;
                                                    a70Var6 = a70Var7;
                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                        int i21 = 0;
                                                        while (i21 < i20) {
                                                            if ((j7 & 255) < 128) {
                                                                j4 = j7;
                                                                yl ylVar = (yl) objArr8[(i19 << 3) + i21];
                                                                ylVar.getClass();
                                                                objArr5 = objArr8;
                                                                if (nz.l(ylVar.h().f, hashMap4.get(ylVar))) {
                                                                    i11 = length;
                                                                    i12 = i15;
                                                                    obj3 = obj4;
                                                                    i13 = i16;
                                                                    l70Var3.b(ylVar);
                                                                } else {
                                                                    Object g3 = a70Var8.g(ylVar);
                                                                    if (g3 != null) {
                                                                        if (g3 instanceof b70) {
                                                                            b70 b70Var4 = (b70) g3;
                                                                            Object[] objArr9 = b70Var4.b;
                                                                            long[] jArr7 = b70Var4.a;
                                                                            int length3 = jArr7.length - 2;
                                                                            if (length3 >= 0) {
                                                                                i11 = length;
                                                                                i12 = i15;
                                                                                int i22 = 0;
                                                                                while (true) {
                                                                                    long j8 = jArr7[i22];
                                                                                    obj3 = obj4;
                                                                                    i13 = i16;
                                                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                                                                        for (int i24 = 0; i24 < i23; i24++) {
                                                                                            if ((j8 & 255) < 128) {
                                                                                                j5 = j8;
                                                                                                b70Var.a(objArr9[(i22 << 3) + i24]);
                                                                                                z = true;
                                                                                            } else {
                                                                                                j5 = j8;
                                                                                            }
                                                                                            j8 = j5 >> i18;
                                                                                        }
                                                                                        if (i23 != i18) {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (i22 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i22++;
                                                                                    i16 = i13;
                                                                                    obj4 = obj3;
                                                                                    i18 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i11 = length;
                                                                            i12 = i15;
                                                                            obj3 = obj4;
                                                                            i13 = i16;
                                                                            b70Var.a(g3);
                                                                            z = true;
                                                                        }
                                                                    }
                                                                    i11 = length;
                                                                    i12 = i15;
                                                                }
                                                                j7 = j4 >> 8;
                                                                i21++;
                                                                i18 = 8;
                                                                objArr8 = objArr5;
                                                                length = i11;
                                                                i15 = i12;
                                                                i16 = i13;
                                                                obj4 = obj3;
                                                            } else {
                                                                i11 = length;
                                                                i12 = i15;
                                                                j4 = j7;
                                                                objArr5 = objArr8;
                                                            }
                                                            obj3 = obj4;
                                                            i13 = i16;
                                                            j7 = j4 >> 8;
                                                            i21++;
                                                            i18 = 8;
                                                            objArr8 = objArr5;
                                                            length = i11;
                                                            i15 = i12;
                                                            i16 = i13;
                                                            obj4 = obj3;
                                                        }
                                                        i6 = length;
                                                        i7 = i15;
                                                        objArr4 = objArr8;
                                                        obj2 = obj4;
                                                        i8 = i16;
                                                        if (i20 != i18) {
                                                            break;
                                                        }
                                                    } else {
                                                        i6 = length;
                                                        i7 = i15;
                                                        objArr4 = objArr8;
                                                        obj2 = obj4;
                                                        i8 = i16;
                                                    }
                                                    if (i19 == length2) {
                                                        break;
                                                    }
                                                    i19++;
                                                    a70Var7 = a70Var6;
                                                    i17 = i9;
                                                    objArr8 = objArr4;
                                                    length = i6;
                                                    i15 = i7;
                                                    i16 = i8;
                                                    obj4 = obj2;
                                                    i18 = 8;
                                                }
                                            }
                                        } else {
                                            objArr3 = objArr6;
                                            i6 = length;
                                            i7 = i15;
                                            j3 = j6;
                                            obj2 = obj4;
                                            i8 = i16;
                                            i9 = i17;
                                            a70Var6 = a70Var7;
                                            yl ylVar2 = (yl) g2;
                                            if (nz.l(ylVar2.h().f, hashMap4.get(ylVar2))) {
                                                l70Var3.b(ylVar2);
                                            } else {
                                                Object g4 = a70Var8.g(ylVar2);
                                                if (g4 != null) {
                                                    if (g4 instanceof b70) {
                                                        b70 b70Var5 = (b70) g4;
                                                        Object[] objArr10 = b70Var5.b;
                                                        long[] jArr8 = b70Var5.a;
                                                        int length4 = jArr8.length - 2;
                                                        if (length4 >= 0) {
                                                            int i25 = 0;
                                                            while (true) {
                                                                long j9 = jArr8[i25];
                                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i26 = 8 - ((~(i25 - length4)) >>> 31);
                                                                    for (int i27 = 0; i27 < i26; i27++) {
                                                                        if ((j9 & 255) < 128) {
                                                                            b70Var.a(objArr10[(i25 << 3) + i27]);
                                                                            z = true;
                                                                        }
                                                                        j9 >>= 8;
                                                                    }
                                                                    if (i26 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i25 == length4) {
                                                                    break;
                                                                }
                                                                i25++;
                                                            }
                                                        }
                                                    } else {
                                                        b70Var.a(g4);
                                                        z = true;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        objArr3 = objArr6;
                                    }
                                    i6 = length;
                                    i7 = i15;
                                    j3 = j6;
                                    obj2 = obj4;
                                    i8 = i16;
                                    i9 = i17;
                                    a70Var6 = a70Var7;
                                    obj = obj2;
                                } else {
                                    objArr3 = objArr6;
                                    i6 = length;
                                    i7 = i15;
                                    j3 = j6;
                                    i8 = i16;
                                    i9 = i17;
                                    a70Var6 = a70Var7;
                                    obj = obj4;
                                }
                                Object g5 = a70Var8.g(obj);
                                if (g5 != null) {
                                    if (g5 instanceof b70) {
                                        b70 b70Var6 = (b70) g5;
                                        Object[] objArr11 = b70Var6.b;
                                        long[] jArr9 = b70Var6.a;
                                        int length5 = jArr9.length - 2;
                                        if (length5 >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                long j10 = jArr9[i28];
                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i29 = 8 - ((~(i28 - length5)) >>> 31);
                                                    for (int i30 = 0; i30 < i29; i30++) {
                                                        if ((j10 & 255) < 128) {
                                                            b70Var.a(objArr11[(i28 << 3) + i30]);
                                                            z = true;
                                                        }
                                                        j10 >>= 8;
                                                    }
                                                    if (i29 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i28 == length5) {
                                                    break;
                                                }
                                                i28++;
                                            }
                                        }
                                    } else {
                                        b70Var.a(g5);
                                        z = true;
                                    }
                                }
                                i10 = 8;
                            } else {
                                jArr4 = jArr5;
                                objArr3 = objArr6;
                                i6 = length;
                                i7 = i15;
                                j3 = j6;
                                i8 = i16;
                                i9 = i17;
                                a70Var6 = a70Var7;
                                i10 = i14;
                            }
                            j6 = j3 >> i10;
                            i17 = i9 + 1;
                            jArr5 = jArr4;
                            i14 = i10;
                            objArr6 = objArr3;
                            a70Var7 = a70Var6;
                            length = i6;
                            i15 = i7;
                            i16 = i8;
                        }
                        jArr3 = jArr5;
                        objArr2 = objArr6;
                        int i31 = length;
                        int i32 = i15;
                        a70Var5 = a70Var7;
                        if (i16 != i14) {
                            break;
                        }
                        length = i31;
                        i5 = i32;
                    } else {
                        jArr3 = jArr5;
                        objArr2 = objArr6;
                        a70Var5 = a70Var7;
                        i5 = i15;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i15 = i5 + 1;
                    jArr5 = jArr3;
                    objArr6 = objArr2;
                    a70Var7 = a70Var5;
                    i14 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                z = false;
            }
        } else {
            a70 a70Var9 = a70Var7;
            c = 7;
            j = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof it0) || ((it0) next).e(2)) {
                    a70 a70Var10 = a70Var9;
                    if (!a70Var10.c(next) || (g = a70Var10.g(next)) == null) {
                        it = it3;
                        hashMap = hashMap4;
                        a70Var = a70Var8;
                        a70Var9 = a70Var10;
                    } else if (g instanceof b70) {
                        b70 b70Var7 = (b70) g;
                        Object[] objArr12 = b70Var7.b;
                        long[] jArr10 = b70Var7.a;
                        int length6 = jArr10.length - 2;
                        if (length6 >= 0) {
                            int i33 = 0;
                            while (true) {
                                long j11 = jArr10[i33];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i34 = 8 - ((~(i33 - length6)) >>> 31);
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        if ((j11 & 255) < 128) {
                                            it2 = it3;
                                            yl ylVar3 = (yl) objArr12[(i33 << 3) + i35];
                                            ylVar3.getClass();
                                            a70Var4 = a70Var10;
                                            jArr2 = jArr10;
                                            if (nz.l(ylVar3.h().f, hashMap4.get(ylVar3))) {
                                                hashMap3 = hashMap4;
                                                a70Var3 = a70Var8;
                                                j2 = j11;
                                                l70Var3.b(ylVar3);
                                            } else {
                                                Object g6 = a70Var8.g(ylVar3);
                                                if (g6 != null) {
                                                    if (g6 instanceof b70) {
                                                        b70 b70Var8 = (b70) g6;
                                                        Object[] objArr13 = b70Var8.b;
                                                        long[] jArr11 = b70Var8.a;
                                                        int length7 = jArr11.length - 2;
                                                        if (length7 >= 0) {
                                                            j2 = j11;
                                                            int i36 = 0;
                                                            while (true) {
                                                                long j12 = jArr11[i36];
                                                                hashMap3 = hashMap4;
                                                                a70Var3 = a70Var8;
                                                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i37 = 8 - ((~(i36 - length7)) >>> 31);
                                                                    for (int i38 = 0; i38 < i37; i38 = i2 + 1) {
                                                                        if ((j12 & 255) < 128) {
                                                                            i2 = i38;
                                                                            b70Var.a(objArr13[(i36 << 3) + i38]);
                                                                            z = true;
                                                                        } else {
                                                                            i2 = i38;
                                                                        }
                                                                        j12 >>= 8;
                                                                    }
                                                                    if (i37 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i36 == length7) {
                                                                    break;
                                                                }
                                                                i36++;
                                                                a70Var8 = a70Var3;
                                                                hashMap4 = hashMap3;
                                                            }
                                                        }
                                                    } else {
                                                        hashMap3 = hashMap4;
                                                        a70Var3 = a70Var8;
                                                        j2 = j11;
                                                        b70Var.a(g6);
                                                        z = true;
                                                    }
                                                }
                                                hashMap3 = hashMap4;
                                                a70Var3 = a70Var8;
                                            }
                                            j11 = j2 >> 8;
                                            i35++;
                                            it3 = it2;
                                            jArr10 = jArr2;
                                            a70Var10 = a70Var4;
                                            a70Var8 = a70Var3;
                                            hashMap4 = hashMap3;
                                        } else {
                                            it2 = it3;
                                            hashMap3 = hashMap4;
                                            a70Var3 = a70Var8;
                                            a70Var4 = a70Var10;
                                            jArr2 = jArr10;
                                        }
                                        j2 = j11;
                                        j11 = j2 >> 8;
                                        i35++;
                                        it3 = it2;
                                        jArr10 = jArr2;
                                        a70Var10 = a70Var4;
                                        a70Var8 = a70Var3;
                                        hashMap4 = hashMap3;
                                    }
                                    it = it3;
                                    hashMap2 = hashMap4;
                                    a70Var2 = a70Var8;
                                    a70Var9 = a70Var10;
                                    jArr = jArr10;
                                    if (i34 != 8) {
                                        break;
                                    }
                                } else {
                                    it = it3;
                                    hashMap2 = hashMap4;
                                    a70Var2 = a70Var8;
                                    a70Var9 = a70Var10;
                                    jArr = jArr10;
                                }
                                if (i33 == length6) {
                                    break;
                                }
                                i33++;
                                it3 = it;
                                jArr10 = jArr;
                                a70Var10 = a70Var9;
                                a70Var8 = a70Var2;
                                hashMap4 = hashMap2;
                            }
                        } else {
                            it = it3;
                            hashMap2 = hashMap4;
                            a70Var2 = a70Var8;
                            a70Var9 = a70Var10;
                        }
                        a70Var = a70Var2;
                        hashMap = hashMap2;
                    } else {
                        it = it3;
                        a70 a70Var11 = a70Var8;
                        a70Var9 = a70Var10;
                        yl ylVar4 = (yl) g;
                        hashMap = hashMap4;
                        if (nz.l(ylVar4.h().f, hashMap.get(ylVar4))) {
                            a70Var = a70Var11;
                            l70Var3.b(ylVar4);
                        } else {
                            a70Var = a70Var11;
                            Object g7 = a70Var.g(ylVar4);
                            if (g7 != null) {
                                if (g7 instanceof b70) {
                                    b70 b70Var9 = (b70) g7;
                                    Object[] objArr14 = b70Var9.b;
                                    long[] jArr12 = b70Var9.a;
                                    int length8 = jArr12.length - 2;
                                    if (length8 >= 0) {
                                        int i39 = 0;
                                        while (true) {
                                            long j13 = jArr12[i39];
                                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i40 = 8 - ((~(i39 - length8)) >>> 31);
                                                for (int i41 = 0; i41 < i40; i41++) {
                                                    if ((j13 & 255) < 128) {
                                                        b70Var.a(objArr14[(i39 << 3) + i41]);
                                                        z = true;
                                                    }
                                                    j13 >>= 8;
                                                }
                                                if (i40 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i39 == length8) {
                                                break;
                                            }
                                            i39++;
                                        }
                                    }
                                } else {
                                    b70Var.a(g7);
                                    z = true;
                                }
                            }
                        }
                    }
                    Object g8 = a70Var.g(next);
                    if (g8 != null) {
                        if (g8 instanceof b70) {
                            b70 b70Var10 = (b70) g8;
                            Object[] objArr15 = b70Var10.b;
                            long[] jArr13 = b70Var10.a;
                            int length9 = jArr13.length - 2;
                            if (length9 >= 0) {
                                while (true) {
                                    long j14 = jArr13[i];
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i42 = 8 - ((~(i - length9)) >>> 31);
                                        for (int i43 = 0; i43 < i42; i43++) {
                                            if ((j14 & 255) < 128) {
                                                b70Var.a(objArr15[(i << 3) + i43]);
                                                z = true;
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i42 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length9 ? i + 1 : 0;
                                }
                            }
                        } else {
                            b70Var.a(g8);
                            z = true;
                        }
                    }
                } else {
                    it = it3;
                    hashMap = hashMap4;
                    a70Var = a70Var8;
                }
                a70Var8 = a70Var;
                hashMap4 = hashMap;
                it3 = it;
            }
        }
        a70 a70Var12 = a70Var8;
        int i44 = l70Var3.f;
        if (i44 != 0) {
            Object[] objArr16 = l70Var3.d;
            int i45 = 0;
            while (i45 < i44) {
                yl ylVar5 = (yl) objArr16[i45];
                long g9 = ur0.k().g();
                int i46 = (int) (g9 ^ (g9 >>> 32));
                Object g10 = a70Var12.g(ylVar5);
                if (g10 != null) {
                    boolean z3 = g10 instanceof b70;
                    a70 a70Var13 = this.f;
                    if (z3) {
                        b70 b70Var11 = (b70) g10;
                        Object[] objArr17 = b70Var11.b;
                        long[] jArr14 = b70Var11.a;
                        int length10 = jArr14.length - 2;
                        if (length10 >= 0) {
                            int i47 = 0;
                            while (true) {
                                long j15 = jArr14[i47];
                                i3 = i44;
                                objArr = objArr16;
                                if ((((~j15) << c) & j15 & j) != j) {
                                    int i48 = 8 - ((~(i47 - length10)) >>> 31);
                                    int i49 = 0;
                                    while (i49 < i48) {
                                        if ((j15 & 255) < 128) {
                                            i4 = i49;
                                            Object obj5 = objArr17[(i47 << 3) + i49];
                                            w60 w60Var2 = (w60) a70Var13.g(obj5);
                                            l70Var2 = l70Var3;
                                            if (w60Var2 == null) {
                                                w60Var = new w60();
                                                a70Var13.m(obj5, w60Var);
                                            } else {
                                                w60Var = w60Var2;
                                            }
                                            c(ylVar5, i46, obj5, w60Var);
                                        } else {
                                            i4 = i49;
                                            l70Var2 = l70Var3;
                                        }
                                        j15 >>= 8;
                                        i49 = i4 + 1;
                                        l70Var3 = l70Var2;
                                    }
                                    l70Var = l70Var3;
                                    if (i48 != 8) {
                                        break;
                                    }
                                } else {
                                    l70Var = l70Var3;
                                }
                                if (i47 != length10) {
                                    i47++;
                                    i44 = i3;
                                    objArr16 = objArr;
                                    l70Var3 = l70Var;
                                }
                            }
                        } else {
                            i3 = i44;
                            objArr = objArr16;
                            l70Var = l70Var3;
                        }
                    } else {
                        i3 = i44;
                        objArr = objArr16;
                        l70Var = l70Var3;
                        w60 w60Var3 = (w60) a70Var13.g(g10);
                        if (w60Var3 == null) {
                            w60Var3 = new w60();
                            a70Var13.m(g10, w60Var3);
                        }
                        c(ylVar5, i46, g10, w60Var3);
                    }
                } else {
                    i3 = i44;
                    objArr = objArr16;
                    l70Var = l70Var3;
                }
                i45++;
                i44 = i3;
                objArr16 = objArr;
                l70Var3 = l70Var;
            }
            l70Var3.g();
        }
        return z;
    }

    public final void c(Object obj, int i, Object obj2, w60 w60Var) {
        int i2;
        if (this.j > 0) {
            return;
        }
        int c = w60Var.c(obj);
        if (c < 0) {
            c = ~c;
            i2 = -1;
        } else {
            i2 = w60Var.c[c];
        }
        w60Var.b[c] = obj;
        w60Var.c[c] = i;
        if ((obj instanceof yl) && i2 != i) {
            xl h = ((yl) obj).h();
            this.l.put(obj, h.f);
            w60 w60Var2 = h.e;
            a70 a70Var = this.k;
            ld0.p(a70Var, obj);
            Object[] objArr = w60Var2.b;
            long[] jArr = w60Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                ht0 ht0Var = (ht0) objArr[(i3 << 3) + i5];
                                if (ht0Var instanceof it0) {
                                    ((it0) ht0Var).f(2);
                                }
                                ld0.e(a70Var, ht0Var, obj);
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
            if (obj instanceof it0) {
                ((it0) obj).f(2);
            }
            ld0.e(this.e, obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        a70 a70Var = this.e;
        ld0.o(a70Var, obj2, obj);
        if (!(obj2 instanceof yl) || a70Var.c(obj2)) {
            return;
        }
        ld0.p(this.k, obj2);
        this.l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
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
        a70 a70Var = this.f;
        long[] jArr3 = a70Var.a;
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
                        Object obj = a70Var.b[i6];
                        j2 = j5;
                        w60 w60Var = (w60) a70Var.c[i6];
                        obj.getClass();
                        boolean q = ((ed0) obj).q();
                        if (!q) {
                            Object[] objArr = w60Var.b;
                            int[] iArr = w60Var.c;
                            long[] jArr4 = w60Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = q;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                d(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    q = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    a70Var.l(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = q;
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
