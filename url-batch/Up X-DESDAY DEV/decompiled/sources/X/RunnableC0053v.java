package X;

import K.ViewTreeObserverOnPreDrawListenerC0020u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: X.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0053v extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f997a;

    /* renamed from: b, reason: collision with root package name */
    public final View f998b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f999c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1000e;

    public RunnableC0053v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1000e = true;
        this.f997a = viewGroup;
        this.f998b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1000e = true;
        if (this.f999c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f999c = true;
            ViewTreeObserverOnPreDrawListenerC0020u.a(this.f997a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f999c;
        ViewGroup viewGroup = this.f997a;
        if (z2 || !this.f1000e) {
            viewGroup.endViewTransition(this.f998b);
            this.d = true;
        } else {
            this.f1000e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1000e = true;
        if (this.f999c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f999c = true;
            ViewTreeObserverOnPreDrawListenerC0020u.a(this.f997a, this);
        }
        return true;
    }
}
