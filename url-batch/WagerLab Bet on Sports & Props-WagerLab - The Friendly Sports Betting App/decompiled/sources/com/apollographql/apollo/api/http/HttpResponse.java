package com.apollographql.apollo.api.http;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: Http.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B3\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpResponse;", "", "statusCode", "", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "bodySource", "Lokio/BufferedSource;", "bodyString", "Lokio/ByteString;", "<init>", "(ILjava/util/List;Lokio/BufferedSource;Lokio/ByteString;)V", "getStatusCode", "()I", "getHeaders", "()Ljava/util/List;", "body", "getBody", "()Lokio/BufferedSource;", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcom/apollographql/apollo/api/http/HttpResponse$Builder;", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpResponse {
    private final BufferedSource bodySource;
    private final ByteString bodyString;
    private final List<HttpHeader> headers;
    private final int statusCode;

    public /* synthetic */ HttpResponse(int i, List list, BufferedSource bufferedSource, ByteString byteString, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, bufferedSource, byteString);
    }

    private HttpResponse(int i, List<HttpHeader> list, BufferedSource bufferedSource, ByteString byteString) {
        this.statusCode = i;
        this.headers = list;
        this.bodySource = bufferedSource;
        this.bodyString = byteString;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final List<HttpHeader> getHeaders() {
        return this.headers;
    }

    public final BufferedSource getBody() {
        BufferedSource bufferedSource = this.bodySource;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        ByteString byteString = this.bodyString;
        return byteString != null ? new Buffer().write(byteString) : null;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder(this.statusCode);
        BufferedSource bufferedSource = this.bodySource;
        if (bufferedSource != null) {
            builder.body(bufferedSource);
        }
        ByteString byteString = this.bodyString;
        if (byteString != null) {
            builder.body(byteString);
        }
        builder.addHeaders(this.headers);
        return builder;
    }

    /* compiled from: Http.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0016\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0014\u0010\u0018\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019J\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019J\u0006\u0010\u001a\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpResponse$Builder;", "", "statusCode", "", "<init>", "(I)V", "getStatusCode", "()I", "bodySource", "Lokio/BufferedSource;", "bodyString", "Lokio/ByteString;", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "hasBody", "", "getHasBody", "()Z", "body", "addHeader", "name", "", "value", "addHeaders", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/apollographql/apollo/api/http/HttpResponse;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private BufferedSource bodySource;
        private ByteString bodyString;
        private final List<HttpHeader> headers = new ArrayList();
        private final int statusCode;

        public Builder(int i) {
            this.statusCode = i;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        private final boolean getHasBody() {
            return (this.bodySource == null && this.bodyString == null) ? false : true;
        }

        public final Builder body(BufferedSource bodySource) {
            Intrinsics.checkNotNullParameter(bodySource, "bodySource");
            if (getHasBody()) {
                throw new IllegalStateException("body() can only be called once".toString());
            }
            this.bodySource = bodySource;
            return this;
        }

        @Deprecated(message = "Use body(BufferedSource) instead", replaceWith = @ReplaceWith(expression = "Buffer().write(bodyString)", imports = {"okio.Buffer"}))
        public final Builder body(ByteString bodyString) {
            Intrinsics.checkNotNullParameter(bodyString, "bodyString");
            if (getHasBody()) {
                throw new IllegalStateException("body() can only be called once".toString());
            }
            this.bodyString = bodyString;
            return this;
        }

        public final Builder addHeader(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.add(new HttpHeader(name, value));
            return this;
        }

        public final Builder addHeaders(List<HttpHeader> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers.addAll(headers);
            return this;
        }

        public final Builder headers(List<HttpHeader> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers.clear();
            this.headers.addAll(headers);
            return this;
        }

        public final HttpResponse build() {
            return new HttpResponse(this.statusCode, this.headers, this.bodySource, this.bodyString, null);
        }
    }
}
