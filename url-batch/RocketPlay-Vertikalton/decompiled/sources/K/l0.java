package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f686a;

    /* renamed from: b, reason: collision with root package name */
    public float f687b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f688c;
    public final long d;

    public l0(int i, Interpolator interpolator, long j2) {
        this.f686a = i;
        this.f688c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f688c;
        return interpolator != null ? interpolator.getInterpolation(this.f687b) : this.f687b;
    }

    public int c() {
        return this.f686a;
    }

    public void d(float f2) {
        this.f687b = f2;
    }
}
