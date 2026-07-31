package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class A2 {

    @NotNull
    private final Map<String, List<String>> a;
    private final int b;
    private final boolean c;
    private final long d;

    @NotNull
    private final List<C4791nd> e;

    @NotNull
    private final C4813p f;
    private final long g;
    private final int h;
    private final long i;

    /* JADX WARN: Multi-variable type inference failed */
    public A2(@NotNull Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, @NotNull List<C4791nd> placements, @NotNull C4813p auction, long j2, int i2, long j3) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        this.a = providerOrder;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = placements;
        this.f = auction;
        this.g = j2;
        this.h = i2;
        this.i = j3;
    }

    @NotNull
    public final Map<String, List<String>> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    @NotNull
    public final List<C4791nd> e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A2)) {
            return false;
        }
        A2 a2 = (A2) obj;
        return Intrinsics.areEqual(this.a, a2.a) && this.b == a2.b && this.c == a2.c && this.d == a2.d && Intrinsics.areEqual(this.e, a2.e) && Intrinsics.areEqual(this.f, a2.f) && this.g == a2.g && this.h == a2.h && this.i == a2.i;
    }

    @NotNull
    public final C4813p f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((((((hashCode + i) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Long.hashCode(this.g)) * 31) + Integer.hashCode(this.h)) * 31) + Long.hashCode(this.i);
    }

    public final long i() {
        return this.i;
    }

    public final long j() {
        return this.g;
    }

    public final boolean k() {
        return this.c;
    }

    @NotNull
    public final C4813p l() {
        return this.f;
    }

    public final int m() {
        return this.h;
    }

    public final long n() {
        return this.d;
    }

    public final long o() {
        return this.i;
    }

    public final int p() {
        return this.b;
    }

    @NotNull
    public final List<C4791nd> q() {
        return this.e;
    }

    @NotNull
    public final Map<String, List<String>> r() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return "BannerAdFormatConfig2(providerOrder=" + this.a + ", parallelLoad=" + this.b + ", advancedLoading=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", placements=" + this.e + ", auction=" + this.f + ", adapterTimeoutMillis=" + this.g + ", bannerInterval=" + this.h + ", impressionTimeout=" + this.i + ")";
    }

    @NotNull
    public final A2 a(@NotNull Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, @NotNull List<C4791nd> placements, @NotNull C4813p auction, long j2, int i2, long j3) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        return new A2(providerOrder, i, z, j, placements, auction, j2, i2, j3);
    }
}
