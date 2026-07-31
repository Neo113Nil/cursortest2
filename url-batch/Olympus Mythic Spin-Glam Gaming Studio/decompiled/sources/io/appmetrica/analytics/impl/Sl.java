package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class Sl implements ListConverter {
    public final Tl a = new Tl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5585p6[] fromModel(@NonNull List<Ul> list) {
        C5585p6[] c5585p6Arr = new C5585p6[list.size()];
        Iterator<Ul> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            c5585p6Arr[i] = this.a.fromModel(it.next());
            i++;
        }
        return c5585p6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<Ul> a(C5585p6[] c5585p6Arr) {
        throw new UnsupportedOperationException();
    }
}
