package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class w {
    public static final int d = 8;

    @NotNull
    public final List<C5101a> a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    public w(@NotNull List<C5101a> ads, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(ads, "ads");
        this.a = ads;
        this.b = str;
        this.c = str2;
    }

    @NotNull
    public final List<C5101a> a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.c;
    }
}
