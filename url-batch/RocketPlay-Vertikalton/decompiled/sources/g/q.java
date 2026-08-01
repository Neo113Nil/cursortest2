package g;

import K.T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q extends F1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2691b;

    public /* synthetic */ q(int i, Object obj) {
        this.f2690a = i;
        this.f2691b = obj;
    }

    @Override // K.d0
    public final void a() {
        Object obj = this.f2691b;
        switch (this.f2690a) {
            case 0:
                o oVar = (o) obj;
                oVar.f2687b.f2759v.setAlpha(1.0f);
                z zVar = oVar.f2687b;
                zVar.f2762y.d(null);
                zVar.f2762y = null;
                break;
            case 1:
                z zVar2 = (z) obj;
                zVar2.f2759v.setAlpha(1.0f);
                zVar2.f2762y.d(null);
                zVar2.f2762y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((z) jVar.f73c).f2759v.setVisibility(8);
                z zVar3 = (z) jVar.f73c;
                PopupWindow popupWindow = zVar3.f2760w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (zVar3.f2759v.getParent() instanceof View) {
                    View view = (View) zVar3.f2759v.getParent();
                    WeakHashMap weakHashMap = T.f633a;
                    K.F.c(view);
                }
                zVar3.f2759v.e();
                zVar3.f2762y.d(null);
                zVar3.f2762y = null;
                ViewGroup viewGroup = zVar3.f2715A;
                WeakHashMap weakHashMap2 = T.f633a;
                K.F.c(viewGroup);
                break;
        }
    }

    @Override // F1.d, K.d0
    public void g() {
        Object obj = this.f2691b;
        switch (this.f2690a) {
            case 0:
                ((o) obj).f2687b.f2759v.setVisibility(0);
                break;
            case 1:
                z zVar = (z) obj;
                zVar.f2759v.setVisibility(0);
                if (zVar.f2759v.getParent() instanceof View) {
                    View view = (View) zVar.f2759v.getParent();
                    WeakHashMap weakHashMap = T.f633a;
                    K.F.c(view);
                    break;
                }
                break;
        }
    }
}
