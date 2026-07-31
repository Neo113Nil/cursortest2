package com.vungle.ads.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class q2 extends Lambda implements Function1 {
    public static final q2 a = new q2();

    public q2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleInitializer", "Config fetch result: " + booleanValue);
        return Unit.INSTANCE;
    }
}
