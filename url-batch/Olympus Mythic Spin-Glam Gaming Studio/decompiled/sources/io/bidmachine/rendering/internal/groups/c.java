package io.bidmachine.rendering.internal.groups;

import io.bidmachine.rendering.internal.event.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class c implements e {
    private final b a;

    public c(b stateGroupController) {
        Intrinsics.checkNotNullParameter(stateGroupController, "stateGroupController");
        this.a = stateGroupController;
    }

    @Override // io.bidmachine.rendering.internal.event.e
    public boolean a(List params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
        Iterator it = params.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return !this.a.a(arrayList);
    }
}
