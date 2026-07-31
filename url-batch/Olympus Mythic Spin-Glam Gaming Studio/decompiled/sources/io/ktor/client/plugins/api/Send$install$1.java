package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.Sender;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: CommonHooks.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.api.Send$install$1", f = "CommonHooks.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class Send$install$1 extends SuspendLambda implements Function3 {
    final /* synthetic */ HttpClient $client;
    final /* synthetic */ Function3 $handler;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Send$install$1(Function3 function3, HttpClient httpClient, Continuation continuation) {
        super(3, continuation);
        this.$handler = function3;
        this.$client = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Sender sender, HttpRequestBuilder httpRequestBuilder, Continuation continuation) {
        Send$install$1 send$install$1 = new Send$install$1(this.$handler, this.$client, continuation);
        send$install$1.L$0 = sender;
        send$install$1.L$1 = httpRequestBuilder;
        return send$install$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Sender sender = (Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            Function3 function3 = this.$handler;
            Send.Sender sender2 = new Send.Sender(sender, this.$client.getCoroutineContext());
            this.L$0 = null;
            this.label = 1;
            obj = function3.invoke(sender2, httpRequestBuilder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
