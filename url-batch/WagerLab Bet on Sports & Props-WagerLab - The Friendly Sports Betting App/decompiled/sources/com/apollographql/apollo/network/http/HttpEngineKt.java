package com.apollographql.apollo.network.http;

import com.amazon.a.a.o.b;
import com.apollographql.apollo.api.http.HttpMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpEngine.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {b.au, "Lcom/apollographql/apollo/network/http/HttpCall;", "Lcom/apollographql/apollo/network/http/HttpEngine;", "url", "", "post", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpEngineKt {
    public static final HttpCall get(HttpEngine httpEngine, String url) {
        Intrinsics.checkNotNullParameter(httpEngine, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        return new HttpCall(httpEngine, HttpMethod.Get, url);
    }

    public static final HttpCall post(HttpEngine httpEngine, String url) {
        Intrinsics.checkNotNullParameter(httpEngine, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        return new HttpCall(httpEngine, HttpMethod.Post, url);
    }
}
