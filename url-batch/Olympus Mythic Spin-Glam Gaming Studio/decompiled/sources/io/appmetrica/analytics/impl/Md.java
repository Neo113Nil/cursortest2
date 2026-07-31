package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes10.dex */
public final class Md {
    public static ArrayList a() {
        C5748vd c5748vd;
        List<String> a = C5661s4.l().m.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
        for (String str : a) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c5748vd = new C5748vd(str, false);
            } else {
                C5661s4.l().m().b.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
                c5748vd = new C5748vd(str, true);
            }
            arrayList.add(c5748vd);
        }
        return arrayList;
    }
}
