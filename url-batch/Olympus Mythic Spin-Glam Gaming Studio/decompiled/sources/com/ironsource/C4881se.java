package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.se, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4881se extends IllegalArgumentException {

    @NotNull
    private final IronSourceError a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4881se(@NotNull IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = error;
        this.b = error.getErrorCode();
    }

    @NotNull
    public final IronSourceError a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}
