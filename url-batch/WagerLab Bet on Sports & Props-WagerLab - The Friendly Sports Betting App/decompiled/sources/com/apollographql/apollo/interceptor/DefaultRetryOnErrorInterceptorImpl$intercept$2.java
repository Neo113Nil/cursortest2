package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [D] */
/* compiled from: RetryOnErrorInterceptor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "it", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2", f = "RetryOnErrorInterceptor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$2<D> extends SuspendLambda implements Function2<ApolloResponse<D>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.IntRef $attempt;
    final /* synthetic */ boolean $retryOnError;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultRetryOnErrorInterceptorImpl$intercept$2(boolean z, Ref.IntRef intRef, Continuation<? super DefaultRetryOnErrorInterceptorImpl$intercept$2> continuation) {
        super(2, continuation);
        this.$retryOnError = z;
        this.$attempt = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultRetryOnErrorInterceptorImpl$intercept$2 defaultRetryOnErrorInterceptorImpl$intercept$2 = new DefaultRetryOnErrorInterceptorImpl$intercept$2(this.$retryOnError, this.$attempt, continuation);
        defaultRetryOnErrorInterceptorImpl$intercept$2.L$0 = obj;
        return defaultRetryOnErrorInterceptorImpl$intercept$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApolloResponse<D> apolloResponse, Continuation<? super Unit> continuation) {
        return ((DefaultRetryOnErrorInterceptorImpl$intercept$2) create(apolloResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean isRecoverable;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApolloResponse apolloResponse = (ApolloResponse) this.L$0;
        if (this.$retryOnError && apolloResponse.exception != null) {
            ApolloException apolloException = apolloResponse.exception;
            Intrinsics.checkNotNull(apolloException);
            isRecoverable = RetryOnErrorInterceptorKt.isRecoverable(apolloException);
            if (isRecoverable) {
                throw RetryException.INSTANCE;
            }
        }
        this.$attempt.element = 0;
        return Unit.INSTANCE;
    }
}
