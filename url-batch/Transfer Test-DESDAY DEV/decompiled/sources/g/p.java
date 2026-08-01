package g;

import K.T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2251f;

    public /* synthetic */ p(int i, Object obj) {
        this.f2250e = i;
        this.f2251f = obj;
    }

    @Override // K.d0
    public final void a() {
        Object obj = this.f2251f;
        switch (this.f2250e) {
            case 0:
                n nVar = (n) obj;
                nVar.f2247b.f2320v.setAlpha(1.0f);
                y yVar = nVar.f2247b;
                yVar.f2323y.d(null);
                yVar.f2323y = null;
                break;
            case 1:
                y yVar2 = (y) obj;
                yVar2.f2320v.setAlpha(1.0f);
                yVar2.f2323y.d(null);
                yVar2.f2323y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((y) jVar.f57c).f2320v.setVisibility(8);
                y yVar3 = (y) jVar.f57c;
                PopupWindow popupWindow = yVar3.f2321w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (yVar3.f2320v.getParent() instanceof View) {
                    View view = (View) yVar3.f2320v.getParent();
                    WeakHashMap weakHashMap = T.f372a;
                    K.F.c(view);
                }
                yVar3.f2320v.e();
                yVar3.f2323y.d(null);
                yVar3.f2323y = null;
                ViewGroup viewGroup = yVar3.f2276B;
                WeakHashMap weakHashMap2 = T.f372a;
                K.F.c(viewGroup);
                break;
        }
    }

    @Override // A.c, K.d0
    public void c() {
        Object obj = this.f2251f;
        switch (this.f2250e) {
            case 0:
                ((n) obj).f2247b.f2320v.setVisibility(0);
                break;
            case 1:
                y yVar = (y) obj;
                yVar.f2320v.setVisibility(0);
                if (yVar.f2320v.getParent() instanceof View) {
                    View view = (View) yVar.f2320v.getParent();
                    WeakHashMap weakHashMap = T.f372a;
                    K.F.c(view);
                    break;
                }
                break;
        }
    }
}
