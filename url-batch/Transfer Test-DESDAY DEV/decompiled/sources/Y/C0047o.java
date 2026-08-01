package Y;

import android.view.View;

/* renamed from: Y.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047o extends T.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0049q f1091a;

    public C0047o(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        this.f1091a = abstractComponentCallbacksC0049q;
    }

    @Override // T.e
    public final View H(int i) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1091a;
        View view = abstractComponentCallbacksC0049q.f1105E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0049q + " does not have a view");
    }

    @Override // T.e
    public final boolean I() {
        return this.f1091a.f1105E != null;
    }
}
