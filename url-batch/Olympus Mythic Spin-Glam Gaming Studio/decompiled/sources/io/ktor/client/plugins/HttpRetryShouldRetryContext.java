package io.ktor.client.plugins;

/* compiled from: HttpRequestRetry.kt */
/* loaded from: classes14.dex */
public final class HttpRetryShouldRetryContext {
    private final int retryCount;

    public HttpRetryShouldRetryContext(int i) {
        this.retryCount = i;
    }
}
