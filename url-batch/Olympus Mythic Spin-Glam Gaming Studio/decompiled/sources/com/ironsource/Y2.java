package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Y2 extends C4809od {

    @NotNull
    private final C4814p0 b;

    @NotNull
    private final ISBannerSize c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(@NotNull C4814p0 adTools, @NotNull ISBannerSize size, @NotNull String placement) {
        super(placement);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.b = adTools;
        this.c = size;
    }

    @Override // com.ironsource.C4809od, com.ironsource.E0
    @NotNull
    public Map<String, Object> a(@Nullable C0 c0) {
        Map<String, Object> mutableMap = MapsKt.toMutableMap(super.a(c0));
        this.b.a(mutableMap, this.c);
        return mutableMap;
    }
}
