package com.ironsource;

import com.ironsource.C4797o1;
import com.ironsource.InterfaceC4743l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.r5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4854r5 {

    @NotNull
    private final InterfaceC4868s1 a;

    public C4854r5(@NotNull InterfaceC4868s1 analytics, @NotNull String adRequestAdId, @NotNull Fd adRequestProviderName) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        Intrinsics.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.a = analytics;
        analytics.a(new C4797o1.s(adRequestProviderName.value()), new C4797o1.b(adRequestAdId));
    }

    public final void a() {
        InterfaceC4743l1.c.a.a().a(this.a);
    }

    public final void a(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC4743l1.c.a.a(new C4797o1.j(error.getErrorCode()), new C4797o1.k(error.getErrorMessage()), new C4797o1.f(0L)).a(this.a);
    }
}
