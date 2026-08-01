package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yv implements Iterator, j00 {
    public final /* synthetic */ int d = 0;
    public final jr0 e;
    public final int f;
    public int g;
    public int h;

    public yv(jr0 jr0Var, int i, int i2) {
        this.e = jr0Var;
        this.f = i2;
        this.g = i;
        this.h = jr0Var.k;
        if (jr0Var.j) {
            lr0.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                return this.g < this.f;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                jr0 jr0Var = this.e;
                int i = jr0Var.k;
                int i2 = this.h;
                if (i != i2) {
                    lr0.e();
                }
                int i3 = this.g;
                this.g = jr0Var.d[(i3 * 5) + 3] + i3;
                return new kr0(jr0Var, i3, i2);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public yv(jr0 jr0Var, int i, zv zvVar, ch0 ch0Var) {
        this.e = jr0Var;
        this.f = i;
        this.g = jr0Var.k;
    }
}
