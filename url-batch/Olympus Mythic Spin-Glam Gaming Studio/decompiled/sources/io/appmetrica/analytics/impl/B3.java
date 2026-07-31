package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* loaded from: classes6.dex */
public final class B3 {
    public final C5259cg a;
    public final BigDecimal b;
    public final Uf c;
    public final Gg d;

    public B3(ECommerceCartItem eCommerceCartItem) {
        this(new C5259cg(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Uf(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Gg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.a + ", quantity=" + this.b + ", revenue=" + this.c + ", referrer=" + this.d + '}';
    }

    public B3(C5259cg c5259cg, BigDecimal bigDecimal, Uf uf, Gg gg) {
        this.a = c5259cg;
        this.b = bigDecimal;
        this.c = uf;
        this.d = gg;
    }
}
