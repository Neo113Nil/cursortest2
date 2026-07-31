package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes6.dex */
public final class cz1 {
    public final k83 a;
    public final b42 b;
    public final b13 c;

    public cz1(yu2 yu2Var) {
        k83 k83Var = new k83();
        b42 b42Var = new b42(yu2Var);
        b13 b13Var = new b13(yu2Var);
        this.a = k83Var;
        this.b = b42Var;
        this.c = b13Var;
    }

    public final k32 a(Context context, dz1 dz1Var, ri2 ri2Var, l02 l02Var, sz1 sz1Var) {
        v22 v22Var;
        gw0 gw0Var = new gw0();
        b42 b42Var = this.b;
        b42Var.getClass();
        ArrayList arrayList = new ArrayList();
        List<ry1> list = dz1Var.a.a;
        w72 w72Var = l02Var.c;
        for (ry1 ry1Var : list) {
            v72 a = w72Var.a(ry1Var);
            i12 i12Var = new i12(context, ry1Var, ri2Var, a);
            k83 k83Var = b42Var.b.a;
            x72 x72Var = new x72(ry1Var.b, k83.a(ry1Var.i, null), k83.a(ry1Var.h, null), ry1Var.c, ry1Var.g, ry1Var.j);
            w72 w72Var2 = w72Var;
            np a2 = b42Var.c.a(context, dz1Var, x72Var, a, l02Var, gw0Var, ry1Var, r9.d);
            a42 a42Var = b42Var.a;
            dq2 dq2Var = ry1Var.a;
            a42Var.getClass();
            int ordinal = dq2Var.ordinal();
            if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new az1(context, ry1Var, i12Var, ri2Var, a2, sz1Var));
            w72Var = w72Var2;
        }
        j32 j32Var = new j32(arrayList);
        b13 b13Var = this.c;
        b13Var.b.getClass();
        s12 s12Var = dz1Var.a;
        List list2 = s12Var.b;
        x72 x72Var2 = new x72(list2, k83.a(null, s12Var.g), k83.a(null, s12Var.c), "ad_unit", s12Var.d, null);
        v22 v22Var2 = v22.b;
        if (v22Var2 == null) {
            synchronized (v22.a) {
                v22Var = v22.b;
                if (v22Var == null) {
                    v22Var = new v22();
                    v22.b = v22Var;
                }
            }
            v22Var2 = v22Var;
        }
        zy1 zy1Var = new zy1(list2, v22Var2);
        return new k32(context, j32Var, ri2Var, new np(dz1Var, new f13(j32Var, zy1Var, uw2.a(), dz1Var.b), x72Var2, new g13(list2), l02Var, new ga(gw0Var), new i22(context, zy1Var, v22Var2), b13Var.a, null, r9.c), sz1Var);
    }
}
