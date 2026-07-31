package io.bidmachine.analytics.internal.g;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.analytics.internal.g.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5903e {
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final a e;
    private final h f;
    private final boolean g;

    /* renamed from: io.bidmachine.analytics.internal.g.e$a */
    public interface a {

        /* renamed from: io.bidmachine.analytics.internal.g.e$a$a, reason: collision with other inner class name */
        public static final class C1734a implements a {
            private final String a;
            private final String b;

            public C1734a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final String a() {
                return this.b;
            }

            public final String b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1734a)) {
                    return false;
                }
                C1734a c1734a = (C1734a) obj;
                return Intrinsics.areEqual(this.a, c1734a.a) && Intrinsics.areEqual(this.b, c1734a.b);
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        /* renamed from: io.bidmachine.analytics.internal.g.e$a$b */
        public static final class b implements a {
            private final String a;
            private final String b;
            private final String c;
            private final boolean d;

            public b(String str, String str2, String str3, boolean z) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = z;
            }

            public final String a() {
                return this.b;
            }

            public final String b() {
                return this.c;
            }

            public final boolean c() {
                return this.d;
            }

            public final String d() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && this.d == bVar.d;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
                String str = this.c;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                boolean z = this.d;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return hashCode2 + i;
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public C5903e(String str, String str2, long j, String str3, a aVar, h hVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = aVar;
        this.f = hVar;
        this.g = z;
    }

    public final C5903e a(String str, String str2, long j, String str3, a aVar, h hVar, boolean z) {
        return new C5903e(str, str2, j, str3, aVar, hVar, z);
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

    public final a e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5903e)) {
            return false;
        }
        C5903e c5903e = (C5903e) obj;
        return Intrinsics.areEqual(this.a, c5903e.a) && Intrinsics.areEqual(this.b, c5903e.b) && this.c == c5903e.c && Intrinsics.areEqual(this.d, c5903e.d) && Intrinsics.areEqual(this.e, c5903e.e) && Intrinsics.areEqual(this.f, c5903e.f) && this.g == c5903e.g;
    }

    public final long f() {
        return this.c;
    }

    public final boolean g() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        h hVar = this.f;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ReaderRecord(id=" + this.a + ", name=" + this.b + ", timestamp=" + this.c + ", dataHash=" + this.d + ", rule=" + this.e + ", error=" + this.f + ", isDirty=" + this.g + ')';
    }

    public final String a() {
        return this.d;
    }

    public /* synthetic */ C5903e(String str, String str2, long j, String str3, a aVar, h hVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, j, str3, aVar, (i & 32) != 0 ? null : hVar, (i & 64) != 0 ? true : z);
    }
}
