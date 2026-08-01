package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class mi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public mi(ti tiVar) {
        this.a = 1;
        this.c = tiVar;
        this.b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
            case 2:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                    break;
                }
                break;
            case 1:
                ti tiVar = (ti) obj;
                if (!this.b) {
                    if (((Float) tiVar.z.getAnimatedValue()).floatValue() != 0.0f) {
                        tiVar.A = 2;
                        tiVar.s.invalidate();
                        break;
                    } else {
                        tiVar.A = 0;
                        tiVar.f(0);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
            default:
                aj ajVar = (aj) obj;
                ajVar.r = 0;
                ajVar.m = null;
                if (!this.b) {
                    ajVar.s.a(4, false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.b) {
                    ((View) obj).setVisibility(0);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                aj ajVar = (aj) obj;
                ajVar.s.a(0, false);
                ajVar.r = 1;
                ajVar.m = animator;
                this.b = false;
                break;
        }
    }

    public mi(aj ajVar) {
        this.a = 2;
        this.c = ajVar;
    }

    public mi(View view, boolean z) {
        this.a = 0;
        this.b = z;
        this.c = view;
    }
}
