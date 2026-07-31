package io.ktor.client.plugins;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: HttpCallValidator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2", f = "HttpCallValidator.kt", l = {128, 129}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$2 extends SuspendLambda implements Function3 {
    final /* synthetic */ List<Function2> $responseValidators;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HttpCallValidatorKt$HttpCallValidator$2$2(List<? extends Function2> list, Continuation continuation) {
        super(3, continuation);
        this.$responseValidators = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Send.Sender sender, HttpRequestBuilder httpRequestBuilder, Continuation continuation) {
        HttpCallValidatorKt$HttpCallValidator$2$2 httpCallValidatorKt$HttpCallValidator$2$2 = new HttpCallValidatorKt$HttpCallValidator$2$2(this.$responseValidators, continuation);
        httpCallValidatorKt$HttpCallValidator$2$2.L$0 = sender;
        httpCallValidatorKt$HttpCallValidator$2$2.L$1 = httpRequestBuilder;
        return httpCallValidatorKt$HttpCallValidator$2$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object HttpCallValidator$lambda$2$validateResponse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Send.Sender sender = (Send.Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            this.L$0 = null;
            this.label = 1;
            obj = sender.proceed(httpRequestBuilder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                HttpClientCall httpClientCall = (HttpClientCall) this.L$0;
                ResultKt.throwOnFailure(obj);
                return httpClientCall;
            }
            ResultKt.throwOnFailure(obj);
        }
        HttpClientCall httpClientCall2 = (HttpClientCall) obj;
        List<Function2> list = this.$responseValidators;
        HttpResponse response = httpClientCall2.getResponse();
        this.L$0 = httpClientCall2;
        this.label = 2;
        HttpCallValidator$lambda$2$validateResponse = HttpCallValidatorKt.HttpCallValidator$lambda$2$validateResponse(list, response, this);
        return HttpCallValidator$lambda$2$validateResponse == coroutine_suspended ? coroutine_suspended : httpClientCall2;
    }
}
