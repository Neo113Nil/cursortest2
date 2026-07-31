package yads;

import com.ironsource.X3;
import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes4.dex */
public final class ty {
    public final io2 a(v3 v3Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TypeIntrinsics.isMutableMap(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        int i = v3Var.n;
        linkedHashMap.put(X3.i.n, i != 1 ? i != 2 ? "undefined" : "landscape" : "portrait");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!TypeIntrinsics.isMutableMap(linkedHashMap2)) {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        linkedHashMap2.put("image_loading_automatically", Boolean.valueOf(v3Var.m));
        return new io2(MapsKt.plus(linkedHashMap, linkedHashMap2), (c) null);
    }
}
