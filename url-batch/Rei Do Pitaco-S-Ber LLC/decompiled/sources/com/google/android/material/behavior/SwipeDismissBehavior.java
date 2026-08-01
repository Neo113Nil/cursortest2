package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.c40;
import defpackage.d0;
import defpackage.f80;
import defpackage.h80;
import defpackage.hd;
import defpackage.i7;
import defpackage.uv;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends hd {
    public h80 a;
    public i7 b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public float f = 0.0f;
    public float g = 0.5f;
    public final c40 h = new c40(this);

    @Override // defpackage.hd
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = new h80(coordinatorLayout.getContext(), coordinatorLayout, this.h);
            }
            if (!this.d && this.a.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hd
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            f80.j(view, 1048576);
            f80.h(view, 0);
            if (r(view)) {
                f80.k(view, d0.i, new uv(this));
            }
        }
        return false;
    }

    @Override // defpackage.hd
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.i(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
