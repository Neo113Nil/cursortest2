package yads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes6.dex */
public final class pw2 implements bq2 {
    public final t8 a;
    public final Context b;
    public final /* synthetic */ rw2 c;

    public pw2(rw2 rw2Var, Context context, t8 t8Var) {
        this.c = rw2Var;
        this.a = t8Var;
        this.b = context.getApplicationContext();
    }

    @Override // yads.bq2
    public final void a(s12 s12Var) {
        t8 t8Var = this.a;
        v3 v3Var = this.c.g;
        u22 u22Var = new u22();
        rw2 rw2Var = this.c;
        rw2Var.e.a(this.b, this.a, rw2Var.h);
        mt2 mt2Var = this.c.e;
        Context context = this.b;
        t8 t8Var2 = this.a;
        mt2Var.getClass();
        new io2((Map) null, 3);
        io2 a = u22Var.a(v3Var, t8Var, s12Var);
        go2 go2Var = go2.c;
        a.b("success", "status");
        mt2Var.a(context, t8Var2, fo2.g, a);
    }

    @Override // yads.bq2
    public final void a() {
        t8 t8Var = this.a;
        v3 v3Var = this.c.g;
        u22 u22Var = new u22();
        rw2 rw2Var = this.c;
        rw2Var.e.a(this.b, this.a, rw2Var.h);
        mt2 mt2Var = this.c.e;
        Context context = this.b;
        t8 t8Var2 = this.a;
        mt2Var.getClass();
        new io2((Map) null, 3);
        io2 a = u22Var.a(v3Var, t8Var, null);
        go2 go2Var = go2.c;
        a.b("success", "status");
        mt2Var.a(context, t8Var2, fo2.g, a);
    }
}
