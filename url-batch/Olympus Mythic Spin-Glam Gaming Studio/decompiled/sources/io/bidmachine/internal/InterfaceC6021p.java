package io.bidmachine.internal;

import io.bidmachine.core.Logger;
import io.bidmachine.utils.SafeRunnable;

/* renamed from: io.bidmachine.internal.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC6021p extends SafeRunnable {
    @Override // io.bidmachine.utils.SafeRunnable
    default void onThrows(Throwable th) {
        Logger.w(th);
    }
}
