package io.appmetrica.analytics.billinginterface.internal.monitor;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener;

/* loaded from: classes6.dex */
public interface BillingMonitor extends BillingConfigChangedListener {
    void onSessionResumed() throws Throwable;
}
