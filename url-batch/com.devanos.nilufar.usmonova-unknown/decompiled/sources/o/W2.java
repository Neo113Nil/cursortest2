package o;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.devanos.nilufar.usmonova.R;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class W2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ W2(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.h) {
            case 0:
                C1013f3 c1013f3 = (C1013f3) this.i;
                AccessibilityManager accessibilityManager = c1013f3.g;
                accessibilityManager.addAccessibilityStateChangeListener(c1013f3.i);
                accessibilityManager.addTouchExplorationStateChangeListener(c1013f3.j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        switch (this.h) {
            case 0:
                C1013f3 c1013f3 = (C1013f3) this.i;
                c1013f3.l.removeCallbacks(c1013f3.I);
                AccessibilityManager accessibilityManager = c1013f3.g;
                accessibilityManager.removeAccessibilityStateChangeListener(c1013f3.i);
                accessibilityManager.removeTouchExplorationStateChangeListener(c1013f3.j);
                break;
            case 1:
                ViewOnKeyListenerC1901sa viewOnKeyListenerC1901sa = (ViewOnKeyListenerC1901sa) this.i;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1901sa.E;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1901sa.E = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1901sa.E.removeGlobalOnLayoutListener(viewOnKeyListenerC1901sa.p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                ViewOnKeyListenerC1171hT viewOnKeyListenerC1171hT = (ViewOnKeyListenerC1171hT) this.i;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1171hT.v;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1171hT.v = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1171hT.v.removeGlobalOnLayoutListener(viewOnKeyListenerC1171hT.p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                AbstractC1927t abstractC1927t = (AbstractC1927t) this.i;
                Iterator it = PQ.x(abstractC1927t.getParent(), KZ.j).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            AbstractC0048Bt.n(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    S10 s10 = abstractC1927t.j;
                    if (s10 != null) {
                        s10.a();
                    }
                    abstractC1927t.j = null;
                    abstractC1927t.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((C0908dT) this.i).c(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
