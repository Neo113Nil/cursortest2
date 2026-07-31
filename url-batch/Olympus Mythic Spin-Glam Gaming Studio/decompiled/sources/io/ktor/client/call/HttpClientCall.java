package io.ktor.client.call;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.request.DefaultHttpRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.statement.DefaultHttpResponse;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.content.NullBody;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.utils.io.ByteReadChannel;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClientCall.kt */
/* loaded from: classes13.dex */
public class HttpClientCall implements CoroutineScope {
    public static final Companion Companion = new Companion(0 == true ? 1 : 0);
    private static final AttributeKey CustomResponse;
    private static final /* synthetic */ AtomicIntegerFieldUpdater received$FU;
    private final boolean allowDoubleReceive;
    private final HttpClient client;

    @NotNull
    private volatile /* synthetic */ int received;
    protected HttpRequest request;
    protected HttpResponse response;

    protected Object getResponseContent(Continuation continuation) {
        return getResponseContent$suspendImpl(this, continuation);
    }

    public HttpClientCall(HttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
        this.received = 0;
    }

    public final HttpClient getClient() {
        return this.client;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return getResponse().getCoroutineContext();
    }

    public final Attributes getAttributes() {
        return getRequest().getAttributes();
    }

    public final HttpRequest getRequest() {
        HttpRequest httpRequest = this.request;
        if (httpRequest != null) {
            return httpRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    protected final void setRequest(HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, "<set-?>");
        this.request = httpRequest;
    }

    public final HttpResponse getResponse() {
        HttpResponse httpResponse = this.response;
        if (httpResponse != null) {
            return httpResponse;
        }
        Intrinsics.throwUninitializedPropertyAccessException("response");
        return null;
    }

    protected final void setResponse(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<set-?>");
        this.response = httpResponse;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpClientCall(HttpClient client, HttpRequestData requestData, HttpResponseData responseData) {
        this(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        setRequest(new DefaultHttpRequest(this, requestData));
        setResponse(new DefaultHttpResponse(this, responseData));
        Attributes attributes = getAttributes();
        AttributeKey attributeKey = CustomResponse;
        attributes.remove(attributeKey);
        if (responseData.getBody() instanceof ByteReadChannel) {
            return;
        }
        getAttributes().put(attributeKey, responseData.getBody());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KType kType = null;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        try {
            kType = Reflection.typeOf(Object.class);
        } catch (Throwable unused) {
        }
        CustomResponse = new AttributeKey("CustomResponse", new TypeInfo(orCreateKotlinClass, kType));
        received$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCall.class, "received");
    }

    protected boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }

    static /* synthetic */ Object getResponseContent$suspendImpl(HttpClientCall httpClientCall, Continuation continuation) {
        return httpClientCall.getResponse().getRawContent();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:13:0x00a7, B:17:0x00b9, B:20:0x00c4, B:21:0x00d9, B:28:0x0040, B:29:0x0091, B:33:0x0047, B:35:0x0055, B:37:0x005a, B:39:0x0060, B:41:0x006a, B:44:0x0074, B:45:0x0079, B:46:0x007a, B:48:0x0086), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bodyNullable(TypeInfo typeInfo, Continuation continuation) {
        HttpClientCall$bodyNullable$1 httpClientCall$bodyNullable$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        Object response;
        try {
            if (continuation instanceof HttpClientCall$bodyNullable$1) {
                httpClientCall$bodyNullable$1 = (HttpClientCall$bodyNullable$1) continuation;
                int i2 = httpClientCall$bodyNullable$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    httpClientCall$bodyNullable$1.label = i2 - Integer.MIN_VALUE;
                    obj = httpClientCall$bodyNullable$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpClientCall$bodyNullable$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (TypeInfoJvmKt.instanceOf(getResponse(), typeInfo.getType())) {
                            return getResponse();
                        }
                        if (!getAllowDoubleReceive() && !DoubleReceivePluginKt.isSaved(getResponse()) && !received$FU.compareAndSet(this, 0, 1)) {
                            throw new DoubleReceiveException(this);
                        }
                        obj = getAttributes().getOrNull(CustomResponse);
                        if (obj == null) {
                            httpClientCall$bodyNullable$1.L$0 = typeInfo;
                            httpClientCall$bodyNullable$1.label = 1;
                            obj = getResponseContent(httpClientCall$bodyNullable$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            typeInfo = (TypeInfo) httpClientCall$bodyNullable$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            response = ((HttpResponseContainer) obj).getResponse();
                            if (Intrinsics.areEqual(response, NullBody.INSTANCE)) {
                                response = null;
                            }
                            if (response != null && !TypeInfoJvmKt.instanceOf(response, typeInfo.getType())) {
                                throw new NoTransformationFoundException(getResponse(), Reflection.getOrCreateKotlinClass(response.getClass()), typeInfo.getType());
                            }
                            return response;
                        }
                        typeInfo = (TypeInfo) httpClientCall$bodyNullable$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    HttpResponseContainer httpResponseContainer = new HttpResponseContainer(typeInfo, obj);
                    HttpResponsePipeline responsePipeline = this.client.getResponsePipeline();
                    httpClientCall$bodyNullable$1.L$0 = typeInfo;
                    httpClientCall$bodyNullable$1.label = 2;
                    obj = responsePipeline.execute(this, httpResponseContainer, httpClientCall$bodyNullable$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    response = ((HttpResponseContainer) obj).getResponse();
                    if (Intrinsics.areEqual(response, NullBody.INSTANCE)) {
                    }
                    if (response != null) {
                        throw new NoTransformationFoundException(getResponse(), Reflection.getOrCreateKotlinClass(response.getClass()), typeInfo.getType());
                    }
                    return response;
                }
            }
            if (i != 0) {
            }
            HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(typeInfo, obj);
            HttpResponsePipeline responsePipeline2 = this.client.getResponsePipeline();
            httpClientCall$bodyNullable$1.L$0 = typeInfo;
            httpClientCall$bodyNullable$1.label = 2;
            obj = responsePipeline2.execute(this, httpResponseContainer2, httpClientCall$bodyNullable$1);
            if (obj == coroutine_suspended) {
            }
            response = ((HttpResponseContainer) obj).getResponse();
            if (Intrinsics.areEqual(response, NullBody.INSTANCE)) {
            }
            if (response != null) {
            }
            return response;
        } catch (Throwable th) {
            CoroutineScopeKt.cancel(getResponse(), "Receive failed", th);
            throw th;
        }
        httpClientCall$bodyNullable$1 = new HttpClientCall$bodyNullable$1(this, continuation);
        obj = httpClientCall$bodyNullable$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpClientCall$bodyNullable$1.label;
    }

    public String toString() {
        return "HttpClientCall[" + getRequest().getUrl() + ", " + getResponse().getStatus() + ']';
    }

    public final void setResponse$ktor_client_core(HttpResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        setResponse(response);
    }

    /* compiled from: HttpClientCall.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
