package io.appmetrica.analytics.impl;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class Zc implements Z8 {
    public final Pe a;
    public final Function0 b;

    public Zc(@NotNull Pe pe, @NotNull Function0 function0) {
        this.a = pe;
        this.b = function0;
    }

    @Override // io.appmetrica.analytics.impl.Z8
    public final boolean b() {
        return ((Oe) this.a).b.get() >= ((long) ((Number) this.b.mo4828invoke()).intValue());
    }
}
