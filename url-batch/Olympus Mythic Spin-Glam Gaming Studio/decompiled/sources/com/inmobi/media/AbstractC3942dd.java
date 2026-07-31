package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.dd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC3942dd {
    public static final List a(C3968ed c3968ed) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(c3968ed, "<this>");
        Kl kl = c3968ed.a;
        if (kl != null) {
            ArrayList arrayList2 = kl.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.areEqual(((Je) next).b, "click")) {
                    arrayList3.add(next);
                }
            }
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Je) it2.next()).a);
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
