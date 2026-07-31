package yads;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class x7 {
    public static g7 a(d7 d7Var) {
        Object obj;
        int i = d7Var.e;
        boolean z = d7Var.a;
        boolean z2 = d7Var.f;
        Map map = d7Var.h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            b7 b7Var = c7.c;
            String str = (String) entry.getKey();
            b7Var.getClass();
            Iterator<E> it = c7.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((c7) obj).b, str)) {
                    break;
                }
            }
            AdQualityVerifiableNetwork a = b7.a((c7) obj);
            if (a != null) {
                linkedHashMap.put(a, new v7(((f7) entry.getValue()).b, ((f7) entry.getValue()).a));
            }
        }
        return new g7(i, z, z2, linkedHashMap, d7Var.g);
    }
}
