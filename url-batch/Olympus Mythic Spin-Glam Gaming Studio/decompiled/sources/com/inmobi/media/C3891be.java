package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.be, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3891be implements Flow {
    public final /* synthetic */ MutableSharedFlow a;

    public C3891be(MutableSharedFlow mutableSharedFlow) {
        this.a = mutableSharedFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.a.collect(new C3865ae(flowCollector), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
