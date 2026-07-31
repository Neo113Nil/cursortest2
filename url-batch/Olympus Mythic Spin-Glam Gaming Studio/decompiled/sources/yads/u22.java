package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes14.dex */
public final class u22 implements i32 {
    public final cq2 a;
    public final k8 b;
    public final ty c;

    public u22() {
        cq2 cq2Var = new cq2();
        k8 k8Var = new k8();
        ty tyVar = new ty();
        this.a = cq2Var;
        this.b = k8Var;
        this.c = tyVar;
    }

    @Override // yads.i32
    public final io2 a(v3 v3Var, t8 t8Var, s12 s12Var) {
        cq2 cq2Var = this.a;
        io2 a = cq2Var.a(v3Var, t8Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TypeIntrinsics.isMutableMap(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (s12Var != null) {
            List a2 = cq2Var.b.a(s12Var);
            if (!a2.isEmpty()) {
                linkedHashMap.put("image_sizes", a2);
            }
            cq2Var.b.getClass();
            List list = s12Var.a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ry1) it.next()).a.b);
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put("native_ad_types", arrayList);
            }
            cq2Var.b.getClass();
            ArrayList b = v12.b(s12Var);
            Object firstOrNull = CollectionsKt.firstOrNull((List) b);
            if (firstOrNull == null) {
                linkedHashMap.put(CreativeInfo.c, "undefined");
            } else {
                linkedHashMap.put(CreativeInfo.c, firstOrNull);
            }
            if (b.isEmpty()) {
                b = null;
            }
            if (b == null) {
                linkedHashMap.put("ad_ids", "undefined");
            } else {
                linkedHashMap.put("ad_ids", b);
            }
        }
        c cVar = a.b;
        if (cVar == null) {
            cVar = null;
        }
        Map plus = MapsKt.plus(a.a, linkedHashMap);
        if (!TypeIntrinsics.isMutableMap(plus)) {
            plus = null;
        }
        if (plus == null) {
            plus = new LinkedHashMap();
        }
        io2 a3 = this.b.a(v3Var.e);
        io2 a4 = this.c.a(v3Var);
        if (cVar == null) {
            cVar = a3.b;
        }
        Map plus2 = MapsKt.plus(plus, a3.a);
        Map map = TypeIntrinsics.isMutableMap(plus2) ? plus2 : null;
        if (map == null) {
            map = new LinkedHashMap();
        }
        if (cVar == null) {
            cVar = a4.b;
        }
        return new io2(MapsKt.plus(map, a4.a), cVar);
    }
}
