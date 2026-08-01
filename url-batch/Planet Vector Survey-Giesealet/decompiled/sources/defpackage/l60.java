package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class l60 {
    public final a70 a;

    public static final Object a(a70 a70Var) {
        Object g = a70Var.g(null);
        if (g == null) {
            return null;
        }
        if (!(g instanceof x60)) {
            a70Var.k(null);
            return g;
        }
        x60 x60Var = (x60) g;
        if (x60Var.g()) {
            g8.e("List is empty.");
            return null;
        }
        int i = x60Var.b - 1;
        Object e = x60Var.e(i);
        x60Var.j(i);
        e.getClass();
        if (x60Var.g()) {
            a70Var.k(null);
        }
        if (x60Var.b == 1) {
            a70Var.m(null, x60Var.d());
        }
        return e;
    }

    public static final x60 b(a70 a70Var) {
        if (a70Var.i()) {
            x60 x60Var = na0.b;
            x60Var.getClass();
            return x60Var;
        }
        x60 x60Var2 = new x60();
        Object[] objArr = a70Var.c;
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof x60) {
                                x60 x60Var3 = (x60) obj;
                                if (!x60Var3.g()) {
                                    int i4 = x60Var2.b + x60Var3.b;
                                    Object[] objArr2 = x60Var2.a;
                                    if (objArr2.length < i4) {
                                        x60Var2.l(i4, objArr2);
                                    }
                                    p8.T(x60Var3.a, x60Var2.a, x60Var2.b, 0, x60Var3.b);
                                    x60Var2.b += x60Var3.b;
                                }
                            } else {
                                obj.getClass();
                                x60Var2.a(obj);
                            }
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
        return x60Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l60) {
            return this.a.equals(((l60) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
