package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class a5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ v4 f;
    public final /* synthetic */ b5 g;

    public a5(b5 b5Var, v4 v4Var) {
        this.g = b5Var;
        this.f = v4Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.g.L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f);
        }
    }
}
