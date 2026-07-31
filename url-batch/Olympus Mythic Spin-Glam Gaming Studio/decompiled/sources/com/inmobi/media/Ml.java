package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public final class Ml {
    public final G a;

    public Ml(G adContext) {
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.a = adContext;
    }

    public static void a(HashMap macros, List nativeTrackers, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(nativeTrackers, "nativeTrackers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : nativeTrackers) {
            if (Intrinsics.areEqual(((Je) obj).b, "error")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((Je) it.next()).a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(macros, "macros");
            String str2 = str;
            for (Map.Entry entry : macros.entrySet()) {
                str2 = StringsKt.replace$default(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            arrayList2.add(str2);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String url = (String) it2.next();
            E3 e3 = E3.a;
            Rg priority = Rg.b;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(priority, "priority");
            Ug.a(priority, new C4408v3(url, c4493y9, null));
        }
    }
}
