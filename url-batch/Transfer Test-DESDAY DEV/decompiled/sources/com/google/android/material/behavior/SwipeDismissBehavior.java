package com.google.android.material.behavior;

import K.T;
import T.f;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import x.AbstractC0346a;
import x0.C0347a;
import x0.C0348b;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0346a {

    /* renamed from: a, reason: collision with root package name */
    public f f1769a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1770b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1771c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1772e = RecyclerView.f1570A0;

    /* renamed from: f, reason: collision with root package name */
    public float f1773f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0347a f1774g = new C0347a(this);

    @Override // x.AbstractC0346a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1770b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1770b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1770b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1769a == null) {
            this.f1769a = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f1774g);
        }
        return !this.f1771c && this.f1769a.p(motionEvent);
    }

    @Override // x.AbstractC0346a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = T.f372a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            T.i(view, 1048576);
            T.g(view, 0);
            if (r(view)) {
                T.j(view, L.f.f476j, new C0348b(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0346a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1769a == null) {
            return false;
        }
        if (this.f1771c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1769a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
