package yads;

import android.content.Context;

/* loaded from: classes.dex */
public final class g12 {
    public final f12 a;
    public final x02 b;

    public g12(Context context, yu2 yu2Var, p12 p12Var, f12 f12Var, e00 e00Var) {
        i5 i5Var = new i5();
        v3 v3Var = new v3(e00Var);
        this.a = f12Var;
        l12 l12Var = new l12(context, v3Var, yu2Var, i5Var, this);
        this.b = new x02(context, yu2Var, p12Var, v3Var, l12Var, i5Var);
        l12Var.c.e = new g8(v3Var);
    }

    public final void b() {
        x02 x02Var = this.b;
        d8 d8Var = x02Var.y.a;
        x02Var.b.a(h5.e, null);
        x02Var.C.b(cd1.b, x02Var);
        x02Var.c.j = Integer.valueOf(x02Var.y.d);
        x02Var.c.a(d8Var.a);
        v3 v3Var = x02Var.c;
        v3Var.f = x02Var.y.b;
        v3Var.m = d8Var.j;
        synchronized (x02Var) {
            x02Var.c(d8Var);
        }
    }

    public final void c() {
        f12 f12Var = this.a;
        f12Var.e.a();
        l12 l12Var = this.b.z;
        l12Var.d = null;
        l12Var.c.a(null, null, null);
        l12 l12Var2 = this.b.z;
        l12Var2.getClass();
        l12Var2.c.a(l12Var2.d, null, null);
        l12 l12Var3 = this.b.z;
        l12Var3.getClass();
        l12Var3.c.a(l12Var3.d, null, null);
        f12Var.d.remove(this);
    }
}
