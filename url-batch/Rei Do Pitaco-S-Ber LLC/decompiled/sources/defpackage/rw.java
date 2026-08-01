package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class rw extends m6 {
    public o20[] f;
    public o20[] g;
    public int h;
    public o4 i;

    @Override // defpackage.m6
    public final o20 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            o20[] o20VarArr = this.f;
            o20 o20Var = o20VarArr[i2];
            if (!zArr[o20Var.g]) {
                o4 o4Var = this.i;
                o4Var.g = o20Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((o20) o4Var.g).m[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    o20 o20Var2 = o20VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = o20Var2.m[i3];
                            float f3 = ((o20) o4Var.g).m[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.m6
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.m6
    public final void i(vp vpVar, m6 m6Var, boolean z) {
        o20 o20Var = m6Var.a;
        if (o20Var == null) {
            return;
        }
        float[] fArr = o20Var.m;
        f6 f6Var = m6Var.d;
        int d = f6Var.d();
        for (int i = 0; i < d; i++) {
            o20 e = f6Var.e(i);
            float f = f6Var.f(i);
            o4 o4Var = this.i;
            o4Var.g = e;
            if (e.f) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((o20) o4Var.g).m;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((o20) o4Var.g).m[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((rw) o4Var.h).k((o20) o4Var.g);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((o20) o4Var.g).m[i3] = f4;
                    } else {
                        ((o20) o4Var.g).m[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (m6Var.b * f) + this.b;
        }
        k(o20Var);
    }

    public final void j(o20 o20Var) {
        int i;
        o20[] o20VarArr;
        int i2 = this.h + 1;
        o20[] o20VarArr2 = this.f;
        if (i2 > o20VarArr2.length) {
            o20[] o20VarArr3 = (o20[]) Arrays.copyOf(o20VarArr2, o20VarArr2.length * 2);
            this.f = o20VarArr3;
            this.g = (o20[]) Arrays.copyOf(o20VarArr3, o20VarArr3.length * 2);
        }
        o20[] o20VarArr4 = this.f;
        int i3 = this.h;
        o20VarArr4[i3] = o20Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && o20VarArr4[i3].g > o20Var.g) {
            int i5 = 0;
            while (true) {
                i = this.h;
                o20VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                o20VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(o20VarArr, 0, i, new ca(3));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        o20Var.f = true;
        o20Var.a(this);
    }

    public final void k(o20 o20Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == o20Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        o20Var.f = false;
                        return;
                    } else {
                        o20[] o20VarArr = this.f;
                        int i3 = i + 1;
                        o20VarArr[i] = o20VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.m6
    public final String toString() {
        o4 o4Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            o4Var.g = this.f[i];
            str = str + o4Var + " ";
        }
        return str;
    }
}
