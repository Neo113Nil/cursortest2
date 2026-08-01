package g;

import K.S;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2263b;

    public /* synthetic */ I(K k2, int i) {
        this.f2262a = i;
        this.f2263b = k2;
    }

    @Override // K.a0
    public final void a() {
        View view;
        K k2 = this.f2263b;
        switch (this.f2262a) {
            case 0:
                if (k2.f2284s && (view = k2.f2276k) != null) {
                    view.setTranslationY(0.0f);
                    k2.h.setTranslationY(0.0f);
                }
                k2.h.setVisibility(8);
                k2.h.setTransitioning(false);
                k2.f2288w = null;
                B.j jVar = k2.f2280o;
                if (jVar != null) {
                    jVar.A(k2.f2279n);
                    k2.f2279n = null;
                    k2.f2280o = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2274g;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = S.f360a;
                    K.E.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2288w = null;
                k2.h.requestLayout();
                break;
        }
    }
}
