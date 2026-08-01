package K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0022v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f452a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f453b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f454c;

    public ViewTreeObserverOnPreDrawListenerC0022v(View view, Runnable runnable) {
        this.f452a = view;
        this.f453b = view.getViewTreeObserver();
        this.f454c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0022v viewTreeObserverOnPreDrawListenerC0022v = new ViewTreeObserverOnPreDrawListenerC0022v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0022v);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0022v);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f453b.isAlive();
        View view = this.f452a;
        if (isAlive) {
            this.f453b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f454c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f453b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f453b.isAlive();
        View view2 = this.f452a;
        if (isAlive) {
            this.f453b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
