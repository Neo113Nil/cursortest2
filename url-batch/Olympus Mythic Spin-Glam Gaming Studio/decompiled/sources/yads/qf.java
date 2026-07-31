package yads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class qf {
    public final vw2 a;
    public final Context b;

    public qf(Context context) {
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
        this.a = vw2Var2;
        this.b = pz.a(context);
    }

    public final boolean a() {
        Boolean bool = (Boolean) rh1.a(this.b, sh1.i.b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean b() {
        bu2 a = this.a.a(this.b);
        boolean z = a != null && a.u0;
        Boolean bool = (Boolean) rh1.a(this.b, sh1.h.b);
        return a() && !z && (bool != null ? bool.booleanValue() : true);
    }

    public final boolean c() {
        bu2 a = this.a.a(this.b);
        return a() && (a != null && a.K);
    }
}
