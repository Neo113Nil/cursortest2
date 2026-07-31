package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class e {
    public static final int j = 8;

    @Nullable
    public final String a;

    @Nullable
    public final Integer b;

    @Nullable
    public final Integer c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final f f;

    @Nullable
    public final c g;

    @NotNull
    public final List<u> h;

    @NotNull
    public final List<y> i;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable f fVar, @Nullable c cVar, @NotNull List<u> creativeViewTrackingList, @NotNull List<? extends y> resources) {
        Intrinsics.checkNotNullParameter(creativeViewTrackingList, "creativeViewTrackingList");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = str3;
        this.f = fVar;
        this.g = cVar;
        this.h = creativeViewTrackingList;
        this.i = resources;
    }

    @Nullable
    public final c a() {
        return this.g;
    }

    @Nullable
    public final String b() {
        return this.d;
    }

    @Nullable
    public final String c() {
        return this.e;
    }

    @Nullable
    public final f d() {
        return this.f;
    }

    @NotNull
    public final List<u> e() {
        return this.h;
    }

    @Nullable
    public final Integer f() {
        return this.c;
    }

    @Nullable
    public final String g() {
        return this.a;
    }

    @NotNull
    public final List<y> h() {
        return this.i;
    }

    @Nullable
    public final Integer i() {
        return this.b;
    }
}
