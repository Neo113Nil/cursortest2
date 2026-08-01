package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import x0.C0340a;
import x0.C0342c;

/* loaded from: classes.dex */
public final class Y extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f368b;

    public /* synthetic */ Y(int i, Object obj) {
        this.f367a = i;
        this.f368b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f367a) {
            case 0:
                ((a0) this.f368b).d();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f368b;
                actionBarOverlayLayout.f1181w = null;
                actionBarOverlayLayout.f1168j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f367a) {
            case 0:
                ((a0) this.f368b).a();
                break;
            case 1:
                M0.l lVar = (M0.l) this.f368b;
                lVar.q();
                lVar.f534r.start();
                break;
            case 2:
                ((k0.m) this.f368b).m();
                animator.removeListener(this);
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f368b;
                actionBarOverlayLayout.f1181w = null;
                actionBarOverlayLayout.f1168j = false;
                break;
            case 4:
                l0.f fVar = (l0.f) this.f368b;
                ArrayList arrayList = new ArrayList(fVar.f3126e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0340a) arrayList.get(i)).f4117b.f4131o;
                    if (colorStateList != null) {
                        D.a.h(fVar, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f368b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f367a) {
            case 0:
                ((a0) this.f368b).g();
                break;
            case 4:
                l0.f fVar = (l0.f) this.f368b;
                ArrayList arrayList = new ArrayList(fVar.f3126e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0342c c0342c = ((C0340a) arrayList.get(i)).f4117b;
                    ColorStateList colorStateList = c0342c.f4131o;
                    if (colorStateList != null) {
                        D.a.g(fVar, colorStateList.getColorForState(c0342c.f4135s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public Y(a0 a0Var, View view) {
        this.f367a = 0;
        this.f368b = a0Var;
    }
}
