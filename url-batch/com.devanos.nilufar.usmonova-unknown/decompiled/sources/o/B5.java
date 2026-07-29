package o;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class B5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ B5(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.h) {
            case 0:
                K5 k5 = (K5) this.i;
                if (!k5.getInternalPopup().a()) {
                    k5.m.m(k5.getTextDirection(), k5.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = k5.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                H5 h5 = (H5) this.i;
                K5 k52 = h5.M;
                h5.getClass();
                if (!k52.isAttachedToWindow() || !k52.getGlobalVisibleRect(h5.K)) {
                    h5.dismiss();
                    break;
                } else {
                    h5.s();
                    h5.d();
                    break;
                }
                break;
            case 2:
                ViewOnKeyListenerC1901sa viewOnKeyListenerC1901sa = (ViewOnKeyListenerC1901sa) this.i;
                ArrayList arrayList = viewOnKeyListenerC1901sa.f221o;
                if (viewOnKeyListenerC1901sa.a() && arrayList.size() > 0 && !((C1835ra) arrayList.get(0)).a.E) {
                    View view = viewOnKeyListenerC1901sa.v;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C1835ra) it.next()).a.d();
                        }
                        break;
                    } else {
                        viewOnKeyListenerC1901sa.dismiss();
                        break;
                    }
                }
                break;
            default:
                ViewOnKeyListenerC1171hT viewOnKeyListenerC1171hT = (ViewOnKeyListenerC1171hT) this.i;
                C2009uC c2009uC = viewOnKeyListenerC1171hT.f175o;
                if (viewOnKeyListenerC1171hT.a() && !c2009uC.E) {
                    View view2 = viewOnKeyListenerC1171hT.t;
                    if (view2 != null && view2.isShown()) {
                        c2009uC.d();
                        break;
                    } else {
                        viewOnKeyListenerC1171hT.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
