package com.apollographql.apollo.api;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.a.a.o.b;
import com.apollographql.apollo.api.ExecutionContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExecutionContext.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH\u0096\u0002¢\u0006\u0002\u0010\tJ5\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u0002H\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0002J\u0014\u0010\u0012\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0013"}, d2 = {"Lcom/apollographql/apollo/api/EmptyExecutionContext;", "Lcom/apollographql/apollo/api/ExecutionContext;", "<init>", "()V", b.au, ExifInterface.LONGITUDE_EAST, "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "key", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "plus", "context", "minusKey", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyExecutionContext implements ExecutionContext {
    public static final EmptyExecutionContext INSTANCE = new EmptyExecutionContext();

    @Override // com.apollographql.apollo.api.ExecutionContext
    public <R> R fold(R initial, Function2<? super R, ? super ExecutionContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return initial;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public <E extends ExecutionContext.Element> E get(ExecutionContext.Key<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public ExecutionContext plus(ExecutionContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context;
    }

    private EmptyExecutionContext() {
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public ExecutionContext minusKey(ExecutionContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this;
    }
}
