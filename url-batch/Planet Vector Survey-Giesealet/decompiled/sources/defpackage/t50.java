package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class t50 implements nl {
    public jj e;
    public int f;
    public t50 h;
    public t50 i;
    public qa0 j;
    public ea0 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public a3 p;
    public boolean q;
    public t50 d = this;
    public int g = -1;

    public final bk V() {
        jj jjVar = this.e;
        if (jjVar != null) {
            return jjVar;
        }
        jj d = x40.d(((f3) nz.b0(this)).getCoroutineContext().i(new b00((zz) ((f3) nz.b0(this)).getCoroutineContext().k(b2.C))));
        this.e = d;
        return d;
    }

    public boolean W() {
        return !(this instanceof vs);
    }

    public void X() {
        if (this.q) {
            cy.b("node attached multiple times");
        }
        if (this.k == null) {
            cy.b("attach invoked on a node without a coordinator");
        }
        this.q = true;
        this.n = true;
    }

    public void Y() {
        if (!this.q) {
            cy.b("Cannot detach a node that is not attached");
        }
        if (this.n) {
            cy.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.o) {
            cy.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.q = false;
        jj jjVar = this.e;
        if (jjVar != null) {
            x40.t(jjVar, new y50("The Modifier.Node was detached", 0));
            this.e = null;
        }
    }

    public void e0() {
        if (!this.q) {
            cy.b("reset() called on an unattached node");
        }
        d0();
    }

    public void f0() {
        if (!this.q) {
            cy.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.n) {
            cy.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.n = false;
        Z();
        this.o = true;
    }

    public void g0() {
        if (!this.q) {
            cy.b("node detached multiple times");
        }
        if (this.k == null) {
            cy.b("detach invoked on a node without a coordinator");
        }
        if (!this.o) {
            cy.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.o = false;
        a3 a3Var = this.p;
        if (a3Var != null) {
            a3Var.a();
        }
        b0();
    }

    public void h0(t50 t50Var) {
        this.d = t50Var;
    }

    public void i0(ea0 ea0Var) {
        this.k = ea0Var;
    }

    public void Z() {
    }

    public /* synthetic */ void a0() {
    }

    public void b0() {
    }

    public /* synthetic */ void c0() {
    }

    public void d0() {
    }
}
