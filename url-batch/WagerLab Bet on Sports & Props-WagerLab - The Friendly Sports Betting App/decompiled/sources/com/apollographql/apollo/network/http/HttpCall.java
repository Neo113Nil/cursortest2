package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.ExecutionContext;
import com.apollographql.apollo.api.http.HttpBody;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpEngine.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpCall;", "", "engine", "Lcom/apollographql/apollo/network/http/HttpEngine;", FirebaseAnalytics.Param.METHOD, "Lcom/apollographql/apollo/api/http/HttpMethod;", "url", "", "<init>", "(Lcom/apollographql/apollo/network/http/HttpEngine;Lcom/apollographql/apollo/api/http/HttpMethod;Ljava/lang/String;)V", "requestBuilder", "Lcom/apollographql/apollo/api/http/HttpRequest$Builder;", "body", "Lcom/apollographql/apollo/api/http/HttpBody;", "addHeader", "name", "value", "addHeaders", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "addExecutionContext", "executionContext", "Lcom/apollographql/apollo/api/ExecutionContext;", "execute", "Lcom/apollographql/apollo/api/http/HttpResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpCall {
    private final HttpEngine engine;
    private final HttpRequest.Builder requestBuilder;

    public HttpCall(HttpEngine engine, HttpMethod method, String url) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        this.engine = engine;
        this.requestBuilder = new HttpRequest.Builder(method, url);
    }

    public final HttpCall body(HttpBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.requestBuilder.body(body);
        return this;
    }

    public final HttpCall addHeader(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.requestBuilder.addHeader(name, value);
        return this;
    }

    public final HttpCall addHeaders(List<HttpHeader> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.requestBuilder.addHeaders(headers);
        return this;
    }

    public final HttpCall addExecutionContext(ExecutionContext executionContext) {
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        this.requestBuilder.addExecutionContext(executionContext);
        return this;
    }

    public final HttpCall headers(List<HttpHeader> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.requestBuilder.headers(headers);
        return this;
    }

    public final Object execute(Continuation<? super HttpResponse> continuation) {
        return this.engine.execute(this.requestBuilder.build(), continuation);
    }
}
