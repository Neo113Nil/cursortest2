package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ya implements a60 {
    public final ab0 d;
    public Throwable f;
    public final Object e = new Object();
    public final q8 g = new q8(0);
    public x60 h = new x60();
    public x60 i = new x60();

    public ya(ab0 ab0Var) {
        this.d = ab0Var;
    }

    public static final void c(ya yaVar, Throwable th) {
        int i;
        synchronized (yaVar.e) {
            try {
                if (yaVar.f != null) {
                    return;
                }
                yaVar.f = th;
                x60 x60Var = yaVar.h;
                Object[] objArr = x60Var.a;
                int i2 = x60Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    hc hcVar = ((wa) objArr[i3]).b;
                    if (hcVar != null) {
                        hcVar.resumeWith(new uk0(th));
                    }
                }
                yaVar.h.c();
                q8 q8Var = yaVar.g;
                do {
                    i = q8Var.get();
                } while (!q8Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(long j) {
        int i;
        hc hcVar;
        Object uk0Var;
        synchronized (this.e) {
            try {
                x60 x60Var = this.h;
                this.h = this.i;
                this.i = x60Var;
                q8 q8Var = this.g;
                do {
                    i = q8Var.get();
                } while (!q8Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = x60Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    wa waVar = (wa) x60Var.e(i3);
                    mu muVar = waVar.a;
                    if (muVar != null && (hcVar = waVar.b) != null) {
                        try {
                            uk0Var = muVar.c(Long.valueOf(j));
                        } catch (Throwable th) {
                            uk0Var = new uk0(th);
                        }
                        hcVar.resumeWith(uk0Var);
                    }
                }
                x60Var.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.a60
    public final Object e(mu muVar, lj ljVar) {
        int i;
        int i2;
        boolean z = true;
        hc hcVar = new hc(1, d31.B(ljVar));
        hcVar.q();
        wa waVar = new wa();
        waVar.a = muVar;
        waVar.b = hcVar;
        ej0 ej0Var = new ej0();
        ej0Var.d = -1;
        synchronized (this.e) {
            Throwable th = this.f;
            if (th != null) {
                hcVar.resumeWith(new uk0(th));
            } else {
                q8 q8Var = this.g;
                do {
                    i = q8Var.get();
                    i2 = i + 1;
                } while (!q8Var.compareAndSet(i, i2));
                if ((134217727 & i2) != 1) {
                    z = false;
                }
                ej0Var.d = (i2 >>> 27) & 15;
                this.h.a(waVar);
                hcVar.s(new xa(waVar, this, ej0Var));
                if (z) {
                    try {
                        this.d.a();
                    } catch (Throwable th2) {
                        c(this, th2);
                    }
                }
            }
        }
        return hcVar.p();
    }

    @Override // defpackage.pj
    public final qj getKey() {
        return b2.D;
    }

    @Override // defpackage.rj
    public final rj i(rj rjVar) {
        return nz.Q(this, rjVar);
    }

    @Override // defpackage.rj
    public final pj k(qj qjVar) {
        return nz.A(this, qjVar);
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
