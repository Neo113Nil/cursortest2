package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hw {
    public final b10 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final x60 f = new x60();
    public final ha0 g = new ha0();
    public final t60 h;

    public hw(b10 b10Var) {
        this.a = b10Var;
        t60 t60Var = new t60();
        t60Var.a = vn0.a;
        t60Var.b = a40.a;
        t60Var.c = nz.g;
        t60Var.c(vn0.d(10));
        this.h = t60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    public final void a(long j, List list, boolean z) {
        long j2;
        long[] jArr;
        int i;
        char c;
        long j3;
        z90 z90Var;
        z90 z90Var2;
        t60 t60Var = this.h;
        t60Var.e = 0;
        long[] jArr2 = t60Var.a;
        char c2 = 7;
        if (jArr2 != vn0.a) {
            p8.Y(jArr2);
            long[] jArr3 = t60Var.a;
            int i2 = t60Var.d;
            int i3 = i2 >> 3;
            long j4 = 255 << ((i2 & 7) << 3);
            j2 = 255;
            jArr3[i3] = ((~j4) & jArr3[i3]) | j4;
        } else {
            j2 = 255;
        }
        p8.X(t60Var.c, 0, t60Var.d);
        t60Var.f = vn0.a(t60Var.d) - t60Var.e;
        int size = list.size();
        ha0 ha0Var = this.g;
        int i4 = 0;
        boolean z2 = true;
        ha0 ha0Var2 = ha0Var;
        while (i4 < size) {
            t50 t50Var = (t50) list.get(i4);
            if (t50Var.q) {
                t50Var.p = new a3(6, this, t50Var);
                if (z2) {
                    l70 l70Var = ha0Var2.a;
                    ?? r14 = l70Var.d;
                    int i5 = l70Var.f;
                    c = c2;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            j3 = j2;
                            z90Var2 = 0;
                            break;
                        }
                        z90Var2 = r14[i6];
                        j3 = j2;
                        if (nz.l(((z90) z90Var2).c, t50Var)) {
                            break;
                        }
                        i6++;
                        j2 = j3;
                    }
                    z90Var = z90Var2;
                    if (z90Var != null) {
                        z90Var.i = true;
                        z90Var.d.a(j);
                        Object b = t60Var.b(j);
                        Object obj = b;
                        if (b == null) {
                            x60 x60Var = new x60();
                            t60Var.d(j, x60Var);
                            obj = x60Var;
                        }
                        ((x60) obj).a(z90Var);
                        ha0Var2 = z90Var;
                    } else {
                        z2 = false;
                    }
                } else {
                    c = c2;
                    j3 = j2;
                }
                z90Var = new z90(t50Var);
                z90Var.d.a(j);
                Object b2 = t60Var.b(j);
                Object obj2 = b2;
                if (b2 == null) {
                    x60 x60Var2 = new x60();
                    t60Var.d(j, x60Var2);
                    obj2 = x60Var2;
                }
                ((x60) obj2).a(z90Var);
                ha0Var2.a.b(z90Var);
                ha0Var2 = z90Var;
            } else {
                c = c2;
                j3 = j2;
            }
            i4++;
            c2 = c;
            j2 = j3;
        }
        char c3 = c2;
        long j5 = j2;
        if (!z) {
            return;
        }
        long[] jArr4 = t60Var.b;
        Object[] objArr = t60Var.c;
        long[] jArr5 = t60Var.a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j6 = jArr5[i7];
            if ((((~j6) << c3) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j6 & j5) < 128) {
                        int i11 = (i7 << 3) + i10;
                        long j7 = jArr4[i11];
                        x60 x60Var3 = (x60) objArr[i11];
                        l70 l70Var2 = ha0Var.a;
                        Object[] objArr2 = l70Var2.d;
                        int i12 = l70Var2.f;
                        i = i8;
                        int i13 = 0;
                        while (i13 < i12) {
                            ((z90) objArr2[i13]).f(j7, x60Var3);
                            i13++;
                            jArr4 = jArr4;
                        }
                    } else {
                        i = i8;
                    }
                    j6 >>= i;
                    i10++;
                    i8 = i;
                    jArr4 = jArr4;
                }
                jArr = jArr4;
                if (i9 != i8) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i7 == length) {
                return;
            }
            i7++;
            jArr4 = jArr;
        }
    }

    public final boolean b(j3 j3Var, boolean z) {
        b40 b40Var = (b40) j3Var.e;
        b10 b10Var = this.a;
        ha0 ha0Var = this.g;
        boolean a = ha0Var.a(b40Var, b10Var, j3Var, z);
        l70 l70Var = ha0Var.a;
        if (!a) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = l70Var.d;
        int i = l70Var.f;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((z90) objArr[i2]).e(j3Var, z) || z3;
        }
        Object[] objArr2 = l70Var.d;
        int i3 = l70Var.f;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((z90) objArr2[i4]).d(j3Var) || z4;
        }
        ha0Var.b(j3Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            x60 x60Var = this.f;
            int i5 = x60Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((t50) x60Var.e(i6));
            }
            x60Var.c();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            ha0Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        ha0 ha0Var = this.g;
        l70 l70Var = ha0Var.a;
        Object[] objArr = l70Var.d;
        int i = l70Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((z90) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            ha0Var.a.g();
        }
    }

    public final void d(t50 t50Var) {
        if (this.b) {
            this.e = true;
            this.f.a(t50Var);
            return;
        }
        ha0 ha0Var = this.g;
        x60 x60Var = ha0Var.b;
        x60Var.c();
        x60Var.a(ha0Var);
        while (x60Var.h()) {
            ha0 ha0Var2 = (ha0) x60Var.j(x60Var.b - 1);
            int i = 0;
            while (true) {
                l70 l70Var = ha0Var2.a;
                if (i < l70Var.f) {
                    z90 z90Var = (z90) l70Var.d[i];
                    if (nz.l(z90Var.c, t50Var)) {
                        ha0Var2.a.i(z90Var);
                        z90Var.c();
                    } else {
                        x60Var.a(z90Var);
                        i++;
                    }
                }
            }
        }
    }
}
