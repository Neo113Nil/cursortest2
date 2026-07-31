package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes11.dex */
public final class Jo implements Ko {
    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(@Nullable List<Io> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (Io io2 : list) {
            if (!io2.a) {
                linkedList.add(io2.b);
                z = false;
            }
        }
        return z ? new Io(this, true, "") : new Io(this, false, CollectionsKt.joinToString(linkedList, ", ", "", "", -1, "", null));
    }
}
