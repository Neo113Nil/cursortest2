package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class fz extends x {
    public final RecyclerView d;
    public final ez e;

    public fz(RecyclerView recyclerView) {
        this.d = recyclerView;
        ez ezVar = this.e;
        if (ezVar != null) {
            this.e = ezVar;
        } else {
            this.e = new ez(this);
        }
    }

    @Override // defpackage.x
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // defpackage.x
    public final void d(View view, k0 k0Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, k0Var.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        ny layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.V(recyclerView2.h, recyclerView2.l0, k0Var);
    }

    @Override // defpackage.x
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().i0(i, bundle);
    }
}
