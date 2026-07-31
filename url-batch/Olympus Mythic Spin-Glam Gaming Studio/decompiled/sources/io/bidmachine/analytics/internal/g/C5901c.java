package io.bidmachine.analytics.internal.g;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.analytics.internal.g.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5901c {
    private final String a;
    private final String b;
    private final long c;
    private final EnumC5899a d;
    private final float e;
    private final EnumC5905g f;

    public C5901c(String str, String str2, long j, EnumC5899a enumC5899a, float f, EnumC5905g enumC5905g) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = enumC5899a;
        this.e = f;
        this.f = enumC5905g;
    }

    public final EnumC5899a a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    public final float d() {
        return this.e;
    }

    public final EnumC5905g e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5901c)) {
            return false;
        }
        C5901c c5901c = (C5901c) obj;
        return Intrinsics.areEqual(this.a, c5901c.a) && Intrinsics.areEqual(this.b, c5901c.b) && this.c == c5901c.c && this.d == c5901c.d && Float.compare(this.e, c5901c.e) == 0 && this.f == c5901c.f;
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + Float.hashCode(this.e)) * 31) + this.f.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
