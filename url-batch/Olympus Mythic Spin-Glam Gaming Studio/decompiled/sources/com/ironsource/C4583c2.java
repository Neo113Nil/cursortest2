package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.c2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4583c2 {

    @NotNull
    private final String a;
    private final boolean b;
    private boolean c;

    @NotNull
    private String d;

    @NotNull
    private Map<String, ? extends Object> e;

    @Nullable
    private C4565b2 f;

    @NotNull
    private Map<String, Object> g;

    public C4583c2(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = z;
        this.d = "";
        this.e = MapsKt.emptyMap();
        this.g = new HashMap();
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.g;
    }

    @Nullable
    public final C4565b2 d() {
        return this.f;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4583c2)) {
            return false;
        }
        C4583c2 c4583c2 = (C4583c2) obj;
        return Intrinsics.areEqual(this.a, c4583c2.a) && this.b == c4583c2.b;
    }

    @NotNull
    public final Map<String, Object> f() {
        return this.e;
    }

    @NotNull
    public final String g() {
        return this.a;
    }

    @NotNull
    public final String h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean i() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "AuctionInstanceInfo(name=" + this.a + ", bidder=" + this.b + ")";
    }

    @NotNull
    public final C4583c2 a(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C4583c2(name, z);
    }

    public final void b(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.e = map;
    }

    public static /* synthetic */ C4583c2 a(C4583c2 c4583c2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4583c2.a;
        }
        if ((i & 2) != 0) {
            z = c4583c2.b;
        }
        return c4583c2.a(str, z);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    public final void a(@Nullable C4565b2 c4565b2) {
        this.f = c4565b2;
    }

    public final void a(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.g = map;
    }
}
