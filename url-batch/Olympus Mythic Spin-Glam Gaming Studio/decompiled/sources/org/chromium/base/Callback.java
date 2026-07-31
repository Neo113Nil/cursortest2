package org.chromium.base;

import internal.org.jni_zero.CalledByNative;
import java.util.Optional;

/* loaded from: classes11.dex */
public interface Callback {
    void onResult(Object obj);

    public static abstract class Helper {
        @CalledByNative
        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.onResult(obj);
        }

        @CalledByNative
        static void onOptionalStringResultFromNative(Callback callback, boolean z, String str) {
            callback.onResult(z ? Optional.of(str) : Optional.empty());
        }

        @CalledByNative
        static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.onResult(Boolean.valueOf(z));
        }

        @CalledByNative
        static void onIntResultFromNative(Callback callback, int i) {
            callback.onResult(Integer.valueOf(i));
        }

        @CalledByNative
        static void onLongResultFromNative(Callback callback, long j) {
            callback.onResult(Long.valueOf(j));
        }

        @CalledByNative
        static void onTimeResultFromNative(Callback callback, long j) {
            callback.onResult(Long.valueOf(j));
        }

        @CalledByNative
        static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }
}
