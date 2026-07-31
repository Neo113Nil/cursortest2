package com.ogury.ad.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class l8 extends Lambda implements Function1 {
    public static final l8 a = new l8();

    public l8() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b it = (b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.v);
    }
}
