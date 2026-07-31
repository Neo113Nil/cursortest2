package yads;

import java.util.Map;

/* loaded from: classes4.dex */
public final class vo {
    public static io2 a(wo woVar) {
        io2 io2Var = new io2((Map) null, 3);
        io2Var.a(woVar.a.b, "ad_type");
        io2Var.a(woVar.c, "parameters");
        l03 l03Var = woVar.b;
        if (l03Var != null) {
            io2Var.b(l03Var.b().b, "size_type");
            io2Var.b(Integer.valueOf(l03Var.getWidth()), "width");
            io2Var.b(Integer.valueOf(l03Var.getHeight()), "height");
        }
        f00 f00Var = woVar.d;
        if (f00Var != null) {
            io2Var.a(f00Var.a, "adapter_network_name");
            io2Var.a(f00Var.b, "adapter_version");
            io2Var.a(f00Var.c, "adapter_network_sdk_version");
        }
        return io2Var;
    }
}
