package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0159d;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207N implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0159d f2907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0208O f2908b;

    public C0207N(C0208O c0208o, ViewTreeObserverOnGlobalLayoutListenerC0159d viewTreeObserverOnGlobalLayoutListenerC0159d) {
        this.f2908b = c0208o;
        this.f2907a = viewTreeObserverOnGlobalLayoutListenerC0159d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2908b.f2918G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2907a);
        }
    }
}
