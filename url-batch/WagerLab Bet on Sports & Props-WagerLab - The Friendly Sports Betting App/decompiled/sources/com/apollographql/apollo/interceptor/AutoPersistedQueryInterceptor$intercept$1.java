package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.exception.AutoPersistedQueriesNotSupported;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [D] */
/* compiled from: AutoPersistedQueryInterceptor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1", f = "AutoPersistedQueryInterceptor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AutoPersistedQueryInterceptor$intercept$1<D> extends SuspendLambda implements Function2<FlowCollector<? super ApolloResponse<D>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApolloInterceptorChain $chain;
    final /* synthetic */ boolean $isMutation;
    final /* synthetic */ ApolloRequest<D> $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AutoPersistedQueryInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoPersistedQueryInterceptor$intercept$1(ApolloInterceptorChain apolloInterceptorChain, ApolloRequest<D> apolloRequest, AutoPersistedQueryInterceptor autoPersistedQueryInterceptor, boolean z, Continuation<? super AutoPersistedQueryInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.$chain = apolloInterceptorChain;
        this.$request = apolloRequest;
        this.this$0 = autoPersistedQueryInterceptor;
        this.$isMutation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoPersistedQueryInterceptor$intercept$1 autoPersistedQueryInterceptor$intercept$1 = new AutoPersistedQueryInterceptor$intercept$1(this.$chain, this.$request, this.this$0, this.$isMutation, continuation);
        autoPersistedQueryInterceptor$intercept$1.L$0 = obj;
        return autoPersistedQueryInterceptor$intercept$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super ApolloResponse<D>> flowCollector, Continuation<? super Unit> continuation) {
        return ((AutoPersistedQueryInterceptor$intercept$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow proceed = this.$chain.proceed(this.$request);
            final AutoPersistedQueryInterceptor autoPersistedQueryInterceptor = this.this$0;
            final ApolloRequest<D> apolloRequest = this.$request;
            final boolean z = this.$isMutation;
            final ApolloInterceptorChain apolloInterceptorChain = this.$chain;
            this.label = 1;
            if (proceed.collect(new FlowCollector() { // from class: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ApolloResponse) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ApolloResponse<D> apolloResponse, Continuation<? super Unit> continuation) {
                    boolean isPersistedQueryNotFound;
                    boolean isPersistedQueryNotSupported;
                    ApolloResponse<D> withAutoPersistedQueryInfo;
                    isPersistedQueryNotFound = AutoPersistedQueryInterceptor.this.isPersistedQueryNotFound(apolloResponse.errors);
                    if (!isPersistedQueryNotFound) {
                        isPersistedQueryNotSupported = AutoPersistedQueryInterceptor.this.isPersistedQueryNotSupported(apolloResponse.errors);
                        if (isPersistedQueryNotSupported) {
                            Object emit = flowCollector.emit(new ApolloResponse.Builder(apolloRequest.getOperation(), apolloRequest.getRequestUuid()).exception(new AutoPersistedQueriesNotSupported()).build(), continuation);
                            return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
                        }
                        FlowCollector<ApolloResponse<D>> flowCollector2 = flowCollector;
                        withAutoPersistedQueryInfo = AutoPersistedQueryInterceptor.this.withAutoPersistedQueryInfo(apolloResponse, true);
                        Object emit2 = flowCollector2.emit(withAutoPersistedQueryInfo, continuation);
                        return emit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit2 : Unit.INSTANCE;
                    }
                    ApolloRequest<D> build = apolloRequest.newBuilder().httpMethod(z ? HttpMethod.Post : AutoPersistedQueryInterceptor.this.httpMethodForDocumentQueries).sendDocument(Boxing.boxBoolean(true)).sendApqExtensions(Boxing.boxBoolean(true)).build();
                    FlowCollector<ApolloResponse<D>> flowCollector3 = flowCollector;
                    final Flow proceed2 = apolloInterceptorChain.proceed(build);
                    final AutoPersistedQueryInterceptor autoPersistedQueryInterceptor2 = AutoPersistedQueryInterceptor.this;
                    Object emitAll = FlowKt.emitAll(flowCollector3, new Flow<ApolloResponse<D>>() { // from class: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ AutoPersistedQueryInterceptor this$0;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2", f = "AutoPersistedQueryInterceptor.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            /* renamed from: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1$2$1, reason: invalid class name */
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

                            public AnonymousClass2(FlowCollector flowCollector, AutoPersistedQueryInterceptor autoPersistedQueryInterceptor) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = autoPersistedQueryInterceptor;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                ApolloResponse withAutoPersistedQueryInfo;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label -= Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            withAutoPersistedQueryInfo = this.this$0.withAutoPersistedQueryInfo((ApolloResponse) obj, false);
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(withAutoPersistedQueryInfo, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj22 = anonymousClass1.result;
                                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector flowCollector4, Continuation continuation2) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector4, autoPersistedQueryInterceptor2), continuation2);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }
                    }, continuation);
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
