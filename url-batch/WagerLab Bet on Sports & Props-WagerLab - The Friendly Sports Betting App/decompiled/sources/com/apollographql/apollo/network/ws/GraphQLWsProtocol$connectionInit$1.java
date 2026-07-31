package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: GraphQLWsProtocol.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol", f = "GraphQLWsProtocol.kt", i = {0}, l = {54, LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "connectionInit", n = {"message"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class GraphQLWsProtocol$connectionInit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GraphQLWsProtocol this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLWsProtocol$connectionInit$1(GraphQLWsProtocol graphQLWsProtocol, Continuation<? super GraphQLWsProtocol$connectionInit$1> continuation) {
        super(continuation);
        this.this$0 = graphQLWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.connectionInit(this);
    }
}
