package yads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class cu2 {
    public final du2 a;
    public final lu2 b;

    public cu2(Context context, sf sfVar) {
        lu2 lu2Var;
        du2 du2Var = new du2(context, sfVar);
        lu2 lu2Var2 = lu2.c;
        if (lu2Var2 == null) {
            synchronized (lu2.b) {
                lu2Var = lu2.c;
                if (lu2Var == null) {
                    lu2Var = new lu2();
                    lu2.c = lu2Var;
                }
            }
            lu2Var2 = lu2Var;
        }
        this.a = du2Var;
        this.b = lu2Var2;
    }
}
