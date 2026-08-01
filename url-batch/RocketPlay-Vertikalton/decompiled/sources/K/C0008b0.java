package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import p0.C0317f;

/* renamed from: K.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008b0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f651b;

    public /* synthetic */ C0008b0(int i, Object obj) {
        this.f650a = i;
        this.f651b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f650a) {
            case 0:
                ((d0) this.f651b).d();
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f651b;
                actionBarOverlayLayout.f1715w = null;
                actionBarOverlayLayout.f1702j = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f650a) {
            case 0:
                ((d0) this.f651b).a();
                break;
            case 1:
                P0.k kVar = (P0.k) this.f651b;
                kVar.q();
                kVar.f952r.start();
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f651b;
                actionBarOverlayLayout.f1715w = null;
                actionBarOverlayLayout.f1702j = false;
                break;
            case 3:
                ((o0.m) this.f651b).m();
                animator.removeListener(this);
                break;
            case 4:
                C0317f c0317f = (C0317f) this.f651b;
                ArrayList arrayList = new ArrayList(c0317f.f3751e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((A0.a) arrayList.get(i)).f1b.f16o;
                    if (colorStateList != null) {
                        D.a.h(c0317f, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f651b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f650a) {
            case 0:
                ((d0) this.f651b).g();
                break;
            case 4:
                C0317f c0317f = (C0317f) this.f651b;
                ArrayList arrayList = new ArrayList(c0317f.f3751e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    A0.d dVar = ((A0.a) arrayList.get(i)).f1b;
                    ColorStateList colorStateList = dVar.f16o;
                    if (colorStateList != null) {
                        D.a.g(c0317f, colorStateList.getColorForState(dVar.f20s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0008b0(d0 d0Var, View view) {
        this.f650a = 0;
        this.f651b = d0Var;
    }
}
