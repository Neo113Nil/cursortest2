package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.network.NetworkMonitor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [D] */
/* compiled from: RetryOnErrorInterceptor.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;", "cause", "", "<unused var>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$3", f = "RetryOnErrorInterceptor.kt", i = {}, l = {79, 81}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$3<D> extends SuspendLambda implements Function4<FlowCollector<? super ApolloResponse<D>>, Throwable, Long, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Ref.IntRef $attempt;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultRetryOnErrorInterceptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultRetryOnErrorInterceptorImpl$intercept$3(Ref.IntRef intRef, DefaultRetryOnErrorInterceptorImpl defaultRetryOnErrorInterceptorImpl, Continuation<? super DefaultRetryOnErrorInterceptorImpl$intercept$3> continuation) {
        super(4, continuation);
        this.$attempt = intRef;
        this.this$0 = defaultRetryOnErrorInterceptorImpl;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, Long l, Continuation<? super Boolean> continuation) {
        return invoke((FlowCollector) obj, th, l.longValue(), continuation);
    }

    public final Object invoke(FlowCollector<? super ApolloResponse<D>> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
        DefaultRetryOnErrorInterceptorImpl$intercept$3 defaultRetryOnErrorInterceptorImpl$intercept$3 = new DefaultRetryOnErrorInterceptorImpl$intercept$3(this.$attempt, this.this$0, continuation);
        defaultRetryOnErrorInterceptorImpl$intercept$3.L$0 = th;
        return defaultRetryOnErrorInterceptorImpl$intercept$3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (com.apollographql.apollo.network.NetworkMonitorKt.waitForNetwork(r9, r8) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (kotlinx.coroutines.DelayKt.m13875delayVtjQ1oo(kotlin.time.DurationKt.toDuration(java.lang.Math.pow(2.0d, r8.$attempt.element), kotlin.time.DurationUnit.SECONDS), r8) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NetworkMonitor networkMonitor;
        NetworkMonitor networkMonitor2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (((Throwable) this.L$0) instanceof RetryException) {
                this.$attempt.element++;
                networkMonitor = this.this$0.networkMonitor;
                if (networkMonitor != null) {
                    networkMonitor2 = this.this$0.networkMonitor;
                    this.label = 1;
                } else {
                    Duration.Companion companion = Duration.INSTANCE;
                    this.label = 2;
                }
            } else {
                z = false;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(z);
    }
}
