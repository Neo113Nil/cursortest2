package o0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f3340a;

    /* renamed from: b, reason: collision with root package name */
    public long f3341b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3342c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3343e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3342c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0281a.f3336b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3340a == cVar.f3340a && this.f3341b == cVar.f3341b && this.d == cVar.d && this.f3343e == cVar.f3343e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3340a;
        long j3 = this.f3341b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3343e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3340a + " duration: " + this.f3341b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3343e + "}\n";
    }
}
