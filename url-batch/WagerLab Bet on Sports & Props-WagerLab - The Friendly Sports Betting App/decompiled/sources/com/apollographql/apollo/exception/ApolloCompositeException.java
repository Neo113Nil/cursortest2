package com.apollographql.apollo.exception;

import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Exceptions.kt */
@Deprecated(message = "ApolloCompositeException is deprecated. Handle each ApolloResponse.exception instead.")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloCompositeException;", "Lcom/apollographql/apollo/exception/ApolloException;", "first", "", "second", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "exceptions", "", "(Ljava/util/List;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloCompositeException extends ApolloException {
    public ApolloCompositeException(Throwable th, Throwable th2) {
        super("Multiple exceptions happened", th2, null);
        if (th != null) {
            ExceptionsKt.addSuppressed(this, th);
        }
        if (th2 != null) {
            ExceptionsKt.addSuppressed(this, th2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCompositeException(List<? extends Throwable> exceptions) {
        super("Multiple exceptions happened", (Throwable) CollectionsKt.lastOrNull((List) exceptions), null);
        Intrinsics.checkNotNullParameter(exceptions, "exceptions");
        Iterator<T> it = exceptions.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(this, (Throwable) it.next());
        }
    }
}
