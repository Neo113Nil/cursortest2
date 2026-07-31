package yads;

import android.view.View;

/* loaded from: classes13.dex */
public final class zw1 extends ek3 {
    public zw1(xw1 xw1Var) {
        super(xw1Var);
    }

    @Override // yads.ek3
    public final void a(ph phVar, hk3 hk3Var, Object obj) {
        xw1 xw1Var = (xw1) b();
        if (xw1Var == null) {
            return;
        }
        hk3Var.a(xw1Var, phVar);
        hk3Var.a(phVar, new gw1(xw1Var));
    }

    @Override // yads.ek3
    public final void b(View view, Object obj) {
        xw1 xw1Var = (xw1) view;
        ij1 ij1Var = (ij1) obj;
        al1 al1Var = ij1Var.a;
        if (al1Var == null) {
            return;
        }
        xw1Var.setAspectRatio(ij1Var.b);
        if (al1Var instanceof yk1) {
            xw1Var.a(((yk1) al1Var).a, (ww1) null);
        } else if (al1Var instanceof zk1) {
            xw1Var.a(((zk1) al1Var).a, (dx1) null);
        }
    }

    @Override // yads.ek3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
