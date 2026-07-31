package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5870g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K fromModel(@NotNull C5868e c5868e) {
        K k = new K();
        k.a = c5868e.a;
        return k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C5868e(((K) obj).a);
    }

    @NotNull
    public final C5868e a(@NotNull K k) {
        return new C5868e(k.a);
    }
}
