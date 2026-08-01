package u1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import o1.H;

/* loaded from: classes.dex */
public abstract class g extends H {

    /* renamed from: c, reason: collision with root package name */
    public b f3823c;

    @Override // o1.AbstractC0299p
    public final void z(X0.i iVar, Runnable runnable) {
        b bVar = this.f3823c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.h;
        bVar.j(runnable, k.f3833g, false);
    }
}
