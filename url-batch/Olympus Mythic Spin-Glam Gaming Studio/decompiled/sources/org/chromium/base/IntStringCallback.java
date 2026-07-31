package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes3.dex */
public interface IntStringCallback {
    @CalledByNative
    void onResult(int i, String str);
}
