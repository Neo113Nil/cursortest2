package com.moloco.sdk.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes5.dex */
public final class t {
    public static final int d = 8;

    @NotNull
    public final MolocoAdError a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b;

    @NotNull
    public final Map<String, String> c;

    public t(@NotNull MolocoAdError molocoAdError, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, @NotNull Map<String, String> details) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        Intrinsics.checkNotNullParameter(details, "details");
        this.a = molocoAdError;
        this.b = subErrorType;
        this.c = details;
    }

    @NotNull
    public final MolocoAdError a() {
        return this.a;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.b;
    }

    @NotNull
    public final Map<String, String> c() {
        return this.c;
    }

    @NotNull
    public final Map<String, String> d() {
        return this.c;
    }

    @NotNull
    public final MolocoAdError e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.a, tVar.a) && Intrinsics.areEqual(this.b, tVar.b) && Intrinsics.areEqual(this.c, tVar.c);
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @NotNull
    public String toString() {
        return "MolocoInternalAdError(molocoAdError=" + this.a + ", subErrorType=" + this.b + ", details=" + this.c + ')';
    }

    @NotNull
    public final t a(@NotNull MolocoAdError molocoAdError, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, @NotNull Map<String, String> details) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        Intrinsics.checkNotNullParameter(details, "details");
        return new t(molocoAdError, subErrorType, details);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t a(t tVar, MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            molocoAdError = tVar.a;
        }
        if ((i & 2) != 0) {
            cVar = tVar.b;
        }
        if ((i & 4) != 0) {
            map = tVar.c;
        }
        return tVar.a(molocoAdError, cVar, map);
    }

    public /* synthetic */ t(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(molocoAdError, cVar, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
