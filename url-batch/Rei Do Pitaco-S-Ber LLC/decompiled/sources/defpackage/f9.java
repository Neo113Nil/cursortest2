package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class f9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f9(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 1:
                bi biVar = (bi) obj;
                AccessibilityManager accessibilityManager = biVar.y;
                if (biVar.z != null && accessibilityManager != null && biVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(biVar.z);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = f80.a;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                i9 i9Var = (i9) obj;
                ViewTreeObserver viewTreeObserver = i9Var.D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        i9Var.D = view.getViewTreeObserver();
                    }
                    i9Var.D.removeGlobalOnLayoutListener(i9Var.o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                bi biVar = (bi) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = biVar.z;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = biVar.y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                qm qmVar = hideBottomViewOnScrollBehavior.h;
                if (qmVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(qmVar);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case 4:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                qm qmVar2 = hideViewOnScrollBehavior.c;
                if (qmVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(qmVar2);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            default:
                d30 d30Var = (d30) obj;
                ViewTreeObserver viewTreeObserver2 = d30Var.u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d30Var.u = view.getViewTreeObserver();
                    }
                    d30Var.u.removeGlobalOnLayoutListener(d30Var.o);
                }
                view.removeOnAttachStateChangeListener(this);
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

    private final void e(View view) {
    }
}
