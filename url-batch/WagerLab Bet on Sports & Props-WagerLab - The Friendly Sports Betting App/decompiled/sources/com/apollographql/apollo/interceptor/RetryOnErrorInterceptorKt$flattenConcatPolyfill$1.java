package com.apollographql.apollo.interceptor;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: RetryOnErrorInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flattenConcatPolyfill$1", f = "RetryOnErrorInterceptor.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RetryOnErrorInterceptorKt$flattenConcatPolyfill$1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<Flow<T>> $this_flattenConcatPolyfill;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RetryOnErrorInterceptorKt$flattenConcatPolyfill$1(Flow<? extends Flow<? extends T>> flow, Continuation<? super RetryOnErrorInterceptorKt$flattenConcatPolyfill$1> continuation) {
        super(2, continuation);
        this.$this_flattenConcatPolyfill = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetryOnErrorInterceptorKt$flattenConcatPolyfill$1 retryOnErrorInterceptorKt$flattenConcatPolyfill$1 = new RetryOnErrorInterceptorKt$flattenConcatPolyfill$1(this.$this_flattenConcatPolyfill, continuation);
        retryOnErrorInterceptorKt$flattenConcatPolyfill$1.L$0 = obj;
        return retryOnErrorInterceptorKt$flattenConcatPolyfill$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return ((RetryOnErrorInterceptorKt$flattenConcatPolyfill$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final FlowCollector flowCollector = (FlowCollector) this.L$0;
            this.label = 1;
            if (this.$this_flattenConcatPolyfill.collect(new FlowCollector() { // from class: com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flattenConcatPolyfill$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Flow) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Flow<? extends T> flow, Continuation<? super Unit> continuation) {
                    Object emitAll = FlowKt.emitAll(flowCollector, flow, continuation);
                    return emitAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitAll : Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
