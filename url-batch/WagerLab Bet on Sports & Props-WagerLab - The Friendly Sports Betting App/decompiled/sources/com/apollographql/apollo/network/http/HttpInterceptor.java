package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: HttpInterceptor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpInterceptor;", "", "intercept", "Lcom/apollographql/apollo/api/http/HttpResponse;", "request", "Lcom/apollographql/apollo/api/http/HttpRequest;", "chain", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HttpInterceptor {
    default void dispose() {
    }

    Object intercept(HttpRequest httpRequest, HttpInterceptorChain httpInterceptorChain, Continuation<? super HttpResponse> continuation) throws Throwable;
}
