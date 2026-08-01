package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gm0 implements g50, cm0 {
    public final w7 a;
    public final n9 b;

    public gm0(w7 w7Var, n9 n9Var) {
        this.a = w7Var;
        this.b = n9Var;
    }

    @Override // defpackage.cm0
    public final e40 a(yf0[] yf0VarArr, f40 f40Var, int[] iArr, int i, int i2) {
        return f40Var.h0(i, i2, xp.d, new fm0(yf0VarArr, this, i2, iArr));
    }

    @Override // defpackage.cm0
    public final long b(int i, int i2, int i3, boolean z) {
        return !z ? vi.a(i, i2, 0, i3) : px0.y(i, i2, 0, i3);
    }

    @Override // defpackage.cm0
    public final int c(yf0 yf0Var) {
        return yf0Var.e;
    }

    @Override // defpackage.cm0
    public final void d(int i, f40 f40Var, int[] iArr, int[] iArr2) {
        this.a.d(f40Var, i, iArr, f40Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.cm0
    public final int e(yf0 yf0Var) {
        return yf0Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm0)) {
            return false;
        }
        gm0 gm0Var = (gm0) obj;
        return this.a.equals(gm0Var.a) && this.b.equals(gm0Var.b);
    }

    @Override // defpackage.g50
    public final e40 f(f40 f40Var, List list, long j) {
        return od0.q(this, ui.j(j), ui.i(j), ui.h(j), ui.g(j), y6.c(this.a.b(), f40Var), f40Var, list, new yf0[list.size()], list.size());
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
