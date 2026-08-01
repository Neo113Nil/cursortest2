package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ld implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout f;

    public ld(CoordinatorLayout coordinatorLayout) {
        this.f = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f.p(0);
        return true;
    }
}
