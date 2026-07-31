package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContinuationInterceptor.kt */
/* loaded from: classes11.dex */
public interface ContinuationInterceptor extends CoroutineContext.Element {
    public static final Key Key = Key.$$INSTANCE;

    Continuation interceptContinuation(Continuation continuation);

    void releaseInterceptedContinuation(Continuation continuation);

    /* compiled from: ContinuationInterceptor.kt */
    public static final class Key implements CoroutineContext.Key {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    public static final class DefaultImpls {
        public static CoroutineContext.Element get(ContinuationInterceptor continuationInterceptor, CoroutineContext.Key key) {
            CoroutineContext.Element tryCast$kotlin_stdlib;
            Intrinsics.checkNotNullParameter(key, "key");
            if (key instanceof AbstractCoroutineContextKey) {
                AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
                if (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey()) || (tryCast$kotlin_stdlib = abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor)) == null) {
                    return null;
                }
                return tryCast$kotlin_stdlib;
            }
            if (ContinuationInterceptor.Key != key) {
                return null;
            }
            Intrinsics.checkNotNull(continuationInterceptor, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return continuationInterceptor;
        }

        public static CoroutineContext minusKey(ContinuationInterceptor continuationInterceptor, CoroutineContext.Key key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof AbstractCoroutineContextKey)) {
                return ContinuationInterceptor.Key == key ? EmptyCoroutineContext.INSTANCE : continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            return (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey()) || abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor) == null) ? continuationInterceptor : EmptyCoroutineContext.INSTANCE;
        }
    }
}
