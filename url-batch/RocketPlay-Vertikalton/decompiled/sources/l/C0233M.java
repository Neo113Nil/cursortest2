package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0193d;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233M implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0193d f3339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0234N f3340b;

    public C0233M(C0234N c0234n, ViewTreeObserverOnGlobalLayoutListenerC0193d viewTreeObserverOnGlobalLayoutListenerC0193d) {
        this.f3340b = c0234n;
        this.f3339a = viewTreeObserverOnGlobalLayoutListenerC0193d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f3340b.f3344G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3339a);
        }
    }
}
