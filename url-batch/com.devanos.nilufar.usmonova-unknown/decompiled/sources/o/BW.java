package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class BW {
    public static final BW e = new BW(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final C0218Ih c;
    public Object[] d;

    public BW(int i, int i2, Object[] objArr, C0218Ih c0218Ih) {
        this.a = i;
        this.b = i2;
        this.c = c0218Ih;
        this.d = objArr;
    }

    public static BW j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C0218Ih c0218Ih) {
        if (i3 > 30) {
            return new BW(0, 0, new Object[]{obj, obj2, obj3, obj4}, c0218Ih);
        }
        int k = ON.k(i, i3);
        int k2 = ON.k(i2, i3);
        if (k != k2) {
            return new BW((1 << k) | (1 << k2), 0, k < k2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c0218Ih);
        }
        return new BW(0, 1 << k, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, c0218Ih)}, c0218Ih);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, C0218Ih c0218Ih) {
        Object obj3 = this.d[i];
        BW j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, c0218Ih);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        P6.d0(objArr, objArr2, 0, i, 6);
        P6.b0(objArr, objArr2, i, i + 2, i5);
        objArr2[t - 1] = j;
        P6.b0(objArr, objArr2, t, i5, objArr.length);
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
        C1065ft Y = AbstractC1807r8.Y(AbstractC1807r8.c0(0, this.d.length), 2);
        int i = Y.h;
        int i2 = Y.i;
        int i3 = Y.j;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!AbstractC0048Bt.h(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int k = 1 << ON.k(i, i2);
        if (h(k)) {
            return AbstractC0048Bt.h(obj, this.d[f(k)]);
        }
        if (!i(k)) {
            return false;
        }
        BW s = s(t(k));
        return i2 == 30 ? s.c(obj) : s.d(i, i2 + 5, obj);
    }

    public final boolean e(BW bw) {
        if (this == bw) {
            return true;
        }
        if (this.b == bw.b && this.a == bw.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == bw.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int k = 1 << ON.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (AbstractC0048Bt.h(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(k)) {
            return null;
        }
        BW s = s(t(k));
        if (i2 != 30) {
            return s.g(i, i2 + 5, obj);
        }
        C1065ft Y = AbstractC1807r8.Y(AbstractC1807r8.c0(0, s.d.length), 2);
        int i3 = Y.h;
        int i4 = Y.i;
        int i5 = Y.j;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!AbstractC0048Bt.h(obj, s.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return s.x(i3);
    }

    public final boolean h(int i) {
        return (i & this.a) != 0;
    }

    public final boolean i(int i) {
        return (i & this.b) != 0;
    }

    public final BW k(int i, HH hh) {
        hh.f(hh.size() - 1);
        hh.j = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != hh.h) {
            return new BW(0, 0, ON.b(objArr, i), hh.h);
        }
        this.d = ON.b(objArr, i);
        return this;
    }

    public final BW l(int i, Object obj, Object obj2, int i2, HH hh) {
        HH hh2;
        BW l;
        int k = 1 << ON.k(i, i2);
        boolean h = h(k);
        C0218Ih c0218Ih = this.c;
        if (h) {
            int f = f(k);
            if (!AbstractC0048Bt.h(obj, this.d[f])) {
                hh.f(hh.size() + 1);
                C0218Ih c0218Ih2 = hh.h;
                if (c0218Ih != c0218Ih2) {
                    return new BW(this.a ^ k, this.b | k, a(f, k, i, obj, obj2, i2, c0218Ih2), c0218Ih2);
                }
                this.d = a(f, k, i, obj, obj2, i2, c0218Ih2);
                this.a ^= k;
                this.b |= k;
                return this;
            }
            hh.j = x(f);
            if (x(f) == obj2) {
                return this;
            }
            if (c0218Ih == hh.h) {
                this.d[f + 1] = obj2;
                return this;
            }
            hh.k++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC0048Bt.m(copyOf, "copyOf(this, size)");
            copyOf[f + 1] = obj2;
            return new BW(this.a, this.b, copyOf, hh.h);
        }
        if (!i(k)) {
            hh.f(hh.size() + 1);
            C0218Ih c0218Ih3 = hh.h;
            int f2 = f(k);
            if (c0218Ih != c0218Ih3) {
                return new BW(this.a | k, this.b, ON.a(this.d, f2, obj, obj2), c0218Ih3);
            }
            this.d = ON.a(this.d, f2, obj, obj2);
            this.a |= k;
            return this;
        }
        int t = t(k);
        BW s = s(t);
        if (i2 == 30) {
            C1065ft Y = AbstractC1807r8.Y(AbstractC1807r8.c0(0, s.d.length), 2);
            int i3 = Y.h;
            int i4 = Y.i;
            int i5 = Y.j;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!AbstractC0048Bt.h(obj, s.d[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                hh.j = s.x(i3);
                if (s.c == hh.h) {
                    s.d[i3 + 1] = obj2;
                    l = s;
                } else {
                    hh.k++;
                    Object[] objArr2 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    AbstractC0048Bt.m(copyOf2, "copyOf(this, size)");
                    copyOf2[i3 + 1] = obj2;
                    l = new BW(0, 0, copyOf2, hh.h);
                }
                hh2 = hh;
            }
            hh.f(hh.size() + 1);
            l = new BW(0, 0, ON.a(s.d, 0, obj, obj2), hh.h);
            hh2 = hh;
        } else {
            hh2 = hh;
            l = s.l(i, obj, obj2, i2 + 5, hh2);
        }
        return s == l ? this : r(t, l, hh2.h);
    }

    public final BW m(BW bw, int i, C1053fh c1053fh, HH hh) {
        Object[] objArr;
        BW j;
        HH hh2 = hh;
        if (this == bw) {
            c1053fh.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            C0218Ih c0218Ih = hh2.h;
            int i3 = bw.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + bw.d.length);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            int length = this.d.length;
            C1065ft Y = AbstractC1807r8.Y(AbstractC1807r8.c0(0, bw.d.length), 2);
            int i4 = Y.h;
            int i5 = Y.i;
            int i6 = Y.j;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(bw.d[i4])) {
                        c1053fh.a++;
                    } else {
                        Object[] objArr3 = bw.d;
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
                if (length == bw.d.length) {
                    return bw;
                }
                if (length == copyOf.length) {
                    return new BW(0, 0, copyOf, c0218Ih);
                }
                Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                AbstractC0048Bt.m(copyOf2, "copyOf(this, newSize)");
                return new BW(0, 0, copyOf2, c0218Ih);
            }
        } else {
            int i7 = this.b | bw.b;
            int i8 = this.a;
            int i9 = bw.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (AbstractC0048Bt.h(this.d[f(lowestOneBit)], bw.d[bw.f(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                AbstractC1052fg.T("Check failed.");
                throw null;
            }
            BW bw2 = (AbstractC0048Bt.h(this.c, hh2.h) && this.a == i12 && this.b == i7) ? this : new BW(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = bw2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (bw.i(lowestOneBit2)) {
                        j = j.m(bw.s(bw.t(lowestOneBit2)), i + 5, c1053fh, hh2);
                        objArr = objArr4;
                    } else {
                        if (bw.h(lowestOneBit2)) {
                            int f = bw.f(lowestOneBit2);
                            Object obj = bw.d[f];
                            Object x = bw.x(f);
                            int size = hh2.size();
                            objArr = objArr4;
                            j = j.l(obj != null ? obj.hashCode() : i2, obj, x, i + 5, hh2);
                            if (hh.size() == size) {
                                c1053fh.a++;
                            }
                        } else {
                            objArr = objArr4;
                        }
                        hh2 = hh;
                    }
                } else {
                    objArr = objArr4;
                    if (bw.i(lowestOneBit2)) {
                        BW s = bw.s(bw.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            int i15 = i + 5;
                            if (s.d(obj2 != null ? obj2.hashCode() : 0, i15, obj2)) {
                                c1053fh.a++;
                            } else {
                                hh2 = hh;
                                j = s.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f2), i15, hh2);
                            }
                        }
                        hh2 = hh;
                        j = s;
                    } else {
                        hh2 = hh;
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x2 = x(f3);
                        int f4 = bw.f(lowestOneBit2);
                        Object obj4 = bw.d[f4];
                        j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, bw.x(f4), i + 5, hh2.h);
                    }
                }
                objArr[length2] = j;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i16 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i17 = i16 * 2;
                if (bw.h(lowestOneBit3)) {
                    int f5 = bw.f(lowestOneBit3);
                    Object[] objArr5 = bw2.d;
                    objArr5[i17] = bw.d[f5];
                    objArr5[i17 + 1] = bw.x(f5);
                    if (h(lowestOneBit3)) {
                        c1053fh.a++;
                    }
                } else {
                    int f6 = f(lowestOneBit3);
                    Object[] objArr6 = bw2.d;
                    objArr6[i17] = this.d[f6];
                    objArr6[i17 + 1] = x(f6);
                }
                i16++;
                i12 ^= lowestOneBit3;
            }
            if (!e(bw2)) {
                return bw.e(bw2) ? bw : bw2;
            }
        }
        return this;
    }

    public final BW n(int i, Object obj, int i2, HH hh) {
        BW n;
        int k = 1 << ON.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (AbstractC0048Bt.h(obj, this.d[f])) {
                return p(f, k, hh);
            }
        } else if (i(k)) {
            int t = t(k);
            BW s = s(t);
            if (i2 == 30) {
                C1065ft Y = AbstractC1807r8.Y(AbstractC1807r8.c0(0, s.d.length), 2);
                int i3 = Y.h;
                int i4 = Y.i;
                int i5 = Y.j;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!AbstractC0048Bt.h(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, hh);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, hh);
            return q(s, n, t, k, hh.h);
        }
        return this;
    }

    public final BW o(int i, Object obj, Object obj2, int i2, HH hh) {
        BW bw;
        BW o2;
        int k = 1 << ON.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (AbstractC0048Bt.h(obj, this.d[f]) && AbstractC0048Bt.h(obj2, x(f))) {
                return p(f, k, hh);
            }
        } else if (i(k)) {
            int t = t(k);
            BW s = s(t);
            if (i2 == 30) {
                C1065ft Y = AbstractC1807r8.Y(AbstractC1807r8.c0(0, s.d.length), 2);
                int i3 = Y.h;
                int i4 = Y.i;
                int i5 = Y.j;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!AbstractC0048Bt.h(obj, s.d[i3]) || !AbstractC0048Bt.h(obj2, s.x(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            o2 = s.k(i3, hh);
                            break;
                        }
                    }
                    bw = s;
                }
                o2 = s;
                bw = s;
            } else {
                bw = s;
                o2 = bw.o(i, obj, obj2, i2 + 5, hh);
            }
            return q(bw, o2, t, k, hh.h);
        }
        return this;
    }

    public final BW p(int i, int i2, HH hh) {
        hh.f(hh.size() - 1);
        hh.j = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != hh.h) {
            return new BW(i2 ^ this.a, this.b, ON.b(objArr, i), hh.h);
        }
        this.d = ON.b(objArr, i);
        this.a ^= i2;
        return this;
    }

    public final BW q(BW bw, BW bw2, int i, int i2, C0218Ih c0218Ih) {
        C0218Ih c0218Ih2 = this.c;
        if (bw2 != null) {
            return (c0218Ih2 == c0218Ih || bw != bw2) ? r(i, bw2, c0218Ih) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (c0218Ih2 != c0218Ih) {
            return new BW(this.a, i2 ^ this.b, ON.c(objArr, i), c0218Ih);
        }
        this.d = ON.c(objArr, i);
        this.b ^= i2;
        return this;
    }

    public final BW r(int i, BW bw, C0218Ih c0218Ih) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && bw.d.length == 2 && bw.b == 0) {
            bw.a = this.b;
            return bw;
        }
        if (this.c == c0218Ih) {
            objArr[i] = bw;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC0048Bt.m(copyOf, "copyOf(this, size)");
        copyOf[i] = bw;
        return new BW(this.a, this.b, copyOf, c0218Ih);
    }

    public final BW s(int i) {
        Object obj = this.d[i];
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (BW) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        r14.i = w(r12, r4, (o.BW) r14.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00da, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1143h2 u(int i, int i2, Object obj, Object obj2) {
        C1143h2 u;
        int i3 = 1;
        int k = 1 << ON.k(i, i2);
        int i4 = 0;
        if (h(k)) {
            int f = f(k);
            if (!AbstractC0048Bt.h(obj, this.d[f])) {
                return new C1143h2(i3, new BW(this.a ^ k, this.b | k, a(f, k, i, obj, obj2, i2, null), null));
            }
            if (x(f) != obj2) {
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                AbstractC0048Bt.m(copyOf, "copyOf(this, size)");
                copyOf[f + 1] = obj2;
                return new C1143h2(i4, new BW(this.a, this.b, copyOf, null));
            }
        } else {
            if (!i(k)) {
                return new C1143h2(i3, new BW(this.a | k, this.b, ON.a(this.d, f(k), obj, obj2), null));
            }
            int t = t(k);
            BW s = s(t);
            if (i2 == 30) {
                C1065ft Y = AbstractC1807r8.Y(AbstractC1807r8.c0(0, s.d.length), 2);
                int i5 = Y.h;
                int i6 = Y.i;
                int i7 = Y.j;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!AbstractC0048Bt.h(obj, s.d[i5])) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    if (obj2 == s.x(i5)) {
                        u = null;
                    } else {
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        AbstractC0048Bt.m(copyOf2, "copyOf(this, size)");
                        copyOf2[i5 + 1] = obj2;
                        u = new C1143h2(i4, new BW(0, 0, copyOf2, null));
                    }
                }
                u = new C1143h2(i3, new BW(0, 0, ON.a(s.d, 0, obj, obj2), null));
                break;
            }
            u = s.u(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final BW v(int i, int i2, Object obj) {
        BW v;
        int k = 1 << ON.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (AbstractC0048Bt.h(obj, this.d[f])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new BW(this.a ^ k, this.b, ON.b(objArr, f), null);
                }
                return null;
            }
            return this;
        }
        if (i(k)) {
            int t = t(k);
            BW s = s(t);
            if (i2 == 30) {
                C1065ft Y = AbstractC1807r8.Y(AbstractC1807r8.c0(0, s.d.length), 2);
                int i3 = Y.h;
                int i4 = Y.i;
                int i5 = Y.j;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!AbstractC0048Bt.h(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    v = objArr2.length == 2 ? null : new BW(0, 0, ON.b(objArr2, i3), null);
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new BW(this.a, k ^ this.b, ON.c(objArr3, t), null);
                }
                return null;
            }
            if (s != v) {
                return w(t, k, v);
            }
        }
        return this;
    }

    public final BW w(int i, int i2, BW bw) {
        Object[] objArr = bw.d;
        if (objArr.length != 2 || bw.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            copyOf[i] = bw;
            return new BW(this.a, this.b, copyOf, null);
        }
        if (this.d.length == 1) {
            bw.a = this.b;
            return bw;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC0048Bt.m(copyOf2, "copyOf(this, newSize)");
        P6.b0(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        P6.b0(copyOf2, copyOf2, f + 2, f, i);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new BW(this.a ^ i2, i2 ^ this.b, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
