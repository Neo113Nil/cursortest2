package yads;

import android.graphics.Bitmap;

/* loaded from: classes6.dex */
public final class a31 implements wp2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ g31 b;

    public a31(g31 g31Var, String str) {
        this.b = g31Var;
        this.a = str;
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        g31 g31Var = this.b;
        String str = this.a;
        g31Var.b.a(str, bitmap);
        d31 d31Var = (d31) g31Var.c.remove(str);
        if (d31Var != null) {
            d31Var.b = bitmap;
            g31Var.d.put(str, d31Var);
            if (g31Var.f == null) {
                c31 c31Var = new c31(g31Var);
                g31Var.f = c31Var;
                g31Var.e.postDelayed(c31Var, 100);
            }
        }
    }
}
