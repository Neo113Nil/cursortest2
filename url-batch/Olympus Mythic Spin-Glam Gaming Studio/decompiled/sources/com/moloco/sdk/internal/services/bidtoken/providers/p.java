package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes6.dex */
public final class p {
    public static final int i = 0;

    @NotNull
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public p(@NotNull String sessionId, long j, long j2, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.a = sessionId;
        this.b = j;
        this.c = j2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.a, pVar.a) && this.b == pVar.b && this.c == pVar.c && this.d == pVar.d && this.e == pVar.e && this.f == pVar.f && this.g == pVar.g && this.h == pVar.h;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.f)) * 31) + Integer.hashCode(this.g)) * 31) + Integer.hashCode(this.h);
    }

    public final int i() {
        return this.d;
    }

    public final int j() {
        return this.g;
    }

    public final long k() {
        return this.c;
    }

    public final int l() {
        return this.e;
    }

    public final int m() {
        return this.f;
    }

    public final int n() {
        return this.h;
    }

    @NotNull
    public final String o() {
        return this.a;
    }

    public final long p() {
        return this.b;
    }

    public final boolean q() {
        return this.a.length() > 0;
    }

    @NotNull
    public String toString() {
        return "IlrdSignal(sessionId=" + this.a + ", sessionStartTs=" + this.b + ", lastImpressionTs=" + this.c + ", bannerImpressionCount=" + this.d + ", mrecImpressionCount=" + this.e + ", nativeImpressionCount=" + this.f + ", interstitialImpressionCount=" + this.g + ", rewardedImpressionCount=" + this.h + ')';
    }

    @NotNull
    public final p a(@NotNull String sessionId, long j, long j2, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new p(sessionId, j, j2, i2, i3, i4, i5, i6);
    }
}
