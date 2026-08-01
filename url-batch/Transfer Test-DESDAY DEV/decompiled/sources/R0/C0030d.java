package R0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: R0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f661b;

    public /* synthetic */ C0030d(e eVar, int i) {
        this.f660a = i;
        this.f661b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f660a) {
            case 1:
                this.f661b.f714b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f660a) {
            case 0:
                this.f661b.f714b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
