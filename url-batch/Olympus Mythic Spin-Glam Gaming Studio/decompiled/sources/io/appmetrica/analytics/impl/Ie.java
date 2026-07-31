package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* loaded from: classes11.dex */
public final class Ie extends ECommerceEvent {
    public static final int d = 6;
    public static final int e = 7;
    public final int a;

    @NonNull
    public final Ke b;
    public final InterfaceC5717u8 c;

    public Ie(int i, @NonNull ECommerceOrder eCommerceOrder) {
        this(i, new Ke(eCommerceOrder), new Je());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5717u8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC5336fg
    public final List<Qi> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.a + ", order=" + this.b + ", converter=" + this.c + '}';
    }

    @VisibleForTesting
    public Ie(int i, @NonNull Ke ke, @NonNull InterfaceC5717u8 interfaceC5717u8) {
        this.a = i;
        this.b = ke;
        this.c = interfaceC5717u8;
    }
}
