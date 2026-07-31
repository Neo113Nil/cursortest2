package com.apollographql.apollo.exception;

import com.apollographql.apollo.api.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/apollographql/apollo/exception/RouterError;", "Lcom/apollographql/apollo/exception/ApolloException;", "errors", "", "Lcom/apollographql/apollo/api/Error;", "<init>", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RouterError extends ApolloException {
    private final List<Error> errors;

    public final List<Error> getErrors() {
        return this.errors;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RouterError(List<Error> errors) {
        super(r0.append(r1 != null ? r1.getMessage() : null).append("')").toString(), null, 2, null);
        Intrinsics.checkNotNullParameter(errors, "errors");
        StringBuilder sb = new StringBuilder("Router error(s) (first: '");
        Error error = (Error) CollectionsKt.firstOrNull((List) errors);
        this.errors = errors;
    }
}
