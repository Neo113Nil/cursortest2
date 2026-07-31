package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Te {

    @NotNull
    private final P3 a;

    @NotNull
    private final Hd b;

    @NotNull
    private final Map<String, C4805o9> c;

    public Te(@NotNull P3 configurations, @NotNull Hd providerOrder, @NotNull Map<String, C4805o9> providerSettings) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.a = configurations;
        this.b = providerOrder;
        this.c = providerSettings;
    }

    @NotNull
    public final P3 a() {
        return this.a;
    }

    @NotNull
    public final Hd b() {
        return this.b;
    }

    @NotNull
    public final Map<String, C4805o9> c() {
        return this.c;
    }

    @NotNull
    public final P3 d() {
        return this.a;
    }

    @NotNull
    public final Hd e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Te)) {
            return false;
        }
        Te te = (Te) obj;
        return Intrinsics.areEqual(this.a, te.a) && Intrinsics.areEqual(this.b, te.b) && Intrinsics.areEqual(this.c, te.c);
    }

    @NotNull
    public final Map<String, C4805o9> f() {
        return this.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @NotNull
    public String toString() {
        return "ServerResponse2(configurations=" + this.a + ", providerOrder=" + this.b + ", providerSettings=" + this.c + ")";
    }

    @NotNull
    public final Te a(@NotNull P3 configurations, @NotNull Hd providerOrder, @NotNull Map<String, C4805o9> providerSettings) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        return new Te(configurations, providerOrder, providerSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Te a(Te te, P3 p3, Hd hd, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            p3 = te.a;
        }
        if ((i & 2) != 0) {
            hd = te.b;
        }
        if ((i & 4) != 0) {
            map = te.c;
        }
        return te.a(p3, hd, map);
    }
}
