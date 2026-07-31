package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.i6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4695i6 {

    @NotNull
    private final Map<String, List<String>> a;
    private final int b;
    private final boolean c;
    private final long d;

    @NotNull
    private final List<C4791nd> e;

    @NotNull
    private final C4813p f;
    private final int g;

    @Nullable
    private final Integer h;

    /* JADX WARN: Multi-variable type inference failed */
    public C4695i6(@NotNull Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, @NotNull List<C4791nd> placements, @NotNull C4813p auction, int i2, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        this.a = providerOrder;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = placements;
        this.f = auction;
        this.g = i2;
        this.h = num;
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
        if (!(obj instanceof C4695i6)) {
            return false;
        }
        C4695i6 c4695i6 = (C4695i6) obj;
        return Intrinsics.areEqual(this.a, c4695i6.a) && this.b == c4695i6.b && this.c == c4695i6.c && this.d == c4695i6.d && Intrinsics.areEqual(this.e, c4695i6.e) && Intrinsics.areEqual(this.f, c4695i6.f) && this.g == c4695i6.g && Intrinsics.areEqual(this.h, c4695i6.h);
    }

    @NotNull
    public final C4813p f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    @Nullable
    public final Integer h() {
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
        int hashCode2 = (((((((((hashCode + i) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Integer.hashCode(this.g)) * 31;
        Integer num = this.h;
        return hashCode2 + (num == null ? 0 : num.hashCode());
    }

    public final int i() {
        return this.g;
    }

    public final boolean j() {
        return this.c;
    }

    @NotNull
    public final C4813p k() {
        return this.f;
    }

    public final long l() {
        return this.d;
    }

    @Nullable
    public final Integer m() {
        return this.h;
    }

    public final int n() {
        return this.b;
    }

    @NotNull
    public final List<C4791nd> o() {
        return this.e;
    }

    @NotNull
    public final Map<String, List<String>> p() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return "FullscreenAdFormatConfig2(providerOrder=" + this.a + ", parallelLoad=" + this.b + ", advancedLoading=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", placements=" + this.e + ", auction=" + this.f + ", adapterTimeoutSecs=" + this.g + ", expiredDurationMins=" + this.h + ")";
    }

    @NotNull
    public final C4695i6 a(@NotNull Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, @NotNull List<C4791nd> placements, @NotNull C4813p auction, int i2, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        return new C4695i6(providerOrder, i, z, j, placements, auction, i2, num);
    }
}
