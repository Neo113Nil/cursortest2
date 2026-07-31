package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes9.dex */
public final class Uf {
    public final C5217b0 a;
    public final List b;

    public Uf(ECommercePrice eCommercePrice) {
        this(new C5217b0(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new C5217b0(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        return "PriceWrapper{fiat=" + this.a + ", internalComponents=" + this.b + '}';
    }

    public Uf(C5217b0 c5217b0, LinkedList linkedList) {
        this.a = c5217b0;
        this.b = linkedList;
    }
}
