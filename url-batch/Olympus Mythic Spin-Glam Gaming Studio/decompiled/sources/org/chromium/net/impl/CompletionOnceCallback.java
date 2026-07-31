package org.chromium.net.impl;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes9.dex */
final class CompletionOnceCallback implements AutoCloseable {
    private final long mCompletionOnceCallbackAdapter;
    private boolean mIsConsumed;

    interface Natives {
        void run(long j, int i);
    }

    @CalledByNative
    CompletionOnceCallback(long j) {
        this.mCompletionOnceCallbackAdapter = j;
    }

    public void run(int i) {
        if (this.mIsConsumed) {
            throw new IllegalStateException("This callback can only be run once");
        }
        CompletionOnceCallbackJni.get().run(this.mCompletionOnceCallbackAdapter, i);
        this.mIsConsumed = true;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (!this.mIsConsumed) {
            throw new AssertionError("run should always be called prior to close");
        }
    }
}
