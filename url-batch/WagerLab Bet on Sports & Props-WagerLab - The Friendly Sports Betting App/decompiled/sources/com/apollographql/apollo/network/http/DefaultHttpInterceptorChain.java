package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpInterceptor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/apollographql/apollo/network/http/DefaultHttpInterceptorChain;", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "interceptors", "", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", FirebaseAnalytics.Param.INDEX, "", "<init>", "(Ljava/util/List;I)V", "proceed", "Lcom/apollographql/apollo/api/http/HttpResponse;", "request", "Lcom/apollographql/apollo/api/http/HttpRequest;", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultHttpInterceptorChain implements HttpInterceptorChain {
    private final int index;
    private final List<HttpInterceptor> interceptors;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultHttpInterceptorChain(List<? extends HttpInterceptor> interceptors, int i) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.interceptors = interceptors;
        this.index = i;
    }

    @Override // com.apollographql.apollo.network.http.HttpInterceptorChain
    public Object proceed(HttpRequest httpRequest, Continuation<? super HttpResponse> continuation) {
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return this.interceptors.get(this.index).intercept(httpRequest, new DefaultHttpInterceptorChain(this.interceptors, this.index + 1), continuation);
    }
}
