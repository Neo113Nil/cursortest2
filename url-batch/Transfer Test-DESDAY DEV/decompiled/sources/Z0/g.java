package Z0;

import X0.i;
import X0.j;

/* loaded from: classes.dex */
public abstract class g extends a {
    public g(X0.d dVar) {
        super(dVar);
        if (dVar != null && dVar.h() != j.f936a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // X0.d
    public final i h() {
        return j.f936a;
    }
}
