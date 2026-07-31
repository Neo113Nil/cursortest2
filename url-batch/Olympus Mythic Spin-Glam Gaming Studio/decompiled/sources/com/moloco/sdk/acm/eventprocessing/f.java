package com.moloco.sdk.acm.eventprocessing;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    @NotNull
    public final com.moloco.sdk.acm.services.i a;
    public final long b;

    public f(@NotNull com.moloco.sdk.acm.services.i timeProviderService, long j) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.a = timeProviderService;
        this.b = j;
    }

    public final boolean a(@NotNull com.moloco.sdk.acm.db.b eventEntity) {
        Intrinsics.checkNotNullParameter(eventEntity, "eventEntity");
        return this.a.invoke() - eventEntity.l() >= this.b * ((long) 1000);
    }
}
