package com.apollographql.apollo.exception;

import kotlin.Metadata;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/exception/SubscriptionConnectionException;", "Lcom/apollographql/apollo/exception/ApolloException;", "payload", "", "<init>", "(Ljava/lang/Object;)V", "getPayload", "()Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionConnectionException extends ApolloException {
    private final Object payload;

    public final Object getPayload() {
        return this.payload;
    }

    public SubscriptionConnectionException(Object obj) {
        super("Subscription connection error", null, 2, null);
        this.payload = obj;
    }
}
