package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.network.NetworkMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RetryOnErrorInterceptor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\b0\u0007\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/apollographql/apollo/interceptor/DefaultRetryOnErrorInterceptorImpl;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "networkMonitor", "Lcom/apollographql/apollo/network/NetworkMonitor;", "<init>", "(Lcom/apollographql/apollo/network/NetworkMonitor;)V", "intercept", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "chain", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DefaultRetryOnErrorInterceptorImpl implements ApolloInterceptor {
    private final NetworkMonitor networkMonitor;

    public DefaultRetryOnErrorInterceptorImpl(NetworkMonitor networkMonitor) {
        this.networkMonitor = networkMonitor;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public <D extends Operation.Data> Flow<ApolloResponse<D>> intercept(ApolloRequest<D> request, ApolloInterceptorChain chain) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Boolean failFastIfOffline = request.getFailFastIfOffline();
        boolean booleanValue = failFastIfOffline != null ? failFastIfOffline.booleanValue() : false;
        Boolean retryOnError = request.getRetryOnError();
        boolean booleanValue2 = retryOnError != null ? retryOnError.booleanValue() : false;
        if (!booleanValue && !booleanValue2) {
            return chain.proceed(request);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        return FlowKt.retryWhen(FlowKt.onEach(FlowKt.flow(new DefaultRetryOnErrorInterceptorImpl$intercept$1(booleanValue, this, request, chain.proceed(request), null)), new DefaultRetryOnErrorInterceptorImpl$intercept$2(booleanValue2, intRef, null)), new DefaultRetryOnErrorInterceptorImpl$intercept$3(intRef, this, null));
    }
}
