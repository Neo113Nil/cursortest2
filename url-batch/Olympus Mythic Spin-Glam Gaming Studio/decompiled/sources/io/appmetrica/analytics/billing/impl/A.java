package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* loaded from: classes12.dex */
public final class A {
    public final int a;
    public final int b;

    public A(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        return "ServiceSideBillingConfig(sendFrequencySeconds=" + this.a + ", firstCollectingInappMaxAgeSeconds=" + this.b + ')';
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
