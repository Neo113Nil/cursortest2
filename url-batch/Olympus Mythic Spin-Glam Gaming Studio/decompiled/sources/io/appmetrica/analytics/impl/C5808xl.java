package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5808xl extends ECommerceEvent {

    @NonNull
    public final C5259cg a;

    @Nullable
    public final Gg b;
    public final InterfaceC5717u8 c;

    public C5808xl(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        this(new C5259cg(eCommerceProduct), eCommerceReferrer == null ? null : new Gg(eCommerceReferrer), new C5834yl());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5717u8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC5336fg
    public final List<Qi> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.a + ", referrer=" + this.b + ", converter=" + this.c + '}';
    }

    @VisibleForTesting
    public C5808xl(@NonNull C5259cg c5259cg, @Nullable Gg gg, @NonNull InterfaceC5717u8 interfaceC5717u8) {
        this.a = c5259cg;
        this.b = gg;
        this.c = interfaceC5717u8;
    }
}
