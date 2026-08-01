package w1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import q1.E;

/* loaded from: classes.dex */
public abstract class g extends E {

    /* renamed from: c, reason: collision with root package name */
    public b f4430c;

    @Override // q1.AbstractC0349o
    public final void D(Z0.i iVar, Runnable runnable) {
        b bVar = this.f4430c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.h;
        bVar.f(runnable, k.f4440g, false);
    }
}
