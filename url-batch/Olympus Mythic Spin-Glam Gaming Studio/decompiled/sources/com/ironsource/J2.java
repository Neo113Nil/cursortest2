package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class J2 extends C4671h0 {

    @NotNull
    private final LevelPlayAdSize g;

    @Nullable
    private final Boolean h;

    @Nullable
    private final Long i;

    public /* synthetic */ J2(UUID uuid, String str, C4684hd c4684hd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, Uf uf, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c4684hd, (i & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : uf, (i & 128) != 0 ? null : d);
    }

    @NotNull
    public final LevelPlayAdSize i() {
        return this.g;
    }

    @Nullable
    public final Boolean j() {
        return this.h;
    }

    @Nullable
    public final Long k() {
        return this.i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(@NotNull UUID adId, @NotNull String adUnitId, @Nullable C4684hd c4684hd, @NotNull LevelPlayAdSize adSize, @Nullable Boolean bool, @Nullable Long l, @Nullable Uf uf, @Nullable Double d) {
        super(IronSource.a.BANNER, adId, adUnitId, c4684hd, uf, d);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.g = adSize;
        this.h = bool;
        this.i = l;
    }

    public J2() {
        this(C4950w7.a.a(), "", null, null, null, null, null, null, 252, null);
    }
}
