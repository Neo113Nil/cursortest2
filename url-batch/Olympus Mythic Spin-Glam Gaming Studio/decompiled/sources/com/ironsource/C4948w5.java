package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4948w5 implements Bb {

    @NotNull
    private final RewardedAdRequest a;

    @NotNull
    private final C4577be b;

    @NotNull
    private final InterfaceC4868s1 c;

    @NotNull
    private final IronSourceError d;

    public C4948w5(@NotNull RewardedAdRequest adRequest, @NotNull C4577be adLoadTaskListener, @NotNull InterfaceC4868s1 analytics, @NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = adRequest;
        this.b = adLoadTaskListener;
        this.c = analytics;
        this.d = error;
    }

    @NotNull
    public final IronSourceError a() {
        return this.d;
    }

    @Override // com.ironsource.Bb
    public void start() {
        C4854r5 c4854r5 = new C4854r5(this.c, this.a.getAdId$mediationsdk_release(), this.a.getProviderName$mediationsdk_release());
        c4854r5.a();
        c4854r5.a(this.d);
        this.b.b(this.d);
    }
}
