package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.lo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC5499lo {
    public static final C5421io a(Throwable th, X x, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        Yn a = th != null ? Zn.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Ul((StackTraceElement) it.next()));
            }
        }
        return new C5421io(a, x, arrayList, null, null, null, str, bool);
    }
}
