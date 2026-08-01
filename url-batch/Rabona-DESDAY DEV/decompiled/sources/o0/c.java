package o0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f3362a;

    /* renamed from: b, reason: collision with root package name */
    public long f3363b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3364c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3365e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3364c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0281a.f3358b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3362a == cVar.f3362a && this.f3363b == cVar.f3363b && this.d == cVar.d && this.f3365e == cVar.f3365e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3362a;
        long j3 = this.f3363b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3365e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3362a + " duration: " + this.f3363b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3365e + "}\n";
    }
}
