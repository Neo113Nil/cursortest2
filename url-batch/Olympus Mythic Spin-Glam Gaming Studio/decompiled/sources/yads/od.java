package yads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class od {
    public final nd a;
    public final ko2 b;
    public final qf c;

    public od(Context context) {
        nd ndVar;
        nd ndVar2 = pd.a;
        if (ndVar2 == null) {
            synchronized (nd.c) {
                Context a = pz.a(context);
                ndVar = pd.a;
                if (ndVar == null) {
                    ndVar = new nd(a);
                    pd.a = ndVar;
                }
            }
            ndVar2 = ndVar;
        }
        ko2 ko2Var = new ko2();
        qf qfVar = new qf(context);
        this.a = ndVar2;
        this.b = ko2Var;
        this.c = qfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(fo2 fo2Var, Map map, String str, y4 y4Var) {
        boolean z;
        int ordinal;
        te teVar;
        qf qfVar = this.c;
        bu2 a = qfVar.a.a(qfVar.b);
        boolean z2 = (a == null || a.t0) ? false : true;
        vw2 vw2Var = qfVar.a;
        synchronized (vw2.k) {
            z = vw2Var.h;
        }
        if (!qfVar.a() || z2 || !z) {
            return;
        }
        this.b.getClass();
        te teVar2 = null;
        try {
            ordinal = fo2Var.ordinal();
        } catch (Throwable unused) {
            boolean z3 = ob1.a;
        }
        if (ordinal == 0) {
            teVar = new te(ue.e, ko2.c(str, map));
        } else if (ordinal == 4) {
            teVar = new te(ue.d, ko2.a(str, map));
        } else if (ordinal == 8) {
            teVar = new te(ue.c, ko2.a(map));
        } else if (ordinal == 21) {
            teVar = new te(ue.f, ko2.a(map, y4Var, str));
        } else if (ordinal == 26) {
            teVar = new te(ue.g, ko2.b(str, map));
        } else {
            if (ordinal != 35) {
                if (teVar2 == null) {
                    this.a.b(teVar2);
                    return;
                }
                return;
            }
            teVar = new te(ue.h, ko2.d(str, map));
        }
        teVar2 = teVar;
        if (teVar2 == null) {
        }
    }
}
