package com.unity3d.services.core.network.core;

import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import io.bidmachine.util.network.NetworkUtils;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ExecutorsKt;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CronetClient.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/unity3d/services/core/network/core/CronetClient;", "Lcom/unity3d/services/core/network/core/HttpClient;", "engine", "Lorg/chromium/net/CronetEngine;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "<init>", "(Lorg/chromium/net/CronetEngine;Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "shutdown", "", "executeBlocking", "Lcom/unity3d/services/core/network/model/HttpResponse;", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "execute", "withInputStream", "", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPriority", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "buildUrl", "", "getContentSize", "", "info", "Lorg/chromium/net/UrlResponseInfo;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CronetClient implements HttpClient {

    @NotNull
    private static final String MSG_CONNECTION_FAILED = "Network request failed";

    @NotNull
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";

    @NotNull
    private static final String NETWORK_CLIENT_CRONET = "cronet";

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final CronetEngine engine;

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int priority) {
        if (priority == 0) {
            return 4;
        }
        if (priority != 1) {
            return priority != 2 ? 1 : 2;
        }
        return 3;
    }

    public CronetClient(@NotNull CronetEngine engine, @NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.engine = engine;
        this.dispatchers = dispatchers;
    }

    public final void shutdown() {
        this.engine.shutdown();
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @NotNull
    public HttpResponse executeBlocking(@NotNull HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (HttpResponse) BuildersKt.runBlocking(this.dispatchers.getIo(), new CronetClient$executeBlocking$1(this, request, null));
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @Nullable
    public Object execute(@NotNull HttpRequest httpRequest, final boolean z, @NotNull Continuation continuation) {
        byte[] bArr;
        final PipedOutputStream pipedOutputStream = z ? new PipedOutputStream() : null;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        UrlRequest.Builder newUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), new UnityAdsUrlRequestCallback() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(UrlRequest request, UrlResponseInfo info, byte[] bodyBytes) {
                Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/network/core/CronetClient$execute$2$callback$1;->onSucceeded(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;[B)V");
                CreativeInfoManager.onCronetClientGetResponse(h.m, info, bodyBytes);
                safedk_CronetClient$execute$2$callback$1_onSucceeded_ecb4a8123eb0b00afe87b373b5ff5353(request, info, bodyBytes);
            }

            public void safedk_CronetClient$execute$2$callback$1_onSucceeded_ecb4a8123eb0b00afe87b373b5ff5353(UrlRequest request, UrlResponseInfo info, byte[] bodyBytes) {
                long contentSize;
                PipedOutputStream pipedOutputStream2;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(info, "info");
                Intrinsics.checkNotNullParameter(bodyBytes, "bodyBytes");
                if (z && (pipedOutputStream2 = pipedOutputStream) != null) {
                    pipedOutputStream2.close();
                }
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                int httpStatusCode = info.getHttpStatusCode();
                Map<String, List<String>> allHeaders = info.getAllHeaders();
                Intrinsics.checkNotNullExpressionValue(allHeaders, "getAllHeaders(...)");
                String url = info.getUrl();
                Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                String negotiatedProtocol = info.getNegotiatedProtocol();
                Intrinsics.checkNotNullExpressionValue(negotiatedProtocol, "getNegotiatedProtocol(...)");
                contentSize = this.getContentSize(info);
                cancellableContinuation.resumeWith(Result.m8023constructorimpl(new HttpResponse(bodyBytes, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize)));
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onFailed(UrlRequest request, UrlResponseInfo info, CronetException error) {
                PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                NetworkException networkException = error instanceof NetworkException ? (NetworkException) error : null;
                UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, info != null ? Integer.valueOf(info.getHttpStatusCode()) : null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null);
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(unityAdsNetworkException)));
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onCanceled(UrlRequest request, UrlResponseInfo info) {
                super.onCanceled(request, info);
                PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Network request timed out", null, null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, null, "cronet", 38, null);
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(networkTimeoutException)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) {
                long contentSize;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(info, "info");
                Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                if (pipedOutputStream != null) {
                    if (!atomicBoolean.getAndSet(true)) {
                        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                        int httpStatusCode = info.getHttpStatusCode();
                        Map<String, List<String>> allHeaders = info.getAllHeaders();
                        Intrinsics.checkNotNullExpressionValue(allHeaders, "getAllHeaders(...)");
                        String url = info.getUrl();
                        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
                        String negotiatedProtocol = info.getNegotiatedProtocol();
                        Intrinsics.checkNotNullExpressionValue(negotiatedProtocol, "getNegotiatedProtocol(...)");
                        contentSize = this.getContentSize(info);
                        cancellableContinuation.resumeWith(Result.m8023constructorimpl(new HttpResponse(pipedInputStream, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize)));
                    }
                    byteBuffer.flip();
                    try {
                        byte[] bArr2 = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr2);
                        pipedOutputStream.write(bArr2);
                    } catch (IOException e) {
                        DeviceLog.info("IOException during ByteBuffer read. Details: ", e);
                    }
                    byteBuffer.clear();
                    request.read(byteBuffer);
                    return;
                }
                super.onReadCompleted(request, info, byteBuffer);
            }
        }, ExecutorsKt.asExecutor(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                newUrlRequestBuilder.addHeader(key, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bArr = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bArr = ((String) httpRequest.getBody()).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bArr, "getBytes(...)");
            } else {
                bArr = new byte[0];
            }
            newUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bArr), ExecutorsKt.asExecutor(this.dispatchers.getIo()));
        }
        final UrlRequest build = newUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        cancellableContinuationImpl.invokeOnCancellation(new Function1() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable th) {
                UrlRequest.this.cancel();
            }
        });
        build.start();
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(HttpRequest request) {
        return StringsKt.removeSuffix(StringsKt.trim(request.getBaseURL(), '/') + '/' + StringsKt.trim(request.getPath(), '/'), "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(UrlResponseInfo info) {
        String str;
        Long longOrNull;
        List<String> list = info.getAllHeaders().get(NetworkUtils.HEADER_CONTENT_LENGTH);
        if (list == null || (str = list.get(0)) == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) {
            return -1L;
        }
        return longOrNull.longValue();
    }
}
