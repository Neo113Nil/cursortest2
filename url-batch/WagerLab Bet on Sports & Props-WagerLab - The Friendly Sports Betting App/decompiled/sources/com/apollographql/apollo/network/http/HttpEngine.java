package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse;
import com.apollographql.apollo.exception.ApolloNetworkException;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;

/* compiled from: HttpEngine.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0017J\b\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpEngine;", "Ljava/io/Closeable;", "Lokio/Closeable;", "execute", "Lcom/apollographql/apollo/api/http/HttpResponse;", "request", "Lcom/apollographql/apollo/api/http/HttpRequest;", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "", "close", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HttpEngine extends Closeable {
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use close", replaceWith = @ReplaceWith(expression = "close()", imports = {}))
    default void dispose() {
    }

    Object execute(HttpRequest httpRequest, Continuation<? super HttpResponse> continuation) throws ApolloNetworkException, CancellationException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        dispose();
    }
}
