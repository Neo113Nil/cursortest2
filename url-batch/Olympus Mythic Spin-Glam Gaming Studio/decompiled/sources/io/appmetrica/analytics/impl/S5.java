package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class S5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActivityEvent.values().length];
        try {
            iArr[ActivityEvent.RESUMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActivityEvent.PAUSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
