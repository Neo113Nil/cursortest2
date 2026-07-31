package com.moloco.sdk.acm;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a {

    @NotNull
    public final String a;

    @NotNull
    public String b;
    public long c;

    @NotNull
    public final Map<String, String> d;

    public a(@NotNull String appId, @NotNull String postAnalyticsUrl, long j, @NotNull Map<String, String> clientOptions) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        Intrinsics.checkNotNullParameter(clientOptions, "clientOptions");
        this.a = appId;
        this.b = postAnalyticsUrl;
        this.c = j;
        this.d = clientOptions;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    @NotNull
    public final Map<String, String> d() {
        return this.d;
    }

    @NotNull
    public final String e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && this.c == aVar.c && Intrinsics.areEqual(this.d, aVar.d);
    }

    @NotNull
    public final Map<String, String> f() {
        return this.d;
    }

    @NotNull
    public final String g() {
        return this.b;
    }

    public final long h() {
        return this.c;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31) + this.d.hashCode();
    }

    @NotNull
    public String toString() {
        return "ACMConfig(appId=" + this.a + ", postAnalyticsUrl=" + this.b + ", requestPeriodSeconds=" + this.c + ", clientOptions=" + this.d + ')';
    }

    @NotNull
    public final a a(@NotNull String appId, @NotNull String postAnalyticsUrl, long j, @NotNull Map<String, String> clientOptions) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        Intrinsics.checkNotNullParameter(clientOptions, "clientOptions");
        return new a(appId, postAnalyticsUrl, j, clientOptions);
    }

    public static /* synthetic */ a a(a aVar, String str, String str2, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.b;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = aVar.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            map = aVar.d;
        }
        return aVar.a(str, str3, j2, map);
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void a(long j) {
        this.c = j;
    }

    public /* synthetic */ a(String str, String str2, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 600L : j, map);
    }
}
