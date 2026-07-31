package io.bidmachine.internal;

import io.bidmachine.util.version.Version;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class S {
    private final Version a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public S(Version version, int i, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.a = version;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
    }

    public final S a(Version version, int i, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(version, "version");
        return new S(version, i, j, j2, j3, j4);
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.f;
    }

    public final long d() {
        return this.d;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s = (S) obj;
        return Intrinsics.areEqual(this.a, s.a) && this.b == s.b && this.c == s.c && this.d == s.d && this.e == s.e && this.f == s.f;
    }

    public final Version f() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.e)) * 31) + Long.hashCode(this.f);
    }

    public String toString() {
        return "VersionMilestone(version=" + this.a + ", sessionCount=" + this.b + ", firstSessionTime=" + this.c + ", lastSessionTime=" + this.d + ", currentSessionDuration=" + this.e + ", lastSessionDuration=" + this.f + ')';
    }

    public final long a() {
        return this.e;
    }
}
