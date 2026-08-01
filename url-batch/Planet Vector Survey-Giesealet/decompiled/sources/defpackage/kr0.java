package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class kr0 implements Iterable, j00 {
    public final jr0 d;
    public final int e;
    public final int f;

    public kr0(jr0 jr0Var, int i, int i2) {
        this.d = jr0Var;
        this.e = i;
        this.f = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        jr0 jr0Var = this.d;
        if (jr0Var.k != this.f) {
            lr0.e();
        }
        int i = this.e;
        jr0Var.f(i);
        return new yv(jr0Var, i + 1, jr0Var.d[(i * 5) + 3] + i);
    }
}
