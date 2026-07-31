package yads;

import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes4.dex */
public final class b2 implements f2 {
    public final yu2 a;

    public b2(yu2 yu2Var) {
        this.a = yu2Var;
    }

    @Override // yads.f2
    public final e2 a(AdActivity adActivity, RelativeLayout relativeLayout, o2 o2Var, z1 z1Var, Window window, w1 w1Var) {
        vw2 vw2Var;
        if (w1Var != null) {
            t8 t8Var = w1Var.a;
            v3 v3Var = w1Var.b;
            m12 m12Var = w1Var.e;
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
            bu2 a = vw2Var2.a(window.getContext());
            if (m12Var != null) {
                return new d2(adActivity, relativeLayout, window, m12Var, t8Var, o2Var, z1Var, v3Var, this.a, w1Var.f, a);
            }
        }
        return null;
    }
}
