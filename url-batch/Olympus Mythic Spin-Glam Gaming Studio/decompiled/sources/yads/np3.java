package yads;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes9.dex */
public final class np3 implements hp2 {
    public final pg3 a;

    public np3(pg3 pg3Var) {
        this.a = pg3Var;
    }

    @Override // yads.hp2
    public final ho2 a(Object obj) {
        Map a = this.a.a();
        fo2 fo2Var = fo2.c;
        return new ho2("vast_wrapper_request", MapsKt.toMutableMap(a), (c) null);
    }

    @Override // yads.hp2
    public final ho2 a(xp2 xp2Var, int i, Object obj, hm3 hm3Var) {
        go2 go2Var;
        nc3 nc3Var = xp2Var != null ? (nc3) xp2Var.a : null;
        if (204 == i) {
            go2Var = go2.e;
        } else if (nc3Var != null && i == 200) {
            go2Var = nc3Var.a.b.isEmpty() ? go2.e : go2.c;
        } else {
            go2Var = go2.d;
        }
        Map plus = MapsKt.plus(this.a.a(), MapsKt.mapOf(TuplesKt.to("status", go2Var.b)));
        fo2 fo2Var = fo2.c;
        return new ho2("vast_wrapper_response", MapsKt.toMutableMap(plus), (c) null);
    }
}
