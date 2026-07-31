package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes6.dex */
public final class r {
    public static final int d = 0;

    @Nullable
    public final Boolean a;

    @Nullable
    public final Long b;

    @Nullable
    public final Long c;

    public r() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }

    @Nullable
    public final Long b() {
        return this.b;
    }

    @Nullable
    public final Long c() {
        return this.c;
    }

    @Nullable
    public final Boolean d() {
        return this.a;
    }

    @Nullable
    public final Long e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.a, rVar.a) && Intrinsics.areEqual(this.b, rVar.b) && Intrinsics.areEqual(this.c, rVar.c);
    }

    @Nullable
    public final Long f() {
        return this.c;
    }

    public int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MemoryInfoSignal(lowMemory=" + this.a + ", threshold=" + this.b + ", totalMem=" + this.c + ')';
    }

    public r(@Nullable Boolean bool, @Nullable Long l, @Nullable Long l2) {
        this.a = bool;
        this.b = l;
        this.c = l2;
    }

    @NotNull
    public final r a(@Nullable Boolean bool, @Nullable Long l, @Nullable Long l2) {
        return new r(bool, l, l2);
    }

    public static /* synthetic */ r a(r rVar, Boolean bool, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = rVar.a;
        }
        if ((i & 2) != 0) {
            l = rVar.b;
        }
        if ((i & 4) != 0) {
            l2 = rVar.c;
        }
        return rVar.a(bool, l, l2);
    }

    public /* synthetic */ r(Boolean bool, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2);
    }
}
