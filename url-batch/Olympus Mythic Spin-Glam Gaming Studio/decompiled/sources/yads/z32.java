package yads;

import android.content.Context;
import java.util.List;

/* loaded from: classes5.dex */
public final class z32 implements ez1 {
    public final m02 a;

    public z32(yu2 yu2Var) {
        this.a = new m02(yu2Var);
    }

    @Override // yads.ez1
    public final void a(Context context, dz1 dz1Var, ri2 ri2Var, cz1 cz1Var, l02 l02Var, sz1 sz1Var, uz1 uz1Var) {
        m12 m12Var;
        List list = dz1Var.a.a;
        if (list == null || list.isEmpty()) {
            m12Var = null;
        } else if (list.size() > 1) {
            m12Var = cz1Var.a(context, dz1Var, ri2Var, l02Var, sz1Var);
        } else {
            m12Var = this.a.a(context, dz1Var, ri2Var, cz1Var, l02Var, sz1Var, (ry1) list.get(0));
        }
        if (m12Var != null) {
            uz1Var.a(m12Var);
        } else {
            uz1Var.a(e8.a);
        }
    }
}
