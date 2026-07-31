package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Y8 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @Nullable
    private X c;
    private boolean d;

    @Nullable
    private String e;

    @Nullable
    private String f;

    public Y8(@NotNull String appKey, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.a = appKey;
        this.b = userId;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @Nullable
    public final X e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y8)) {
            return false;
        }
        Y8 y8 = (Y8) obj;
        return Intrinsics.areEqual(this.a, y8.a) && Intrinsics.areEqual(this.b, y8.b);
    }

    @Nullable
    public final String f() {
        return this.f;
    }

    @Nullable
    public final String g() {
        return this.e;
    }

    @NotNull
    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @NotNull
    public String toString() {
        return "InitConfig(appKey=" + this.a + ", userId=" + this.b + ")";
    }

    @NotNull
    public final Y8 a(@NotNull String appKey, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new Y8(appKey, userId);
    }

    public final void b(@Nullable String str) {
        this.e = str;
    }

    public static /* synthetic */ Y8 a(Y8 y8, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = y8.a;
        }
        if ((i & 2) != 0) {
            str2 = y8.b;
        }
        return y8.a(str, str2);
    }

    public final void a(@Nullable X x) {
        this.c = x;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void a(@Nullable String str) {
        this.f = str;
    }

    public final <T> T a(@NotNull Jb<Y8, T> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
