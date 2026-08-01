package M0;

import K.S;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0154D;
import k.ViewOnKeyListenerC0162g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f538b;

    public /* synthetic */ o(int i, Object obj) {
        this.f537a = i;
        this.f538b = obj;
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
        Object obj = this.f538b;
        switch (this.f537a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f559u != null && (accessibilityManager = qVar.f558t) != null) {
                    WeakHashMap weakHashMap = S.f360a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(qVar.f559u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = S.f360a;
                K.E.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f537a) {
            case 0:
                q qVar = (q) this.f538b;
                k kVar = qVar.f559u;
                if (kVar != null && (accessibilityManager = qVar.f558t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0162g viewOnKeyListenerC0162g = (ViewOnKeyListenerC0162g) this.f538b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0162g.f2675x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0162g.f2675x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0162g.f2675x.removeGlobalOnLayoutListener(viewOnKeyListenerC0162g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0154D viewOnKeyListenerC0154D = (ViewOnKeyListenerC0154D) this.f538b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0154D.f2625o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0154D.f2625o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0154D.f2625o.removeGlobalOnLayoutListener(viewOnKeyListenerC0154D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
