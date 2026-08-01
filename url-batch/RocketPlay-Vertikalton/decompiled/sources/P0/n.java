package P0;

import K.F;
import K.T;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0188D;
import k.ViewOnKeyListenerC0196g;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f956b;

    public /* synthetic */ n(int i, Object obj) {
        this.f955a = i;
        this.f956b = obj;
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
        Object obj = this.f956b;
        switch (this.f955a) {
            case 0:
                p pVar = (p) obj;
                if (pVar.f977u != null && (accessibilityManager = pVar.f976t) != null) {
                    WeakHashMap weakHashMap = T.f633a;
                    if (pVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(pVar.f977u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = T.f633a;
                F.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f955a) {
            case 0:
                p pVar = (p) this.f956b;
                P.b bVar = pVar.f977u;
                if (bVar != null && (accessibilityManager = pVar.f976t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(bVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0196g viewOnKeyListenerC0196g = (ViewOnKeyListenerC0196g) this.f956b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0196g.f3171x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0196g.f3171x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0196g.f3171x.removeGlobalOnLayoutListener(viewOnKeyListenerC0196g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0188D viewOnKeyListenerC0188D = (ViewOnKeyListenerC0188D) this.f956b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0188D.f3121o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0188D.f3121o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0188D.f3121o.removeGlobalOnLayoutListener(viewOnKeyListenerC0188D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
