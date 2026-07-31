package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class u {
    public static final int d = 0;

    @NotNull
    public final v a;

    @NotNull
    public final String b;

    @Nullable
    public final r c;

    public u(@NotNull v event, @NotNull String url, @Nullable r rVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = event;
        this.b = url;
        this.c = rVar;
    }

    @NotNull
    public final v a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @Nullable
    public final r c() {
        return this.c;
    }

    @NotNull
    public final v d() {
        return this.a;
    }

    @Nullable
    public final r e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && Intrinsics.areEqual(this.b, uVar.b) && Intrinsics.areEqual(this.c, uVar.c);
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        r rVar = this.c;
        return hashCode + (rVar == null ? 0 : rVar.hashCode());
    }

    @NotNull
    public String toString() {
        return "Tracking(event=" + this.a + ", url=" + this.b + ", offset=" + this.c + ')';
    }

    public /* synthetic */ u(v vVar, String str, r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, str, (i & 4) != 0 ? null : rVar);
    }

    @NotNull
    public final u a(@NotNull v event, @NotNull String url, @Nullable r rVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(url, "url");
        return new u(event, url, rVar);
    }

    public static /* synthetic */ u a(u uVar, v vVar, String str, r rVar, int i, Object obj) {
        if ((i & 1) != 0) {
            vVar = uVar.a;
        }
        if ((i & 2) != 0) {
            str = uVar.b;
        }
        if ((i & 4) != 0) {
            rVar = uVar.c;
        }
        return uVar.a(vVar, str, rVar);
    }
}
