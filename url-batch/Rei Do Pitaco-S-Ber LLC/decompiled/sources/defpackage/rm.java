package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class rm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rm(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                View view = (View) obj;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj2;
                hideBottomViewOnScrollBehavior.k = null;
                if (hideBottomViewOnScrollBehavior.j == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case 1:
                View view2 = (View) obj;
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj2;
                hideViewOnScrollBehavior.k = null;
                if (hideViewOnScrollBehavior.j == 1 && view2.getVisibility() == 0) {
                    view2.setVisibility(4);
                    break;
                }
                break;
            case 2:
                ((l6) obj).remove(animator);
                ((z50) obj2).t.remove(animator);
                break;
            default:
                ja0 ja0Var = (ja0) obj2;
                ja0Var.a.e(1.0f);
                fa0.f((View) obj, ja0Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                ((z50) this.c).t.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
