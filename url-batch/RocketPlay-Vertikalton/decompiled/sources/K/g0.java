package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f664a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f666c;

    public g0(m0 m0Var, View view) {
        this.f665b = m0Var;
        this.f666c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f664a) {
            case 0:
                ((m0) this.f665b).f689a.d(1.0f);
                i0.e((View) this.f666c);
                break;
            default:
                ((o.b) this.f665b).remove(animator);
                ((o0.m) this.f666c).f3679n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f664a) {
            case 1:
                ((o0.m) this.f666c).f3679n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public g0(o0.m mVar, o.b bVar) {
        this.f666c = mVar;
        this.f665b = bVar;
    }
}
