package com.apollographql.apollo.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/apollographql/apollo/exception/SubscriptionOperationException;", "Lcom/apollographql/apollo/exception/ApolloException;", "operationName", "", "payload", "", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getPayload", "()Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionOperationException extends ApolloException {
    private final Object payload;

    public final Object getPayload() {
        return this.payload;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionOperationException(String operationName, Object obj) {
        super("Operation error " + operationName, null, 2, null);
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        this.payload = obj;
    }
}
