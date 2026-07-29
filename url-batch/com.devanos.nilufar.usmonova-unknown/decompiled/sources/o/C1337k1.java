package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: o.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337k1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public C1337k1(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.b = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.D = null;
                actionBarOverlayLayout.q = false;
                break;
            default:
                ((InterfaceC1008f00) this.b).b();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.D = null;
                actionBarOverlayLayout.q = false;
                break;
            default:
                ((InterfaceC1008f00) this.b).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ((InterfaceC1008f00) this.b).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C1337k1(InterfaceC1008f00 interfaceC1008f00, View view) {
        this.b = interfaceC1008f00;
    }
}
