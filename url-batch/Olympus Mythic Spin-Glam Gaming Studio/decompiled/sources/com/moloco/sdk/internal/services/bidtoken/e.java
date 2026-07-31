package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.BidToken;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final f a;

    @NotNull
    public static final k b;

    static {
        f fVar = new f(false);
        a = fVar;
        b = new k("", "", fVar);
    }

    @NotNull
    public static final f a() {
        return a;
    }

    @NotNull
    public static final k b() {
        return b;
    }

    @NotNull
    public static final f a(@NotNull BidToken.BidTokenResponseV3 bidTokenResponseV3) {
        Intrinsics.checkNotNullParameter(bidTokenResponseV3, "<this>");
        return bidTokenResponseV3.hasClientTokenConfigs() ? new f(bidTokenResponseV3.getClientTokenConfigs().getEnableDbt()) : a;
    }
}
