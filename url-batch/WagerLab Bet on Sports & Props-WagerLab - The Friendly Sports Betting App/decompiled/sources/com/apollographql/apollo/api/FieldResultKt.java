package com.apollographql.apollo.api;

import androidx.exifinterface.media.ExifInterface;
import com.apollographql.apollo.api.FieldResult;
import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.apollographql.apollo.exception.DefaultApolloException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FieldResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0006\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\b\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¢\u0006\u0002\u0010\t\u001a\u001e\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001b\u0010\u000f\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¢\u0006\u0002\u0010\t\"!\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0004¨\u0006\u0010"}, d2 = {"isSuccess", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/apollographql/apollo/api/FieldResult;", "(Lcom/apollographql/apollo/api/FieldResult;)Z", "getOrElse", "fallback", "(Lcom/apollographql/apollo/api/FieldResult;Ljava/lang/Object;)Ljava/lang/Object;", "getOrNull", "(Lcom/apollographql/apollo/api/FieldResult;)Ljava/lang/Object;", "exceptionOrNull", "Ljava/lang/Exception;", "Lkotlin/Exception;", "graphQLErrorOrNull", "Lcom/apollographql/apollo/api/Error;", "getOrThrow", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FieldResultKt {
    public static final <V> boolean isSuccess(FieldResult<? extends V> fieldResult) {
        Intrinsics.checkNotNullParameter(fieldResult, "<this>");
        return fieldResult instanceof FieldResult.Success;
    }

    public static final <V> V getOrElse(FieldResult<? extends V> fieldResult, V v) {
        Intrinsics.checkNotNullParameter(fieldResult, "<this>");
        return fieldResult instanceof FieldResult.Success ? (V) ((FieldResult.Success) fieldResult).getValue() : v;
    }

    public static final <V> V getOrNull(FieldResult<? extends V> fieldResult) {
        Intrinsics.checkNotNullParameter(fieldResult, "<this>");
        if (fieldResult instanceof FieldResult.Success) {
            return (V) ((FieldResult.Success) fieldResult).getValue();
        }
        return null;
    }

    public static final <V> Exception exceptionOrNull(FieldResult<? extends V> fieldResult) {
        Intrinsics.checkNotNullParameter(fieldResult, "<this>");
        if (fieldResult instanceof FieldResult.Failure) {
            return ((FieldResult.Failure) fieldResult).getException();
        }
        return null;
    }

    public static final <V> Error graphQLErrorOrNull(FieldResult<? extends V> fieldResult) {
        Intrinsics.checkNotNullParameter(fieldResult, "<this>");
        Exception exceptionOrNull = exceptionOrNull(fieldResult);
        ApolloGraphQLException apolloGraphQLException = exceptionOrNull instanceof ApolloGraphQLException ? (ApolloGraphQLException) exceptionOrNull : null;
        if (apolloGraphQLException != null) {
            return apolloGraphQLException.getError();
        }
        return null;
    }

    public static final <V> V getOrThrow(FieldResult<? extends V> fieldResult) {
        Intrinsics.checkNotNullParameter(fieldResult, "<this>");
        if (fieldResult instanceof FieldResult.Success) {
            return (V) ((FieldResult.Success) fieldResult).getValue();
        }
        if (fieldResult instanceof FieldResult.Failure) {
            throw new DefaultApolloException("Field error", ((FieldResult.Failure) fieldResult).getException());
        }
        throw new NoWhenBranchMatchedException();
    }
}
