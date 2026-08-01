package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f907c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0038f f908e;

    public C0036d(ViewGroup viewGroup, View view, boolean z2, U u2, C0038f c0038f) {
        this.f905a = viewGroup;
        this.f906b = view;
        this.f907c = z2;
        this.d = u2;
        this.f908e = c0038f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f905a;
        View view = this.f906b;
        viewGroup.endViewTransition(view);
        U u2 = this.d;
        if (this.f907c) {
            V.a(view, u2.f871a);
        }
        this.f908e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
