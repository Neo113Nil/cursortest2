package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class m implements pj {
    public final qj d;

    public m(qj qjVar) {
        this.d = qjVar;
    }

    @Override // defpackage.pj
    public final qj getKey() {
        return this.d;
    }

    @Override // defpackage.rj
    public final rj i(rj rjVar) {
        return nz.Q(this, rjVar);
    }

    @Override // defpackage.rj
    public pj k(qj qjVar) {
        return nz.A(this, qjVar);
    }

    @Override // defpackage.rj
    public final Object o(qu quVar, Object obj) {
        return quVar.invoke(obj, this);
    }

    @Override // defpackage.rj
    public rj s(qj qjVar) {
        return nz.L(this, qjVar);
    }
}
