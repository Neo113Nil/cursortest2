package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes13.dex */
public interface CoroutineExceptionHandler extends CoroutineContext.Element {
    public static final Key Key = Key.$$INSTANCE;

    void handleException(CoroutineContext coroutineContext, Throwable th);

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class DefaultImpls {
        public static Object fold(CoroutineExceptionHandler coroutineExceptionHandler, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.fold(coroutineExceptionHandler, obj, function2);
        }

        public static CoroutineContext.Element get(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.get(coroutineExceptionHandler, key);
        }

        public static CoroutineContext minusKey(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(coroutineExceptionHandler, key);
        }

        public static CoroutineContext plus(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(coroutineExceptionHandler, coroutineContext);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class Key implements CoroutineContext.Key {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }
}
