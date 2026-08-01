package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ja0 {
    public ia0 a;

    public ja0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new ha0(c0.i(i, interpolator, j));
        } else {
            this.a = new fa0(i, interpolator, j);
        }
    }
}
