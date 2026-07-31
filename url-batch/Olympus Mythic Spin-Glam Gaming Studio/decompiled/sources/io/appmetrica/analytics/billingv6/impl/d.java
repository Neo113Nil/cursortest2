package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class d {
    public final BillingClient a;
    public final LinkedHashSet b = new LinkedHashSet();

    public d(BillingClient billingClient) {
        this.a = billingClient;
    }

    public final void a(Object obj) {
        this.b.remove(obj);
        if (this.b.size() == 0) {
            this.a.endConnection();
        }
    }
}
