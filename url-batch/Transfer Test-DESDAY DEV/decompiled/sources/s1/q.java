package s1;

import o1.AbstractC0284a;
import o1.AbstractC0302t;

/* loaded from: classes.dex */
public class q extends AbstractC0284a implements Z0.d {
    public final X0.d d;

    public q(X0.d dVar, X0.i iVar) {
        super(iVar, true);
        this.d = dVar;
    }

    @Override // o1.W
    public final boolean A() {
        return true;
    }

    @Override // Z0.d
    public final Z0.d e() {
        X0.d dVar = this.d;
        if (dVar instanceof Z0.d) {
            return (Z0.d) dVar;
        }
        return null;
    }

    @Override // o1.W
    public void f(Object obj) {
        a.c(T.e.D(this.d), AbstractC0302t.j(obj), null);
    }

    @Override // o1.W
    public void g(Object obj) {
        this.d.b(AbstractC0302t.j(obj));
    }
}
