package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L fromModel(@NotNull C5879p c5879p) {
        L l = new L();
        l.a = c5879p.a;
        l.c = (String[]) c5879p.b.toArray(new String[0]);
        l.b = c5879p.c;
        return l;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5879p toModel(@NotNull L l) {
        return new C5879p(l.a, ArraysKt.toList(l.c), l.b);
    }
}
