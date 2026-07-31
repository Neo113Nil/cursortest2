package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.pd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4827pd {

    @NotNull
    private final String a;

    @NotNull
    private final LevelPlay.AdFormat b;

    public C4827pd(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = placementName;
        this.b = adFormat;
    }

    @NotNull
    public final String a() {
        return this.a + "_" + this.b;
    }
}
