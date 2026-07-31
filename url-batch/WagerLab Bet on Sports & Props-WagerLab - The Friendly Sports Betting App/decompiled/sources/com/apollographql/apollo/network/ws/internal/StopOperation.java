package com.apollographql.apollo.network.ws.internal;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WsMessage.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/StopOperation;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/network/ws/internal/Command;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "<init>", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "getRequest", "()Lcom/apollographql/apollo/api/ApolloRequest;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StopOperation<D extends Operation.Data> implements Command {
    private final ApolloRequest<D> request;

    public StopOperation(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
    }

    public final ApolloRequest<D> getRequest() {
        return this.request;
    }
}
