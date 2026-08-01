package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0191M;
import l.C0194P;
import l.J0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0155d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2714b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0155d(int i, Object obj) {
        this.f2713a = i;
        this.f2714b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2713a) {
            case 0:
                ViewOnKeyListenerC0158g viewOnKeyListenerC0158g = (ViewOnKeyListenerC0158g) this.f2714b;
                if (viewOnKeyListenerC0158g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0158g.h;
                    if (arrayList.size() > 0 && !((C0157f) arrayList.get(0)).f2718a.f2888y) {
                        View view = viewOnKeyListenerC0158g.f2731o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0157f) it.next()).f2718a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0158g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0150D viewOnKeyListenerC0150D = (ViewOnKeyListenerC0150D) this.f2714b;
                if (viewOnKeyListenerC0150D.a()) {
                    J0 j02 = viewOnKeyListenerC0150D.h;
                    if (!j02.f2888y) {
                        View view2 = viewOnKeyListenerC0150D.f2688m;
                        if (view2 != null && view2.isShown()) {
                            j02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0150D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0194P c0194p = (C0194P) this.f2714b;
                if (!c0194p.getInternalPopup().a()) {
                    c0194p.f2931f.g(c0194p.getTextDirection(), c0194p.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0194p.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0191M c0191m = (C0191M) this.f2714b;
                C0194P c0194p2 = c0191m.f2919G;
                c0191m.getClass();
                if (!c0194p2.isAttachedToWindow() || !c0194p2.getGlobalVisibleRect(c0191m.f2918E)) {
                    c0191m.dismiss();
                    break;
                } else {
                    c0191m.r();
                    c0191m.i();
                    break;
                }
                break;
        }
    }
}
