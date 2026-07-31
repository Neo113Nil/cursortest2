package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.sc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4879sc {

    @NotNull
    private final EnumC4811of a;

    @NotNull
    private final String b;

    @NotNull
    private final S7 c;

    @NotNull
    private final String d;

    public C4879sc(@NotNull EnumC4811of recordType, @NotNull String advertiserBundleId, @NotNull S7 adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = advertiserBundleId;
        this.c = adProvider;
        this.d = adInstanceId;
    }

    @NotNull
    public final String a() {
        return this.d;
    }

    @NotNull
    public final S7 b() {
        return this.c;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    @NotNull
    public final EnumC4811of d() {
        return this.a;
    }

    @NotNull
    public final C4690i1 a(@NotNull Jb<C4879sc, C4690i1> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
