package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class x00 implements ck0, vj {
    public final rj d;
    public final qu e;
    public final jj f;
    public ws0 g;

    public x00(rj rjVar, qu quVar) {
        this.d = rjVar;
        this.e = quVar;
        this.f = x40.d(rjVar.i(rjVar.k(yh.e) != null ? this : up.d));
    }

    @Override // defpackage.ck0
    public final void c() {
        ws0 ws0Var = this.g;
        if (ws0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            ws0Var.a(cancellationException);
        }
        this.g = d31.E(this.f, null, this.e, 3);
    }

    @Override // defpackage.ck0
    public final void d() {
        ws0 ws0Var = this.g;
        if (ws0Var != null) {
            ws0Var.z(new zt(1));
        }
        this.g = null;
    }

    @Override // defpackage.pj
    public final qj getKey() {
        return b2.u;
    }

    @Override // defpackage.rj
    public final rj i(rj rjVar) {
        return nz.Q(this, rjVar);
    }

    @Override // defpackage.ck0
    public final void j() {
        ws0 ws0Var = this.g;
        if (ws0Var != null) {
            ws0Var.z(new zt(1));
        }
        this.g = null;
    }

    @Override // defpackage.rj
    public final pj k(qj qjVar) {
        return nz.A(this, qjVar);
    }

    @Override // defpackage.vj
    public final void m(rj rjVar, Throwable th) {
        yh yhVar = (yh) rjVar.k(yh.e);
        if (yhVar != null) {
            x40.W(th, new f8(1, yhVar, this));
        }
        vj vjVar = (vj) this.d.k(b2.u);
        if (vjVar == null) {
            throw th;
        }
        vjVar.m(rjVar, th);
    }

    @Override // defpackage.rj
    public final Object o(qu quVar, Object obj) {
        return quVar.invoke(obj, this);
    }

    @Override // defpackage.rj
    public final rj s(qj qjVar) {
        return nz.L(this, qjVar);
    }
}
