package io.bidmachine.rendering.utils.taskmanager;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import io.bidmachine.util.Cancelable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public abstract class BaseTaskManager implements TaskManager {
    private void a(Runnable runnable, boolean z) {
        try {
            if (runnable instanceof Cancelable) {
                ((Cancelable) runnable).setCancel(z);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    @CallSuper
    public void cancel(@NonNull Runnable runnable) {
        a(runnable, true);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    @CallSuper
    public void execute(@NonNull Runnable runnable) {
        a(runnable, false);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    @CallSuper
    public void schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        a(runnable, false);
    }
}
