package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Dk extends AbstractC4196n2 {
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dk(String eventType, String str, String eventSource) {
        super(eventType, str);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventSource, "eventSource");
        this.e = eventSource;
    }

    public final String toString() {
        return this.a + " ";
    }
}
