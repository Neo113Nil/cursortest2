package io.ktor.client.plugins;

import io.ktor.client.engine.HttpClientEngineCapability;

/* compiled from: HttpTimeout.kt */
/* loaded from: classes4.dex */
public final class HttpTimeoutCapability implements HttpClientEngineCapability {
    public static final HttpTimeoutCapability INSTANCE = new HttpTimeoutCapability();

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof HttpTimeoutCapability);
    }

    public int hashCode() {
        return 2058496954;
    }

    public String toString() {
        return "HttpTimeoutCapability";
    }

    private HttpTimeoutCapability() {
    }
}
