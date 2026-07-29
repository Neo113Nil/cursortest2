package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Y4 extends AbstractC1074g00 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Y4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.InterfaceC1008f00
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = ((W4) obj).i;
                layoutInflaterFactory2C1213i5.C.setAlpha(1.0f);
                layoutInflaterFactory2C1213i5.F.d(null);
                layoutInflaterFactory2C1213i5.F = null;
                break;
            case 1:
                LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i52 = (LayoutInflaterFactory2C1213i5) obj;
                layoutInflaterFactory2C1213i52.C.setAlpha(1.0f);
                layoutInflaterFactory2C1213i52.F.d(null);
                layoutInflaterFactory2C1213i52.F = null;
                break;
            default:
                LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i53 = (LayoutInflaterFactory2C1213i5) ((C2002u5) obj).j;
                layoutInflaterFactory2C1213i53.C.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C1213i53.D;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C1213i53.C.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1213i53.C.getParent();
                    WeakHashMap weakHashMap = AZ.a;
                    AbstractC1637oZ.c(view);
                }
                layoutInflaterFactory2C1213i53.C.e();
                layoutInflaterFactory2C1213i53.F.d(null);
                layoutInflaterFactory2C1213i53.F = null;
                ViewGroup viewGroup = layoutInflaterFactory2C1213i53.H;
                WeakHashMap weakHashMap2 = AZ.a;
                AbstractC1637oZ.c(viewGroup);
                break;
        }
    }

    @Override // o.AbstractC1074g00, o.InterfaceC1008f00
    public void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((W4) obj).i.C.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) obj;
                layoutInflaterFactory2C1213i5.C.setVisibility(0);
                if (layoutInflaterFactory2C1213i5.C.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1213i5.C.getParent();
                    WeakHashMap weakHashMap = AZ.a;
                    AbstractC1637oZ.c(view);
                    break;
                }
                break;
        }
    }
}
