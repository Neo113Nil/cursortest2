package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.Kt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282Kt extends AbstractC0179Gu {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(C0282Kt.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final M2 l;

    public C0282Kt(M2 m2) {
        this.l = m2;
    }

    @Override // o.AbstractC0179Gu
    public final boolean k() {
        return true;
    }

    @Override // o.AbstractC0179Gu
    public final void l(Throwable th) {
        if (m.compareAndSet(this, 0, 1)) {
            this.l.invoke(th);
        }
    }
}
