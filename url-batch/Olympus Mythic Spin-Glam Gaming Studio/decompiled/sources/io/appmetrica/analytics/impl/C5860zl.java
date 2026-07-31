package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5860zl extends ECommerceEvent {

    @NonNull
    public final C5676sj a;
    public final InterfaceC5717u8 b;

    public C5860zl(@NonNull ECommerceScreen eCommerceScreen) {
        this(new C5676sj(eCommerceScreen), new Al());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5717u8 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC5336fg
    public final List<Qi> toProto() {
        return (List) this.b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.a + ", converter=" + this.b + '}';
    }

    @VisibleForTesting
    public C5860zl(@NonNull C5676sj c5676sj, @NonNull InterfaceC5717u8 interfaceC5717u8) {
        this.a = c5676sj;
        this.b = interfaceC5717u8;
    }
}
