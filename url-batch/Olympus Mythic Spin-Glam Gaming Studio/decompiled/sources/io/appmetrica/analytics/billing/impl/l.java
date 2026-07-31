package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BillingType.values().length];
        try {
            iArr[BillingType.LIBRARY_V6.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BillingType.LIBRARY_V8.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
