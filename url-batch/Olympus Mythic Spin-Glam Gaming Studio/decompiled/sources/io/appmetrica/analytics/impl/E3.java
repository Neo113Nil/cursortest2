package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class E3 implements InterfaceC5681so {
    @Override // io.appmetrica.analytics.impl.InterfaceC5681so, kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<I3> invoke(@NotNull List<I3> list, @NotNull I3 i3) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                EnumC5483l8 enumC5483l8 = ((I3) it.next()).b;
                EnumC5483l8 enumC5483l82 = i3.b;
                if (enumC5483l8 == enumC5483l82) {
                    if (enumC5483l82 != EnumC5483l8.d) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((I3) obj).b != EnumC5483l8.d) {
                            arrayList.add(obj);
                        }
                    }
                    return CollectionsKt.plus(arrayList, i3);
                }
            }
        }
        return CollectionsKt.plus(list, i3);
    }
}
