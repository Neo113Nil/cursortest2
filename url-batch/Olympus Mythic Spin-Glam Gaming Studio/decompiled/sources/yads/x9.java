package yads;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class x9 {
    public static String a(w9 w9Var) {
        ArrayList arrayList = new ArrayList();
        if (!StringsKt.isBlank(w9Var.a())) {
            arrayList.add(w9Var.a());
        }
        if (!StringsKt.isBlank(w9Var.b())) {
            arrayList.add("erid: " + w9Var.b());
        }
        return CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62, null);
    }
}
