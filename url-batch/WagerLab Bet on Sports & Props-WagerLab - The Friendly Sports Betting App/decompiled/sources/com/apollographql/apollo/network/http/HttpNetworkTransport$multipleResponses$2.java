package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.exception.ApolloException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [D] */
/* compiled from: HttpNetworkTransport.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;", "throwable", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$2", f = "HttpNetworkTransport.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HttpNetworkTransport$multipleResponses$2<D> extends SuspendLambda implements Function3<FlowCollector<? super ApolloResponse<D>>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Operation<D> $operation;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpNetworkTransport$multipleResponses$2(Operation<D> operation, Continuation<? super HttpNetworkTransport$multipleResponses$2> continuation) {
        super(3, continuation);
        this.$operation = operation;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super ApolloResponse<D>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        HttpNetworkTransport$multipleResponses$2 httpNetworkTransport$multipleResponses$2 = new HttpNetworkTransport$multipleResponses$2(this.$operation, continuation);
        httpNetworkTransport$multipleResponses$2.L$0 = flowCollector;
        httpNetworkTransport$multipleResponses$2.L$1 = th;
        return httpNetworkTransport$multipleResponses$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (th instanceof ApolloException) {
                Operation<D> operation = this.$operation;
                UUID randomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(new ApolloResponse.Builder(operation, randomUUID).exception((ApolloException) th).build(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
