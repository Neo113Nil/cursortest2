package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class l extends g00 implements kj, bk {
    public final rj f;

    public l(rj rjVar, boolean z) {
        super(z);
        M((zz) rjVar.k(b2.C));
        this.f = rjVar.i(this);
    }

    @Override // defpackage.g00
    public final String B() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.g00
    public final void L(kf kfVar) {
        d31.A(this.f, kfVar);
    }

    @Override // defpackage.g00
    public final void T(Object obj) {
        if (!(obj instanceof jf)) {
            c0(obj);
        } else {
            jf jfVar = (jf) obj;
            b0(jfVar.a, jf.b.get(jfVar) != 0);
        }
    }

    public final void d0(ek ekVar, l lVar, qu quVar) {
        Object invoke;
        int ordinal = ekVar.ordinal();
        ky0 ky0Var = ky0.a;
        if (ordinal == 0) {
            try {
                d31.G(d31.B(d31.p(lVar, this, quVar)), ky0Var);
                return;
            } finally {
                resumeWith(new uk0(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                quVar.getClass();
                d31.B(d31.p(lVar, this, quVar)).resumeWith(ky0Var);
                return;
            }
            if (ordinal != 3) {
                g8.c();
                return;
            }
            try {
                rj rjVar = this.f;
                Object Y = mz.Y(rjVar, null);
                try {
                    if (quVar instanceof h9) {
                        px0.k(2, quVar);
                        invoke = quVar.invoke(lVar, this);
                    } else {
                        invoke = d31.M(quVar, lVar, this);
                    }
                    mz.S(rjVar, Y);
                    if (invoke != ck.d) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    mz.S(rjVar, Y);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // defpackage.bk
    public final rj f() {
        return this.f;
    }

    @Override // defpackage.kj
    public final rj getContext() {
        return this.f;
    }

    @Override // defpackage.kj
    public final void resumeWith(Object obj) {
        Throwable a = vk0.a(obj);
        if (a != null) {
            obj = new jf(a, false);
        }
        Object Q = Q(obj);
        if (Q == nk.h) {
            return;
        }
        x(Q);
    }

    public void c0(Object obj) {
    }

    public void b0(Throwable th, boolean z) {
    }
}
