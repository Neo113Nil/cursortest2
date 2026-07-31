package yads;

import com.ironsource.O6;

/* loaded from: classes3.dex */
public final class sf3 implements lg3 {
    public final v3 a;
    public final t8 b;
    public final u22 c;

    public sf3(v3 v3Var, t8 t8Var) {
        u22 u22Var = new u22();
        this.a = v3Var;
        this.b = t8Var;
        this.c = u22Var;
    }

    @Override // yads.lg3
    public final io2 a() {
        t8 t8Var = this.b;
        s12 s12Var = (s12) t8Var.t;
        if (s12Var == null) {
            s12Var = null;
        }
        io2 a = this.c.a(this.a, t8Var, s12Var);
        a.b(do2.a, O6.G1);
        a.b = this.b.i;
        return a;
    }
}
