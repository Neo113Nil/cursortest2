package io.ktor.client.plugins;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.plugins.api.SetupRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.reflect.TypeInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.slf4j.Logger;

/* compiled from: HttpCallValidator.kt */
/* loaded from: classes11.dex */
public abstract class HttpCallValidatorKt {
    private static final AttributeKey ExpectSuccessAttributeKey;
    private static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCallValidator");
    private static final ClientPlugin HttpCallValidator = CreatePluginUtilsKt.createClientPlugin("HttpResponseValidator", HttpCallValidatorKt$HttpCallValidator$1.INSTANCE, new Function1() { // from class: io.ktor.client.plugins.HttpCallValidatorKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit HttpCallValidator$lambda$2;
            HttpCallValidator$lambda$2 = HttpCallValidatorKt.HttpCallValidator$lambda$2((ClientPluginBuilder) obj);
            return HttpCallValidator$lambda$2;
        }
    });

    static {
        KType kType;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
        try {
            kType = Reflection.typeOf(Boolean.TYPE);
        } catch (Throwable unused) {
            kType = null;
        }
        ExpectSuccessAttributeKey = new AttributeKey("ExpectSuccessAttributeKey", new TypeInfo(orCreateKotlinClass, kType));
    }

    public static final ClientPlugin getHttpCallValidator() {
        return HttpCallValidator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HttpCallValidator$lambda$2(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        List reversed = CollectionsKt.reversed(((HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getResponseValidators$ktor_client_core());
        List reversed2 = CollectionsKt.reversed(((HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getResponseExceptionHandlers$ktor_client_core());
        createClientPlugin.on(SetupRequest.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$1(((HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getExpectSuccess$ktor_client_core(), null));
        createClientPlugin.on(Send.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$2(reversed, null));
        createClientPlugin.on(RequestError.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$3(reversed2, null));
        createClientPlugin.on(ReceiveError.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$4(reversed2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object HttpCallValidator$lambda$2$validateResponse(List list, HttpResponse httpResponse, Continuation continuation) {
        HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 httpCallValidatorKt$HttpCallValidator$2$validateResponse$1;
        int i;
        Iterator it;
        if (continuation instanceof HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) {
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = (HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) continuation;
            int i2 = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    LOGGER.trace("Validating response for request " + httpResponse.getCall().getRequest().getUrl());
                    it = list.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$1;
                    httpResponse = (HttpResponse) httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    Function2 function2 = (Function2) it.next();
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$0 = httpResponse;
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$1 = it;
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label = 1;
                    if (function2.invoke(httpResponse, httpCallValidatorKt$HttpCallValidator$2$validateResponse$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = new HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(continuation);
        Object obj2 = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object HttpCallValidator$lambda$2$processException(List list, Throwable th, HttpRequest httpRequest, Continuation continuation) {
        HttpCallValidatorKt$HttpCallValidator$2$processException$1 httpCallValidatorKt$HttpCallValidator$2$processException$1;
        int i;
        Iterator it;
        if (continuation instanceof HttpCallValidatorKt$HttpCallValidator$2$processException$1) {
            httpCallValidatorKt$HttpCallValidator$2$processException$1 = (HttpCallValidatorKt$HttpCallValidator$2$processException$1) continuation;
            int i2 = httpCallValidatorKt$HttpCallValidator$2$processException$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpCallValidatorKt$HttpCallValidator$2$processException$1.label = i2 - Integer.MIN_VALUE;
                Object obj = httpCallValidatorKt$HttpCallValidator$2$processException$1.result;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCallValidatorKt$HttpCallValidator$2$processException$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    LOGGER.trace("Processing exception " + th + " for request " + httpRequest.getUrl());
                    it = list.iterator();
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) httpCallValidatorKt$HttpCallValidator$2$processException$1.L$2;
                    ResultKt.throwOnFailure(obj);
                }
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
                MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                throw new NoWhenBranchMatchedException();
            }
        }
        httpCallValidatorKt$HttpCallValidator$2$processException$1 = new HttpCallValidatorKt$HttpCallValidator$2$processException$1(continuation);
        Object obj2 = httpCallValidatorKt$HttpCallValidator$2$processException$1.result;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCallValidatorKt$HttpCallValidator$2$processException$1.label;
        if (i != 0) {
        }
        if (it.hasNext()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpRequest HttpRequest(final HttpRequestBuilder httpRequestBuilder) {
        return new HttpRequest() { // from class: io.ktor.client.plugins.HttpCallValidatorKt$HttpRequest$1
            private final Attributes attributes;
            private final Headers headers;
            private final HttpMethod method;
            private final Url url;

            {
                this.method = HttpRequestBuilder.this.getMethod();
                this.url = HttpRequestBuilder.this.getUrl().build();
                this.attributes = HttpRequestBuilder.this.getAttributes();
                this.headers = HttpRequestBuilder.this.getHeaders().build();
            }

            @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
            public CoroutineContext getCoroutineContext() {
                return HttpRequest.DefaultImpls.getCoroutineContext(this);
            }

            @Override // io.ktor.client.request.HttpRequest
            public HttpClientCall getCall() {
                throw new IllegalStateException("Call is not initialized");
            }

            @Override // io.ktor.client.request.HttpRequest
            public HttpMethod getMethod() {
                return this.method;
            }

            @Override // io.ktor.client.request.HttpRequest
            public Url getUrl() {
                return this.url;
            }

            @Override // io.ktor.client.request.HttpRequest
            public Attributes getAttributes() {
                return this.attributes;
            }

            @Override // io.ktor.http.HttpMessage
            public Headers getHeaders() {
                return this.headers;
            }
        };
    }

    public static final void HttpResponseValidator(HttpClientConfig httpClientConfig, Function1 block) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        httpClientConfig.install(HttpCallValidator, block);
    }

    public static final AttributeKey getExpectSuccessAttributeKey() {
        return ExpectSuccessAttributeKey;
    }
}
