package kotlinx.coroutines;

import kotlinx.coroutines.internal.ThreadLocalElement;

/* compiled from: ThreadContextElement.kt */
/* loaded from: classes6.dex */
public abstract class ThreadContextElementKt {
    public static final ThreadContextElement asContextElement(ThreadLocal threadLocal, Object obj) {
        return new ThreadLocalElement(obj, threadLocal);
    }
}
