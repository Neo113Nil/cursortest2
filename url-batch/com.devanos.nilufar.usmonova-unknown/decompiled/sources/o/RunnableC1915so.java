package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o.so, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1915so implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractViewOnTouchListenerC1981to i;

    public /* synthetic */ RunnableC1915so(AbstractViewOnTouchListenerC1981to abstractViewOnTouchListenerC1981to, int i) {
        this.h = i;
        this.i = abstractViewOnTouchListenerC1981to;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                ViewParent parent = this.i.k.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC1981to abstractViewOnTouchListenerC1981to = this.i;
                abstractViewOnTouchListenerC1981to.a();
                View view = abstractViewOnTouchListenerC1981to.k;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1981to.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC1981to.n = true;
                    break;
                }
                break;
        }
    }
}
