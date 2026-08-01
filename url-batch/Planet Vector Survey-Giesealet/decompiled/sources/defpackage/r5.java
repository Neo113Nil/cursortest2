package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class r5 implements a60 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object f;

    public r5(a60 a60Var) {
        this.d = 1;
        this.e = a60Var;
        this.f = new w00();
    }

    private final Object c(mu muVar, lj ljVar) {
        p5 p5Var = (p5) this.f;
        hc hcVar = new hc(1, d31.B(ljVar));
        hcVar.q();
        q5 q5Var = new q5(hcVar, this, muVar);
        if (nz.l(p5Var.f, (Choreographer) this.e)) {
            synchronized (p5Var.h) {
                p5Var.j.add(q5Var);
                if (!p5Var.m) {
                    p5Var.m = true;
                    p5Var.f.postFrameCallback(p5Var.n);
                }
            }
            hcVar.s(new y3(2, p5Var, q5Var));
        } else {
            ((Choreographer) this.e).postFrameCallback(q5Var);
            hcVar.s(new y3(3, this, q5Var));
        }
        return hcVar.p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    @Override // defpackage.a60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(mu muVar, lj ljVar) {
        af0 af0Var;
        ck ckVar;
        int i;
        Object p;
        Object e;
        switch (this.d) {
            case 0:
                return c(muVar, ljVar);
            default:
                if (ljVar instanceof af0) {
                    af0Var = (af0) ljVar;
                    int i2 = af0Var.g;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        af0Var.g = i2 - Integer.MIN_VALUE;
                        Object obj = af0Var.e;
                        ckVar = ck.d;
                        i = af0Var.g;
                        int i3 = 1;
                        if (i != 0) {
                            rg0.u(obj);
                            w00 w00Var = (w00) this.f;
                            af0Var.d = muVar;
                            af0Var.g = 1;
                            if (!w00Var.a()) {
                                hc hcVar = new hc(1, d31.B(af0Var));
                                hcVar.q();
                                synchronized (w00Var.a) {
                                    w00Var.b.add(hcVar);
                                }
                                hcVar.s(new hv(i3, w00Var, hcVar));
                                p = hcVar.p();
                                if (p != ckVar) {
                                    p = ky0.a;
                                    break;
                                }
                            } else {
                                p = ky0.a;
                                break;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    rg0.u(obj);
                                    return obj;
                                }
                                g8.s("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            muVar = af0Var.d;
                            rg0.u(obj);
                        }
                        a60 a60Var = (a60) this.e;
                        af0Var.d = null;
                        af0Var.g = 2;
                        e = a60Var.e(muVar, af0Var);
                        if (e != ckVar) {
                            return e;
                        }
                        return ckVar;
                    }
                }
                af0Var = new af0(this, ljVar);
                Object obj2 = af0Var.e;
                ckVar = ck.d;
                i = af0Var.g;
                int i32 = 1;
                if (i != 0) {
                }
                a60 a60Var2 = (a60) this.e;
                af0Var.d = null;
                af0Var.g = 2;
                e = a60Var2.e(muVar, af0Var);
                if (e != ckVar) {
                }
                return ckVar;
        }
    }

    @Override // defpackage.pj
    public final qj getKey() {
        switch (this.d) {
        }
        return b2.D;
    }

    @Override // defpackage.rj
    public final rj i(rj rjVar) {
        switch (this.d) {
        }
        return nz.Q(this, rjVar);
    }

    @Override // defpackage.rj
    public final pj k(qj qjVar) {
        switch (this.d) {
        }
        return nz.A(this, qjVar);
    }

    @Override // defpackage.rj
    public final Object o(qu quVar, Object obj) {
        switch (this.d) {
        }
        return quVar.invoke(obj, this);
    }

    @Override // defpackage.rj
    public final rj s(qj qjVar) {
        switch (this.d) {
        }
        return nz.L(this, qjVar);
    }

    public r5(Choreographer choreographer, p5 p5Var) {
        this.d = 0;
        this.e = choreographer;
        this.f = p5Var;
    }
}
