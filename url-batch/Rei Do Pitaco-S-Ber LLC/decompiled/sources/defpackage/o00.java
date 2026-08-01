package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class o00 extends p00 implements Iterator {
    public n00 f;
    public boolean g = true;
    public final /* synthetic */ q00 h;

    public o00(q00 q00Var) {
        this.h = q00Var;
    }

    @Override // defpackage.p00
    public final void a(n00 n00Var) {
        n00 n00Var2 = this.f;
        if (n00Var == n00Var2) {
            n00 n00Var3 = n00Var2.i;
            this.f = n00Var3;
            this.g = n00Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g) {
            return this.h.f != null;
        }
        n00 n00Var = this.f;
        return (n00Var == null || n00Var.h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g) {
            this.g = false;
            this.f = this.h.f;
        } else {
            n00 n00Var = this.f;
            this.f = n00Var != null ? n00Var.h : null;
        }
        return this.f;
    }
}
