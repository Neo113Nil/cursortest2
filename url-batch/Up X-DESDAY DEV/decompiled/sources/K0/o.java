package K0;

import K.T;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0144D;
import k.ViewOnKeyListenerC0152g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f517b;

    public /* synthetic */ o(int i, Object obj) {
        this.f516a = i;
        this.f517b = obj;
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
        Object obj = this.f517b;
        switch (this.f516a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f538u != null && (accessibilityManager = qVar.f537t) != null) {
                    WeakHashMap weakHashMap = T.f381a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(qVar.f538u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = T.f381a;
                K.F.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f516a) {
            case 0:
                q qVar = (q) this.f517b;
                k kVar = qVar.f538u;
                if (kVar != null && (accessibilityManager = qVar.f537t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0152g viewOnKeyListenerC0152g = (ViewOnKeyListenerC0152g) this.f517b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0152g.f2650x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0152g.f2650x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0152g.f2650x.removeGlobalOnLayoutListener(viewOnKeyListenerC0152g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0144D viewOnKeyListenerC0144D = (ViewOnKeyListenerC0144D) this.f517b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0144D.f2600o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0144D.f2600o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0144D.f2600o.removeGlobalOnLayoutListener(viewOnKeyListenerC0144D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
