package Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1060c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0038f f1061e;

    public C0036d(ViewGroup viewGroup, View view, boolean z2, U u2, C0038f c0038f) {
        this.f1058a = viewGroup;
        this.f1059b = view;
        this.f1060c = z2;
        this.d = u2;
        this.f1061e = c0038f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1058a;
        View view = this.f1059b;
        viewGroup.endViewTransition(view);
        U u2 = this.d;
        if (this.f1060c) {
            V.a(view, u2.f1024a);
        }
        this.f1061e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
