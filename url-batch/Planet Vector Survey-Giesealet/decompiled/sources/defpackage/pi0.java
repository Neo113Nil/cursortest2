package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pi0 implements ct0, or, bv {
    public final /* synthetic */ et0 d;

    public pi0(et0 et0Var) {
        this.d = et0Var;
    }

    @Override // defpackage.or
    public final Object a(pr prVar, kj kjVar) {
        this.d.a(prVar, kjVar);
        return ck.d;
    }

    @Override // defpackage.bv
    public final or b(rj rjVar, int i, cb cbVar) {
        return (((i < 0 || i >= 2) && i != -2) || cbVar != cb.e) ? a50.t(this, rjVar, i, cbVar) : this;
    }

    @Override // defpackage.ct0
    public final Object getValue() {
        return this.d.getValue();
    }
}
