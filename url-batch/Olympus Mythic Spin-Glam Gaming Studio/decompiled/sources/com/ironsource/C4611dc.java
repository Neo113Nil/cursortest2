package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.dc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4611dc extends C4671h0 {
    public /* synthetic */ C4611dc(UUID uuid, String str, C4684hd c4684hd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c4684hd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4611dc(@NotNull UUID adId, @NotNull String adUnitId, @Nullable C4684hd c4684hd) {
        super(IronSource.a.NATIVE_AD, adId, adUnitId, c4684hd, null, null, 48, null);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public C4611dc() {
        this(C4950w7.a.a(), "", null, 4, null);
    }
}
