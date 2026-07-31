package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.un, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4402un implements Flow {
    public final /* synthetic */ MutableStateFlow a;

    public C4402un(MutableStateFlow mutableStateFlow) {
        this.a = mutableStateFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.a.collect(new C4375tn(flowCollector), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
