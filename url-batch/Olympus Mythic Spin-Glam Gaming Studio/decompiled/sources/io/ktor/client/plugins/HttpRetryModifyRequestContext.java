package io.ktor.client.plugins;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpRequestRetry.kt */
/* loaded from: classes6.dex */
public final class HttpRetryModifyRequestContext {
    private final Throwable cause;
    private final HttpRequestBuilder request;
    private final HttpResponse response;
    private final int retryCount;

    public HttpRetryModifyRequestContext(HttpRequestBuilder request, HttpResponse httpResponse, Throwable th, int i) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.response = httpResponse;
        this.cause = th;
        this.retryCount = i;
    }

    public final HttpRequestBuilder getRequest() {
        return this.request;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }
}
