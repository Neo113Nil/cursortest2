package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class p {
    public static final int h = 8;

    @Nullable
    public final r a;

    @Nullable
    public final c b;

    @Nullable
    public final Long c;

    @NotNull
    public final List<q> d;

    @NotNull
    public final List<u> e;

    @Nullable
    public final A f;

    @NotNull
    public final List<l> g;

    public p(@Nullable r rVar, @Nullable c cVar, @Nullable Long l, @NotNull List<q> mediaFiles, @NotNull List<u> trackingList, @Nullable A a, @NotNull List<l> icons) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(trackingList, "trackingList");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.a = rVar;
        this.b = cVar;
        this.c = l;
        this.d = mediaFiles;
        this.e = trackingList;
        this.f = a;
        this.g = icons;
    }

    @Nullable
    public final c a() {
        return this.b;
    }

    @Nullable
    public final Long b() {
        return this.c;
    }

    @NotNull
    public final List<l> c() {
        return this.g;
    }

    @NotNull
    public final List<q> d() {
        return this.d;
    }

    @Nullable
    public final r e() {
        return this.a;
    }

    @NotNull
    public final List<u> f() {
        return this.e;
    }

    @Nullable
    public final A g() {
        return this.f;
    }
}
