package com.apollographql.apollo.network.websocket.internal;

import com.apollographql.apollo.exception.ApolloException;
import kotlin.Metadata;

/* compiled from: OperationListener.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0018\u00010\u0001j\u0002`\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0018\u00010\u0001j\u0002`\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/websocket/internal/OperationListener;", "", "onResponse", "", "response", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "onComplete", "onError", "payload", "onTransportError", "cause", "Lcom/apollographql/apollo/exception/ApolloException;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OperationListener {
    void onComplete();

    void onError(Object payload);

    void onResponse(Object response);

    void onTransportError(ApolloException cause);
}
