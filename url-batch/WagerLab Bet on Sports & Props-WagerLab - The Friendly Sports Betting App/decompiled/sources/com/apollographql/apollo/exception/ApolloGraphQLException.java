package com.apollographql.apollo.exception;

import com.apollographql.apollo.api.Error;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloGraphQLException;", "Lcom/apollographql/apollo/exception/ApolloException;", "error", "Lcom/apollographql/apollo/api/Error;", "<init>", "(Lcom/apollographql/apollo/api/Error;)V", "errors", "", "(Ljava/util/List;)V", "getError", "()Lcom/apollographql/apollo/api/Error;", "getErrors$annotations", "()V", "getErrors", "()Ljava/util/List;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloGraphQLException extends ApolloException {
    private final Error error;
    private final List<Error> errors;

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use error instead")
    public static /* synthetic */ void getErrors$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloGraphQLException(Error error) {
        super("GraphQL error: '" + error.getMessage() + '\'', null, 2, null);
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
        this.errors = CollectionsKt.listOf(error);
    }

    public final Error getError() {
        return this.error;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApolloGraphQLException(List<Error> errors) {
        this((Error) CollectionsKt.first((List) errors));
        Intrinsics.checkNotNullParameter(errors, "errors");
    }

    public final List<Error> getErrors() {
        return this.errors;
    }
}
