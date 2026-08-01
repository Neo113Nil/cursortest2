package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class kx0 {
    public static final kx0 e = new kx0(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final y7 c;
    public Object[] d;

    public kx0(int i, int i2, Object[] objArr, y7 y7Var) {
        this.a = i;
        this.b = i2;
        this.c = y7Var;
        this.d = objArr;
    }

    public static kx0 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, y7 y7Var) {
        if (i3 > 30) {
            return new kx0(0, 0, new Object[]{obj, obj2, obj3, obj4}, y7Var);
        }
        int l = ld0.l(i, i3);
        int l2 = ld0.l(i2, i3);
        if (l != l2) {
            return new kx0((1 << l) | (1 << l2), 0, l < l2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, y7Var);
        }
        return new kx0(0, 1 << l, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, y7Var)}, y7Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, y7 y7Var) {
        Object obj3 = this.d[i];
        kx0 j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, y7Var);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        p8.V(objArr, objArr2, 0, i, 6);
        p8.T(objArr, objArr2, i, i + 2, i5);
        objArr2[t - 1] = j;
        p8.T(objArr, objArr2, t, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        cz r = rg0.r(rg0.v(0, this.d.length));
        int i = r.d;
        int i2 = r.e;
        int i3 = r.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!nz.l(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int l = 1 << ld0.l(i, i2);
        if (h(l)) {
            return nz.l(obj, this.d[f(l)]);
        }
        if (!i(l)) {
            return false;
        }
        kx0 s = s(t(l));
        return i2 == 30 ? s.c(obj) : s.d(i, i2 + 5, obj);
    }

    public final boolean e(kx0 kx0Var) {
        if (this == kx0Var) {
            return true;
        }
        if (this.b == kx0Var.b && this.a == kx0Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == kx0Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int l = 1 << ld0.l(i, i2);
        if (h(l)) {
            int f = f(l);
            if (nz.l(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(l)) {
            return null;
        }
        kx0 s = s(t(l));
        if (i2 != 30) {
            return s.g(i, i2 + 5, obj);
        }
        cz r = rg0.r(rg0.v(0, s.d.length));
        int i3 = r.d;
        int i4 = r.e;
        int i5 = r.f;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!nz.l(obj, s.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return s.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final kx0 k(int i, jf0 jf0Var) {
        jf0Var.a(jf0Var.h - 1);
        jf0Var.f = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != jf0Var.d) {
            return new kx0(0, 0, ld0.c(i, objArr), jf0Var.d);
        }
        this.d = ld0.c(i, objArr);
        return this;
    }

    public final kx0 l(int i, Object obj, Object obj2, int i2, jf0 jf0Var) {
        jf0 jf0Var2;
        kx0 l;
        int l2 = 1 << ld0.l(i, i2);
        boolean h = h(l2);
        y7 y7Var = this.c;
        if (h) {
            int f = f(l2);
            if (!nz.l(obj, this.d[f])) {
                jf0Var.a(jf0Var.h + 1);
                y7 y7Var2 = jf0Var.d;
                if (y7Var != y7Var2) {
                    return new kx0(this.a ^ l2, this.b | l2, a(f, l2, i, obj, obj2, i2, y7Var2), y7Var2);
                }
                this.d = a(f, l2, i, obj, obj2, i2, y7Var2);
                this.a ^= l2;
                this.b |= l2;
                return this;
            }
            jf0Var.f = x(f);
            if (x(f) == obj2) {
                return this;
            }
            if (y7Var == jf0Var.d) {
                this.d[f + 1] = obj2;
                return this;
            }
            jf0Var.g++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f + 1] = obj2;
            return new kx0(this.a, this.b, copyOf, jf0Var.d);
        }
        if (!i(l2)) {
            jf0Var.a(jf0Var.h + 1);
            y7 y7Var3 = jf0Var.d;
            int f2 = f(l2);
            Object[] objArr2 = this.d;
            if (y7Var != y7Var3) {
                return new kx0(this.a | l2, this.b, ld0.b(objArr2, f2, obj, obj2), y7Var3);
            }
            this.d = ld0.b(objArr2, f2, obj, obj2);
            this.a |= l2;
            return this;
        }
        int t = t(l2);
        kx0 s = s(t);
        if (i2 == 30) {
            cz r = rg0.r(rg0.v(0, s.d.length));
            int i3 = r.d;
            int i4 = r.e;
            int i5 = r.f;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!nz.l(obj, s.d[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                jf0Var.f = s.x(i3);
                if (s.c == jf0Var.d) {
                    s.d[i3 + 1] = obj2;
                    l = s;
                } else {
                    jf0Var.g++;
                    Object[] objArr3 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    l = new kx0(0, 0, copyOf2, jf0Var.d);
                }
                jf0Var2 = jf0Var;
            }
            jf0Var.a(jf0Var.h + 1);
            l = new kx0(0, 0, ld0.b(s.d, 0, obj, obj2), jf0Var.d);
            jf0Var2 = jf0Var;
        } else {
            jf0Var2 = jf0Var;
            l = s.l(i, obj, obj2, i2 + 5, jf0Var2);
        }
        return s == l ? this : r(t, l, jf0Var2.d);
    }

    public final kx0 m(kx0 kx0Var, int i, rl rlVar, jf0 jf0Var) {
        Object[] objArr;
        kx0 j;
        if (this == kx0Var) {
            rlVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            y7 y7Var = jf0Var.d;
            int i3 = kx0Var.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + kx0Var.d.length);
            int length = this.d.length;
            cz r = rg0.r(rg0.v(0, kx0Var.d.length));
            int i4 = r.d;
            int i5 = r.e;
            int i6 = r.f;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(kx0Var.d[i4])) {
                        rlVar.a++;
                    } else {
                        Object[] objArr3 = kx0Var.d;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == kx0Var.d.length ? kx0Var : length == copyOf.length ? new kx0(0, 0, copyOf, y7Var) : new kx0(0, 0, Arrays.copyOf(copyOf, length), y7Var);
            }
        } else {
            int i7 = this.b | kx0Var.b;
            int i8 = this.a;
            int i9 = kx0Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (nz.l(this.d[f(lowestOneBit)], kx0Var.d[kx0Var.f(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                gh0.b("Check failed.");
            }
            kx0 kx0Var2 = (nz.l(this.c, jf0Var.d) && this.a == i12 && this.b == i7) ? this : new kx0(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = kx0Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (kx0Var.i(lowestOneBit2)) {
                        j = j.m(kx0Var.s(kx0Var.t(lowestOneBit2)), i + 5, rlVar, jf0Var);
                        objArr = objArr4;
                    } else if (kx0Var.h(lowestOneBit2)) {
                        int f = kx0Var.f(lowestOneBit2);
                        Object obj = kx0Var.d[f];
                        Object x = kx0Var.x(f);
                        int i15 = jf0Var.h;
                        objArr = objArr4;
                        j = j.l(obj != null ? obj.hashCode() : i2, obj, x, i + 5, jf0Var);
                        if (jf0Var.h == i15) {
                            rlVar.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (kx0Var.i(lowestOneBit2)) {
                        kx0 s = kx0Var.s(kx0Var.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            int i16 = i + 5;
                            if (s.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                rlVar.a++;
                            } else {
                                j = s.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f2), i16, jf0Var);
                            }
                        }
                        j = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x2 = x(f3);
                        int f4 = kx0Var.f(lowestOneBit2);
                        Object obj4 = kx0Var.d[f4];
                        j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, kx0Var.x(f4), i + 5, jf0Var.d);
                    }
                }
                objArr[length2] = j;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (kx0Var.h(lowestOneBit3)) {
                    int f5 = kx0Var.f(lowestOneBit3);
                    Object[] objArr5 = kx0Var2.d;
                    objArr5[i18] = kx0Var.d[f5];
                    objArr5[i18 + 1] = kx0Var.x(f5);
                    if (h(lowestOneBit3)) {
                        rlVar.a++;
                    }
                } else {
                    int f6 = f(lowestOneBit3);
                    Object[] objArr6 = kx0Var2.d;
                    objArr6[i18] = this.d[f6];
                    objArr6[i18 + 1] = x(f6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!e(kx0Var2)) {
                return kx0Var.e(kx0Var2) ? kx0Var : kx0Var2;
            }
        }
        return this;
    }

    public final kx0 n(int i, Object obj, int i2, jf0 jf0Var) {
        kx0 n;
        int l = 1 << ld0.l(i, i2);
        if (h(l)) {
            int f = f(l);
            if (nz.l(obj, this.d[f])) {
                return p(f, l, jf0Var);
            }
        } else if (i(l)) {
            int t = t(l);
            kx0 s = s(t);
            if (i2 == 30) {
                cz r = rg0.r(rg0.v(0, s.d.length));
                int i3 = r.d;
                int i4 = r.e;
                int i5 = r.f;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!nz.l(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, jf0Var);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, jf0Var);
            return q(s, n, t, l, jf0Var.d);
        }
        return this;
    }

    public final kx0 o(int i, Object obj, Object obj2, int i2, jf0 jf0Var) {
        jf0 jf0Var2;
        kx0 o;
        int l = 1 << ld0.l(i, i2);
        if (h(l)) {
            int f = f(l);
            return (nz.l(obj, this.d[f]) && nz.l(obj2, x(f))) ? p(f, l, jf0Var) : this;
        }
        if (!i(l)) {
            return this;
        }
        int t = t(l);
        kx0 s = s(t);
        if (i2 == 30) {
            cz r = rg0.r(rg0.v(0, s.d.length));
            int i3 = r.d;
            int i4 = r.e;
            int i5 = r.f;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!nz.l(obj, s.d[i3]) || !nz.l(obj2, s.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        o = s.k(i3, jf0Var);
                        break;
                    }
                }
            }
            o = s;
            jf0Var2 = jf0Var;
        } else {
            jf0Var2 = jf0Var;
            o = s.o(i, obj, obj2, i2 + 5, jf0Var2);
        }
        return q(s, o, t, l, jf0Var2.d);
    }

    public final kx0 p(int i, int i2, jf0 jf0Var) {
        jf0Var.a(jf0Var.h - 1);
        jf0Var.f = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != jf0Var.d) {
            return new kx0(i2 ^ this.a, this.b, ld0.c(i, objArr), jf0Var.d);
        }
        this.d = ld0.c(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final kx0 q(kx0 kx0Var, kx0 kx0Var2, int i, int i2, y7 y7Var) {
        y7 y7Var2 = this.c;
        if (kx0Var2 != null) {
            return (y7Var2 == y7Var || kx0Var != kx0Var2) ? r(i, kx0Var2, y7Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (y7Var2 != y7Var) {
            return new kx0(this.a, this.b ^ i2, ld0.d(i, objArr), y7Var);
        }
        this.d = ld0.d(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final kx0 r(int i, kx0 kx0Var, y7 y7Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && kx0Var.d.length == 2 && kx0Var.b == 0) {
            kx0Var.a = this.b;
            return kx0Var;
        }
        if (this.c == y7Var) {
            objArr[i] = kx0Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = kx0Var;
        return new kx0(this.a, this.b, copyOf, y7Var);
    }

    public final kx0 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (kx0) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
    
        r14.c = w(r7, r2, (defpackage.kx0) r14.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a7 u(int i, int i2, Object obj, Object obj2) {
        a7 u;
        int i3 = 1;
        int l = 1 << ld0.l(i, i2);
        int i4 = 4;
        int i5 = 0;
        if (h(l)) {
            int f = f(l);
            if (!nz.l(obj, this.d[f])) {
                return new a7(i3, i4, new kx0(this.a ^ l, this.b | l, a(f, l, i, obj, obj2, i2, null), null));
            }
            if (x(f) != obj2) {
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new a7(i5, i4, new kx0(this.a, this.b, copyOf, null));
            }
        } else {
            if (!i(l)) {
                return new a7(i3, i4, new kx0(l | this.a, this.b, ld0.b(this.d, f(l), obj, obj2), null));
            }
            int t = t(l);
            kx0 s = s(t);
            if (i2 == 30) {
                cz r = rg0.r(rg0.v(0, s.d.length));
                int i6 = r.d;
                int i7 = r.e;
                int i8 = r.f;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (!nz.l(obj, s.d[i6])) {
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                    if (obj2 == s.x(i6)) {
                        u = null;
                    } else {
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i6 + 1] = obj2;
                        u = new a7(i5, i4, new kx0(0, 0, copyOf2, null));
                    }
                }
                u = new a7(i3, i4, new kx0(0, 0, ld0.b(s.d, 0, obj, obj2), null));
                break;
            }
            u = s.u(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final kx0 v(int i, int i2, Object obj) {
        kx0 v;
        int l = 1 << ld0.l(i, i2);
        if (h(l)) {
            int f = f(l);
            if (!nz.l(obj, this.d[f])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new kx0(this.a ^ l, this.b, ld0.c(f, objArr), null);
            }
        } else {
            if (!i(l)) {
                return this;
            }
            int t = t(l);
            kx0 s = s(t);
            if (i2 == 30) {
                cz r = rg0.r(rg0.v(0, s.d.length));
                int i3 = r.d;
                int i4 = r.e;
                int i5 = r.f;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!nz.l(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    v = objArr2.length == 2 ? null : new kx0(0, 0, ld0.c(i3, objArr2), null);
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v != null) {
                return s != v ? w(t, l, v) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new kx0(this.a, this.b ^ l, ld0.d(t, objArr3), null);
            }
        }
        return null;
    }

    public final kx0 w(int i, int i2, kx0 kx0Var) {
        Object[] objArr = kx0Var.d;
        if (objArr.length != 2 || kx0Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = kx0Var;
            return new kx0(this.a, this.b, copyOf, null);
        }
        if (this.d.length == 1) {
            kx0Var.a = this.b;
            return kx0Var;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        p8.T(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        p8.T(copyOf2, copyOf2, f + 2, f, i);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new kx0(this.a ^ i2, this.b ^ i2, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
