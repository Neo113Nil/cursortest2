package b1;

import Z0.i;
import Z0.j;

/* renamed from: b1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0098g extends AbstractC0092a {
    public AbstractC0098g(Z0.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != j.f1558a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // Z0.d
    public final i getContext() {
        return j.f1558a;
    }
}
