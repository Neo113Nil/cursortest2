package io.ktor.client.plugins;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.slf4j.Logger;

/* compiled from: HttpRequestRetry.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1", f = "HttpRequestRetry.kt", l = {352, 355, 371}, m = "invokeSuspend")
/* loaded from: classes14.dex */
final class HttpRequestRetryKt$HttpRequestRetry$2$1 extends SuspendLambda implements Function3 {
    final /* synthetic */ Function2 $delay;
    final /* synthetic */ Function2 $delayMillis;
    final /* synthetic */ int $maxRetries;
    final /* synthetic */ Function2 $modifyRequest;
    final /* synthetic */ Function3 $shouldRetry;
    final /* synthetic */ Function3 $shouldRetryOnException;
    final /* synthetic */ ClientPluginBuilder $this_createClientPlugin;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpRequestRetryKt$HttpRequestRetry$2$1(Function3 function3, Function3 function32, int i, Function2 function2, Function2 function22, ClientPluginBuilder clientPluginBuilder, Function2 function23, Continuation continuation) {
        super(3, continuation);
        this.$shouldRetry = function3;
        this.$shouldRetryOnException = function32;
        this.$maxRetries = i;
        this.$delayMillis = function2;
        this.$modifyRequest = function22;
        this.$this_createClientPlugin = clientPluginBuilder;
        this.$delay = function23;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Send.Sender sender, HttpRequestBuilder httpRequestBuilder, Continuation continuation) {
        HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = new HttpRequestRetryKt$HttpRequestRetry$2$1(this.$shouldRetry, this.$shouldRetryOnException, this.$maxRetries, this.$delayMillis, this.$modifyRequest, this.$this_createClientPlugin, this.$delay, continuation);
        httpRequestRetryKt$HttpRequestRetry$2$1.L$0 = sender;
        httpRequestRetryKt$HttpRequestRetry$2$1.L$1 = httpRequestBuilder;
        return httpRequestRetryKt$HttpRequestRetry$2$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0160 A[Catch: all -> 0x013a, TRY_LEAVE, TryCatch #1 {all -> 0x013a, blocks: (B:38:0x0125, B:12:0x013d, B:16:0x0158, B:18:0x0160), top: B:37:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0183 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:20:0x0179, B:36:0x0183, B:42:0x0073, B:44:0x00a2), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01f4 -> B:8:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Send.Sender sender;
        HttpRequestBuilder httpRequestBuilder;
        Function3 function3;
        Function3 function32;
        Function2 function2;
        Function2 function22;
        int i;
        int i2;
        HttpRetryEventData httpRetryEventData;
        int i3;
        int i4;
        Function2 function23;
        Function2 function24;
        Function3 function33;
        Function3 function34;
        HttpRequestBuilder httpRequestBuilder2;
        HttpRetryEventData httpRetryEventData2;
        Function2 function25;
        Object invoke;
        char c;
        boolean HttpRequestRetry$lambda$1$shouldRetryOnException;
        HttpRequestBuilder httpRequestBuilder3;
        int i5;
        HttpClientCall httpClientCall;
        Object obj2;
        boolean HttpRequestRetry$lambda$1$shouldRetry;
        Object throwOnInvalidResponseBody;
        HttpRetryEventData httpRetryEventData3;
        Logger logger;
        AttributeKey attributeKey;
        AttributeKey attributeKey2;
        AttributeKey attributeKey3;
        AttributeKey attributeKey4;
        AttributeKey attributeKey5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.label;
        try {
        } catch (Throwable th) {
            th = th;
            HttpRequestRetry$lambda$1$shouldRetryOnException = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetryOnException(i5, i2, function32, httpRequestBuilder3, th);
            if (HttpRequestRetry$lambda$1$shouldRetryOnException) {
                throw th;
            }
            i = i5 + 1;
            httpRetryEventData = new HttpRetryEventData(httpRequestBuilder3, i, null, th);
            i3 = i2;
            i4 = i;
            function23 = function22;
            function24 = function2;
            function33 = function32;
            function34 = function3;
            httpRequestBuilder2 = httpRequestBuilder;
            Send.Sender sender2 = sender;
            httpRetryEventData2 = httpRetryEventData;
            this.$this_createClientPlugin.getClient().getMonitor().raise(HttpRequestRetryKt.getHttpRequestRetryEvent(), httpRetryEventData2);
            HttpRetryDelayContext httpRetryDelayContext = new HttpRetryDelayContext(httpRetryEventData2.getRequest(), httpRetryEventData2.getResponse(), httpRetryEventData2.getCause());
            function25 = this.$delay;
            invoke = function24.invoke(httpRetryDelayContext, Boxing.boxInt(i4));
            this.L$0 = sender2;
            this.L$1 = httpRequestBuilder2;
            this.L$2 = function34;
            this.L$3 = function33;
            this.L$4 = function24;
            this.L$5 = function23;
            this.L$6 = httpRetryEventData2;
            this.L$7 = null;
            this.I$0 = i4;
            this.I$1 = i3;
            c = 3;
            this.label = 3;
            if (function25.invoke(invoke, this) != coroutine_suspended) {
            }
        }
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            Send.Sender sender3 = (Send.Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder4 = (HttpRequestBuilder) this.L$1;
            Attributes attributes = httpRequestBuilder4.getAttributes();
            attributeKey = HttpRequestRetryKt.ShouldRetryPerRequestAttributeKey;
            Function3 function35 = (Function3) attributes.getOrNull(attributeKey);
            if (function35 == null) {
                function35 = this.$shouldRetry;
            }
            Attributes attributes2 = httpRequestBuilder4.getAttributes();
            attributeKey2 = HttpRequestRetryKt.ShouldRetryOnExceptionPerRequestAttributeKey;
            Function3 function36 = (Function3) attributes2.getOrNull(attributeKey2);
            if (function36 == null) {
                function36 = this.$shouldRetryOnException;
            }
            Attributes attributes3 = httpRequestBuilder4.getAttributes();
            attributeKey3 = HttpRequestRetryKt.MaxRetriesPerRequestAttributeKey;
            Integer num = (Integer) attributes3.getOrNull(attributeKey3);
            int intValue = num != null ? num.intValue() : this.$maxRetries;
            Attributes attributes4 = httpRequestBuilder4.getAttributes();
            attributeKey4 = HttpRequestRetryKt.RetryDelayPerRequestAttributeKey;
            function2 = (Function2) attributes4.getOrNull(attributeKey4);
            if (function2 == null) {
                function2 = this.$delayMillis;
            }
            Attributes attributes5 = httpRequestBuilder4.getAttributes();
            attributeKey5 = HttpRequestRetryKt.ModifyRequestPerRequestAttributeKey;
            Function2 function26 = (Function2) attributes5.getOrNull(attributeKey5);
            if (function26 == null) {
                function26 = this.$modifyRequest;
            }
            sender = sender3;
            httpRequestBuilder = httpRequestBuilder4;
            i2 = intValue;
            function22 = function26;
            httpRetryEventData3 = null;
            function32 = function36;
            function3 = function35;
            i5 = 0;
            httpRequestBuilder3 = HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder);
            if (httpRetryEventData3 != null) {
            }
            this.L$0 = sender;
            this.L$1 = httpRequestBuilder;
            this.L$2 = function3;
            this.L$3 = function32;
            this.L$4 = function2;
            this.L$5 = function22;
            this.L$6 = httpRequestBuilder3;
            this.I$0 = i5;
            this.I$1 = i2;
            this.label = 1;
            obj2 = sender.proceed(httpRequestBuilder3, this);
            if (obj2 == coroutine_suspended) {
            }
            httpClientCall = (HttpClientCall) obj2;
            HttpRequestRetry$lambda$1$shouldRetry = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i5, i2, function3, httpClientCall);
            if (HttpRequestRetry$lambda$1$shouldRetry) {
            }
        } else if (i6 == 1) {
            i2 = this.I$1;
            i5 = this.I$0;
            httpRequestBuilder3 = (HttpRequestBuilder) this.L$6;
            function22 = (Function2) this.L$5;
            function2 = (Function2) this.L$4;
            function32 = (Function3) this.L$3;
            function3 = (Function3) this.L$2;
            httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            sender = (Send.Sender) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            httpClientCall = (HttpClientCall) obj2;
            HttpRequestRetry$lambda$1$shouldRetry = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i5, i2, function3, httpClientCall);
            if (HttpRequestRetry$lambda$1$shouldRetry) {
            }
        } else {
            if (i6 == 2) {
                int i7 = this.I$1;
                int i8 = this.I$0;
                httpClientCall = (HttpClientCall) this.L$6;
                ResultKt.throwOnFailure(obj);
            }
            if (i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = this.I$1;
            i4 = this.I$0;
            httpRetryEventData2 = (HttpRetryEventData) this.L$6;
            function23 = (Function2) this.L$5;
            function24 = (Function2) this.L$4;
            function33 = (Function3) this.L$3;
            function34 = (Function3) this.L$2;
            httpRequestBuilder2 = (HttpRequestBuilder) this.L$1;
            Send.Sender sender4 = (Send.Sender) this.L$0;
            ResultKt.throwOnFailure(obj);
            c = 3;
            Send.Sender sender5 = sender4;
            httpRequestBuilder = httpRequestBuilder2;
            function3 = function34;
            function32 = function33;
            function2 = function24;
            function22 = function23;
            int i9 = i4;
            i2 = i3;
            httpRetryEventData3 = httpRetryEventData2;
            i5 = i9;
            logger = HttpRequestRetryKt.LOGGER;
            logger.trace("Retrying request " + httpRequestBuilder.getUrl() + " attempt: " + i5);
            sender = sender5;
            httpRequestBuilder3 = HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder);
            if (httpRetryEventData3 != null) {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    HttpRequestRetry$lambda$1$shouldRetryOnException = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetryOnException(i5, i2, function32, httpRequestBuilder3, th);
                    if (HttpRequestRetry$lambda$1$shouldRetryOnException) {
                    }
                }
                function22.invoke(new HttpRetryModifyRequestContext(httpRequestBuilder, httpRetryEventData3.getResponse(), httpRetryEventData3.getCause(), httpRetryEventData3.getRetryCount()), httpRequestBuilder3);
            }
            this.L$0 = sender;
            this.L$1 = httpRequestBuilder;
            this.L$2 = function3;
            this.L$3 = function32;
            this.L$4 = function2;
            this.L$5 = function22;
            this.L$6 = httpRequestBuilder3;
            this.I$0 = i5;
            this.I$1 = i2;
            this.label = 1;
            obj2 = sender.proceed(httpRequestBuilder3, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpClientCall = (HttpClientCall) obj2;
            HttpRequestRetry$lambda$1$shouldRetry = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i5, i2, function3, httpClientCall);
            if (HttpRequestRetry$lambda$1$shouldRetry) {
                HttpResponse response = httpClientCall.getResponse();
                this.L$0 = sender;
                this.L$1 = httpRequestBuilder;
                this.L$2 = function3;
                this.L$3 = function32;
                this.L$4 = function2;
                this.L$5 = function22;
                this.L$6 = httpClientCall;
                this.L$7 = httpRequestBuilder3;
                this.I$0 = i5;
                this.I$1 = i2;
                this.label = 2;
                throwOnInvalidResponseBody = HttpRequestRetryKt.throwOnInvalidResponseBody(response, this);
                return throwOnInvalidResponseBody == coroutine_suspended ? coroutine_suspended : httpClientCall;
            }
            i = i5 + 1;
            httpRetryEventData = new HttpRetryEventData(httpRequestBuilder3, i, httpClientCall.getResponse(), null);
            i3 = i2;
            i4 = i;
            function23 = function22;
            function24 = function2;
            function33 = function32;
            function34 = function3;
            httpRequestBuilder2 = httpRequestBuilder;
            Send.Sender sender22 = sender;
            httpRetryEventData2 = httpRetryEventData;
            this.$this_createClientPlugin.getClient().getMonitor().raise(HttpRequestRetryKt.getHttpRequestRetryEvent(), httpRetryEventData2);
            HttpRetryDelayContext httpRetryDelayContext2 = new HttpRetryDelayContext(httpRetryEventData2.getRequest(), httpRetryEventData2.getResponse(), httpRetryEventData2.getCause());
            function25 = this.$delay;
            invoke = function24.invoke(httpRetryDelayContext2, Boxing.boxInt(i4));
            this.L$0 = sender22;
            this.L$1 = httpRequestBuilder2;
            this.L$2 = function34;
            this.L$3 = function33;
            this.L$4 = function24;
            this.L$5 = function23;
            this.L$6 = httpRetryEventData2;
            this.L$7 = null;
            this.I$0 = i4;
            this.I$1 = i3;
            c = 3;
            this.label = 3;
            if (function25.invoke(invoke, this) != coroutine_suspended) {
                return coroutine_suspended;
            }
            sender5 = sender22;
            httpRequestBuilder = httpRequestBuilder2;
            function3 = function34;
            function32 = function33;
            function2 = function24;
            function22 = function23;
            int i92 = i4;
            i2 = i3;
            httpRetryEventData3 = httpRetryEventData2;
            i5 = i92;
            logger = HttpRequestRetryKt.LOGGER;
            logger.trace("Retrying request " + httpRequestBuilder.getUrl() + " attempt: " + i5);
            sender = sender5;
            httpRequestBuilder3 = HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder);
            if (httpRetryEventData3 != null) {
            }
            this.L$0 = sender;
            this.L$1 = httpRequestBuilder;
            this.L$2 = function3;
            this.L$3 = function32;
            this.L$4 = function2;
            this.L$5 = function22;
            this.L$6 = httpRequestBuilder3;
            this.I$0 = i5;
            this.I$1 = i2;
            this.label = 1;
            obj2 = sender.proceed(httpRequestBuilder3, this);
            if (obj2 == coroutine_suspended) {
            }
            httpClientCall = (HttpClientCall) obj2;
            HttpRequestRetry$lambda$1$shouldRetry = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i5, i2, function3, httpClientCall);
            if (HttpRequestRetry$lambda$1$shouldRetry) {
            }
        }
    }
}
