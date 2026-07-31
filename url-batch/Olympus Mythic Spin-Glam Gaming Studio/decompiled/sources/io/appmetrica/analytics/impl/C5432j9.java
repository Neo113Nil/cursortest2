package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5432j9 implements ProtobufConverter {
    public static O9 a(C5407i9 c5407i9) {
        O9 o9 = new O9();
        o9.d = new int[c5407i9.b.size()];
        Iterator it = c5407i9.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            o9.d[i] = ((Integer) it.next()).intValue();
            i++;
        }
        o9.c = c5407i9.d;
        o9.b = c5407i9.c;
        o9.a = c5407i9.a;
        return o9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((C5407i9) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        O9 o9 = (O9) obj;
        return new C5407i9(o9.a, o9.b, o9.c, CollectionUtils.hashSetFromIntArray(o9.d));
    }
}
