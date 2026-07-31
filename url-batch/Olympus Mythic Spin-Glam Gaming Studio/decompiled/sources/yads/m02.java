package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class m02 {
    public final a42 a;
    public final bz1 b;

    public m02(yu2 yu2Var) {
        a42 a42Var = new a42();
        bz1 bz1Var = new bz1(yu2Var);
        this.a = a42Var;
        this.b = bz1Var;
    }

    public final az1 a(Context context, dz1 dz1Var, ri2 ri2Var, cz1 cz1Var, l02 l02Var, sz1 sz1Var, ry1 ry1Var) {
        if (ry1Var == null) {
            return null;
        }
        a42 a42Var = this.a;
        dq2 dq2Var = ry1Var.a;
        a42Var.getClass();
        int ordinal = dq2Var.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        v72 a = l02Var.c.a(ry1Var);
        gw0 gw0Var = new gw0();
        k83 k83Var = cz1Var.a;
        List list = ry1Var.i;
        List list2 = dz1Var.a.g;
        k83Var.getClass();
        ArrayList a2 = k83.a(list, list2);
        k83 k83Var2 = cz1Var.a;
        List list3 = ry1Var.h;
        List list4 = dz1Var.a.c;
        k83Var2.getClass();
        return new az1(context, ry1Var, new i12(context, ry1Var, ri2Var, a), ri2Var, this.b.a(context, dz1Var, new x72(ry1Var.b, a2, k83.a(list3, list4), ry1Var.c, ry1Var.g, ry1Var.j), a, l02Var, gw0Var, ry1Var, r9.b), sz1Var);
    }
}
