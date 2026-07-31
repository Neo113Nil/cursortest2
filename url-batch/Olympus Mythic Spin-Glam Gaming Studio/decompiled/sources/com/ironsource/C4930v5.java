package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.v5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4930v5 implements Bb {

    @NotNull
    private final InterstitialAdRequest a;

    @NotNull
    private final A9 b;

    @NotNull
    private final InterfaceC4868s1 c;

    @NotNull
    private final IronSourceError d;

    public C4930v5(@NotNull InterstitialAdRequest adRequest, @NotNull A9 adLoadTaskListener, @NotNull InterfaceC4868s1 analytics, @NotNull IronSourceError error) {
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
