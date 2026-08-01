package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class o20 implements Comparable {
    public boolean f;
    public float j;
    public int q;
    public int g = -1;
    public int h = -1;
    public int i = 0;
    public boolean k = false;
    public final float[] l = new float[9];
    public final float[] m = new float[9];
    public m6[] n = new m6[16];
    public int o = 0;
    public int p = 0;

    public o20(int i) {
        this.q = i;
    }

    public final void a(m6 m6Var) {
        int i = 0;
        while (true) {
            int i2 = this.o;
            m6[] m6VarArr = this.n;
            if (i >= i2) {
                if (i2 >= m6VarArr.length) {
                    this.n = (m6[]) Arrays.copyOf(m6VarArr, m6VarArr.length * 2);
                }
                m6[] m6VarArr2 = this.n;
                int i3 = this.o;
                m6VarArr2[i3] = m6Var;
                this.o = i3 + 1;
                return;
            }
            if (m6VarArr[i] == m6Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(m6 m6Var) {
        int i = this.o;
        int i2 = 0;
        while (i2 < i) {
            if (this.n[i2] == m6Var) {
                while (i2 < i - 1) {
                    m6[] m6VarArr = this.n;
                    int i3 = i2 + 1;
                    m6VarArr[i2] = m6VarArr[i3];
                    i2 = i3;
                }
                this.o--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.q = 5;
        this.i = 0;
        this.g = -1;
        this.h = -1;
        this.j = 0.0f;
        this.k = false;
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2] = null;
        }
        this.o = 0;
        this.p = 0;
        this.f = false;
        Arrays.fill(this.m, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.g - ((o20) obj).g;
    }

    public final void d(vp vpVar, float f) {
        this.j = f;
        this.k = true;
        int i = this.o;
        this.h = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].h(vpVar, this, false);
        }
        this.o = 0;
    }

    public final void e(vp vpVar, m6 m6Var) {
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].i(vpVar, m6Var, false);
        }
        this.o = 0;
    }

    public final String toString() {
        return "" + this.g;
    }
}
