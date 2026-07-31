package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class Q9 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    public Q9(@NotNull String advId, @NotNull String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        this.a = advId;
        this.b = advIdType;
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
        return this.a;
    }

    @NotNull
    public final String d() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q9)) {
            return false;
        }
        Q9 q9 = (Q9) obj;
        return Intrinsics.areEqual(this.a, q9.a) && Intrinsics.areEqual(this.b, q9.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @NotNull
    public String toString() {
        return "IronSourceAdvId(advId=" + this.a + ", advIdType=" + this.b + ")";
    }

    @NotNull
    public final Q9 a(@NotNull String advId, @NotNull String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        return new Q9(advId, advIdType);
    }

    public static /* synthetic */ Q9 a(Q9 q9, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = q9.a;
        }
        if ((i & 2) != 0) {
            str2 = q9.b;
        }
        return q9.a(str, str2);
    }
}
