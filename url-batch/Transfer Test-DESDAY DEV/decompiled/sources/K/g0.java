package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import o0.AbstractC0274m;

/* loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f401a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f403c;

    public g0(m0 m0Var, View view) {
        this.f402b = m0Var;
        this.f403c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f401a) {
            case 0:
                ((m0) this.f402b).f427a.d(1.0f);
                i0.e((View) this.f403c);
                break;
            default:
                ((o.b) this.f402b).remove(animator);
                ((AbstractC0274m) this.f403c).f3252n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f401a) {
            case 1:
                ((AbstractC0274m) this.f403c).f3252n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public g0(AbstractC0274m abstractC0274m, o.b bVar) {
        this.f403c = abstractC0274m;
        this.f402b = bVar;
    }
}
