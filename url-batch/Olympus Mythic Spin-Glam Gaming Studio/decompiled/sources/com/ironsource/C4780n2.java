package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4780n2 {

    @NotNull
    private final String a;

    @Nullable
    private final JSONObject b;

    @Nullable
    private final C4834q2 c;
    private final int d;

    @NotNull
    private final String e;

    public C4780n2(@NotNull String auctionId, @Nullable JSONObject jSONObject, @Nullable C4834q2 c4834q2, int i, @NotNull String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.a = auctionId;
        this.b = jSONObject;
        this.c = c4834q2;
        this.d = i;
        this.e = auctionFallback;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Nullable
    public final JSONObject b() {
        return this.b;
    }

    @Nullable
    public final C4834q2 c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @NotNull
    public final String e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4780n2)) {
            return false;
        }
        C4780n2 c4780n2 = (C4780n2) obj;
        return Intrinsics.areEqual(this.a, c4780n2.a) && Intrinsics.areEqual(this.b, c4780n2.b) && Intrinsics.areEqual(this.c, c4780n2.c) && this.d == c4780n2.d && Intrinsics.areEqual(this.e, c4780n2.e);
    }

    @NotNull
    public final String f() {
        return this.e;
    }

    @NotNull
    public final String g() {
        return this.a;
    }

    @Nullable
    public final JSONObject h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C4834q2 c4834q2 = this.c;
        return ((((hashCode2 + (c4834q2 != null ? c4834q2.hashCode() : 0)) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode();
    }

    public final int i() {
        return this.d;
    }

    @Nullable
    public final C4834q2 j() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "AuctionResponseData(auctionId=" + this.a + ", auctionResponseGenericParam=" + this.b + ", genericNotifications=" + this.c + ", auctionTrial=" + this.d + ", auctionFallback=" + this.e + ")";
    }

    @NotNull
    public final C4780n2 a(@NotNull String auctionId, @Nullable JSONObject jSONObject, @Nullable C4834q2 c4834q2, int i, @NotNull String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new C4780n2(auctionId, jSONObject, c4834q2, i, auctionFallback);
    }

    public static /* synthetic */ C4780n2 a(C4780n2 c4780n2, String str, JSONObject jSONObject, C4834q2 c4834q2, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c4780n2.a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c4780n2.b;
        }
        JSONObject jSONObject2 = jSONObject;
        if ((i2 & 4) != 0) {
            c4834q2 = c4780n2.c;
        }
        C4834q2 c4834q22 = c4834q2;
        if ((i2 & 8) != 0) {
            i = c4780n2.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = c4780n2.e;
        }
        return c4780n2.a(str, jSONObject2, c4834q22, i3, str2);
    }
}
