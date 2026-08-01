package Y;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1537b;

    public w(x xVar, O o2) {
        this.f1537b = xVar;
        this.f1536a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1536a;
        o2.k();
        C0047i.f((ViewGroup) o2.f1389c.f1486E.getParent(), this.f1537b.f1538a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
