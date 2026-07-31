package yads;

import android.content.Context;

/* loaded from: classes14.dex */
public final class u52 {
    public final je0 a;
    public final t52 b;

    public u52(Context context, v3 v3Var, yu2 yu2Var, t8 t8Var) {
        uo0 uo0Var;
        this.a = new je0(context.getApplicationContext(), v3Var, yu2Var, t8Var);
        uo0 uo0Var2 = uo0.c;
        if (uo0Var2 == null) {
            synchronized (uo0.b) {
                uo0Var = uo0.c;
                if (uo0Var == null) {
                    uo0Var = new uo0();
                    uo0.c = uo0Var;
                }
            }
            uo0Var2 = uo0Var;
        }
        this.b = new t52(uo0Var2);
    }
}
