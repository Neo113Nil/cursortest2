package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gk0 implements bk, ck0 {
    public static final jc g = new jc(0);
    public final rj d;
    public final gk0 e = this;
    public volatile rj f;

    public gk0(rj rjVar) {
        this.d = rjVar;
    }

    public final void a() {
        synchronized (this.e) {
            try {
                rj rjVar = this.f;
                if (rjVar == null) {
                    this.f = g;
                } else {
                    zt ztVar = new zt(0);
                    zz zzVar = (zz) rjVar.k(b2.C);
                    if (zzVar != null) {
                        zzVar.a(ztVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ck0
    public final void d() {
        a();
    }

    @Override // defpackage.bk
    public final rj f() {
        rj rjVar;
        rj rjVar2 = this.f;
        if (rjVar2 == null || rjVar2 == g) {
            yh yhVar = (yh) this.d.k(yh.e);
            rj fk0Var = yhVar != null ? new fk0(yhVar, this) : up.d;
            synchronized (this.e) {
                try {
                    rj rjVar3 = this.f;
                    if (rjVar3 == null) {
                        rj rjVar4 = this.d;
                        rjVar = rjVar4.i(new b00((zz) rjVar4.k(b2.C))).i(up.d).i(fk0Var);
                    } else if (rjVar3 == g) {
                        rj rjVar5 = this.d;
                        b00 b00Var = new b00((zz) rjVar5.k(b2.C));
                        b00Var.y(new zt(0));
                        rjVar = rjVar5.i(b00Var).i(up.d).i(fk0Var);
                    } else {
                        rjVar = rjVar3;
                    }
                    this.f = rjVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            rjVar2 = rjVar;
        }
        rjVar2.getClass();
        return rjVar2;
    }

    @Override // defpackage.ck0
    public final void j() {
        a();
    }

    @Override // defpackage.ck0
    public final void c() {
    }
}
