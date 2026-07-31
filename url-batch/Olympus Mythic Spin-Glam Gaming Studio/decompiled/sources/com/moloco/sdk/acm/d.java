package com.moloco.sdk.acm;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {
    @NotNull
    public static final String a(@NotNull EventTag eventTag) {
        Intrinsics.checkNotNullParameter(eventTag, "<this>");
        return eventTag.getKey() + ':' + eventTag.getValue();
    }
}
