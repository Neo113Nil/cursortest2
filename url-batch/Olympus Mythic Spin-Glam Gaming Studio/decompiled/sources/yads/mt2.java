package yads;

import android.content.Context;
import com.ironsource.O6;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes13.dex */
public final class mt2 {
    public final v3 a;
    public final yu2 b;
    public final k8 c;

    public mt2(v3 v3Var, yu2 yu2Var) {
        k8 k8Var = new k8();
        new v12();
        new nt2();
        this.a = v3Var;
        this.b = yu2Var;
        this.c = k8Var;
    }

    public final void a(Context context, t8 t8Var, s22 s22Var) {
        Map emptyMap;
        io2 io2Var = new io2((Map) null, 3);
        if (s22Var != null) {
            List list = s22Var.a.b.c;
            List list2 = list.isEmpty() ? null : list;
            if (list2 == null || (emptyMap = MapsKt.mapOf(TuplesKt.to("image_sizes", CollectionsKt.toList(list2)))) == null) {
                emptyMap = MapsKt.emptyMap();
            }
            io2Var.a.putAll(emptyMap);
        }
        a(context, t8Var, fo2.f, io2Var);
    }

    public final void a(Context context, t8 t8Var, t22 t22Var) {
        io2 io2Var = new io2((Map) null, 3);
        go2 go2Var = go2.c;
        io2Var.b("success", "status");
        a(context, t8Var, fo2.g, io2Var);
    }

    public final void a(Context context, t8 t8Var, fo2 fo2Var, io2 io2Var) {
        ry1 ry1Var;
        dq2 dq2Var;
        io2 a = this.c.a(this.a.e);
        a.b(t8Var.e, "ad_unit_id");
        String str = do2.a;
        a.b(str, O6.G1);
        e00 e00Var = t8Var.a;
        a.b(e00Var != null ? e00Var.b : null, "ad_type");
        s12 s12Var = (s12) t8Var.t;
        if (s12Var != null) {
            List list = s12Var.a;
            String str2 = (list == null || (ry1Var = (ry1) CollectionsKt.firstOrNull(list)) == null || (dq2Var = ry1Var.a) == null) ? null : dq2Var.b;
            if (str2 == null) {
                str2 = "";
            }
            a.b(str2, "native_ad_type");
        }
        a.b(t8Var.l, "ad_source");
        io2 a2 = jo2.a(a, io2Var);
        Map map = a2.a;
        c cVar = a2.b;
        String str3 = fo2Var.b;
        Map mutableMap = MapsKt.toMutableMap(map);
        ho2 ho2Var = new ho2(str3, mutableMap, cVar);
        this.b.getClass();
        ud.a(context, new dq3(((nt3) this.b).a)).a(ho2Var);
        new od(context).a(fo2Var, mutableMap, str, null);
    }
}
