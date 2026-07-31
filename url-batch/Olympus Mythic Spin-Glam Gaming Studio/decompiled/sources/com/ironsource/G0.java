package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class G0 {

    @NotNull
    private final EnumC4811of a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @NotNull
    private final S7 d;

    @NotNull
    private final String e;

    public G0(@NotNull EnumC4811of recordType, @NotNull String advertiserBundleId, @NotNull String networkInstanceId, @NotNull S7 adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = advertiserBundleId;
        this.c = networkInstanceId;
        this.d = adProvider;
        this.e = adInstanceId;
    }

    @NotNull
    public final String a() {
        return this.e;
    }

    @NotNull
    public final S7 b() {
        return this.d;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    @NotNull
    public final String d() {
        return this.c;
    }

    @NotNull
    public final EnumC4811of e() {
        return this.a;
    }

    @NotNull
    public final C4879sc a(@NotNull Jb<G0, C4879sc> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
