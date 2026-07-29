package o;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;

/* renamed from: o.Ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346Ng extends QS {
    public final C0295Lg b;
    public AnimatorSet c;

    public C0346Ng(C0295Lg c0295Lg) {
        this.b = c0295Lg;
    }

    @Override // o.QS
    public final void a(ViewGroup viewGroup) {
        AbstractC0048Bt.n(viewGroup, "container");
        AnimatorSet animatorSet = this.c;
        animatorSet.getClass();
        animatorSet.start();
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // o.QS
    public final void b(N7 n7, ViewGroup viewGroup) {
        AbstractC0048Bt.n(n7, "backEvent");
        AbstractC0048Bt.n(viewGroup, "container");
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // o.QS
    public final void c(ViewGroup viewGroup) {
        AbstractC0048Bt.n(viewGroup, "container");
        C0295Lg c0295Lg = this.b;
        if (c0295Lg.y()) {
            return;
        }
        Context context = viewGroup.getContext();
        AbstractC0048Bt.m(context, "context");
        C2002u5 N = c0295Lg.N(context);
        this.c = N != null ? (AnimatorSet) N.j : null;
        throw null;
    }
}
