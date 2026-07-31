package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.s0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4867s0 implements InterfaceC4726k2 {

    @NotNull
    private final C4671h0 a;

    public C4867s0(@NotNull C4671h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.a = adProperties;
    }

    @Override // com.ironsource.InterfaceC4726k2
    public void a(@NotNull com.ironsource.mediationsdk.h auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.b(this.a.c());
        auctionRequestParams.a(this.a.a().toString());
        auctionRequestParams.a(Boolean.TRUE);
    }
}
