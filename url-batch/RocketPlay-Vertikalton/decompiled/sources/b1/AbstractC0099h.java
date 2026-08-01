package b1;

import i1.j;
import i1.k;

/* renamed from: b1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0099h extends AbstractC0094c implements i1.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f2106a;

    public AbstractC0099h(Z0.d dVar) {
        super(dVar);
        this.f2106a = 2;
    }

    @Override // i1.e
    public final int f() {
        return this.f2106a;
    }

    @Override // b1.AbstractC0092a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        j.f3052a.getClass();
        String a2 = k.a(this);
        i1.f.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
