package yads;

import android.content.Context;
import com.ironsource.O6;

/* loaded from: classes6.dex */
public final class w41 {
    public t8 a;
    public final v3 b;
    public final y4 c;
    public final mt1 d;
    public final bu2 e;
    public final lx f;
    public final od g;
    public w22 h;

    public w41(Context context, t8 t8Var, v3 v3Var, yu2 yu2Var, y4 y4Var) {
        vw2 vw2Var;
        yu2Var.getClass();
        mt1 a = ud.a(context, new dq3(((nt3) yu2Var).a));
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
        bu2 a2 = vw2Var2.a(context);
        lx lxVar = new lx();
        od odVar = new od(context);
        this.a = t8Var;
        this.b = v3Var;
        this.c = y4Var;
        this.d = a;
        this.e = a2;
        this.f = lxVar;
        this.g = odVar;
    }

    public final void a(fo2 fo2Var, io2 io2Var) {
        ho2 ho2Var = new ho2(fo2Var, io2Var.a, io2Var.b);
        this.d.a(ho2Var);
        this.g.a(fo2Var, ho2Var.b, do2.a, this.c);
    }

    public final io2 a(bc3 bc3Var) {
        io2 a = a();
        a.b(bc3Var.a.b, "reason");
        String str = bc3Var.b;
        if (str != null && str.length() > 0) {
            a.b(str, "asset_name");
        }
        String str2 = bc3Var.c;
        if (str2 != null && str2.length() > 0) {
            a.b(str2, "description");
        }
        return a;
    }

    public final io2 a() {
        io2 a = this.f.a(this.b, this.a);
        a.b(do2.a, O6.G1);
        l03 l03Var = this.b.d.a;
        if (l03Var != null) {
            a.b(l03Var.b().b, "size_type");
            a.b(Integer.valueOf(l03Var.getWidth()), "width");
            a.b(Integer.valueOf(l03Var.getHeight()), "height");
        }
        bu2 bu2Var = this.e;
        if (bu2Var != null) {
            a.b(bu2Var.R, "banner_size_calculation_type");
        }
        w22 w22Var = this.h;
        return w22Var != null ? jo2.a(a, w22Var.a()) : a;
    }
}
