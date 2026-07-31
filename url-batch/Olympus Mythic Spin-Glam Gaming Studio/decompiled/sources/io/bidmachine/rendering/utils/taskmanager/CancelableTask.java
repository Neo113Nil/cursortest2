package io.bidmachine.rendering.utils.taskmanager;

import io.bidmachine.util.Cancelable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public abstract class CancelableTask implements Runnable, Cancelable {
    private final AtomicBoolean a = new AtomicBoolean(false);

    @Override // io.bidmachine.util.Cancelable
    public boolean isCanceled() {
        return this.a.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isCanceled()) {
            return;
        }
        runTask();
    }

    public abstract void runTask();

    @Override // io.bidmachine.util.Cancelable
    public void setCancel(boolean z) {
        this.a.set(z);
    }
}
