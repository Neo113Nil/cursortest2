package Y;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: Y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0037e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f1062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1064c;
    public final /* synthetic */ C0038f d;

    public AnimationAnimationListenerC0037e(C0038f c0038f, U u2, View view, ViewGroup viewGroup) {
        this.f1062a = u2;
        this.f1063b = viewGroup;
        this.f1064c = view;
        this.d = c0038f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1063b.post(new Q.b(3, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1062a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1062a + " has reached onAnimationStart.");
        }
    }
}
