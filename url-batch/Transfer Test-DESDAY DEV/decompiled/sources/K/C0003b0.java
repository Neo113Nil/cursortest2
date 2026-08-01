package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import o0.AbstractC0274m;

/* renamed from: K.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003b0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f389b;

    public /* synthetic */ C0003b0(int i, Object obj) {
        this.f388a = i;
        this.f389b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f388a) {
            case 0:
                ((d0) this.f389b).b();
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f389b;
                actionBarOverlayLayout.f1326w = null;
                actionBarOverlayLayout.f1313j = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f388a) {
            case 0:
                ((d0) this.f389b).a();
                break;
            case 1:
                R0.k kVar = (R0.k) this.f389b;
                kVar.q();
                kVar.f686r.start();
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f389b;
                actionBarOverlayLayout.f1326w = null;
                actionBarOverlayLayout.f1313j = false;
                break;
            case 3:
                ((AbstractC0274m) this.f389b).m();
                animator.removeListener(this);
                break;
            case 4:
                p0.f fVar = (p0.f) this.f389b;
                ArrayList arrayList = new ArrayList(fVar.f3377e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0.a) arrayList.get(i)).f113b.f128o;
                    if (colorStateList != null) {
                        D.a.h(fVar, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f389b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f388a) {
            case 0:
                ((d0) this.f389b).c();
                break;
            case 4:
                p0.f fVar = (p0.f) this.f389b;
                ArrayList arrayList = new ArrayList(fVar.f3377e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0.d dVar = ((C0.a) arrayList.get(i)).f113b;
                    ColorStateList colorStateList = dVar.f128o;
                    if (colorStateList != null) {
                        D.a.g(fVar, colorStateList.getColorForState(dVar.f132s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0003b0(d0 d0Var, View view) {
        this.f388a = 0;
        this.f389b = d0Var;
    }
}
