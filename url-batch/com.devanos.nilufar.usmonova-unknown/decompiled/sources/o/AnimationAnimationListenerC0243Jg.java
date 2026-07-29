package o;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: o.Jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0243Jg implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ C0269Kg b;

    public AnimationAnimationListenerC0243Jg(RS rs, ViewGroup viewGroup, C0269Kg c0269Kg) {
        this.a = viewGroup;
        this.b = c0269Kg;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC0048Bt.n(animation, "animation");
        ViewGroup viewGroup = this.a;
        viewGroup.post(new RunnableC1866s2(viewGroup, 5, this.b));
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        AbstractC0048Bt.n(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC0048Bt.n(animation, "animation");
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
