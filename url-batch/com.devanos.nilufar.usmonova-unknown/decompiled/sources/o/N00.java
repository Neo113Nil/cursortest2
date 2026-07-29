package o;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class N00 extends AbstractC1074g00 {
    public final /* synthetic */ int a;
    public final /* synthetic */ P00 b;

    public /* synthetic */ N00(P00 p00, int i) {
        this.a = i;
        this.b = p00;
    }

    @Override // o.InterfaceC1008f00
    public final void a() {
        View view;
        int i = this.a;
        P00 p00 = this.b;
        switch (i) {
            case 0:
                if (p00.f80o && (view = p00.g) != null) {
                    view.setTranslationY(0.0f);
                    p00.d.setTranslationY(0.0f);
                }
                p00.d.setVisibility(8);
                p00.d.setTransitioning(false);
                p00.s = null;
                C2002u5 c2002u5 = p00.k;
                if (c2002u5 != null) {
                    c2002u5.e(p00.j);
                    p00.j = null;
                    p00.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = p00.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AZ.a;
                    AbstractC1637oZ.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                p00.s = null;
                p00.d.requestLayout();
                break;
        }
    }
}
