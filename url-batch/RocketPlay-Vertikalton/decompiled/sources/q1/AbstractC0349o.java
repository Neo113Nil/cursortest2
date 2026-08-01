package q1;

/* renamed from: q1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0349o extends Z0.a implements Z0.f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0348n f3911b = new C0348n(Z0.e.f1557a, C0347m.f3908b);

    public AbstractC0349o() {
        super(Z0.e.f1557a);
    }

    public abstract void D(Z0.i iVar, Runnable runnable);

    public boolean E() {
        return !(this instanceof d0);
    }

    @Override // Z0.a, Z0.i
    public final Z0.g f(Z0.h hVar) {
        Z0.g a2;
        i1.f.e(hVar, "key");
        if (!(hVar instanceof C0348n)) {
            if (Z0.e.f1557a == hVar) {
                return this;
            }
            return null;
        }
        C0348n c0348n = (C0348n) hVar;
        Z0.h hVar2 = this.f1552a;
        if ((hVar2 == c0348n || c0348n.f3910b == hVar2) && (a2 = c0348n.a(this)) != null) {
            return a2;
        }
        return null;
    }

    @Override // Z0.a, Z0.i
    public final Z0.i i(Z0.h hVar) {
        i1.f.e(hVar, "key");
        boolean z2 = hVar instanceof C0348n;
        Z0.j jVar = Z0.j.f1558a;
        if (z2) {
            C0348n c0348n = (C0348n) hVar;
            Z0.h hVar2 = this.f1552a;
            if ((hVar2 == c0348n || c0348n.f3910b == hVar2) && c0348n.a(this) != null) {
                return jVar;
            }
        } else if (Z0.e.f1557a == hVar) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0352s.c(this);
    }
}
