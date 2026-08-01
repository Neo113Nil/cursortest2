package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f403a;

    /* renamed from: b, reason: collision with root package name */
    public float f404b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f405c;
    public final long d;

    public i0(int i, Interpolator interpolator, long j2) {
        this.f403a = i;
        this.f405c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f405c;
        return interpolator != null ? interpolator.getInterpolation(this.f404b) : this.f404b;
    }

    public int c() {
        return this.f403a;
    }

    public void d(float f2) {
        this.f404b = f2;
    }
}
