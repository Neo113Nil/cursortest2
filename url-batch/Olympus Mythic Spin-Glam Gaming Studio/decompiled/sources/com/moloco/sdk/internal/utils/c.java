package com.moloco.sdk.internal.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class c implements CoroutineContext.Element {
    public static final int b = 8;

    @NotNull
    public final d a;

    public c(@NotNull d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a = key;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d getKey() {
        return this.a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2 function2) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
