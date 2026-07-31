package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public final class is1 {
    public is1(rr1 rr1Var) {
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qr1 qr1Var = (qr1) it.next();
            a(qr1Var.a, arrayList2);
            String str = qr1Var.c;
            String str2 = ((pr1) CollectionsKt.first(qr1Var.d)).b;
            boolean a = rr1.a(qr1Var);
            if (a) {
                a(str, str2, arrayList2);
            }
            a(arrayList2, qr1Var.d, qr1Var.a, a);
        }
        return arrayList2;
    }

    public static void a(String str, ArrayList arrayList) {
        int max = Math.max(4, 44 - str.length());
        int i = max / 2;
        String repeat = StringsKt.repeat("-", i);
        String repeat2 = StringsKt.repeat("-", (max % 2) + i);
        String repeat3 = StringsKt.repeat(" ", 1);
        arrayList.add(new hs1(repeat + repeat3 + str + repeat3 + repeat2, gs1.b));
    }

    public static void a(String str, String str2, ArrayList arrayList) {
        if (str != null && !StringsKt.isBlank(str)) {
            arrayList.add(new hs1("SDK Version: " + str, gs1.b));
        }
        if (str2 == null || StringsKt.isBlank(str2)) {
            return;
        }
        arrayList.add(new hs1("ADAPTERS Version: " + str2, gs1.b));
    }

    public static void a(ArrayList arrayList, List list, String str, boolean z) {
        gs1 gs1Var;
        String str2;
        String str3;
        if (z) {
            gs1Var = gs1.b;
            str2 = "ADAPTERS";
            str3 = "INTEGRATED SUCCESSFULLY";
        } else {
            gs1Var = gs1.c;
            str2 = "MISSING ADAPTERS";
            str3 = "NOT INTEGRATED";
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((pr1) it.next()).a());
        }
        arrayList.add(new hs1(CollectionsKt.joinToString$default(arrayList2, null, str2 + ": ", null, 0, null, null, 61, null), gs1Var));
        arrayList.add(new hs1(str + ": " + str3, gs1Var));
    }
}
