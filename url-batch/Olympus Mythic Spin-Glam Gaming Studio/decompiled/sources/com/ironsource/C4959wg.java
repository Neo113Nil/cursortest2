package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.wg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4959wg {

    @NotNull
    private final InterfaceC4818p4 a;

    public C4959wg(@NotNull InterfaceC4818p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = currentTimeProvider;
    }

    public final boolean a(long j, long j2) {
        long a = this.a.a();
        return j2 <= 0 || j <= 0 || a < j || a - j > j2;
    }
}
