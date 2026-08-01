package Y;

import K.ViewTreeObserverOnPreDrawListenerC0022v;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: Y.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0053v extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1151a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1152b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1153c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1154e;

    public RunnableC0053v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1154e = true;
        this.f1151a = viewGroup;
        this.f1152b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1154e = true;
        if (this.f1153c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1153c = true;
            ViewTreeObserverOnPreDrawListenerC0022v.a(this.f1151a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1153c;
        ViewGroup viewGroup = this.f1151a;
        if (z2 || !this.f1154e) {
            viewGroup.endViewTransition(this.f1152b);
            this.d = true;
        } else {
            this.f1154e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1154e = true;
        if (this.f1153c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1153c = true;
            ViewTreeObserverOnPreDrawListenerC0022v.a(this.f1151a, this);
        }
        return true;
    }
}
