package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.encoding.Gzip;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpError;
import com.safedk.android.internal.partials.MobileFuseNetworkBridge;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

/* compiled from: HttpClient.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes13.dex */
final class AndroidHttpClient$post$1 extends Lambda implements Function0 {
    final /* synthetic */ Function1 $completeBlock;
    final /* synthetic */ HttpPostRequest $request;
    final /* synthetic */ AndroidHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHttpClient$post$1(AndroidHttpClient androidHttpClient, HttpPostRequest httpPostRequest, Function1 function1) {
        super(0);
        this.this$0 = androidHttpClient;
        this.$request = httpPostRequest;
        this.$completeBlock = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        String readText;
        final Either errorResult;
        InputStream inputStream;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            URLConnection openConnection = new URL(this.$request.getUrl()).openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout((int) this.$request.getTimeoutMillis());
            httpURLConnection.setReadTimeout((int) this.$request.getTimeoutMillis());
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            if (this.$request.getEmptyUserAgent()) {
                httpURLConnection.setRequestProperty("User-Agent", "");
            }
            if (this.$request.getGzipEncoding()) {
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
            httpURLConnection.setRequestProperty("Content-Type", this.$request.getBody().getContentType());
            for (Map.Entry entry : MapsKt.plus(this.$request.getHeaders(), this.$request.getBody().getHeaders()).entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            byte[] content = this.$request.getBody().getContent();
            if (content == null) {
                SchedulersKt.runOnScheduler(Schedulers.MAIN, new Function0() { // from class: com.mobilefuse.sdk.network.client.AndroidHttpClient$post$1$$special$$inlined$let$lambda$1
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
                        AndroidHttpClient$post$1.this.$completeBlock.invoke(new ErrorResult(new HttpError.UnknownError("Error with request body: content was null")));
                    }
                });
                return;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(MobileFuseNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
            if (this.$request.getGzipEncoding()) {
                content = Gzip.gzip(content);
            }
            dataOutputStream.write(content);
            dataOutputStream.close();
            int httpUrlConnectionGetResponseCode = MobileFuseNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            long currentTimeMillis2 = System.currentTimeMillis();
            if (httpUrlConnectionGetResponseCode == 200) {
                if (this.$request.getGzipEncoding()) {
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
                    errorResult = new SuccessResult(new HttpResponse(readText2, httpUrlConnectionGetResponseCode, currentTimeMillis, currentTimeMillis2));
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
                errorResult = new ErrorResult(new HttpError.ConnectionError(httpUrlConnectionGetResponseCode, readText));
            }
            SchedulersKt.runOnScheduler(Schedulers.MAIN, new Function0() { // from class: com.mobilefuse.sdk.network.client.AndroidHttpClient$post$1.1
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
                    AndroidHttpClient$post$1.this.$completeBlock.invoke(errorResult);
                }
            });
        } catch (Throwable th) {
            final HttpError connectionError = th instanceof FileNotFoundException ? new HttpError.ConnectionError(404, null, 2, null) : new HttpError.UnknownError(th.getMessage());
            th.printStackTrace();
            SchedulersKt.runOnScheduler(Schedulers.MAIN, new Function0() { // from class: com.mobilefuse.sdk.network.client.AndroidHttpClient$post$1.2
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
                    AndroidHttpClient$post$1.this.$completeBlock.invoke(new ErrorResult(connectionError));
                }
            });
        }
    }
}
