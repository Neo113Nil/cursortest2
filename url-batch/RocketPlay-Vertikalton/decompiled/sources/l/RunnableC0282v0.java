package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0282v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0284w0 f3513b;

    public /* synthetic */ RunnableC0282v0(AbstractViewOnTouchListenerC0284w0 abstractViewOnTouchListenerC0284w0, int i) {
        this.f3512a = i;
        this.f3513b = abstractViewOnTouchListenerC0284w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3512a) {
            case 0:
                ViewParent parent = this.f3513b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0284w0 abstractViewOnTouchListenerC0284w0 = this.f3513b;
                abstractViewOnTouchListenerC0284w0.a();
                View view = abstractViewOnTouchListenerC0284w0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0284w0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f1949A0, RecyclerView.f1949A0, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0284w0.f3524g = true;
                    break;
                }
                break;
        }
    }
}
