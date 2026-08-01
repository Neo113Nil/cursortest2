package v0;

import android.animation.TimeInterpolator;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343c {

    /* renamed from: a, reason: collision with root package name */
    public long f4042a;

    /* renamed from: b, reason: collision with root package name */
    public long f4043b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f4044c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4045e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f4044c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0341a.f4038b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0343c)) {
            return false;
        }
        C0343c c0343c = (C0343c) obj;
        if (this.f4042a == c0343c.f4042a && this.f4043b == c0343c.f4043b && this.d == c0343c.d && this.f4045e == c0343c.f4045e) {
            return a().getClass().equals(c0343c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f4042a;
        long j3 = this.f4043b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f4045e;
    }

    public final String toString() {
        return "\n" + C0343c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4042a + " duration: " + this.f4043b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f4045e + "}\n";
    }
}
