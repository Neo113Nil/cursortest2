package yads;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class lj2 extends Animation {
    public final int a;
    public final int b;
    public final WeakReference c;

    public lj2(ProgressBar progressBar, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = new WeakReference(progressBar);
        setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ProgressBar progressBar = (ProgressBar) this.c.get();
        if (progressBar != null) {
            super.applyTransformation(f, transformation);
            progressBar.setProgress(Math.round(((this.b - r5) * f) + this.a));
        }
    }
}
