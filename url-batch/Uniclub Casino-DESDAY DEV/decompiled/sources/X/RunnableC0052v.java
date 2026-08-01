package X;

import K.ViewTreeObserverOnPreDrawListenerC0019u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: X.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0052v extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1002a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1003b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1004c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1005e;

    public RunnableC0052v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1005e = true;
        this.f1002a = viewGroup;
        this.f1003b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1005e = true;
        if (this.f1004c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1004c = true;
            ViewTreeObserverOnPreDrawListenerC0019u.a(this.f1002a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1004c;
        ViewGroup viewGroup = this.f1002a;
        if (z2 || !this.f1005e) {
            viewGroup.endViewTransition(this.f1003b);
            this.d = true;
        } else {
            this.f1005e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1005e = true;
        if (this.f1004c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1004c = true;
            ViewTreeObserverOnPreDrawListenerC0019u.a(this.f1002a, this);
        }
        return true;
    }
}
