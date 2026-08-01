package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ez extends x {
    public final fz d;
    public final WeakHashMap e = new WeakHashMap();

    public ez(fz fzVar) {
        this.d = fzVar;
    }

    @Override // defpackage.x
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        x xVar = (x) this.e.get(view);
        return xVar != null ? xVar.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.x
    public final j0 b(View view) {
        x xVar = (x) this.e.get(view);
        return xVar != null ? xVar.b(view) : super.b(view);
    }

    @Override // defpackage.x
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        x xVar = (x) this.e.get(view);
        if (xVar != null) {
            xVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.x
    public final void d(View view, k0 k0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
        fz fzVar = this.d;
        RecyclerView recyclerView = fzVar.d;
        RecyclerView recyclerView2 = fzVar.d;
        boolean O = recyclerView.O();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (O || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().X(view, k0Var);
        x xVar = (x) this.e.get(view);
        if (xVar != null) {
            xVar.d(view, k0Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.x
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        x xVar = (x) this.e.get(view);
        if (xVar != null) {
            xVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.x
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        x xVar = (x) this.e.get(viewGroup);
        return xVar != null ? xVar.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.x
    public final boolean g(View view, int i, Bundle bundle) {
        fz fzVar = this.d;
        RecyclerView recyclerView = fzVar.d;
        RecyclerView recyclerView2 = fzVar.d;
        if (recyclerView.O() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        x xVar = (x) this.e.get(view);
        if (xVar != null) {
            if (xVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        ty tyVar = recyclerView2.getLayoutManager().b.h;
        return false;
    }

    @Override // defpackage.x
    public final void h(View view, int i) {
        x xVar = (x) this.e.get(view);
        if (xVar != null) {
            xVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.x
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        x xVar = (x) this.e.get(view);
        if (xVar != null) {
            xVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
