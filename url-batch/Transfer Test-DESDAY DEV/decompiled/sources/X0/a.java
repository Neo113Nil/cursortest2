package X0;

import f1.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f930a;

    public a(h hVar) {
        this.f930a = hVar;
    }

    @Override // X0.g
    public final h getKey() {
        return this.f930a;
    }

    @Override // X0.i
    public g j(h hVar) {
        return T.e.u(this, hVar);
    }

    @Override // X0.i
    public final i m(i iVar) {
        g1.f.e(iVar, "context");
        return iVar == j.f936a ? this : (i) iVar.t(this, b.d);
    }

    @Override // X0.i
    public i n(h hVar) {
        return T.e.F(this, hVar);
    }

    @Override // X0.i
    public final Object t(Object obj, p pVar) {
        return pVar.d(obj, this);
    }
}
