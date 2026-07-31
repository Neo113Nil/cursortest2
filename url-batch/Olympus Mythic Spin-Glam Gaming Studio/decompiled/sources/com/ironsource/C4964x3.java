package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.x3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4964x3 {

    @NotNull
    private String a;

    @NotNull
    private String b;

    @NotNull
    private String c;

    public C4964x3(@NotNull String cachedAppKey, @NotNull String cachedUserId, @NotNull String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        this.a = cachedAppKey;
        this.b = cachedUserId;
        this.c = cachedSettings;
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
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @NotNull
    public final String e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4964x3)) {
            return false;
        }
        C4964x3 c4964x3 = (C4964x3) obj;
        return Intrinsics.areEqual(this.a, c4964x3.a) && Intrinsics.areEqual(this.b, c4964x3.b) && Intrinsics.areEqual(this.c, c4964x3.c);
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @NotNull
    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.a + ", cachedUserId=" + this.b + ", cachedSettings=" + this.c + ")";
    }

    @NotNull
    public final C4964x3 a(@NotNull String cachedAppKey, @NotNull String cachedUserId, @NotNull String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        return new C4964x3(cachedAppKey, cachedUserId, cachedSettings);
    }

    public final void b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public static /* synthetic */ C4964x3 a(C4964x3 c4964x3, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4964x3.a;
        }
        if ((i & 2) != 0) {
            str2 = c4964x3.b;
        }
        if ((i & 4) != 0) {
            str3 = c4964x3.c;
        }
        return c4964x3.a(str, str2, str3);
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a = str;
    }
}
