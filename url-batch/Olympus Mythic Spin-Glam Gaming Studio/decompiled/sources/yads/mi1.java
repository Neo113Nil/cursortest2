package yads;

/* loaded from: classes5.dex */
public final class mi1 extends mw0 {
    public static final Object f = new Object();
    public final Object d;
    public final Object e;

    public mi1(g73 g73Var, Object obj, Object obj2) {
        super(g73Var);
        this.d = obj;
        this.e = obj2;
    }

    @Override // yads.mw0, yads.g73
    public final f73 a(int i, f73 f73Var, long j) {
        this.c.a(i, f73Var, j);
        if (sb3.a(f73Var.b, this.d)) {
            f73Var.b = f73.s;
        }
        return f73Var;
    }

    @Override // yads.g73
    public final d73 a(int i, d73 d73Var, boolean z) {
        this.c.a(i, d73Var, z);
        if (sb3.a(d73Var.c, this.e) && z) {
            d73Var.c = f;
        }
        return d73Var;
    }

    @Override // yads.mw0, yads.g73
    public final int a(Object obj) {
        Object obj2;
        g73 g73Var = this.c;
        if (f.equals(obj) && (obj2 = this.e) != null) {
            obj = obj2;
        }
        return g73Var.a(obj);
    }

    @Override // yads.mw0, yads.g73
    public final Object a(int i) {
        Object a = this.c.a(i);
        return sb3.a(a, this.e) ? f : a;
    }
}
