package io.bidmachine.internal;

import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class A {
    private final String a;
    private final Boolean b;
    private final Boolean c;
    private final Boolean d;
    private final String e;
    private final String f;
    private final List g;
    private final Boolean h;

    public A(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, List list, Boolean bool4) {
        this.a = str;
        this.b = bool;
        this.c = bool2;
        this.d = bool3;
        this.e = str2;
        this.f = str3;
        this.g = list;
        this.h = bool4;
    }

    public final A a(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, List list, Boolean bool4) {
        return new A(str, bool, bool2, bool3, str2, str3, list, bool4);
    }

    public final Boolean b() {
        return this.c;
    }

    public final Boolean c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final List e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        return Intrinsics.areEqual(this.a, a.a) && Intrinsics.areEqual(this.b, a.b) && Intrinsics.areEqual(this.c, a.c) && Intrinsics.areEqual(this.d, a.d) && Intrinsics.areEqual(this.e, a.e) && Intrinsics.areEqual(this.f, a.f) && Intrinsics.areEqual(this.g, a.g) && Intrinsics.areEqual(this.h, a.h);
    }

    public final String f() {
        return this.f;
    }

    public final Boolean g() {
        return this.h;
    }

    public final Boolean h() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.d;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.g;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool4 = this.h;
        return hashCode7 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        return "PublisherPrivacySettings(gdprConsentString=" + this.a + ", subjectToGdpr=" + this.b + ", consentGranted=" + this.c + ", coppa=" + this.d + ", ccpa=" + this.e + ", gppString=" + this.f + ", gppIds=" + this.g + ", nonPersonalized=" + this.h + ')';
    }

    public static /* synthetic */ A a(A a, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, List list, Boolean bool4, int i, Object obj) {
        return a.a((i & 1) != 0 ? a.a : str, (i & 2) != 0 ? a.b : bool, (i & 4) != 0 ? a.c : bool2, (i & 8) != 0 ? a.d : bool3, (i & 16) != 0 ? a.e : str2, (i & 32) != 0 ? a.f : str3, (i & 64) != 0 ? a.g : list, (i & 128) != 0 ? a.h : bool4);
    }

    public final A b(String str) {
        return a(this, str, null, null, null, null, null, null, null, 254, null);
    }

    public final A c(String str) {
        return a(this, null, null, null, null, null, str, null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null);
    }

    public final A d(Boolean bool) {
        return a(this, null, bool, null, null, null, null, null, null, 253, null);
    }

    public final String a() {
        return this.e;
    }

    public final A b(Boolean bool) {
        return a(this, null, null, null, bool, null, null, null, null, 247, null);
    }

    public final A c(Boolean bool) {
        return a(this, null, null, null, null, null, null, null, bool, 127, null);
    }

    public final A a(Boolean bool) {
        return a(this, null, null, bool, null, null, null, null, null, 251, null);
    }

    public final A a(String str) {
        return a(this, null, null, null, null, str, null, null, null, 239, null);
    }

    public final A a(List list) {
        return a(this, null, null, null, null, null, null, list, null, 191, null);
    }

    public /* synthetic */ A(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, List list, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : list, (i & 128) == 0 ? bool4 : null);
    }
}
