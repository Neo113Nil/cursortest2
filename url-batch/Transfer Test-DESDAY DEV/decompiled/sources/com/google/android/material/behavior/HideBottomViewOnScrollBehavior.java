package com.google.android.material.behavior;

import A.c;
import K.C0003b0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.football.transfertrivia.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v0.AbstractC0341a;
import x.AbstractC0346a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0346a {

    /* renamed from: b, reason: collision with root package name */
    public int f1764b;

    /* renamed from: c, reason: collision with root package name */
    public int f1765c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1766e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1763a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1767f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1768g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0346a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1767f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1764b = c.p0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1765c = c.p0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = c.q0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0341a.d);
        this.f1766e = c.q0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0341a.f4039c);
        return false;
    }

    @Override // x.AbstractC0346a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1763a;
        if (i > 0) {
            if (this.f1768g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1768g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1767f).setInterpolator(this.f1766e).setDuration(this.f1765c).setListener(new C0003b0(5, this));
            return;
        }
        if (i >= 0 || this.f1768g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1768g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1764b).setListener(new C0003b0(5, this));
    }

    @Override // x.AbstractC0346a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
