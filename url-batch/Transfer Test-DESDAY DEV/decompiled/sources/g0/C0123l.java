package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2487a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0124m f2488b;

    public C0123l(C0124m c0124m) {
        this.f2488b = c0124m;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2487a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2487a) {
            this.f2487a = false;
            return;
        }
        C0124m c0124m = this.f2488b;
        if (((Float) c0124m.f2515z.getAnimatedValue()).floatValue() == RecyclerView.f1570A0) {
            c0124m.f2491A = 0;
            c0124m.f(0);
        } else {
            c0124m.f2491A = 2;
            c0124m.f2508s.invalidate();
        }
    }
}
