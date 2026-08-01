package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class hd {
    public boolean a(View view, Rect rect) {
        return false;
    }

    public boolean b(View view, View view2) {
        return false;
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean i(View view) {
        return false;
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    public Parcelable n(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean o(View view, int i, int i2) {
        return false;
    }

    public boolean q(View view, MotionEvent motionEvent) {
        return false;
    }

    public void c(kd kdVar) {
    }

    public void e() {
    }

    public void m(View view, Parcelable parcelable) {
    }

    public void p(View view, View view2, int i) {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }
}
