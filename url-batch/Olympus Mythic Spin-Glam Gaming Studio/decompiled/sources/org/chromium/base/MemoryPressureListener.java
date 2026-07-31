package org.chromium.base;

import internal.org.jni_zero.CalledByNative;
import org.chromium.base.memory.MemoryPressureCallback;

/* loaded from: classes4.dex */
public class MemoryPressureListener {
    private static ObserverList sCallbacks;

    @CalledByNative
    private static void addNativeCallback() {
        ThreadUtils.assertOnUiThread();
        addCallback(new MemoryPressureCallback() { // from class: org.chromium.base.MemoryPressureListener$$ExternalSyntheticLambda0
        });
    }

    public static void addCallback(MemoryPressureCallback memoryPressureCallback) {
        ThreadUtils.assertOnUiThread();
        if (sCallbacks == null) {
            sCallbacks = new ObserverList();
        }
        sCallbacks.addObserver(memoryPressureCallback);
    }
}
