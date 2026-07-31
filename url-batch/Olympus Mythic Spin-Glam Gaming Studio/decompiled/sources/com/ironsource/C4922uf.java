package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4922uf {
    private final int a;

    @NotNull
    private final H3 b;

    public C4922uf(int i, @NotNull H3 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.a = i;
        this.b = unit;
    }

    public final int a() {
        return this.a;
    }

    @NotNull
    public final H3 b() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.a + ", unit=" + this.b + ")";
    }
}
