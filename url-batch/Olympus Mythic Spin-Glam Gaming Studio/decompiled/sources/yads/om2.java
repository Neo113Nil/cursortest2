package yads;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes13.dex */
public final class om2 {
    public final t8 a;
    public final mt1 b;
    public final hi c;
    public boolean d;

    public om2(Context context, yu2 yu2Var, c5 c5Var, e00 e00Var, t8 t8Var, String str) {
        yu2Var.getClass();
        mt1 a = ud.a(context, new dq3(((nt3) yu2Var).a));
        hi hiVar = new hi(c5Var, e00Var, str);
        this.a = t8Var;
        this.b = a;
        this.c = hiVar;
        this.d = true;
    }

    public final void a() {
        if (this.d) {
            this.d = false;
            return;
        }
        io2 a = this.c.a();
        Map map = this.a.u;
        if (map != null) {
            a.a.putAll(map);
        }
        c cVar = this.a.i;
        a.b = cVar;
        fo2 fo2Var = fo2.c;
        this.b.a(new ho2("rebind", MapsKt.toMutableMap(a.a), cVar));
    }
}
