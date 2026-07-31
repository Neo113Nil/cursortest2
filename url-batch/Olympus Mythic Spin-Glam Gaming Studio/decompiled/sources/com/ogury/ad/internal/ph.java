package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ph extends Throwable {
    public final Throwable a;
    public final nh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(Throwable original, nh id) {
        super(original.getMessage(), original);
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(id, "id");
        this.a = original;
        this.b = id;
    }
}
