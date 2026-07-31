package io.bidmachine.rendering.internal;

import io.bidmachine.util.SafeRunnable;

/* loaded from: classes4.dex */
public interface j extends SafeRunnable {
    @Override // io.bidmachine.util.SafeRunnable
    default void onThrows(Throwable th) {
        k.b(th);
    }
}
