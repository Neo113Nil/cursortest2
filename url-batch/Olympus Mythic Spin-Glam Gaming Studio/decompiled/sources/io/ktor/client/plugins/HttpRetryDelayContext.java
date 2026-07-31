package io.ktor.client.plugins;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpRequestRetry.kt */
/* loaded from: classes15.dex */
public final class HttpRetryDelayContext {
    private final Throwable cause;
    private final HttpRequestBuilder request;
    private final HttpResponse response;

    public HttpRetryDelayContext(HttpRequestBuilder request, HttpResponse httpResponse, Throwable th) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.response = httpResponse;
        this.cause = th;
    }

    public final HttpResponse getResponse() {
        return this.response;
    }
}
