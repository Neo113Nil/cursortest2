package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.n9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4787n9 {

    @NotNull
    private final String a;
    private final int b;

    @Nullable
    private final String c;

    public C4787n9() {
        this(null, 0, null, 7, null);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.c;
    }

    @NotNull
    public final String e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4787n9)) {
            return false;
        }
        C4787n9 c4787n9 = (C4787n9) obj;
        return Intrinsics.areEqual(this.a, c4787n9.a) && this.b == c4787n9.b && Intrinsics.areEqual(this.c, c4787n9.c);
    }

    public final int f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "InstanceInformation(instanceId=" + this.a + ", instanceType=" + this.b + ", dynamicDemandSourceId=" + this.c + ")";
    }

    public C4787n9(@NotNull String instanceId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.a = instanceId;
        this.b = i;
        this.c = str;
    }

    @NotNull
    public final C4787n9 a(@NotNull String instanceId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        return new C4787n9(instanceId, i, str);
    }

    public static /* synthetic */ C4787n9 a(C4787n9 c4787n9, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c4787n9.a;
        }
        if ((i2 & 2) != 0) {
            i = c4787n9.b;
        }
        if ((i2 & 4) != 0) {
            str2 = c4787n9.c;
        }
        return c4787n9.a(str, i, str2);
    }

    public /* synthetic */ C4787n9(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
