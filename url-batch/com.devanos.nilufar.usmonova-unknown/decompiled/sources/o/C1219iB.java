package o;

import java.util.Arrays;

/* renamed from: o.iB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1219iB implements Cloneable {
    public /* synthetic */ boolean h;
    public /* synthetic */ long[] i;
    public /* synthetic */ Object[] j;
    public /* synthetic */ int k;

    public C1219iB(int i) {
        if (i == 0) {
            this.i = AbstractC1473m3.c;
            this.j = AbstractC1473m3.d;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.i = new long[i5];
        this.j = new Object[i5];
    }

    public final void a() {
        int i = this.k;
        Object[] objArr = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.k = 0;
        this.h = false;
    }

    public final long b(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.k)) {
            AbstractC0773bP.l("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.h) {
            long[] jArr = this.i;
            Object[] objArr = this.j;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC0946e20.e) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.h = false;
            this.k = i3;
        }
        return this.i[i];
    }

    public final void c(long j, Object obj) {
        Object obj2 = AbstractC0946e20.e;
        int i = AbstractC1473m3.i(this.i, this.k, j);
        if (i >= 0) {
            this.j[i] = obj;
            return;
        }
        int i2 = ~i;
        int i3 = this.k;
        if (i2 < i3) {
            Object[] objArr = this.j;
            if (objArr[i2] == obj2) {
                this.i[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.h) {
            long[] jArr = this.i;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.j;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.h = false;
                this.k = i4;
                i2 = ~AbstractC1473m3.i(this.i, i4, j);
            }
        }
        int i6 = this.k;
        if (i6 >= this.i.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            long[] copyOf = Arrays.copyOf(this.i, i10);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.i = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.j, i10);
            AbstractC0048Bt.m(copyOf2, "copyOf(this, newSize)");
            this.j = copyOf2;
        }
        int i11 = this.k - i2;
        if (i11 != 0) {
            long[] jArr2 = this.i;
            int i12 = i2 + 1;
            AbstractC0048Bt.n(jArr2, "<this>");
            System.arraycopy(jArr2, i2, jArr2, i12, i11);
            Object[] objArr3 = this.j;
            P6.b0(objArr3, objArr3, i12, i2, this.k);
        }
        this.i[i2] = j;
        this.j[i2] = obj;
        this.k++;
    }

    public final Object clone() {
        Object clone = super.clone();
        AbstractC0048Bt.l(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1219iB c1219iB = (C1219iB) clone;
        c1219iB.i = (long[]) this.i.clone();
        c1219iB.j = (Object[]) this.j.clone();
        return c1219iB;
    }

    public final void d(long j) {
        int i = AbstractC1473m3.i(this.i, this.k, j);
        if (i >= 0) {
            Object[] objArr = this.j;
            Object obj = objArr[i];
            Object obj2 = AbstractC0946e20.e;
            if (obj != obj2) {
                objArr[i] = obj2;
                this.h = true;
            }
        }
    }

    public final int e() {
        if (this.h) {
            int i = this.k;
            long[] jArr = this.i;
            Object[] objArr = this.j;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC0946e20.e) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.h = false;
            this.k = i2;
        }
        return this.k;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.k)) {
            AbstractC0773bP.l("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.h) {
            long[] jArr = this.i;
            Object[] objArr = this.j;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC0946e20.e) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.h = false;
            this.k = i3;
        }
        return this.j[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.k * 28);
        sb.append('{');
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C1219iB(Object obj) {
        this(10);
    }
}
