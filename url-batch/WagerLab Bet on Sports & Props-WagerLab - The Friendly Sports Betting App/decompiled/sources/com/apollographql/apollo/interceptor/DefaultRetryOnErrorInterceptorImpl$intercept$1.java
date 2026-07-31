package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.network.NetworkMonitor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: Add missing generic type declarations: [D] */
/* compiled from: RetryOnErrorInterceptor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1", f = "RetryOnErrorInterceptor.kt", i = {}, l = {65, 67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$1<D> extends SuspendLambda implements Function2<FlowCollector<? super ApolloResponse<D>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<ApolloResponse<D>> $downStream;
    final /* synthetic */ boolean $failFastIfOffline;
    final /* synthetic */ ApolloRequest<D> $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultRetryOnErrorInterceptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultRetryOnErrorInterceptorImpl$intercept$1(boolean z, DefaultRetryOnErrorInterceptorImpl defaultRetryOnErrorInterceptorImpl, ApolloRequest<D> apolloRequest, Flow<ApolloResponse<D>> flow, Continuation<? super DefaultRetryOnErrorInterceptorImpl$intercept$1> continuation) {
        super(2, continuation);
        this.$failFastIfOffline = z;
        this.this$0 = defaultRetryOnErrorInterceptorImpl;
        this.$request = apolloRequest;
        this.$downStream = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultRetryOnErrorInterceptorImpl$intercept$1 defaultRetryOnErrorInterceptorImpl$intercept$1 = new DefaultRetryOnErrorInterceptorImpl$intercept$1(this.$failFastIfOffline, this.this$0, this.$request, this.$downStream, continuation);
        defaultRetryOnErrorInterceptorImpl$intercept$1.L$0 = obj;
        return defaultRetryOnErrorInterceptorImpl$intercept$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super ApolloResponse<D>> flowCollector, Continuation<? super Unit> continuation) {
        return ((DefaultRetryOnErrorInterceptorImpl$intercept$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r6.emit(r1.exception(r2).build(), r5) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r6, r5.$downStream, r5) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NetworkMonitor networkMonitor;
        ApolloNetworkException apolloNetworkException;
        StateFlow<Boolean> isOnline;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (this.$failFastIfOffline) {
                networkMonitor = this.this$0.networkMonitor;
                boolean z = false;
                if (networkMonitor != null && (isOnline = networkMonitor.isOnline()) != null) {
                    z = Intrinsics.areEqual(isOnline.getValue(), Boxing.boxBoolean(false));
                }
                if (z) {
                    ApolloResponse.Builder builder = new ApolloResponse.Builder(this.$request.getOperation(), this.$request.getRequestUuid());
                    apolloNetworkException = RetryOnErrorInterceptorKt.OfflineApolloException;
                    this.label = 1;
                }
            }
            this.label = 2;
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
