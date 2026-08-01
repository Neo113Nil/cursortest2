package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import k0.AbstractC0191m;

/* loaded from: classes.dex */
public final class e0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f404a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f406c;

    public e0(k0 k0Var, View view) {
        this.f405b = k0Var;
        this.f406c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f404a) {
            case 0:
                ((k0) this.f405b).f428a.d(1.0f);
                g0.e((View) this.f406c);
                break;
            default:
                ((o.b) this.f405b).remove(animator);
                ((AbstractC0191m) this.f406c).f2819n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f404a) {
            case 1:
                ((AbstractC0191m) this.f406c).f2819n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public e0(AbstractC0191m abstractC0191m, o.b bVar) {
        this.f406c = abstractC0191m;
        this.f405b = bVar;
    }
}
