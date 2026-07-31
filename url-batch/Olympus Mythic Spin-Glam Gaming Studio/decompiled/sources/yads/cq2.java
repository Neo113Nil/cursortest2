package yads;

import com.facebook.internal.ServerProtocol;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class cq2 {
    public final eq2 a;
    public final v12 b;

    public cq2() {
        eq2 eq2Var = new eq2();
        v12 v12Var = new v12();
        this.a = eq2Var;
        this.b = v12Var;
    }

    public final io2 a(v3 v3Var, t8 t8Var) {
        String str;
        String str2;
        Map map;
        e00 e00Var;
        io2 io2Var = new io2(new LinkedHashMap(), 2);
        if (t8Var == null || !t8Var.y) {
            io2Var.b(t8Var != null ? t8Var.b : null, "ad_type_format");
            io2Var.b(t8Var != null ? t8Var.d : null, "product_type");
        }
        if (t8Var == null || (str = t8Var.e) == null) {
            str = v3Var.c.a;
        }
        io2Var.b(str, "ad_unit_id");
        io2Var.b(t8Var != null ? t8Var.l : null, "ad_source");
        io2Var.b((t8Var == null || (e00Var = t8Var.a) == null) ? v3Var.a.b : e00Var.b, "ad_type");
        io2Var.a(t8Var != null ? t8Var.k : null, "design");
        List list = t8Var != null ? t8Var.h : null;
        if (list != null && (!list.isEmpty())) {
            io2Var.a.put("active_experiments", list);
        }
        io2Var.a(t8Var != null ? t8Var.o : null, "server_log_id");
        this.a.getClass();
        if ((t8Var != null ? t8Var.q : null) != null) {
            str2 = "mediation";
        } else {
            str2 = (t8Var != null ? t8Var.t : null) != null ? "ad" : "empty";
        }
        io2Var.b(str2, ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE);
        if (t8Var != null && (map = t8Var.u) != null) {
            io2Var.a.putAll(map);
        }
        io2Var.b = t8Var != null ? t8Var.i : null;
        return io2Var;
    }

    public final io2 b(v3 v3Var, t8 t8Var) {
        List emptyList;
        io2 a = a(v3Var, t8Var);
        s12 s12Var = t8Var != null ? (s12) t8Var.t : null;
        if (s12Var != null) {
            this.b.getClass();
            emptyList = v12.b(s12Var);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        a.b(CollectionsKt.firstOrNull(emptyList), CreativeInfo.c);
        a.b(emptyList.isEmpty() ? null : emptyList, "ad_ids");
        return a;
    }
}
