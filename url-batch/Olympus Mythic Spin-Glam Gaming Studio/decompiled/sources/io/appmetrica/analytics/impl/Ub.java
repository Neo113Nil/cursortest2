package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class Ub implements ConfigProvider {
    public final C5532n5 a;
    public final Lazy b = LazyKt.lazy(new Tb(this));

    public Ub(@NotNull C5532n5 c5532n5) {
        this.a = c5532n5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5804xh getConfig() {
        return (C5804xh) this.b.getValue();
    }
}
