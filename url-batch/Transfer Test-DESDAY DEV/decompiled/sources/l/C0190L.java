package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0155d;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190L implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0155d f2908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0191M f2909b;

    public C0190L(C0191M c0191m, ViewTreeObserverOnGlobalLayoutListenerC0155d viewTreeObserverOnGlobalLayoutListenerC0155d) {
        this.f2909b = c0191m;
        this.f2908a = viewTreeObserverOnGlobalLayoutListenerC0155d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2909b.f2919G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2908a);
        }
    }
}
