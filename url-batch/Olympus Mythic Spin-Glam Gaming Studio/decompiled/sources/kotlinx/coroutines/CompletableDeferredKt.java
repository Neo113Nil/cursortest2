package kotlinx.coroutines;

import kotlin.Result;

/* compiled from: CompletableDeferred.kt */
/* loaded from: classes3.dex */
public abstract class CompletableDeferredKt {
    public static final boolean completeWith(CompletableDeferred completableDeferred, Object obj) {
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj);
        return m8026exceptionOrNullimpl == null ? completableDeferred.complete(obj) : completableDeferred.completeExceptionally(m8026exceptionOrNullimpl);
    }

    public static /* synthetic */ CompletableDeferred CompletableDeferred$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return CompletableDeferred(job);
    }

    public static final CompletableDeferred CompletableDeferred(Job job) {
        return new CompletableDeferredImpl(job);
    }

    public static final CompletableDeferred CompletableDeferred(Object obj) {
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl(null);
        completableDeferredImpl.complete(obj);
        return completableDeferredImpl;
    }
}
