package yads;

import android.content.res.Resources;

/* loaded from: classes10.dex */
public final class t02 {
    public final Resources a;

    public t02(Resources resources) {
        this.a = resources;
    }

    public final y00 a(q31 q31Var, ri2 ri2Var) {
        if (q31Var != null) {
            return new y00(new s02(ri2Var, q31Var, this), q31Var.d, q31Var.a, q31Var.b);
        }
        return null;
    }
}
