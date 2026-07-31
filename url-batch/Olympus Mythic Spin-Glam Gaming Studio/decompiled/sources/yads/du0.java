package yads;

import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class du0 implements kh3 {
    public final i5 a;
    public final m62 b;
    public final y52 c;
    public final Iterator d;
    public final z30 e;

    public du0(i5 i5Var, m62 m62Var, y52 y52Var, Iterator it, z30 z30Var) {
        this.a = i5Var;
        this.b = m62Var;
        this.c = y52Var;
        this.d = it;
        this.e = z30Var;
    }

    @Override // yads.kh3
    public final void a() {
        if (this.d.hasNext()) {
            Pair pair = (Pair) this.d.next();
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            i5 i5Var = this.a;
            m62 m62Var = this.b;
            y52 y52Var = this.c;
            y52Var.a(str, new du0(i5Var, m62Var, y52Var, this.d, this.e), str2);
        }
    }

    @Override // yads.kh3
    public final void b() {
        this.e.a(y30.h);
    }

    @Override // yads.kh3
    public final void c() {
        a();
    }
}
