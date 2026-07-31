package com.unity3d.services.core.network.core;

import com.safedk.android.internal.partials.UnityCoreNetworkBridge;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import io.bidmachine.util.network.NetworkUtils;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OkHttp3Client.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/services/core/network/core/HttpClient;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "client", "Lokhttp3/OkHttpClient;", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lokhttp3/OkHttpClient;)V", "executeBlocking", "Lcom/unity3d/services/core/network/model/HttpResponse;", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "execute", "withInputStream", "", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OkHttp3Client implements HttpClient {

    @NotNull
    public static final String MSG_CONNECTION_FAILED = "Network request failed";

    @NotNull
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";

    @NotNull
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";

    @NotNull
    private final OkHttpClient client;

    @NotNull
    private final ISDKDispatchers dispatchers;

    public OkHttp3Client(@NotNull ISDKDispatchers dispatchers, @NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @NotNull
    public HttpResponse executeBlocking(@NotNull HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (HttpResponse) BuildersKt.runBlocking(this.dispatchers.getIo(), new OkHttp3Client$executeBlocking$1(this, request, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull HttpRequest httpRequest, final boolean z, @NotNull Continuation continuation) {
        OkHttp3Client$execute$1 okHttp3Client$execute$1;
        int i;
        try {
            if (continuation instanceof OkHttp3Client$execute$1) {
                okHttp3Client$execute$1 = (OkHttp3Client$execute$1) continuation;
                int i2 = okHttp3Client$execute$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    okHttp3Client$execute$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = okHttp3Client$execute$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = okHttp3Client$execute$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Request okHttpProtoRequest = HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest);
                        OkHttpClient.Builder newBuilder = this.client.newBuilder();
                        long connectTimeout = httpRequest.getConnectTimeout();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        OkHttpClient build = newBuilder.connectTimeout(connectTimeout, timeUnit).readTimeout(httpRequest.getReadTimeout(), timeUnit).writeTimeout(httpRequest.getWriteTimeout(), timeUnit).build();
                        okHttp3Client$execute$1.L$0 = httpRequest;
                        okHttp3Client$execute$1.L$1 = okHttpProtoRequest;
                        okHttp3Client$execute$1.L$2 = build;
                        okHttp3Client$execute$1.Z$0 = z;
                        okHttp3Client$execute$1.label = 1;
                        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(okHttp3Client$execute$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        final Call newCall = build.newCall(okHttpProtoRequest);
                        cancellableContinuationImpl.invokeOnCancellation(new Function1() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((Throwable) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Throwable th) {
                                Call.this.cancel();
                            }
                        });
                        UnityCoreNetworkBridge.okhttp3CallEnqueue(newCall, new Callback() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2
                            @Override // okhttp3.Callback
                            public void onResponse(Call call, Response response) {
                                Object bytes;
                                Long longOrNull;
                                Intrinsics.checkNotNullParameter(call, "call");
                                Intrinsics.checkNotNullParameter(response, "response");
                                ResponseBody okhttp3Response_body = UnityCoreNetworkBridge.okhttp3Response_body(response);
                                if (okhttp3Response_body == null) {
                                    CancellableContinuation cancellableContinuation = CancellableContinuation.this;
                                    Result.Companion companion = Result.INSTANCE;
                                    cancellableContinuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(new UnityAdsNetworkException("Empty response", null, Integer.valueOf(response.code()), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null))));
                                    return;
                                }
                                if (!response.isSuccessful()) {
                                    okhttp3Response_body.close();
                                    CancellableContinuation cancellableContinuation2 = CancellableContinuation.this;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    cancellableContinuation2.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(new UnityAdsNetworkException("Network request failed with code " + response.code(), null, Integer.valueOf(response.code()), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null))));
                                    return;
                                }
                                try {
                                    if (z) {
                                        bytes = okhttp3Response_body.byteStream();
                                        Intrinsics.checkNotNull(bytes, "null cannot be cast to non-null type kotlin.Any");
                                    } else {
                                        bytes = okhttp3Response_body.bytes();
                                    }
                                    Object obj2 = bytes;
                                    CancellableContinuation cancellableContinuation3 = CancellableContinuation.this;
                                    int code = response.code();
                                    Map<String, List<String>> multimap = response.headers().toMultimap();
                                    Intrinsics.checkNotNullExpressionValue(multimap, "toMultimap(...)");
                                    String url = response.request().url().getUrl();
                                    Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                                    Intrinsics.checkNotNull(obj2);
                                    String protocol = response.protocol().getProtocol();
                                    Intrinsics.checkNotNullExpressionValue(protocol, "toString(...)");
                                    String header = response.header(NetworkUtils.HEADER_CONTENT_LENGTH);
                                    cancellableContinuation3.resumeWith(Result.m8023constructorimpl(new HttpResponse(obj2, code, multimap, url, protocol, OkHttp3Client.NETWORK_CLIENT_OKHTTP, (header == null || (longOrNull = StringsKt.toLongOrNull(header)) == null) ? -1L : longOrNull.longValue())));
                                } catch (Exception e) {
                                    okhttp3Response_body.close();
                                    CancellableContinuation cancellableContinuation4 = CancellableContinuation.this;
                                    Result.Companion companion3 = Result.INSTANCE;
                                    cancellableContinuation4.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(e)));
                                }
                            }

                            @Override // okhttp3.Callback
                            public void onFailure(Call call, IOException e) {
                                Intrinsics.checkNotNullParameter(call, "call");
                                Intrinsics.checkNotNullParameter(e, "e");
                                CancellableContinuation cancellableContinuation = CancellableContinuation.this;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(e)));
                            }
                        });
                        obj = cancellableContinuationImpl.getResult();
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(okHttp3Client$execute$1);
                        }
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
            if (i != 0) {
            }
            return obj;
        } catch (SocketTimeoutException unused) {
            throw new NetworkTimeoutException(MSG_CONNECTION_TIMEOUT, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        } catch (IOException unused2) {
            throw new UnityAdsNetworkException(MSG_CONNECTION_FAILED, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        }
        okHttp3Client$execute$1 = new OkHttp3Client$execute$1(this, continuation);
        Object obj2 = okHttp3Client$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okHttp3Client$execute$1.label;
    }
}
