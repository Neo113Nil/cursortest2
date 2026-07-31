package io.ktor.client.plugins.sse;

import io.ktor.client.engine.HttpClientEngineCapability;

/* compiled from: SSE.kt */
/* loaded from: classes4.dex */
public final class SSECapability implements HttpClientEngineCapability {
    public static final SSECapability INSTANCE = new SSECapability();

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof SSECapability);
    }

    public int hashCode() {
        return -177755299;
    }

    public String toString() {
        return "SSECapability";
    }

    private SSECapability() {
    }
}
