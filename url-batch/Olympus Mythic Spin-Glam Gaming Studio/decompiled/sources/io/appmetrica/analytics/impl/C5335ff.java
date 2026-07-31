package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5335ff implements Pc, ActivationBarrierCallback {
    public final L9 a;
    public final Oc b;
    public final Oc c;

    public C5335ff(@NotNull L9 l9, @NotNull Zg zg, @NotNull F4 f4, @NotNull C5621qf c5621qf) {
        this.a = l9;
        Oc oc = new Oc(zg, f4, c5621qf);
        this.b = oc;
        this.c = oc;
        if (oc.b()) {
            return;
        }
        Ka.k().a().subscribe(TimeUnit.SECONDS.toMillis(AbstractC5199a8.a.longValue()), Ka.k().w().f(), this);
    }

    @Override // io.appmetrica.analytics.impl.Pc
    @NotNull
    public final Z8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.b.a();
        ((A5) this.a.a()).e();
    }
}
