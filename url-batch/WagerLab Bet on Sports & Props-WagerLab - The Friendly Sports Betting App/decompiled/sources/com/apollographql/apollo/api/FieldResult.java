package com.apollographql.apollo.api;

import androidx.exifinterface.media.ExifInterface;
import com.apollographql.apollo.exception.ApolloException;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FieldResult.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/FieldResult;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Success", "Failure", "Lcom/apollographql/apollo/api/FieldResult$Failure;", "Lcom/apollographql/apollo/api/FieldResult$Success;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FieldResult<V> {

    /* compiled from: FieldResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/apollographql/apollo/api/FieldResult$Success;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/apollographql/apollo/api/FieldResult;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success<V> implements FieldResult<V> {
        private final V value;

        public Success(V v) {
            this.value = v;
        }

        public final V getValue() {
            return this.value;
        }
    }

    /* compiled from: FieldResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/apollographql/apollo/api/FieldResult$Failure;", "Lcom/apollographql/apollo/api/FieldResult;", "", NotificationsService.EXCEPTION_KEY, "Lcom/apollographql/apollo/exception/ApolloException;", "<init>", "(Lcom/apollographql/apollo/exception/ApolloException;)V", "getException", "()Lcom/apollographql/apollo/exception/ApolloException;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Failure implements FieldResult {
        private final ApolloException exception;

        public Failure(ApolloException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public final ApolloException getException() {
            return this.exception;
        }
    }
}
