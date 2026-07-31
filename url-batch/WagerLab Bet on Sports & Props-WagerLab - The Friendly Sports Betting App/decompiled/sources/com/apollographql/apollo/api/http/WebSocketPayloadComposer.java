package com.apollographql.apollo.api.http;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: WebSocketPayloadComposer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;", "", "compose", "", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "apolloRequest", "Lcom/apollographql/apollo/api/ApolloRequest;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WebSocketPayloadComposer {
    <D extends Operation.Data> Map<String, Object> compose(ApolloRequest<D> apolloRequest);
}
