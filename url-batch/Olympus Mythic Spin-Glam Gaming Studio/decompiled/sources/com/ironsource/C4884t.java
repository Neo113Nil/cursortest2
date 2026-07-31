package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4884t {

    @NotNull
    private final String a;

    @NotNull
    private final EnumC4823p9 b;
    private final boolean c;

    @NotNull
    private final String d;
    private final long e;

    public C4884t(@NotNull String adSourceNameForEvents, @NotNull EnumC4823p9 instanceType, boolean z, @NotNull String providerName, long j) {
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.a = adSourceNameForEvents;
        this.b = instanceType;
        this.c = z;
        this.d = providerName;
        this.e = j;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final EnumC4823p9 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4884t)) {
            return false;
        }
        C4884t c4884t = (C4884t) obj;
        return Intrinsics.areEqual(this.a, c4884t.a) && this.b == c4884t.b && this.c == c4884t.c && Intrinsics.areEqual(this.d, c4884t.d) && this.e == c4884t.e;
    }

    @NotNull
    public final String f() {
        return this.a;
    }

    @NotNull
    public final EnumC4823p9 g() {
        return this.b;
    }

    public final long h() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.e);
    }

    @NotNull
    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "AdFormatConfig(adSourceNameForEvents=" + this.a + ", instanceType=" + this.b + ", isOneFlow=" + this.c + ", providerName=" + this.d + ", loadTimeoutInMillis=" + this.e + ")";
    }

    @NotNull
    public final C4884t a(@NotNull String adSourceNameForEvents, @NotNull EnumC4823p9 instanceType, boolean z, @NotNull String providerName, long j) {
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return new C4884t(adSourceNameForEvents, instanceType, z, providerName, j);
    }

    public static /* synthetic */ C4884t a(C4884t c4884t, String str, EnumC4823p9 enumC4823p9, boolean z, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4884t.a;
        }
        if ((i & 2) != 0) {
            enumC4823p9 = c4884t.b;
        }
        EnumC4823p9 enumC4823p92 = enumC4823p9;
        if ((i & 4) != 0) {
            z = c4884t.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = c4884t.d;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            j = c4884t.e;
        }
        return c4884t.a(str, enumC4823p92, z2, str3, j);
    }
}
