package g;

import K.S;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2347b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2346a = i;
        this.f2347b = obj;
    }

    @Override // K.a0
    public final void a() {
        Object obj = this.f2347b;
        switch (this.f2346a) {
            case 0:
                p pVar = (p) obj;
                pVar.f2343b.f2241v.setAlpha(1.0f);
                LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = pVar.f2343b;
                layoutInflaterFactory2C0122A.f2244y.d(null);
                layoutInflaterFactory2C0122A.f2244y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A2 = (LayoutInflaterFactory2C0122A) obj;
                layoutInflaterFactory2C0122A2.f2241v.setAlpha(1.0f);
                layoutInflaterFactory2C0122A2.f2244y.d(null);
                layoutInflaterFactory2C0122A2.f2244y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((LayoutInflaterFactory2C0122A) jVar.f29c).f2241v.setVisibility(8);
                LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A3 = (LayoutInflaterFactory2C0122A) jVar.f29c;
                PopupWindow popupWindow = layoutInflaterFactory2C0122A3.f2242w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0122A3.f2241v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0122A3.f2241v.getParent();
                    WeakHashMap weakHashMap = S.f360a;
                    K.E.c(view);
                }
                layoutInflaterFactory2C0122A3.f2241v.e();
                layoutInflaterFactory2C0122A3.f2244y.d(null);
                layoutInflaterFactory2C0122A3.f2244y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0122A3.f2197B;
                WeakHashMap weakHashMap2 = S.f360a;
                K.E.c(viewGroup);
                break;
        }
    }

    @Override // q1.l, K.a0
    public void g() {
        Object obj = this.f2347b;
        switch (this.f2346a) {
            case 0:
                ((p) obj).f2343b.f2241v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = (LayoutInflaterFactory2C0122A) obj;
                layoutInflaterFactory2C0122A.f2241v.setVisibility(0);
                if (layoutInflaterFactory2C0122A.f2241v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0122A.f2241v.getParent();
                    WeakHashMap weakHashMap = S.f360a;
                    K.E.c(view);
                    break;
                }
                break;
        }
    }
}
