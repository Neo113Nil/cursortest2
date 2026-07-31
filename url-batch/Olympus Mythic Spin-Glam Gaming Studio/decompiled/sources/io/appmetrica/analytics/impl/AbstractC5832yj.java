package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.yj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5832yj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CounterConfigurationReporterType.values().length];
        a = iArr;
        try {
            iArr[CounterConfigurationReporterType.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[CounterConfigurationReporterType.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
