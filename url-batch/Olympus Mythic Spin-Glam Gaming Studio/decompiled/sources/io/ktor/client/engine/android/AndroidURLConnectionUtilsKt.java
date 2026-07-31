package io.ktor.client.engine.android;

import io.ktor.client.plugins.HttpTimeoutCapability;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.ReadingKt;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.YieldKt;

/* compiled from: AndroidURLConnectionUtils.kt */
/* loaded from: classes15.dex */
public abstract class AndroidURLConnectionUtilsKt {
    public static final void setupTimeoutAttributes(HttpURLConnection httpURLConnection, HttpRequestData requestData) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) requestData.getCapabilityOrNull(HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig != null) {
            Long connectTimeoutMillis = httpTimeoutConfig.getConnectTimeoutMillis();
            if (connectTimeoutMillis != null) {
                httpURLConnection.setConnectTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(connectTimeoutMillis.longValue()));
            }
            Long socketTimeoutMillis = httpTimeoutConfig.getSocketTimeoutMillis();
            if (socketTimeoutMillis != null) {
                httpURLConnection.setReadTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(socketTimeoutMillis.longValue()));
            }
            setupRequestTimeoutAttributes(httpURLConnection, httpTimeoutConfig);
        }
    }

    private static final void setupRequestTimeoutAttributes(HttpURLConnection httpURLConnection, HttpTimeoutConfig httpTimeoutConfig) {
        Long requestTimeoutMillis = httpTimeoutConfig.getRequestTimeoutMillis();
        if (requestTimeoutMillis != null) {
            long longValue = requestTimeoutMillis.longValue();
            if (longValue != Long.MAX_VALUE) {
                if (httpURLConnection.getConnectTimeout() == 0 || httpURLConnection.getConnectTimeout() > longValue) {
                    httpURLConnection.setConnectTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(longValue));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object timeoutAwareConnection(HttpURLConnection httpURLConnection, HttpRequestData httpRequestData, Function1 function1, Continuation continuation) {
        AndroidURLConnectionUtilsKt$timeoutAwareConnection$1 androidURLConnectionUtilsKt$timeoutAwareConnection$1;
        int i;
        if (continuation instanceof AndroidURLConnectionUtilsKt$timeoutAwareConnection$1) {
            androidURLConnectionUtilsKt$timeoutAwareConnection$1 = (AndroidURLConnectionUtilsKt$timeoutAwareConnection$1) continuation;
            int i2 = androidURLConnectionUtilsKt$timeoutAwareConnection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidURLConnectionUtilsKt$timeoutAwareConnection$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidURLConnectionUtilsKt$timeoutAwareConnection$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidURLConnectionUtilsKt$timeoutAwareConnection$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        return function1.invoke(httpURLConnection);
                    } catch (Throwable th) {
                        th = th;
                        androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$0 = httpRequestData;
                        androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$1 = th;
                        androidURLConnectionUtilsKt$timeoutAwareConnection$1.label = 1;
                        if (YieldKt.yield(androidURLConnectionUtilsKt$timeoutAwareConnection$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$1;
                    httpRequestData = (HttpRequestData) androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!isTimeoutException(th)) {
                    throw HttpTimeoutKt.ConnectTimeoutException(httpRequestData, th);
                }
                throw th;
            }
        }
        androidURLConnectionUtilsKt$timeoutAwareConnection$1 = new AndroidURLConnectionUtilsKt$timeoutAwareConnection$1(continuation);
        Object obj2 = androidURLConnectionUtilsKt$timeoutAwareConnection$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidURLConnectionUtilsKt$timeoutAwareConnection$1.label;
        if (i != 0) {
        }
        if (!isTimeoutException(th)) {
        }
    }

    public static final ByteReadChannel content(HttpURLConnection httpURLConnection, int i, CoroutineContext callContext) {
        ByteReadChannel byteReadChannel;
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        HttpStatusCode.Companion companion = HttpStatusCode.Companion;
        if (CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(companion.getNotModified().getValue()), Integer.valueOf(companion.getNoContent().getValue())}).contains(Integer.valueOf(i))) {
            return ByteReadChannel.Companion.getEmpty();
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            r4 = inputStream != null ? inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192) : null;
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                r4 = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
            }
        }
        return (r4 == null || (byteReadChannel = ReadingKt.toByteReadChannel(r4, callContext, ByteBufferPoolKt.getKtorDefaultPool())) == null) ? ByteReadChannel.Companion.getEmpty() : byteReadChannel;
    }

    private static final boolean isTimeoutException(Throwable th) {
        if (!(th instanceof SocketTimeoutException)) {
            if (!(th instanceof ConnectException)) {
                return false;
            }
            String message = th.getMessage();
            if (!(message != null ? StringsKt.contains$default((CharSequence) message, (CharSequence) "timed out", false, 2, (Object) null) : false)) {
                return false;
            }
        }
        return true;
    }
}
