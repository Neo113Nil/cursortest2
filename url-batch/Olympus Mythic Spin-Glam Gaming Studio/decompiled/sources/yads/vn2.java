package yads;

import android.graphics.Bitmap;

/* loaded from: classes13.dex */
public final class vn2 {
    public final ak3 a;
    public final tp b;
    public final xn2 c;
    public final tn2 d;

    public vn2(ak3 ak3Var, x62 x62Var) {
        tp tpVar = new tp();
        xn2 xn2Var = new xn2(ak3Var, x62Var);
        tn2 tn2Var = new tn2();
        this.a = ak3Var;
        this.b = tpVar;
        this.c = xn2Var;
        this.d = tn2Var;
    }

    public final void a() {
        q72 q72Var = (q72) this.a.b();
        if (q72Var != null) {
            wn2 wn2Var = q72Var.c.a;
            xn2 xn2Var = this.c;
            xn2Var.getClass();
            wn2Var.setVisibility(4);
            wn2Var.a.setOnClickListener(xn2Var.a);
            Bitmap bitmap = q72Var.b.getBitmap();
            if (bitmap != null) {
                tp tpVar = this.b;
                tpVar.a.execute(new sp(bitmap, new un2(this, q72Var, wn2Var), tpVar.b, tpVar.c));
            }
        }
    }
}
