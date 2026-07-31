package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.md, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5514md {
    public final ArrayList a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = this.a;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((G5) it.next()).a);
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return CollectionsKt.distinct(arrayList);
    }
}
