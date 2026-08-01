package X;

import android.view.View;

/* renamed from: X.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046o extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0048q f942a;

    public C0046o(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f942a = abstractComponentCallbacksC0048q;
    }

    @Override // q1.l
    public final View c0(int i) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f942a;
        View view = abstractComponentCallbacksC0048q.f956E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " does not have a view");
    }

    @Override // q1.l
    public final boolean f0() {
        return this.f942a.f956E != null;
    }
}
