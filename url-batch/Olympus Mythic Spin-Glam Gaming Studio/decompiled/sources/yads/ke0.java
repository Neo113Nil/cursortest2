package yads;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
public final class ke0 implements kh3 {
    public final i5 a;
    public final m62 b;
    public final z30 c;
    public final AtomicInteger d;

    public ke0(i5 i5Var, int i, m62 m62Var, z30 z30Var) {
        this.a = i5Var;
        this.b = m62Var;
        this.c = z30Var;
        this.d = new AtomicInteger(i);
    }

    @Override // yads.kh3
    public final void a() {
        if (this.d.decrementAndGet() == 0) {
            this.a.a(h5.q);
            this.b.a();
        }
    }

    @Override // yads.kh3
    public final void b() {
        if (this.d.getAndSet(0) > 0) {
            this.a.a(h5.q);
            this.c.a(y30.h);
            this.b.a();
        }
    }

    @Override // yads.kh3
    public final void c() {
    }
}
