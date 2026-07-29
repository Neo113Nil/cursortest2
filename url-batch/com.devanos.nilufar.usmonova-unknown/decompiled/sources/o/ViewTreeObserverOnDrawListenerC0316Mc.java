package o;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: o.Mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0316Mc implements InterfaceExecutorC0291Lc, ViewTreeObserver.OnDrawListener, Runnable {
    public final long h = SystemClock.uptimeMillis() + 10000;
    public Runnable i;
    public boolean j;
    public final /* synthetic */ AbstractActivityC0446Rc k;

    public ViewTreeObserverOnDrawListenerC0316Mc(AbstractActivityC0446Rc abstractActivityC0446Rc) {
        this.k = abstractActivityC0446Rc;
    }

    public final void a(View view) {
        if (this.j) {
            return;
        }
        this.j = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC0048Bt.n(runnable, "runnable");
        this.i = runnable;
        View decorView = this.k.getWindow().getDecorView();
        AbstractC0048Bt.m(decorView, "window.decorView");
        if (!this.j) {
            decorView.postOnAnimation(new D1(5, this));
        } else if (AbstractC0048Bt.h(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.i;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.h) {
                this.j = false;
                this.k.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.i = null;
        C1389kp fullyDrawnReporter = this.k.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.b) {
            z = fullyDrawnReporter.c;
        }
        if (z) {
            this.j = false;
            this.k.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.k.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
