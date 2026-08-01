package defpackage;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class f5 {
    public final PathMeasure a;

    public f5(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, e5 e5Var) {
        if (!y6.C(e5Var)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.a.getSegment(f, f2, e5Var.a, true);
    }
}
