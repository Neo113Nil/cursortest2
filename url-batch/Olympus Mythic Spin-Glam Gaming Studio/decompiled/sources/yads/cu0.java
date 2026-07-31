package yads;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class cu0 implements kh3 {
    public final i5 a;
    public final m62 b;
    public final du0 c;

    public cu0(i5 i5Var, m62 m62Var, y52 y52Var, Iterator it, z30 z30Var) {
        this.a = i5Var;
        this.b = m62Var;
        this.c = new du0(i5Var, m62Var, y52Var, it, z30Var);
    }

    @Override // yads.kh3
    public final void a() {
        this.a.a(h5.q);
        this.b.a();
        this.c.a();
    }

    @Override // yads.kh3
    public final void b() {
        this.a.a(h5.q);
        this.b.a();
        this.c.e.a(y30.h);
    }

    @Override // yads.kh3
    public final void c() {
    }
}
