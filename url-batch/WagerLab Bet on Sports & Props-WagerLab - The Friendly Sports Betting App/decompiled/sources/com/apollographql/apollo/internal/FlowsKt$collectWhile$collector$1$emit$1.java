package com.apollographql.apollo.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: flows.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1", f = "flows.kt", i = {}, l = {31}, m = "emit", n = {}, s = {})
/* loaded from: classes3.dex */
public final class FlowsKt$collectWhile$collector$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowsKt$collectWhile$collector$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowsKt$collectWhile$collector$1$emit$1(FlowsKt$collectWhile$collector$1 flowsKt$collectWhile$collector$1, Continuation<? super FlowsKt$collectWhile$collector$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = flowsKt$collectWhile$collector$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
