package o;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: o.Io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0225Io extends AnimationSet implements Runnable {
    public final ViewGroup h;
    public boolean i;
    public boolean j;
    public boolean k;

    public RunnableC0225Io(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.k = true;
        this.h = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.k = true;
        if (this.i) {
            return !this.j;
        }
        if (!super.getTransformation(j, transformation)) {
            this.i = true;
            ViewTreeObserverOnPreDrawListenerC1354kG.a(this.h, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.i;
        ViewGroup viewGroup = this.h;
        if (z || !this.k) {
            viewGroup.endViewTransition(null);
            this.j = true;
        } else {
            this.k = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.k = true;
        if (this.i) {
            return !this.j;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.i = true;
            ViewTreeObserverOnPreDrawListenerC1354kG.a(this.h, this);
        }
        return true;
    }
}
