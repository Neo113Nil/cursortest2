package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class x {
    public static final int n = 0;

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;
    public final boolean d;

    @NotNull
    public final String e;

    @NotNull
    public final String f;
    public final int g;

    @NotNull
    public final String h;

    @NotNull
    public final String i;
    public final float j;
    public final long k;

    @NotNull
    public final String l;

    @NotNull
    public final String m;

    public x(@NotNull String manufacturer, @NotNull String model, @NotNull String hwVersion, boolean z, @NotNull String os, @NotNull String osVersion, int i, @NotNull String language, @NotNull String mobileCarrier, float f, long j, @NotNull String hardware, @NotNull String brand) {
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hwVersion, "hwVersion");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(mobileCarrier, "mobileCarrier");
        Intrinsics.checkNotNullParameter(hardware, "hardware");
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.a = manufacturer;
        this.b = model;
        this.c = hwVersion;
        this.d = z;
        this.e = os;
        this.f = osVersion;
        this.g = i;
        this.h = language;
        this.i = mobileCarrier;
        this.j = f;
        this.k = j;
        this.l = hardware;
        this.m = brand;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final float b() {
        return this.j;
    }

    public final long c() {
        return this.k;
    }

    @NotNull
    public final String d() {
        return this.l;
    }

    @NotNull
    public final String e() {
        return this.m;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(this.a, xVar.a) && Intrinsics.areEqual(this.b, xVar.b) && Intrinsics.areEqual(this.c, xVar.c) && this.d == xVar.d && Intrinsics.areEqual(this.e, xVar.e) && Intrinsics.areEqual(this.f, xVar.f) && this.g == xVar.g && Intrinsics.areEqual(this.h, xVar.h) && Intrinsics.areEqual(this.i, xVar.i) && Float.compare(this.j, xVar.j) == 0 && this.k == xVar.k && Intrinsics.areEqual(this.l, xVar.l) && Intrinsics.areEqual(this.m, xVar.m);
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    @NotNull
    public final String g() {
        return this.c;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Integer.hashCode(this.g)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + Float.hashCode(this.j)) * 31) + Long.hashCode(this.k)) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    @NotNull
    public final String i() {
        return this.e;
    }

    @NotNull
    public final String j() {
        return this.f;
    }

    public final int k() {
        return this.g;
    }

    @NotNull
    public final String l() {
        return this.h;
    }

    @NotNull
    public final String m() {
        return this.i;
    }

    public final int n() {
        return this.g;
    }

    @NotNull
    public final String o() {
        return this.m;
    }

    public final long p() {
        return this.k;
    }

    @NotNull
    public final String q() {
        return this.l;
    }

    @NotNull
    public final String r() {
        return this.c;
    }

    @NotNull
    public final String s() {
        return this.h;
    }

    @NotNull
    public final String t() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(manufacturer=" + this.a + ", model=" + this.b + ", hwVersion=" + this.c + ", isTablet=" + this.d + ", os=" + this.e + ", osVersion=" + this.f + ", apiLevel=" + this.g + ", language=" + this.h + ", mobileCarrier=" + this.i + ", screenDensity=" + this.j + ", dbtMs=" + this.k + ", hardware=" + this.l + ", brand=" + this.m + ')';
    }

    @NotNull
    public final String u() {
        return this.i;
    }

    @NotNull
    public final String v() {
        return this.b;
    }

    @NotNull
    public final String w() {
        return this.e;
    }

    @NotNull
    public final String x() {
        return this.f;
    }

    public final float y() {
        return this.j;
    }

    public final boolean z() {
        return this.d;
    }

    @NotNull
    public final x a(@NotNull String manufacturer, @NotNull String model, @NotNull String hwVersion, boolean z, @NotNull String os, @NotNull String osVersion, int i, @NotNull String language, @NotNull String mobileCarrier, float f, long j, @NotNull String hardware, @NotNull String brand) {
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hwVersion, "hwVersion");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(mobileCarrier, "mobileCarrier");
        Intrinsics.checkNotNullParameter(hardware, "hardware");
        Intrinsics.checkNotNullParameter(brand, "brand");
        return new x(manufacturer, model, hwVersion, z, os, osVersion, i, language, mobileCarrier, f, j, hardware, brand);
    }
}
