package com.moloco.sdk.internal.services.events;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class e {
    public final boolean a;
    public final boolean b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    public e(boolean z, boolean z2, @NotNull String appForegroundUrl, @NotNull String appBackgroundUrl) {
        Intrinsics.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        Intrinsics.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        this.a = z;
        this.b = z2;
        this.c = appForegroundUrl;
        this.d = appBackgroundUrl;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
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
        return this.d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && Intrinsics.areEqual(this.c, eVar.c) && Intrinsics.areEqual(this.d, eVar.d);
    }

    @NotNull
    public final String f() {
        return this.c;
    }

    public final boolean g() {
        return this.a;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserEventConfig(eventReportingEnabled=" + this.a + ", userTrackingEnabled=" + this.b + ", appForegroundUrl=" + this.c + ", appBackgroundUrl=" + this.d + ')';
    }

    @NotNull
    public final e a(boolean z, boolean z2, @NotNull String appForegroundUrl, @NotNull String appBackgroundUrl) {
        Intrinsics.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        Intrinsics.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        return new e(z, z2, appForegroundUrl, appBackgroundUrl);
    }

    public static /* synthetic */ e a(e eVar, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = eVar.a;
        }
        if ((i & 2) != 0) {
            z2 = eVar.b;
        }
        if ((i & 4) != 0) {
            str = eVar.c;
        }
        if ((i & 8) != 0) {
            str2 = eVar.d;
        }
        return eVar.a(z, z2, str, str2);
    }
}
