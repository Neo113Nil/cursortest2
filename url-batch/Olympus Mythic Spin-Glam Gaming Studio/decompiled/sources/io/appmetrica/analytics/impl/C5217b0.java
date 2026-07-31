package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5217b0 {
    public final BigDecimal a;
    public final String b;

    public C5217b0(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        return "AmountWrapper{amount=" + this.a + ", unit='" + this.b + "'}";
    }

    public C5217b0(BigDecimal bigDecimal, String str) {
        this.a = bigDecimal;
        this.b = str;
    }
}
