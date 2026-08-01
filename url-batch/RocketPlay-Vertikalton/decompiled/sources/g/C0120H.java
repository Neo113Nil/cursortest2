package g;

import K.T;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: g.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120H extends F1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f2600b;

    public /* synthetic */ C0120H(J j2, int i) {
        this.f2599a = i;
        this.f2600b = j2;
    }

    @Override // K.d0
    public final void a() {
        View view;
        J j2 = this.f2600b;
        switch (this.f2599a) {
            case 0:
                if (j2.f2619r && (view = j2.f2611j) != null) {
                    view.setTranslationY(RecyclerView.f1949A0);
                    j2.f2610g.setTranslationY(RecyclerView.f1949A0);
                }
                j2.f2610g.setVisibility(8);
                j2.f2610g.setTransitioning(false);
                j2.f2623v = null;
                B.j jVar = j2.f2615n;
                if (jVar != null) {
                    jVar.D(j2.f2614m);
                    j2.f2614m = null;
                    j2.f2615n = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = j2.f2609f;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = T.f633a;
                    K.F.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                j2.f2623v = null;
                j2.f2610g.requestLayout();
                break;
        }
    }
}
