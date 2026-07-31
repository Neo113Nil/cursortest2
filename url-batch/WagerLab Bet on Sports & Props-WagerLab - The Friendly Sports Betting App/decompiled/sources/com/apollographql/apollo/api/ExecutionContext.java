package com.apollographql.apollo.api;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.a.a.o.b;
import com.apollographql.apollo.api.ExecutionContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExecutionContext.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u00132\u00020\u0001:\u0003\u0011\u0012\u0013J(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H¦\u0002¢\u0006\u0002\u0010\u0007J5\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002J\u0014\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext;", "", b.au, ExifInterface.LONGITUDE_EAST, "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "key", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "plus", "context", "minusKey", "Key", "Element", "Companion", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ExecutionContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final ExecutionContext Empty = EmptyExecutionContext.INSTANCE;

    /* compiled from: ExecutionContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext$Key;", ExifInterface.LONGITUDE_EAST, "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Key<E extends Element> {
    }

    <R> R fold(R initial, Function2<? super R, ? super Element, ? extends R> operation);

    <E extends Element> E get(Key<E> key);

    ExecutionContext minusKey(Key<?> key);

    default ExecutionContext plus(ExecutionContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == EmptyExecutionContext.INSTANCE ? this : (ExecutionContext) context.fold(this, new Function2() { // from class: com.apollographql.apollo.api.ExecutionContext$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ExecutionContext plus$lambda$0;
                plus$lambda$0 = ExecutionContext.plus$lambda$0((ExecutionContext) obj, (ExecutionContext.Element) obj2);
                return plus$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    static ExecutionContext plus$lambda$0(ExecutionContext acc, Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        ExecutionContext minusKey = acc.minusKey(element.getKey());
        return minusKey == EmptyExecutionContext.INSTANCE ? element : new CombinedExecutionContext(minusKey, element);
    }

    /* compiled from: ExecutionContext.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\b\b\u0000\u0010\u0007*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0003H\u0096\u0002¢\u0006\u0002\u0010\bJ5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Lcom/apollographql/apollo/api/ExecutionContext;", "key", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", b.au, ExifInterface.LONGITUDE_EAST, "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Element extends ExecutionContext {
        Key<?> getKey();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.apollographql.apollo.api.ExecutionContext
        default <E extends Element> E get(Key<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!Intrinsics.areEqual(getKey(), key)) {
                return null;
            }
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type E of com.apollographql.apollo.api.ExecutionContext.Element.get");
            return this;
        }

        @Override // com.apollographql.apollo.api.ExecutionContext
        default <R> R fold(R initial, Function2<? super R, ? super Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.invoke(initial, this);
        }

        @Override // com.apollographql.apollo.api.ExecutionContext
        default ExecutionContext minusKey(Key<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return Intrinsics.areEqual(getKey(), key) ? EmptyExecutionContext.INSTANCE : this;
        }
    }

    /* compiled from: ExecutionContext.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext$Companion;", "", "<init>", "()V", "Empty", "Lcom/apollographql/apollo/api/ExecutionContext;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
