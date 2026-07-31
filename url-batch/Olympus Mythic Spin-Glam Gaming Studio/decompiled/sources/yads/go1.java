package yads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class go1 {
    public final ArrayList a;
    public final ap1 b;
    public final mo1 c;
    public final zn1 d;
    public int e;

    public go1(ArrayList arrayList, ap1 ap1Var, so1 so1Var, mo1 mo1Var, int i) {
        mo1Var = (i & 8) != 0 ? new mo1(new lo1(so1Var)) : mo1Var;
        zn1 zn1Var = new zn1();
        this.a = arrayList;
        this.b = ap1Var;
        this.c = mo1Var;
        this.d = zn1Var;
    }

    public final tn1 a(Context context, Class cls) {
        com.monetization.ads.mediation.base.a aVar;
        er1 er1Var;
        do {
            aVar = null;
            if (this.e >= this.a.size()) {
                return null;
            }
            ArrayList arrayList = this.a;
            int i = this.e;
            this.e = i + 1;
            er1Var = (er1) arrayList.get(i);
            mo1 mo1Var = this.c;
            xo1 xo1Var = mo1Var.b;
            com.monetization.ads.mediation.base.a a = (xo1Var == null || !xo1Var.a(er1Var, cls)) ? mo1Var.a.a(context, er1Var, cls) : mo1Var.b.a(context, er1Var);
            if (a != null) {
                aVar = a;
            }
        } while (aVar == null);
        this.d.getClass();
        return new tn1(aVar, er1Var, new yn1(aVar), this.b);
    }
}
