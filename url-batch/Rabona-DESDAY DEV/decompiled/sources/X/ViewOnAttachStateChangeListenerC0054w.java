package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0054w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1008b;

    public ViewOnAttachStateChangeListenerC0054w(x xVar, O o2) {
        this.f1008b = xVar;
        this.f1007a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1007a;
        o2.k();
        C0041i.f((ViewGroup) o2.f861c.f958E.getParent(), this.f1008b.f1009a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
