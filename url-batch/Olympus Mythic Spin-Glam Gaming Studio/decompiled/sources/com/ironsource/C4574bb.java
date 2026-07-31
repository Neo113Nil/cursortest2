package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.bb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4574bb {

    @Nullable
    private final C4695i6 a;

    @Nullable
    private final C4695i6 b;

    @Nullable
    private final A2 c;

    @NotNull
    private final Map<String, Cd> d;

    public C4574bb(@Nullable C4695i6 c4695i6, @Nullable C4695i6 c4695i62, @Nullable A2 a2, @NotNull Map<String, Cd> providerConfig) {
        Intrinsics.checkNotNullParameter(providerConfig, "providerConfig");
        this.a = c4695i6;
        this.b = c4695i62;
        this.c = a2;
        this.d = providerConfig;
    }

    @Nullable
    public final C4695i6 a() {
        return this.a;
    }

    @Nullable
    public final C4695i6 b() {
        return this.b;
    }

    @Nullable
    public final A2 c() {
        return this.c;
    }

    @NotNull
    public final Map<String, Cd> d() {
        return this.d;
    }

    @Nullable
    public final A2 e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4574bb)) {
            return false;
        }
        C4574bb c4574bb = (C4574bb) obj;
        return Intrinsics.areEqual(this.a, c4574bb.a) && Intrinsics.areEqual(this.b, c4574bb.b) && Intrinsics.areEqual(this.c, c4574bb.c) && Intrinsics.areEqual(this.d, c4574bb.d);
    }

    @Nullable
    public final C4695i6 f() {
        return this.b;
    }

    @NotNull
    public final Map<String, Cd> g() {
        return this.d;
    }

    @Nullable
    public final C4695i6 h() {
        return this.a;
    }

    public int hashCode() {
        C4695i6 c4695i6 = this.a;
        int hashCode = (c4695i6 == null ? 0 : c4695i6.hashCode()) * 31;
        C4695i6 c4695i62 = this.b;
        int hashCode2 = (hashCode + (c4695i62 == null ? 0 : c4695i62.hashCode())) * 31;
        A2 a2 = this.c;
        return ((hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    @NotNull
    public String toString() {
        return "LevelPlayInitConfig2(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", providerConfig=" + this.d + ")";
    }

    @NotNull
    public final C4574bb a(@Nullable C4695i6 c4695i6, @Nullable C4695i6 c4695i62, @Nullable A2 a2, @NotNull Map<String, Cd> providerConfig) {
        Intrinsics.checkNotNullParameter(providerConfig, "providerConfig");
        return new C4574bb(c4695i6, c4695i62, a2, providerConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4574bb a(C4574bb c4574bb, C4695i6 c4695i6, C4695i6 c4695i62, A2 a2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            c4695i6 = c4574bb.a;
        }
        if ((i & 2) != 0) {
            c4695i62 = c4574bb.b;
        }
        if ((i & 4) != 0) {
            a2 = c4574bb.c;
        }
        if ((i & 8) != 0) {
            map = c4574bb.d;
        }
        return c4574bb.a(c4695i6, c4695i62, a2, map);
    }
}
