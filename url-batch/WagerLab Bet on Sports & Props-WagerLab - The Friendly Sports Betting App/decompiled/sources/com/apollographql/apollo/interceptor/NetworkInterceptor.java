package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.network.NetworkTransport;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: NetworkInterceptor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\b\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/apollographql/apollo/interceptor/NetworkInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "networkTransport", "Lcom/apollographql/apollo/network/NetworkTransport;", "subscriptionNetworkTransport", "<init>", "(Lcom/apollographql/apollo/network/NetworkTransport;Lcom/apollographql/apollo/network/NetworkTransport;)V", "intercept", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "chain", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkInterceptor implements ApolloInterceptor {
    private final NetworkTransport networkTransport;
    private final NetworkTransport subscriptionNetworkTransport;

    public NetworkInterceptor(NetworkTransport networkTransport, NetworkTransport subscriptionNetworkTransport) {
        Intrinsics.checkNotNullParameter(networkTransport, "networkTransport");
        Intrinsics.checkNotNullParameter(subscriptionNetworkTransport, "subscriptionNetworkTransport");
        this.networkTransport = networkTransport;
        this.subscriptionNetworkTransport = subscriptionNetworkTransport;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public <D extends Operation.Data> Flow<ApolloResponse<D>> intercept(ApolloRequest<D> request, ApolloInterceptorChain chain) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Operation<D> operation = request.getOperation();
        if (!(operation instanceof Query) && !(operation instanceof Mutation)) {
            if (operation instanceof Subscription) {
                return this.subscriptionNetworkTransport.execute(request);
            }
            throw new IllegalStateException("".toString());
        }
        return this.networkTransport.execute(request);
    }
}
