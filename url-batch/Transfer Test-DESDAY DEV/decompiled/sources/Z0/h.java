package Z0;

import g1.j;
import g1.k;

/* loaded from: classes.dex */
public abstract class h extends c implements g1.e {
    public final int d;

    public h(X0.d dVar) {
        super(dVar, dVar != null ? dVar.h() : null);
        this.d = 2;
    }

    @Override // g1.e
    public final int f() {
        return this.d;
    }

    @Override // Z0.a
    public final String toString() {
        if (this.f1174a != null) {
            return super.toString();
        }
        j.f2584a.getClass();
        String a2 = k.a(this);
        g1.f.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
