package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Sc {

    @NotNull
    private final String a;

    @Nullable
    private final String b;

    public Sc(@NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        this.b = str;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.b;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sc)) {
            return false;
        }
        Sc sc = (Sc) obj;
        return Intrinsics.areEqual(this.a, sc.a) && Intrinsics.areEqual(this.b, sc.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "OpenUrl(url=" + this.a + ", packageName=" + this.b + ")";
    }

    public /* synthetic */ Sc(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    @NotNull
    public final Sc a(@NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new Sc(url, str);
    }

    public static /* synthetic */ Sc a(Sc sc, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sc.a;
        }
        if ((i & 2) != 0) {
            str2 = sc.b;
        }
        return sc.a(str, str2);
    }
}
