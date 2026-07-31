package io.ktor.client.plugins;

import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;

/* compiled from: HttpRequestRetry.kt */
/* loaded from: classes13.dex */
public final class HttpRequestRetryConfig {
    public Function2 delayMillis;
    private int maxRetries;
    public Function3 shouldRetry;
    public Function3 shouldRetryOnException;
    private Function2 delay = new HttpRequestRetryConfig$delay$1(null);
    private Function2 modifyRequest = new Function2() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit modifyRequest$lambda$0;
            modifyRequest$lambda$0 = HttpRequestRetryConfig.modifyRequest$lambda$0((HttpRetryModifyRequestContext) obj, (HttpRequestBuilder) obj2);
            return modifyRequest$lambda$0;
        }
    };

    public HttpRequestRetryConfig() {
        retryOnExceptionOrServerErrors(3);
        exponentialDelay$default(this, 0.0d, 0L, 0L, 0L, false, 31, null);
    }

    public final Function3 getShouldRetry$ktor_client_core() {
        Function3 function3 = this.shouldRetry;
        if (function3 != null) {
            return function3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldRetry");
        return null;
    }

    public final void setShouldRetry$ktor_client_core(Function3 function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.shouldRetry = function3;
    }

    public final Function3 getShouldRetryOnException$ktor_client_core() {
        Function3 function3 = this.shouldRetryOnException;
        if (function3 != null) {
            return function3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldRetryOnException");
        return null;
    }

    public final void setShouldRetryOnException$ktor_client_core(Function3 function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.shouldRetryOnException = function3;
    }

    public final Function2 getDelayMillis$ktor_client_core() {
        Function2 function2 = this.delayMillis;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delayMillis");
        return null;
    }

    public final void setDelayMillis$ktor_client_core(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.delayMillis = function2;
    }

    public final Function2 getDelay$ktor_client_core() {
        return this.delay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit modifyRequest$lambda$0(HttpRetryModifyRequestContext httpRetryModifyRequestContext, HttpRequestBuilder it) {
        Intrinsics.checkNotNullParameter(httpRetryModifyRequestContext, "<this>");
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function2 getModifyRequest() {
        return this.modifyRequest;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final void setMaxRetries(int i) {
        this.maxRetries = i;
    }

    public final void modifyRequest(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.modifyRequest = block;
    }

    public final void retryIf(int i, Function3 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (i != -1) {
            this.maxRetries = i;
        }
        setShouldRetry$ktor_client_core(block);
    }

    public final void retryOnExceptionIf(int i, Function3 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (i != -1) {
            this.maxRetries = i;
        }
        setShouldRetryOnException$ktor_client_core(block);
    }

    public static /* synthetic */ void retryOnException$default(HttpRequestRetryConfig httpRequestRetryConfig, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        httpRequestRetryConfig.retryOnException(i, z);
    }

    public final void retryOnException(int i, final boolean z) {
        retryOnExceptionIf(i, new Function3() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean retryOnException$lambda$3;
                retryOnException$lambda$3 = HttpRequestRetryConfig.retryOnException$lambda$3(z, (HttpRetryShouldRetryContext) obj, (HttpRequestBuilder) obj2, (Throwable) obj3);
                return Boolean.valueOf(retryOnException$lambda$3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryOnException$lambda$3(boolean z, HttpRetryShouldRetryContext retryOnExceptionIf, HttpRequestBuilder httpRequestBuilder, Throwable cause) {
        boolean isTimeoutException;
        Intrinsics.checkNotNullParameter(retryOnExceptionIf, "$this$retryOnExceptionIf");
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<unused var>");
        Intrinsics.checkNotNullParameter(cause, "cause");
        isTimeoutException = HttpRequestRetryKt.isTimeoutException(cause);
        return isTimeoutException ? z : !(cause instanceof CancellationException);
    }

    public final void retryOnServerErrors(int i) {
        retryIf(i, new Function3() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean retryOnServerErrors$lambda$5;
                retryOnServerErrors$lambda$5 = HttpRequestRetryConfig.retryOnServerErrors$lambda$5((HttpRetryShouldRetryContext) obj, (HttpRequest) obj2, (HttpResponse) obj3);
                return Boolean.valueOf(retryOnServerErrors$lambda$5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryOnServerErrors$lambda$5(HttpRetryShouldRetryContext retryIf, HttpRequest httpRequest, HttpResponse response) {
        Intrinsics.checkNotNullParameter(retryIf, "$this$retryIf");
        Intrinsics.checkNotNullParameter(httpRequest, "<unused var>");
        Intrinsics.checkNotNullParameter(response, "response");
        int value = response.getStatus().getValue();
        return 500 <= value && value < 600;
    }

    public final void retryOnExceptionOrServerErrors(int i) {
        retryOnServerErrors(i);
        retryOnException$default(this, i, false, 2, null);
    }

    public static /* synthetic */ void delayMillis$default(HttpRequestRetryConfig httpRequestRetryConfig, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        httpRequestRetryConfig.delayMillis(z, function2);
    }

    public final void delayMillis(final boolean z, final Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        setDelayMillis$ktor_client_core(new Function2() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                long delayMillis$lambda$6;
                delayMillis$lambda$6 = HttpRequestRetryConfig.delayMillis$lambda$6(z, block, (HttpRetryDelayContext) obj, ((Integer) obj2).intValue());
                return Long.valueOf(delayMillis$lambda$6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long delayMillis$lambda$6(boolean z, Function2 function2, HttpRetryDelayContext httpRetryDelayContext, int i) {
        Headers headers;
        String str;
        Long longOrNull;
        Intrinsics.checkNotNullParameter(httpRetryDelayContext, "<this>");
        if (z) {
            HttpResponse response = httpRetryDelayContext.getResponse();
            Long valueOf = (response == null || (headers = response.getHeaders()) == null || (str = headers.get(HttpHeaders.INSTANCE.getRetryAfter())) == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? null : Long.valueOf(longOrNull.longValue() * 1000);
            return Math.max(((Number) function2.invoke(httpRetryDelayContext, Integer.valueOf(i))).longValue(), valueOf != null ? valueOf.longValue() : 0L);
        }
        return ((Number) function2.invoke(httpRetryDelayContext, Integer.valueOf(i))).longValue();
    }

    public static /* synthetic */ void exponentialDelay$default(HttpRequestRetryConfig httpRequestRetryConfig, double d, long j, long j2, long j3, boolean z, int i, Object obj) {
        httpRequestRetryConfig.exponentialDelay((i & 1) != 0 ? 2.0d : d, (i & 2) != 0 ? 1000L : j, (i & 4) != 0 ? 60000L : j2, (i & 8) == 0 ? j3 : 1000L, (i & 16) != 0 ? true : z);
    }

    public final void exponentialDelay(final double d, final long j, final long j2, final long j3, boolean z) {
        if (d <= 0.0d) {
            throw new IllegalStateException("Check failed.");
        }
        if (j <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (j2 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (j3 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        delayMillis(z, new Function2() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                long exponentialDelay$lambda$8;
                exponentialDelay$lambda$8 = HttpRequestRetryConfig.exponentialDelay$lambda$8(d, j, j2, this, j3, (HttpRetryDelayContext) obj, ((Integer) obj2).intValue());
                return Long.valueOf(exponentialDelay$lambda$8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long exponentialDelay$lambda$8(double d, long j, long j2, HttpRequestRetryConfig httpRequestRetryConfig, long j3, HttpRetryDelayContext delayMillis, int i) {
        Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return Math.min((long) (Math.pow(d, i - 1) * j), j2) + httpRequestRetryConfig.randomMs(j3);
    }

    private final long randomMs(long j) {
        if (j == 0) {
            return 0L;
        }
        return Random.Default.nextLong(j);
    }
}
