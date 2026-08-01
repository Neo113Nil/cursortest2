package X;

import android.view.View;

/* renamed from: X.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047o extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0049q f938e;

    public C0047o(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        this.f938e = abstractComponentCallbacksC0049q;
    }

    @Override // q1.d
    public final View c0(int i) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f938e;
        View view = abstractComponentCallbacksC0049q.f952E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0049q + " does not have a view");
    }

    @Override // q1.d
    public final boolean d0() {
        return this.f938e.f952E != null;
    }
}
