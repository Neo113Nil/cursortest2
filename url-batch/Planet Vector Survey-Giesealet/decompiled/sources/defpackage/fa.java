package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fa implements g50 {
    public final o9 a;
    public final boolean b;

    public fa(o9 o9Var, boolean z) {
        this.a = o9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return this.a.equals(faVar.a) && this.b == faVar.b;
    }

    @Override // defpackage.g50
    public final e40 f(f40 f40Var, List list, long j) {
        boolean isEmpty = list.isEmpty();
        xp xpVar = xp.d;
        if (isEmpty) {
            return f40Var.h0(ui.j(j), ui.i(j), xpVar, o1.o);
        }
        long a = this.b ? j : ui.a(j, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            b50 b50Var = (b50) list.get(0);
            b50Var.f();
            yf0 d = b50Var.d(a);
            int max = Math.max(ui.j(j), d.d);
            int max2 = Math.max(ui.i(j), d.e);
            return f40Var.h0(max, max2, xpVar, new da(d, b50Var, f40Var, max, max2, this));
        }
        yf0[] yf0VarArr = new yf0[list.size()];
        ej0 ej0Var = new ej0();
        ej0Var.d = ui.j(j);
        ej0 ej0Var2 = new ej0();
        ej0Var2.d = ui.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b50 b50Var2 = (b50) list.get(i);
            b50Var2.f();
            yf0 d2 = b50Var2.d(a);
            yf0VarArr[i] = d2;
            ej0Var.d = Math.max(ej0Var.d, d2.d);
            ej0Var2.d = Math.max(ej0Var2.d, d2.e);
        }
        return f40Var.h0(ej0Var.d, ej0Var2.d, xpVar, new ea(yf0VarArr, list, f40Var, ej0Var, ej0Var2, this));
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
