package o1;

/* renamed from: o1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0299p extends X0.a implements X0.f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0298o f3332b = new C0298o(X0.e.f935a, C0297n.f3329b);

    public AbstractC0299p() {
        super(X0.e.f935a);
    }

    public boolean A() {
        return !(this instanceof f0);
    }

    @Override // X0.a, X0.i
    public final X0.g j(X0.h hVar) {
        X0.g a2;
        g1.f.e(hVar, "key");
        if (!(hVar instanceof C0298o)) {
            if (X0.e.f935a == hVar) {
                return this;
            }
            return null;
        }
        C0298o c0298o = (C0298o) hVar;
        X0.h hVar2 = this.f930a;
        if ((hVar2 == c0298o || c0298o.f3331b == hVar2) && (a2 = c0298o.a(this)) != null) {
            return a2;
        }
        return null;
    }

    @Override // X0.a, X0.i
    public final X0.i n(X0.h hVar) {
        g1.f.e(hVar, "key");
        boolean z2 = hVar instanceof C0298o;
        X0.j jVar = X0.j.f936a;
        if (z2) {
            C0298o c0298o = (C0298o) hVar;
            X0.h hVar2 = this.f930a;
            if ((hVar2 == c0298o || c0298o.f3331b == hVar2) && c0298o.a(this) != null) {
                return jVar;
            }
        } else if (X0.e.f935a == hVar) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0302t.e(this);
    }

    public abstract void z(X0.i iVar, Runnable runnable);
}
