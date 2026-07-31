package com.apollographql.apollo.exception;

import com.apollographql.apollo.api.http.HttpHeader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloHttpException;", "Lcom/apollographql/apollo/exception/ApolloException;", "statusCode", "", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "body", "Lokio/BufferedSource;", "message", "", "cause", "", "<init>", "(ILjava/util/List;Lokio/BufferedSource;Ljava/lang/String;Ljava/lang/Throwable;)V", "getStatusCode", "()I", "getHeaders", "()Ljava/util/List;", "getBody", "()Lokio/BufferedSource;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloHttpException extends ApolloException {
    private final BufferedSource body;
    private final List<HttpHeader> headers;
    private final int statusCode;

    public /* synthetic */ ApolloHttpException(int i, List list, BufferedSource bufferedSource, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, bufferedSource, str, (i2 & 16) != 0 ? null : th);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final List<HttpHeader> getHeaders() {
        return this.headers;
    }

    public final BufferedSource getBody() {
        return this.body;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloHttpException(int i, List<HttpHeader> headers, BufferedSource bufferedSource, String message, Throwable th) {
        super(message, th, null);
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(message, "message");
        this.statusCode = i;
        this.headers = headers;
        this.body = bufferedSource;
    }
}
