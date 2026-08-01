package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yh implements pc0, pj {
    public static final y7 e = new y7(7);
    public final qh d;

    public yh(qh qhVar) {
        this.d = qhVar;
    }

    @Override // defpackage.pc0
    public final List c(Integer num) {
        return this.d.D();
    }

    @Override // defpackage.pj
    public final qj getKey() {
        return e;
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
