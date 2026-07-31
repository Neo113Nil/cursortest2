package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a9 extends Exception {
    public String a;

    public a9(int i, String message) {
        message = (i & 4) != 0 ? "" : message;
        Intrinsics.checkNotNullParameter("", "type");
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = message;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
