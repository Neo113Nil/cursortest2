package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f421a;

    /* renamed from: b, reason: collision with root package name */
    public float f422b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f423c;
    public final long d;

    public l0(int i, Interpolator interpolator, long j2) {
        this.f421a = i;
        this.f423c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f423c;
        return interpolator != null ? interpolator.getInterpolation(this.f422b) : this.f422b;
    }

    public int c() {
        return this.f421a;
    }

    public void d(float f2) {
        this.f422b = f2;
    }
}
