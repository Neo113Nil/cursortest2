package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

/* compiled from: ThreadContext.kt */
/* loaded from: classes15.dex */
public abstract class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final Function2 countAll = new Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Object countAll$lambda$0;
            countAll$lambda$0 = ThreadContextKt.countAll$lambda$0(obj, (CoroutineContext.Element) obj2);
            return countAll$lambda$0;
        }
    };
    private static final Function2 findOne = new Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ThreadContextElement findOne$lambda$1;
            findOne$lambda$1 = ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (CoroutineContext.Element) obj2);
            return findOne$lambda$1;
        }
    };
    private static final Function2 updateState = new Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ThreadState updateState$lambda$2;
            updateState$lambda$2 = ThreadContextKt.updateState$lambda$2((ThreadState) obj, (CoroutineContext.Element) obj2);
            return updateState$lambda$2;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object countAll$lambda$0(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof ThreadContextElement)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? element : Integer.valueOf(intValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadContextElement findOne$lambda$1(ThreadContextElement threadContextElement, CoroutineContext.Element element) {
        if (threadContextElement != null) {
            return threadContextElement;
        }
        if (element instanceof ThreadContextElement) {
            return (ThreadContextElement) element;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadState updateState$lambda$2(ThreadState threadState, CoroutineContext.Element element) {
        if (element instanceof ThreadContextElement) {
            ThreadContextElement threadContextElement = (ThreadContextElement) element;
            threadState.append(threadContextElement, threadContextElement.updateThreadContext(threadState.context));
        }
        return threadState;
    }

    public static final Object threadContextElements(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, countAll);
        Intrinsics.checkNotNull(fold);
        return fold;
    }

    public static final Object updateThreadContext(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = threadContextElements(coroutineContext);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new ThreadState(coroutineContext, ((Number) obj).intValue()), updateState);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((ThreadContextElement) obj).updateThreadContext(coroutineContext);
    }

    public static final void restoreThreadContext(CoroutineContext coroutineContext, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).restore(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, findOne);
        Intrinsics.checkNotNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((ThreadContextElement) fold).restoreThreadContext(coroutineContext, obj);
    }
}
