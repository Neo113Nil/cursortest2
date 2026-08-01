package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0054w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1002b;

    public ViewOnAttachStateChangeListenerC0054w(x xVar, O o2) {
        this.f1002b = xVar;
        this.f1001a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1001a;
        o2.k();
        C0041i.f((ViewGroup) o2.f855c.f952E.getParent(), this.f1002b.f1003a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
