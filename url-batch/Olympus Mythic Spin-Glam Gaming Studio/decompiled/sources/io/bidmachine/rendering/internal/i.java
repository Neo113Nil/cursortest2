package io.bidmachine.rendering.internal;

import io.bidmachine.util.SafeExecutable;

/* loaded from: classes4.dex */
public interface i extends SafeExecutable {
    @Override // io.bidmachine.util.SafeExecutable
    default void onThrows(Throwable th) {
        k.b(th);
    }
}
