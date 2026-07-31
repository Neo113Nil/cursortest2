package org.chromium.base;

import internal.org.jni_zero.CalledByNative;
import org.chromium.base.lifetime.LifetimeAssert;

/* loaded from: classes.dex */
final class JniCallbackImpl<T> implements Callback, Runnable {
    private final boolean mIsRepeating;
    private final LifetimeAssert mLifetimeAssert = LifetimeAssert.create(this);
    private long mNativePointer;

    interface Natives {
        void onResult(boolean z, long j, Object obj);
    }

    @CalledByNative
    private JniCallbackImpl(boolean z, long j) {
        this.mIsRepeating = z;
        this.mNativePointer = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        onResult(null);
    }

    @Override // org.chromium.base.Callback
    public void onResult(Object obj) {
        if (this.mNativePointer == 0) {
            throw null;
        }
        JniCallbackImplJni.get().onResult(this.mIsRepeating, this.mNativePointer, obj);
        if (this.mIsRepeating) {
            return;
        }
        this.mNativePointer = 0L;
        LifetimeAssert.destroy(this.mLifetimeAssert);
    }
}
