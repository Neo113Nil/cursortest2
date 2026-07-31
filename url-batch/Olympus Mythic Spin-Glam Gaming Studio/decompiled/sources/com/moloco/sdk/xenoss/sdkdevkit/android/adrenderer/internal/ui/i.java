package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class i implements h {

    @NotNull
    public final Map<a.AbstractC1677a.c.EnumC1679a, a.AbstractC1677a.c> a = new LinkedHashMap();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.a.put(button.d(), button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h
    @NotNull
    public List<a.AbstractC1677a.c> p() {
        List list = MapsKt.toList(this.a);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((a.AbstractC1677a.c) ((Pair) it.next()).getSecond());
        }
        return arrayList;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c.EnumC1679a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.a.remove(buttonType);
    }
}
