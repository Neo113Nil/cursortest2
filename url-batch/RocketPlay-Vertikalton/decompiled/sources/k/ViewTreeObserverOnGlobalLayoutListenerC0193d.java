package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0234N;
import l.C0237Q;
import l.L0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0193d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3145b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0193d(int i, Object obj) {
        this.f3144a = i;
        this.f3145b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3144a) {
            case 0:
                ViewOnKeyListenerC0196g viewOnKeyListenerC0196g = (ViewOnKeyListenerC0196g) this.f3145b;
                if (viewOnKeyListenerC0196g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0196g.h;
                    if (arrayList.size() > 0 && !((C0195f) arrayList.get(0)).f3149a.f3320y) {
                        View view = viewOnKeyListenerC0196g.f3162o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0195f) it.next()).f3149a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0196g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0188D viewOnKeyListenerC0188D = (ViewOnKeyListenerC0188D) this.f3145b;
                if (viewOnKeyListenerC0188D.a()) {
                    L0 l02 = viewOnKeyListenerC0188D.h;
                    if (!l02.f3320y) {
                        View view2 = viewOnKeyListenerC0188D.f3119m;
                        if (view2 != null && view2.isShown()) {
                            l02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0188D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0237Q c0237q = (C0237Q) this.f3145b;
                if (!c0237q.getInternalPopup().a()) {
                    c0237q.f3362f.g(c0237q.getTextDirection(), c0237q.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0237q.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0234N c0234n = (C0234N) this.f3145b;
                C0237Q c0237q2 = c0234n.f3344G;
                c0234n.getClass();
                if (!c0237q2.isAttachedToWindow() || !c0237q2.getGlobalVisibleRect(c0234n.f3343E)) {
                    c0234n.dismiss();
                    break;
                } else {
                    c0234n.s();
                    c0234n.i();
                    break;
                }
                break;
        }
    }
}
