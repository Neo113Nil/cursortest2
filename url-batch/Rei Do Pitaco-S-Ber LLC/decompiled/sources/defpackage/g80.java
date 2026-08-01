package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class g80 implements Interpolator {
    public final /* synthetic */ h80 a;

    public g80(h80 h80Var) {
        this.a = h80Var;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.u.getInterpolation(f);
    }
}
