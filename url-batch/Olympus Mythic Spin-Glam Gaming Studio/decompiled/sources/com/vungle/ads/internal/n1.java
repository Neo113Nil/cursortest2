package com.vungle.ads.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class n1 extends Lambda implements Function2 {
    public final /* synthetic */ r1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(r1 r1Var) {
        super(2);
        this.a = r1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        if (intValue > 0 && intValue2 > 0) {
            this.a.x = intValue / intValue2;
        }
        return Unit.INSTANCE;
    }
}
