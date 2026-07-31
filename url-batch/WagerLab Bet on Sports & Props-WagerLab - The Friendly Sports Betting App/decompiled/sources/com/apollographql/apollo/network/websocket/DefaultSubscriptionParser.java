package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import com.apollographql.apollo.api.Operations;
import com.apollographql.apollo.api.json.JsonReaders;
import com.apollographql.apollo.exception.DefaultApolloException;
import com.apollographql.apollo.internal.DeferredJsonMerger;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSocketNetworkTransport.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0018\u00010\u000fj\u0002`\u0010H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/apollographql/apollo/network/websocket/DefaultSubscriptionParser;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/network/websocket/SubscriptionParser;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "<init>", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "deferredJsonMerger", "Lcom/apollographql/apollo/internal/DeferredJsonMerger;", "requestCustomScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "parse", "Lcom/apollographql/apollo/api/ApolloResponse;", "response", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DefaultSubscriptionParser<D extends Operation.Data> implements SubscriptionParser<D> {
    private DeferredJsonMerger deferredJsonMerger;
    private final ApolloRequest<D> request;
    private final CustomScalarAdapters requestCustomScalarAdapters;

    public DefaultSubscriptionParser(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.deferredJsonMerger = new DeferredJsonMerger();
        CustomScalarAdapters customScalarAdapters = (CustomScalarAdapters) request.getExecutionContext().get(CustomScalarAdapters.INSTANCE);
        this.requestCustomScalarAdapters = customScalarAdapters == null ? CustomScalarAdapters.Empty : customScalarAdapters;
    }

    @Override // com.apollographql.apollo.network.websocket.SubscriptionParser
    public ApolloResponse<D> parse(Object response) {
        boolean isDeferred;
        Pair pair;
        Map<String, ? extends Object> map = response instanceof Map ? (Map) response : null;
        if (map != null) {
            isDeferred = WebSocketNetworkTransportKt.isDeferred(map);
            if (isDeferred) {
                pair = TuplesKt.to(this.deferredJsonMerger.merge(map), this.deferredJsonMerger.getMergedFragmentIds());
            } else {
                pair = TuplesKt.to(map, null);
            }
            ApolloResponse<D> apolloResponse = Operations.toApolloResponse(JsonReaders.jsonReader((Map<String, ? extends Object>) pair.component1()), this.request.getOperation(), this.request.getRequestUuid(), this.requestCustomScalarAdapters, (Set) pair.component2());
            if (!this.deferredJsonMerger.getHasNext()) {
                this.deferredJsonMerger.reset();
            }
            if (this.deferredJsonMerger.getIsEmptyPayload()) {
                return null;
            }
            return apolloResponse;
        }
        return new ApolloResponse.Builder(this.request.getOperation(), this.request.getRequestUuid()).exception(new DefaultApolloException("Invalid payload", null, 2, null)).build();
    }
}
