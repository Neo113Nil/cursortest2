package yads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class co extends ro2 {
    public static final int v = (int) TimeUnit.SECONDS.toMillis(10);
    public final Context s;
    public final bo t;
    public final wo2 u;

    public co(Context context, int i, String str, bo boVar, wo2 wo2Var) {
        super(i, str, boVar);
        this.s = context;
        this.t = boVar;
        this.u = wo2Var;
        this.j = false;
        this.o = new we0(1.0f, v, 0);
    }

    @Override // yads.ro2
    public hm3 a(hm3 hm3Var) {
        return hm3Var;
    }

    @Override // yads.ro2
    public final void a(Object obj) {
        this.t.a(obj);
    }

    public final void a(Map map) {
        ly2 ly2Var;
        String b = xz0.b(map, a11.R);
        if (b != null) {
            Context context = this.s;
            ly2 ly2Var2 = ky2.b;
            if (ly2Var2 == null) {
                synchronized (ky2.a) {
                    ly2Var = ky2.b;
                    if (ly2Var == null) {
                        ly2Var = new ly2(sg1.a(context, "YadPreferenceFile"));
                        ky2.b = ly2Var;
                    }
                }
                ly2Var2 = ly2Var;
            }
            ((qg1) ly2Var2.a).a("ServerSideClientIP", b);
        }
    }
}
