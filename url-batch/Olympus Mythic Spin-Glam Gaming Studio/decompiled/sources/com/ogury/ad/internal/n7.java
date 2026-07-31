package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n7 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(String message) {
        super(message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
