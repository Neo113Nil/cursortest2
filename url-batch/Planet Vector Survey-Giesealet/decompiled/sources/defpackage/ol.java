package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ol extends t50 {
    public final int r = fa0.e(this);
    public t50 s;

    @Override // defpackage.t50
    public final void X() {
        super.X();
        for (t50 t50Var = this.s; t50Var != null; t50Var = t50Var.i) {
            t50Var.i0(this.k);
            if (!t50Var.q) {
                t50Var.X();
            }
        }
    }

    @Override // defpackage.t50
    public final void Y() {
        for (t50 t50Var = this.s; t50Var != null; t50Var = t50Var.i) {
            t50Var.Y();
        }
        super.Y();
    }

    @Override // defpackage.t50
    public final void e0() {
        super.e0();
        for (t50 t50Var = this.s; t50Var != null; t50Var = t50Var.i) {
            t50Var.e0();
        }
    }

    @Override // defpackage.t50
    public final void f0() {
        for (t50 t50Var = this.s; t50Var != null; t50Var = t50Var.i) {
            t50Var.f0();
        }
        super.f0();
    }

    @Override // defpackage.t50
    public final void g0() {
        super.g0();
        for (t50 t50Var = this.s; t50Var != null; t50Var = t50Var.i) {
            t50Var.g0();
        }
    }

    @Override // defpackage.t50
    public final void h0(t50 t50Var) {
        this.d = t50Var;
        for (t50 t50Var2 = this.s; t50Var2 != null; t50Var2 = t50Var2.i) {
            t50Var2.h0(t50Var);
        }
    }

    @Override // defpackage.t50
    public final void i0(ea0 ea0Var) {
        this.k = ea0Var;
        for (t50 t50Var = this.s; t50Var != null; t50Var = t50Var.i) {
            t50Var.i0(ea0Var);
        }
    }

    public final void j0(nl nlVar) {
        t50 t50Var = ((t50) nlVar).d;
        if (t50Var != nlVar) {
            t50 t50Var2 = nlVar instanceof t50 ? (t50) nlVar : null;
            t50 t50Var3 = t50Var2 != null ? t50Var2.h : null;
            if (t50Var == this.d && nz.l(t50Var3, this)) {
                return;
            }
            g8.s("Cannot delegate to an already delegated node");
            return;
        }
        if (t50Var.q) {
            cy.b("Cannot delegate to an already attached node");
        }
        t50Var.h0(this.d);
        int i = this.f;
        int f = fa0.f(t50Var);
        t50Var.f = f;
        int i2 = this.f;
        int i3 = f & 2;
        if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof i10)) {
            cy.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + t50Var);
        }
        t50Var.i = this.s;
        this.s = t50Var;
        t50Var.h = this;
        l0(f | this.f, false);
        if (this.q) {
            if (i3 == 0 || (i & 2) != 0) {
                i0(this.k);
            } else {
                ca0 ca0Var = nz.a0(this).F;
                this.d.i0(null);
                ca0Var.l();
            }
            t50Var.X();
            t50Var.f0();
            if (!t50Var.q) {
                cy.b("autoInvalidateInsertedNode called on unattached node");
            }
            fa0.a(t50Var, -1, 1);
        }
    }

    public final void k0(nl nlVar) {
        t50 t50Var = null;
        for (t50 t50Var2 = this.s; t50Var2 != null; t50Var2 = t50Var2.i) {
            if (t50Var2 == nlVar) {
                boolean z = t50Var2.q;
                if (z) {
                    w60 w60Var = fa0.a;
                    if (!z) {
                        cy.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    fa0.a(t50Var2, -1, 2);
                    t50Var2.g0();
                    t50Var2.Y();
                }
                t50Var2.h0(t50Var2);
                t50Var2.g = 0;
                t50 t50Var3 = t50Var2.i;
                if (t50Var == null) {
                    this.s = t50Var3;
                } else {
                    t50Var.i = t50Var3;
                }
                t50Var2.i = null;
                t50Var2.h = null;
                int i = this.f;
                int f = fa0.f(this);
                l0(f, true);
                if (this.q && (i & 2) != 0 && (f & 2) == 0) {
                    ca0 ca0Var = nz.a0(this).F;
                    this.d.i0(null);
                    ca0Var.l();
                    return;
                }
                return;
            }
            t50Var = t50Var2;
        }
        g8.d(nlVar, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void l0(int i, boolean z) {
        t50 t50Var;
        int i2 = this.f;
        this.f = i;
        if (i2 != i) {
            t50 t50Var2 = this.d;
            if (t50Var2 == this) {
                this.g = i;
            }
            boolean z2 = this.q;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f;
                    r2.f = i;
                    if (r2 == t50Var2) {
                        break;
                    } else {
                        r2 = r2.h;
                    }
                }
                if (z && r2 == t50Var2) {
                    i = fa0.f(t50Var2);
                    t50Var2.f = i;
                }
                int i3 = i | ((r2 == 0 || (t50Var = r2.i) == null) ? 0 : t50Var.g);
                for (t50 t50Var3 = r2; t50Var3 != null; t50Var3 = t50Var3.h) {
                    i3 |= t50Var3.f;
                    t50Var3.g = i3;
                }
            }
        }
    }
}
