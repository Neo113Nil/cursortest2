package com.google.android.material.snackbar;

import A1.d;
import M0.e;
import O0.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final e h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(5);
        this.f2140e = Math.min(Math.max(RecyclerView.f1949A0, 0.1f), 1.0f);
        this.f2141f = Math.min(Math.max(RecyclerView.f1949A0, 0.6f), 1.0f);
        this.d = 0;
        this.h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, x.AbstractC0379a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (d.f36c == null) {
                    d.f36c = new d(10);
                }
                synchronized (d.f36c.f38b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (d.f36c == null) {
                d.f36c = new d(10);
            }
            synchronized (d.f36c.f38b) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.h.getClass();
        return view instanceof c;
    }
}
