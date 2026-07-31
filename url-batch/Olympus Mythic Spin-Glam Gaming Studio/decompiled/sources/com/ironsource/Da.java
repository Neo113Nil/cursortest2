package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class Da {
    private final long a;
    private final long b;
    private final boolean c;

    public Da(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Da)) {
            return false;
        }
        Da da = (Da) obj;
        return this.a == da.a && this.b == da.b && this.c == da.c;
    }

    public final boolean f() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=" + this.a + ", visibilityCheckerInterval=" + this.b + ", isAutoRefreshEnabled=" + this.c + ")";
    }

    @NotNull
    public final Da a(long j, long j2, boolean z) {
        return new Da(j, j2, z);
    }

    public static /* synthetic */ Da a(Da da, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = da.a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = da.b;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            z = da.c;
        }
        return da.a(j3, j4, z);
    }
}
