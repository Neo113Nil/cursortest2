package yads;

import android.content.Context;

/* loaded from: classes14.dex */
public final class fx2 {
    public final ub3 a;
    public final wb3 b;

    public fx2(Context context) {
        ub3 ub3Var = new ub3(context);
        wb3 wb3Var = new wb3(context);
        this.a = ub3Var;
        this.b = wb3Var;
    }

    public final void a() {
        boolean z;
        wb3 wb3Var = this.b;
        ce3 ce3Var = wb3Var.a;
        Context context = wb3Var.d;
        ce3Var.getClass();
        if (pa.a(context)) {
            vb3 vb3Var = wb3Var.b;
            bu2 a = vb3Var.a.a(wb3Var.d);
            if (a != null && a.r) {
                wb3Var.c.getClass();
                xb3.b();
            }
        }
        ub3 ub3Var = this.a;
        ce3 ce3Var2 = ub3Var.c;
        Context context2 = ub3Var.e;
        ce3Var2.getClass();
        if (pa.a(context2)) {
            vw2 vw2Var = ub3Var.b;
            vw2Var.getClass();
            synchronized (vw2.k) {
                z = vw2Var.g;
            }
            if (z) {
                tb3 tb3Var = ub3Var.d;
                bu2 a2 = tb3Var.a.a(ub3Var.e);
                if (a2 == null || !a2.q) {
                    return;
                }
                ub3Var.a.a();
            }
        }
    }
}
