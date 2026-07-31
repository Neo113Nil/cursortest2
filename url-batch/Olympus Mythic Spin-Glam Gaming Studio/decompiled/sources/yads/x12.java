package yads;

import com.ironsource.O6;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public final class x12 {
    public final v3 a;
    public final u22 b;
    public final yr1 c;
    public t8 d;

    public x12(v3 v3Var) {
        u22 u22Var = new u22();
        yr1 yr1Var = new yr1();
        this.a = v3Var;
        this.b = u22Var;
        this.c = yr1Var;
    }

    public final io2 a() {
        io2 io2Var;
        io2 io2Var2 = new io2((Map) null, 3);
        t8 t8Var = this.d;
        if (t8Var == null) {
            return io2Var2;
        }
        io2 a = jo2.a(io2Var2, this.b.a(this.a, t8Var, (s12) t8Var.t));
        er1 er1Var = this.a.k;
        yr1 yr1Var = this.c;
        if (er1Var != null) {
            yr1Var.getClass();
            io2Var = yr1.a(er1Var);
        } else {
            yr1Var.getClass();
            io2Var = new io2(new LinkedHashMap(), 2);
            io2Var.b(do2.a, O6.G1);
        }
        return jo2.a(a, io2Var);
    }
}
