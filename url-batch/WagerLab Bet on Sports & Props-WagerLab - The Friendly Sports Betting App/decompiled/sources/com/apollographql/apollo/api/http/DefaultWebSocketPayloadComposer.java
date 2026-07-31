package com.apollographql.apollo.api.http;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultWebSocketPayloadComposer.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/apollographql/apollo/api/http/DefaultWebSocketPayloadComposer;", "Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;", "<init>", "()V", "compose", "", "", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "apolloRequest", "Lcom/apollographql/apollo/api/ApolloRequest;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultWebSocketPayloadComposer implements WebSocketPayloadComposer {
    @Override // com.apollographql.apollo.api.http.WebSocketPayloadComposer
    public <D extends Operation.Data> Map<String, Object> compose(ApolloRequest<D> apolloRequest) {
        Intrinsics.checkNotNullParameter(apolloRequest, "apolloRequest");
        return DefaultHttpRequestComposer.INSTANCE.composePayload(apolloRequest);
    }
}
