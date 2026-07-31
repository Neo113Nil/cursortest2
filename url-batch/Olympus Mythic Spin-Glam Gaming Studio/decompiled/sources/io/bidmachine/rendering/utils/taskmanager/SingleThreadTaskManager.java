package io.bidmachine.rendering.utils.taskmanager;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class SingleThreadTaskManager extends BaseTaskManager {
    protected abstract Handler a();

    protected boolean b() {
        return Looper.myLooper() == a().getLooper();
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void cancel(@NonNull Runnable runnable) {
        super.cancel(runnable);
        a().removeCallbacks(runnable);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void execute(@NonNull Runnable runnable) {
        super.execute(runnable);
        if (b()) {
            runnable.run();
        } else {
            a().post(runnable);
        }
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        super.schedule(runnable, j, timeUnit);
        a().postDelayed(runnable, timeUnit.toMillis(j));
    }
}
