package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientAwarenessInterceptor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/apollographql/apollo/network/http/ApolloClientAwarenessInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "clientName", "", "clientVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "extraHeaders", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "intercept", "Lcom/apollographql/apollo/api/http/HttpResponse;", "request", "Lcom/apollographql/apollo/api/http/HttpRequest;", "chain", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloClientAwarenessInterceptor implements HttpInterceptor {
    private final List<HttpHeader> extraHeaders;

    public ApolloClientAwarenessInterceptor(String clientName, String clientVersion) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(clientVersion, "clientVersion");
        this.extraHeaders = CollectionsKt.listOf((Object[]) new HttpHeader[]{new HttpHeader("apollographql-client-name", clientName), new HttpHeader("apollographql-client-version", clientVersion)});
    }

    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    public Object intercept(HttpRequest httpRequest, HttpInterceptorChain httpInterceptorChain, Continuation<? super HttpResponse> continuation) {
        return httpInterceptorChain.proceed(HttpRequest.newBuilder$default(httpRequest, null, null, 3, null).addHeaders(this.extraHeaders).build(), continuation);
    }
}
