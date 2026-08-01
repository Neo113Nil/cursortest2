package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class c40 extends j90 {
    public int d;
    public int e = -1;
    public final /* synthetic */ SwipeDismissBehavior f;

    public c40(SwipeDismissBehavior swipeDismissBehavior) {
        this.f = swipeDismissBehavior;
    }

    @Override // defpackage.j90
    public final int a(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f.e;
        if (i2 == 0) {
            width = this.d;
            if (z) {
                width -= view.getWidth();
                width2 = this.d;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.d;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.d + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.d;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.j90
    public final int b(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.j90
    public final int d(View view) {
        return view.getWidth();
    }

    @Override // defpackage.j90
    public final void f(View view, int i) {
        this.e = i;
        this.d = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // defpackage.j90
    public final void g(int i) {
        i7 i7Var = this.f.b;
        if (i7Var != null) {
            k7 k7Var = i7Var.f.s;
            if (i == 0) {
                oe.o().y(k7Var);
            } else if (i == 1 || i == 2) {
                oe.o().w(k7Var);
            }
        }
    }

    @Override // defpackage.j90
    public final void h(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float abs = Math.abs(i - this.d);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.d) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // defpackage.j90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(View view, float f, float f2) {
        int i;
        i7 i7Var;
        this.e = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.e;
            if (i2 != 2) {
                i = i2 == 0 ? this.d : this.d;
            }
            if (f >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.d;
                if (left >= i3) {
                    i = i3 + width;
                    z = true;
                }
            }
            i = this.d - width;
            z = true;
        }
        if (swipeDismissBehavior.a.n(i, view.getTop())) {
            view.postOnAnimation(new d40(swipeDismissBehavior, view, z));
        } else {
            if (!z || (i7Var = swipeDismissBehavior.b) == null) {
                return;
            }
            i7Var.a(view);
        }
    }

    @Override // defpackage.j90
    public final boolean k(View view, int i) {
        int i2 = this.e;
        return (i2 == -1 || i2 == i) && this.f.r(view);
    }
}
