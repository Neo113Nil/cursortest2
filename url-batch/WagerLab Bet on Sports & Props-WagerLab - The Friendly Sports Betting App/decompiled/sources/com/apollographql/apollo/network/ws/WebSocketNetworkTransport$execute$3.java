package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.network.ws.internal.ConnectionReEstablished;
import com.apollographql.apollo.network.ws.internal.Event;
import com.apollographql.apollo.network.ws.internal.GeneralError;
import com.apollographql.apollo.network.ws.internal.NetworkError;
import com.apollographql.apollo.network.ws.internal.OperationComplete;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: WebSocketNetworkTransport.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$3", f = "WebSocketNetworkTransport.kt", i = {}, l = {284, 297}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WebSocketNetworkTransport$execute$3 extends SuspendLambda implements Function3<FlowCollector<? super Event>, Event, Continuation<? super Boolean>, Object> {
    final /* synthetic */ ApolloRequest<D> $request;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$execute$3(ApolloRequest<D> apolloRequest, Continuation<? super WebSocketNetworkTransport$execute$3> continuation) {
        super(3, continuation);
        this.$request = apolloRequest;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Event> flowCollector, Event event, Continuation<? super Boolean> continuation) {
        WebSocketNetworkTransport$execute$3 webSocketNetworkTransport$execute$3 = new WebSocketNetworkTransport$execute$3(this.$request, continuation);
        webSocketNetworkTransport$execute$3.L$0 = flowCollector;
        webSocketNetworkTransport$execute$3.L$1 = event;
        return webSocketNetworkTransport$execute$3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(z);
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            z = true;
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(obj);
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        Event event = (Event) this.L$1;
        if (!(event instanceof OperationComplete) && !(event instanceof ConnectionReEstablished)) {
            if (event instanceof NetworkError) {
                this.L$0 = null;
                this.label = 1;
            } else {
                if (event instanceof GeneralError) {
                    System.out.println((Object) ("Received general error while executing operation " + this.$request.getOperation().name() + ": " + ((GeneralError) event).getPayload()));
                } else {
                    this.L$0 = null;
                    this.label = 2;
                }
                z = true;
            }
            return coroutine_suspended;
        }
        return Boxing.boxBoolean(z);
    }
}
