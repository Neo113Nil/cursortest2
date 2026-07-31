package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes12.dex */
public final class ee3 {
    public final boolean a;
    public final ug3 b;
    public jp3 c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public ll3 i;
    public Integer j;
    public String k;
    public final ArrayList l;
    public final ArrayList m;
    public final LinkedHashMap n;
    public ne3 o;

    public ee3(Context context, boolean z) {
        ug3 ug3Var = new ug3(context);
        this.a = z;
        this.b = ug3Var;
        this.l = new ArrayList();
        this.m = new ArrayList();
        MapsKt.emptyMap();
        this.n = new LinkedHashMap();
        this.o = new ne3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Map] */
    public final ee3 a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if (linkedHashMap == null) {
            linkedHashMap2 = MapsKt.emptyMap();
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            for (String str2 : CollectionsKt.filterNotNull(list)) {
                LinkedHashMap linkedHashMap3 = this.n;
                Object obj = linkedHashMap3.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap3.put(str, obj);
                }
                ((List) obj).add(str2);
            }
        }
        return this;
    }

    public final fe3 a() {
        vw2 vw2Var;
        ug3 ug3Var = this.b;
        Map map = this.n;
        ll3 ll3Var = this.i;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            ug3Var.getClass();
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(ug3Var.a);
        if (!(a != null ? a.l : false)) {
            map = MapsKt.toMutableMap(map);
            ArrayList arrayList = ll3Var != null ? ll3Var.a : null;
            List list = (List) map.get("impression");
            if (arrayList != null) {
                map.put("impression", arrayList);
            } else {
                map.remove("impression");
            }
            if (list != null) {
                map.put("render_impression", list);
            } else {
                map.remove("render_impression");
            }
        }
        return new fe3(this.a, this.l, this.n, this.o, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.c, this.m, map);
    }
}
