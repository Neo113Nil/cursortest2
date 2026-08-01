package g0;

import K.C0002b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a0 extends C0002b {
    public final b0 d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2411e = new WeakHashMap();

    public a0(b0 b0Var) {
        this.d = b0Var;
    }

    @Override // K.C0002b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2411e.get(view);
        return c0002b != null ? c0002b.a(view, accessibilityEvent) : this.f386a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // K.C0002b
    public final A0.h b(View view) {
        C0002b c0002b = (C0002b) this.f2411e.get(view);
        return c0002b != null ? c0002b.b(view) : super.b(view);
    }

    @Override // K.C0002b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2411e.get(view);
        if (c0002b != null) {
            c0002b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // K.C0002b
    public final void d(View view, L.k kVar) {
        b0 b0Var = this.d;
        boolean N2 = b0Var.d.N();
        View.AccessibilityDelegate accessibilityDelegate = this.f386a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f482a;
        if (!N2) {
            RecyclerView recyclerView = b0Var.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().W(view, kVar);
                C0002b c0002b = (C0002b) this.f2411e.get(view);
                if (c0002b != null) {
                    c0002b.d(view, kVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // K.C0002b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2411e.get(view);
        if (c0002b != null) {
            c0002b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // K.C0002b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2411e.get(viewGroup);
        return c0002b != null ? c0002b.f(viewGroup, view, accessibilityEvent) : this.f386a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // K.C0002b
    public final boolean g(View view, int i, Bundle bundle) {
        b0 b0Var = this.d;
        if (!b0Var.d.N()) {
            RecyclerView recyclerView = b0Var.d;
            if (recyclerView.getLayoutManager() != null) {
                C0002b c0002b = (C0002b) this.f2411e.get(view);
                if (c0002b != null) {
                    if (c0002b.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                O o2 = recyclerView.getLayoutManager().f2340b.f1604c;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // K.C0002b
    public final void h(View view, int i) {
        C0002b c0002b = (C0002b) this.f2411e.get(view);
        if (c0002b != null) {
            c0002b.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // K.C0002b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2411e.get(view);
        if (c0002b != null) {
            c0002b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
