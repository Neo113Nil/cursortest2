package com.pubmatic.sdk.openwrap.core.nativead;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public enum POBNativeEventTrackingMethod {
    IMAGE(1),
    JAVASCRIPT(2);

    final int a;

    POBNativeEventTrackingMethod(int i) {
        this.a = i;
    }

    @Nullable
    public static POBNativeEventTrackingMethod getEventTrackingMethod(int i) {
        if (i == 1) {
            return IMAGE;
        }
        if (i != 2) {
            return null;
        }
        return JAVASCRIPT;
    }

    public int getNativeEventTrackingMethodValue() {
        return this.a;
    }
}
