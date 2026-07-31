package yads;

import android.app.Activity;
import android.widget.RelativeLayout;

/* loaded from: classes13.dex */
public final class sx0 {
    public final t8 a;
    public final RelativeLayout b;
    public final yu2 c;
    public final y32 d;
    public final sd1 e;
    public final t3 f;

    public sx0(Activity activity, t8 t8Var, RelativeLayout relativeLayout, d2 d2Var, z1 z1Var, int i, o2 o2Var, v3 v3Var, yu2 yu2Var) {
        vw2 vw2Var;
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
        y32 y32Var = new y32(o2Var, new ix0(vw2Var2.a(activity)));
        sd1 sd1Var = new sd1(activity, t8Var, d2Var, z1Var, i, o2Var, v3Var, yu2Var);
        t3 t3Var = new t3(o2Var);
        this.a = t8Var;
        this.b = relativeLayout;
        this.c = yu2Var;
        this.d = y32Var;
        this.e = sd1Var;
        this.f = t3Var;
    }
}
