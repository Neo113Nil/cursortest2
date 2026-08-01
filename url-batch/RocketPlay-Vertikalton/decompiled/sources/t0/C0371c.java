package t0;

import android.animation.TimeInterpolator;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371c {

    /* renamed from: a, reason: collision with root package name */
    public long f4167a;

    /* renamed from: b, reason: collision with root package name */
    public long f4168b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f4169c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4170e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f4169c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0369a.f4163b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0371c)) {
            return false;
        }
        C0371c c0371c = (C0371c) obj;
        if (this.f4167a == c0371c.f4167a && this.f4168b == c0371c.f4168b && this.d == c0371c.d && this.f4170e == c0371c.f4170e) {
            return a().getClass().equals(c0371c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f4167a;
        long j3 = this.f4168b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f4170e;
    }

    public final String toString() {
        return "\n" + C0371c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4167a + " duration: " + this.f4168b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f4170e + "}\n";
    }
}
