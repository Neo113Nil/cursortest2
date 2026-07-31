package com.ogury.core.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes5.dex */
public final class n0 implements Flow {
    public final /* synthetic */ Flow a;
    public final /* synthetic */ Ref$ObjectRef b;

    public n0(Flow flow, Ref$ObjectRef ref$ObjectRef) {
        this.a = flow;
        this.b = ref$ObjectRef;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.a.collect(new m0(flowCollector, this.b), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
