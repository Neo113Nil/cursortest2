package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class W7 implements ServiceComponentsInitializer {
    public final List a = CollectionsKt.listOf((Object[]) new String[]{"io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint"});

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(@NotNull Context context) {
        C5514md c5514md = Ka.I.s;
        List list = this.a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new G5((String) it.next()));
        }
        G5[] g5Arr = (G5[]) arrayList.toArray(new G5[0]);
        G5[] g5Arr2 = (G5[]) Arrays.copyOf(g5Arr, g5Arr.length);
        synchronized (c5514md) {
            CollectionsKt.addAll(c5514md.a, g5Arr2);
        }
    }
}
