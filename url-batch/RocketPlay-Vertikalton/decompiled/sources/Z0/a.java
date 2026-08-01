package Z0;

import h1.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f1552a;

    public a(h hVar) {
        this.f1552a = hVar;
    }

    @Override // Z0.i
    public g f(h hVar) {
        return F1.d.A(this, hVar);
    }

    @Override // Z0.g
    public final h getKey() {
        return this.f1552a;
    }

    @Override // Z0.i
    public final i h(i iVar) {
        return F1.d.Y(this, iVar);
    }

    @Override // Z0.i
    public i i(h hVar) {
        return F1.d.S(this, hVar);
    }

    @Override // Z0.i
    public final Object q(Object obj, p pVar) {
        return pVar.d(obj, this);
    }
}
