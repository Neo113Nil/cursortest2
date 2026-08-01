package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0237t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0239u0 f3081b;

    public /* synthetic */ RunnableC0237t0(AbstractViewOnTouchListenerC0239u0 abstractViewOnTouchListenerC0239u0, int i) {
        this.f3080a = i;
        this.f3081b = abstractViewOnTouchListenerC0239u0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3080a) {
            case 0:
                ViewParent parent = this.f3081b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0239u0 abstractViewOnTouchListenerC0239u0 = this.f3081b;
                abstractViewOnTouchListenerC0239u0.a();
                View view = abstractViewOnTouchListenerC0239u0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0239u0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f1570A0, RecyclerView.f1570A0, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0239u0.f3088g = true;
                    break;
                }
                break;
        }
    }
}
