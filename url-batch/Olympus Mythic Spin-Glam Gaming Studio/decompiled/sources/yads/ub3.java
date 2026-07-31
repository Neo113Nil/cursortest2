package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class ub3 {
    public final yb3 a;
    public final vw2 b;
    public final ce3 c;
    public final tb3 d;
    public final Context e;

    public ub3(Context context) {
        vw2 vw2Var;
        yb3 yb3Var = new yb3(context);
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        ce3 ce3Var = new ce3();
        tb3 tb3Var = new tb3();
        this.a = yb3Var;
        this.b = vw2Var2;
        this.c = ce3Var;
        this.d = tb3Var;
        this.e = context.getApplicationContext();
    }
}
