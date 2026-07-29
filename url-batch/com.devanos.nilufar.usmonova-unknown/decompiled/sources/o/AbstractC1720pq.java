package o;

/* renamed from: o.pq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1720pq implements Cloneable {
    public final AbstractC2181wq h;
    public AbstractC2181wq i;

    public AbstractC1720pq(AbstractC2181wq abstractC2181wq) {
        this.h = abstractC2181wq;
        if (abstractC2181wq.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.i = abstractC2181wq.i();
    }

    public final AbstractC2181wq a() {
        AbstractC2181wq b = b();
        b.getClass();
        if (AbstractC2181wq.f(b, true)) {
            return b;
        }
        throw new C0716aY();
    }

    public final AbstractC2181wq b() {
        if (!this.i.g()) {
            return this.i;
        }
        AbstractC2181wq abstractC2181wq = this.i;
        abstractC2181wq.getClass();
        C1229iL c1229iL = C1229iL.c;
        c1229iL.getClass();
        c1229iL.a(abstractC2181wq.getClass()).d(abstractC2181wq);
        abstractC2181wq.h();
        return this.i;
    }

    public final void c() {
        if (this.i.g()) {
            return;
        }
        AbstractC2181wq i = this.h.i();
        AbstractC2181wq abstractC2181wq = this.i;
        C1229iL c1229iL = C1229iL.c;
        c1229iL.getClass();
        c1229iL.a(i.getClass()).a(i, abstractC2181wq);
        this.i = i;
    }

    public final Object clone() {
        AbstractC1720pq abstractC1720pq = (AbstractC1720pq) this.h.c(5);
        abstractC1720pq.i = b();
        return abstractC1720pq;
    }
}
