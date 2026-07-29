package o;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: o.kG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1354kG implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View h;
    public ViewTreeObserver i;
    public final Runnable j;

    public ViewTreeObserverOnPreDrawListenerC1354kG(View view, Runnable runnable) {
        this.h = view;
        this.i = view.getViewTreeObserver();
        this.j = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC1354kG viewTreeObserverOnPreDrawListenerC1354kG = new ViewTreeObserverOnPreDrawListenerC1354kG(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1354kG);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1354kG);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.i.isAlive();
        View view = this.h;
        if (isAlive) {
            this.i.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.j.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.i = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.i.isAlive();
        View view2 = this.h;
        if (isAlive) {
            this.i.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
