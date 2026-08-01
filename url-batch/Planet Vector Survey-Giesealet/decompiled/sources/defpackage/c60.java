package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class c60 implements b60 {
    public final yd0 d = new yd0(1.0f);

    @Override // defpackage.pj
    public final qj getKey() {
        return b2.E;
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

    @Override // defpackage.b60
    public final float t() {
        return this.d.g();
    }
}
