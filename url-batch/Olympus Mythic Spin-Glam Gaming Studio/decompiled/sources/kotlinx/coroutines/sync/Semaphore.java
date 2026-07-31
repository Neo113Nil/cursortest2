package kotlinx.coroutines.sync;

import kotlin.coroutines.Continuation;

/* compiled from: Semaphore.kt */
/* loaded from: classes15.dex */
public interface Semaphore {
    Object acquire(Continuation continuation);

    void release();
}
