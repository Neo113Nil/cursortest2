package R0;

import K.F;
import K.T;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0150D;
import k.ViewOnKeyListenerC0158g;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f690b;

    public /* synthetic */ n(int i, Object obj) {
        this.f689a = i;
        this.f690b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f690b;
        switch (this.f689a) {
            case 0:
                p pVar = (p) obj;
                if (pVar.f711u != null && (accessibilityManager = pVar.f710t) != null) {
                    WeakHashMap weakHashMap = T.f372a;
                    if (pVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(pVar.f711u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = T.f372a;
                F.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f689a) {
            case 0:
                p pVar = (p) this.f690b;
                P.b bVar = pVar.f711u;
                if (bVar != null && (accessibilityManager = pVar.f710t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(bVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0158g viewOnKeyListenerC0158g = (ViewOnKeyListenerC0158g) this.f690b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0158g.f2740x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0158g.f2740x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0158g.f2740x.removeGlobalOnLayoutListener(viewOnKeyListenerC0158g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0150D viewOnKeyListenerC0150D = (ViewOnKeyListenerC0150D) this.f690b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0150D.f2690o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0150D.f2690o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0150D.f2690o.removeGlobalOnLayoutListener(viewOnKeyListenerC0150D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
