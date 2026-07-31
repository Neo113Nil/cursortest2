package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C5756vl;
import io.appmetrica.analytics.impl.C5808xl;
import io.appmetrica.analytics.impl.C5816y3;
import io.appmetrica.analytics.impl.C5860zl;
import io.appmetrica.analytics.impl.Ie;
import io.appmetrica.analytics.impl.InterfaceC5336fg;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ECommerceEvent implements InterfaceC5336fg {
    protected ECommerceEvent() {
    }

    @NonNull
    public static ECommerceEvent addCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new C5816y3(4, eCommerceCartItem);
    }

    @NonNull
    public static ECommerceEvent beginCheckoutEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new Ie(6, eCommerceOrder);
    }

    @NonNull
    public static ECommerceEvent purchaseEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new Ie(7, eCommerceOrder);
    }

    @NonNull
    public static ECommerceEvent removeCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new C5816y3(5, eCommerceCartItem);
    }

    @NonNull
    public static ECommerceEvent showProductCardEvent(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        return new C5756vl(eCommerceProduct, eCommerceScreen);
    }

    @NonNull
    public static ECommerceEvent showProductDetailsEvent(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        return new C5808xl(eCommerceProduct, eCommerceReferrer);
    }

    @NonNull
    public static ECommerceEvent showScreenEvent(@NonNull ECommerceScreen eCommerceScreen) {
        return new C5860zl(eCommerceScreen);
    }

    @NonNull
    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5336fg
    public abstract /* synthetic */ List toProto();
}
