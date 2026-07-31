package io.ktor.client.request;

import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.HttpClientEngineCapabilityKt;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: HttpRequest.kt */
/* loaded from: classes13.dex */
public final class HttpRequestData {
    private final Attributes attributes;
    private final OutgoingContent body;
    private final Job executionContext;
    private final Headers headers;
    private final HttpMethod method;
    private final Set requiredCapabilities;
    private final Url url;

    public HttpRequestData(Url url, HttpMethod method, Headers headers, OutgoingContent body, Job executionContext, Attributes attributes) {
        Set keySet;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = body;
        this.executionContext = executionContext;
        this.attributes = attributes;
        Map map = (Map) attributes.getOrNull(HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        this.requiredCapabilities = (map == null || (keySet = map.keySet()) == null) ? SetsKt.emptySet() : keySet;
    }

    public final Url getUrl() {
        return this.url;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final OutgoingContent getBody() {
        return this.body;
    }

    public final Job getExecutionContext() {
        return this.executionContext;
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final Object getCapabilityOrNull(HttpClientEngineCapability key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.attributes.getOrNull(HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public final Set getRequiredCapabilities$ktor_client_core() {
        return this.requiredCapabilities;
    }

    public String toString() {
        return "HttpRequestData(url=" + this.url + ", method=" + this.method + ')';
    }
}
