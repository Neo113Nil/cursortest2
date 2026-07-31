package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.BidToken;
import com.moloco.sdk.service_locator.a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface o {

    @NotNull
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        @NotNull
        public final o a() {
            a.e eVar = a.e.a;
            return new p(eVar.l(), eVar.m());
        }
    }

    @NotNull
    BidToken.ClientBidToken a(@NotNull byte[] bArr);

    @NotNull
    BidToken.ClientBidTokenComponents a(@NotNull com.moloco.sdk.internal.services.bidtoken.providers.k kVar, @NotNull f fVar);

    @NotNull
    byte[] a(@NotNull byte[] bArr, @NotNull byte[] bArr2);

    @NotNull
    BidToken.ClientBidTokenComponents b(@NotNull byte[] bArr);
}
