package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class Xc {
    private final long a;

    @NotNull
    private final H3 b;

    public Xc(long j, @NotNull H3 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.a = j;
        this.b = unit;
    }

    public final long a() {
        return this.a;
    }

    @NotNull
    public final H3 b() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.a + " unit=" + this.b + ")";
    }

    public /* synthetic */ Xc(long j, H3 h3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? H3.Second : h3);
    }
}
