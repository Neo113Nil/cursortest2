package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class m6 {
    public final f6 d;
    public o20 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public m6(y5 y5Var) {
        this.d = new f6(this, y5Var);
    }

    public final void a(vp vpVar, int i) {
        o20 j = vpVar.j(i);
        f6 f6Var = this.d;
        f6Var.g(j, 1.0f);
        f6Var.g(vpVar.j(i), -1.0f);
    }

    public final void b(o20 o20Var, o20 o20Var2, o20 o20Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        f6 f6Var = this.d;
        if (z) {
            f6Var.g(o20Var, 1.0f);
            f6Var.g(o20Var2, -1.0f);
            f6Var.g(o20Var3, -1.0f);
        } else {
            f6Var.g(o20Var, -1.0f);
            f6Var.g(o20Var2, 1.0f);
            f6Var.g(o20Var3, 1.0f);
        }
    }

    public final void c(o20 o20Var, o20 o20Var2, o20 o20Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        f6 f6Var = this.d;
        if (z) {
            f6Var.g(o20Var, 1.0f);
            f6Var.g(o20Var2, -1.0f);
            f6Var.g(o20Var3, 1.0f);
        } else {
            f6Var.g(o20Var, -1.0f);
            f6Var.g(o20Var2, 1.0f);
            f6Var.g(o20Var3, -1.0f);
        }
    }

    public o20 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final o20 f(boolean[] zArr, o20 o20Var) {
        int i;
        f6 f6Var = this.d;
        int d = f6Var.d();
        o20 o20Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f2 = f6Var.f(i2);
            if (f2 < 0.0f) {
                o20 e = f6Var.e(i2);
                if ((zArr == null || !zArr[e.g]) && e != o20Var && (((i = e.q) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    o20Var2 = e;
                }
            }
        }
        return o20Var2;
    }

    public final void g(o20 o20Var) {
        o20 o20Var2 = this.a;
        f6 f6Var = this.d;
        if (o20Var2 != null) {
            f6Var.g(o20Var2, -1.0f);
            this.a.h = -1;
            this.a = null;
        }
        float h = f6Var.h(o20Var, true) * (-1.0f);
        this.a = o20Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = f6Var.h;
        for (int i2 = 0; i != -1 && i2 < f6Var.a; i2++) {
            float[] fArr = f6Var.g;
            fArr[i] = fArr[i] / h;
            i = f6Var.f[i];
        }
    }

    public final void h(vp vpVar, o20 o20Var, boolean z) {
        if (o20Var.k) {
            f6 f6Var = this.d;
            float c = f6Var.c(o20Var);
            this.b = (o20Var.j * c) + this.b;
            f6Var.h(o20Var, z);
            if (z) {
                o20Var.b(this);
            }
            if (f6Var.d() == 0) {
                this.e = true;
                vpVar.b = true;
            }
        }
    }

    public void i(vp vpVar, m6 m6Var, boolean z) {
        f6 f6Var = this.d;
        f6Var.getClass();
        float c = f6Var.c(m6Var.a);
        f6Var.h(m6Var.a, z);
        f6 f6Var2 = m6Var.d;
        int d = f6Var2.d();
        for (int i = 0; i < d; i++) {
            o20 e = f6Var2.e(i);
            f6Var.a(e, f6Var2.c(e) * c, z);
        }
        this.b = (m6Var.b * c) + this.b;
        if (z) {
            m6Var.a.b(this);
        }
        if (this.a == null || f6Var.d() != 0) {
            return;
        }
        this.e = true;
        vpVar.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String concat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != 0.0f) {
            concat = concat + this.b;
            z = true;
        } else {
            z = false;
        }
        f6 f6Var = this.d;
        int d = f6Var.d();
        for (int i = 0; i < d; i++) {
            o20 e = f6Var.e(i);
            if (e != null) {
                float f = f6Var.f(i);
                if (f != 0.0f) {
                    String o20Var = e.toString();
                    if (!z) {
                        if (f < 0.0f) {
                            concat = concat.concat("- ");
                            f *= -1.0f;
                        }
                        concat = f == 1.0f ? concat.concat(o20Var) : concat + f + " " + o20Var;
                        z = true;
                    } else if (f > 0.0f) {
                        concat = concat.concat(" + ");
                        if (f == 1.0f) {
                        }
                        z = true;
                    } else {
                        concat = concat.concat(" - ");
                        f *= -1.0f;
                        if (f == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? concat.concat("0.0") : concat;
    }
}
