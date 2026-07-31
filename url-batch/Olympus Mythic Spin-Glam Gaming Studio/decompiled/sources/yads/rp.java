package yads;

import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class rp {
    public final t8 a;
    public final mt1 b;
    public final hi c;

    public rp(c5 c5Var, e00 e00Var, t8 t8Var, String str, mt1 mt1Var) {
        hi hiVar = new hi(c5Var, e00Var, str);
        this.a = t8Var;
        this.b = mt1Var;
        this.c = hiVar;
    }

    public final void a(String str) {
        io2 a = this.c.a();
        a.b("no_view_for_asset", "reason");
        a.b(str, "asset_name");
        Map map = this.a.u;
        if (map != null) {
            a.a.putAll(map);
        }
        c cVar = this.a.i;
        a.b = cVar;
        fo2 fo2Var = fo2.c;
        this.b.a(new ho2("binding_failure", MapsKt.toMutableMap(a.a), cVar));
    }
}
