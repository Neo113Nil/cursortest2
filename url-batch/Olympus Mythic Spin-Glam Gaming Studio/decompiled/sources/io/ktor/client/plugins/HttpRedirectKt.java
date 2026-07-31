package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.events.EventDefinition;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import io.ktor.http.URLProtocolKt;
import io.ktor.http.UrlKt;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.slf4j.Logger;

/* compiled from: HttpRedirect.kt */
/* loaded from: classes9.dex */
public abstract class HttpRedirectKt {
    private static final Set ALLOWED_FOR_REDIRECT;
    private static final ClientPlugin HttpRedirect;
    private static final EventDefinition HttpResponseRedirectEvent;
    private static final Logger LOGGER;

    static {
        HttpMethod.Companion companion = HttpMethod.Companion;
        ALLOWED_FOR_REDIRECT = SetsKt.setOf((Object[]) new HttpMethod[]{companion.getGet(), companion.getHead()});
        LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRedirect");
        HttpResponseRedirectEvent = new EventDefinition();
        HttpRedirect = CreatePluginUtilsKt.createClientPlugin("HttpRedirect", HttpRedirectKt$HttpRedirect$1.INSTANCE, new Function1() { // from class: io.ktor.client.plugins.HttpRedirectKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit HttpRedirect$lambda$2;
                HttpRedirect$lambda$2 = HttpRedirectKt.HttpRedirect$lambda$2((ClientPluginBuilder) obj);
                return HttpRedirect$lambda$2;
            }
        });
    }

    public static final ClientPlugin getHttpRedirect() {
        return HttpRedirect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HttpRedirect$lambda$2(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.on(Send.INSTANCE, new HttpRedirectKt$HttpRedirect$2$1(((HttpRedirectConfig) createClientPlugin.getPluginConfig()).getCheckHttpMethod(), ((HttpRedirectConfig) createClientPlugin.getPluginConfig()).getAllowHttpsDowngrade(), createClientPlugin, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, io.ktor.client.request.HttpRequestBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0197 -> B:10:0x019e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object HttpRedirect$lambda$2$handleCall(Send.Sender sender, HttpRequestBuilder httpRequestBuilder, HttpClientCall httpClientCall, boolean z, HttpClient httpClient, Continuation continuation) {
        HttpRedirectKt$HttpRedirect$2$handleCall$1 httpRedirectKt$HttpRedirect$2$handleCall$1;
        int i;
        String authority;
        Ref$ObjectRef ref$ObjectRef;
        URLProtocol uRLProtocol;
        Send.Sender sender2;
        Ref$ObjectRef ref$ObjectRef2;
        HttpRedirectKt$HttpRedirect$2$handleCall$1 httpRedirectKt$HttpRedirect$2$handleCall$12;
        boolean z2;
        HttpClient httpClient2;
        HttpRequestBuilder httpRequestBuilder2;
        String str;
        ?? httpRequestBuilder3;
        Object proceed;
        if (continuation instanceof HttpRedirectKt$HttpRedirect$2$handleCall$1) {
            httpRedirectKt$HttpRedirect$2$handleCall$1 = (HttpRedirectKt$HttpRedirect$2$handleCall$1) continuation;
            int i2 = httpRedirectKt$HttpRedirect$2$handleCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpRedirectKt$HttpRedirect$2$handleCall$1.label = i2 - Integer.MIN_VALUE;
                Object obj = httpRedirectKt$HttpRedirect$2$handleCall$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpRedirectKt$HttpRedirect$2$handleCall$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!isRedirect(httpClientCall.getResponse().getStatus())) {
                        return httpClientCall;
                    }
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    ref$ObjectRef3.element = httpClientCall;
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    T t = httpRequestBuilder;
                    ref$ObjectRef4.element = t;
                    URLProtocol protocol = httpClientCall.getRequest().getUrl().getProtocol();
                    authority = UrlKt.getAuthority(httpClientCall.getRequest().getUrl());
                    ref$ObjectRef = ref$ObjectRef4;
                    uRLProtocol = protocol;
                    sender2 = sender;
                    ref$ObjectRef2 = ref$ObjectRef3;
                    httpRedirectKt$HttpRedirect$2$handleCall$12 = httpRedirectKt$HttpRedirect$2$handleCall$1;
                    z2 = z;
                    httpClient2 = httpClient;
                    httpRequestBuilder2 = t;
                    httpClient2.getMonitor().raise(HttpResponseRedirectEvent, ((HttpClientCall) ref$ObjectRef2.element).getResponse());
                    Headers headers = ((HttpClientCall) ref$ObjectRef2.element).getResponse().getHeaders();
                    HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                    str = headers.get(httpHeaders.getLocation());
                    Logger logger = LOGGER;
                    logger.trace("Received redirect response to " + str + " for request " + httpRequestBuilder2.getUrl());
                    httpRequestBuilder3 = new HttpRequestBuilder();
                    httpRequestBuilder3.takeFromWithExecutionContext((HttpRequestBuilder) ref$ObjectRef.element);
                    httpRequestBuilder3.getUrl().getParameters().clear();
                    if (str != null) {
                    }
                    if (z2) {
                    }
                    if (!Intrinsics.areEqual(authority, URLBuilderKt.getAuthority(httpRequestBuilder3.getUrl()))) {
                    }
                    ref$ObjectRef.element = httpRequestBuilder3;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$0 = sender2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$1 = httpRequestBuilder2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$2 = httpClient2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$3 = ref$ObjectRef2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$4 = ref$ObjectRef;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$5 = uRLProtocol;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$6 = authority;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$7 = ref$ObjectRef2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.Z$0 = z2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.label = 1;
                    proceed = sender2.proceed(httpRequestBuilder3, httpRedirectKt$HttpRedirect$2$handleCall$12);
                    if (proceed != coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = httpRedirectKt$HttpRedirect$2$handleCall$1.Z$0;
                    Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) httpRedirectKt$HttpRedirect$2$handleCall$1.L$7;
                    String str2 = (String) httpRedirectKt$HttpRedirect$2$handleCall$1.L$6;
                    URLProtocol uRLProtocol2 = (URLProtocol) httpRedirectKt$HttpRedirect$2$handleCall$1.L$5;
                    Ref$ObjectRef ref$ObjectRef6 = (Ref$ObjectRef) httpRedirectKt$HttpRedirect$2$handleCall$1.L$4;
                    Ref$ObjectRef ref$ObjectRef7 = (Ref$ObjectRef) httpRedirectKt$HttpRedirect$2$handleCall$1.L$3;
                    HttpClient httpClient3 = (HttpClient) httpRedirectKt$HttpRedirect$2$handleCall$1.L$2;
                    HttpRequestBuilder httpRequestBuilder4 = (HttpRequestBuilder) httpRedirectKt$HttpRedirect$2$handleCall$1.L$1;
                    Send.Sender sender3 = (Send.Sender) httpRedirectKt$HttpRedirect$2$handleCall$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    HttpRedirectKt$HttpRedirect$2$handleCall$1 httpRedirectKt$HttpRedirect$2$handleCall$13 = httpRedirectKt$HttpRedirect$2$handleCall$1;
                    boolean z4 = z3;
                    Send.Sender sender4 = sender3;
                    Ref$ObjectRef ref$ObjectRef8 = ref$ObjectRef6;
                    authority = str2;
                    HttpRedirectKt$HttpRedirect$2$handleCall$1 httpRedirectKt$HttpRedirect$2$handleCall$14 = httpRedirectKt$HttpRedirect$2$handleCall$13;
                    uRLProtocol = uRLProtocol2;
                    ref$ObjectRef2 = ref$ObjectRef7;
                    T t2 = obj;
                    ref$ObjectRef5.element = t2;
                    if (isRedirect(((HttpClientCall) ref$ObjectRef2.element).getResponse().getStatus())) {
                        return ref$ObjectRef2.element;
                    }
                    z2 = z4;
                    httpRedirectKt$HttpRedirect$2$handleCall$12 = httpRedirectKt$HttpRedirect$2$handleCall$14;
                    httpClient2 = httpClient3;
                    httpRequestBuilder2 = httpRequestBuilder4;
                    ref$ObjectRef = ref$ObjectRef8;
                    sender2 = sender4;
                    httpClient2.getMonitor().raise(HttpResponseRedirectEvent, ((HttpClientCall) ref$ObjectRef2.element).getResponse());
                    Headers headers2 = ((HttpClientCall) ref$ObjectRef2.element).getResponse().getHeaders();
                    HttpHeaders httpHeaders2 = HttpHeaders.INSTANCE;
                    str = headers2.get(httpHeaders2.getLocation());
                    Logger logger2 = LOGGER;
                    logger2.trace("Received redirect response to " + str + " for request " + httpRequestBuilder2.getUrl());
                    httpRequestBuilder3 = new HttpRequestBuilder();
                    httpRequestBuilder3.takeFromWithExecutionContext((HttpRequestBuilder) ref$ObjectRef.element);
                    httpRequestBuilder3.getUrl().getParameters().clear();
                    if (str != null) {
                        URLParserKt.takeFrom(httpRequestBuilder3.getUrl(), str);
                    }
                    if (z2 && URLProtocolKt.isSecure(uRLProtocol) && !URLProtocolKt.isSecure(httpRequestBuilder3.getUrl().getProtocol())) {
                        logger2.trace("Can not redirect " + httpRequestBuilder2.getUrl() + " because of security downgrade");
                        return ref$ObjectRef2.element;
                    }
                    if (!Intrinsics.areEqual(authority, URLBuilderKt.getAuthority(httpRequestBuilder3.getUrl()))) {
                        httpRequestBuilder3.getHeaders().remove(httpHeaders2.getAuthorization());
                        logger2.trace("Removing Authorization header from redirect for " + httpRequestBuilder2.getUrl());
                    }
                    ref$ObjectRef.element = httpRequestBuilder3;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$0 = sender2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$1 = httpRequestBuilder2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$2 = httpClient2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$3 = ref$ObjectRef2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$4 = ref$ObjectRef;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$5 = uRLProtocol;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$6 = authority;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.L$7 = ref$ObjectRef2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.Z$0 = z2;
                    httpRedirectKt$HttpRedirect$2$handleCall$12.label = 1;
                    proceed = sender2.proceed(httpRequestBuilder3, httpRedirectKt$HttpRedirect$2$handleCall$12);
                    if (proceed != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef8 = ref$ObjectRef;
                    httpClient3 = httpClient2;
                    z4 = z2;
                    t2 = proceed;
                    httpRequestBuilder4 = httpRequestBuilder2;
                    httpRedirectKt$HttpRedirect$2$handleCall$14 = httpRedirectKt$HttpRedirect$2$handleCall$12;
                    ref$ObjectRef5 = ref$ObjectRef2;
                    sender4 = sender2;
                    ref$ObjectRef5.element = t2;
                    if (isRedirect(((HttpClientCall) ref$ObjectRef2.element).getResponse().getStatus())) {
                    }
                }
            }
        }
        httpRedirectKt$HttpRedirect$2$handleCall$1 = new HttpRedirectKt$HttpRedirect$2$handleCall$1(continuation);
        Object obj2 = httpRedirectKt$HttpRedirect$2$handleCall$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpRedirectKt$HttpRedirect$2$handleCall$1.label;
        if (i != 0) {
        }
    }

    private static final boolean isRedirect(HttpStatusCode httpStatusCode) {
        int value = httpStatusCode.getValue();
        HttpStatusCode.Companion companion = HttpStatusCode.Companion;
        return value == companion.getMovedPermanently().getValue() || value == companion.getFound().getValue() || value == companion.getTemporaryRedirect().getValue() || value == companion.getPermanentRedirect().getValue() || value == companion.getSeeOther().getValue();
    }
}
