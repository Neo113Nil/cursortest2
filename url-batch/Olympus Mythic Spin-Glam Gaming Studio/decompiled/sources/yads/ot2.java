package yads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ot2 {
    public final i5 a;
    public final fy2 b;
    public final q43 c;

    public ot2(i5 i5Var) {
        fy2 fy2Var = new fy2();
        q43 q43Var = new q43();
        this.a = i5Var;
        this.b = fy2Var;
        this.c = q43Var;
    }

    public final String a(Context context, ic icVar, om0 om0Var, wo woVar, yt2 yt2Var) {
        i5 i5Var = this.a;
        h5 h5Var = h5.D;
        i5Var.a(h5Var, null);
        jx jxVar = new jx(icVar, om0Var);
        String c = ((qg1) ty2.a(context).a).c("SessionData");
        String a = new w53().a();
        st0 a2 = tt0.a(context, this.b, jxVar, new up2(), new db2(context));
        e00 e00Var = woVar != null ? woVar.a : null;
        if (e00Var != null) {
            a2.B = e00Var.b;
        }
        l03 l03Var = woVar != null ? woVar.b : null;
        if (l03Var != null) {
            a2.E = l03Var.b().b;
            a2.C = Integer.valueOf(l03Var.c(context));
            a2.D = Integer.valueOf(l03Var.a(context));
        }
        a2.O0 = c;
        a2.N0 = a;
        a2.R0 = yt2Var != null ? yt2Var.b : null;
        Map map = woVar != null ? woVar.c : null;
        if (map != null) {
            a2.m.putAll(map);
        }
        String a3 = this.c.a(context, new wt0(a2).toString());
        i5Var.a(h5Var);
        return a3;
    }
}
