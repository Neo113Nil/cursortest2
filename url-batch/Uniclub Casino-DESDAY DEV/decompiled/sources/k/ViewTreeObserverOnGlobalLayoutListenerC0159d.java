package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0208O;
import l.C0211S;
import l.L0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0159d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2649b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0159d(int i, Object obj) {
        this.f2648a = i;
        this.f2649b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2648a) {
            case 0:
                ViewOnKeyListenerC0162g viewOnKeyListenerC0162g = (ViewOnKeyListenerC0162g) this.f2649b;
                if (viewOnKeyListenerC0162g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0162g.h;
                    if (arrayList.size() > 0 && !((C0161f) arrayList.get(0)).f2653a.f2887y) {
                        View view = viewOnKeyListenerC0162g.f2666o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0161f) it.next()).f2653a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0162g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0154D viewOnKeyListenerC0154D = (ViewOnKeyListenerC0154D) this.f2649b;
                if (viewOnKeyListenerC0154D.a()) {
                    L0 l02 = viewOnKeyListenerC0154D.h;
                    if (!l02.f2887y) {
                        View view2 = viewOnKeyListenerC0154D.f2623m;
                        if (view2 != null && view2.isShown()) {
                            l02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0154D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0211S c0211s = (C0211S) this.f2649b;
                if (!c0211s.getInternalPopup().a()) {
                    c0211s.f2930f.g(c0211s.getTextDirection(), c0211s.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0211s.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0208O c0208o = (C0208O) this.f2649b;
                C0211S c0211s2 = c0208o.f2918G;
                c0208o.getClass();
                if (!c0211s2.isAttachedToWindow() || !c0211s2.getGlobalVisibleRect(c0208o.f2917E)) {
                    c0208o.dismiss();
                    break;
                } else {
                    c0208o.s();
                    c0208o.i();
                    break;
                }
                break;
        }
    }
}
