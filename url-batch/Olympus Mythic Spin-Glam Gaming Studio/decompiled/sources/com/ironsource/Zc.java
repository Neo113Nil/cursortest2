package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Zc {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    /* JADX WARN: Multi-variable type inference failed */
    public Zc() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
        return this.b;
    }

    @Nullable
    public final Boolean c() {
        return this.a;
    }

    @Nullable
    public final Integer d() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zc)) {
            return false;
        }
        Zc zc = (Zc) obj;
        return Intrinsics.areEqual(this.a, zc.a) && Intrinsics.areEqual(this.b, zc.b);
    }

    public int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PacingConfig2(enabled=" + this.a + ", minTimeBetweenShowsSeconds=" + this.b + ")";
    }

    public Zc(@Nullable Boolean bool, @Nullable Integer num) {
        this.a = bool;
        this.b = num;
    }

    @NotNull
    public final Zc a(@Nullable Boolean bool, @Nullable Integer num) {
        return new Zc(bool, num);
    }

    public /* synthetic */ Zc(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
    }

    public static /* synthetic */ Zc a(Zc zc, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = zc.a;
        }
        if ((i & 2) != 0) {
            num = zc.b;
        }
        return zc.a(bool, num);
    }
}
