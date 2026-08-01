package com.google.android.material.behavior;

import K.T;
import S.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import l.C0249n;
import q0.C0293a;
import x.AbstractC0336a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0336a {

    /* renamed from: a, reason: collision with root package name */
    public e f1537a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1538b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1539c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1540e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1541f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0293a f1542g = new C0293a(this);

    @Override // x.AbstractC0336a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1538b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1538b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1538b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1537a == null) {
            this.f1537a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1542g);
        }
        return !this.f1539c && this.f1537a.p(motionEvent);
    }

    @Override // x.AbstractC0336a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = T.f381a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            T.i(view, 1048576);
            T.g(view, 0);
            if (r(view)) {
                T.j(view, L.e.f601j, new C0249n(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0336a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1537a == null) {
            return false;
        }
        if (this.f1539c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1537a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
