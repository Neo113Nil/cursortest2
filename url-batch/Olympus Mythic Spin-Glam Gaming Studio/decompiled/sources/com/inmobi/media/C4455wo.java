package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.wo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4455wo extends C3887ba {
    public final StackTraceElement[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4455wo(StackTraceElement[] stackTrace) {
        super("ANRWatchDog", "ANRWatchDogEvent", Hl.a(stackTrace));
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        this.g = stackTrace;
    }
}
