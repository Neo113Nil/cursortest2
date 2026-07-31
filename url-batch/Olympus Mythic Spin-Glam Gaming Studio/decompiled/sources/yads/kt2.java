package yads;

import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class kt2 implements w8 {
    public final t8 a;

    public kt2(t8 t8Var) {
        this.a = t8Var;
    }

    @Override // yads.w8
    public final io2 a() {
        io2 io2Var = new io2(MapsKt.emptyMap(), (c) null);
        io2Var.b(this.a.l, "ad_source");
        io2Var.b(this.a.b, "ad_type_format");
        io2Var.b(this.a.e, "ad_unit_id");
        io2Var.b(this.a.d, "product_type");
        io2Var.a(this.a.o, "server_log_id");
        io2Var.b(this.a.c().a.b, "size_type");
        io2Var.b(Integer.valueOf(this.a.c().c), "width");
        io2Var.b(Integer.valueOf(this.a.c().d), "height");
        io2Var.b = this.a.i;
        return io2Var;
    }
}
