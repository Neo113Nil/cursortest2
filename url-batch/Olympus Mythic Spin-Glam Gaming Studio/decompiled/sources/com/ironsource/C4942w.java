package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4942w {

    @NotNull
    private final EnumC4811of a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @NotNull
    private final String d;

    @NotNull
    private final S7 e;

    @NotNull
    private final String f;

    public C4942w(@NotNull EnumC4811of recordType, @NotNull String advertiserBundleId, @NotNull String networkInstanceId, @NotNull String adUnitId, @NotNull S7 adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = advertiserBundleId;
        this.c = networkInstanceId;
        this.d = adUnitId;
        this.e = adProvider;
        this.f = adInstanceId;
    }

    @NotNull
    public final String a() {
        return this.f;
    }

    @NotNull
    public final S7 b() {
        return this.e;
    }

    @NotNull
    public final String c() {
        return this.d;
    }

    @NotNull
    public final String d() {
        return this.b;
    }

    @NotNull
    public final String e() {
        return this.c;
    }

    @NotNull
    public final EnumC4811of f() {
        return this.a;
    }

    @NotNull
    public final G0 a(@NotNull Jb<C4942w, G0> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
