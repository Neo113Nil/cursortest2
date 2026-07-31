package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.y3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5816y3 extends ECommerceEvent {
    public static final int d = 4;
    public static final int e = 5;
    public final int a;

    @NonNull
    public final B3 b;
    public final InterfaceC5717u8 c;

    public C5816y3(int i, @NonNull ECommerceCartItem eCommerceCartItem) {
        this(i, new B3(eCommerceCartItem), new C5842z3());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5717u8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        int i = this.a;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC5336fg
    public final List<Qi> toProto() {
        return (List) this.c.fromModel(this);
    }

    @NonNull
    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.a + ", cartItem=" + this.b + ", converter=" + this.c + '}';
    }

    @VisibleForTesting
    public C5816y3(int i, @NonNull B3 b3, @NonNull InterfaceC5717u8 interfaceC5717u8) {
        this.a = i;
        this.b = b3;
        this.c = interfaceC5717u8;
    }
}
