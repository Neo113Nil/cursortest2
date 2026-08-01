package com.google.android.material.behavior;

import K.S;
import S.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import l.C0238n;
import s0.C0298a;
import x.AbstractC0333a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0333a {

    /* renamed from: a, reason: collision with root package name */
    public e f1543a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1544b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1545c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1546e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1547f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0298a f1548g = new C0298a(this);

    @Override // x.AbstractC0333a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1544b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1544b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1544b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1543a == null) {
            this.f1543a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1548g);
        }
        return !this.f1545c && this.f1543a.p(motionEvent);
    }

    @Override // x.AbstractC0333a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = S.f360a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S.i(view, 1048576);
            S.g(view, 0);
            if (r(view)) {
                S.j(view, L.e.f475j, new C0238n(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0333a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1543a == null) {
            return false;
        }
        if (this.f1545c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1543a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
