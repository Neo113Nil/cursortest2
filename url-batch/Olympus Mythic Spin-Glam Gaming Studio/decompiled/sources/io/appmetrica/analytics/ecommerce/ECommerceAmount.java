package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Do;
import java.math.BigDecimal;

/* loaded from: classes14.dex */
public class ECommerceAmount {
    private final BigDecimal a;
    private final String b;

    public ECommerceAmount(long j, @NonNull String str) {
        this(Do.a(j), str);
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.a;
    }

    @NonNull
    public String getUnit() {
        return this.b;
    }

    @NonNull
    public String toString() {
        return "ECommerceAmount{amount=" + this.a + ", unit='" + this.b + "'}";
    }

    public ECommerceAmount(double d, @NonNull String str) {
        this(new BigDecimal(Do.a(d)), str);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.a = bigDecimal;
        this.b = str;
    }
}
