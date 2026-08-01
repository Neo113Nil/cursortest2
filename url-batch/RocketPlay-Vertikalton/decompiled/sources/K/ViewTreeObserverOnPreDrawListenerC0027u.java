package K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0027u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f714a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f715b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f716c;

    public ViewTreeObserverOnPreDrawListenerC0027u(View view, Runnable runnable) {
        this.f714a = view;
        this.f715b = view.getViewTreeObserver();
        this.f716c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0027u viewTreeObserverOnPreDrawListenerC0027u = new ViewTreeObserverOnPreDrawListenerC0027u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0027u);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0027u);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f715b.isAlive();
        View view = this.f714a;
        if (isAlive) {
            this.f715b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f716c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f715b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f715b.isAlive();
        View view2 = this.f714a;
        if (isAlive) {
            this.f715b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
