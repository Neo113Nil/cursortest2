package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.g0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5346g0 implements Un {
    public final /* synthetic */ C5372h0 a;

    public C5346g0(C5372h0 c5372h0) {
        this.a = c5372h0;
    }

    @Override // io.appmetrica.analytics.impl.Un
    @NotNull
    public final Thread a() {
        return this.a.b;
    }

    @Override // io.appmetrica.analytics.impl.Un
    @Nullable
    public final StackTraceElement[] b() {
        C5372h0 c5372h0 = this.a;
        return (StackTraceElement[]) c5372h0.a.get(c5372h0.b);
    }

    @Override // io.appmetrica.analytics.impl.Un
    @NotNull
    public final Map<Thread, StackTraceElement[]> c() {
        return this.a.a;
    }
}
