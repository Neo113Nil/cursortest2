package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ji {
    public final ArrayList a(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ph phVar = (ph) it.next();
            Object obj = phVar.c;
            String str = phVar.b;
            if (!Intrinsics.areEqual("image", str) || !(obj instanceof q31)) {
                if (Intrinsics.areEqual("media", str) && (obj instanceof dn1)) {
                    dn1 dn1Var = (dn1) obj;
                    if (dn1Var.c != null) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.monetization.ads.network.model.MediaValue");
                        List list2 = dn1Var.c;
                        q31 q31Var = list2 != null ? (q31) CollectionsKt.firstOrNull(list2) : null;
                        de3 de3Var = dn1Var.b;
                        ij1 ij1Var = dn1Var.a;
                        if (de3Var != null || ij1Var != null || (q31Var != null && s31.a(q31Var, map))) {
                            arrayList.add(phVar);
                        }
                    }
                }
                arrayList.add(phVar);
            } else if (s31.a((q31) obj, map)) {
                arrayList.add(phVar);
            }
        }
        return arrayList;
    }
}
