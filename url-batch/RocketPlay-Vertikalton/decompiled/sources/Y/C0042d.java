package Y;

import E1.AbstractC0001b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1441c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0044f f1442e;

    public C0042d(ViewGroup viewGroup, View view, boolean z2, U u2, C0044f c0044f) {
        this.f1439a = viewGroup;
        this.f1440b = view;
        this.f1441c = z2;
        this.d = u2;
        this.f1442e = c0044f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1439a;
        View view = this.f1440b;
        viewGroup.endViewTransition(view);
        U u2 = this.d;
        if (this.f1441c) {
            AbstractC0001b.a(view, u2.f1405a);
        }
        this.f1442e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
