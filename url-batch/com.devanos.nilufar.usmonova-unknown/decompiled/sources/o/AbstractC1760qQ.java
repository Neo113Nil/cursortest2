package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.qQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1760qQ extends AbstractC0084Dd implements SE {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(AbstractC1760qQ.class, "cleanedAndPointers$volatile");
    public final long c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC1760qQ(long j, AbstractC1760qQ abstractC1760qQ, int i) {
        super(abstractC1760qQ);
        this.c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // o.AbstractC0084Dd
    public final boolean c() {
        return d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, InterfaceC0189He interfaceC0189He);

    public final void h() {
        if (d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
