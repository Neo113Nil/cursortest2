package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4831q {

    @Nullable
    private final Boolean a;

    public C4831q(@NotNull JSONObject adFormatAuctionSettings) {
        Intrinsics.checkNotNullParameter(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.a = adFormatAuctionSettings.has(r.a) ? Boolean.valueOf(adFormatAuctionSettings.optBoolean(r.a)) : null;
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }
}
