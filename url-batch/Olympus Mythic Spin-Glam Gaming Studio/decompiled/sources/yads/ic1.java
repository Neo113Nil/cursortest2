package yads;

import android.app.Activity;
import android.content.Context;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes12.dex */
public final class ic1 implements jg0 {
    public final yu2 a;
    public final dc1 b;
    public final qz1 c;

    public ic1(v3 v3Var, yu2 yu2Var, o2 o2Var, int i) {
        dc1 dc1Var = new dc1(v3Var, yu2Var, o2Var, i);
        qz1 qz1Var = new qz1();
        this.a = yu2Var;
        this.b = dc1Var;
        this.c = qz1Var;
    }

    @Override // yads.jg0
    public final List a(Activity activity, t8 t8Var, m12 m12Var, d2 d2Var, z1 z1Var, z30 z30Var, s3 s3Var, pr2 pr2Var, x63 x63Var, ai0 ai0Var, ri0 ri0Var, i6 i6Var) {
        vi0 vi0Var;
        kw kwVar = new kw(t8Var, z1Var, new pl3(), d2Var, this.c, z30Var, x63Var);
        Context context = ((nt3) this.a).a;
        mt1 a = pr.a(context, context);
        List listOf = CollectionsKt.listOf((Object[]) new tx0[]{new bg2(kwVar, a), new jd1(kwVar, a), new id1(kwVar, a)});
        dc1 dc1Var = this.b;
        dc1Var.getClass();
        if (dc1Var.e.a(activity) && ri0Var != null) {
            vi0Var = new vi0(ri0Var, dc1Var.a, dc1Var.b, new dy(new kw(t8Var, z1Var, dc1Var.f, d2Var, dc1Var.g, z30Var, x63Var), new hz(t8Var, z1Var, s3Var, m12Var.d(), x63Var, ri0Var), new z03(i6Var, z1Var, dc1Var.g)), dc1Var.c, ai0Var, dc1Var.d);
            return CollectionsKt.filterNotNull(CollectionsKt.plus((Collection) CollectionsKt.listOf(vi0Var), (Iterable) listOf));
        }
        vi0Var = null;
        return CollectionsKt.filterNotNull(CollectionsKt.plus((Collection) CollectionsKt.listOf(vi0Var), (Iterable) listOf));
    }
}
