package yads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ew2 implements bq2 {
    public final Context a;
    public final t8 b;
    public final /* synthetic */ hw2 c;

    public ew2(hw2 hw2Var, Context context, t8 t8Var) {
        this.c = hw2Var;
        this.a = context;
        this.b = t8Var;
    }

    @Override // yads.bq2
    public final void a(s12 s12Var) {
        t8 t8Var = this.b;
        v3 v3Var = this.c.b.b;
        u22 u22Var = new u22();
        hw2 hw2Var = this.c;
        hw2Var.f.a(this.a, this.b, hw2Var.e);
        mt2 mt2Var = this.c.f;
        Context context = this.a;
        t8 t8Var2 = this.b;
        mt2Var.getClass();
        new io2((Map) null, 3);
        io2 a = u22Var.a(v3Var, t8Var, s12Var);
        go2 go2Var = go2.c;
        a.b("success", "status");
        mt2Var.a(context, t8Var2, fo2.g, a);
    }

    @Override // yads.bq2
    public final void a() {
        hw2 hw2Var = this.c;
        hw2Var.f.a(this.a, this.b, hw2Var.e);
        this.c.f.a(this.a, this.b, (t22) null);
    }
}
