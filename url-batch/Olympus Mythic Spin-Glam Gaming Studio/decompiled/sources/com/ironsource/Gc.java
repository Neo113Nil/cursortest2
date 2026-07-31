package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class Gc extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gc(@NotNull Exception e) {
        super("Missing Headers", e);
        Intrinsics.checkNotNullParameter(e, "e");
    }
}
