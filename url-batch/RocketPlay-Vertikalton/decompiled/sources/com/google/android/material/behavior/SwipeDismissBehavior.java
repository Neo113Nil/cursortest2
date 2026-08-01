package com.google.android.material.behavior;

import K.T;
import T.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import l.C0265n;
import v0.C0376a;
import x.AbstractC0379a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0379a {

    /* renamed from: a, reason: collision with root package name */
    public e f2137a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2138b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2139c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f2140e = RecyclerView.f1949A0;

    /* renamed from: f, reason: collision with root package name */
    public float f2141f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0376a f2142g = new C0376a(this);

    @Override // x.AbstractC0379a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f2138b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2138b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2138b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f2137a == null) {
            this.f2137a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2142g);
        }
        return !this.f2139c && this.f2137a.p(motionEvent);
    }

    @Override // x.AbstractC0379a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = T.f633a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            T.i(view, 1048576);
            T.g(view, 0);
            if (r(view)) {
                T.j(view, L.e.f789j, new C0265n(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0379a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f2137a == null) {
            return false;
        }
        if (this.f2139c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2137a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
