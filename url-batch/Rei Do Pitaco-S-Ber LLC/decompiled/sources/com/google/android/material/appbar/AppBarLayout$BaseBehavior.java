package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.l8;
import defpackage.u80;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends u80 {
    public boolean b;
    public int d;
    public VelocityTracker f;
    public int c = -1;
    public int e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // defpackage.hd
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.e < 0) {
            this.e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
            int i = this.c;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y - this.d) > this.e) {
                    this.d = y;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.c = -1;
        motionEvent.getX();
        motionEvent.getY();
        l8.c();
        return false;
    }

    @Override // defpackage.u80, defpackage.hd
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // defpackage.hd
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // defpackage.hd
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // defpackage.hd
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // defpackage.hd
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // defpackage.hd
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // defpackage.hd
    public final boolean o(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // defpackage.hd
    public final void p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    @Override // defpackage.hd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f.computeCurrentVelocity(1000);
                this.f.getYVelocity(this.c);
                view.getClass();
                l8.c();
                return false;
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.c);
                if (findPointerIndex != -1) {
                    this.d = (int) motionEvent.getY(findPointerIndex);
                    view.getClass();
                    l8.c();
                    return false;
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.c = motionEvent.getPointerId(i);
                    this.d = (int) (motionEvent.getY(i) + 0.5f);
                }
                velocityTracker = this.f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return !this.b;
            }
        }
        this.b = false;
        this.c = -1;
        VelocityTracker velocityTracker3 = this.f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f = null;
        }
        velocityTracker = this.f;
        if (velocityTracker != null) {
        }
        if (!this.b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
