package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class S2 extends C4867s0 {

    @Nullable
    private final ISBannerSize b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(@NotNull C4671h0 adProperties, @Nullable ISBannerSize iSBannerSize) {
        super(adProperties);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.b = iSBannerSize;
    }

    @Override // com.ironsource.C4867s0, com.ironsource.InterfaceC4726k2
    public void a(@NotNull com.ironsource.mediationsdk.h auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        super.a(auctionRequestParams);
        auctionRequestParams.a(this.b);
    }
}
