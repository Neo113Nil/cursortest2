package io.bidmachine.internal;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.bidmachine.internal.t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6024t {
    private final String a;
    private final Boolean b;
    private final String c;
    private final Boolean d;
    private final String e;
    private final String f;
    private final List g;
    private final Lazy h;

    /* renamed from: io.bidmachine.internal.t$a */
    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O mo4828invoke() {
            return N.a.b(C6024t.this.g());
        }
    }

    public C6024t(String str, Boolean bool, String str2, Boolean bool2, String str3, String str4, List list) {
        this.a = str;
        this.b = bool;
        this.c = str2;
        this.d = bool2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = LazyKt.lazy(new a());
    }

    public final String a() {
        return this.e;
    }

    public final List b() {
        return this.g;
    }

    public final String c() {
        return this.f;
    }

    public final O d() {
        return (O) this.h.getValue();
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6024t)) {
            return false;
        }
        C6024t c6024t = (C6024t) obj;
        return Intrinsics.areEqual(this.a, c6024t.a) && Intrinsics.areEqual(this.b, c6024t.b) && Intrinsics.areEqual(this.c, c6024t.c) && Intrinsics.areEqual(this.d, c6024t.d) && Intrinsics.areEqual(this.e, c6024t.e) && Intrinsics.areEqual(this.f, c6024t.f) && Intrinsics.areEqual(this.g, c6024t.g);
    }

    public final Boolean f() {
        return this.b;
    }

    public final String g() {
        return this.c;
    }

    public final Boolean h() {
        return this.d;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.d;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.g;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PlatformPrivacySettings(tcfV1=" + this.a + ", tcfV1Subject=" + this.b + ", tcfV2=" + this.c + ", tcfV2Subject=" + this.d + ", ccpa=" + this.e + ", gppString=" + this.f + ", gppIds=" + this.g + ')';
    }

    public /* synthetic */ C6024t(String str, Boolean bool, String str2, Boolean bool2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : list);
    }
}
