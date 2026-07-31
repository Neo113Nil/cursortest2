package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.idsync.internal.model.NetworkType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class B {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NetworkType.values().length];
        try {
            iArr[NetworkType.CELL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
