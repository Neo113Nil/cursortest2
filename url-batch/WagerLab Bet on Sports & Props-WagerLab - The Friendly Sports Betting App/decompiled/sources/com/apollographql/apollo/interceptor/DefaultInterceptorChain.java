package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ApolloInterceptor.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000b0\n\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/apollographql/apollo/interceptor/DefaultInterceptorChain;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "interceptors", "", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", FirebaseAnalytics.Param.INDEX, "", "<init>", "(Ljava/util/List;I)V", "proceed", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultInterceptorChain implements ApolloInterceptorChain {
    private final int index;
    private final List<ApolloInterceptor> interceptors;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultInterceptorChain(List<? extends ApolloInterceptor> interceptors, int i) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.interceptors = interceptors;
        this.index = i;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptorChain
    public <D extends Operation.Data> Flow<ApolloResponse<D>> proceed(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return this.interceptors.get(this.index).intercept(request, new DefaultInterceptorChain(this.interceptors, this.index + 1));
    }
}
