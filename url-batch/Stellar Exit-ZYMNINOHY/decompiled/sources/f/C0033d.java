package f;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: f.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033d extends a.a {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f511e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f512f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f513g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f514h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f515i;

    public C0033d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f511e = atomicReferenceFieldUpdater;
        this.f512f = atomicReferenceFieldUpdater2;
        this.f513g = atomicReferenceFieldUpdater3;
        this.f514h = atomicReferenceFieldUpdater4;
        this.f515i = atomicReferenceFieldUpdater5;
    }

    @Override // a.a
    public final boolean d(AbstractFutureC0036g abstractFutureC0036g, C0032c c0032c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0032c c0032c2 = C0032c.f509b;
        do {
            atomicReferenceFieldUpdater = this.f514h;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0036g, c0032c, c0032c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0036g) == c0032c);
        return false;
    }

    @Override // a.a
    public final boolean e(AbstractFutureC0036g abstractFutureC0036g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f515i;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0036g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0036g) == obj);
        return false;
    }

    @Override // a.a
    public final boolean f(AbstractFutureC0036g abstractFutureC0036g, C0035f c0035f, C0035f c0035f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f513g;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0036g, c0035f, c0035f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0036g) == c0035f);
        return false;
    }

    @Override // a.a
    public final void u(C0035f c0035f, C0035f c0035f2) {
        this.f512f.lazySet(c0035f, c0035f2);
    }

    @Override // a.a
    public final void v(C0035f c0035f, Thread thread) {
        this.f511e.lazySet(c0035f, thread);
    }
}
