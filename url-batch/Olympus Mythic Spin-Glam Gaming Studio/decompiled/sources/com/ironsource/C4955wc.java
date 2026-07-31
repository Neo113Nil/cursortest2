package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4955wc implements InterfaceC4937vc {
    @Override // com.ironsource.InterfaceC4937vc
    public void a(@NotNull K9 adInstance, @NotNull C4973xc loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        IronSourceNetwork.loadAd(adInstance, loadParams.a());
    }

    @Override // com.ironsource.InterfaceC4937vc
    @NotNull
    public String a() {
        String version = IronSourceNetwork.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion()");
        return version;
    }
}
