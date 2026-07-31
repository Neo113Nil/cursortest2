package yads;

import android.content.Context;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class v83 {
    public final v3 a;
    public final mt1 b;

    public v83(Context context, v3 v3Var, yu2 yu2Var) {
        yu2Var.getClass();
        mt1 a = ud.a(context, new dq3(((nt3) yu2Var).a));
        this.a = v3Var;
        this.b = a;
    }

    public final void a(Map map, bu2 bu2Var) {
        fo2 fo2Var = fo2.c;
        if (bu2Var == null || !bu2Var.A0) {
            return;
        }
        v3 v3Var = this.a;
        Pair pair = TuplesKt.to("ad_type", v3Var.a.b);
        String str = v3Var.c.a;
        if (str == null) {
            str = "";
        }
        this.b.a(new ho2("tracking_event", MapsKt.toMutableMap(MapsKt.plus(MapsKt.mapOf(pair, TuplesKt.to("ad_unit_id", str)), map)), (c) null));
    }
}
