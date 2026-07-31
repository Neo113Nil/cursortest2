package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import kotlin.Metadata;

/* compiled from: SubscriptionParser.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0018\u00010\u0003j\u0002`\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/websocket/SubscriptionParser;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "", "parse", "Lcom/apollographql/apollo/api/ApolloResponse;", "response", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SubscriptionParser<D extends Operation.Data> {
    ApolloResponse<D> parse(Object response);
}
