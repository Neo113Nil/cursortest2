package com.google.android.material.behavior;

import F1.d;
import K.C0008b0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.luckycounter.drinkwater.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t0.AbstractC0369a;
import x.AbstractC0379a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0379a {

    /* renamed from: b, reason: collision with root package name */
    public int f2132b;

    /* renamed from: c, reason: collision with root package name */
    public int f2133c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f2134e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2131a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f2135f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f2136g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0379a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f2135f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2132b = d.d0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2133c = d.d0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = d.e0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0369a.d);
        this.f2134e = d.e0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0369a.f4164c);
        return false;
    }

    @Override // x.AbstractC0379a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f2131a;
        if (i > 0) {
            if (this.f2136g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f2136g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f2135f).setInterpolator(this.f2134e).setDuration(this.f2133c).setListener(new C0008b0(5, this));
            return;
        }
        if (i >= 0 || this.f2136g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f2136g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f2132b).setListener(new C0008b0(5, this));
    }

    @Override // x.AbstractC0379a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
