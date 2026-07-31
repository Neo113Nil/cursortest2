package yads;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class es2 implements jg0 {
    public final ur2 a;

    public es2(v3 v3Var, yu2 yu2Var, o2 o2Var, int i) {
        this.a = new ur2(v3Var, yu2Var, o2Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    @Override // yads.jg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(Activity activity, t8 t8Var, m12 m12Var, d2 d2Var, z1 z1Var, z30 z30Var, s3 s3Var, pr2 pr2Var, x63 x63Var, ai0 ai0Var, ri0 ri0Var, i6 i6Var) {
        vi0 vi0Var;
        ArrayList arrayList = new ArrayList();
        ur2 ur2Var = this.a;
        ur2Var.getClass();
        if (ur2Var.e.a(activity) && ri0Var != null) {
            vi0Var = new vi0(ri0Var, ur2Var.a, ur2Var.b, ur2.a(t8Var, m12Var, z1Var, s3Var, pr2Var, x63Var, ri0Var, i6Var), ur2Var.c, ai0Var, ur2Var.d);
            if (vi0Var != null) {
                arrayList.add(vi0Var);
            }
            return arrayList;
        }
        vi0Var = null;
        if (vi0Var != null) {
        }
        return arrayList;
    }
}
