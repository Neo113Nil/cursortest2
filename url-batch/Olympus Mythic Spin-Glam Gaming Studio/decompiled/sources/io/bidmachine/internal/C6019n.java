package io.bidmachine.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.internal.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6019n {
    private final String a;
    private final String b;
    private final Long c;
    private final Long d;
    private final Long e;
    private final Long f;
    private final Boolean g;

    public C6019n(String str, String str2, Long l, Long l2, Long l3, Long l4, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = bool;
    }

    public final Long a() {
        return this.d;
    }

    public final Long b() {
        return this.f;
    }

    public final Long c() {
        return this.c;
    }

    public final Long d() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6019n)) {
            return false;
        }
        C6019n c6019n = (C6019n) obj;
        return Intrinsics.areEqual(this.a, c6019n.a) && Intrinsics.areEqual(this.b, c6019n.b) && Intrinsics.areEqual(this.c, c6019n.c) && Intrinsics.areEqual(this.d, c6019n.d) && Intrinsics.areEqual(this.e, c6019n.e) && Intrinsics.areEqual(this.f, c6019n.f) && Intrinsics.areEqual(this.g, c6019n.g);
    }

    public final String f() {
        return this.b;
    }

    public final boolean g() {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        return this.a == null && this.b == null && ((l = this.c) == null || l.longValue() == 0) && (((l2 = this.d) == null || l2.longValue() == 0) && (((l3 = this.e) == null || l3.longValue() == 0) && (((l4 = this.f) == null || l4.longValue() == 0) && this.g == null)));
    }

    public final boolean h() {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        return (this.a == null || this.b == null || (l = this.c) == null || l.longValue() == 0 || (l2 = this.d) == null || l2.longValue() == 0 || (l3 = this.e) == null || l3.longValue() == 0 || (l4 = this.f) == null || l4.longValue() == 0 || this.g == null) ? false : true;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int hashCode6 = (hashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.g;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean i() {
        return this.g;
    }

    public String toString() {
        return "InstallInfo(installReferrerUrl=" + this.a + ", installVersion=" + this.b + ", installReferrerClickSec=" + this.c + ", installBeginSec=" + this.d + ", installReferrerClickServerSec=" + this.e + ", installBeginServerSec=" + this.f + ", isGooglePlayInstant=" + this.g + ')';
    }
}
