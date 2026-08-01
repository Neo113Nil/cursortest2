package P0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: P0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f927b;

    public /* synthetic */ C0036d(e eVar, int i) {
        this.f926a = i;
        this.f927b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f926a) {
            case 1:
                this.f927b.f980b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f926a) {
            case 0:
                this.f927b.f980b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
