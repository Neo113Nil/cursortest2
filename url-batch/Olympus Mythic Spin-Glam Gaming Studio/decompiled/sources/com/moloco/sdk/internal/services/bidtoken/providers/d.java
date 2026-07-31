package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes6.dex */
public final class d {
    public static final int b = 0;

    @Nullable
    public final Long a;

    public d(@Nullable Long l) {
        this.a = l;
    }

    @Nullable
    public final Long a() {
        return this.a;
    }

    @Nullable
    public final Long b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.a, ((d) obj).a);
    }

    public int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppDirInfo(appDirSize=" + this.a + ')';
    }

    @NotNull
    public final d a(@Nullable Long l) {
        return new d(l);
    }

    public static /* synthetic */ d a(d dVar, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = dVar.a;
        }
        return dVar.a(l);
    }
}
