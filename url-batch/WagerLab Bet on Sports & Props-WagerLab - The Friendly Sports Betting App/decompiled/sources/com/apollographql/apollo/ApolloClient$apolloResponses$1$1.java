package com.apollographql.apollo;

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

/* JADX INFO: Add missing generic type declarations: [D] */
/* compiled from: ApolloClient.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "response", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.ApolloClient$apolloResponses$1$1", f = "ApolloClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ApolloClient$apolloResponses$1$1<D> extends SuspendLambda implements Function2<ApolloResponse<D>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    ApolloClient$apolloResponses$1$1(Continuation<? super ApolloClient$apolloResponses$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ApolloClient$apolloResponses$1$1 apolloClient$apolloResponses$1$1 = new ApolloClient$apolloResponses$1$1(continuation);
        apolloClient$apolloResponses$1$1.L$0 = obj;
        return apolloClient$apolloResponses$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApolloResponse<D> apolloResponse, Continuation<? super Unit> continuation) {
        return ((ApolloClient$apolloResponses$1$1) create(apolloResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApolloResponse apolloResponse = (ApolloResponse) this.L$0;
        if (apolloResponse.exception != null) {
            ApolloException apolloException = apolloResponse.exception;
            Intrinsics.checkNotNull(apolloException);
            throw apolloException;
        }
        return Unit.INSTANCE;
    }
}
