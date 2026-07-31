package com.moloco.sdk.internal.services.init;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes13.dex */
public final class a {
    public static final int b = 0;

    @NotNull
    public final String a;

    public a(@NotNull String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.a = appKey;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.a;
    }

    @NotNull
    public final String c() {
        return this.a + "___v1";
    }

    @NotNull
    public final List<String> d() {
        return CollectionsKt.emptyList();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CacheKey(appKey=" + this.a + ')';
    }

    @NotNull
    public final a a(@NotNull String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return new a(appKey);
    }

    public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.a;
        }
        return aVar.a(str);
    }
}
