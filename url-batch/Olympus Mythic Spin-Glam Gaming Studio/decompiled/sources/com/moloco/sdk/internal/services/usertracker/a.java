package com.moloco.sdk.internal.services.usertracker;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class a implements e {
    public static final int a = 0;

    @Override // com.moloco.sdk.internal.services.usertracker.e
    @NotNull
    public String a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return uuid;
    }
}
