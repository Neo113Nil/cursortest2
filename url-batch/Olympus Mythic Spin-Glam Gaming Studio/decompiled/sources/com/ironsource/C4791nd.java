package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4791nd {

    @Nullable
    private final Integer a;

    @Nullable
    private final String b;

    @Nullable
    private final Boolean c;

    @Nullable
    private final String d;

    @Nullable
    private final Integer e;

    @Nullable
    private final Boolean f;

    @Nullable
    private final C4982y3 g;

    @Nullable
    private final Zc h;

    public C4791nd() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final Integer a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final Boolean c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.d;
    }

    @Nullable
    public final Integer e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4791nd)) {
            return false;
        }
        C4791nd c4791nd = (C4791nd) obj;
        return Intrinsics.areEqual(this.a, c4791nd.a) && Intrinsics.areEqual(this.b, c4791nd.b) && Intrinsics.areEqual(this.c, c4791nd.c) && Intrinsics.areEqual(this.d, c4791nd.d) && Intrinsics.areEqual(this.e, c4791nd.e) && Intrinsics.areEqual(this.f, c4791nd.f) && Intrinsics.areEqual(this.g, c4791nd.g) && Intrinsics.areEqual(this.h, c4791nd.h);
    }

    @Nullable
    public final Boolean f() {
        return this.f;
    }

    @Nullable
    public final C4982y3 g() {
        return this.g;
    }

    @Nullable
    public final Zc h() {
        return this.h;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C4982y3 c4982y3 = this.g;
        int hashCode7 = (hashCode6 + (c4982y3 == null ? 0 : c4982y3.hashCode())) * 31;
        Zc zc = this.h;
        return hashCode7 + (zc != null ? zc.hashCode() : 0);
    }

    @Nullable
    public final C4982y3 i() {
        return this.g;
    }

    @Nullable
    public final Boolean j() {
        return this.f;
    }

    @Nullable
    public final Zc k() {
        return this.h;
    }

    @Nullable
    public final Integer l() {
        return this.a;
    }

    @Nullable
    public final String m() {
        return this.b;
    }

    @Nullable
    public final Integer n() {
        return this.e;
    }

    @Nullable
    public final String o() {
        return this.d;
    }

    @Nullable
    public final Boolean p() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "PlacementConfig2(placementId=" + this.a + ", placementName=" + this.b + ", isDefault=" + this.c + ", virtualItemName=" + this.d + ", virtualItemCount=" + this.e + ", delivery=" + this.f + ", capping=" + this.g + ", pacing=" + this.h + ")";
    }

    public C4791nd(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable C4982y3 c4982y3, @Nullable Zc zc) {
        this.a = num;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = num2;
        this.f = bool2;
        this.g = c4982y3;
        this.h = zc;
    }

    @NotNull
    public final C4791nd a(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable C4982y3 c4982y3, @Nullable Zc zc) {
        return new C4791nd(num, str, bool, str2, num2, bool2, c4982y3, zc);
    }

    public /* synthetic */ C4791nd(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C4982y3 c4982y3, Zc zc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c4982y3, (i & 128) == 0 ? zc : null);
    }
}
