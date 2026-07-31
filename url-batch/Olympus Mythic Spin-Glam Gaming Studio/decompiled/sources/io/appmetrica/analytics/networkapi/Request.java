package io.appmetrica.analytics.networkapi;

import com.android.volley.toolbox.HttpClientStack;
import com.ironsource.C4701ic;
import com.safedk.android.a.g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lio/appmetrica/analytics/networkapi/Request;", "", "", "toString", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "Lio/appmetrica/analytics/networkapi/Request$Method;", "b", "Lio/appmetrica/analytics/networkapi/Request$Method;", "getMethod", "()Lio/appmetrica/analytics/networkapi/Request$Method;", "method", "", "c", "[B", "getBody", "()[B", "body", "", "d", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "Builder", "Method", "network-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class Request {

    /* renamed from: a, reason: from kotlin metadata */
    private final String url;

    /* renamed from: b, reason: from kotlin metadata */
    private final Method method;

    /* renamed from: c, reason: from kotlin metadata */
    private final byte[] body;

    /* renamed from: d, reason: from kotlin metadata */
    private final Map headers;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\f¨\u0006\u0011"}, d2 = {"Lio/appmetrica/analytics/networkapi/Request$Builder;", "", "", "key", "value", "addHeader", "", "body", "withBody", "Lio/appmetrica/analytics/networkapi/Request$Method;", "method", "withMethod", "Lio/appmetrica/analytics/networkapi/Request;", "build", "url", "<init>", "(Ljava/lang/String;)V", "network-api_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {
        private final String a;
        private Method b = Method.GET;
        private byte[] c = new byte[0];
        private final LinkedHashMap d = new LinkedHashMap();

        public Builder(@NotNull String str) {
            this.a = str;
        }

        @NotNull
        public final Builder addHeader(@NotNull String key, @NotNull String value) {
            this.d.put(key, value);
            return this;
        }

        @NotNull
        public final Request build() {
            return new Request(this.a, this.b, this.c, MapsKt.toMap(this.d), null);
        }

        @NotNull
        public final Builder withBody(@NotNull byte[] body) {
            this.c = body;
            return this;
        }

        @NotNull
        public final Builder withMethod(@NotNull Method method) {
            this.b = method;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/appmetrica/analytics/networkapi/Request$Method;", "", "", "a", "Ljava/lang/String;", "getMethodName", "()Ljava/lang/String;", "methodName", C4701ic.a, "POST", "HEAD", g.f, "DELETE", HttpClientStack.HttpPatch.METHOD_NAME, "OPTIONS", "network-api_release"}, k = 1, mv = {1, 9, 0})
    public static final class Method {
        public static final Method DELETE;
        public static final Method GET;
        public static final Method HEAD;
        public static final Method OPTIONS;
        public static final Method PATCH;
        public static final Method POST;
        public static final Method PUT;
        private static final /* synthetic */ Method[] b;
        private static final /* synthetic */ EnumEntries c;

        /* renamed from: a, reason: from kotlin metadata */
        private final String methodName;

        static {
            Method method = new Method(C4701ic.a, 0, C4701ic.a);
            GET = method;
            Method method2 = new Method("POST", 1, "POST");
            POST = method2;
            Method method3 = new Method("HEAD", 2, "HEAD");
            HEAD = method3;
            Method method4 = new Method(g.f, 3, g.f);
            PUT = method4;
            Method method5 = new Method("DELETE", 4, "DELETE");
            DELETE = method5;
            Method method6 = new Method(HttpClientStack.HttpPatch.METHOD_NAME, 5, HttpClientStack.HttpPatch.METHOD_NAME);
            PATCH = method6;
            Method method7 = new Method("OPTIONS", 6, "OPTIONS");
            OPTIONS = method7;
            Method[] methodArr = {method, method2, method3, method4, method5, method6, method7};
            b = methodArr;
            c = EnumEntriesKt.enumEntries(methodArr);
        }

        private Method(String str, int i, String str2) {
            this.methodName = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return c;
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) b.clone();
        }

        @NotNull
        public final String getMethodName() {
            return this.methodName;
        }
    }

    public /* synthetic */ Request(String str, Method method, byte[] bArr, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, method, bArr, map);
    }

    @NotNull
    public final byte[] getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Method getMethod() {
        return this.method;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        return "Request(url='" + this.url + "', method='" + this.method + "', bodyLength=" + this.body.length + ", headers=" + this.headers + ')';
    }

    private Request(String str, Method method, byte[] bArr, Map map) {
        this.url = str;
        this.method = method;
        this.body = bArr;
        this.headers = map;
    }
}
