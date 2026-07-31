package io.ktor.client.plugins;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpRequestRetry.kt */
/* loaded from: classes3.dex */
public final class HttpRetryEventData {
    private final Throwable cause;
    private final HttpRequestBuilder request;
    private final HttpResponse response;
    private final int retryCount;

    public HttpRetryEventData(HttpRequestBuilder request, int i, HttpResponse httpResponse, Throwable th) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.retryCount = i;
        this.response = httpResponse;
        this.cause = th;
    }

    public final HttpRequestBuilder getRequest() {
        return this.request;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final HttpResponse getResponse() {
        return this.response;
    }

    public final Throwable getCause() {
        return this.cause;
    }
}
