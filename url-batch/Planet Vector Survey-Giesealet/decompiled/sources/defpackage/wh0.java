package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wh0 extends l implements tc, gq0 {
    public final eb g;

    public wh0(rj rjVar, eb ebVar) {
        super(rjVar, true);
        this.g = ebVar;
    }

    @Override // defpackage.g00, defpackage.zz
    public final void a(CancellationException cancellationException) {
        Object obj = g00.d.get(this);
        if (obj instanceof jf) {
            return;
        }
        if ((obj instanceof f00) && ((f00) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new a00(B(), null, this);
        }
        z(cancellationException);
    }

    @Override // defpackage.l
    public final void b0(Throwable th, boolean z) {
        if (this.g.g(th, false) || z) {
            return;
        }
        d31.A(this.f, th);
    }

    @Override // defpackage.gq0
    public final Object c(kj kjVar, Object obj) {
        return this.g.c(kjVar, obj);
    }

    @Override // defpackage.l
    public final void c0(Object obj) {
        this.g.g(null, false);
    }

    @Override // defpackage.tc
    public final db iterator() {
        eb ebVar = this.g;
        ebVar.getClass();
        return new db(ebVar);
    }

    @Override // defpackage.tc
    public final Object l(fu0 fu0Var) {
        return this.g.l(fu0Var);
    }

    @Override // defpackage.tc
    public final Object p() {
        return this.g.p();
    }

    @Override // defpackage.gq0
    public final Object r(Object obj) {
        return this.g.r(obj);
    }

    @Override // defpackage.g00
    public final void z(CancellationException cancellationException) {
        this.g.g(cancellationException, true);
        y(cancellationException);
    }
}
