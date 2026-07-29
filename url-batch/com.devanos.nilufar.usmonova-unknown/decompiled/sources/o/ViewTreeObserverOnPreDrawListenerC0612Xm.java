package o;

import android.view.ViewTreeObserver;

/* renamed from: o.Xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0612Xm implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C0068Cn h;
    public final /* synthetic */ C0664Zm i;

    public ViewTreeObserverOnPreDrawListenerC0612Xm(C0664Zm c0664Zm, C0068Cn c0068Cn) {
        this.i = c0664Zm;
        this.h = c0068Cn;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0664Zm c0664Zm = this.i;
        if (c0664Zm.h && c0664Zm.f != null) {
            this.h.getViewTreeObserver().removeOnPreDrawListener(this);
            c0664Zm.f = null;
        }
        return c0664Zm.h;
    }
}
