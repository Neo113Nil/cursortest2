package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0053w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1007b;

    public ViewOnAttachStateChangeListenerC0053w(x xVar, O o2) {
        this.f1007b = xVar;
        this.f1006a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1006a;
        o2.k();
        C0040i.f((ViewGroup) o2.f859c.f956E.getParent(), this.f1007b.f1008a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
