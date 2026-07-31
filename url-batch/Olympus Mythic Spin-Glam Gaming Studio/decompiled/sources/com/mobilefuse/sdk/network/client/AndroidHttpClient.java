package com.mobilefuse.sdk.network.client;

import com.ironsource.C4701ic;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.safedk.android.internal.partials.MobileFuseNetworkBridge;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClient.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J6\u0010\u0012\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\u00040\bH\u0016¨\u0006\u0015"}, d2 = {"Lcom/mobilefuse/sdk/network/client/AndroidHttpClient;", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "()V", "get", "", "request", "Lcom/mobilefuse/sdk/network/client/HttpGetRequest;", "completeBlock", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/network/client/HttpError;", "Lcom/mobilefuse/sdk/network/client/HttpResponse;", "getSync", "headSync", IronSourceConstants.REQUEST_URL, "", "timeoutMillis", "", "post", "Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes13.dex */
final class AndroidHttpClient implements HttpClient {
    @Override // com.mobilefuse.sdk.network.client.HttpClient
    public void get(@NotNull final HttpGetRequest request, @NotNull final Function1 completeBlock) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(completeBlock, "completeBlock");
        SchedulersKt.runOnScheduler(Schedulers.IO, new Function0() { // from class: com.mobilefuse.sdk.network.client.AndroidHttpClient$get$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                final Either<HttpError, HttpResponse> sync = AndroidHttpClient.this.getSync(request);
                SchedulersKt.runOnScheduler(Schedulers.MAIN, new Function0() { // from class: com.mobilefuse.sdk.network.client.AndroidHttpClient$get$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        completeBlock.invoke(sync);
                    }
                });
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    @Override // com.mobilefuse.sdk.network.client.HttpClient
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Either<HttpError, HttpResponse> getSync(@NotNull HttpGetRequest request) {
        Object connectionError;
        long currentTimeMillis;
        URLConnection openConnection;
        String readText;
        InputStream inputStream;
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            currentTimeMillis = System.currentTimeMillis();
            openConnection = new URL(request.getUrl()).openConnection();
        } catch (Throwable th) {
            String message = th.getMessage();
            if (th instanceof FileNotFoundException) {
            }
            th.printStackTrace();
            return new ErrorResult(connectionError);
        }
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod(C4701ic.a);
        httpURLConnection.setConnectTimeout((int) request.getTimeoutMillis());
        httpURLConnection.setReadTimeout((int) request.getTimeoutMillis());
        if (request.getEmptyUserAgent()) {
            httpURLConnection.setRequestProperty("User-Agent", "");
        }
        if (request.getGzipEncoding()) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        }
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        int httpUrlConnectionGetResponseCode = MobileFuseNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (httpUrlConnectionGetResponseCode == 200) {
            if (request.getGzipEncoding()) {
                inputStream = new GZIPInputStream(MobileFuseNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
            } else {
                inputStream = MobileFuseNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            }
            Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
            try {
                String readText2 = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                inputStream.close();
                return new SuccessResult(new HttpResponse(readText2, httpUrlConnectionGetResponseCode, currentTimeMillis, currentTimeMillis2));
            } finally {
            }
        } else {
            InputStream errorStream = httpURLConnection.getErrorStream();
            BufferedReader bufferedReader2 = errorStream != null ? new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192) : null;
            if (bufferedReader2 != null) {
                try {
                    readText = TextStreamsKt.readText(bufferedReader2);
                } finally {
                }
            } else {
                readText = null;
            }
            CloseableKt.closeFinally(bufferedReader2, null);
            return new ErrorResult(new HttpError.ConnectionError(httpUrlConnectionGetResponseCode, readText));
        }
        String message2 = th.getMessage();
        if (th instanceof FileNotFoundException) {
            connectionError = th instanceof UnknownHostException ? new HttpError.ConnectionError(-1, message2) : new HttpError.UnknownError(message2);
        } else {
            connectionError = new HttpError.ConnectionError(404, message2);
        }
        th.printStackTrace();
        return new ErrorResult(connectionError);
    }

    @Override // com.mobilefuse.sdk.network.client.HttpClient
    @NotNull
    public Either<HttpError, HttpResponse> headSync(@NotNull String requestUrl, long timeoutMillis) {
        Either errorResult;
        Object value;
        Object connectionError;
        long currentTimeMillis;
        URLConnection openConnection;
        String readText;
        Object errorResult2;
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            currentTimeMillis = System.currentTimeMillis();
            openConnection = new URL(requestUrl).openConnection();
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("HEAD");
        int i = (int) timeoutMillis;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        int httpUrlConnectionGetResponseCode = MobileFuseNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (httpUrlConnectionGetResponseCode == 200) {
            errorResult2 = new SuccessResult(new HttpResponse("", httpUrlConnectionGetResponseCode, currentTimeMillis, currentTimeMillis2));
        } else {
            InputStream errorStream = httpURLConnection.getErrorStream();
            BufferedReader bufferedReader = errorStream != null ? new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192) : null;
            if (bufferedReader != null) {
                try {
                    readText = TextStreamsKt.readText(bufferedReader);
                } finally {
                }
            } else {
                readText = null;
            }
            CloseableKt.closeFinally(bufferedReader, null);
            errorResult2 = new ErrorResult(new HttpError.ConnectionError(httpUrlConnectionGetResponseCode, readText));
        }
        errorResult = new SuccessResult(errorResult2);
        if (!(errorResult instanceof ErrorResult)) {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        } else {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            String message = th2.getMessage();
            if (th2 instanceof FileNotFoundException) {
                connectionError = new HttpError.ConnectionError(404, message);
            } else {
                connectionError = th2 instanceof UnknownHostException ? new HttpError.ConnectionError(-1, message) : new HttpError.UnknownError(message);
            }
            th2.printStackTrace();
            value = new ErrorResult(connectionError);
        }
        return (Either) value;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpClient
    public void post(@NotNull HttpPostRequest<? extends HttpPostBody> request, @NotNull Function1 completeBlock) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(completeBlock, "completeBlock");
        SchedulersKt.runOnScheduler(Schedulers.IO, new AndroidHttpClient$post$1(this, request, completeBlock));
    }
}
