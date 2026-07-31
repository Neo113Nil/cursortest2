package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* renamed from: io.appmetrica.analytics.screenshot.impl.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5865b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActivityEvent.values().length];
        try {
            iArr[ActivityEvent.STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActivityEvent.STOPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
