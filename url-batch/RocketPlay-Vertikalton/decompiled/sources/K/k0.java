package K;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class k0 extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f682e;

    public k0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f682e = windowInsetsAnimation;
    }

    @Override // K.l0
    public final long a() {
        long durationMillis;
        durationMillis = this.f682e.getDurationMillis();
        return durationMillis;
    }

    @Override // K.l0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f682e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // K.l0
    public final int c() {
        int typeMask;
        typeMask = this.f682e.getTypeMask();
        return typeMask;
    }

    @Override // K.l0
    public final void d(float f2) {
        this.f682e.setFraction(f2);
    }
}
