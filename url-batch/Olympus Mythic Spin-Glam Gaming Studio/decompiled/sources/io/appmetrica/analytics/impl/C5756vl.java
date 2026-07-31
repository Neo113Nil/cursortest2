package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.vl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5756vl extends ECommerceEvent {

    @NonNull
    public final C5259cg a;

    @NonNull
    public final C5676sj b;
    public final InterfaceC5717u8 c;

    public C5756vl(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new C5259cg(eCommerceProduct), new C5676sj(eCommerceScreen), new C5782wl());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5717u8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC5336fg
    public final List<Qi> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.a + ", screen=" + this.b + ", converter=" + this.c + '}';
    }

    @VisibleForTesting
    public C5756vl(@NonNull C5259cg c5259cg, @NonNull C5676sj c5676sj, @NonNull InterfaceC5717u8 interfaceC5717u8) {
        this.a = c5259cg;
        this.b = c5676sj;
        this.c = interfaceC5717u8;
    }
}
