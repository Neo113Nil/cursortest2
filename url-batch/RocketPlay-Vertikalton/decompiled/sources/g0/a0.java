package g0;

import K.C0007b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a0 extends C0007b {
    public final b0 d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2849e = new WeakHashMap();

    public a0(b0 b0Var) {
        this.d = b0Var;
    }

    @Override // K.C0007b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0007b c0007b = (C0007b) this.f2849e.get(view);
        return c0007b != null ? c0007b.a(view, accessibilityEvent) : this.f648a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // K.C0007b
    public final A1.d b(View view) {
        C0007b c0007b = (C0007b) this.f2849e.get(view);
        return c0007b != null ? c0007b.b(view) : super.b(view);
    }

    @Override // K.C0007b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0007b c0007b = (C0007b) this.f2849e.get(view);
        if (c0007b != null) {
            c0007b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // K.C0007b
    public final void d(View view, L.j jVar) {
        b0 b0Var = this.d;
        boolean N2 = b0Var.d.N();
        View.AccessibilityDelegate accessibilityDelegate = this.f648a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f795a;
        if (!N2) {
            RecyclerView recyclerView = b0Var.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().W(view, jVar);
                C0007b c0007b = (C0007b) this.f2849e.get(view);
                if (c0007b != null) {
                    c0007b.d(view, jVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // K.C0007b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0007b c0007b = (C0007b) this.f2849e.get(view);
        if (c0007b != null) {
            c0007b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // K.C0007b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0007b c0007b = (C0007b) this.f2849e.get(viewGroup);
        return c0007b != null ? c0007b.f(viewGroup, view, accessibilityEvent) : this.f648a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // K.C0007b
    public final boolean g(View view, int i, Bundle bundle) {
        b0 b0Var = this.d;
        if (!b0Var.d.N()) {
            RecyclerView recyclerView = b0Var.d;
            if (recyclerView.getLayoutManager() != null) {
                C0007b c0007b = (C0007b) this.f2849e.get(view);
                if (c0007b != null) {
                    if (c0007b.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                C0145O c0145o = recyclerView.getLayoutManager().f2778b.f1983c;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // K.C0007b
    public final void h(View view, int i) {
        C0007b c0007b = (C0007b) this.f2849e.get(view);
        if (c0007b != null) {
            c0007b.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // K.C0007b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0007b c0007b = (C0007b) this.f2849e.get(view);
        if (c0007b != null) {
            c0007b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
