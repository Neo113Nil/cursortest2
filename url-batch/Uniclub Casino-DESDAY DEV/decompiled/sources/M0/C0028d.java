package M0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: M0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0029e f508b;

    public /* synthetic */ C0028d(C0029e c0029e, int i) {
        this.f507a = i;
        this.f508b = c0029e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f507a) {
            case 1:
                this.f508b.f562b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f507a) {
            case 0:
                this.f508b.f562b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
