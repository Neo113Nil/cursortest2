package o0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f3356a;

    /* renamed from: b, reason: collision with root package name */
    public long f3357b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3358c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3359e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3358c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0280a.f3352b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3356a == cVar.f3356a && this.f3357b == cVar.f3357b && this.d == cVar.d && this.f3359e == cVar.f3359e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3356a;
        long j3 = this.f3357b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3359e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3356a + " duration: " + this.f3357b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3359e + "}\n";
    }
}
