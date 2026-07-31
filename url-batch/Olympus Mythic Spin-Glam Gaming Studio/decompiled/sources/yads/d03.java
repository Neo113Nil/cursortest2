package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class d03 implements i32 {
    public final ry1 a;
    public final cq2 b;
    public final k8 c;
    public final ty d;

    public d03(ry1 ry1Var) {
        cq2 cq2Var = new cq2();
        k8 k8Var = new k8();
        ty tyVar = new ty();
        this.a = ry1Var;
        this.b = cq2Var;
        this.c = k8Var;
        this.d = tyVar;
    }

    @Override // yads.i32
    public final io2 a(v3 v3Var, t8 t8Var, s12 s12Var) {
        cq2 cq2Var = this.b;
        ry1 ry1Var = this.a;
        io2 a = cq2Var.a(v3Var, t8Var);
        if (s12Var != null) {
            List a2 = cq2Var.b.a(s12Var);
            if (!a2.isEmpty()) {
                a.a(a2, "image_sizes");
            }
        }
        a.b(ry1Var.c, CreativeInfo.c);
        LinkedHashMap linkedHashMap = ry1Var.k.a;
        if (linkedHashMap != null) {
            a.a.putAll(linkedHashMap);
        }
        io2 a3 = this.c.a(v3Var.e);
        return jo2.a(jo2.a(a, a3), this.d.a(v3Var));
    }
}
