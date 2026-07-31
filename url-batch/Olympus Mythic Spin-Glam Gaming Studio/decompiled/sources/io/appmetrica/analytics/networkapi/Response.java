package io.appmetrica.analytics.networkapi;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001-J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010,\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lio/appmetrica/analytics/networkapi/Response;", "", "", "toString", "", "a", "Z", "isCompleted", "()Z", "", "b", "I", "getCode", "()I", "code", "", "c", "[B", "getResponseData", "()[B", "responseData", "", "", "d", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", TelemetryCategory.EXCEPTION, InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "Lio/appmetrica/analytics/networkapi/NetworkCallMetrics;", "g", "Lio/appmetrica/analytics/networkapi/NetworkCallMetrics;", "getMetrics", "()Lio/appmetrica/analytics/networkapi/NetworkCallMetrics;", "metrics", "Builder", "network-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Response {

    /* renamed from: a, reason: from kotlin metadata */
    private final boolean isCompleted;

    /* renamed from: b, reason: from kotlin metadata */
    private final int code;

    /* renamed from: c, reason: from kotlin metadata */
    private final byte[] responseData;

    /* renamed from: d, reason: from kotlin metadata */
    private final Map headers;

    /* renamed from: e, reason: from kotlin metadata */
    private final Throwable exception;

    /* renamed from: f, reason: from kotlin metadata */
    private final String url;

    /* renamed from: g, reason: from kotlin metadata */
    private final NetworkCallMetrics metrics;

    public /* synthetic */ Response(boolean z, int i, byte[] bArr, Map map, Throwable th, String str, NetworkCallMetrics networkCallMetrics, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, bArr, map, th, str, networkCallMetrics);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final Throwable getException() {
        return this.exception;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final NetworkCallMetrics getMetrics() {
        return this.metrics;
    }

    @NotNull
    public final byte[] getResponseData() {
        return this.responseData;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: isCompleted, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    @NotNull
    public String toString() {
        return "Response(isCompleted=" + this.isCompleted + ", code=" + this.code + ", responseDataLength=" + this.responseData.length + ", headers=" + this.headers + ", exception=" + this.exception + ", url=" + this.url + ", metrics=" + this.metrics + ')';
    }

    private Response(boolean z, int i, byte[] bArr, Map map, Throwable th, String str, NetworkCallMetrics networkCallMetrics) {
        this.isCompleted = z;
        this.code = i;
        this.responseData = bArr;
        this.headers = map;
        this.exception = th;
        this.url = str;
        this.metrics = networkCallMetrics;
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B!\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0010\u0010\u0018J \u0010\u0006\u001a\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\f¨\u0006\u0019"}, d2 = {"Lio/appmetrica/analytics/networkapi/Response$Builder;", "", "", "", "", "headers", "withHeaders", "url", "withUrl", "Lio/appmetrica/analytics/networkapi/NetworkCallMetrics;", "metrics", "withMetrics", "Lio/appmetrica/analytics/networkapi/Response;", "build", "", TelemetryCategory.EXCEPTION, "<init>", "(Ljava/lang/Throwable;)V", "", "isCompleted", "", "code", "", "responseData", "(ZI[B)V", "network-api_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {
        private final boolean a;
        private final int b;
        private final byte[] c;
        private final Throwable d;
        private Map e;
        private String f;
        private NetworkCallMetrics g;

        private Builder(boolean z, int i, byte[] bArr, Throwable th) {
            this.a = z;
            this.b = i;
            this.c = bArr;
            this.d = th;
            this.e = MapsKt.emptyMap();
        }

        @NotNull
        public final Response build() {
            return new Response(this.a, this.b, this.c, this.e, this.d, this.f, this.g, null);
        }

        @NotNull
        public final Builder withHeaders(@NotNull Map<String, ? extends List<String>> headers) {
            this.e = MapsKt.toMap(headers);
            return this;
        }

        @NotNull
        public final Builder withMetrics(@Nullable NetworkCallMetrics metrics) {
            this.g = metrics;
            return this;
        }

        @NotNull
        public final Builder withUrl(@NotNull String url) {
            this.f = url;
            return this;
        }

        public Builder(@Nullable Throwable th) {
            this(false, 0, new byte[0], th);
        }

        public Builder(boolean z, int i, @NotNull byte[] bArr) {
            this(z, i, bArr, null);
        }
    }
}
