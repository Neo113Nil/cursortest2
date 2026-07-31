package io.bidmachine.media3.common.util;

import android.os.Looper;
import com.google.common.base.Function;

@UnstableApi
/* loaded from: classes3.dex */
public final class BackgroundThreadStateHandler<T> {
    private final HandlerWrapper backgroundHandler;
    private T backgroundState;
    private final HandlerWrapper foregroundHandler;
    private T foregroundState;
    private final StateChangeListener<T> onStateChanged;
    private int pendingOperations;

    public interface StateChangeListener<T> {
        void onStateChanged(T t, T t2);
    }

    public BackgroundThreadStateHandler(T t, Looper looper, Looper looper2, Clock clock, StateChangeListener<T> stateChangeListener) {
        this.backgroundHandler = clock.createHandler(looper, null);
        this.foregroundHandler = clock.createHandler(looper2, null);
        this.foregroundState = t;
        this.backgroundState = t;
        this.onStateChanged = stateChangeListener;
    }

    public T get() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == this.foregroundHandler.getLooper()) {
            return this.foregroundState;
        }
        Assertions.checkState(myLooper == this.backgroundHandler.getLooper());
        return this.backgroundState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateStateAsync(Function function, final Function function2) {
        Assertions.checkState(Looper.myLooper() == this.foregroundHandler.getLooper());
        this.pendingOperations++;
        this.backgroundHandler.post(new Runnable() { // from class: io.bidmachine.media3.common.util.BackgroundThreadStateHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundThreadStateHandler.this.lambda$updateStateAsync$1(function2);
            }
        });
        updateStateInForeground(function.apply(this.foregroundState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateAsync$1(Function function) {
        final T t = (T) function.apply(this.backgroundState);
        this.backgroundState = t;
        this.foregroundHandler.post(new Runnable() { // from class: io.bidmachine.media3.common.util.BackgroundThreadStateHandler$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundThreadStateHandler.this.lambda$updateStateAsync$0(t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$updateStateAsync$0(Object obj) {
        int i = this.pendingOperations - 1;
        this.pendingOperations = i;
        if (i == 0) {
            updateStateInForeground(obj);
        }
    }

    public void setStateInBackground(final T t) {
        this.backgroundState = t;
        this.foregroundHandler.post(new Runnable() { // from class: io.bidmachine.media3.common.util.BackgroundThreadStateHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundThreadStateHandler.this.lambda$setStateInBackground$2(t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$setStateInBackground$2(Object obj) {
        if (this.pendingOperations == 0) {
            updateStateInForeground(obj);
        }
    }

    public void runInBackground(Runnable runnable) {
        this.backgroundHandler.post(runnable);
    }

    private void updateStateInForeground(T t) {
        T t2 = this.foregroundState;
        this.foregroundState = t;
        if (t2.equals(t)) {
            return;
        }
        this.onStateChanged.onStateChanged(t2, t);
    }
}
