package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i3(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                n3 n3Var = (n3) obj;
                AccessibilityManager accessibilityManager = n3Var.g;
                n3Var.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(n3Var.i);
                accessibilityManager.addTouchExplorationStateChangeListener(n3Var.j);
                break;
            case 1:
                w4 w4Var = (w4) obj;
                Context context = view.getContext();
                if (!w4Var.a) {
                    context.getApplicationContext().registerComponentCallbacks((v4) w4Var.e);
                    w4Var.a = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.d;
        boolean z = false;
        Object obj = this.e;
        switch (i) {
            case 0:
                n3 n3Var = (n3) obj;
                n3Var.l.removeCallbacks(n3Var.N);
                AccessibilityManager accessibilityManager = n3Var.g;
                accessibilityManager.removeAccessibilityStateChangeListener(n3Var.i);
                accessibilityManager.removeTouchExplorationStateChangeListener(n3Var.j);
                break;
            case 1:
                w4 w4Var = (w4) obj;
                Context context = view.getContext();
                if (w4Var.a) {
                    context.getApplicationContext().unregisterComponentCallbacks((v4) w4Var.e);
                    w4Var.a = false;
                    break;
                }
                break;
            case 2:
                k kVar = (k) obj;
                Iterator it = kq0.z(kVar.getParent(), g01.l).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj2 = (ViewParent) it.next();
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    a31 a31Var = kVar.f;
                    if (a31Var != null) {
                        a31Var.h();
                    }
                    kVar.f = null;
                    kVar.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((ws0) obj).a(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
