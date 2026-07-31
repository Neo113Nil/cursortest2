package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Q3 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
