package yads;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b5 {
    public static final String a = "yandex_ad_info";

    public static String a(ne3 ne3Var) {
        Object obj;
        Iterator it = ne3Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((op0) obj).a, a)) {
                break;
            }
        }
        op0 op0Var = (op0) obj;
        if (op0Var != null) {
            return op0Var.b;
        }
        return null;
    }
}
