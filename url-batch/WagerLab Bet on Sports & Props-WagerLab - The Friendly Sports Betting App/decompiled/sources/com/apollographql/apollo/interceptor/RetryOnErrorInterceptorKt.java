package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.OfflineException;
import com.apollographql.apollo.network.NetworkMonitor;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RetryOnErrorInterceptor.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\u001ab\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\f0\n27\u0010\r\u001a3\b\u0001\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000eH\u0000¢\u0006\u0002\u0010\u0014\u001a$\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\f0\n\"\u0004\b\u0000\u0010\f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\n0\nH\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"RetryOnErrorInterceptor", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "networkMonitor", "Lcom/apollographql/apollo/network/NetworkMonitor;", "isRecoverable", "", "Lcom/apollographql/apollo/exception/ApolloException;", "OfflineApolloException", "Lcom/apollographql/apollo/exception/ApolloNetworkException;", "flatMapConcatPolyfill", "Lkotlinx/coroutines/flow/Flow;", "R", "T", ViewProps.TRANSFORM, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flattenConcatPolyfill", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RetryOnErrorInterceptorKt {
    private static final ApolloNetworkException OfflineApolloException = new ApolloNetworkException("The device is offline", OfflineException.INSTANCE);

    public static final ApolloInterceptor RetryOnErrorInterceptor(NetworkMonitor networkMonitor) {
        Intrinsics.checkNotNullParameter(networkMonitor, "networkMonitor");
        return new DefaultRetryOnErrorInterceptorImpl(networkMonitor);
    }

    public static final ApolloInterceptor RetryOnErrorInterceptor() {
        return new DefaultRetryOnErrorInterceptorImpl(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRecoverable(ApolloException apolloException) {
        return apolloException instanceof ApolloNetworkException;
    }

    public static final <T> Flow<T> flattenConcatPolyfill(Flow<? extends Flow<? extends T>> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return FlowKt.flow(new RetryOnErrorInterceptorKt$flattenConcatPolyfill$1(flow, null));
    }

    public static final <T, R> Flow<R> flatMapConcatPolyfill(final Flow<? extends T> flow, final Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flattenConcatPolyfill(new Flow<Flow<? extends R>>() { // from class: com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ Function2 $transform$inlined;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2", f = "RetryOnErrorInterceptor.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Function2 function2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform$inlined = function2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
                
                    if (r7.emit(r8, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    FlowCollector flowCollector;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                Function2 function2 = this.$transform$inlined;
                                anonymousClass1.L$0 = flowCollector2;
                                anonymousClass1.label = 1;
                                Object invoke = function2.invoke(obj, anonymousClass1);
                                if (invoke != coroutine_suspended) {
                                    obj2 = invoke;
                                    flowCollector = flowCollector2;
                                }
                                return coroutine_suspended;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector3;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, transform), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        });
    }
}
