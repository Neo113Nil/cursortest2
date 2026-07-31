package io.bidmachine.utils;

import androidx.annotation.NonNull;

/* loaded from: classes15.dex */
public interface SimpleSafeRunnable extends SafeRunnable {
    @Override // io.bidmachine.utils.SafeRunnable
    default void onThrows(@NonNull Throwable th) throws Throwable {
    }
}
