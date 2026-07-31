package com.apollographql.apollo.network.ws;

import com.facebook.soloader.Elf64;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GraphQLWsProtocol.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$2", f = "GraphQLWsProtocol.kt", i = {}, l = {Elf64.Ehdr.E_SHSTRNDX}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GraphQLWsProtocol$connectionInit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GraphQLWsProtocol this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLWsProtocol$connectionInit$2(GraphQLWsProtocol graphQLWsProtocol, Continuation<? super GraphQLWsProtocol$connectionInit$2> continuation) {
        super(2, continuation);
        this.this$0 = graphQLWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GraphQLWsProtocol$connectionInit$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GraphQLWsProtocol$connectionInit$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.receiveMessageMap(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Object obj2 = ((Map) obj).get("type");
        if (Intrinsics.areEqual(obj2, "connection_ack")) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(obj2, "ping")) {
            this.this$0.sendPong();
        } else {
            System.out.println((Object) ("unknown graphql-ws message while waiting for connection_ack: '" + obj2));
        }
        return Unit.INSTANCE;
    }
}
