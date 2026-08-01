package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class wj implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ xj g;

    public /* synthetic */ wj(xj xjVar, int i) {
        this.f = i;
        this.g = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        xj xjVar = this.g;
        switch (i) {
            case 0:
                ViewParent parent = xjVar.i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                xjVar.a();
                View view = xjVar.i;
                if (view.isEnabled() && !view.isLongClickable() && xjVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    xjVar.l = true;
                    break;
                }
                break;
        }
    }
}
