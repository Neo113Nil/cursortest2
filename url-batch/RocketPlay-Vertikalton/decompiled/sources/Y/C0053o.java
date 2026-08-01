package Y;

import android.view.View;

/* renamed from: Y.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053o extends F1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0055q f1472a;

    public C0053o(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        this.f1472a = abstractComponentCallbacksC0055q;
    }

    @Override // F1.d
    public final View T(int i) {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1472a;
        View view = abstractComponentCallbacksC0055q.f1486E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0055q + " does not have a view");
    }

    @Override // F1.d
    public final boolean W() {
        return this.f1472a.f1486E != null;
    }
}
