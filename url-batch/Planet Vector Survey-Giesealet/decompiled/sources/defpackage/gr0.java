package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gr0 extends t50 implements i10 {
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    @Override // defpackage.i10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        int i;
        int i2;
        int i3;
        int j2;
        int h;
        int i4;
        int g;
        long a;
        int i5 = 0;
        if (jn.a(this.t, Float.NaN)) {
            i = Integer.MAX_VALUE;
        } else {
            i = y6.c(this.t, f40Var);
            if (i < 0) {
                i = 0;
            }
        }
        if (jn.a(this.u, Float.NaN)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = y6.c(this.u, f40Var);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!jn.a(this.r, Float.NaN)) {
            i3 = y6.c(this.r, f40Var);
            if (i3 > i) {
                i3 = i;
            }
            if (i3 < 0) {
                i3 = 0;
            }
        }
        i3 = 0;
        if (!jn.a(this.s, Float.NaN)) {
            int c = y6.c(this.s, f40Var);
            if (c > i2) {
                c = i2;
            }
            if (c < 0) {
                c = 0;
            }
            if (c != Integer.MAX_VALUE) {
                i5 = c;
            }
        }
        long a2 = vi.a(i3, i, i5, i2);
        if (this.v) {
            int j3 = ui.j(j);
            int h2 = ui.h(j);
            int i6 = ui.i(j);
            int g2 = ui.g(j);
            int j4 = ui.j(a2);
            if (j4 < j3) {
                j4 = j3;
            }
            if (j4 > h2) {
                j4 = h2;
            }
            int h3 = ui.h(a2);
            if (h3 >= j3) {
                j3 = h3;
            }
            if (j3 <= h2) {
                h2 = j3;
            }
            int i7 = ui.i(a2);
            if (i7 < i6) {
                i7 = i6;
            }
            if (i7 > g2) {
                i7 = g2;
            }
            int g3 = ui.g(a2);
            if (g3 >= i6) {
                i6 = g3;
            }
            if (i6 <= g2) {
                g2 = i6;
            }
            a = vi.a(j4, h2, i7, g2);
        } else {
            if (jn.a(this.r, Float.NaN)) {
                j2 = ui.j(j);
                int h4 = ui.h(a2);
                if (j2 > h4) {
                    j2 = h4;
                }
            } else {
                j2 = ui.j(a2);
            }
            if (jn.a(this.t, Float.NaN)) {
                h = ui.h(j);
                int j5 = ui.j(a2);
                if (h < j5) {
                    h = j5;
                }
            } else {
                h = ui.h(a2);
            }
            if (jn.a(this.s, Float.NaN)) {
                i4 = ui.i(j);
                int g4 = ui.g(a2);
                if (i4 > g4) {
                    i4 = g4;
                }
            } else {
                i4 = ui.i(a2);
            }
            if (jn.a(this.u, Float.NaN)) {
                g = ui.g(j);
                int i8 = ui.i(a2);
                if (g < i8) {
                    g = i8;
                }
            } else {
                g = ui.g(a2);
            }
            a = vi.a(j2, h, i4, g);
        }
        yf0 d = b50Var.d(a);
        return f40Var.h0(d.d, d.e, xp.d, new hq(d, 6));
    }
}
