package com.apollographql.apollo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ApolloCall.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.ApolloCall", f = "ApolloCall.kt", i = {}, l = {206}, m = "singleSuccessOrException", n = {}, s = {})
/* loaded from: classes3.dex */
final class ApolloCall$singleSuccessOrException$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ApolloCall<D> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloCall$singleSuccessOrException$1(ApolloCall<D> apolloCall, Continuation<? super ApolloCall$singleSuccessOrException$1> continuation) {
        super(continuation);
        this.this$0 = apolloCall;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object singleSuccessOrException;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        singleSuccessOrException = this.this$0.singleSuccessOrException(null, this);
        return singleSuccessOrException;
    }
}
