package com.luckycounter.drinkwater.data;

import Z0.d;
import b1.AbstractC0094c;
import b1.InterfaceC0096e;

@InterfaceC0096e(c = "com.luckycounter.drinkwater.data.HydrationRepository", f = "HydrationRepository.kt", l = {56, 60, 61}, m = "logWater")
/* loaded from: classes.dex */
public final class HydrationRepository$logWater$1 extends AbstractC0094c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HydrationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HydrationRepository$logWater$1(HydrationRepository hydrationRepository, d dVar) {
        super(dVar);
        this.this$0 = hydrationRepository;
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.logWater(0, this);
    }
}
