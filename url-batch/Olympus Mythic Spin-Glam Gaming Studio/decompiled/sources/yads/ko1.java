package yads;

import java.util.HashMap;

/* loaded from: classes5.dex */
public final class ko1 implements w8 {
    public final t8 a;

    public ko1(t8 t8Var) {
        this.a = t8Var;
    }

    @Override // yads.w8
    public final io2 a() {
        io2 io2Var = new io2(new HashMap(), 2);
        io2Var.b(this.a.l, "ad_source");
        io2Var.b(this.a.e, "ad_unit_id");
        io2Var.a(this.a.o, "server_log_id");
        io2Var.b = this.a.i;
        return io2Var;
    }
}
