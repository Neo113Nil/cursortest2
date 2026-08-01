package q0;

import android.animation.TimeInterpolator;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290c {

    /* renamed from: a, reason: collision with root package name */
    public long f3555a;

    /* renamed from: b, reason: collision with root package name */
    public long f3556b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3557c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3558e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3557c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0288a.f3551b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0290c)) {
            return false;
        }
        C0290c c0290c = (C0290c) obj;
        if (this.f3555a == c0290c.f3555a && this.f3556b == c0290c.f3556b && this.d == c0290c.d && this.f3558e == c0290c.f3558e) {
            return a().getClass().equals(c0290c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3555a;
        long j3 = this.f3556b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3558e;
    }

    public final String toString() {
        return "\n" + C0290c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3555a + " duration: " + this.f3556b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3558e + "}\n";
    }
}
