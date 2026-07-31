package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ap1 {
    public final v3 a;
    public final fy2 b;

    public ap1(v3 v3Var) {
        fy2 fy2Var = new fy2();
        this.a = v3Var;
        this.b = fy2Var;
    }

    public static void a(Context context, LinkedHashMap linkedHashMap) {
        vw2 vw2Var;
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
        bu2 a = vw2Var2.a(context);
        Boolean bool = a != null ? a.Z : null;
        if (bool != null) {
            linkedHashMap.put("user_consent", bool);
        }
    }

    public Map a(Context context) {
        vw2 vw2Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d8 d8Var = this.a.e;
        if (d8Var != null) {
            Map map = d8Var.g;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            String str = d8Var.b;
            if (str != null) {
                linkedHashMap.put("age", str);
            }
            List list = d8Var.e;
            if (list != null) {
                linkedHashMap.put("context_tags", list);
            }
            String str2 = d8Var.c;
            if (str2 != null) {
                linkedHashMap.put("gender", str2);
            }
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
            Boolean c = vw2Var2.c();
            if (c != null) {
                linkedHashMap.put("age_restricted_user", c);
            }
            a(context, linkedHashMap);
        }
        mc mcVar = this.a.b.b.a;
        boolean b = this.b.b(context);
        if (mcVar != null) {
            boolean z = mcVar.b;
            String str3 = mcVar.a;
            if (!b && !z && str3 != null) {
                linkedHashMap.put("google_aid", str3);
            }
        }
        linkedHashMap.put("gms_available", Boolean.valueOf(this.a.b.a.f));
        linkedHashMap.put("sdk_version", "8.1.0");
        return linkedHashMap;
    }
}
