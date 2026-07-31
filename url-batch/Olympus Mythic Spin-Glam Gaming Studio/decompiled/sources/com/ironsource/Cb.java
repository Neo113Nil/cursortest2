package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class Cb {

    @NotNull
    private final EnumC4823p9 a;

    @NotNull
    private final String b;
    private final long c;
    private final boolean d;
    private final boolean e;

    public Cb(@NotNull EnumC4823p9 instanceType, @NotNull String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.a = instanceType;
        this.b = adSourceNameForEvents;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    @NotNull
    public final EnumC4823p9 a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cb)) {
            return false;
        }
        Cb cb = (Cb) obj;
        return this.a == cb.a && Intrinsics.areEqual(this.b, cb.b) && this.c == cb.c && this.d == cb.d && this.e == cb.e;
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    @NotNull
    public final EnumC4823p9 g() {
        return this.a;
    }

    public final long h() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.e;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.d;
    }

    @NotNull
    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.a + ", adSourceNameForEvents=" + this.b + ", loadTimeoutInMills=" + this.c + ", isOneFlow=" + this.d + ", isMultipleAdObjects=" + this.e + ")";
    }

    @NotNull
    public final Cb a(@NotNull EnumC4823p9 instanceType, @NotNull String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new Cb(instanceType, adSourceNameForEvents, j, z, z2);
    }

    public static /* synthetic */ Cb a(Cb cb, EnumC4823p9 enumC4823p9, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC4823p9 = cb.a;
        }
        if ((i & 2) != 0) {
            str = cb.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j = cb.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = cb.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = cb.e;
        }
        return cb.a(enumC4823p9, str2, j2, z3, z2);
    }

    public /* synthetic */ Cb(EnumC4823p9 enumC4823p9, String str, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC4823p9, str, j, z, (i & 16) != 0 ? true : z2);
    }
}
