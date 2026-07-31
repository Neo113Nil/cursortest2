package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeadersInterceptor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/apollographql/apollo/network/http/HeadersInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "<init>", "(Ljava/util/List;)V", "intercept", "Lcom/apollographql/apollo/api/http/HttpResponse;", "request", "Lcom/apollographql/apollo/api/http/HttpRequest;", "chain", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeadersInterceptor implements HttpInterceptor {
    private final List<HttpHeader> headers;

    public HeadersInterceptor(List<HttpHeader> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.headers = headers;
    }

    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    public Object intercept(HttpRequest httpRequest, HttpInterceptorChain httpInterceptorChain, Continuation<? super HttpResponse> continuation) {
        return httpInterceptorChain.proceed(HttpRequest.newBuilder$default(httpRequest, null, null, 3, null).addHeaders(this.headers).build(), continuation);
    }
}
