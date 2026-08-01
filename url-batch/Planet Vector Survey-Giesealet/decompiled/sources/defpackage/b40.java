package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class b40 implements Cloneable {
    public /* synthetic */ boolean d;
    public /* synthetic */ long[] e;
    public /* synthetic */ Object[] f;
    public /* synthetic */ int g;

    public b40(int i) {
        if (i == 0) {
            this.e = nz.f;
            this.f = nz.g;
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
        this.e = new long[i5];
        this.f = new Object[i5];
    }

    public final long a(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.g)) {
            g8.n("Expected index to be within 0..size()-1, but was ", i);
            return 0L;
        }
        if (this.d) {
            long[] jArr = this.e;
            Object[] objArr = this.f;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != nz.i) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.d = false;
            this.g = i3;
        }
        return this.e[i];
    }

    public final void b(long j, Object obj) {
        Object obj2 = nz.i;
        int p = nz.p(this.e, this.g, j);
        if (p >= 0) {
            this.f[p] = obj;
            return;
        }
        int i = ~p;
        int i2 = this.g;
        if (i < i2) {
            Object[] objArr = this.f;
            if (objArr[i] == obj2) {
                this.e[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.d) {
            long[] jArr = this.e;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.d = false;
                this.g = i3;
                i = ~nz.p(this.e, i3, j);
            }
        }
        int i5 = this.g;
        if (i5 >= this.e.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.e = Arrays.copyOf(this.e, i9);
            this.f = Arrays.copyOf(this.f, i9);
        }
        int i10 = this.g;
        if (i10 - i != 0) {
            long[] jArr2 = this.e;
            int i11 = i + 1;
            p8.S(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.f;
            p8.T(objArr3, objArr3, i11, i, this.g);
        }
        this.e[i] = j;
        this.f[i] = obj;
        this.g++;
    }

    public final int c() {
        if (this.d) {
            int i = this.g;
            long[] jArr = this.e;
            Object[] objArr = this.f;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != nz.i) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.d = false;
            this.g = i2;
        }
        return this.g;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        b40 b40Var = (b40) clone;
        b40Var.e = (long[]) this.e.clone();
        b40Var.f = (Object[]) this.f.clone();
        return b40Var;
    }

    public final Object d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.g)) {
            g8.n("Expected index to be within 0..size()-1, but was ", i);
            return null;
        }
        if (this.d) {
            long[] jArr = this.e;
            Object[] objArr = this.f;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != nz.i) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.d = false;
            this.g = i3;
        }
        return this.f[i];
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append('{');
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(a(i2));
            sb.append('=');
            Object d = d(i2);
            if (d != sb) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
