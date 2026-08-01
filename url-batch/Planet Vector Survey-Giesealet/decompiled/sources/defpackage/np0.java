package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class np0 implements Iterable, j00 {
    public final a70 d;
    public w40 e;
    public boolean f;
    public boolean g;

    public np0() {
        long[] jArr = vn0.a;
        this.d = new a70();
    }

    public final np0 a() {
        np0 np0Var = new np0();
        np0Var.f = this.f;
        np0Var.g = this.g;
        a70 a70Var = np0Var.d;
        a70Var.getClass();
        a70 a70Var2 = this.d;
        a70Var2.getClass();
        Object[] objArr = a70Var2.b;
        Object[] objArr2 = a70Var2.c;
        long[] jArr = a70Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            a70Var.m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return np0Var;
    }

    public final Object b(yp0 yp0Var) {
        Object g = this.d.g(yp0Var);
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("Key not present: " + yp0Var + " - consider getOrElse or getOrNull");
    }

    public final void c(np0 np0Var) {
        a70 a70Var = np0Var.d;
        Object[] objArr = a70Var.b;
        Object[] objArr2 = a70Var.c;
        long[] jArr = a70Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        yp0 yp0Var = (yp0) obj;
                        a70 a70Var2 = this.d;
                        Object g = a70Var2.g(yp0Var);
                        yp0Var.getClass();
                        Object invoke = yp0Var.b.invoke(g, obj2);
                        if (invoke != null) {
                            a70Var2.m(yp0Var, invoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void d(yp0 yp0Var, Object obj) {
        boolean z = obj instanceof h0;
        a70 a70Var = this.d;
        if (z && a70Var.c(yp0Var)) {
            Object g = a70Var.g(yp0Var);
            g.getClass();
            h0 h0Var = (h0) g;
            h0 h0Var2 = (h0) obj;
            String str = h0Var2.a;
            if (str == null) {
                str = h0Var.a;
            }
            yu yuVar = h0Var2.b;
            if (yuVar == null) {
                yuVar = h0Var.b;
            }
            a70Var.m(yp0Var, new h0(str, yuVar));
        } else {
            a70Var.m(yp0Var, obj);
        }
        yp0Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np0)) {
            return false;
        }
        np0 np0Var = (np0) obj;
        return nz.l(this.d, np0Var.d) && this.f == np0Var.f && this.g == np0Var.g;
    }

    public final int hashCode() {
        return (((this.d.hashCode() * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        w40 w40Var = this.e;
        if (w40Var == null) {
            a70 a70Var = this.d;
            a70Var.getClass();
            w40 w40Var2 = new w40(a70Var);
            this.e = w40Var2;
            w40Var = w40Var2;
        }
        return ((mq) w40Var.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.g) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        a70 a70Var = this.d;
        Object[] objArr = a70Var.b;
        Object[] objArr2 = a70Var.c;
        long[] jArr = a70Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((yp0) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return mz.T(this) + "{ " + ((Object) sb) + " }";
    }
}
