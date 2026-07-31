package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.ExecutionContext;
import com.apollographql.apollo.api.http.HttpHeader;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpExecutionContext.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\rR\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpInfo;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "startMillis", "", "endMillis", "statusCode", "", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "<init>", "(JJILjava/util/List;)V", "getStartMillis", "()J", "getEndMillis", "getStatusCode", "()I", "getHeaders", "()Ljava/util/List;", "millisStart", "getMillisStart$annotations", "()V", "getMillisStart", "millisEnd", "getMillisEnd$annotations", "getMillisEnd", "key", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Key", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpInfo implements ExecutionContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long endMillis;
    private final List<HttpHeader> headers;
    private final long startMillis;
    private final int statusCode;

    @Deprecated(message = "Use endMillis instead", replaceWith = @ReplaceWith(expression = "endMillis", imports = {}))
    public static /* synthetic */ void getMillisEnd$annotations() {
    }

    @Deprecated(message = "Use startMillis instead", replaceWith = @ReplaceWith(expression = "startMillis", imports = {}))
    public static /* synthetic */ void getMillisStart$annotations() {
    }

    @Deprecated(message = "HttpInfo is only to be constructed internally. Declare your own class if needed")
    public HttpInfo(long j, long j2, int i, List<HttpHeader> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.startMillis = j;
        this.endMillis = j2;
        this.statusCode = i;
        this.headers = headers;
    }

    public final long getStartMillis() {
        return this.startMillis;
    }

    public final long getEndMillis() {
        return this.endMillis;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final List<HttpHeader> getHeaders() {
        return this.headers;
    }

    /* renamed from: getMillisStart, reason: from getter */
    public final long getStartMillis() {
        return this.startMillis;
    }

    public final long getMillisEnd() {
        return this.endMillis;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public ExecutionContext.Key<?> getKey() {
        return INSTANCE;
    }

    /* compiled from: HttpExecutionContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpInfo$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/network/http/HttpInfo;", "<init>", "()V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.network.http.HttpInfo$Key, reason: from kotlin metadata */
    public static final class Companion implements ExecutionContext.Key<HttpInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
