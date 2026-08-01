package Y;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: Y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0043e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f1443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1445c;
    public final /* synthetic */ C0044f d;

    public AnimationAnimationListenerC0043e(U u2, ViewGroup viewGroup, View view, C0044f c0044f) {
        this.f1443a = u2;
        this.f1444b = viewGroup;
        this.f1445c = view;
        this.d = c0044f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1444b.post(new A1.e(4, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1443a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1443a + " has reached onAnimationStart.");
        }
    }
}
