package g0;

import K.C0007b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b0 extends C0007b {
    public final RecyclerView d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f2854e;

    public b0(RecyclerView recyclerView) {
        this.d = recyclerView;
        a0 a0Var = this.f2854e;
        if (a0Var != null) {
            this.f2854e = a0Var;
        } else {
            this.f2854e = new a0(this);
        }
    }

    @Override // K.C0007b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.N()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // K.C0007b
    public final void d(View view, L.j jVar) {
        this.f648a.onInitializeAccessibilityNodeInfo(view, jVar.f795a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0139I layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2778b;
        layoutManager.V(recyclerView2.f1983c, recyclerView2.f1987e0, jVar);
    }

    @Override // K.C0007b
    public final boolean g(View view, int i, Bundle bundle) {
        int G2;
        int E2;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC0139I layoutManager = recyclerView.getLayoutManager();
        C0145O c0145o = layoutManager.f2778b.f1983c;
        int i2 = layoutManager.f2788o;
        int i3 = layoutManager.f2787n;
        Rect rect = new Rect();
        if (layoutManager.f2778b.getMatrix().isIdentity() && layoutManager.f2778b.getGlobalVisibleRect(rect)) {
            i2 = rect.height();
            i3 = rect.width();
        }
        if (i == 4096) {
            G2 = layoutManager.f2778b.canScrollVertically(1) ? (i2 - layoutManager.G()) - layoutManager.D() : 0;
            if (layoutManager.f2778b.canScrollHorizontally(1)) {
                E2 = (i3 - layoutManager.E()) - layoutManager.F();
            }
            E2 = 0;
        } else if (i != 8192) {
            G2 = 0;
            E2 = 0;
        } else {
            G2 = layoutManager.f2778b.canScrollVertically(-1) ? -((i2 - layoutManager.G()) - layoutManager.D()) : 0;
            if (layoutManager.f2778b.canScrollHorizontally(-1)) {
                E2 = -((i3 - layoutManager.E()) - layoutManager.F());
            }
            E2 = 0;
        }
        if (G2 == 0 && E2 == 0) {
            return false;
        }
        layoutManager.f2778b.g0(E2, G2, true);
        return true;
    }
}
