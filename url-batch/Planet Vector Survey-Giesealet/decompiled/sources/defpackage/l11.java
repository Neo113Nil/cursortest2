package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class l11 {
    public k11 a;

    public l11(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new j11(v0.i(i, interpolator, j));
        } else {
            this.a = new h11(i, interpolator, j);
        }
    }
}
