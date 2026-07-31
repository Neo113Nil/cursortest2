package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4777n extends E5 {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final UUID b;

    @NotNull
    private final String c;

    public C4777n(@NotNull IronSource.a adFormat, @NotNull UUID adId, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.a = adFormat;
        this.b = adId;
        this.c = adUnitId;
    }

    @Override // com.ironsource.E0
    @NotNull
    public Map<String, Object> a(@Nullable C0 c0) {
        return a(new C4671h0(this.a, this.b, this.c, null, null, null, 56, null));
    }
}
