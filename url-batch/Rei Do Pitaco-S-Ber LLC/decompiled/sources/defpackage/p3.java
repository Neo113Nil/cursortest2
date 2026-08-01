package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class p3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ c4 g;

    public /* synthetic */ p3(c4 c4Var, int i) {
        this.f = i;
        this.g = c4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f;
        c4 c4Var = this.g;
        switch (i) {
            case 0:
                if ((c4Var.d0 & 1) != 0) {
                    c4Var.u(0);
                }
                if ((c4Var.d0 & 4096) != 0) {
                    c4Var.u(108);
                }
                c4Var.c0 = false;
                c4Var.d0 = 0;
                break;
            default:
                c4Var.A.showAtLocation(c4Var.z, 55, 0, 0);
                v80 v80Var = c4Var.C;
                if (v80Var != null) {
                    v80Var.b();
                }
                if (!c4Var.D || (viewGroup = c4Var.E) == null || !viewGroup.isLaidOut()) {
                    c4Var.z.setAlpha(1.0f);
                    c4Var.z.setVisibility(0);
                    break;
                } else {
                    c4Var.z.setAlpha(0.0f);
                    v80 a = f80.a(c4Var.z);
                    a.a(1.0f);
                    c4Var.C = a;
                    a.d(new r3(0, this));
                    break;
                }
        }
    }
}
