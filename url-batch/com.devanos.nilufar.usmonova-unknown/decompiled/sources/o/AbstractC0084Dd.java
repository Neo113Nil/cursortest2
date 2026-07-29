package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.Dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0084Dd {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0084Dd.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(AbstractC0084Dd.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC0084Dd(AbstractC1760qQ abstractC1760qQ) {
        this._prev$volatile = abstractC1760qQ;
    }

    public final void a() {
        b.set(this, null);
    }

    public final AbstractC0084Dd b() {
        Object obj = a.get(this);
        if (obj == PX.h) {
            return null;
        }
        return (AbstractC0084Dd) obj;
    }

    public abstract boolean c();

    public final void d() {
        AbstractC0084Dd b2;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            AbstractC0084Dd abstractC0084Dd = (AbstractC0084Dd) atomicReferenceFieldUpdater.get(this);
            while (abstractC0084Dd != null && abstractC0084Dd.c()) {
                abstractC0084Dd = (AbstractC0084Dd) atomicReferenceFieldUpdater.get(abstractC0084Dd);
            }
            AbstractC0084Dd b3 = b();
            AbstractC0048Bt.k(b3);
            while (b3.c() && (b2 = b3.b()) != null) {
                b3 = b2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b3);
                AbstractC0084Dd abstractC0084Dd2 = ((AbstractC0084Dd) obj) == null ? null : abstractC0084Dd;
                while (!atomicReferenceFieldUpdater.compareAndSet(b3, obj, abstractC0084Dd2)) {
                    if (atomicReferenceFieldUpdater.get(b3) != obj) {
                        break;
                    }
                }
            }
            if (abstractC0084Dd != null) {
                a.set(abstractC0084Dd, b3);
            }
            if (!b3.c() || b3.b() == null) {
                if (abstractC0084Dd == null || !abstractC0084Dd.c()) {
                    return;
                }
            }
        }
    }
}
