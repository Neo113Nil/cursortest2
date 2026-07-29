package o;

/* loaded from: classes.dex */
public abstract class TC implements InterfaceC0725ah {
    public int c;
    public TC e;
    public TC f;
    public AF g;
    public ME h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final TC b = this;
    public int d = -1;

    public final void k() {
        if (this.m) {
            AbstractC0868ct.W("node attached multiple times");
            throw null;
        }
        if (this.h == null) {
            AbstractC0868ct.W("attach invoked on a node without a coordinator");
            throw null;
        }
        this.m = true;
        this.k = true;
    }

    public final void l() {
        if (!this.m) {
            AbstractC0868ct.W("Cannot detach a node that is not attached");
            throw null;
        }
        if (this.k) {
            AbstractC0868ct.W("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (this.l) {
            AbstractC0868ct.W("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.m = false;
    }

    public final void o() {
        if (!this.m) {
            AbstractC0868ct.W("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.k) {
            AbstractC0868ct.W("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.k = false;
        m();
        this.l = true;
    }

    public final void p() {
        if (!this.m) {
            AbstractC0868ct.W("node detached multiple times");
            throw null;
        }
        if (this.h == null) {
            AbstractC0868ct.W("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.l) {
            AbstractC0868ct.W("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.l = false;
        n();
    }

    public void m() {
    }

    public void n() {
    }
}
