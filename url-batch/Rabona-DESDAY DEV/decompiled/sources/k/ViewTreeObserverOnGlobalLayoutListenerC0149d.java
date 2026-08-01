package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0219O;
import l.C0222S;
import l.L0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0149d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2646b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0149d(int i, Object obj) {
        this.f2645a = i;
        this.f2646b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2645a) {
            case 0:
                ViewOnKeyListenerC0152g viewOnKeyListenerC0152g = (ViewOnKeyListenerC0152g) this.f2646b;
                if (viewOnKeyListenerC0152g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0152g.h;
                    if (arrayList.size() > 0 && !((C0151f) arrayList.get(0)).f2650a.f2884y) {
                        View view = viewOnKeyListenerC0152g.f2663o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0151f) it.next()).f2650a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0152g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0144D viewOnKeyListenerC0144D = (ViewOnKeyListenerC0144D) this.f2646b;
                if (viewOnKeyListenerC0144D.a()) {
                    L0 l02 = viewOnKeyListenerC0144D.h;
                    if (!l02.f2884y) {
                        View view2 = viewOnKeyListenerC0144D.f2620m;
                        if (view2 != null && view2.isShown()) {
                            l02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0144D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0222S c0222s = (C0222S) this.f2646b;
                if (!c0222s.getInternalPopup().a()) {
                    c0222s.f2927f.g(c0222s.getTextDirection(), c0222s.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0222s.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0219O c0219o = (C0219O) this.f2646b;
                C0222S c0222s2 = c0219o.f2915G;
                c0219o.getClass();
                if (!c0222s2.isAttachedToWindow() || !c0222s2.getGlobalVisibleRect(c0219o.f2914E)) {
                    c0219o.dismiss();
                    break;
                } else {
                    c0219o.s();
                    c0219o.i();
                    break;
                }
                break;
        }
    }
}
