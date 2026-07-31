package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes5.dex */
public final class g {
    public static final int f = 0;

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    public g(@NotNull String language, @NotNull String osVersion, @NotNull String make, @NotNull String model, @NotNull String hardwareVersion) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        this.a = language;
        this.b = osVersion;
        this.c = make;
        this.d = model;
        this.e = hardwareVersion;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.d;
    }

    @NotNull
    public final String e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.a, gVar.a) && Intrinsics.areEqual(this.b, gVar.b) && Intrinsics.areEqual(this.c, gVar.c) && Intrinsics.areEqual(this.d, gVar.d) && Intrinsics.areEqual(this.e, gVar.e);
    }

    @NotNull
    public final String f() {
        return this.e;
    }

    @NotNull
    public final String g() {
        return this.a;
    }

    @NotNull
    public final String h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @NotNull
    public final String i() {
        return this.d;
    }

    @NotNull
    public final String j() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "BidTokenDeviceRequestInfo(language=" + this.a + ", osVersion=" + this.b + ", make=" + this.c + ", model=" + this.d + ", hardwareVersion=" + this.e + ')';
    }

    @NotNull
    public final g a(@NotNull String language, @NotNull String osVersion, @NotNull String make, @NotNull String model, @NotNull String hardwareVersion) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        return new g(language, osVersion, make, model, hardwareVersion);
    }

    public static /* synthetic */ g a(g gVar, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gVar.a;
        }
        if ((i & 2) != 0) {
            str2 = gVar.b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = gVar.c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = gVar.d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = gVar.e;
        }
        return gVar.a(str, str6, str7, str8, str5);
    }
}
