package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class aa0 extends y80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca0 b;

    public /* synthetic */ aa0(ca0 ca0Var, int i) {
        this.a = i;
        this.b = ca0Var;
    }

    @Override // defpackage.x80
    public final void a() {
        View view;
        int i = this.a;
        ca0 ca0Var = this.b;
        switch (i) {
            case 0:
                if (ca0Var.o && (view = ca0Var.g) != null) {
                    view.setTranslationY(0.0f);
                    ca0Var.d.setTranslationY(0.0f);
                }
                ca0Var.d.setVisibility(8);
                ca0Var.d.setTransitioning(false);
                ca0Var.s = null;
                o4 o4Var = ca0Var.k;
                if (o4Var != null) {
                    o4Var.D(ca0Var.j);
                    ca0Var.j = null;
                    ca0Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = ca0Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = f80.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                ca0Var.s = null;
                ca0Var.d.requestLayout();
                break;
        }
    }
}
