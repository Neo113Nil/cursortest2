package io.ktor.client.engine.android;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import io.ktor.client.engine.HttpClientEngineBase;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.UtilsKt;
import io.ktor.client.plugins.HttpTimeoutCapability;
import io.ktor.client.plugins.sse.SSECapability;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.HttpResponseData;
import io.ktor.http.Headers;
import io.ktor.http.HeadersImpl;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMethodKt;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.OutgoingContentKt;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AndroidClientEngine.kt */
/* loaded from: classes13.dex */
public final class AndroidClientEngine extends HttpClientEngineBase {
    private final AndroidEngineConfig config;
    private final Set supportedCapabilities;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidClientEngine(AndroidEngineConfig config) {
        super("ktor-android");
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.supportedCapabilities = SetsKt.setOf((Object[]) new HttpClientEngineCapability[]{HttpTimeoutCapability.INSTANCE, SSECapability.INSTANCE});
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public AndroidEngineConfig getConfig() {
        return this.config;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine
    public Set getSupportedCapabilities() {
        return this.supportedCapabilities;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01ad A[PHI: r1
      0x01ad: PHI (r1v11 java.lang.Object) = (r1v9 java.lang.Object), (r1v1 java.lang.Object) binds: [B:19:0x01aa, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // io.ktor.client.engine.HttpClientEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(HttpRequestData httpRequestData, Continuation continuation) {
        AndroidClientEngine$execute$1 androidClientEngine$execute$1;
        int i;
        final HttpRequestData httpRequestData2;
        Object callContext;
        final CoroutineContext coroutineContext;
        final GMTDate GMTDate$default;
        final OutgoingContent body;
        final HttpURLConnection proxyAwareConnection;
        GMTDate gMTDate;
        HttpURLConnection httpURLConnection;
        OutgoingContent outgoingContent;
        HttpRequestData httpRequestData3;
        if (continuation instanceof AndroidClientEngine$execute$1) {
            androidClientEngine$execute$1 = (AndroidClientEngine$execute$1) continuation;
            int i2 = androidClientEngine$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidClientEngine$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidClientEngine$execute$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidClientEngine$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    httpRequestData2 = httpRequestData;
                    androidClientEngine$execute$1.L$0 = httpRequestData2;
                    androidClientEngine$execute$1.label = 1;
                    callContext = UtilsKt.callContext(androidClientEngine$execute$1);
                    if (callContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.throwOnFailure(obj);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        httpURLConnection = (HttpURLConnection) androidClientEngine$execute$1.L$4;
                        outgoingContent = (OutgoingContent) androidClientEngine$execute$1.L$3;
                        gMTDate = (GMTDate) androidClientEngine$execute$1.L$2;
                        coroutineContext = (CoroutineContext) androidClientEngine$execute$1.L$1;
                        httpRequestData3 = (HttpRequestData) androidClientEngine$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        body = outgoingContent;
                        httpRequestData2 = httpRequestData3;
                        proxyAwareConnection = httpURLConnection;
                        GMTDate$default = gMTDate;
                        Function1 function1 = new Function1() { // from class: io.ktor.client.engine.android.AndroidClientEngine$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                HttpResponseData execute$lambda$5;
                                execute$lambda$5 = AndroidClientEngine.execute$lambda$5(CoroutineContext.this, httpRequestData2, body, GMTDate$default, (HttpURLConnection) obj2);
                                return execute$lambda$5;
                            }
                        };
                        androidClientEngine$execute$1.L$0 = null;
                        androidClientEngine$execute$1.L$1 = null;
                        androidClientEngine$execute$1.L$2 = null;
                        androidClientEngine$execute$1.L$3 = null;
                        androidClientEngine$execute$1.L$4 = null;
                        androidClientEngine$execute$1.label = 3;
                        obj = AndroidURLConnectionUtilsKt.timeoutAwareConnection(proxyAwareConnection, httpRequestData2, function1, androidClientEngine$execute$1);
                        return obj == coroutine_suspended ? coroutine_suspended : obj;
                    }
                    HttpRequestData httpRequestData4 = (HttpRequestData) androidClientEngine$execute$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    callContext = obj;
                    httpRequestData2 = httpRequestData4;
                }
                coroutineContext = (CoroutineContext) callContext;
                GMTDate$default = DateJvmKt.GMTDate$default(null, 1, null);
                String urlString = httpRequestData2.getUrl().getUrlString();
                body = httpRequestData2.getBody();
                Headers headers = httpRequestData2.getHeaders();
                HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                String str = headers.get(httpHeaders.getContentLength());
                Long boxLong = str == null ? Boxing.boxLong(Long.parseLong(str)) : body.getContentLength();
                proxyAwareConnection = getProxyAwareConnection(urlString);
                proxyAwareConnection.setConnectTimeout(getConfig().getConnectTimeout());
                proxyAwareConnection.setReadTimeout(getConfig().getSocketTimeout());
                AndroidURLConnectionUtilsKt.setupTimeoutAttributes(proxyAwareConnection, httpRequestData2);
                if (proxyAwareConnection instanceof HttpsURLConnection) {
                    getConfig().getSslManager().invoke(proxyAwareConnection);
                }
                proxyAwareConnection.setRequestMethod(httpRequestData2.getMethod().getValue());
                proxyAwareConnection.setUseCaches(false);
                proxyAwareConnection.setInstanceFollowRedirects(false);
                final boolean z = HttpMethodKt.getSupportsRequestBody(httpRequestData2.getMethod()) && OutgoingContentKt.isEmpty(httpRequestData2.getBody());
                UtilsKt.mergeHeaders(httpRequestData2.getHeaders(), httpRequestData2.getBody(), new Function2() { // from class: io.ktor.client.engine.android.AndroidClientEngine$execute$lambda$1$$inlined$forEachHeader$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((String) obj2, (String) obj3);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String key, String value) {
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (z && Intrinsics.areEqual(key, HttpHeaders.INSTANCE.getContentLength())) {
                            return;
                        }
                        proxyAwareConnection.addRequestProperty(key, value);
                    }
                });
                getConfig().getRequestConfig().invoke(proxyAwareConnection);
                if (HttpMethodKt.getSupportsRequestBody(httpRequestData2.getMethod())) {
                    if (!OutgoingContentKt.isEmpty(body)) {
                        throw new IllegalStateException(("Request of type " + httpRequestData2.getMethod() + " couldn't send a body with the [Android] engine.").toString());
                    }
                    Function1 function12 = new Function1() { // from class: io.ktor.client.engine.android.AndroidClientEngine$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            HttpResponseData execute$lambda$5;
                            execute$lambda$5 = AndroidClientEngine.execute$lambda$5(CoroutineContext.this, httpRequestData2, body, GMTDate$default, (HttpURLConnection) obj2);
                            return execute$lambda$5;
                        }
                    };
                    androidClientEngine$execute$1.L$0 = null;
                    androidClientEngine$execute$1.L$1 = null;
                    androidClientEngine$execute$1.L$2 = null;
                    androidClientEngine$execute$1.L$3 = null;
                    androidClientEngine$execute$1.L$4 = null;
                    androidClientEngine$execute$1.label = 3;
                    obj = AndroidURLConnectionUtilsKt.timeoutAwareConnection(proxyAwareConnection, httpRequestData2, function12, androidClientEngine$execute$1);
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    if (boxLong == null && proxyAwareConnection.getRequestProperty(httpHeaders.getTransferEncoding()) == null) {
                        proxyAwareConnection.addRequestProperty(httpHeaders.getTransferEncoding(), "chunked");
                    }
                    if (boxLong != null) {
                        proxyAwareConnection.setFixedLengthStreamingMode(boxLong.longValue());
                    } else {
                        proxyAwareConnection.setChunkedStreamingMode(0);
                    }
                    proxyAwareConnection.setDoOutput(true);
                    OutputStream outputStream = proxyAwareConnection.getOutputStream();
                    Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
                    androidClientEngine$execute$1.L$0 = httpRequestData2;
                    androidClientEngine$execute$1.L$1 = coroutineContext;
                    androidClientEngine$execute$1.L$2 = GMTDate$default;
                    androidClientEngine$execute$1.L$3 = body;
                    androidClientEngine$execute$1.L$4 = proxyAwareConnection;
                    androidClientEngine$execute$1.label = 2;
                    if (AndroidClientEngineKt.writeTo(body, outputStream, coroutineContext, androidClientEngine$execute$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gMTDate = GMTDate$default;
                    httpURLConnection = proxyAwareConnection;
                    outgoingContent = body;
                    httpRequestData3 = httpRequestData2;
                    body = outgoingContent;
                    httpRequestData2 = httpRequestData3;
                    proxyAwareConnection = httpURLConnection;
                    GMTDate$default = gMTDate;
                    Function1 function122 = new Function1() { // from class: io.ktor.client.engine.android.AndroidClientEngine$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            HttpResponseData execute$lambda$5;
                            execute$lambda$5 = AndroidClientEngine.execute$lambda$5(CoroutineContext.this, httpRequestData2, body, GMTDate$default, (HttpURLConnection) obj2);
                            return execute$lambda$5;
                        }
                    };
                    androidClientEngine$execute$1.L$0 = null;
                    androidClientEngine$execute$1.L$1 = null;
                    androidClientEngine$execute$1.L$2 = null;
                    androidClientEngine$execute$1.L$3 = null;
                    androidClientEngine$execute$1.L$4 = null;
                    androidClientEngine$execute$1.label = 3;
                    obj = AndroidURLConnectionUtilsKt.timeoutAwareConnection(proxyAwareConnection, httpRequestData2, function122, androidClientEngine$execute$1);
                    if (obj == coroutine_suspended) {
                    }
                }
            }
        }
        androidClientEngine$execute$1 = new AndroidClientEngine$execute$1(this, continuation);
        Object obj2 = androidClientEngine$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidClientEngine$execute$1.label;
        if (i != 0) {
        }
        coroutineContext = (CoroutineContext) callContext;
        GMTDate$default = DateJvmKt.GMTDate$default(null, 1, null);
        String urlString2 = httpRequestData2.getUrl().getUrlString();
        body = httpRequestData2.getBody();
        Headers headers2 = httpRequestData2.getHeaders();
        HttpHeaders httpHeaders2 = HttpHeaders.INSTANCE;
        String str2 = headers2.get(httpHeaders2.getContentLength());
        if (str2 == null) {
        }
        proxyAwareConnection = getProxyAwareConnection(urlString2);
        proxyAwareConnection.setConnectTimeout(getConfig().getConnectTimeout());
        proxyAwareConnection.setReadTimeout(getConfig().getSocketTimeout());
        AndroidURLConnectionUtilsKt.setupTimeoutAttributes(proxyAwareConnection, httpRequestData2);
        if (proxyAwareConnection instanceof HttpsURLConnection) {
        }
        proxyAwareConnection.setRequestMethod(httpRequestData2.getMethod().getValue());
        proxyAwareConnection.setUseCaches(false);
        proxyAwareConnection.setInstanceFollowRedirects(false);
        if (HttpMethodKt.getSupportsRequestBody(httpRequestData2.getMethod())) {
        }
        UtilsKt.mergeHeaders(httpRequestData2.getHeaders(), httpRequestData2.getBody(), new Function2() { // from class: io.ktor.client.engine.android.AndroidClientEngine$execute$lambda$1$$inlined$forEachHeader$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj22, Object obj3) {
                invoke((String) obj22, (String) obj3);
                return Unit.INSTANCE;
            }

            public final void invoke(String key, String value) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                if (z && Intrinsics.areEqual(key, HttpHeaders.INSTANCE.getContentLength())) {
                    return;
                }
                proxyAwareConnection.addRequestProperty(key, value);
            }
        });
        getConfig().getRequestConfig().invoke(proxyAwareConnection);
        if (HttpMethodKt.getSupportsRequestBody(httpRequestData2.getMethod())) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpResponseData execute$lambda$5(CoroutineContext coroutineContext, HttpRequestData httpRequestData, OutgoingContent outgoingContent, GMTDate gMTDate, HttpURLConnection current) {
        HttpStatusCode fromValue;
        String str;
        Intrinsics.checkNotNullParameter(current, "current");
        int responseCode = current.getResponseCode();
        String responseMessage = current.getResponseMessage();
        if (responseMessage != null) {
            fromValue = new HttpStatusCode(responseCode, responseMessage);
        } else {
            fromValue = HttpStatusCode.Companion.fromValue(responseCode);
        }
        HttpStatusCode httpStatusCode = fromValue;
        ByteReadChannel content = AndroidURLConnectionUtilsKt.content(current, responseCode, coroutineContext);
        Map<String, List<String>> headerFields = current.getHeaderFields();
        Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(headerFields.size()));
        Iterator<T> it = headerFields.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            if (str2 != null) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                str = str2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                if (str != null) {
                    linkedHashMap.put(str, entry.getValue());
                }
            }
            str = "";
            linkedHashMap.put(str, entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!StringsKt.isBlank((CharSequence) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        HttpProtocolVersion http_1_1 = HttpProtocolVersion.Companion.getHTTP_1_1();
        HeadersImpl headersImpl = new HeadersImpl(linkedHashMap2);
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(httpRequestData.getAttributes().getOrNull(HttpRequestKt.getResponseAdapterAttributeKey()));
        return new HttpResponseData(httpStatusCode, gMTDate, headersImpl, http_1_1, content, coroutineContext);
    }

    private final HttpURLConnection getProxyAwareConnection(String str) {
        URLConnection openConnection;
        URL url = new URL(str);
        Proxy proxy = getConfig().getProxy();
        if (proxy == null || (openConnection = url.openConnection(proxy)) == null) {
            openConnection = url.openConnection();
            Intrinsics.checkNotNullExpressionValue(openConnection, "openConnection(...)");
        }
        return (HttpURLConnection) openConnection;
    }
}
