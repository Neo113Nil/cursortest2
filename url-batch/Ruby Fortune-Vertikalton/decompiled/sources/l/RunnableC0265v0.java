package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: l.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0265v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0267w0 f3073b;

    public /* synthetic */ RunnableC0265v0(AbstractViewOnTouchListenerC0267w0 abstractViewOnTouchListenerC0267w0, int i) {
        this.f3072a = i;
        this.f3073b = abstractViewOnTouchListenerC0267w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3072a) {
            case 0:
                ViewParent parent = this.f3073b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0267w0 abstractViewOnTouchListenerC0267w0 = this.f3073b;
                abstractViewOnTouchListenerC0267w0.a();
                View view = abstractViewOnTouchListenerC0267w0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0267w0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0267w0.f3080g = true;
                    break;
                }
                break;
        }
    }
}
