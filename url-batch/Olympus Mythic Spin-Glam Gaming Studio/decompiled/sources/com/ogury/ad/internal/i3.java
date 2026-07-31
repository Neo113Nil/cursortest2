package com.ogury.ad.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class i3 extends Lambda implements Function1 {
    public static final i3 a = new i3();

    public i3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pf it = (pf) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
