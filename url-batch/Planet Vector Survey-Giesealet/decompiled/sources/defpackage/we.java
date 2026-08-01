package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class we implements g50, cm0 {
    public final a8 a;
    public final m9 b;

    public we(a8 a8Var, m9 m9Var) {
        this.a = a8Var;
        this.b = m9Var;
    }

    @Override // defpackage.cm0
    public final e40 a(yf0[] yf0VarArr, f40 f40Var, int[] iArr, int i, int i2) {
        return f40Var.h0(i2, i, xp.d, new ve(yf0VarArr, this, i2, f40Var, iArr));
    }

    @Override // defpackage.cm0
    public final long b(int i, int i2, int i3, boolean z) {
        return !z ? vi.a(0, i3, i, i2) : px0.x(0, i3, i, i2);
    }

    @Override // defpackage.cm0
    public final int c(yf0 yf0Var) {
        return yf0Var.d;
    }

    @Override // defpackage.cm0
    public final void d(int i, f40 f40Var, int[] iArr, int[] iArr2) {
        this.a.k(i, f40Var, iArr, iArr2);
    }

    @Override // defpackage.cm0
    public final int e(yf0 yf0Var) {
        return yf0Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return this.a.equals(weVar.a) && this.b.equals(weVar.b);
    }

    @Override // defpackage.g50
    public final e40 f(f40 f40Var, List list, long j) {
        return od0.q(this, ui.i(j), ui.j(j), ui.g(j), ui.h(j), y6.c(this.a.b(), f40Var), f40Var, list, new yf0[list.size()], list.size());
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
