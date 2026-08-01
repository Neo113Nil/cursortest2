package Y;

import K.ViewTreeObserverOnPreDrawListenerC0027u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: Y.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0059v extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1532a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1533b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1534c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1535e;

    public RunnableC0059v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1535e = true;
        this.f1532a = viewGroup;
        this.f1533b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1535e = true;
        if (this.f1534c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1534c = true;
            ViewTreeObserverOnPreDrawListenerC0027u.a(this.f1532a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1534c;
        ViewGroup viewGroup = this.f1532a;
        if (z2 || !this.f1535e) {
            viewGroup.endViewTransition(this.f1533b);
            this.d = true;
        } else {
            this.f1535e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1535e = true;
        if (this.f1534c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1534c = true;
            ViewTreeObserverOnPreDrawListenerC0027u.a(this.f1532a, this);
        }
        return true;
    }
}
