package io.bidmachine.util.taskmanager;

import io.bidmachine.util.Cancelable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuspendCancellableTask.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0006H\u0016J\u0006\u0010\u0007\u001a\u00020\bJ\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lio/bidmachine/util/taskmanager/SuspendCancellableTask;", "Ljava/lang/Runnable;", "Lio/bidmachine/util/Cancelable;", "()V", "isCanceled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "run", "", "runSuspend", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runTask", "setCancel", "isCancel", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public abstract class SuspendCancellableTask implements Runnable, Cancelable {

    @NotNull
    private final AtomicBoolean isCanceled = new AtomicBoolean(false);

    @Override // java.lang.Runnable
    public final void run() {
    }

    @Nullable
    public abstract Object runTask(@NotNull CoroutineContext coroutineContext, @NotNull Continuation continuation);

    @Nullable
    public final Object runSuspend(@NotNull CoroutineContext coroutineContext, @NotNull Continuation continuation) {
        if (isCanceled()) {
            return Unit.INSTANCE;
        }
        Object runTask = runTask(coroutineContext, continuation);
        return runTask == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? runTask : Unit.INSTANCE;
    }

    @Override // io.bidmachine.util.Cancelable
    public boolean isCanceled() {
        return this.isCanceled.get();
    }

    @Override // io.bidmachine.util.Cancelable
    public void setCancel(boolean isCancel) {
        this.isCanceled.set(isCancel);
    }
}
