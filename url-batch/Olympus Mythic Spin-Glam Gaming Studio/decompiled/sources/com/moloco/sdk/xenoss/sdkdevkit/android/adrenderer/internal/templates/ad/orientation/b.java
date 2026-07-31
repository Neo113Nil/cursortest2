package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes9.dex */
public final class b {
    public static final int c = 0;

    @NotNull
    public final a a;
    public final boolean b;

    public b(@NotNull a orientation, boolean z) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.a = orientation;
        this.b = z;
    }

    @NotNull
    public final a a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.b;
    }

    @NotNull
    public final a d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    @NotNull
    public String toString() {
        return "OrientationSettings(orientation=" + this.a + ", allowOrientationChange=" + this.b + ')';
    }

    public /* synthetic */ b(a aVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? true : z);
    }

    @NotNull
    public final b a(@NotNull a orientation, boolean z) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return new b(orientation, z);
    }

    public static /* synthetic */ b a(b bVar, a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = bVar.a;
        }
        if ((i & 2) != 0) {
            z = bVar.b;
        }
        return bVar.a(aVar, z);
    }
}
