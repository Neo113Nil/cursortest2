package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ha0 extends ia0 {
    public final WindowInsetsAnimation e;

    public ha0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.ia0
    public final float a() {
        float alpha;
        alpha = this.e.getAlpha();
        return alpha;
    }

    @Override // defpackage.ia0
    public final long b() {
        long durationMillis;
        durationMillis = this.e.getDurationMillis();
        return durationMillis;
    }

    @Override // defpackage.ia0
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.ia0
    public final int d() {
        int typeMask;
        typeMask = this.e.getTypeMask();
        return typeMask;
    }

    @Override // defpackage.ia0
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
