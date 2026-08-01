package f0;

import K.C0001b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Y extends C0001b {
    public final Z d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2029e = new WeakHashMap();

    public Y(Z z2) {
        this.d = z2;
    }

    @Override // K.C0001b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f2029e.get(view);
        return c0001b != null ? c0001b.a(view, accessibilityEvent) : this.f372a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // K.C0001b
    public final C.g b(View view) {
        C0001b c0001b = (C0001b) this.f2029e.get(view);
        return c0001b != null ? c0001b.b(view) : super.b(view);
    }

    @Override // K.C0001b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f2029e.get(view);
        if (c0001b != null) {
            c0001b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // K.C0001b
    public final void d(View view, L.j jVar) {
        Z z2 = this.d;
        boolean K2 = z2.d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f372a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f482a;
        if (!K2) {
            RecyclerView recyclerView = z2.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(view, jVar);
                C0001b c0001b = (C0001b) this.f2029e.get(view);
                if (c0001b != null) {
                    c0001b.d(view, jVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // K.C0001b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f2029e.get(view);
        if (c0001b != null) {
            c0001b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // K.C0001b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f2029e.get(viewGroup);
        return c0001b != null ? c0001b.f(viewGroup, view, accessibilityEvent) : this.f372a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // K.C0001b
    public final boolean g(View view, int i, Bundle bundle) {
        Z z2 = this.d;
        if (!z2.d.K()) {
            RecyclerView recyclerView = z2.d;
            if (recyclerView.getLayoutManager() != null) {
                C0001b c0001b = (C0001b) this.f2029e.get(view);
                if (c0001b != null) {
                    if (c0001b.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                O o2 = recyclerView.getLayoutManager().f1964b.f1437b;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // K.C0001b
    public final void h(View view, int i) {
        C0001b c0001b = (C0001b) this.f2029e.get(view);
        if (c0001b != null) {
            c0001b.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // K.C0001b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f2029e.get(view);
        if (c0001b != null) {
            c0001b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
