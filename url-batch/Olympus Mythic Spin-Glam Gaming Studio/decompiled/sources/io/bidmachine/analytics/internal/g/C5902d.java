package io.bidmachine.analytics.internal.g;

import java.util.Map;
import java.util.UUID;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.analytics.internal.g.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5902d {
    public static final a g = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final Map e;
    private final h f;

    /* renamed from: io.bidmachine.analytics.internal.g.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C5902d(String str, String str2, String str3, long j, Map map, h hVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = map;
        this.f = hVar;
    }

    public final C5902d a(String str, String str2, String str3, long j, Map map, h hVar) {
        return new C5902d(str, str2, str3, j, map, hVar);
    }

    public final h b() {
        return this.f;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5902d)) {
            return false;
        }
        C5902d c5902d = (C5902d) obj;
        return Intrinsics.areEqual(this.a, c5902d.a) && Intrinsics.areEqual(this.b, c5902d.b) && Intrinsics.areEqual(this.c, c5902d.c) && this.d == c5902d.d && Intrinsics.areEqual(this.e, c5902d.e) && Intrinsics.areEqual(this.f, c5902d.f);
    }

    public final long f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31;
        h hVar = this.f;
        return hashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "MonitorRecord(id=" + this.a + ", name=" + this.b + ", sessionId=" + this.c + ", timestamp=" + this.d + ", data=" + this.e + ", error=" + this.f + ')';
    }

    public static /* synthetic */ C5902d a(C5902d c5902d, String str, String str2, String str3, long j, Map map, h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c5902d.a;
        }
        if ((i & 2) != 0) {
            str2 = c5902d.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c5902d.c;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = c5902d.d;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            map = c5902d.e;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            hVar = c5902d.f;
        }
        return c5902d.a(str, str4, str5, j2, map2, hVar);
    }

    public final Map a() {
        return this.e;
    }

    public /* synthetic */ C5902d(String str, String str2, String str3, long j, Map map, h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, j, (i & 16) != 0 ? MapsKt.emptyMap() : map, (i & 32) != 0 ? null : hVar);
    }
}
