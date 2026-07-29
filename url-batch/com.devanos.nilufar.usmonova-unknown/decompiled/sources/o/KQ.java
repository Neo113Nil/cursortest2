package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class KQ extends AbstractC1760qQ {
    public final /* synthetic */ AtomicReferenceArray e;

    public KQ(long j, KQ kq, int i) {
        super(j, kq, i);
        this.e = new AtomicReferenceArray(JQ.f);
    }

    @Override // o.AbstractC1760qQ
    public final int f() {
        return JQ.f;
    }

    @Override // o.AbstractC1760qQ
    public final void g(int i, InterfaceC0189He interfaceC0189He) {
        this.e.set(i, JQ.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
