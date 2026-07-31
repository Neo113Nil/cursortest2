package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;

/* loaded from: classes10.dex */
abstract class Platform {
    static void restoreInterruptIfIsInterruptedException(Throwable th) {
        Preconditions.checkNotNull(th);
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
