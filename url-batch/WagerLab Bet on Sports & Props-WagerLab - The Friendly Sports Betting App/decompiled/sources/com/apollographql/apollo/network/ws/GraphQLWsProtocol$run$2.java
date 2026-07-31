package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GraphQLWsProtocol.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$run$2", f = "GraphQLWsProtocol.kt", i = {0}, l = {103}, m = "invokeSuspend", n = {"map"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class GraphQLWsProtocol$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ GraphQLWsProtocol this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLWsProtocol$run$2(GraphQLWsProtocol graphQLWsProtocol, Continuation<? super GraphQLWsProtocol$run$2> continuation) {
        super(2, continuation);
        this.this$0 = graphQLWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GraphQLWsProtocol$run$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GraphQLWsProtocol$run$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0057 -> B:5:0x005a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r5.L$0
            java.util.Map r1 = (java.util.Map) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5a
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Pair[] r6 = new kotlin.Pair[r2]
            java.lang.String r1 = "type"
            java.lang.String r3 = "ping"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r3)
            r3 = 0
            r6[r3] = r1
            java.util.Map r6 = kotlin.collections.MapsKt.mutableMapOf(r6)
            com.apollographql.apollo.network.ws.GraphQLWsProtocol r1 = r5.this$0
            java.util.Map r1 = com.apollographql.apollo.network.ws.GraphQLWsProtocol.access$getPingPayload$p(r1)
            if (r1 == 0) goto L45
            com.apollographql.apollo.network.ws.GraphQLWsProtocol r1 = r5.this$0
            java.util.Map r1 = com.apollographql.apollo.network.ws.GraphQLWsProtocol.access$getPingPayload$p(r1)
            java.lang.String r3 = "payload"
            r6.put(r3, r1)
        L45:
            r1 = r6
        L46:
            com.apollographql.apollo.network.ws.GraphQLWsProtocol r6 = r5.this$0
            long r3 = com.apollographql.apollo.network.ws.GraphQLWsProtocol.access$getPingIntervalMillis$p(r6)
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r6 != r0) goto L5a
            return r0
        L5a:
            com.apollographql.apollo.network.ws.GraphQLWsProtocol r6 = r5.this$0
            com.apollographql.apollo.network.ws.WsFrameType r3 = com.apollographql.apollo.network.ws.GraphQLWsProtocol.access$getFrameType$p(r6)
            r6.sendMessageMap(r1, r3)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.GraphQLWsProtocol$run$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
