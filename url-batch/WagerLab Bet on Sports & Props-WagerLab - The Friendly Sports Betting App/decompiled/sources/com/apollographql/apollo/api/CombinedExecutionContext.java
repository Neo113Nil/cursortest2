package com.apollographql.apollo.api;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.a.a.o.b;
import com.apollographql.apollo.api.ExecutionContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExecutionContext.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0096\u0002¢\u0006\u0002\u0010\u000bJ5\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u0002H\r2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\r0\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/apollographql/apollo/api/CombinedExecutionContext;", "Lcom/apollographql/apollo/api/ExecutionContext;", "left", "element", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "<init>", "(Lcom/apollographql/apollo/api/ExecutionContext;Lcom/apollographql/apollo/api/ExecutionContext$Element;)V", b.au, ExifInterface.LONGITUDE_EAST, "key", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CombinedExecutionContext implements ExecutionContext {
    private final ExecutionContext.Element element;
    private final ExecutionContext left;

    public CombinedExecutionContext(ExecutionContext left, ExecutionContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.left = left;
        this.element = element;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public <E extends ExecutionContext.Element> E get(ExecutionContext.Key<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CombinedExecutionContext combinedExecutionContext = this;
        while (true) {
            E e = (E) combinedExecutionContext.element.get(key);
            if (e != null) {
                return e;
            }
            ExecutionContext executionContext = combinedExecutionContext.left;
            if (executionContext instanceof CombinedExecutionContext) {
                combinedExecutionContext = (CombinedExecutionContext) executionContext;
            } else {
                return (E) executionContext.get(key);
            }
        }
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public <R> R fold(R initial, Function2<? super R, ? super ExecutionContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke((Object) this.left.fold(initial, operation), this.element);
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public ExecutionContext minusKey(ExecutionContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        ExecutionContext minusKey = this.left.minusKey(key);
        return minusKey == this.left ? this : minusKey == EmptyExecutionContext.INSTANCE ? this.element : new CombinedExecutionContext(minusKey, this.element);
    }
}
