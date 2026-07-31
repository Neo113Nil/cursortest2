package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class l {
    public static final int e = 0;
    public final int a;
    public final boolean b;
    public final double c;
    public final int d;

    public l(int i, boolean z, double d, int i2) {
        this.a = i;
        this.b = z;
        this.c = d;
        this.d = i2;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.b == lVar.b && Double.compare(this.c, lVar.c) == 0 && this.d == lVar.d;
    }

    public final int f() {
        return this.d;
    }

    public final double g() {
        return this.c;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + Double.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    @NotNull
    public String toString() {
        return "MediaConfig(chunkSize=" + this.a + ", isStreamingEnabled=" + this.b + ", minStreamingPlayableDurationOnTimeoutSecs=" + this.c + ", mediaCacheDiskCleanUpLimit=" + this.d + ')';
    }

    @NotNull
    public final l a(int i, boolean z, double d, int i2) {
        return new l(i, z, d, i2);
    }

    public static /* synthetic */ l a(l lVar, int i, boolean z, double d, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = lVar.a;
        }
        if ((i3 & 2) != 0) {
            z = lVar.b;
        }
        boolean z2 = z;
        if ((i3 & 4) != 0) {
            d = lVar.c;
        }
        double d2 = d;
        if ((i3 & 8) != 0) {
            i2 = lVar.d;
        }
        return lVar.a(i, z2, d2, i2);
    }
}
